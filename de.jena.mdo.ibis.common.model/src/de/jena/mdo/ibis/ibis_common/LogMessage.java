/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LogMessage#getMessageProvider <em>Message Provider</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LogMessage#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLogMessage()
 * @model extendedMetaData="name='LogMessageStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LogMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the Service or Device, which sends the message, which has to be logged
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Provider</em>' containment reference.
	 * @see #setMessageProvider(DeviceSpecification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLogMessage_MessageProvider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MessageProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceSpecification getMessageProvider();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.LogMessage#getMessageProvider <em>Message Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Provider</em>' containment reference.
	 * @see #getMessageProvider()
	 * @generated
	 */
	void setMessageProvider(DeviceSpecification value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLogMessage_Message()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.LogMessage#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // LogMessage
