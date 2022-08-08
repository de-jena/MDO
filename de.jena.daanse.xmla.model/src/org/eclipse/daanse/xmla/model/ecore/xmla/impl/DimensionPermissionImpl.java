/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionPermissionImpl#getAttributePermissions <em>Attribute Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionPermissionImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionPermissionImpl#getAllowedRowsExpression <em>Allowed Rows Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionPermissionImpl extends PermissionImpl implements DimensionPermission {
	/**
	 * The cached value of the '{@link #getAttributePermissions() <em>Attribute Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePermissions()
	 * @generated
	 * @ordered
	 */
	protected AttributePermissionsType attributePermissions;

	/**
	 * The default value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected static final WriteType1 WRITE_EDEFAULT = WriteType1.NONE;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected WriteType1 write = WRITE_EDEFAULT;

	/**
	 * This is true if the Write attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeESet;

	/**
	 * The default value of the '{@link #getAllowedRowsExpression() <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedRowsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_ROWS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedRowsExpression() <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedRowsExpression()
	 * @generated
	 * @ordered
	 */
	protected String allowedRowsExpression = ALLOWED_ROWS_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DIMENSION_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePermissionsType getAttributePermissions() {
		return attributePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributePermissions(AttributePermissionsType newAttributePermissions, NotificationChain msgs) {
		AttributePermissionsType oldAttributePermissions = attributePermissions;
		attributePermissions = newAttributePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, oldAttributePermissions, newAttributePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributePermissions(AttributePermissionsType newAttributePermissions) {
		if (newAttributePermissions != attributePermissions) {
			NotificationChain msgs = null;
			if (attributePermissions != null)
				msgs = ((InternalEObject)attributePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, null, msgs);
			if (newAttributePermissions != null)
				msgs = ((InternalEObject)newAttributePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, null, msgs);
			msgs = basicSetAttributePermissions(newAttributePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, newAttributePermissions, newAttributePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType1 getWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(WriteType1 newWrite) {
		WriteType1 oldWrite = write;
		write = newWrite == null ? WRITE_EDEFAULT : newWrite;
		boolean oldWriteESet = writeESet;
		writeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_PERMISSION__WRITE, oldWrite, write, !oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrite() {
		WriteType1 oldWrite = write;
		boolean oldWriteESet = writeESet;
		write = WRITE_EDEFAULT;
		writeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_PERMISSION__WRITE, oldWrite, WRITE_EDEFAULT, oldWriteESet));
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
	public String getAllowedRowsExpression() {
		return allowedRowsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedRowsExpression(String newAllowedRowsExpression) {
		String oldAllowedRowsExpression = allowedRowsExpression;
		allowedRowsExpression = newAllowedRowsExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_PERMISSION__ALLOWED_ROWS_EXPRESSION, oldAllowedRowsExpression, allowedRowsExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				return basicSetAttributePermissions(null, msgs);
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
			case XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				return getAttributePermissions();
			case XmlaPackage.DIMENSION_PERMISSION__WRITE:
				return getWrite();
			case XmlaPackage.DIMENSION_PERMISSION__ALLOWED_ROWS_EXPRESSION:
				return getAllowedRowsExpression();
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
			case XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				setAttributePermissions((AttributePermissionsType)newValue);
				return;
			case XmlaPackage.DIMENSION_PERMISSION__WRITE:
				setWrite((WriteType1)newValue);
				return;
			case XmlaPackage.DIMENSION_PERMISSION__ALLOWED_ROWS_EXPRESSION:
				setAllowedRowsExpression((String)newValue);
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
			case XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				setAttributePermissions((AttributePermissionsType)null);
				return;
			case XmlaPackage.DIMENSION_PERMISSION__WRITE:
				unsetWrite();
				return;
			case XmlaPackage.DIMENSION_PERMISSION__ALLOWED_ROWS_EXPRESSION:
				setAllowedRowsExpression(ALLOWED_ROWS_EXPRESSION_EDEFAULT);
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
			case XmlaPackage.DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				return attributePermissions != null;
			case XmlaPackage.DIMENSION_PERMISSION__WRITE:
				return isSetWrite();
			case XmlaPackage.DIMENSION_PERMISSION__ALLOWED_ROWS_EXPRESSION:
				return ALLOWED_ROWS_EXPRESSION_EDEFAULT == null ? allowedRowsExpression != null : !ALLOWED_ROWS_EXPRESSION_EDEFAULT.equals(allowedRowsExpression);
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
		result.append(" (write: ");
		if (writeESet) result.append(write); else result.append("<unset>");
		result.append(", allowedRowsExpression: ");
		result.append(allowedRowsExpression);
		result.append(')');
		return result.toString();
	}

} //DimensionPermissionImpl
