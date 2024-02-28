package de.jena.piveau.rest.jakarta;

import static de.jena.piveau.api.RDFHelper.createRdfResource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.rest.annotations.RequireEMFMessageBodyReaderWriter;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jakartars.runtime.JakartarsServiceRuntime;
import org.osgi.service.jakartars.runtime.JakartarsServiceRuntimeConstants;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.util.converter.Converters;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

import de.jena.mdo.keycloak.api.KeycloakAuthService;
import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.RDFBuilder;
import de.jena.piveau.api.connector.DatasetConnector;
import de.jena.piveau.api.connector.DistributionConnector;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.StatusType;
import jakarta.ws.rs.ext.MessageBodyWriter;

@RequireEMFMessageBodyReaderWriter
@Designate(ocd = de.jena.piveau.rest.jakarta.PiveauRestConfig.class)
@Component(name = "PiveauRestConnector", immediate = true, service = { DatasetConnector.class,
		DistributionConnector.class }, configurationPolicy = ConfigurationPolicy.REQUIRE, property = "piveau.connector=REST")
public class PiveauRestConnector implements DatasetConnector, DistributionConnector {

	private static final Logger LOGGER = Logger.getLogger(PiveauRestConnector.class.getName());
//	protected static final String REQUEST_AUTH_HEADER = "X-API-Key";
	protected static final String REQUEST_BEARER_AUTH_HEADER = "bearer";
	// @Reference(scope = ReferenceScope.PROTOTYPE)
	// @Reference
	private ClientBuilder client;

	@Reference(target = "(emf.model.name=dcat)")
	private ResourceSet resourceSet;

	@Reference(target = "(osgi.jaxrs.name=EMFResourcesMessageBodyReaderWriter)")
	private MessageBodyWriter<?> writer;

	@Reference
	private ServiceReference<JakartarsServiceRuntime> runtimeRef;

	@Reference
	private KeycloakAuthService keycloakAuthService;

	private final PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
	private final String baseUri = "http://localhost:8081";

	private WebTarget target;
	private PiveauRestConfig config;
	private Map<String, Object> connectorProps;

	@Activate
	public void activate(Map<String, Object> properties) {
		LOGGER.info(() -> "Activate Piveau REST Connector");
		this.config = Converters.standardConverter().convert(properties).to(PiveauRestConfig.class);
		client = ClientBuilder.newBuilder();
		target = client.register(writer, MessageBodyWriter.class).build().target(baseUri);
		Object endpoint = runtimeRef.getProperty(JakartarsServiceRuntimeConstants.JAKARTA_RS_SERVICE_ENDPOINT);
		connectorProps = new HashMap<>();
		if (endpoint != null && ((String[]) endpoint).length > 0) {
			connectorProps.put(PiveauRegistry.PROP_LOCAL_BASE_URI, endpoint);
		}
	}

	/**
	 * Logout from Keycloak on dactivation
	 */
	@Deactivate
	public void deactivate() {
//		keycloak.logout()
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#createDataset(java.util.Map,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public Dataset createDataset(Dataset dataset, String datasetId, String catalogueId) {
		Resource rdfResource = createRdfResource(resourceSet, dataset);
		Invocation invocation = target.path(config.datasetSegment()).queryParam("id", datasetId)
				.queryParam("catalogue", catalogueId).request()
//				.header(REQUEST_AUTH_HEADER, config.apiKey())
				.header(REQUEST_BEARER_AUTH_HEADER, getJWTToken())
				.buildPut(Entity.entity(rdfResource, "application/rdf+xml"));
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		List<Object> list = response.getHeaders().get("Location");
		if (!list.isEmpty()) {
			dataset.setAbout(list.get(0).toString());
		}
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out
					.println(String.format("Created data set with id '%s' for catalogue '%s' successfully with code %s",
							datasetId, catalogueId, type.getStatusCode()));
			// indexDataset(rdfResource, datasetId, catalogueId);
			return dataset;
		default:
			System.out.println(String.format("Error creating data set with id '%s' for catalogue '%s' with error %s",
					datasetId, catalogueId, type.getStatusCode()));
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#createDatasetAsync(dcat.
	 * Dataset, java.lang.String, java.lang.String)
	 */
	@Override
	public Promise<Dataset> createDatasetAsync(Dataset dataset, String datasetId, String catalogueId) {
		return pf.submit(() -> createDataset(dataset, datasetId, catalogueId));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#deleteDataset(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public boolean deleteDataset(String datasetId, String catalogueId) {
		Invocation invocation = target.path(config.datasetSegment()).path(datasetId).request()
//				.header(REQUEST_AUTH_HEADER, config.apiKey())
				.header(REQUEST_BEARER_AUTH_HEADER, getJWTToken()).buildDelete();
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out
					.println(String.format("Deleted data set with id '%s' for catalogue '%s' successfully with code %s",
							datasetId, catalogueId, type.getStatusCode()));
			return true;
		default:
			System.out.println(String.format("Error deleting data set with id '%s' for catalogue '%s' with error %s",
					datasetId, catalogueId, type.getStatusCode()));
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#deleteDatasetAsync(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public Promise<Boolean> deleteDatasetAsync(String datasetId, String catalogueId) {
		return pf.submit(() -> deleteDataset(datasetId, catalogueId));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#getDatasetProperties()
	 */
	@Override
	public Map<String, Object> getDatasetProperties() {
		return connectorProps;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#createDistribution(java.
	 * util.Map, java.lang.String)
	 */
	@Override
	public Distribution createDistribution(Distribution distribution, String datasetId) {
		Resource rdfResource = createRdfResource(resourceSet, distribution);
		Invocation invocation = target.path(config.datasetSegment()).path(datasetId).path(config.distributionSegment())
				.request()
//				.header(REQUEST_AUTH_HEADER, config.apiKey())
				.header(REQUEST_BEARER_AUTH_HEADER, getJWTToken())
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
			System.out.println(String.format("Created distribution '%s' in dataset id '%s' successfully with code %s",
					id, datasetId, type.getStatusCode()));
			return distribution;
		default:
			System.out.println(String.format("Error distribution in data set with id '%s' with error %s", datasetId,
					type.getStatusCode()));
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.jena.piveau.api.connector.DistributionConnector#updateDistributions(java.
	 * util.List, de.jena.piveau.dcat.Dataset, java.lang.String, java.lang.String)
	 */
	@Override
	public Dataset updateDistributions(List<Distribution> distributions, Dataset dataset, String datasetId,
			String catalogueId) {
		RDFBuilder builder = RDFBuilder.create(resourceSet).appendDataset(dataset);
		if (distributions != null) {
			builder = builder.appendDistribution(distributions);
		}
		Resource rdfResource = builder.buildResource();
		updateDataset(rdfResource, datasetId, catalogueId);
		return dataset;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#deleteDistribution(java.
	 * lang.String)
	 */
	@Override
	public boolean deleteDistribution(String distributionId) {
		String id = distributionId.substring(distributionId.lastIndexOf("/") + 1);
		Invocation invocation = target.path(config.distributionSegment()).path(id).request()
//				.header(REQUEST_AUTH_HEADER, config.apiKey())
				.header(REQUEST_BEARER_AUTH_HEADER, getJWTToken()).buildDelete();
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format("Deleted distribution with id '%s' successfully with code %s", id,
					type.getStatusCode()));
			return true;
		default:
			System.out.println(
					String.format("Error deleting distribution with id '%s' with error %s", id, type.getStatusCode()));
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#
	 * getDistributionProperties()
	 */
	@Override
	public Map<String, Object> getDistributionProperties() {
		return connectorProps;
	}

	@SuppressWarnings("unused")
	private boolean indexDataset(Resource datasetResource, String datasetId, String catalogueId) {
		Invocation invocation = target.path(DATASET_INDEX_URI).path(datasetId).queryParam("catalogue", catalogueId)
				.request()
//				.header(REQUEST_AUTH_HEADER, "yourRepoApiKey")
				.header(REQUEST_BEARER_AUTH_HEADER, getJWTToken())
				.buildPut(Entity.entity(datasetResource, "application/rdf+xml"));
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out
					.println(String.format("Indexed data set with id '%s' for catalogue '%s' successfully with code %s",
							datasetId, catalogueId, type.getStatusCode()));
			return true;
		default:
			System.out.println(String.format("Error inedxing data set with id '%s' for catalogue '%s' with error %s",
					datasetId, catalogueId, type.getStatusCode()));
		}
		return false;
	}

	private Resource updateDataset(Resource rdfResource, String datasetId, String catalogueId) {
		Objects.requireNonNull(rdfResource);
		Invocation invocation = target.path(config.datasetSegment()).queryParam("id", datasetId)
				.queryParam("catalogue", catalogueId).request()
//				.header(REQUEST_AUTH_HEADER, config.apiKey())
				.header(REQUEST_BEARER_AUTH_HEADER, getJWTToken())
				.buildPut(Entity.entity(rdfResource, "application/rdf+xml"));
		Response response = invocation.invoke();
		StatusType type = response.getStatusInfo();
		switch (type.toEnum()) {
		case CREATED:
		case NO_CONTENT:
			System.out.println(String.format(
					"Created or updated data set with id '%s' for catalogue '%s' successfully with code %s", datasetId,
					catalogueId, type.getStatusCode()));
			// indexDataset(rdfResource, datasetId, catalogueId);
		default:
			System.out.println(String.format("Error creating data set with id '%s' for catalogue '%s' with error %s",
					datasetId, catalogueId, type.getStatusCode()));
		}
		return rdfResource;
	}

	/**
	 * Returns the JWT Token String. ATTENTION: Eventually as Base64 encoded String
	 *
	 * @return eventually the base64 encoded JWT Token String
	 */
	private String getJWTToken() {
		return keycloakAuthService.getBase64TokenString();
	}

}
