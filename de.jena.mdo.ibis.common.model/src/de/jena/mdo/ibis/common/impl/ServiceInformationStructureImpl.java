/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPBoolean;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceInformationStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceInformationStructureImpl#getService <em>Service</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceInformationStructureImpl#getAutostart <em>Autostart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInformationStructureImpl extends MinimalEObjectImpl.Container implements ServiceInformationStructure {
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
	 * The cached value of the '{@link #getAutostart() <em>Autostart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutostart()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean autostart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getServiceInformationStructure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE, oldService, newService);
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
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getAutostart() {
		return autostart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutostart(IBISIPBoolean newAutostart, NotificationChain msgs) {
		IBISIPBoolean oldAutostart = autostart;
		autostart = newAutostart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART, oldAutostart, newAutostart);
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
	public void setAutostart(IBISIPBoolean newAutostart) {
		if (newAutostart != autostart) {
			NotificationChain msgs = null;
			if (autostart != null)
				msgs = ((InternalEObject)autostart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART, null, msgs);
			if (newAutostart != null)
				msgs = ((InternalEObject)newAutostart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART, null, msgs);
			msgs = basicSetAutostart(newAutostart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART, newAutostart, newAutostart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE:
				return basicSetService(null, msgs);
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART:
				return basicSetAutostart(null, msgs);
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
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE:
				return getService();
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART:
				return getAutostart();
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
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE:
				setService((ServiceSpecificationStructure)newValue);
				return;
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART:
				setAutostart((IBISIPBoolean)newValue);
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
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE:
				setService((ServiceSpecificationStructure)null);
				return;
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART:
				setAutostart((IBISIPBoolean)null);
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
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__SERVICE:
				return service != null;
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE__AUTOSTART:
				return autostart != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceInformationStructureImpl
