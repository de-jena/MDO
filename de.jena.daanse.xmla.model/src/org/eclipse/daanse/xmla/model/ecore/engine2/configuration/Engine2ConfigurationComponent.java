/*
 */
package org.eclipse.daanse.xmla.model.ecore.engine2.configuration;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.daanse.xmla.model.ecore.engine2.Engine2Package;

import org.eclipse.daanse.xmla.model.ecore.engine2.impl.Engine2PackageImpl;

import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;

import org.gecko.emf.osgi.annotation.require.RequireEMF;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @see ResourceFactoryConfigurator
 * @generated
 */
@Component(name="Engine2Configurator", service= EPackageConfigurator.class)
@EMFModel(name=Engine2Package.eNAME, nsURI={Engine2Package.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = Engine2Package.eNAME, nsURI = { Engine2Package.eNS_URI }, version = "1.0.0")
public class Engine2ConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		Engine2Package p = Engine2PackageImpl.init();
		if(p == null){
			p= Engine2PackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(Engine2Package.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, Engine2Package.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, Engine2Package.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "engine2");
		String[] serviceClasses = new String[] {Engine2Package.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(Engine2Package.eNS_URI, Engine2PackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(Engine2Package.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(Engine2Package.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
