/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.piveau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import org.osgi.framework.Filter;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.jena.piveau.api.DatasetProvider;
import de.jena.piveau.api.DistributionProvider;
import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.api.config.DatasetConfig;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

/**
 * Sensinact Implementation to provide Distribution instances
 * @author Mark Hoffmann
 * @since 12.12.2022
 */
@Component(name = "SensinactPiveauProvider", service = {DistributionProvider.class, DatasetProvider.class}, property = "piveau.provider=Sensinact", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class SensinactPiveauProvider implements DistributionProvider, DatasetProvider {

	/** Constant for the name of sensinacts REST endpoint */
	private static final String SENSINACT_REST = "sensinact-rest";
	/** Constant for the name of sensinacts sensorthings endpoint */
	private static final String SENSORTHINGS = "sensorthings";
	private static final String[] SENSORTHINGS_TYPES = new String[] {"Things", "Locations", "HistoricalLocations", "Datastreams", "Sensors", "Observations", "ObservedProperties", "FeaturesOfInterest"};
	private ComponentContext ctx;
	private DatasetConfig datasetConfig;

	@Activate
	public void activate(DatasetConfig config, ComponentContext ctx) {
		this.datasetConfig = config;
		this.ctx = ctx;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#getDistributionConfig(java.lang.Object, java.util.Map)
	 */
	@Override
	public Distribution[] createDistributions(Object object, Map<String, Object> properties) {
		Map<String, Object> distributionMap = new HashMap<>();
		return updateEndpointInformation(distributionMap, properties);
		
	}
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#canHandleDistribution(java.lang.Object, java.util.Map)
	 */
	@Override
	public boolean canHandleDistribution(Object service, Map<String, Object> properties) {
		return isSensinactREST(properties) || isSensorthings(properties);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#createDataset(java.util.Map)
	 */
	@Override
	public Dataset createDataset(Map<String, Object> properties) {
		return RDFHelper.createDataset(datasetConfig);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#canHandleDataset(java.util.Map)
	 */
	@Override
	public boolean canHandleDataset(Map<String, Object> properties) {
		try {
			String target = (String) properties.get("datasetProvider.target");
			if (target == null) {
				return false;
			}
			Filter filter = ctx.getBundleContext().createFilter(target);
			return filter.match(ctx.getProperties());
		} catch (Exception e) {
			// TODO Log warning
			e.printStackTrace();
		}
		return false;
	}
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#getDatasetId()
	 */
	@Override
	public String getDatasetId() {
		return datasetConfig.id();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#getCatalogueId()
	 */
	@Override
	public String getCatalogueId() {
		return datasetConfig.catalogueId();
	}

	/**
	 * @param properties
	 * @param distributionMap 
	 */
	private Distribution[] updateEndpointInformation(Map<String, Object> distributionMap, Map<String, Object> properties) {
		boolean rest = isSensinactREST(properties);
		boolean sensorthings = isSensorthings(properties);
		String endpoint = getEndpointUrl(properties);
		String url = null;
		String[] mediaTypes = new String[] {"application/json"}; 
		if (rest) {
			String name = (String) properties.get("osgi.jakartars.name");
			if (name == null) {
				return new Distribution[0];
			}
			Map<String, Object> props = new HashMap<>(distributionMap);
			props.put("distribution.title", "Sensinact NB REST");
			props.put("distribution.description", "Sensinact Northbound REST Endpoint " + name);
			url = endpoint + "/sensinsact/providers/*";
			props.put("distribution.access.url", url);
			return createDistributions(props, mediaTypes);
		} else if (sensorthings) {
			mediaTypes = new String[] {"application/json"};
			List<Distribution> distributions = new ArrayList<>(SENSORTHINGS_TYPES.length);
			for (String type : SENSORTHINGS_TYPES) {
				Map<String, Object> props = new HashMap<>(distributionMap);
				props.put("distribution.title", "Sensinact NB Sensorthings " + type);
				props.put("distribution.description", "Sensinact Northbound Sensorthings Endpoint for type: " + type);
				props.put("distribution.access.url", endpoint + "/v1.1/" + type);
				distributions.addAll(Arrays.asList(createDistributions(props, mediaTypes)));
			}
			return distributions.toArray(new Distribution[0]);
		}
		return new Distribution[0];
	}

	private Distribution[] createDistributions(Map<String, Object> properties, String[] mediaTypes) {
		if (mediaTypes == null) {
			return new Distribution[0];
		}
		Objects.nonNull(properties);
		Distribution[] distributions = new Distribution[mediaTypes.length];
		for (int i = 0; i < mediaTypes.length; i++) {
			String mediaType = mediaTypes[i];
			Map<String, Object> configMap = new HashMap<>(properties);
			configMap.put("distribution.id", UUID.randomUUID().toString());
			configMap.put("distribution.mediaType", mediaType);
			distributions[i] = RDFHelper.createDistribution(configMap);
		}
		return distributions;
	}

	private boolean isSensinactREST(Map<String, Object> referenceProperties) {
		Object object = referenceProperties.get("osgi.jakartars.name");
		return object == null ? false : SENSINACT_REST.equals(object);
	}

	private boolean isSensorthings(Map<String, Object> referenceProperties) {
		Object object = referenceProperties.get("osgi.jakartars.name");
		return object == null ? false : SENSORTHINGS.equals(object);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#getEndpointUrl(java.util.Dictionary, de.jena.piveau.api.config.DistributionConfig)
	 */
	@SuppressWarnings("rawtypes")
	private String getEndpointUrl(Map<String, Object> properties) {
		Object endpoints = properties.get(PiveauRegistry.PROP_LOCAL_BASE_URI);
		if (endpoints instanceof String[]) {
			return ((String[])endpoints)[0];
		} else if (endpoints instanceof List<?>) {
			return ((List)endpoints).get(0).toString();
		} else {
			return endpoints.toString();
		}
	}

}
