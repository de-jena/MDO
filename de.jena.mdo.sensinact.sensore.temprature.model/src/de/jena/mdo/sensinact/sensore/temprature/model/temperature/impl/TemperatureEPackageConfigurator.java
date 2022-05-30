/*
 */
package de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl;

import de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperaturePackage;

import org.gecko.emf.osgi.EPackageConfigurator;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class TemperatureEPackageConfigurator implements EPackageConfigurator {
	
	private TemperaturePackage ePackage;

	protected TemperatureEPackageConfigurator(TemperaturePackage ePackage){
		this.ePackage = ePackage;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(TemperaturePackage.eNS_URI, ePackage);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(TemperaturePackage.eNS_URI);
	}
}