/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsubscribe Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getClientIPAddress <em>Client IP Address</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPort <em>Reply Port</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPath <em>Reply Path</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getUnsubscribeRequest()
 * @model extendedMetaData="name='UnsubscribeRequestStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnsubscribeRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Client IP Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client IP Address</em>' containment reference.
	 * @see #setClientIPAddress(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getUnsubscribeRequest_ClientIPAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Client-IP-Address' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getClientIPAddress();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getClientIPAddress <em>Client IP Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client IP Address</em>' containment reference.
	 * @see #getClientIPAddress()
	 * @generated
	 */
	void setClientIPAddress(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Reply Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Port</em>' containment reference.
	 * @see #setReplyPort(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getUnsubscribeRequest_ReplyPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReplyPort' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getReplyPort();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPort <em>Reply Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Port</em>' containment reference.
	 * @see #getReplyPort()
	 * @generated
	 */
	void setReplyPort(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Reply Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Path</em>' containment reference.
	 * @see #setReplyPath(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getUnsubscribeRequest_ReplyPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReplyPath' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getReplyPath();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPath <em>Reply Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Path</em>' containment reference.
	 * @see #getReplyPath()
	 * @generated
	 */
	void setReplyPath(IBISIPString value);

} // UnsubscribeRequest
