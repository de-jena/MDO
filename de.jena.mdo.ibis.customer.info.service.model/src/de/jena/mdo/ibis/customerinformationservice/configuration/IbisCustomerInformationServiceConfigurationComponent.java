/*
 */
package de.jena.mdo.ibis.customerinformationservice.configuration;

import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServiceFactory;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import de.jena.mdo.ibis.customerinformationservice.impl.IbisCustomerInformationServicePackageImpl;

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
@Component(name = "IbisCustomerInformationServiceConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServiceFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.ibis.customerinformationservice" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.ibis.customerinformationservice" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.ibis.customerinformationservice" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class IbisCustomerInformationServiceConfigurationComponent {
	
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
		IbisCustomerInformationServicePackage ePackage = IbisCustomerInformationServicePackageImpl.eINSTANCE;
		
		IbisCustomerInformationServiceEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the IbisCustomerInformationServiceEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private IbisCustomerInformationServiceEPackageConfigurator registerEPackageConfiguratorService(IbisCustomerInformationServicePackage ePackage, BundleContext ctx){
		IbisCustomerInformationServiceEPackageConfigurator packageConfigurator = new IbisCustomerInformationServiceEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the IbisCustomerInformationServicePackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(IbisCustomerInformationServicePackage ePackage, IbisCustomerInformationServiceEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {IbisCustomerInformationServicePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the IbisCustomerInformationServiceFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(IbisCustomerInformationServicePackage ePackage, IbisCustomerInformationServiceEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {IbisCustomerInformationServiceFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getIbisCustomerInformationServiceFactory(), properties);
	}

	private void registerConditionService(IbisCustomerInformationServiceEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, IbisCustomerInformationServicePackage.eNS_URI);
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
		EPackage.Registry.INSTANCE.remove(IbisCustomerInformationServicePackage.eNS_URI);
	}
}