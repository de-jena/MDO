/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceIdentificationStructure;
import de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure;

import de.jena.mdo.ibis.enumerations.ServiceStateEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Identification With State Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateStructureImpl#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateStructureImpl#getServiceState <em>Service State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceIdentificationWithStateStructureImpl extends MinimalEObjectImpl.Container implements ServiceIdentificationWithStateStructure {
	/**
	 * The cached value of the '{@link #getServiceIdentification() <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentification()
	 * @generated
	 * @ordered
	 */
	protected ServiceIdentificationStructure serviceIdentification;

	/**
	 * The default value of the '{@link #getServiceState() <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceState()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStateEnumeration SERVICE_STATE_EDEFAULT = ServiceStateEnumeration.DEFECTIVE;

	/**
	 * The cached value of the '{@link #getServiceState() <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceState()
	 * @generated
	 * @ordered
	 */
	protected ServiceStateEnumeration serviceState = SERVICE_STATE_EDEFAULT;

	/**
	 * This is true if the Service State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceIdentificationWithStateStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationStructure getServiceIdentification() {
		return serviceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceIdentification(ServiceIdentificationStructure newServiceIdentification, NotificationChain msgs) {
		ServiceIdentificationStructure oldServiceIdentification = serviceIdentification;
		serviceIdentification = newServiceIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION, oldServiceIdentification, newServiceIdentification);
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
	public void setServiceIdentification(ServiceIdentificationStructure newServiceIdentification) {
		if (newServiceIdentification != serviceIdentification) {
			NotificationChain msgs = null;
			if (serviceIdentification != null)
				msgs = ((InternalEObject)serviceIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION, null, msgs);
			if (newServiceIdentification != null)
				msgs = ((InternalEObject)newServiceIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION, null, msgs);
			msgs = basicSetServiceIdentification(newServiceIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION, newServiceIdentification, newServiceIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStateEnumeration getServiceState() {
		return serviceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceState(ServiceStateEnumeration newServiceState) {
		ServiceStateEnumeration oldServiceState = serviceState;
		serviceState = newServiceState == null ? SERVICE_STATE_EDEFAULT : newServiceState;
		boolean oldServiceStateESet = serviceStateESet;
		serviceStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE, oldServiceState, serviceState, !oldServiceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServiceState() {
		ServiceStateEnumeration oldServiceState = serviceState;
		boolean oldServiceStateESet = serviceStateESet;
		serviceState = SERVICE_STATE_EDEFAULT;
		serviceStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE, oldServiceState, SERVICE_STATE_EDEFAULT, oldServiceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServiceState() {
		return serviceStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION:
				return basicSetServiceIdentification(null, msgs);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION:
				return getServiceIdentification();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
				return getServiceState();
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationStructure)newValue);
				return;
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
				setServiceState((ServiceStateEnumeration)newValue);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationStructure)null);
				return;
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
				unsetServiceState();
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION:
				return serviceIdentification != null;
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
				return isSetServiceState();
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
		result.append(" (serviceState: ");
		if (serviceStateESet) result.append(serviceState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceIdentificationWithStateStructureImpl
