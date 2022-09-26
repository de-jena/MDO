/**
 */
package org.w3.ns.dcat.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.Distribution;
import org.w3.ns.dcat.DistributionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionImpl extends MinimalEObjectImpl.Container implements Distribution {
	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected DistributionType distribution;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionType getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribution(DistributionType newDistribution, NotificationChain msgs) {
		DistributionType oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION__DISTRIBUTION, oldDistribution, newDistribution);
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
	public void setDistribution(DistributionType newDistribution) {
		if (newDistribution != distribution) {
			NotificationChain msgs = null;
			if (distribution != null)
				msgs = ((InternalEObject)distribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION__DISTRIBUTION, null, msgs);
			if (newDistribution != null)
				msgs = ((InternalEObject)newDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION__DISTRIBUTION, null, msgs);
			msgs = basicSetDistribution(newDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION__DISTRIBUTION, newDistribution, newDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DISTRIBUTION__DISTRIBUTION:
				return basicSetDistribution(null, msgs);
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
			case DcatPackage.DISTRIBUTION__DISTRIBUTION:
				return getDistribution();
			case DcatPackage.DISTRIBUTION__RESOURCE:
				return getResource();
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
			case DcatPackage.DISTRIBUTION__DISTRIBUTION:
				setDistribution((DistributionType)newValue);
				return;
			case DcatPackage.DISTRIBUTION__RESOURCE:
				setResource((String)newValue);
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
			case DcatPackage.DISTRIBUTION__DISTRIBUTION:
				setDistribution((DistributionType)null);
				return;
			case DcatPackage.DISTRIBUTION__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
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
			case DcatPackage.DISTRIBUTION__DISTRIBUTION:
				return distribution != null;
			case DcatPackage.DISTRIBUTION__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
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
		result.append(" (resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

} //DistributionImpl
