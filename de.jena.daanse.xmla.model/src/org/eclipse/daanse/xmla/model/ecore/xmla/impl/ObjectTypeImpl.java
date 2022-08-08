/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectTypeImpl#getDatabaseID <em>Database ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypeImpl extends MinimalEObjectImpl.Container implements ObjectType {
	/**
	 * The cached value of the '{@link #getDatabaseID() <em>Database ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected ObjectReference databaseID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference getDatabaseID() {
		return databaseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseID(ObjectReference newDatabaseID, NotificationChain msgs) {
		ObjectReference oldDatabaseID = databaseID;
		databaseID = newDatabaseID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_TYPE__DATABASE_ID, oldDatabaseID, newDatabaseID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseID(ObjectReference newDatabaseID) {
		if (newDatabaseID != databaseID) {
			NotificationChain msgs = null;
			if (databaseID != null)
				msgs = ((InternalEObject)databaseID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OBJECT_TYPE__DATABASE_ID, null, msgs);
			if (newDatabaseID != null)
				msgs = ((InternalEObject)newDatabaseID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OBJECT_TYPE__DATABASE_ID, null, msgs);
			msgs = basicSetDatabaseID(newDatabaseID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_TYPE__DATABASE_ID, newDatabaseID, newDatabaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.OBJECT_TYPE__DATABASE_ID:
				return basicSetDatabaseID(null, msgs);
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
			case XmlaPackage.OBJECT_TYPE__DATABASE_ID:
				return getDatabaseID();
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
			case XmlaPackage.OBJECT_TYPE__DATABASE_ID:
				setDatabaseID((ObjectReference)newValue);
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
			case XmlaPackage.OBJECT_TYPE__DATABASE_ID:
				setDatabaseID((ObjectReference)null);
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
			case XmlaPackage.OBJECT_TYPE__DATABASE_ID:
				return databaseID != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectTypeImpl
