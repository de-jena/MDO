/*
 */
package de.jena.piveau.dcat.configuration;

import de.jena.piveau.dcat.DcatPackage;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * DCAT Application Profile for data portals in Europe Version 2.0.0
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class DcatEPackageConfigurator implements EPackageConfigurator {
	
	private DcatPackage ePackage;

	protected DcatEPackageConfigurator(DcatPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(DcatPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(DcatPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, DcatPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, DcatPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "rdf");
		properties.put(EMFNamespaces.EMF_MODEL_CONTENT_TYPE, "application/rdf+xml");
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_VERSION, "1.0");
		return properties;
	}
}