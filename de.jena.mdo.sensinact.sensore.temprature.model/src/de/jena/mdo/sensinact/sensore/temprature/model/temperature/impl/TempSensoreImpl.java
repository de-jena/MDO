/*
 */
package de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl;

import de.jena.mdo.sensinact.resource.impl.DeviceImpl;

import de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore;
import de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperaturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temp Sensore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl.TempSensoreImpl#getTemprature <em>Temprature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TempSensoreImpl extends DeviceImpl implements TempSensore {
	/**
	 * The default value of the '{@link #getTemprature() <em>Temprature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemprature()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPRATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemprature() <em>Temprature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemprature()
	 * @generated
	 * @ordered
	 */
	protected double temprature = TEMPRATURE_EDEFAULT;


	private final TemperaturePackage ePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempSensoreImpl(EClass instanceEClass) {
		super(instanceEClass.getESuperTypes().get(0));
		this.ePackage = (TemperaturePackage) instanceEClass.getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ePackage.getTempSensore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemprature() {
		return temprature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemprature(double newTemprature) {
		double oldTemprature = temprature;
		temprature = newTemprature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemperaturePackage.TEMP_SENSORE__TEMPRATURE, oldTemprature, temprature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemperaturePackage.TEMP_SENSORE__TEMPRATURE:
				return getTemprature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemperaturePackage.TEMP_SENSORE__TEMPRATURE:
				setTemprature((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TemperaturePackage.TEMP_SENSORE__TEMPRATURE:
				setTemprature(TEMPRATURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TemperaturePackage.TEMP_SENSORE__TEMPRATURE:
				return temprature != TEMPRATURE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (temprature: ");
		result.append(temprature);
		result.append(')');
		return result.toString();
	}

} //TempSensoreImpl
