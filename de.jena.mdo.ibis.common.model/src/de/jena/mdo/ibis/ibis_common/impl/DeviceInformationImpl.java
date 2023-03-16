/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DataVersionList;
import de.jena.mdo.ibis.ibis_common.DeviceInformation;
import de.jena.mdo.ibis.ibis_common.IBISIPAnyURI;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl#getDeviceClass <em>Device Class</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl#getDataVersionList <em>Data Version List</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl#getWebInterfaceAddress <em>Web Interface Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceInformationImpl extends MinimalEObjectImpl.Container implements DeviceInformation {
	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString deviceName;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString manufacturer;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN serialNumber;

	/**
	 * The default value of the '{@link #getDeviceClass() <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceClass()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceClassEnumeration DEVICE_CLASS_EDEFAULT = DeviceClassEnumeration.ON_BOARD_UNIT;

	/**
	 * The cached value of the '{@link #getDeviceClass() <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceClass()
	 * @generated
	 * @ordered
	 */
	protected DeviceClassEnumeration deviceClass = DEVICE_CLASS_EDEFAULT;

	/**
	 * This is true if the Device Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceClassESet;

	/**
	 * The cached value of the '{@link #getDataVersionList() <em>Data Version List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVersionList()
	 * @generated
	 * @ordered
	 */
	protected DataVersionList dataVersionList;

	/**
	 * The cached value of the '{@link #getWebInterfaceAddress() <em>Web Interface Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebInterfaceAddress()
	 * @generated
	 * @ordered
	 */
	protected IBISIPAnyURI webInterfaceAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DEVICE_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceName(IBISIPString newDeviceName, NotificationChain msgs) {
		IBISIPString oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME, oldDeviceName, newDeviceName);
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
	public void setDeviceName(IBISIPString newDeviceName) {
		if (newDeviceName != deviceName) {
			NotificationChain msgs = null;
			if (deviceName != null)
				msgs = ((InternalEObject)deviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME, null, msgs);
			if (newDeviceName != null)
				msgs = ((InternalEObject)newDeviceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME, null, msgs);
			msgs = basicSetDeviceName(newDeviceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME, newDeviceName, newDeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(IBISIPString newManufacturer, NotificationChain msgs) {
		IBISIPString oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(IBISIPString newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialNumber(IBISIPNMTOKEN newSerialNumber, NotificationChain msgs) {
		IBISIPNMTOKEN oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER, oldSerialNumber, newSerialNumber);
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
	public void setSerialNumber(IBISIPNMTOKEN newSerialNumber) {
		if (newSerialNumber != serialNumber) {
			NotificationChain msgs = null;
			if (serialNumber != null)
				msgs = ((InternalEObject)serialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER, null, msgs);
			if (newSerialNumber != null)
				msgs = ((InternalEObject)newSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER, null, msgs);
			msgs = basicSetSerialNumber(newSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER, newSerialNumber, newSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceClassEnumeration getDeviceClass() {
		return deviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceClass(DeviceClassEnumeration newDeviceClass) {
		DeviceClassEnumeration oldDeviceClass = deviceClass;
		deviceClass = newDeviceClass == null ? DEVICE_CLASS_EDEFAULT : newDeviceClass;
		boolean oldDeviceClassESet = deviceClassESet;
		deviceClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__DEVICE_CLASS, oldDeviceClass, deviceClass, !oldDeviceClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceClass() {
		DeviceClassEnumeration oldDeviceClass = deviceClass;
		boolean oldDeviceClassESet = deviceClassESet;
		deviceClass = DEVICE_CLASS_EDEFAULT;
		deviceClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.DEVICE_INFORMATION__DEVICE_CLASS, oldDeviceClass, DEVICE_CLASS_EDEFAULT, oldDeviceClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceClass() {
		return deviceClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataVersionList getDataVersionList() {
		return dataVersionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataVersionList(DataVersionList newDataVersionList, NotificationChain msgs) {
		DataVersionList oldDataVersionList = dataVersionList;
		dataVersionList = newDataVersionList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST, oldDataVersionList, newDataVersionList);
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
	public void setDataVersionList(DataVersionList newDataVersionList) {
		if (newDataVersionList != dataVersionList) {
			NotificationChain msgs = null;
			if (dataVersionList != null)
				msgs = ((InternalEObject)dataVersionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST, null, msgs);
			if (newDataVersionList != null)
				msgs = ((InternalEObject)newDataVersionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST, null, msgs);
			msgs = basicSetDataVersionList(newDataVersionList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST, newDataVersionList, newDataVersionList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPAnyURI getWebInterfaceAddress() {
		return webInterfaceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebInterfaceAddress(IBISIPAnyURI newWebInterfaceAddress, NotificationChain msgs) {
		IBISIPAnyURI oldWebInterfaceAddress = webInterfaceAddress;
		webInterfaceAddress = newWebInterfaceAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS, oldWebInterfaceAddress, newWebInterfaceAddress);
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
	public void setWebInterfaceAddress(IBISIPAnyURI newWebInterfaceAddress) {
		if (newWebInterfaceAddress != webInterfaceAddress) {
			NotificationChain msgs = null;
			if (webInterfaceAddress != null)
				msgs = ((InternalEObject)webInterfaceAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS, null, msgs);
			if (newWebInterfaceAddress != null)
				msgs = ((InternalEObject)newWebInterfaceAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS, null, msgs);
			msgs = basicSetWebInterfaceAddress(newWebInterfaceAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS, newWebInterfaceAddress, newWebInterfaceAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME:
				return basicSetDeviceName(null, msgs);
			case IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER:
				return basicSetSerialNumber(null, msgs);
			case IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST:
				return basicSetDataVersionList(null, msgs);
			case IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS:
				return basicSetWebInterfaceAddress(null, msgs);
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
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME:
				return getDeviceName();
			case IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER:
				return getManufacturer();
			case IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER:
				return getSerialNumber();
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_CLASS:
				return getDeviceClass();
			case IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST:
				return getDataVersionList();
			case IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS:
				return getWebInterfaceAddress();
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
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME:
				setDeviceName((IBISIPString)newValue);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER:
				setManufacturer((IBISIPString)newValue);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER:
				setSerialNumber((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_CLASS:
				setDeviceClass((DeviceClassEnumeration)newValue);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST:
				setDataVersionList((DataVersionList)newValue);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS:
				setWebInterfaceAddress((IBISIPAnyURI)newValue);
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
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME:
				setDeviceName((IBISIPString)null);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER:
				setManufacturer((IBISIPString)null);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER:
				setSerialNumber((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_CLASS:
				unsetDeviceClass();
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST:
				setDataVersionList((DataVersionList)null);
				return;
			case IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS:
				setWebInterfaceAddress((IBISIPAnyURI)null);
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
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_NAME:
				return deviceName != null;
			case IbisCommonPackage.DEVICE_INFORMATION__MANUFACTURER:
				return manufacturer != null;
			case IbisCommonPackage.DEVICE_INFORMATION__SERIAL_NUMBER:
				return serialNumber != null;
			case IbisCommonPackage.DEVICE_INFORMATION__DEVICE_CLASS:
				return isSetDeviceClass();
			case IbisCommonPackage.DEVICE_INFORMATION__DATA_VERSION_LIST:
				return dataVersionList != null;
			case IbisCommonPackage.DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS:
				return webInterfaceAddress != null;
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
		result.append(" (deviceClass: ");
		if (deviceClassESet) result.append(deviceClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceInformationImpl
