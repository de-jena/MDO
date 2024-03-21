package de.jena.piveau.api.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.piveau.api.DatasetProvider;
import de.jena.piveau.api.DistributionProvider;
import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.api.connector.DatasetConnector;
import de.jena.piveau.api.connector.DistributionConnector;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

/**
 * This adapter is configurable and brings a connector implementations and the
 * dataset information provider and distribution information provider together.
 * It handles all important logic for registering datasets and distributions as
 * well as their unregistration.
 *
 * @author Mark Hoffmann
 * @since 12.12.2022
 */
@Component(name = "PiveauAdapter", immediate = true, service = PiveauRegistry.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class PiveauAdapter implements PiveauRegistry {

	private static final Logger LOGGER = Logger.getLogger(PiveauAdapter.class.getName());
	public final static String PROP_TRACKER_FILTER = "tracker.filter";
	public final static String PROP_TRACKER_DATASET = "tracker.dataset";
	private final static String LOCAL_BASE_URI = "http://0.0.0.0:8085/mdo";
	@Reference(target = "(emf.name=dcat)")
	private ResourceSet resourceSet;
	@Reference(name = "distributionConnector")
	private DistributionConnector distributionConnector;
	@Reference(name = "datasetConnector")
	private DatasetConnector datasetConnector;
	@Reference(name = "distributionProvider")
	private DistributionProvider distributionProvider;
	@Reference(name = "datasetProvider")
	private DatasetProvider datasetProvider;

	private PiveauTracker piveauTracker;
	private Dataset dataset;

	@Activate
	public void activate(Map<String, Object> properties, BundleContext bctx) {
		LOGGER.fine(() -> "Activate piveau adapter");
		createPiveauTracker(bctx, properties);
		createDataset(properties, () -> {
			if (piveauTracker instanceof PiveauDatasetTracker) {
				((PiveauDatasetTracker) piveauTracker).open(dataset);
			} else {
				piveauTracker.open();
			}
		});
	}

	/**
	 * @param config
	 * @param properties
	 * @return
	 */
	private void createDataset(Map<String, Object> properties, Runnable resolvedRunnable) {
		Objects.nonNull(piveauTracker);
		Objects.nonNull(properties);
		Objects.nonNull(resolvedRunnable);
		if (datasetProvider.canHandleDataset(properties)) {
			dataset = datasetProvider.createDataset(properties);
			datasetConnector
					.createDatasetAsync(dataset, datasetProvider.getDatasetId(), datasetProvider.getCatalogueId())
					.onResolve(resolvedRunnable);
		}
	}

	/**
	 * @param bctx
	 * @param config
	 * @param properties
	 */
	private void createPiveauTracker(BundleContext bctx, Map<String, Object> properties) {
		Map<String, Object> trackerProps = createTrackerProperties(properties);
		boolean useDatasetTracker = Boolean.valueOf((String) properties.getOrDefault(PROP_TRACKER_DATASET, "false"));
		piveauTracker = useDatasetTracker
				? new PiveauDatasetTracker(bctx, datasetProvider.getDatasetId(), datasetProvider.getCatalogueId(),
						trackerProps)
				: new PiveauTracker(bctx, datasetProvider.getDatasetId(), trackerProps);
		piveauTracker.setDistributionConnector(distributionConnector);
		piveauTracker.setDistributionProvider(distributionProvider);
	}

	/**
	 * @param properties
	 * @param config
	 * @return
	 */
	private Map<String, Object> createTrackerProperties(Map<String, Object> properties) {
		Map<String, Object> trackerProps = new HashMap<>();
		trackerProps.putAll(distributionConnector.getDistributionProperties());
		trackerProps.putAll(properties);
		if (!trackerProps.containsKey(PROP_LOCAL_BASE_URI)) {
			trackerProps.put(PROP_LOCAL_BASE_URI, new String[] { LOCAL_BASE_URI });
		}
		return trackerProps;
	}

	@Deactivate
	public void deactivate() {
		if (piveauTracker != null) {
			piveauTracker.close();
		}
		// TODO log here instead of sysout
		datasetConnector.deleteDatasetAsync(datasetProvider.getDatasetId(), datasetProvider.getCatalogueId())
				.onSuccess((b) -> System.out.println("Deleted dataset " + datasetProvider.getDatasetId()));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.mdo.piveau.adapter.PiveauRegistry#getActiveDistributions()
	 */
	@Override
	public List<Distribution> getActiveDistributions() {
		return piveauTracker != null ? piveauTracker.getActiveDistributions() : null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.piveau.api.PiveauRegistry#getCatalogueId()
	 */
	@Override
	public String getCatalogueId() {
		return datasetProvider.getCatalogueId();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.piveau.api.PiveauRegistry#getDatasetId()
	 */
	@Override
	public String getDatasetId() {
		return datasetProvider.getDatasetId();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.piveau.api.PiveauRegistry#getActiveDataset()
	 */
	@Override
	public Dataset getActiveDataset() {
		return RDFHelper.appendDistributions(dataset, getActiveDistributions());
	}

}
