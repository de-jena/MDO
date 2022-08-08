/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Model Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelPermissionImpl#isAllowDrillThrough <em>Allow Drill Through</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelPermissionImpl#isAllowBrowsing <em>Allow Browsing</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelPermissionImpl#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningModelPermissionImpl extends PermissionImpl implements MiningModelPermission {
	/**
	 * The default value of the '{@link #isAllowDrillThrough() <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDrillThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DRILL_THROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowDrillThrough() <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDrillThrough()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDrillThrough = ALLOW_DRILL_THROUGH_EDEFAULT;

	/**
	 * This is true if the Allow Drill Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowDrillThroughESet;

	/**
	 * The default value of the '{@link #isAllowBrowsing() <em>Allow Browsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBrowsing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_BROWSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowBrowsing() <em>Allow Browsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBrowsing()
	 * @generated
	 * @ordered
	 */
	protected boolean allowBrowsing = ALLOW_BROWSING_EDEFAULT;

	/**
	 * This is true if the Allow Browsing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowBrowsingESet;

	/**
	 * The default value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected static final WriteType2 WRITE_EDEFAULT = WriteType2.NONE;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected WriteType2 write = WRITE_EDEFAULT;

	/**
	 * This is true if the Write attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModelPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_MODEL_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowDrillThrough() {
		return allowDrillThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDrillThrough(boolean newAllowDrillThrough) {
		boolean oldAllowDrillThrough = allowDrillThrough;
		allowDrillThrough = newAllowDrillThrough;
		boolean oldAllowDrillThroughESet = allowDrillThroughESet;
		allowDrillThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_DRILL_THROUGH, oldAllowDrillThrough, allowDrillThrough, !oldAllowDrillThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowDrillThrough() {
		boolean oldAllowDrillThrough = allowDrillThrough;
		boolean oldAllowDrillThroughESet = allowDrillThroughESet;
		allowDrillThrough = ALLOW_DRILL_THROUGH_EDEFAULT;
		allowDrillThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_DRILL_THROUGH, oldAllowDrillThrough, ALLOW_DRILL_THROUGH_EDEFAULT, oldAllowDrillThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowDrillThrough() {
		return allowDrillThroughESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowBrowsing() {
		return allowBrowsing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowBrowsing(boolean newAllowBrowsing) {
		boolean oldAllowBrowsing = allowBrowsing;
		allowBrowsing = newAllowBrowsing;
		boolean oldAllowBrowsingESet = allowBrowsingESet;
		allowBrowsingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_BROWSING, oldAllowBrowsing, allowBrowsing, !oldAllowBrowsingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowBrowsing() {
		boolean oldAllowBrowsing = allowBrowsing;
		boolean oldAllowBrowsingESet = allowBrowsingESet;
		allowBrowsing = ALLOW_BROWSING_EDEFAULT;
		allowBrowsingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_BROWSING, oldAllowBrowsing, ALLOW_BROWSING_EDEFAULT, oldAllowBrowsingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowBrowsing() {
		return allowBrowsingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType2 getWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(WriteType2 newWrite) {
		WriteType2 oldWrite = write;
		write = newWrite == null ? WRITE_EDEFAULT : newWrite;
		boolean oldWriteESet = writeESet;
		writeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_PERMISSION__WRITE, oldWrite, write, !oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrite() {
		WriteType2 oldWrite = write;
		boolean oldWriteESet = writeESet;
		write = WRITE_EDEFAULT;
		writeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL_PERMISSION__WRITE, oldWrite, WRITE_EDEFAULT, oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrite() {
		return writeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_DRILL_THROUGH:
				return isAllowDrillThrough();
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_BROWSING:
				return isAllowBrowsing();
			case XmlaPackage.MINING_MODEL_PERMISSION__WRITE:
				return getWrite();
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
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_DRILL_THROUGH:
				setAllowDrillThrough((Boolean)newValue);
				return;
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_BROWSING:
				setAllowBrowsing((Boolean)newValue);
				return;
			case XmlaPackage.MINING_MODEL_PERMISSION__WRITE:
				setWrite((WriteType2)newValue);
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
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_DRILL_THROUGH:
				unsetAllowDrillThrough();
				return;
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_BROWSING:
				unsetAllowBrowsing();
				return;
			case XmlaPackage.MINING_MODEL_PERMISSION__WRITE:
				unsetWrite();
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
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_DRILL_THROUGH:
				return isSetAllowDrillThrough();
			case XmlaPackage.MINING_MODEL_PERMISSION__ALLOW_BROWSING:
				return isSetAllowBrowsing();
			case XmlaPackage.MINING_MODEL_PERMISSION__WRITE:
				return isSetWrite();
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
		result.append(" (allowDrillThrough: ");
		if (allowDrillThroughESet) result.append(allowDrillThrough); else result.append("<unset>");
		result.append(", allowBrowsing: ");
		if (allowBrowsingESet) result.append(allowBrowsing); else result.append("<unset>");
		result.append(", write: ");
		if (writeESet) result.append(write); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MiningModelPermissionImpl
