/**
 */
package org.w3.ns.locn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.ns.locn.AddressType;
import org.w3.ns.locn.LocnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.locn.impl.AddressTypeImpl#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.w3.ns.locn.impl.AddressTypeImpl#getPostName <em>Post Name</em>}</li>
 *   <li>{@link org.w3.ns.locn.impl.AddressTypeImpl#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link org.w3.ns.locn.impl.AddressTypeImpl#getAdminUnitL1 <em>Admin Unit L1</em>}</li>
 *   <li>{@link org.w3.ns.locn.impl.AddressTypeImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.w3.ns.locn.impl.AddressTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressTypeImpl extends MinimalEObjectImpl.Container implements AddressType {
	/**
	 * The default value of the '{@link #getThoroughfare() <em>Thoroughfare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfare()
	 * @generated
	 * @ordered
	 */
	protected static final String THOROUGHFARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThoroughfare() <em>Thoroughfare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfare()
	 * @generated
	 * @ordered
	 */
	protected String thoroughfare = THOROUGHFARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostName() <em>Post Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostName()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostName() <em>Post Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostName()
	 * @generated
	 * @ordered
	 */
	protected String postName = POST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected String postCode = POST_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminUnitL1() <em>Admin Unit L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUnitL1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_UNIT_L1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminUnitL1() <em>Admin Unit L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUnitL1()
	 * @generated
	 * @ordered
	 */
	protected String adminUnitL1 = ADMIN_UNIT_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected String nodeID = NODE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocnPackage.Literals.ADDRESS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThoroughfare() {
		return thoroughfare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThoroughfare(String newThoroughfare) {
		String oldThoroughfare = thoroughfare;
		thoroughfare = newThoroughfare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocnPackage.ADDRESS_TYPE__THOROUGHFARE, oldThoroughfare, thoroughfare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostName() {
		return postName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostName(String newPostName) {
		String oldPostName = postName;
		postName = newPostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocnPackage.ADDRESS_TYPE__POST_NAME, oldPostName, postName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostCode() {
		return postCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostCode(String newPostCode) {
		String oldPostCode = postCode;
		postCode = newPostCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocnPackage.ADDRESS_TYPE__POST_CODE, oldPostCode, postCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdminUnitL1() {
		return adminUnitL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminUnitL1(String newAdminUnitL1) {
		String oldAdminUnitL1 = adminUnitL1;
		adminUnitL1 = newAdminUnitL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocnPackage.ADDRESS_TYPE__ADMIN_UNIT_L1, oldAdminUnitL1, adminUnitL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocnPackage.ADDRESS_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeID(String newNodeID) {
		String oldNodeID = nodeID;
		nodeID = newNodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocnPackage.ADDRESS_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocnPackage.ADDRESS_TYPE__THOROUGHFARE:
				return getThoroughfare();
			case LocnPackage.ADDRESS_TYPE__POST_NAME:
				return getPostName();
			case LocnPackage.ADDRESS_TYPE__POST_CODE:
				return getPostCode();
			case LocnPackage.ADDRESS_TYPE__ADMIN_UNIT_L1:
				return getAdminUnitL1();
			case LocnPackage.ADDRESS_TYPE__ABOUT:
				return getAbout();
			case LocnPackage.ADDRESS_TYPE__NODE_ID:
				return getNodeID();
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
			case LocnPackage.ADDRESS_TYPE__THOROUGHFARE:
				setThoroughfare((String)newValue);
				return;
			case LocnPackage.ADDRESS_TYPE__POST_NAME:
				setPostName((String)newValue);
				return;
			case LocnPackage.ADDRESS_TYPE__POST_CODE:
				setPostCode((String)newValue);
				return;
			case LocnPackage.ADDRESS_TYPE__ADMIN_UNIT_L1:
				setAdminUnitL1((String)newValue);
				return;
			case LocnPackage.ADDRESS_TYPE__ABOUT:
				setAbout((String)newValue);
				return;
			case LocnPackage.ADDRESS_TYPE__NODE_ID:
				setNodeID((String)newValue);
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
			case LocnPackage.ADDRESS_TYPE__THOROUGHFARE:
				setThoroughfare(THOROUGHFARE_EDEFAULT);
				return;
			case LocnPackage.ADDRESS_TYPE__POST_NAME:
				setPostName(POST_NAME_EDEFAULT);
				return;
			case LocnPackage.ADDRESS_TYPE__POST_CODE:
				setPostCode(POST_CODE_EDEFAULT);
				return;
			case LocnPackage.ADDRESS_TYPE__ADMIN_UNIT_L1:
				setAdminUnitL1(ADMIN_UNIT_L1_EDEFAULT);
				return;
			case LocnPackage.ADDRESS_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case LocnPackage.ADDRESS_TYPE__NODE_ID:
				setNodeID(NODE_ID_EDEFAULT);
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
			case LocnPackage.ADDRESS_TYPE__THOROUGHFARE:
				return THOROUGHFARE_EDEFAULT == null ? thoroughfare != null : !THOROUGHFARE_EDEFAULT.equals(thoroughfare);
			case LocnPackage.ADDRESS_TYPE__POST_NAME:
				return POST_NAME_EDEFAULT == null ? postName != null : !POST_NAME_EDEFAULT.equals(postName);
			case LocnPackage.ADDRESS_TYPE__POST_CODE:
				return POST_CODE_EDEFAULT == null ? postCode != null : !POST_CODE_EDEFAULT.equals(postCode);
			case LocnPackage.ADDRESS_TYPE__ADMIN_UNIT_L1:
				return ADMIN_UNIT_L1_EDEFAULT == null ? adminUnitL1 != null : !ADMIN_UNIT_L1_EDEFAULT.equals(adminUnitL1);
			case LocnPackage.ADDRESS_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case LocnPackage.ADDRESS_TYPE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeID != null : !NODE_ID_EDEFAULT.equals(nodeID);
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
		result.append(" (thoroughfare: ");
		result.append(thoroughfare);
		result.append(", postName: ");
		result.append(postName);
		result.append(", postCode: ");
		result.append(postCode);
		result.append(", adminUnitL1: ");
		result.append(adminUnitL1);
		result.append(", about: ");
		result.append(about);
		result.append(", nodeID: ");
		result.append(nodeID);
		result.append(')');
		return result.toString();
	}

} //AddressTypeImpl
