/**
 */
package de.jena.mdo.ibis.gnsslocationservice.impl;

import de.jena.mdo.ibis.gnsslocationservice.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisGNSSLocationServiceFactoryImpl extends EFactoryImpl implements IbisGNSSLocationServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IbisGNSSLocationServiceFactory init() {
		try {
			IbisGNSSLocationServiceFactory theIbisGNSSLocationServiceFactory = (IbisGNSSLocationServiceFactory)EPackage.Registry.INSTANCE.getEFactory(IbisGNSSLocationServicePackage.eNS_URI);
			if (theIbisGNSSLocationServiceFactory != null) {
				return theIbisGNSSLocationServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IbisGNSSLocationServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisGNSSLocationServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE: return createGNSSLocationServiceDataStructure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSLocationServiceDataStructure createGNSSLocationServiceDataStructure() {
		GNSSLocationServiceDataStructureImpl gnssLocationServiceDataStructure = new GNSSLocationServiceDataStructureImpl();
		return gnssLocationServiceDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisGNSSLocationServicePackage getIbisGNSSLocationServicePackage() {
		return (IbisGNSSLocationServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IbisGNSSLocationServicePackage getPackage() {
		return IbisGNSSLocationServicePackage.eINSTANCE;
	}

} //IbisGNSSLocationServiceFactoryImpl
