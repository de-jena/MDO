package de.jena.mdo.dcatap.de.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adms.AdmsPackage;
import adms.impl.AdmsPackageImpl;
import dcat.Catalog;
import dcat.Dataset;
import dcat.DatasetContainer;
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
import rdf.PlainLiteral;
import rdf.RDFRoot;
import rdf.RdfPackage;
import rdf.impl.RdfPackageImpl;
import rdf.util.RdfResourceFactoryImpl;
import schema.SchemaPackage;
import schema.impl.SchemaPackageImpl;
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
		resourceFactoryRegistry.getExtensionToFactoryMap().put("rdf", new RdfResourceFactoryImpl());
	}

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

}
