/**
 */
package de.jena.mdo.ibis.gnsslocationservice.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure;
import de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServiceFactory;
import de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisGNSSLocationServicePackageImpl extends EPackageImpl implements IbisGNSSLocationServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssLocationServiceDataStructureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IbisGNSSLocationServicePackageImpl() {
		super(eNS_URI, IbisGNSSLocationServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IbisGNSSLocationServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IbisGNSSLocationServicePackage init() {
		if (isInited) return (IbisGNSSLocationServicePackage)EPackage.Registry.INSTANCE.getEPackage(IbisGNSSLocationServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIbisGNSSLocationServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IbisGNSSLocationServicePackageImpl theIbisGNSSLocationServicePackage = registeredIbisGNSSLocationServicePackage instanceof IbisGNSSLocationServicePackageImpl ? (IbisGNSSLocationServicePackageImpl)registeredIbisGNSSLocationServicePackage : new IbisGNSSLocationServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IbisCommonPackage.eINSTANCE.eClass();
		IbisEnumerationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIbisGNSSLocationServicePackage.createPackageContents();

		// Initialize created meta-data
		theIbisGNSSLocationServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIbisGNSSLocationServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IbisGNSSLocationServicePackage.eNS_URI, theIbisGNSSLocationServicePackage);
		return theIbisGNSSLocationServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSLocationServiceDataStructure() {
		return gnssLocationServiceDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Latitude() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Longitude() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Altitude() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Time() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Date() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_SpeedOverGround() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationServiceDataStructure_SignalQuality() {
		return (EAttribute)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_NumberOfSatellites() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_HoriziontalDilutionOfPrecision() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_VerticalDilutionOfPrecision() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_TrackDegreeTrue() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_TrackDegreeMagnetic() {
		return (EReference)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationServiceDataStructure_GNSSType() {
		return (EAttribute)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationServiceDataStructure_GNSSCoordinateSystem() {
		return (EAttribute)gnssLocationServiceDataStructureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisGNSSLocationServiceFactory getIbisGNSSLocationServiceFactory() {
		return (IbisGNSSLocationServiceFactory)getEFactoryInstance();
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
		gnssLocationServiceDataStructureEClass = createEClass(GNSS_LOCATION_SERVICE_DATA_STRUCTURE);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND);
		createEAttribute(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE);
		createEReference(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC);
		createEAttribute(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE);
		createEAttribute(gnssLocationServiceDataStructureEClass, GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM);
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
		IbisCommonPackage theIbisCommonPackage = (IbisCommonPackage)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI);
		IbisEnumerationsPackage theIbisEnumerationsPackage = (IbisEnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(IbisEnumerationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gnssLocationServiceDataStructureEClass, GNSSLocationServiceDataStructure.class, "GNSSLocationServiceDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNSSLocationServiceDataStructure_Latitude(), theIbisCommonPackage.getGNSSCoordinateStructure(), null, "latitude", null, 1, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_Longitude(), theIbisCommonPackage.getGNSSCoordinateStructure(), null, "longitude", null, 1, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_Altitude(), theIbisCommonPackage.getIBISIPDouble(), null, "altitude", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_Time(), theIbisCommonPackage.getIBISIPDateTime(), null, "time", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_Date(), theIbisCommonPackage.getIBISIPDate(), null, "date", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_SpeedOverGround(), theIbisCommonPackage.getIBISIPDouble(), null, "speedOverGround", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationServiceDataStructure_SignalQuality(), theIbisEnumerationsPackage.getGNSSQualityEnumeration(), "signalQuality", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_NumberOfSatellites(), theIbisCommonPackage.getIBISIPInt(), null, "numberOfSatellites", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_HoriziontalDilutionOfPrecision(), theIbisCommonPackage.getIBISIPDouble(), null, "horiziontalDilutionOfPrecision", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_VerticalDilutionOfPrecision(), theIbisCommonPackage.getIBISIPDouble(), null, "verticalDilutionOfPrecision", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_TrackDegreeTrue(), theIbisCommonPackage.getIBISIPDouble(), null, "trackDegreeTrue", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationServiceDataStructure_TrackDegreeMagnetic(), theIbisCommonPackage.getIBISIPDouble(), null, "trackDegreeMagnetic", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationServiceDataStructure_GNSSType(), theIbisEnumerationsPackage.getGNSSTypeEnumeration(), "gNSSType", null, 1, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationServiceDataStructure_GNSSCoordinateSystem(), theIbisEnumerationsPackage.getGNSSCoordinateSystemEnumeration(), "gNSSCoordinateSystem", null, 0, 1, GNSSLocationServiceDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (gnssLocationServiceDataStructureEClass,
		   source,
		   new String[] {
			   "name", "GNSSLocationService.DataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_Latitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "latitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_Longitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "longitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_Altitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "altitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_SpeedOverGround(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeedOverGround",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_SignalQuality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalQuality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_NumberOfSatellites(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfSatellites",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_HoriziontalDilutionOfPrecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HoriziontalDilutionOfPrecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_VerticalDilutionOfPrecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VerticalDilutionOfPrecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_TrackDegreeTrue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TrackDegreeTrue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_TrackDegreeMagnetic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TrackDegreeMagnetic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_GNSSType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationServiceDataStructure_GNSSCoordinateSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSCoordinateSystem",
			   "namespace", "##targetNamespace"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getGNSSLocationServiceDataStructure_GNSSCoordinateSystem(),
		   source,
		   new String[] {
			   "documentation", "Information on the CoordinateSystem of the GNSS"
		   });
	}

} //IbisGNSSLocationServicePackageImpl
