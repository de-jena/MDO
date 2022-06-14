/**
 */
package de.jena.mdo.asset.traffic.impl;

import de.jena.mdo.asset.traffic.POINT;
import de.jena.mdo.asset.traffic.TrafficPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POINT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.POINTImpl#getID <em>ID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.POINTImpl#getXCOORD <em>XCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.POINTImpl#getYCOORD <em>YCOORD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POINTImpl extends MinimalEObjectImpl.Container implements POINT {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCOORD() <em>XCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCOORD()
	 * @generated
	 * @ordered
	 */
	protected static final double XCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXCOORD() <em>XCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCOORD()
	 * @generated
	 * @ordered
	 */
	protected double xcoord = XCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCOORD() <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCOORD()
	 * @generated
	 * @ordered
	 */
	protected static final double YCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYCOORD() <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCOORD()
	 * @generated
	 * @ordered
	 */
	protected double ycoord = YCOORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected POINTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficPackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(BigInteger newID) {
		BigInteger oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.POINT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXCOORD() {
		return xcoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXCOORD(double newXCOORD) {
		double oldXCOORD = xcoord;
		xcoord = newXCOORD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.POINT__XCOORD, oldXCOORD, xcoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYCOORD() {
		return ycoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYCOORD(double newYCOORD) {
		double oldYCOORD = ycoord;
		ycoord = newYCOORD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.POINT__YCOORD, oldYCOORD, ycoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafficPackage.POINT__ID:
				return getID();
			case TrafficPackage.POINT__XCOORD:
				return getXCOORD();
			case TrafficPackage.POINT__YCOORD:
				return getYCOORD();
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
			case TrafficPackage.POINT__ID:
				setID((BigInteger)newValue);
				return;
			case TrafficPackage.POINT__XCOORD:
				setXCOORD((Double)newValue);
				return;
			case TrafficPackage.POINT__YCOORD:
				setYCOORD((Double)newValue);
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
			case TrafficPackage.POINT__ID:
				setID(ID_EDEFAULT);
				return;
			case TrafficPackage.POINT__XCOORD:
				setXCOORD(XCOORD_EDEFAULT);
				return;
			case TrafficPackage.POINT__YCOORD:
				setYCOORD(YCOORD_EDEFAULT);
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
			case TrafficPackage.POINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TrafficPackage.POINT__XCOORD:
				return xcoord != XCOORD_EDEFAULT;
			case TrafficPackage.POINT__YCOORD:
				return ycoord != YCOORD_EDEFAULT;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", XCOORD: ");
		result.append(xcoord);
		result.append(", YCOORD: ");
		result.append(ycoord);
		result.append(')');
		return result.toString();
	}

} //POINTImpl
