/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.ServiceIdentification;
import de.jena.mdo.ibis.ibis_common.ServiceStart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartImpl#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartImpl#getAutostart <em>Autostart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceStartImpl extends MinimalEObjectImpl.Container implements ServiceStart {
	/**
	 * The cached value of the '{@link #getServiceIdentification() <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentification()
	 * @generated
	 * @ordered
	 */
	protected ServiceIdentification serviceIdentification;

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
	protected ServiceStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentification getServiceIdentification() {
		return serviceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceIdentification(ServiceIdentification newServiceIdentification, NotificationChain msgs) {
		ServiceIdentification oldServiceIdentification = serviceIdentification;
		serviceIdentification = newServiceIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION, oldServiceIdentification, newServiceIdentification);
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
	public void setServiceIdentification(ServiceIdentification newServiceIdentification) {
		if (newServiceIdentification != serviceIdentification) {
			NotificationChain msgs = null;
			if (serviceIdentification != null)
				msgs = ((InternalEObject)serviceIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION, null, msgs);
			if (newServiceIdentification != null)
				msgs = ((InternalEObject)newServiceIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION, null, msgs);
			msgs = basicSetServiceIdentification(newServiceIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION, newServiceIdentification, newServiceIdentification));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_START__AUTOSTART, oldAutostart, newAutostart);
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
				msgs = ((InternalEObject)autostart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_START__AUTOSTART, null, msgs);
			if (newAutostart != null)
				msgs = ((InternalEObject)newAutostart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_START__AUTOSTART, null, msgs);
			msgs = basicSetAutostart(newAutostart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_START__AUTOSTART, newAutostart, newAutostart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION:
				return basicSetServiceIdentification(null, msgs);
			case IbisCommonPackage.SERVICE_START__AUTOSTART:
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
			case IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION:
				return getServiceIdentification();
			case IbisCommonPackage.SERVICE_START__AUTOSTART:
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
			case IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentification)newValue);
				return;
			case IbisCommonPackage.SERVICE_START__AUTOSTART:
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
			case IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentification)null);
				return;
			case IbisCommonPackage.SERVICE_START__AUTOSTART:
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
			case IbisCommonPackage.SERVICE_START__SERVICE_IDENTIFICATION:
				return serviceIdentification != null;
			case IbisCommonPackage.SERVICE_START__AUTOSTART:
				return autostart != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceStartImpl
