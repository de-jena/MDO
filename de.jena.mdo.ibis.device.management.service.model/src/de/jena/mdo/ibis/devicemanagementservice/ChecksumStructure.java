/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPByte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checksum Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksumType <em>Checksum Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksum <em>Checksum</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getChecksumStructure()
 * @model extendedMetaData="name='ChecksumStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChecksumStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Checksum Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum Type</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
	 * @see #isSetChecksumType()
	 * @see #unsetChecksumType()
	 * @see #setChecksumType(ChecksumTypeEnumeration)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getChecksumStructure_ChecksumType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ChecksumType' namespace='##targetNamespace'"
	 * @generated
	 */
	ChecksumTypeEnumeration getChecksumType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksumType <em>Checksum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum Type</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
	 * @see #isSetChecksumType()
	 * @see #unsetChecksumType()
	 * @see #getChecksumType()
	 * @generated
	 */
	void setChecksumType(ChecksumTypeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksumType <em>Checksum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChecksumType()
	 * @see #getChecksumType()
	 * @see #setChecksumType(ChecksumTypeEnumeration)
	 * @generated
	 */
	void unsetChecksumType();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksumType <em>Checksum Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checksum Type</em>' attribute is set.
	 * @see #unsetChecksumType()
	 * @see #getChecksumType()
	 * @see #setChecksumType(ChecksumTypeEnumeration)
	 * @generated
	 */
	boolean isSetChecksumType();

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.IBISIPByte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' containment reference list.
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getChecksumStructure_Checksum()
	 * @model containment="true" lower="4" upper="32"
	 *        extendedMetaData="kind='element' name='Checksum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IBISIPByte> getChecksum();

} // ChecksumStructure
