/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.configuration;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServiceFactory;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import org.osgi.service.condition.Condition;

/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "IbisDeviceManagementServiceConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServiceFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.ibis.ibis_devicemanagementservice" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.ibis.ibis_devicemanagementservice" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.ibis.ibis_devicemanagementservice" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class IbisDeviceManagementServiceConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		IbisDeviceManagementServicePackage ePackage = IbisDeviceManagementServicePackageImpl.eINSTANCE;
		
		IbisDeviceManagementServiceEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the IbisDeviceManagementServiceEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private IbisDeviceManagementServiceEPackageConfigurator registerEPackageConfiguratorService(IbisDeviceManagementServicePackage ePackage, BundleContext ctx){
		IbisDeviceManagementServiceEPackageConfigurator packageConfigurator = new IbisDeviceManagementServiceEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the IbisDeviceManagementServicePackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(IbisDeviceManagementServicePackage ePackage, IbisDeviceManagementServiceEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {IbisDeviceManagementServicePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the IbisDeviceManagementServiceFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(IbisDeviceManagementServicePackage ePackage, IbisDeviceManagementServiceEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {IbisDeviceManagementServiceFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getIbisDeviceManagementServiceFactory(), properties);
	}

	private void registerConditionService(IbisDeviceManagementServiceEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, IbisDeviceManagementServicePackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(IbisDeviceManagementServicePackage.eNS_URI);
	}
}
