/*
 */
package de.jena.mdo.asset.traffic.impl;

import de.jena.mdo.asset.traffic.EDGEITEM;
import de.jena.mdo.asset.traffic.TrafficPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDGEITEM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEITEMImpl#getEDGEID <em>EDGEID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEITEMImpl#getINDEX <em>INDEX</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEITEMImpl#getXCOORD <em>XCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEITEMImpl#getYCOORD <em>YCOORD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDGEITEMImpl extends MinimalEObjectImpl.Container implements EDGEITEM {
	/**
	 * The default value of the '{@link #getEDGEID() <em>EDGEID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDGEID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EDGEID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEDGEID() <em>EDGEID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDGEID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger edgeid = EDGEID_EDEFAULT;

	/**
	 * The default value of the '{@link #getINDEX() <em>INDEX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINDEX()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getINDEX() <em>INDEX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINDEX()
	 * @generated
	 * @ordered
	 */
	protected BigInteger index = INDEX_EDEFAULT;

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
	protected EDGEITEMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficPackage.Literals.EDGEITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getEDGEID() {
		return edgeid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEDGEID(BigInteger newEDGEID) {
		BigInteger oldEDGEID = edgeid;
		edgeid = newEDGEID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGEITEM__EDGEID, oldEDGEID, edgeid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getINDEX() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setINDEX(BigInteger newINDEX) {
		BigInteger oldINDEX = index;
		index = newINDEX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGEITEM__INDEX, oldINDEX, index));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGEITEM__XCOORD, oldXCOORD, xcoord));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGEITEM__YCOORD, oldYCOORD, ycoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafficPackage.EDGEITEM__EDGEID:
				return getEDGEID();
			case TrafficPackage.EDGEITEM__INDEX:
				return getINDEX();
			case TrafficPackage.EDGEITEM__XCOORD:
				return getXCOORD();
			case TrafficPackage.EDGEITEM__YCOORD:
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
			case TrafficPackage.EDGEITEM__EDGEID:
				setEDGEID((BigInteger)newValue);
				return;
			case TrafficPackage.EDGEITEM__INDEX:
				setINDEX((BigInteger)newValue);
				return;
			case TrafficPackage.EDGEITEM__XCOORD:
				setXCOORD((Double)newValue);
				return;
			case TrafficPackage.EDGEITEM__YCOORD:
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
			case TrafficPackage.EDGEITEM__EDGEID:
				setEDGEID(EDGEID_EDEFAULT);
				return;
			case TrafficPackage.EDGEITEM__INDEX:
				setINDEX(INDEX_EDEFAULT);
				return;
			case TrafficPackage.EDGEITEM__XCOORD:
				setXCOORD(XCOORD_EDEFAULT);
				return;
			case TrafficPackage.EDGEITEM__YCOORD:
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
			case TrafficPackage.EDGEITEM__EDGEID:
				return EDGEID_EDEFAULT == null ? edgeid != null : !EDGEID_EDEFAULT.equals(edgeid);
			case TrafficPackage.EDGEITEM__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case TrafficPackage.EDGEITEM__XCOORD:
				return xcoord != XCOORD_EDEFAULT;
			case TrafficPackage.EDGEITEM__YCOORD:
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
		result.append(" (EDGEID: ");
		result.append(edgeid);
		result.append(", INDEX: ");
		result.append(index);
		result.append(", XCOORD: ");
		result.append(xcoord);
		result.append(", YCOORD: ");
		result.append(ycoord);
		result.append(')');
		return result.toString();
	}

} //EDGEITEMImpl
