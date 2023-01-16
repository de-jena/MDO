/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceSpecificationStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure;

import de.jena.mdo.ibis.enumerations.ServiceStateEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Specification With State Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateStructureImpl#getServiceSpecification <em>Service Specification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateStructureImpl#getServiceState <em>Service State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecificationWithStateStructureImpl extends MinimalEObjectImpl.Container implements ServiceSpecificationWithStateStructure {
	/**
	 * The cached value of the '{@link #getServiceSpecification() <em>Service Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecification()
	 * @generated
	 * @ordered
	 */
	protected ServiceSpecificationStructure serviceSpecification;

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
	protected ServiceSpecificationWithStateStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getServiceSpecificationWithStateStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationStructure getServiceSpecification() {
		return serviceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSpecification(ServiceSpecificationStructure newServiceSpecification, NotificationChain msgs) {
		ServiceSpecificationStructure oldServiceSpecification = serviceSpecification;
		serviceSpecification = newServiceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION, oldServiceSpecification, newServiceSpecification);
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
	public void setServiceSpecification(ServiceSpecificationStructure newServiceSpecification) {
		if (newServiceSpecification != serviceSpecification) {
			NotificationChain msgs = null;
			if (serviceSpecification != null)
				msgs = ((InternalEObject)serviceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION, null, msgs);
			if (newServiceSpecification != null)
				msgs = ((InternalEObject)newServiceSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION, null, msgs);
			msgs = basicSetServiceSpecification(newServiceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION, newServiceSpecification, newServiceSpecification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE, oldServiceState, serviceState, !oldServiceStateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE, oldServiceState, SERVICE_STATE_EDEFAULT, oldServiceStateESet));
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION:
				return basicSetServiceSpecification(null, msgs);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION:
				return getServiceSpecification();
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION:
				setServiceSpecification((ServiceSpecificationStructure)newValue);
				return;
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION:
				setServiceSpecification((ServiceSpecificationStructure)null);
				return;
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION:
				return serviceSpecification != null;
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE:
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

} //ServiceSpecificationWithStateStructureImpl
