/*
 */
package dcat.configuration;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;
import org.gecko.emf.osgi.ResourceFactoryConfigurator;
import org.gecko.emf.osgi.annotation.EMFModel;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import adms.AdmsPackage;
import adms.impl.AdmsPackageImpl;
import dcat.DcatPackage;
import dcat.impl.DcatPackageImpl;
import dcatde.DcatDEPackage;
import dcatde.impl.DcatDEPackageImpl;
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
import rdf.RdfPackage;
import rdf.impl.RdfPackageImpl;
import schema.SchemaPackage;
import schema.impl.SchemaPackageImpl;
import skos.SkosPackage;
import skos.impl.SkosPackageImpl;
import terms.TermsPackage;
import terms.impl.TermsPackageImpl;
import vcard.VcardPackage;
import vcard.impl.VcardPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * DCAT Application Profile for data portals in Europe Version 2.0.0
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @see ResourceFactoryConfigurator
 * @generated
 */
//@Component(name="DcatConfigurator", service= EPackageConfigurator.class)
@EMFModel(name=DcatPackage.eNAME, nsURI={DcatPackage.eNS_URI}, version="1.0.0")
public class DcatConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	private Map<String, Object> registry;
	
	@Activate
	public void activate(BundleContext ctx) {
		DcatPackage p = DcatPackageImpl.init();
		if(p == null){
			p= DcatPackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(DcatPackage.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, DcatPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, DcatPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "rdf");
		String[] serviceClasses = new String[] {DcatPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(SchemaPackage.eNS_URI, SchemaPackageImpl.init());
		registry.put(TermsPackage.eNS_URI, TermsPackageImpl.init());
		registry.put(FoafPackage.eNS_URI, FoafPackageImpl.init());
		registry.put(AdmsPackage.eNS_URI, AdmsPackageImpl.init());
		registry.put(DcatPackage.eNS_URI, DcatPackageImpl.init());
		registry.put(DcatDEPackage.eNS_URI, DcatDEPackageImpl.init());
		registry.put(LocnPackage.eNS_URI, LocnPackageImpl.init());
		registry.put(OdrlPackage.eNS_URI, OdrlPackageImpl.init());
		registry.put(OwlPackage.eNS_URI, OwlPackageImpl.init());
		registry.put(ProvPackage.eNS_URI, ProvPackageImpl.init());
		registry.put(RdfPackage.eNS_URI, RdfPackageImpl.init());
		registry.put(SkosPackage.eNS_URI, SkosPackageImpl.init());
		registry.put(VcardPackage.eNS_URI, VcardPackageImpl.init());
		registry.put(DcatPackage.eNS_URI, DcatPackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(SchemaPackage.eNS_URI);
		registry.remove(TermsPackage.eNS_URI);
		registry.remove(FoafPackage.eNS_URI);
		registry.remove(AdmsPackage.eNS_URI);
		registry.remove(DcatPackage.eNS_URI);
		registry.remove(DcatDEPackage.eNS_URI);
		registry.remove(LocnPackage.eNS_URI);
		registry.remove(OdrlPackage.eNS_URI);
		registry.remove(OwlPackage.eNS_URI);
		registry.remove(ProvPackage.eNS_URI);
		registry.remove(RdfPackage.eNS_URI);
		registry.remove(SkosPackage.eNS_URI);
		registry.remove(VcardPackage.eNS_URI);
		registry.remove(DcatPackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(DcatPackage.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
