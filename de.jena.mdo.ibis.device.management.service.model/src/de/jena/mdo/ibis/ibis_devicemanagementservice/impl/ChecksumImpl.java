/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPByte;

import de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checksum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ChecksumImpl#getChecksumType <em>Checksum Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ChecksumImpl#getChecksum <em>Checksum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChecksumImpl extends MinimalEObjectImpl.Container implements Checksum {
	/**
	 * The default value of the '{@link #getChecksumType() <em>Checksum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksumType()
	 * @generated
	 * @ordered
	 */
	protected static final ChecksumType CHECKSUM_TYPE_EDEFAULT = ChecksumType.CRC32;

	/**
	 * The cached value of the '{@link #getChecksumType() <em>Checksum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksumType()
	 * @generated
	 * @ordered
	 */
	protected ChecksumType checksumType = CHECKSUM_TYPE_EDEFAULT;

	/**
	 * This is true if the Checksum Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checksumTypeESet;

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected EList<IBISIPByte> checksum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChecksumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.CHECKSUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChecksumType getChecksumType() {
		return checksumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChecksumType(ChecksumType newChecksumType) {
		ChecksumType oldChecksumType = checksumType;
		checksumType = newChecksumType == null ? CHECKSUM_TYPE_EDEFAULT : newChecksumType;
		boolean oldChecksumTypeESet = checksumTypeESet;
		checksumTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM_TYPE, oldChecksumType, checksumType, !oldChecksumTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChecksumType() {
		ChecksumType oldChecksumType = checksumType;
		boolean oldChecksumTypeESet = checksumTypeESet;
		checksumType = CHECKSUM_TYPE_EDEFAULT;
		checksumTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM_TYPE, oldChecksumType, CHECKSUM_TYPE_EDEFAULT, oldChecksumTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChecksumType() {
		return checksumTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IBISIPByte> getChecksum() {
		if (checksum == null) {
			checksum = new EObjectContainmentEList<IBISIPByte>(IBISIPByte.class, this, IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM);
		}
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM:
				return ((InternalEList<?>)getChecksum()).basicRemove(otherEnd, msgs);
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
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM_TYPE:
				return getChecksumType();
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM:
				return getChecksum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM_TYPE:
				setChecksumType((ChecksumType)newValue);
				return;
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM:
				getChecksum().clear();
				getChecksum().addAll((Collection<? extends IBISIPByte>)newValue);
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
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM_TYPE:
				unsetChecksumType();
				return;
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM:
				getChecksum().clear();
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
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM_TYPE:
				return isSetChecksumType();
			case IbisDeviceManagementServicePackage.CHECKSUM__CHECKSUM:
				return checksum != null && !checksum.isEmpty();
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
		result.append(" (checksumType: ");
		if (checksumTypeESet) result.append(checksumType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ChecksumImpl
