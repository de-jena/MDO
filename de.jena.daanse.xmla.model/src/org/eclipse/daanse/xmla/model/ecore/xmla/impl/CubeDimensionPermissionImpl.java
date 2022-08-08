/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType50;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReadType;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Dimension Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionPermissionImpl#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionPermissionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionPermissionImpl#getRead <em>Read</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionPermissionImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionPermissionImpl#getAttributePermissions <em>Attribute Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionPermissionImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeDimensionPermissionImpl extends MinimalEObjectImpl.Container implements CubeDimensionPermission {
	/**
	 * The default value of the '{@link #getCubeDimensionID() <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeDimensionID() <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String cubeDimensionID = CUBE_DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead()
	 * @generated
	 * @ordered
	 */
	protected static final ReadType READ_EDEFAULT = ReadType.NONE;

	/**
	 * The cached value of the '{@link #getRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead()
	 * @generated
	 * @ordered
	 */
	protected ReadType read = READ_EDEFAULT;

	/**
	 * This is true if the Read attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readESet;

	/**
	 * The default value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected static final WriteType6 WRITE_EDEFAULT = WriteType6.NONE;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected WriteType6 write = WRITE_EDEFAULT;

	/**
	 * This is true if the Write attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeESet;

	/**
	 * The cached value of the '{@link #getAttributePermissions() <em>Attribute Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePermissions()
	 * @generated
	 * @ordered
	 */
	protected AttributePermissionsType1 attributePermissions;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType50 annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeDimensionPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE_DIMENSION_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeDimensionID() {
		return cubeDimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeDimensionID(String newCubeDimensionID) {
		String oldCubeDimensionID = cubeDimensionID;
		cubeDimensionID = newCubeDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__CUBE_DIMENSION_ID, oldCubeDimensionID, cubeDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadType getRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead(ReadType newRead) {
		ReadType oldRead = read;
		read = newRead == null ? READ_EDEFAULT : newRead;
		boolean oldReadESet = readESet;
		readESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__READ, oldRead, read, !oldReadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRead() {
		ReadType oldRead = read;
		boolean oldReadESet = readESet;
		read = READ_EDEFAULT;
		readESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_DIMENSION_PERMISSION__READ, oldRead, READ_EDEFAULT, oldReadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRead() {
		return readESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType6 getWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(WriteType6 newWrite) {
		WriteType6 oldWrite = write;
		write = newWrite == null ? WRITE_EDEFAULT : newWrite;
		boolean oldWriteESet = writeESet;
		writeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__WRITE, oldWrite, write, !oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrite() {
		WriteType6 oldWrite = write;
		boolean oldWriteESet = writeESet;
		write = WRITE_EDEFAULT;
		writeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_DIMENSION_PERMISSION__WRITE, oldWrite, WRITE_EDEFAULT, oldWriteESet));
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
	public AttributePermissionsType1 getAttributePermissions() {
		return attributePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributePermissions(AttributePermissionsType1 newAttributePermissions, NotificationChain msgs) {
		AttributePermissionsType1 oldAttributePermissions = attributePermissions;
		attributePermissions = newAttributePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, oldAttributePermissions, newAttributePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributePermissions(AttributePermissionsType1 newAttributePermissions) {
		if (newAttributePermissions != attributePermissions) {
			NotificationChain msgs = null;
			if (attributePermissions != null)
				msgs = ((InternalEObject)attributePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, null, msgs);
			if (newAttributePermissions != null)
				msgs = ((InternalEObject)newAttributePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, null, msgs);
			msgs = basicSetAttributePermissions(newAttributePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS, newAttributePermissions, newAttributePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType50 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType50 newAnnotations, NotificationChain msgs) {
		AnnotationsType50 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType50 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				return basicSetAttributePermissions(null, msgs);
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__CUBE_DIMENSION_ID:
				return getCubeDimensionID();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__DESCRIPTION:
				return getDescription();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__READ:
				return getRead();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__WRITE:
				return getWrite();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				return getAttributePermissions();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS:
				return getAnnotations();
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
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__CUBE_DIMENSION_ID:
				setCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__READ:
				setRead((ReadType)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__WRITE:
				setWrite((WriteType6)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				setAttributePermissions((AttributePermissionsType1)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS:
				setAnnotations((AnnotationsType50)newValue);
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
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__CUBE_DIMENSION_ID:
				setCubeDimensionID(CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__READ:
				unsetRead();
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__WRITE:
				unsetWrite();
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				setAttributePermissions((AttributePermissionsType1)null);
				return;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS:
				setAnnotations((AnnotationsType50)null);
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
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__CUBE_DIMENSION_ID:
				return CUBE_DIMENSION_ID_EDEFAULT == null ? cubeDimensionID != null : !CUBE_DIMENSION_ID_EDEFAULT.equals(cubeDimensionID);
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__READ:
				return isSetRead();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__WRITE:
				return isSetWrite();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ATTRIBUTE_PERMISSIONS:
				return attributePermissions != null;
			case XmlaPackage.CUBE_DIMENSION_PERMISSION__ANNOTATIONS:
				return annotations != null;
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
		result.append(" (cubeDimensionID: ");
		result.append(cubeDimensionID);
		result.append(", description: ");
		result.append(description);
		result.append(", read: ");
		if (readESet) result.append(read); else result.append("<unset>");
		result.append(", write: ");
		if (writeESet) result.append(write); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CubeDimensionPermissionImpl
