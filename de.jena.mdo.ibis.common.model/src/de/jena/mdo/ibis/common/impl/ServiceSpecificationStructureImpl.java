/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceSpecificationStructure;

import de.jena.mdo.ibis.enumerations.ServiceNameEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Specification Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationStructureImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationStructureImpl#getIBISIPVersion <em>IBISIP Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecificationStructureImpl extends MinimalEObjectImpl.Container implements ServiceSpecificationStructure {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceNameEnumeration SERVICE_NAME_EDEFAULT = ServiceNameEnumeration.CUSTOMER_INFORMATION_SERVICE;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected ServiceNameEnumeration serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * This is true if the Service Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceNameESet;

	/**
	 * The cached value of the '{@link #getIBISIPVersion() <em>IBISIP Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBISIPVersion()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN iBISIPVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSpecificationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_SPECIFICATION_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceNameEnumeration getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(ServiceNameEnumeration newServiceName) {
		ServiceNameEnumeration oldServiceName = serviceName;
		serviceName = newServiceName == null ? SERVICE_NAME_EDEFAULT : newServiceName;
		boolean oldServiceNameESet = serviceNameESet;
		serviceNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME, oldServiceName, serviceName, !oldServiceNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServiceName() {
		ServiceNameEnumeration oldServiceName = serviceName;
		boolean oldServiceNameESet = serviceNameESet;
		serviceName = SERVICE_NAME_EDEFAULT;
		serviceNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME, oldServiceName, SERVICE_NAME_EDEFAULT, oldServiceNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServiceName() {
		return serviceNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getIBISIPVersion() {
		return iBISIPVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIBISIPVersion(IBISIPNMTOKEN newIBISIPVersion, NotificationChain msgs) {
		IBISIPNMTOKEN oldIBISIPVersion = iBISIPVersion;
		iBISIPVersion = newIBISIPVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION, oldIBISIPVersion, newIBISIPVersion);
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
	public void setIBISIPVersion(IBISIPNMTOKEN newIBISIPVersion) {
		if (newIBISIPVersion != iBISIPVersion) {
			NotificationChain msgs = null;
			if (iBISIPVersion != null)
				msgs = ((InternalEObject)iBISIPVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION, null, msgs);
			if (newIBISIPVersion != null)
				msgs = ((InternalEObject)newIBISIPVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION, null, msgs);
			msgs = basicSetIBISIPVersion(newIBISIPVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION, newIBISIPVersion, newIBISIPVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION:
				return basicSetIBISIPVersion(null, msgs);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME:
				return getServiceName();
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION:
				return getIBISIPVersion();
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME:
				setServiceName((ServiceNameEnumeration)newValue);
				return;
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION:
				setIBISIPVersion((IBISIPNMTOKEN)newValue);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME:
				unsetServiceName();
				return;
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION:
				setIBISIPVersion((IBISIPNMTOKEN)null);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME:
				return isSetServiceName();
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION:
				return iBISIPVersion != null;
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
		result.append(" (serviceName: ");
		if (serviceNameESet) result.append(serviceName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceSpecificationStructureImpl
