/**
 */
package de.jena.mdo.asset.traffic.impl;

import de.jena.mdo.asset.traffic.*;

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
public class TrafficFactoryImpl extends EFactoryImpl implements TrafficFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrafficFactory init() {
		try {
			TrafficFactory theTrafficFactory = (TrafficFactory)EPackage.Registry.INSTANCE.getEFactory(TrafficPackage.eNS_URI);
			if (theTrafficFactory != null) {
				return theTrafficFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrafficFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficFactoryImpl() {
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
			case TrafficPackage.DETECTOR: return createDETECTOR();
			case TrafficPackage.POINT: return createPOINT();
			case TrafficPackage.EDGEITEM: return createEDGEITEM();
			case TrafficPackage.EDGE: return createEDGE();
			case TrafficPackage.TEST: return createTest();
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
	public DETECTOR createDETECTOR() {
		DETECTORImpl detector = new DETECTORImpl();
		return detector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POINT createPOINT() {
		POINTImpl point = new POINTImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDGEITEM createEDGEITEM() {
		EDGEITEMImpl edgeitem = new EDGEITEMImpl();
		return edgeitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDGE createEDGE() {
		EDGEImpl edge = new EDGEImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficPackage getTrafficPackage() {
		return (TrafficPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrafficPackage getPackage() {
		return TrafficPackage.eINSTANCE;
	}

} //TrafficFactoryImpl
