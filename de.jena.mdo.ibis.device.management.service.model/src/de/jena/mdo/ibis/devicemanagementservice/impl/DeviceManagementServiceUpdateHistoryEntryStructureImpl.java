/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.DataVersionListStructure;
import de.jena.mdo.ibis.common.IBISIPAnyURI;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Update History Entry Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl#getUpdateID <em>Update ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl#getUpdateTimestamp <em>Update Timestamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl#getUpdateURL <em>Update URL</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl#getUpdateStatus <em>Update Status</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl#getDataVersionList <em>Data Version List</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl#getUpdateDetails <em>Update Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceUpdateHistoryEntryStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceUpdateHistoryEntryStructure {
	/**
	 * The cached value of the '{@link #getUpdateID() <em>Update ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN updateID;

	/**
	 * The cached value of the '{@link #getUpdateTimestamp() <em>Update Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateTimestamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime updateTimestamp;

	/**
	 * The cached value of the '{@link #getUpdateURL() <em>Update URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateURL()
	 * @generated
	 * @ordered
	 */
	protected IBISIPAnyURI updateURL;

	/**
	 * The default value of the '{@link #getUpdateStatus() <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateStatus()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateStatusEnumeration UPDATE_STATUS_EDEFAULT = UpdateStatusEnumeration.UPDATE_RUNNING;

	/**
	 * The cached value of the '{@link #getUpdateStatus() <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateStatus()
	 * @generated
	 * @ordered
	 */
	protected UpdateStatusEnumeration updateStatus = UPDATE_STATUS_EDEFAULT;

	/**
	 * This is true if the Update Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateStatusESet;

	/**
	 * The cached value of the '{@link #getDataVersionList() <em>Data Version List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVersionList()
	 * @generated
	 * @ordered
	 */
	protected DataVersionListStructure dataVersionList;

	/**
	 * The cached value of the '{@link #getUpdateDetails() <em>Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDetails()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString updateDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceUpdateHistoryEntryStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getUpdateID() {
		return updateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateID(IBISIPNMTOKEN newUpdateID, NotificationChain msgs) {
		IBISIPNMTOKEN oldUpdateID = updateID;
		updateID = newUpdateID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID, oldUpdateID, newUpdateID);
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
	public void setUpdateID(IBISIPNMTOKEN newUpdateID) {
		if (newUpdateID != updateID) {
			NotificationChain msgs = null;
			if (updateID != null)
				msgs = ((InternalEObject)updateID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID, null, msgs);
			if (newUpdateID != null)
				msgs = ((InternalEObject)newUpdateID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID, null, msgs);
			msgs = basicSetUpdateID(newUpdateID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID, newUpdateID, newUpdateID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getUpdateTimestamp() {
		return updateTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateTimestamp(IBISIPDateTime newUpdateTimestamp, NotificationChain msgs) {
		IBISIPDateTime oldUpdateTimestamp = updateTimestamp;
		updateTimestamp = newUpdateTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP, oldUpdateTimestamp, newUpdateTimestamp);
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
	public void setUpdateTimestamp(IBISIPDateTime newUpdateTimestamp) {
		if (newUpdateTimestamp != updateTimestamp) {
			NotificationChain msgs = null;
			if (updateTimestamp != null)
				msgs = ((InternalEObject)updateTimestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP, null, msgs);
			if (newUpdateTimestamp != null)
				msgs = ((InternalEObject)newUpdateTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP, null, msgs);
			msgs = basicSetUpdateTimestamp(newUpdateTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP, newUpdateTimestamp, newUpdateTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPAnyURI getUpdateURL() {
		return updateURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateURL(IBISIPAnyURI newUpdateURL, NotificationChain msgs) {
		IBISIPAnyURI oldUpdateURL = updateURL;
		updateURL = newUpdateURL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL, oldUpdateURL, newUpdateURL);
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
	public void setUpdateURL(IBISIPAnyURI newUpdateURL) {
		if (newUpdateURL != updateURL) {
			NotificationChain msgs = null;
			if (updateURL != null)
				msgs = ((InternalEObject)updateURL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL, null, msgs);
			if (newUpdateURL != null)
				msgs = ((InternalEObject)newUpdateURL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL, null, msgs);
			msgs = basicSetUpdateURL(newUpdateURL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL, newUpdateURL, newUpdateURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateStatusEnumeration getUpdateStatus() {
		return updateStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateStatus(UpdateStatusEnumeration newUpdateStatus) {
		UpdateStatusEnumeration oldUpdateStatus = updateStatus;
		updateStatus = newUpdateStatus == null ? UPDATE_STATUS_EDEFAULT : newUpdateStatus;
		boolean oldUpdateStatusESet = updateStatusESet;
		updateStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS, oldUpdateStatus, updateStatus, !oldUpdateStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUpdateStatus() {
		UpdateStatusEnumeration oldUpdateStatus = updateStatus;
		boolean oldUpdateStatusESet = updateStatusESet;
		updateStatus = UPDATE_STATUS_EDEFAULT;
		updateStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS, oldUpdateStatus, UPDATE_STATUS_EDEFAULT, oldUpdateStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUpdateStatus() {
		return updateStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataVersionListStructure getDataVersionList() {
		return dataVersionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataVersionList(DataVersionListStructure newDataVersionList, NotificationChain msgs) {
		DataVersionListStructure oldDataVersionList = dataVersionList;
		dataVersionList = newDataVersionList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST, oldDataVersionList, newDataVersionList);
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
	public void setDataVersionList(DataVersionListStructure newDataVersionList) {
		if (newDataVersionList != dataVersionList) {
			NotificationChain msgs = null;
			if (dataVersionList != null)
				msgs = ((InternalEObject)dataVersionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST, null, msgs);
			if (newDataVersionList != null)
				msgs = ((InternalEObject)newDataVersionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST, null, msgs);
			msgs = basicSetDataVersionList(newDataVersionList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST, newDataVersionList, newDataVersionList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getUpdateDetails() {
		return updateDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateDetails(IBISIPString newUpdateDetails, NotificationChain msgs) {
		IBISIPString oldUpdateDetails = updateDetails;
		updateDetails = newUpdateDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS, oldUpdateDetails, newUpdateDetails);
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
	public void setUpdateDetails(IBISIPString newUpdateDetails) {
		if (newUpdateDetails != updateDetails) {
			NotificationChain msgs = null;
			if (updateDetails != null)
				msgs = ((InternalEObject)updateDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS, null, msgs);
			if (newUpdateDetails != null)
				msgs = ((InternalEObject)newUpdateDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS, null, msgs);
			msgs = basicSetUpdateDetails(newUpdateDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS, newUpdateDetails, newUpdateDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID:
				return basicSetUpdateID(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP:
				return basicSetUpdateTimestamp(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL:
				return basicSetUpdateURL(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST:
				return basicSetDataVersionList(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS:
				return basicSetUpdateDetails(null, msgs);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID:
				return getUpdateID();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP:
				return getUpdateTimestamp();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL:
				return getUpdateURL();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS:
				return getUpdateStatus();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST:
				return getDataVersionList();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS:
				return getUpdateDetails();
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID:
				setUpdateID((IBISIPNMTOKEN)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP:
				setUpdateTimestamp((IBISIPDateTime)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL:
				setUpdateURL((IBISIPAnyURI)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS:
				setUpdateStatus((UpdateStatusEnumeration)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST:
				setDataVersionList((DataVersionListStructure)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS:
				setUpdateDetails((IBISIPString)newValue);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID:
				setUpdateID((IBISIPNMTOKEN)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP:
				setUpdateTimestamp((IBISIPDateTime)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL:
				setUpdateURL((IBISIPAnyURI)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS:
				unsetUpdateStatus();
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST:
				setDataVersionList((DataVersionListStructure)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS:
				setUpdateDetails((IBISIPString)null);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID:
				return updateID != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP:
				return updateTimestamp != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL:
				return updateURL != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS:
				return isSetUpdateStatus();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST:
				return dataVersionList != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS:
				return updateDetails != null;
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
		result.append(" (updateStatus: ");
		if (updateStatusESet) result.append(updateStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceManagementServiceUpdateHistoryEntryStructureImpl