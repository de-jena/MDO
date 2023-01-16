/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsubscribe Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getActive <em>Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getUnsubscribeResponseStructure()
 * @model extendedMetaData="name='UnsubscribeResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnsubscribeResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getUnsubscribeResponseStructure_Active()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Active' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getActive();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getUnsubscribeResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // UnsubscribeResponseStructure
