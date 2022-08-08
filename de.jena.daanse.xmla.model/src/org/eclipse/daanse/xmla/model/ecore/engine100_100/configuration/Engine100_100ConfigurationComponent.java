/*
 */
package org.eclipse.daanse.xmla.model.ecore.engine100_100.configuration;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.Engine100_100PackageImpl;

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
@Component(name="Engine100_100Configurator", service= EPackageConfigurator.class)
@EMFModel(name=Engine100_100Package.eNAME, nsURI={Engine100_100Package.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = Engine100_100Package.eNAME, nsURI = { Engine100_100Package.eNS_URI }, version = "1.0.0")
public class Engine100_100ConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		Engine100_100Package p = Engine100_100PackageImpl.init();
		if(p == null){
			p= Engine100_100PackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(Engine100_100Package.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, Engine100_100Package.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, Engine100_100Package.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "engine100_100");
		String[] serviceClasses = new String[] {Engine100_100Package.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(Engine100_100Package.eNS_URI, Engine100_100PackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(Engine100_100Package.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(Engine100_100Package.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
