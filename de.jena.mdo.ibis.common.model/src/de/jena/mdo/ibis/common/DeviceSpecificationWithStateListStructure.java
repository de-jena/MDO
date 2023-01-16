/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Specification With State List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure#getDeviceSpecificationWithState <em>Device Specification With State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationWithStateListStructure()
 * @model extendedMetaData="name='DeviceSpecificationWithStateListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceSpecificationWithStateListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Specification With State</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Specification With State</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceSpecificationWithState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceSpecificationWithStateStructure> getDeviceSpecificationWithState();

} // DeviceSpecificationWithStateListStructure
