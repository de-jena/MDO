/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.LogMessageStructure#getMessageProvider <em>Message Provider</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.LogMessageStructure#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getLogMessageStructure()
 * @model extendedMetaData="name='LogMessageStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LogMessageStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the Service or Device, which sends the message, which has to be logged
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Provider</em>' containment reference.
	 * @see #setMessageProvider(DeviceSpecificationStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getLogMessageStructure_MessageProvider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MessageProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceSpecificationStructure getMessageProvider();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.LogMessageStructure#getMessageProvider <em>Message Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Provider</em>' containment reference.
	 * @see #getMessageProvider()
	 * @generated
	 */
	void setMessageProvider(DeviceSpecificationStructure value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(MessageStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getLogMessageStructure_Message()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageStructure getMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.LogMessageStructure#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MessageStructure value);

} // LogMessageStructure
