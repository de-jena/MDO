/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly;
import org.eclipse.daanse.xmla.model.ecore.xmla.FilesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PermissionSetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clr Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ClrAssemblyImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ClrAssemblyImpl#getPermissionSet <em>Permission Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClrAssemblyImpl extends AssemblyImpl implements ClrAssembly {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected FilesType files;

	/**
	 * The default value of the '{@link #getPermissionSet() <em>Permission Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionSet()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionSetType PERMISSION_SET_EDEFAULT = PermissionSetType.SAFE;

	/**
	 * The cached value of the '{@link #getPermissionSet() <em>Permission Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionSet()
	 * @generated
	 * @ordered
	 */
	protected PermissionSetType permissionSet = PERMISSION_SET_EDEFAULT;

	/**
	 * This is true if the Permission Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permissionSetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClrAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CLR_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesType getFiles() {
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiles(FilesType newFiles, NotificationChain msgs) {
		FilesType oldFiles = files;
		files = newFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CLR_ASSEMBLY__FILES, oldFiles, newFiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiles(FilesType newFiles) {
		if (newFiles != files) {
			NotificationChain msgs = null;
			if (files != null)
				msgs = ((InternalEObject)files).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CLR_ASSEMBLY__FILES, null, msgs);
			if (newFiles != null)
				msgs = ((InternalEObject)newFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CLR_ASSEMBLY__FILES, null, msgs);
			msgs = basicSetFiles(newFiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CLR_ASSEMBLY__FILES, newFiles, newFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionSetType getPermissionSet() {
		return permissionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissionSet(PermissionSetType newPermissionSet) {
		PermissionSetType oldPermissionSet = permissionSet;
		permissionSet = newPermissionSet == null ? PERMISSION_SET_EDEFAULT : newPermissionSet;
		boolean oldPermissionSetESet = permissionSetESet;
		permissionSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CLR_ASSEMBLY__PERMISSION_SET, oldPermissionSet, permissionSet, !oldPermissionSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPermissionSet() {
		PermissionSetType oldPermissionSet = permissionSet;
		boolean oldPermissionSetESet = permissionSetESet;
		permissionSet = PERMISSION_SET_EDEFAULT;
		permissionSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CLR_ASSEMBLY__PERMISSION_SET, oldPermissionSet, PERMISSION_SET_EDEFAULT, oldPermissionSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPermissionSet() {
		return permissionSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CLR_ASSEMBLY__FILES:
				return basicSetFiles(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.CLR_ASSEMBLY__FILES:
				return getFiles();
			case XmlaPackage.CLR_ASSEMBLY__PERMISSION_SET:
				return getPermissionSet();
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
			case XmlaPackage.CLR_ASSEMBLY__FILES:
				setFiles((FilesType)newValue);
				return;
			case XmlaPackage.CLR_ASSEMBLY__PERMISSION_SET:
				setPermissionSet((PermissionSetType)newValue);
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
			case XmlaPackage.CLR_ASSEMBLY__FILES:
				setFiles((FilesType)null);
				return;
			case XmlaPackage.CLR_ASSEMBLY__PERMISSION_SET:
				unsetPermissionSet();
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
			case XmlaPackage.CLR_ASSEMBLY__FILES:
				return files != null;
			case XmlaPackage.CLR_ASSEMBLY__PERMISSION_SET:
				return isSetPermissionSet();
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
		result.append(" (permissionSet: ");
		if (permissionSetESet) result.append(permissionSet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClrAssemblyImpl
