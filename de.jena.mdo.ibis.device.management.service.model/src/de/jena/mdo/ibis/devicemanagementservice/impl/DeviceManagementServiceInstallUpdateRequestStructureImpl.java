/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPAnyURI;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPUnsignedLong;

import de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Install Update Request Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl#getUpdateID <em>Update ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl#getUpdateTimestamp <em>Update Timestamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl#getUpdateURL <em>Update URL</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl#getUpdateFileChecksum <em>Update File Checksum</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl#getUpdateFileSize <em>Update File Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceInstallUpdateRequestStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceInstallUpdateRequestStructure {
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
	 * The cached value of the '{@link #getUpdateFileChecksum() <em>Update File Checksum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateFileChecksum()
	 * @generated
	 * @ordered
	 */
	protected ChecksumStructure updateFileChecksum;

	/**
	 * The cached value of the '{@link #getUpdateFileSize() <em>Update File Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateFileSize()
	 * @generated
	 * @ordered
	 */
	protected IBISIPUnsignedLong updateFileSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceInstallUpdateRequestStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID, oldUpdateID, newUpdateID);
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
				msgs = ((InternalEObject)updateID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID, null, msgs);
			if (newUpdateID != null)
				msgs = ((InternalEObject)newUpdateID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID, null, msgs);
			msgs = basicSetUpdateID(newUpdateID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID, newUpdateID, newUpdateID));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP, oldUpdateTimestamp, newUpdateTimestamp);
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
				msgs = ((InternalEObject)updateTimestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP, null, msgs);
			if (newUpdateTimestamp != null)
				msgs = ((InternalEObject)newUpdateTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP, null, msgs);
			msgs = basicSetUpdateTimestamp(newUpdateTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP, newUpdateTimestamp, newUpdateTimestamp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL, oldUpdateURL, newUpdateURL);
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
				msgs = ((InternalEObject)updateURL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL, null, msgs);
			if (newUpdateURL != null)
				msgs = ((InternalEObject)newUpdateURL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL, null, msgs);
			msgs = basicSetUpdateURL(newUpdateURL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL, newUpdateURL, newUpdateURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChecksumStructure getUpdateFileChecksum() {
		return updateFileChecksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateFileChecksum(ChecksumStructure newUpdateFileChecksum, NotificationChain msgs) {
		ChecksumStructure oldUpdateFileChecksum = updateFileChecksum;
		updateFileChecksum = newUpdateFileChecksum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM, oldUpdateFileChecksum, newUpdateFileChecksum);
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
	public void setUpdateFileChecksum(ChecksumStructure newUpdateFileChecksum) {
		if (newUpdateFileChecksum != updateFileChecksum) {
			NotificationChain msgs = null;
			if (updateFileChecksum != null)
				msgs = ((InternalEObject)updateFileChecksum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM, null, msgs);
			if (newUpdateFileChecksum != null)
				msgs = ((InternalEObject)newUpdateFileChecksum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM, null, msgs);
			msgs = basicSetUpdateFileChecksum(newUpdateFileChecksum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM, newUpdateFileChecksum, newUpdateFileChecksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedLong getUpdateFileSize() {
		return updateFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateFileSize(IBISIPUnsignedLong newUpdateFileSize, NotificationChain msgs) {
		IBISIPUnsignedLong oldUpdateFileSize = updateFileSize;
		updateFileSize = newUpdateFileSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE, oldUpdateFileSize, newUpdateFileSize);
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
	public void setUpdateFileSize(IBISIPUnsignedLong newUpdateFileSize) {
		if (newUpdateFileSize != updateFileSize) {
			NotificationChain msgs = null;
			if (updateFileSize != null)
				msgs = ((InternalEObject)updateFileSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE, null, msgs);
			if (newUpdateFileSize != null)
				msgs = ((InternalEObject)newUpdateFileSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE, null, msgs);
			msgs = basicSetUpdateFileSize(newUpdateFileSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE, newUpdateFileSize, newUpdateFileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID:
				return basicSetUpdateID(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP:
				return basicSetUpdateTimestamp(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL:
				return basicSetUpdateURL(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM:
				return basicSetUpdateFileChecksum(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE:
				return basicSetUpdateFileSize(null, msgs);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID:
				return getUpdateID();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP:
				return getUpdateTimestamp();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL:
				return getUpdateURL();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM:
				return getUpdateFileChecksum();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE:
				return getUpdateFileSize();
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID:
				setUpdateID((IBISIPNMTOKEN)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP:
				setUpdateTimestamp((IBISIPDateTime)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL:
				setUpdateURL((IBISIPAnyURI)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM:
				setUpdateFileChecksum((ChecksumStructure)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE:
				setUpdateFileSize((IBISIPUnsignedLong)newValue);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID:
				setUpdateID((IBISIPNMTOKEN)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP:
				setUpdateTimestamp((IBISIPDateTime)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL:
				setUpdateURL((IBISIPAnyURI)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM:
				setUpdateFileChecksum((ChecksumStructure)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE:
				setUpdateFileSize((IBISIPUnsignedLong)null);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID:
				return updateID != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP:
				return updateTimestamp != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL:
				return updateURL != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM:
				return updateFileChecksum != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE:
				return updateFileSize != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceInstallUpdateRequestStructureImpl
