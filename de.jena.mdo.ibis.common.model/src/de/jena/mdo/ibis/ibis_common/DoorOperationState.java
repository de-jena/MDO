/*
 */
package de.jena.mdo.ibis.ibis_common;

import de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Operation State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDoorOperationState()
 * @model extendedMetaData="name='DoorOperationStateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DoorOperationState extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DoorOperationStateEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDoorOperationState_Value()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorOperationStateEnumeration getValue();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DoorOperationStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DoorOperationStateEnumeration)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DoorOperationStateEnumeration)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDoorOperationState_ErrorCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ErrorCode' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorCodeEnumeration getErrorCode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @generated
	 */
	void unsetErrorCode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getErrorCode <em>Error Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Code</em>' attribute is set.
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @generated
	 */
	boolean isSetErrorCode();

} // DoorOperationState
