/*
 */
package de.jena.mdo.ibis.ibis_gnsslocationservice.configuration;

import de.jena.mdo.ibis.ibis_gnsslocationservice.IbisGNSSLocationServicePackage;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class IbisGNSSLocationServiceEPackageConfigurator implements EPackageConfigurator {
	
	private IbisGNSSLocationServicePackage ePackage;

	protected IbisGNSSLocationServiceEPackageConfigurator(IbisGNSSLocationServicePackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(IbisGNSSLocationServicePackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(IbisGNSSLocationServicePackage.eNS_URI);
	}
	
	/**
	 * A method providing the Prperties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, IbisGNSSLocationServicePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, IbisGNSSLocationServicePackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "ibisgnsslocationservice");
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_VERSION, "1.0");
		return properties;
	}
}