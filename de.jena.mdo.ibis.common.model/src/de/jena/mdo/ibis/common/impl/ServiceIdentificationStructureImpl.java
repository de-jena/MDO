/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DeviceSpecificationStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceIdentificationStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Identification Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationStructureImpl#getService <em>Service</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationStructureImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceIdentificationStructureImpl extends MinimalEObjectImpl.Container implements ServiceIdentificationStructure {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected ServiceSpecificationStructure service;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected DeviceSpecificationStructure device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceIdentificationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getServiceIdentificationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationStructure getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceSpecificationStructure newService, NotificationChain msgs) {
		ServiceSpecificationStructure oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE, oldService, newService);
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
	public void setService(ServiceSpecificationStructure newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationStructure getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(DeviceSpecificationStructure newDevice, NotificationChain msgs) {
		DeviceSpecificationStructure oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE, oldDevice, newDevice);
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
	public void setDevice(DeviceSpecificationStructure newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE:
				return basicSetService(null, msgs);
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE:
				return basicSetDevice(null, msgs);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE:
				return getService();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE:
				return getDevice();
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE:
				setService((ServiceSpecificationStructure)newValue);
				return;
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE:
				setDevice((DeviceSpecificationStructure)newValue);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE:
				setService((ServiceSpecificationStructure)null);
				return;
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE:
				setDevice((DeviceSpecificationStructure)null);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__SERVICE:
				return service != null;
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE__DEVICE:
				return device != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceIdentificationStructureImpl
