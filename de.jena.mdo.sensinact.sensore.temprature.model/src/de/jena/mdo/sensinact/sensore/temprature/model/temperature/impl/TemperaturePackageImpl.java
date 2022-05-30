/*
 */
package de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl;

import de.jena.mdo.sensinact.resource.ResourcePackage;

import de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore;
import de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperatureFactory;
import de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperaturePackage;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@EMFModel(name=TemperaturePackage.eNAME, nsURI={TemperaturePackage.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = TemperaturePackage.eNAME, nsURI = { TemperaturePackage.eNS_URI }, version = "1.0.0")
@Component( name = TemperaturePackage.eNAME, service = { TemperaturePackage.class, EPackage.class }, immediate = true, scope = ServiceScope.SINGLETON)
public class TemperaturePackageImpl extends EPackageImpl implements TemperaturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempSensoreEClass = null;

	// Reference required models
	@Reference
	private ResourcePackage theResourcePackage; 

	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;

	/**
	 * Creates an instance of the model <b>Package</b>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperaturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	public TemperaturePackageImpl() {
		super();
	}

    /**
	 * Activates and initializes the Package and registers the Package {@link org.gecko.emf.osgi.EPackageConfigurator}.
	 *
     * @generated
	 */
    @Activate
	public void activate(BundleContext ctx) {
		// Initialize simple dependencies
		// Create package meta-data objects
		createPackageContents();

		// Initialize created meta-data
		initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		freeze();

		setEFactoryInstance(new TemperatureFactoryImpl(this));

		// register the EPackageConfigurator
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, TemperaturePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, TemperaturePackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "temperature");
		
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, new TemperatureEPackageConfigurator(this), properties);
		
		//regsiter the EFactory as a service
		eFactoryRegistration = ctx.registerService(new String[]{EFactory.class.getName(), TemperatureFactory.class.getName()}, getTemperatureFactory(), properties);
	}
	
	@Deactivate
	public void deactivate() {
		if(ePackageConfiguratorRegistration != null){
			ePackageConfiguratorRegistration.unregister();
		}
		if(eFactoryRegistration != null){
			eFactoryRegistration.unregister();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTempSensore() {
		return tempSensoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTempSensore_Temprature() {
		return (EAttribute)tempSensoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemperatureFactory getTemperatureFactory() {
		return (TemperatureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tempSensoreEClass = createEClass(TEMP_SENSORE);
		createEAttribute(tempSensoreEClass, TEMP_SENSORE__TEMPRATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tempSensoreEClass.getESuperTypes().add(theResourcePackage.getDevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(tempSensoreEClass, TempSensore.class, "TempSensore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTempSensore_Temprature(), ecorePackage.getEDouble(), "temprature", null, 1, 1, TempSensore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "resource", "platform:/resource/de.jena.mdo.sensinact.resource.model/model/resource.ecore#/"
		   });
	}

} //TemperaturePackageImpl
