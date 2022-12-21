///*
// */
//package de.jena.mdo.asset.traffic.configuration;
//
//import de.jena.mdo.asset.traffic.TrafficFactory;
//import de.jena.mdo.asset.traffic.TrafficPackage;
//
//import de.jena.mdo.asset.traffic.impl.TrafficPackageImpl;
//
//import java.util.Hashtable;
//
//import org.eclipse.emf.ecore.EFactory;
//import org.eclipse.emf.ecore.EPackage;
//
//import org.gecko.emf.osgi.EPackageConfigurator;
//
//import org.osgi.annotation.bundle.Capability;
//
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.ServiceRegistration;
//
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Deactivate;
//import org.osgi.service.component.annotations.Reference;
//import org.osgi.service.component.annotations.ReferenceCardinality;
//
//
///**
// * The <b>PackageConfiguration</b> for the model.
// * The package will be registered into a OSGi base model registry.
// * 
// * @generated
// */
////@Component(name = "TrafficConfigurator",
//// 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
//// )
////@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.mdo.asset.traffic.TrafficFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.asset.traffic" })
////@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.mdo.asset.traffic.TrafficPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.asset.traffic" })
////@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.jena.mdo.asset.traffic" })
////@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
//public class TrafficConfigurationComponent {
//	
//	private ServiceRegistration<?> packageRegistration = null;
//	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
//	private ServiceRegistration<?> eFactoryRegistration = null;
//	private ServiceRegistration<?> conditionRegistration = null;
//
//	/**
//	 * Activates the Configuration Component.
//	 *
//	 * @generated
//	 */
//	@Activate
//	public void activate(BundleContext ctx) {
//		TrafficPackage ePackage = TrafficPackageImpl.eINSTANCE;
//		
//		TrafficEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
//		registerEPackageService(ePackage, packageConfigurator, ctx);
//		registerEFactoryService(ePackage, packageConfigurator, ctx);
//		registerConditionService(packageConfigurator, ctx);
//	}
//	
//	/**
//	 * Registers the TrafficEPackageConfigurator as a service.
//	 *
//	 * @generated
//	 */
//	private TrafficEPackageConfigurator registerEPackageConfiguratorService(TrafficPackage ePackage, BundleContext ctx){
//		TrafficEPackageConfigurator packageConfigurator = new TrafficEPackageConfigurator(ePackage);
//		// register the EPackageConfigurator
//		Hashtable<String, Object> properties = new Hashtable<String, Object>();
//		properties.putAll(packageConfigurator.getServiceProperties());
//		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);
//
//		return packageConfigurator;
//	}
//
//	/**
//	 * Registers the TrafficPackage as a service.
//	 *
//	 * @generated
//	 */
//	private void registerEPackageService(TrafficPackage ePackage, EPackageConfigurator packageConfigurator, BundleContext ctx){
//		Hashtable<String, Object> properties = new Hashtable<String, Object>();
//		properties.putAll(packageConfigurator.getServiceProperties());
//		String[] serviceClasses = new String[] {TrafficPackage.class.getName(), EPackage.class.getName()};
//		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
//	}
//
//	/**
//	 * Registers the TrafficFactory as a service.
//	 *
//	 * @generated
//	 */
//	private void registerEFactoryService(TrafficPackage ePackage, EPackageConfigurator packageConfigurator, BundleContext ctx){
//		Hashtable<String, Object> properties = new Hashtable<String, Object>();
//		properties.putAll(packageConfigurator.getServiceProperties());
//		String[] serviceClasses = new String[] {TrafficFactory.class.getName(), EFactory.class.getName()};
//		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getTrafficFactory(), properties);
//	}
//
//	private void registerConditionService(EPackageConfigurator packageConfigurator, BundleContext ctx){
//		// register the EPackage
//		Hashtable<String, Object> properties = new Hashtable<String, Object>();
//		properties.putAll(packageConfigurator.getServiceProperties());
//		properties.put(Condition.CONDITION_ID, TrafficPackage.eNS_URI);
//		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
//	}
//
//	/**
//	 * Deactivates and unregisteres everything.
//	 *
//	 * @generated
//	 */
//	@Deactivate
//	public void deactivate() {
//		conditionRegistration.unregister();
//		eFactoryRegistration.unregister();
//		packageRegistration.unregister();
//		ePackageConfiguratorRegistration.unregister();
//		EPackage.Registry.INSTANCE.remove(TrafficPackage.eNS_URI);
//	}
//}
