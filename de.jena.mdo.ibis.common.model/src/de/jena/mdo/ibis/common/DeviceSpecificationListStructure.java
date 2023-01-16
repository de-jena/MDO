/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Specification List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceSpecificationListStructure#getDeviceSpecification <em>Device Specification</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationListStructure()
 * @model extendedMetaData="name='DeviceSpecificationListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceSpecificationListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Specification</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DeviceSpecificationStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Specification</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationListStructure_DeviceSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceSpecificationStructure> getDeviceSpecification();

} // DeviceSpecificationListStructure
