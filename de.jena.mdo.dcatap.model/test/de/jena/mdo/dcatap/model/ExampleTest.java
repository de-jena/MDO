package de.jena.mdo.dcatap.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.purl.dc.terms.terms.TermsPackage;
import org.purl.dc.terms.terms.impl.TermsPackageImpl;
import org.schema.schema.SchemaPackage;
import org.schema.schema.impl.SchemaPackageImpl;
import org.w3.ns.adms.AdmsPackage;
import org.w3.ns.adms.impl.AdmsPackageImpl;
import org.w3.ns.dcat.Catalog1;
import org.w3.ns.dcat.Dataset;
import org.w3.ns.dcat.DatasetType;
import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.impl.DcatPackageImpl;
import org.w3.ns.locn.LocnPackage;
import org.w3.ns.locn.impl.LocnPackageImpl;
import org.w3.ns.odrl.OdrlPackage;
import org.w3.ns.odrl.impl.OdrlPackageImpl;
import org.w3.ns.owl.OwlPackage;
import org.w3.ns.owl.impl.OwlPackageImpl;
import org.w3.ns.prov.ProvPackage;
import org.w3.ns.prov.impl.ProvPackageImpl;
import org.w3.ns.rdf.CatalogRoot;
import org.w3.ns.rdf.DocumentRoot;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.RdfPackage;
import org.w3.ns.rdf.impl.RdfPackageImpl;
import org.w3.ns.rdf.util.RdfResourceFactoryImpl;
import org.w3.ns.skos.SkosPackage;
import org.w3.ns.skos.impl.SkosPackageImpl;
import org.w3.ns.vcard.VcardPackage;
import org.w3.ns.vcard.impl.VcardPackageImpl;

import com.xmlns.foaf.foaf.FoafPackage;
import com.xmlns.foaf.foaf.impl.FoafPackageImpl;

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
		packageRegistry.put(AdmsPackage.eNS_URI, AdmsPackageImpl.init());
		packageRegistry.put(DcatPackage.eNS_URI, DcatPackageImpl.init());
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
		DocumentRoot rdfDocRoot = (DocumentRoot) resource.getContents().get(0);
		CatalogRoot catalogRoot = rdfDocRoot.getRDF();
		EList<Catalog1> catalogs = catalogRoot.getCatalog();
		assertFalse(catalogs.isEmpty());
		Catalog1 catalog = catalogs.get(0);
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
		DocumentRoot rdfDocRoot = (DocumentRoot) resource.getContents().get(0);
		CatalogRoot catalogRoot = rdfDocRoot.getRDF();
		EList<Catalog1> catalogs = catalogRoot.getCatalog();
		assertFalse(catalogs.isEmpty());
		Catalog1 catalog = catalogs.get(0);
		assertEquals("https://govdata.de#catalog", catalog.getAbout());
		EList<PlainLiteral> titles = catalog.getTitle();
		assertFalse(titles.isEmpty());
		assertEquals("GovData", titles.get(0).getValue());
		EList<PlainLiteral> descriptions = catalog.getDescription();
		assertFalse(descriptions.isEmpty());
		assertEquals("Das Datenportal für Deutschland - Open Government: Verwaltungsdaten transparent, offen und frei nutzbar.", descriptions.get(0).getValue());
		EList<Dataset> datasets = catalog.getDataset();
		assertFalse(datasets.isEmpty());
		DatasetType dataset = datasets.get(0).getDataset();
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
		DocumentRoot rdfDocRoot = (DocumentRoot) resource.getContents().get(0);
		CatalogRoot catalogRoot = rdfDocRoot.getRDF();
		EList<Catalog1> catalogs = catalogRoot.getCatalog();
		assertFalse(catalogs.isEmpty());
		Catalog1 catalog = catalogs.get(0);
		assertEquals("https://govdata.de#catalog", catalog.getAbout());
		EList<PlainLiteral> titles = catalog.getTitle();
		assertFalse(titles.isEmpty());
		assertEquals("GovData", titles.get(0).getValue());
		EList<PlainLiteral> descriptions = catalog.getDescription();
		assertFalse(descriptions.isEmpty());
		assertEquals("Das Datenportal für Deutschland - Open Government: Verwaltungsdaten transparent, offen und frei nutzbar.", descriptions.get(0).getValue());
		EList<Dataset> datasets = catalog.getDataset();
		assertFalse(datasets.isEmpty());
		DatasetType dataset = datasets.get(0).getDataset();
		assertEquals("https://ckan.govdata.de/dataset/d4ce4e6e-ab89-44cb-bf5c-33a162c234de#dataset", dataset.getAbout());
	}

}
