/**
 */
package org.w3.ns.dcat.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.ns.dcat.CatalogRecord;
import org.w3.ns.dcat.CatalogRecordType;
import org.w3.ns.dcat.DcatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordImpl#getCatalogRecord <em>Catalog Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogRecordImpl extends MinimalEObjectImpl.Container implements CatalogRecord {
	/**
	 * The cached value of the '{@link #getCatalogRecord() <em>Catalog Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogRecord()
	 * @generated
	 * @ordered
	 */
	protected CatalogRecordType catalogRecord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.CATALOG_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogRecordType getCatalogRecord() {
		return catalogRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogRecord(CatalogRecordType newCatalogRecord, NotificationChain msgs) {
		CatalogRecordType oldCatalogRecord = catalogRecord;
		catalogRecord = newCatalogRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD__CATALOG_RECORD, oldCatalogRecord, newCatalogRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogRecord(CatalogRecordType newCatalogRecord) {
		if (newCatalogRecord != catalogRecord) {
			NotificationChain msgs = null;
			if (catalogRecord != null)
				msgs = ((InternalEObject)catalogRecord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD__CATALOG_RECORD, null, msgs);
			if (newCatalogRecord != null)
				msgs = ((InternalEObject)newCatalogRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD__CATALOG_RECORD, null, msgs);
			msgs = basicSetCatalogRecord(newCatalogRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD__CATALOG_RECORD, newCatalogRecord, newCatalogRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.CATALOG_RECORD__CATALOG_RECORD:
				return basicSetCatalogRecord(null, msgs);
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
			case DcatPackage.CATALOG_RECORD__CATALOG_RECORD:
				return getCatalogRecord();
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
			case DcatPackage.CATALOG_RECORD__CATALOG_RECORD:
				setCatalogRecord((CatalogRecordType)newValue);
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
			case DcatPackage.CATALOG_RECORD__CATALOG_RECORD:
				setCatalogRecord((CatalogRecordType)null);
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
			case DcatPackage.CATALOG_RECORD__CATALOG_RECORD:
				return catalogRecord != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogRecordImpl
