/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incremental Processing Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.IncrementalProcessingNotificationImpl#getTableID <em>Table ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.IncrementalProcessingNotificationImpl#getProcessingQuery <em>Processing Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncrementalProcessingNotificationImpl extends MinimalEObjectImpl.Container implements IncrementalProcessingNotification {
	/**
	 * The default value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected String tableID = TABLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingQuery() <em>Processing Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSING_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessingQuery() <em>Processing Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingQuery()
	 * @generated
	 * @ordered
	 */
	protected String processingQuery = PROCESSING_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncrementalProcessingNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.INCREMENTAL_PROCESSING_NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableID() {
		return tableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableID(String newTableID) {
		String oldTableID = tableID;
		tableID = newTableID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__TABLE_ID, oldTableID, tableID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessingQuery() {
		return processingQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingQuery(String newProcessingQuery) {
		String oldProcessingQuery = processingQuery;
		processingQuery = newProcessingQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__PROCESSING_QUERY, oldProcessingQuery, processingQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__TABLE_ID:
				return getTableID();
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__PROCESSING_QUERY:
				return getProcessingQuery();
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__TABLE_ID:
				setTableID((String)newValue);
				return;
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__PROCESSING_QUERY:
				setProcessingQuery((String)newValue);
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__TABLE_ID:
				setTableID(TABLE_ID_EDEFAULT);
				return;
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__PROCESSING_QUERY:
				setProcessingQuery(PROCESSING_QUERY_EDEFAULT);
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__TABLE_ID:
				return TABLE_ID_EDEFAULT == null ? tableID != null : !TABLE_ID_EDEFAULT.equals(tableID);
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION__PROCESSING_QUERY:
				return PROCESSING_QUERY_EDEFAULT == null ? processingQuery != null : !PROCESSING_QUERY_EDEFAULT.equals(processingQuery);
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
		result.append(" (tableID: ");
		result.append(tableID);
		result.append(", processingQuery: ");
		result.append(processingQuery);
		result.append(')');
		return result.toString();
	}

} //IncrementalProcessingNotificationImpl
