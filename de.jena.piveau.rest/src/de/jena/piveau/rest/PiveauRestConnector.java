package de.jena.piveau.rest;

import static de.jena.piveau.api.RDFHelper.createRdfResource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.ext.MessageBodyWriter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.jaxrs.annotations.RequireEMFMessageBodyReaderWriter;
import org.osgi.util.converter.Converters;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.runtime.JaxrsServiceRuntime;
import org.osgi.service.jaxrs.runtime.JaxrsServiceRuntimeConstants;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.connector.DatasetConnector;
import de.jena.piveau.api.connector.DistributionConnector;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

@RequireEMFMessageBodyReaderWriter
@Designate(ocd = de.jena.piveau.rest.PiveauRestConfig.class)
@Component(name = "PiveauRestConnector", 
immediate = true, 
service = {DatasetConnector.class, DistributionConnector.class}, 
configurationPolicy = ConfigurationPolicy.REQUIRE, 
property = "piveau.connector=REST")
public class PiveauRestConnector implements DatasetConnector, DistributionConnector {

	private static final Logger LOGGER = Logger.getLogger(PiveauRestConnector.class.getName());
	//	@Reference(scope = ReferenceScope.PROTOTYPE)
	//	@Reference
	private ClientBuilder client;

	@Reference(target = "(emf.model.name=dcat)")
	private ResourceSet resourceSet;

	@Reference(target = "(osgi.jaxrs.name=EMFResourcesMessageBodyReaderWriter)")
	private MessageBodyWriter<?> writer;

	@Reference
	private ServiceReference<JaxrsServiceRuntime> runtimeRef;

	private final PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
	private final String baseUri = "http://localhost:8081";

	private WebTarget target;
	private PiveauRestConfig config;
	private Map<String, Object> connectorProps;

	@Activate
	public void activate(Map<String, Object> properties) {
		LOGGER.info(()->"Activate Piveau REST Connector");
		this.config = Converters.standardConverter().convert(properties).to(PiveauRestConfig.class);
		client = ClientBuilder.newBuilder();
		target = client.register(writer, MessageBodyWriter.class).build().target(baseUri);
		Object endpoint = runtimeRef.getProperty(JaxrsServiceRuntimeConstants.JAX_RS_SERVICE_ENDPOINT);
		connectorProps = new HashMap<>();
		if (endpoint != null && ((String[])endpoint).length > 0) {
			connectorProps.put(PiveauRegistry.PROP_LOCAL_BASE_URI, endpoint);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#createDataset(java.util.Map, java.lang.String, java.lang.String)
	 */
	@Override
	public Dataset createDataset(Dataset dataset, String datasetId, String catalogueId) {
		Resource rdfResource = createRdfResource(resourceSet, dataset);
		Invocation invocation = target.path(config.datasetSegment())
				.queryParam("id", datasetId)
				.queryParam("catalogue", catalogueId)
				.request()
				.header("Authorization", config.apiKey())
				.buildPut(Entity.entity(rdfResource, "application/rdf+xml"));
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format("Created data set with id '%s' for catalogue '%s' successfully with code %s", datasetId, catalogueId, type.getStatusCode()));
			//			indexDataset(rdfResource, datasetId, catalogueId);
			return dataset;
		default:
			System.out.println(String.format("Error creating data set with id '%s' for catalogue '%s' with error %s", datasetId, catalogueId, type.getStatusCode()));
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#createDatasetAsync(dcat.Dataset, java.lang.String, java.lang.String)
	 */
	@Override
	public Promise<Dataset> createDatasetAsync(Dataset dataset, String datasetId, String catalogueId) {
		return pf.submit(()->createDataset(dataset, datasetId, catalogueId));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#deleteDataset(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean deleteDataset(String datasetId, String catalogueId) {
		Invocation invocation = target.path(config.datasetSegment())
				.queryParam("id", datasetId)
				.queryParam("catalogue", catalogueId)
				.request()
				.header("Authorization", config.apiKey())
				.buildDelete();
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format("Deleted data set with id '%s' for catalogue '%s' successfully with code %s", datasetId, catalogueId, type.getStatusCode()));
			return true;
		default:
			System.out.println(String.format("Error deleting data set with id '%s' for catalogue '%s' with error %s", datasetId, catalogueId, type.getStatusCode()));
			return false;
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#deleteDatasetAsync(java.lang.String, java.lang.String)
	 */
	@Override
	public Promise<Boolean> deleteDatasetAsync(String datasetId, String catalogueId) {
		return pf.submit(()->deleteDataset(datasetId, catalogueId));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#getDatasetProperties()
	 */
	@Override
	public Map<String, Object> getDatasetProperties() {
		return connectorProps;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#createDistribution(java.util.Map, java.lang.String)
	 */
	@Override
	public Distribution createDistribution(Distribution distribution, String datasetId) {
		Resource rdfResource = createRdfResource(resourceSet, distribution);
		Invocation invocation = target.path(config.datasetSegment())
				.path(datasetId)
				.path(config.distributionSegment())
				.request()
				.header("Authorization", config.apiKey())
				.buildPost(Entity.entity(rdfResource, "application/rdf+xml"));
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		List<Object> list = response.getHeaders().get("Location");
		String id = "<EMPTY>";
		if (!list.isEmpty()) {
			id = list.get(0).toString();
			distribution.setAbout(id);
		}
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format("Created distribution '%s' in dataset id '%s' successfully with code %s", id, datasetId, type.getStatusCode()));
			return distribution;
		default:
			System.out.println(String.format("Error distribution in data set with id '%s' with error %s", datasetId, type.getStatusCode()));
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#deleteDistribution(java.lang.String)
	 */
	@Override
	public boolean deleteDistribution(String distributionId) {
		String id = distributionId.substring(distributionId.lastIndexOf("/") + 1);
		Invocation invocation = target.path(config.distributionSegment())
				.path(id)
				.request()
				.header("Authorization", config.apiKey())
				.buildDelete();
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format("Deleted distribution with id '%s' successfully with code %s", id, type.getStatusCode()));
			return true;
		default:
			System.out.println(String.format("Error deleting distribution with id '%s' with error %s", id, type.getStatusCode()));
			return false;
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#getDistributionProperties()
	 */
	@Override
	public Map<String, Object> getDistributionProperties() {
		return connectorProps;
	}

	@SuppressWarnings("unused")
	private boolean indexDataset(Resource datasetResource, String datasetId, String catalogueId) {
		Invocation invocation = target.path(DATASET_INDEX_URI).path(datasetId)
				.queryParam("catalogue", catalogueId)
				.request()
				.header("Authorization", "yourRepoApiKey")
				.buildPut(Entity.entity(datasetResource, "application/rdf+xml"));
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format("Indexed data set with id '%s' for catalogue '%s' successfully with code %s", datasetId, catalogueId, type.getStatusCode()));
			return true;
		default:
			System.out.println(String.format("Error inexing data set with id '%s' for catalogue '%s' with error %s", datasetId, catalogueId, type.getStatusCode()));
		}
		return false;
	}

}