/**
 */
package de.jena.mdo.asset.traffic.impl;

import de.jena.mdo.asset.traffic.EDGE;
import de.jena.mdo.asset.traffic.TrafficPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDGE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEImpl#getID <em>ID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEImpl#getFROMPOINTID <em>FROMPOINTID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.EDGEImpl#getTOPOINTID <em>TOPOINTID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDGEImpl extends MinimalEObjectImpl.Container implements EDGE {
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
	 * The default value of the '{@link #getFROMPOINTID() <em>FROMPOINTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROMPOINTID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FROMPOINTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFROMPOINTID() <em>FROMPOINTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROMPOINTID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frompointid = FROMPOINTID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOPOINTID() <em>TOPOINTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPOINTID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOPOINTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOPOINTID() <em>TOPOINTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPOINTID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger topointid = TOPOINTID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDGEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficPackage.Literals.EDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFROMPOINTID() {
		return frompointid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFROMPOINTID(BigInteger newFROMPOINTID) {
		BigInteger oldFROMPOINTID = frompointid;
		frompointid = newFROMPOINTID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGE__FROMPOINTID, oldFROMPOINTID, frompointid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTOPOINTID() {
		return topointid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTOPOINTID(BigInteger newTOPOINTID) {
		BigInteger oldTOPOINTID = topointid;
		topointid = newTOPOINTID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.EDGE__TOPOINTID, oldTOPOINTID, topointid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafficPackage.EDGE__ID:
				return getID();
			case TrafficPackage.EDGE__FROMPOINTID:
				return getFROMPOINTID();
			case TrafficPackage.EDGE__TOPOINTID:
				return getTOPOINTID();
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
			case TrafficPackage.EDGE__ID:
				setID((BigInteger)newValue);
				return;
			case TrafficPackage.EDGE__FROMPOINTID:
				setFROMPOINTID((BigInteger)newValue);
				return;
			case TrafficPackage.EDGE__TOPOINTID:
				setTOPOINTID((BigInteger)newValue);
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
			case TrafficPackage.EDGE__ID:
				setID(ID_EDEFAULT);
				return;
			case TrafficPackage.EDGE__FROMPOINTID:
				setFROMPOINTID(FROMPOINTID_EDEFAULT);
				return;
			case TrafficPackage.EDGE__TOPOINTID:
				setTOPOINTID(TOPOINTID_EDEFAULT);
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
			case TrafficPackage.EDGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TrafficPackage.EDGE__FROMPOINTID:
				return FROMPOINTID_EDEFAULT == null ? frompointid != null : !FROMPOINTID_EDEFAULT.equals(frompointid);
			case TrafficPackage.EDGE__TOPOINTID:
				return TOPOINTID_EDEFAULT == null ? topointid != null : !TOPOINTID_EDEFAULT.equals(topointid);
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
		result.append(", FROMPOINTID: ");
		result.append(frompointid);
		result.append(", TOPOINTID: ");
		result.append(topointid);
		result.append(')');
		return result.toString();
	}

} //EDGEImpl
