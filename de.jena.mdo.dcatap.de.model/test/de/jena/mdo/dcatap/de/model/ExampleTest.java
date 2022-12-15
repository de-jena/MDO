package de.jena.mdo.dcatap.de.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adms.AdmsPackage;
import adms.impl.AdmsPackageImpl;
import dcat.Catalog;
import dcat.Dataset;
import dcat.DatasetContainer;
import dcat.DcatFactory;
import dcat.DcatPackage;
import dcat.Distribution;
import dcat.impl.DcatPackageImpl;
import dcatde.ContributorID;
import dcatde.DcatDEPackage;
import dcatde.impl.DcatDEPackageImpl;
import foaf.Agent;
import foaf.FoafPackage;
import foaf.impl.FoafPackageImpl;
import locn.LocnPackage;
import locn.impl.LocnPackageImpl;
import odrl.OdrlPackage;
import odrl.impl.OdrlPackageImpl;
import owl.OwlPackage;
import owl.impl.OwlPackageImpl;
import prov.ProvPackage;
import prov.impl.ProvPackageImpl;
import rdf.DateOrDateTimeLiteral;
import rdf.PlainLiteral;
import rdf.RDFRoot;
import rdf.RdfFactory;
import rdf.RdfPackage;
import rdf.impl.RdfPackageImpl;
import rdf.util.RdfResourceFactoryImpl;
import schema.SchemaPackage;
import schema.impl.SchemaPackageImpl;
import skos.Concept;
import skos.SkosFactory;
import skos.SkosPackage;
import skos.impl.SkosPackageImpl;
import terms.TermsPackage;
import terms.impl.TermsPackageImpl;
import vcard.Organization;
import vcard.OrganizationType;
import vcard.VcardPackage;
import vcard.impl.VcardPackageImpl;

public class ExampleTest {
	
	private ResourceSet resourceSet;
	
	@BeforeEach
	protected void before() {
		resourceSet = new ResourceSetImpl();
		Registry packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(SchemaPackage.eNS_URI, SchemaPackageImpl.init());
		packageRegistry.put(TermsPackage.eNS_URI, TermsPackageImpl.init());
		packageRegistry.put(FoafPackage.eNS_URI, FoafPackageImpl.init());
		packageRegistry.put(AdmsPackage.eNS_URI, AdmsPackageImpl.init());
		packageRegistry.put(DcatPackage.eNS_URI, DcatPackageImpl.init());
		packageRegistry.put(DcatDEPackage.eNS_URI, DcatDEPackageImpl.init());
		packageRegistry.put(LocnPackage.eNS_URI, LocnPackageImpl.init());
		packageRegistry.put(OdrlPackage.eNS_URI, OdrlPackageImpl.init());
		packageRegistry.put(OwlPackage.eNS_URI, OwlPackageImpl.init());
		packageRegistry.put(ProvPackage.eNS_URI, ProvPackageImpl.init());
		packageRegistry.put(RdfPackage.eNS_URI, RdfPackageImpl.init());
		packageRegistry.put(SkosPackage.eNS_URI, SkosPackageImpl.init());
		packageRegistry.put(VcardPackage.eNS_URI, VcardPackageImpl.init());
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		packageRegistry.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		packageRegistry.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
		RdfResourceFactoryImpl rdfResourceFactoryImpl = new RdfResourceFactoryImpl();
		resourceFactoryRegistry.getExtensionToFactoryMap().put("rdf", rdfResourceFactoryImpl);
		resourceFactoryRegistry.getContentTypeToFactoryMap().put(RdfPackage.eCONTENT_TYPE, rdfResourceFactoryImpl);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testLoadResource01() {
		Resource resource = resourceSet.createResource(URI.createFileURI("dcat_ap_de_01.rdf"));
		assertNotNull(resource);
		InputStream inputStream = getClass().getResourceAsStream("dcat_ap_de_01.rdf");
		assertNotNull(inputStream);
		try {
			resource.load(inputStream, null);
		} catch (IOException e) {
			fail("IO Exception " + e.getMessage(), e);
		}
		assertFalse(resource.getContents().isEmpty());
		RDFRoot rdfRoot = (RDFRoot) resource.getContents().get(0);
		EList<AnyType> roots = rdfRoot.getRDF();
		assertNotNull(roots);
		assertFalse(roots.isEmpty());
		AnyType root = roots.get(0);
		assertFalse(root.getAny().isEmpty());
		
		List<Catalog> catalogs = (List<Catalog>) root.eGet(DcatPackage.Literals.DCATAP_ROOT__CATALOG);
		assertNotNull(catalogs);
		assertFalse(catalogs.isEmpty());
		Catalog catalog = catalogs.get(0);
		assertEquals("https://govdata.de#catalog", catalog.getAbout());
		EList<PlainLiteral> titles = catalog.getTitle();
		assertFalse(titles.isEmpty());
		assertEquals("GovData", titles.get(0).getValue());
		EList<PlainLiteral> descriptions = catalog.getDescription();
		assertFalse(descriptions.isEmpty());
		assertEquals("Das Datenportal für Deutschland - Open Government: Verwaltungsdaten transparent, offen und frei nutzbar.", descriptions.get(0).getValue());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testLoadResource02() {
		Resource resource = resourceSet.createResource(URI.createFileURI("dcat_ap_de_02.rdf"));
		assertNotNull(resource);
		InputStream inputStream = getClass().getResourceAsStream("dcat_ap_de_02.rdf");
		assertNotNull(inputStream);
		try {
			resource.load(inputStream, null);
		} catch (IOException e) {
			fail("IO Exception " + e.getMessage(), e);
		}
		assertFalse(resource.getContents().isEmpty());
		RDFRoot rdfRoot = (RDFRoot) resource.getContents().get(0);
		EList<AnyType> roots = rdfRoot.getRDF();
		assertNotNull(roots);
		assertFalse(roots.isEmpty());
		AnyType root = roots.get(0);
		assertFalse(root.getAny().isEmpty());
		
		List<Catalog> catalogs = (List<Catalog>) root.eGet(DcatPackage.Literals.DCATAP_ROOT__CATALOG);
		assertNotNull(catalogs);
		assertFalse(catalogs.isEmpty());
		Catalog catalog = catalogs.get(0);
		assertEquals("https://govdata.de#catalog", catalog.getAbout());
		EList<PlainLiteral> titles = catalog.getTitle();
		assertFalse(titles.isEmpty());
		assertEquals("GovData", titles.get(0).getValue());
		EList<PlainLiteral> descriptions = catalog.getDescription();
		assertFalse(descriptions.isEmpty());
		assertEquals("Das Datenportal für Deutschland - Open Government: Verwaltungsdaten transparent, offen und frei nutzbar.", descriptions.get(0).getValue());
		EList<DatasetContainer> datasets = catalog.getDataset();
		assertFalse(datasets.isEmpty());
		DatasetContainer container = datasets.get(0);
		Dataset dataset = container.getDataset();
		assertEquals("https://ckan.govdata.de/dataset/d4ce4e6e-ab89-44cb-bf5c-33a162c234de#dataset", dataset.getAbout());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testLoadResource03() {
		Resource resource = resourceSet.createResource(URI.createFileURI("dcat_ap_de_03.rdf"));
		assertNotNull(resource);
		InputStream inputStream = getClass().getResourceAsStream("dcat_ap_de_03.rdf");
		assertNotNull(inputStream);
		try {
			resource.load(inputStream, null);
		} catch (IOException e) {
			for (Diagnostic d : resource.getErrors()) {
				System.out.println(d.getLocation() + ":" + d.getMessage() + ":[" + d.getLine() + "," + d.getColumn() + "]");
			}
			fail("IO Exception " + e.getMessage(), e);
		}
		assertFalse(resource.getContents().isEmpty());
		RDFRoot rdfRoot = (RDFRoot) resource.getContents().get(0);
		EList<AnyType> roots = rdfRoot.getRDF();
		assertNotNull(roots);
		assertFalse(roots.isEmpty());
		AnyType root = roots.get(0);
		assertFalse(root.getAny().isEmpty());
		
		List<Catalog> catalogs = (List<Catalog>) root.eGet(DcatPackage.Literals.DCATAP_ROOT__CATALOG);
		assertNotNull(catalogs);
		assertFalse(catalogs.isEmpty());
		Catalog catalog = catalogs.get(0);
		assertEquals("https://govdata.de#catalog", catalog.getAbout());
		EList<PlainLiteral> titles = catalog.getTitle();
		assertFalse(titles.isEmpty());
		assertEquals("GovData", titles.get(0).getValue());
		EList<PlainLiteral> descriptions = catalog.getDescription();
		assertFalse(descriptions.isEmpty());
		assertEquals("Das Datenportal für Deutschland - Open Government: Verwaltungsdaten transparent, offen und frei nutzbar.", descriptions.get(0).getValue());
		EList<DatasetContainer> datasets = catalog.getDataset();
		assertFalse(datasets.isEmpty());
		DatasetContainer container = datasets.get(0);
		Dataset dataset = container.getDataset();
		assertEquals("https://ckan.govdata.de/dataset/d4ce4e6e-ab89-44cb-bf5c-33a162c234de#dataset", dataset.getAbout());
		ContributorID contributorID = dataset.getContributorID();
		assertNotNull(contributorID);
		assertEquals("http://dcat-ap.de/def/contributors/transparenzportalHamburg", contributorID.getResource());
		Organization organizations = dataset.getContactPoint().get(0);
		OrganizationType organization = organizations.getIndividual();
		assertEquals("ub85bL31C21", organization.getNodeID());
		assertEquals("Meister, Thomas, Herr", organization.getFn());
		assertEquals("+49 40 123 45678", organization.getHasTelephone());
		
		assertEquals("Darstellung der Badegewässer und ihrer Überwachungsmessstellen im Internet.", dataset.getDescription().get(0).getValue());
		
		Agent publisher = catalog.getPublisher();
		assertNotNull(publisher);
		foaf.Organization publisherOrga = publisher.getOrganization();
		assertNotNull(publisherOrga);
		assertEquals("https://www.govdata.de/web/guest/impressum#publisher", publisherOrga.getAbout());
		assertEquals("Geschäfts- und Koordinierungsstelle GovData", publisherOrga.getName().getValue());
		
		assertEquals("GovData", catalog.getTitle().get(0).getValue());
		
		List<Distribution> distributions = (List<Distribution>) root.eGet(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION);
		assertNotNull(distributions);
		assertFalse(distributions.isEmpty());
		Distribution distribution = distributions.get(0);
		assertEquals("https://ckan.govdata.de/dataset/d4ce4e6e-ab89-44cb-bf5c-33a162c234de/resource/a289c289-55c9-410f-b4c7-f88e5f6f4e47#distribution", distribution.getAbout());
		assertEquals("http://daten-hamburg.de/umwelt_klima/badegewaesser/Badegewaesser_HH_2004-2013.zip", distribution.getDownloadURL().get(0).getResource());
		assertEquals("https://ckan.govdata.de/dataset/d4ce4e6e-ab89-44cb-bf5c-33a162c234de/resource/a289c289-55c9-410f-b4c7-f88e5f6f4e47", distribution.getAccessURL().get(0).getResource());
		assertEquals("Freie und Hansestadt Hamburg, Behoerde für Umwelt und Energie", distribution.getLicenseAttributionByText().getValue());
		assertEquals("http://dcat-ap.de/def/licenses/dl-by-de/2.0", distribution.getLicense().getResource());
		assertEquals(dataset.getDistribution().get(0).getResource(), distribution.getAbout());
		
	}
	
	@Test
	public void testLoadResource04() {
		Resource resource = resourceSet.createResource(URI.createFileURI("eudata01.rdf"));
		assertNotNull(resource);
		InputStream inputStream = getClass().getResourceAsStream("eudata01.rdf");
		assertNotNull(inputStream);
		try {
			resource.load(inputStream, null);
		} catch (IOException e) {
			for (Diagnostic d : resource.getErrors()) {
				System.out.println(d.getLocation() + ":" + d.getMessage() + ":[" + d.getLine() + "," + d.getColumn() + "]");
			}
//			fail("IO Exception " + e.getMessage(), e);
		}
		System.out.println("Test Data");
		assertFalse(resource.getContents().isEmpty());
		RDFRoot rdfRoot = (RDFRoot) resource.getContents().get(0);
		EList<AnyType> roots = rdfRoot.getRDF();
		assertNotNull(roots);
		assertFalse(roots.isEmpty());
		AnyType root = roots.get(0);
		assertFalse(root.getAny().isEmpty());
		
//		List<CatalogRecord> catalogRecords = (List<CatalogRecord>) root.eGet(DcatPackage.Literals.DCATAP_ROOT__CATALOG_RECORD);
		
	}
	
	@Test
	public void testSaveResource01() {
		Resource resource = resourceSet.createResource(URI.createFileURI("sample01.rdf"));
//		Resource resource = resourceSet.createResource(URI.createURI("http://localhost:8081/catalogues/sample01"), RdfPackage.eCONTENT_TYPE);
		
		RDFRoot rdfRoot = RdfFactory.eINSTANCE.createRDFRoot();
		resource.getContents().add(rdfRoot);
		
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		resource.getContents().add(anyType);
		rdfRoot.getRDF().add(anyType);
		
		
		Catalog catalog = DcatFactory.eINSTANCE.createCatalog();
		EList<Catalog> calalogs = ECollections.singletonEList(catalog);
		anyType.eSet(DcatPackage.Literals.DCATAP_ROOT__CATALOG, calalogs);
		catalog.getTitle().add(createLiteral("DE", "Ein Test-Titel"));
		catalog.getTitle().add(createLiteral("EN", "A Test-Title"));
		catalog.getDescription().add(createLiteral("DE", "Eine Test-Titel Beschreibung"));
		catalog.getDescription().add(createLiteral("EN", "A Test-title description"));
		catalog.getLanguage().add(createRDFResource("http://publications.europa.eu/resource/authority/language/ENG"));
		catalog.getLanguage().add(createRDFResource("http://publications.europa.eu/resource/authority/language/DEU"));
		
		Dataset dataSet = DcatFactory.eINSTANCE.createDataset();
		EList<Dataset> dataSets = ECollections.singletonEList(dataSet);
		anyType.eSet(DcatPackage.Literals.DCATAP_ROOT__DATASET, dataSets);
		dataSet.getTitle().add(createLiteral("DE", "Beipiel Dataset 1"));
		dataSet.getTitle().add(createLiteral("EN", "Example Dataset 1"));
		dataSet.getDescription().add(createLiteral("DE", "Das ist ein Beipiel-Datenset"));
		dataSet.getDescription().add(createLiteral("EN", "This is an example Dataset"));
		dataSet.getDistribution().add(createRDFResource("https://example.io/set/distribution/1"));
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
		
		
		Distribution distribution = DcatFactory.eINSTANCE.createDistribution();
		distribution.setAbout("https://example.io/set/distribution/1");
		EList<Distribution> distributions = ECollections.singletonEList(distribution);
		anyType.eSet(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, distributions);
		distribution.getAccessURL().add(createRDFResource("http://a-csv-file.com"));
		Concept format = SkosFactory.eINSTANCE.createConcept();
		format.setResource("http://publications.europa.eu/resource/authority/file-type/CSV");
		distribution.setFormat(format);
		distribution.setTitle(createLiteral("DE", "Beispiel Distribution"));
		
		try {
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			resource.save(baos, null);
			URL url = new URL("http://localhost:8081/catalogues/sample01");
		    final URLConnection urlConnection = url.openConnection();
		    urlConnection.setDoOutput(true);
		    urlConnection.setDoInput(true);
		    if (urlConnection instanceof HttpURLConnection) {
		        final HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
		        httpURLConnection.addRequestProperty("Authorization", "bfd33c68-c2fe-428e-85dc-1cd3e5e2f1be");
		        httpURLConnection.setRequestMethod("PUT");
		        resource.save(urlConnection.getOutputStream(), null);
//		        int responseCode = httpURLConnection.getResponseCode();
//		        assertEquals(200, responseCode);
		        Object content = httpURLConnection.getContent();
		        assertNotNull(content);
		    }
		} catch (IOException e) {
			e.printStackTrace();
			for (Diagnostic d : resource.getErrors()) {
				System.out.println(d.getLocation() + ":" + d.getMessage() + ":[" + d.getLine() + "," + d.getColumn() + "]");
			}
		}

		
	}
	
	rdf.Resource createRDFResource(String value) {
		rdf.Resource r = RdfFactory.eINSTANCE.createResource();
		r.setResource(value);
		return r;
	}
	
	PlainLiteral createLiteral(String lang, String value) {
		PlainLiteral literal = RdfFactory.eINSTANCE.createPlainLiteral();
		literal.setLang(lang.toUpperCase());
		literal.setValue(value);
		return literal;
	}

}
