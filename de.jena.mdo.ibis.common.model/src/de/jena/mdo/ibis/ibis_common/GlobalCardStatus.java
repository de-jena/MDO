/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Card Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStausID <em>Global Card Staus ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStatusText <em>Global Card Status Text</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getGlobalCardStatus()
 * @model extendedMetaData="name='GlobalCardStatus' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GlobalCardStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Card Staus ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * code according EN 1545
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Card Staus ID</em>' containment reference.
	 * @see #setGlobalCardStausID(IBISIPUnsignedInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getGlobalCardStatus_GlobalCardStausID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GlobalCardStausID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPUnsignedInt getGlobalCardStausID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStausID <em>Global Card Staus ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Card Staus ID</em>' containment reference.
	 * @see #getGlobalCardStausID()
	 * @generated
	 */
	void setGlobalCardStausID(IBISIPUnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Global Card Status Text</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.IBISIPString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * text according EN 1545
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Card Status Text</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getGlobalCardStatus_GlobalCardStatusText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GlobalCardStatusText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IBISIPString> getGlobalCardStatusText();

} // GlobalCardStatus
