/**
 */
package de.jena.mdo.ibis.ibis_gnsslocationservice.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage;

import de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData;
import de.jena.mdo.ibis.ibis_gnsslocationservice.IbisGNSSLocationServiceFactory;
import de.jena.mdo.ibis.ibis_gnsslocationservice.IbisGNSSLocationServicePackage;

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
	private EClass gnssLocationDataEClass = null;

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
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.IbisGNSSLocationServicePackage#eNS_URI
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
	public EClass getGNSSLocationData() {
		return gnssLocationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_Latitude() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_Longitude() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_Altitude() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_Time() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_Date() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_SpeedOverGround() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_SignalQuality() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_NumberOfSatellites() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_HoriziontalDilutionOfPrecision() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_VerticalDilutionOfPrecision() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_TrackDegreeTrue() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationData_TrackDegreeMagnetic() {
		return (EReference)gnssLocationDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_GNSSType() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_GNSSCoordinateSystem() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(13);
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
		gnssLocationDataEClass = createEClass(GNSS_LOCATION_DATA);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__LATITUDE);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__LONGITUDE);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__ALTITUDE);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__TIME);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__DATE);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__SPEED_OVER_GROUND);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__SIGNAL_QUALITY);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__HORIZIONTAL_DILUTION_OF_PRECISION);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE);
		createEReference(gnssLocationDataEClass, GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__GNSS_TYPE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM);
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
		initEClass(gnssLocationDataEClass, GNSSLocationData.class, "GNSSLocationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNSSLocationData_Latitude(), theIbisCommonPackage.getGNSSCoordinate(), null, "latitude", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_Longitude(), theIbisCommonPackage.getGNSSCoordinate(), null, "longitude", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_Altitude(), theIbisCommonPackage.getIBISIPDouble(), null, "altitude", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_Time(), theIbisCommonPackage.getIBISIPDateTime(), null, "time", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_Date(), theIbisCommonPackage.getIBISIPDate(), null, "date", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_SpeedOverGround(), theIbisCommonPackage.getIBISIPDouble(), null, "speedOverGround", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_SignalQuality(), theIbisEnumerationsPackage.getGNSSQualityEnumeration(), "signalQuality", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_NumberOfSatellites(), theIbisCommonPackage.getIBISIPInt(), null, "numberOfSatellites", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_HoriziontalDilutionOfPrecision(), theIbisCommonPackage.getIBISIPDouble(), null, "horiziontalDilutionOfPrecision", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_VerticalDilutionOfPrecision(), theIbisCommonPackage.getIBISIPDouble(), null, "verticalDilutionOfPrecision", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_TrackDegreeTrue(), theIbisCommonPackage.getIBISIPDouble(), null, "trackDegreeTrue", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSLocationData_TrackDegreeMagnetic(), theIbisCommonPackage.getIBISIPDouble(), null, "trackDegreeMagnetic", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_GNSSType(), theIbisEnumerationsPackage.getGNSSTypeEnumeration(), "gNSSType", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_GNSSCoordinateSystem(), theIbisEnumerationsPackage.getGNSSCoordinateSystemEnumeration(), "gNSSCoordinateSystem", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (gnssLocationDataEClass,
		   source,
		   new String[] {
			   "name", "GNSSLocationService.DataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGNSSLocationData_Latitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "latitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_Longitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "longitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_Altitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "altitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_SpeedOverGround(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeedOverGround",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_SignalQuality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalQuality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_NumberOfSatellites(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfSatellites",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_HoriziontalDilutionOfPrecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HoriziontalDilutionOfPrecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_VerticalDilutionOfPrecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VerticalDilutionOfPrecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_TrackDegreeTrue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TrackDegreeTrue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_TrackDegreeMagnetic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TrackDegreeMagnetic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_GNSSType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSLocationData_GNSSCoordinateSystem(),
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
		  (getGNSSLocationData_GNSSCoordinateSystem(),
		   source,
		   new String[] {
			   "documentation", "Information on the CoordinateSystem of the GNSS"
		   });
	}

} //IbisGNSSLocationServicePackageImpl
