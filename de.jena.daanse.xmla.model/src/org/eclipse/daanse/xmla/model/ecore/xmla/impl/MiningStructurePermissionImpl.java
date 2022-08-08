/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Structure Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructurePermissionImpl#isAllowDrillThrough <em>Allow Drill Through</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructurePermissionImpl#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningStructurePermissionImpl extends PermissionImpl implements MiningStructurePermission {
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
	 * The default value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected static final WriteType WRITE_EDEFAULT = WriteType.NONE;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected WriteType write = WRITE_EDEFAULT;

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
	protected MiningStructurePermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_STRUCTURE_PERMISSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE_PERMISSION__ALLOW_DRILL_THROUGH, oldAllowDrillThrough, allowDrillThrough, !oldAllowDrillThroughESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE_PERMISSION__ALLOW_DRILL_THROUGH, oldAllowDrillThrough, ALLOW_DRILL_THROUGH_EDEFAULT, oldAllowDrillThroughESet));
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
	public WriteType getWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(WriteType newWrite) {
		WriteType oldWrite = write;
		write = newWrite == null ? WRITE_EDEFAULT : newWrite;
		boolean oldWriteESet = writeESet;
		writeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE_PERMISSION__WRITE, oldWrite, write, !oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrite() {
		WriteType oldWrite = write;
		boolean oldWriteESet = writeESet;
		write = WRITE_EDEFAULT;
		writeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE_PERMISSION__WRITE, oldWrite, WRITE_EDEFAULT, oldWriteESet));
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__ALLOW_DRILL_THROUGH:
				return isAllowDrillThrough();
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__WRITE:
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__ALLOW_DRILL_THROUGH:
				setAllowDrillThrough((Boolean)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__WRITE:
				setWrite((WriteType)newValue);
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__ALLOW_DRILL_THROUGH:
				unsetAllowDrillThrough();
				return;
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__WRITE:
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__ALLOW_DRILL_THROUGH:
				return isSetAllowDrillThrough();
			case XmlaPackage.MINING_STRUCTURE_PERMISSION__WRITE:
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
		result.append(", write: ");
		if (writeESet) result.append(write); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MiningStructurePermissionImpl
