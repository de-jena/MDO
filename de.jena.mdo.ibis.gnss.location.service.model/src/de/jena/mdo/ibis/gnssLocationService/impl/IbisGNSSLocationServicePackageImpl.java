/**
 */
package de.jena.mdo.ibis.gnssLocationService.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import de.jena.mdo.ibis.gnssLocationService.IbisGNSSLocationServiceFactory;
import de.jena.mdo.ibis.gnssLocationService.IbisGNSSLocationServicePackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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
	protected String packageFilename = "gnssLocationService.ecore";

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
	 * @see de.jena.mdo.ibis.gnssLocationService.IbisGNSSLocationServicePackage#eNS_URI
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

		// Load packages
		theIbisGNSSLocationServicePackage.loadPackage();

		// Fix loaded packages
		theIbisGNSSLocationServicePackage.fixPackageContents();

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
		if (gnssLocationServiceDataStructureEClass == null) {
			gnssLocationServiceDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisGNSSLocationServicePackage.eNS_URI).getEClassifiers().get(0);
		}
		return gnssLocationServiceDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Latitude() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Longitude() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Altitude() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Time() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_Date() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_SpeedOverGround() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationServiceDataStructure_SignalQuality() {
        return (EAttribute)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_NumberOfSatellites() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_HoriziontalDilutionOfPrecision() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_VerticalDilutionOfPrecision() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_TrackDegreeTrue() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSLocationServiceDataStructure_TrackDegreeMagnetic() {
        return (EReference)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationServiceDataStructure_GNSSType() {
        return (EAttribute)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationServiceDataStructure_GNSSCoordinateSystem() {
        return (EAttribute)getGNSSLocationServiceDataStructure().getEStructuralFeatures().get(13);
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
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.jena.mdo.ibis.gnssLocationService." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IbisGNSSLocationServicePackageImpl
