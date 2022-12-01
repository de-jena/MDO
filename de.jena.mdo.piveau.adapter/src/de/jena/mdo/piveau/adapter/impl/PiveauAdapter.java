package de.jena.mdo.piveau.adapter.impl;

import static de.jena.mdo.piveau.adapter.impl.RDFHelper.createLiteral;
import static de.jena.mdo.piveau.adapter.impl.RDFHelper.createRDFResource;
import static de.jena.mdo.piveau.adapter.impl.RDFHelper.createRdfResource;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.util.converter.Converters;

import dcat.Dataset;
import dcat.DcatFactory;
import dcat.Distribution;
import de.jena.mdo.piveau.adapter.PiveauDatasetAdapter;
import de.jena.mdo.piveau.adapter.PiveauDistributionAdapter;
import rdf.DateOrDateTimeLiteral;
import rdf.RdfFactory;
import skos.Concept;
import skos.SkosFactory;

@Designate(ocd = de.jena.mdo.piveau.adapter.impl.PiveauAdapter.PiveauConfig.class)
@Component(name = "PiveauConnector", immediate = true, service = {PiveauDatasetAdapter.class, PiveauDistributionAdapter.class}, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class PiveauAdapter implements PiveauDatasetAdapter, PiveauDistributionAdapter {

	//	@Reference(scope = ReferenceScope.PROTOTYPE)
	//	@Reference
	private ClientBuilder client;

	@Reference(target = "(emf.model.name=dcat)")
	private ResourceSet resourceSet;

	@Reference(target = "(osgi.jaxrs.name=EMFResourcesMessageBodyReaderWriter)")
	private MessageBodyWriter<?> writer;

	private final String baseUri = "http://localhost:8081";

	private WebTarget target;
	private PiveauConfig config;

	@ObjectClassDefinition(
			description = "A base configuration for a DCAT-AP dataset."
			)
	@interface DatasetConfig {
		static final String PREFIX_ = "dataset.";
		@AttributeDefinition(description = "German title")
		String title_de();
		@AttributeDefinition(description = "English title")
		String title_en();
		@AttributeDefinition(description = "German description")
		String description_de();
		@AttributeDefinition(description = "English description")
		String description_en();
		@AttributeDefinition(description = "Issued date ('NOW' for now)")
		String issued();
	}

	@ObjectClassDefinition(
			description = "A configuration for the Piveau DCAT-AP catalog system."
			)
	@interface PiveauConfig {
//		static final String PREFIX_ = "piveau.";
		@AttributeDefinition(description = "Piveau base url")
		String baseUri();
		@AttributeDefinition(description = "Piveau catalogue id")
		String catalogueId();
		@AttributeDefinition(description = "Piveau dataset id")
		String datasetId();
		@AttributeDefinition(description = "Piveau REST dataset segment name")
		String datasetSegment() default "datasets";
	}

	@Activate
	public void activate(PiveauConfig config, Map<String, Object> properties) {
		System.out.println("activate piveau");
		this.config = config;
		client = ClientBuilder.newBuilder();
		target = client.register(writer, MessageBodyWriter.class).build().target(baseUri);
		createDataset(properties, config.datasetId(), config.catalogueId());
		Distribution distribution = createDistribution(properties, config.datasetId(), config.catalogueId());
		deleteDistribution(distribution.getAbout());
		deleteDataset(properties, config.datasetId(), config.catalogueId());
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#createDataset(java.util.Map, java.lang.String, java.lang.String)
	 */
	@Override
	public Dataset createDataset(Map<String, Object> data, String datasetId, String catalogueId) {
		Dataset dataset = createDataset(data);
		Resource rdfResource = createRdfResource(resourceSet, dataset);
		Invocation invocation = target.path(config.datasetSegment())
				.queryParam("id", datasetId)
				.queryParam("catalogue", catalogueId)
				.request()
				.header("Authorization", "yourRepoApiKey")
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
	 * @see de.jena.mdo.piveau.adapter.PiveauDatasetAdapter#deleteDataset(java.util.Map, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean deleteDataset(Map<String, Object> data, String datasetId, String catalogueId) {
		Invocation invocation = target.path(config.datasetSegment())
				.queryParam("id", datasetId)
				.queryParam("catalogue", catalogueId)
				.request()
				.header("Authorization", "yourRepoApiKey")
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
	 * @see de.jena.mdo.piveau.adapter.PiveauDistributionAdapter#createDistribution(java.util.Map, java.lang.String, java.lang.String)
	 */
	@Override
	public Distribution createDistribution(Map<String, Object> data, String datasetId, String catalogueId) {
		Distribution distribution = createDistribution(data);
		Resource rdfResource = createRdfResource(resourceSet, distribution);
		Invocation invocation = target.path(config.datasetSegment())
				.path(datasetId)
				.path(DISTRIBUTION_URI)
				.request()
				.header("Authorization", "yourRepoApiKey")
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
			System.out.println(String.format("Created distribution '%s' in dataset id '%s' for catalogue '%s' successfully with code %s", id, datasetId, catalogueId, type.getStatusCode()));
			return distribution;
		default:
			System.out.println(String.format("Error distribution in data set with id '%s' for catalogue '%s' with error %s", datasetId, catalogueId, type.getStatusCode()));
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
		Invocation invocation = target.path(DISTRIBUTION_URI)
				.path(id)
				.request()
				.header("Authorization", "yourRepoApiKey")
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

	private Dataset createDataset(Map<String, Object> data) {
		Dataset dataSet = DcatFactory.eINSTANCE.createDataset();
		DatasetConfig dsc = Converters.standardConverter().convert(data).to(DatasetConfig.class);
		if (dsc.title_de() != null) {
			dataSet.getTitle().add(createLiteral("DE", dsc.title_de()));
		}
		if (dsc.title_en() != null) {
			dataSet.getTitle().add(createLiteral("EN", dsc.title_en()));
		}
		if (dsc.description_de() != null) {
			dataSet.getTitle().add(createLiteral("DE", dsc.description_de()));
		}
		if (dsc.description_en() != null) {
			dataSet.getTitle().add(createLiteral("EN", dsc.description_en()));
		}
		if (dsc.issued() != null && "NOW".equals(dsc.issued())) {
			DateOrDateTimeLiteral issued = RdfFactory.eINSTANCE.createDateOrDateTimeLiteral();
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(new Date());
			XMLGregorianCalendar date;
			try {
				date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				issued.setValue(date);
				dataSet.setIssued(issued);
			} catch (DatatypeConfigurationException e1) {
				System.out.println("Issued error " + e1.getMessage());
			}
		}
		return dataSet;
	}

	/**
	 * @param data
	 * @return
	 */
	private Distribution createDistribution(Map<String, Object> data) {
		Distribution distribution = DcatFactory.eINSTANCE.createDistribution();
		distribution.setAbout("https://example.io/set/distribution/1");
		distribution.getAccessURL().add(createRDFResource("http://a-csv-file.com"));
		Concept format = SkosFactory.eINSTANCE.createConcept();
		format.setResource("http://publications.europa.eu/resource/authority/file-type/CSV");
		distribution.setFormat(format);
		distribution.setTitle(createLiteral("DE", "Beispiel Distribution"));
		return distribution;
	}

}
