/*
 */
package de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl;

import de.jena.mdo.sensinact.sensore.temprature.model.temperature.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemperatureFactoryImpl extends EFactoryImpl implements TemperatureFactory {
	private final TemperaturePackage ePackage;

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureFactoryImpl(TemperaturePackage ePackage) {
		super();
		this.ePackage = ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TemperaturePackage.TEMP_SENSORE: return createTempSensore();
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
	public TempSensore createTempSensore() {
		TempSensoreImpl tempSensore = new TempSensoreImpl(ePackage.getTempSensore());
		return tempSensore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemperaturePackage getTemperaturePackage() {
		return ePackage;
	}
} //TemperatureFactoryImpl
