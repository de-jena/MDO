/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabasePermissionImpl#isAdminister <em>Administer</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabasePermissionImpl#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabasePermissionImpl extends PermissionImpl implements DatabasePermission {
	/**
	 * The default value of the '{@link #isAdminister() <em>Administer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminister()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADMINISTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdminister() <em>Administer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminister()
	 * @generated
	 * @ordered
	 */
	protected boolean administer = ADMINISTER_EDEFAULT;

	/**
	 * This is true if the Administer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean administerESet;

	/**
	 * The default value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected static final WriteType4 WRITE_EDEFAULT = WriteType4.NONE;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected WriteType4 write = WRITE_EDEFAULT;

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
	protected DatabasePermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATABASE_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdminister() {
		return administer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminister(boolean newAdminister) {
		boolean oldAdminister = administer;
		administer = newAdminister;
		boolean oldAdministerESet = administerESet;
		administerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE_PERMISSION__ADMINISTER, oldAdminister, administer, !oldAdministerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdminister() {
		boolean oldAdminister = administer;
		boolean oldAdministerESet = administerESet;
		administer = ADMINISTER_EDEFAULT;
		administerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE_PERMISSION__ADMINISTER, oldAdminister, ADMINISTER_EDEFAULT, oldAdministerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdminister() {
		return administerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType4 getWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(WriteType4 newWrite) {
		WriteType4 oldWrite = write;
		write = newWrite == null ? WRITE_EDEFAULT : newWrite;
		boolean oldWriteESet = writeESet;
		writeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE_PERMISSION__WRITE, oldWrite, write, !oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrite() {
		WriteType4 oldWrite = write;
		boolean oldWriteESet = writeESet;
		write = WRITE_EDEFAULT;
		writeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE_PERMISSION__WRITE, oldWrite, WRITE_EDEFAULT, oldWriteESet));
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
			case XmlaPackage.DATABASE_PERMISSION__ADMINISTER:
				return isAdminister();
			case XmlaPackage.DATABASE_PERMISSION__WRITE:
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
			case XmlaPackage.DATABASE_PERMISSION__ADMINISTER:
				setAdminister((Boolean)newValue);
				return;
			case XmlaPackage.DATABASE_PERMISSION__WRITE:
				setWrite((WriteType4)newValue);
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
			case XmlaPackage.DATABASE_PERMISSION__ADMINISTER:
				unsetAdminister();
				return;
			case XmlaPackage.DATABASE_PERMISSION__WRITE:
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
			case XmlaPackage.DATABASE_PERMISSION__ADMINISTER:
				return isSetAdminister();
			case XmlaPackage.DATABASE_PERMISSION__WRITE:
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
		result.append(" (administer: ");
		if (administerESet) result.append(administer); else result.append("<unset>");
		result.append(", write: ");
		if (writeESet) result.append(write); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DatabasePermissionImpl
