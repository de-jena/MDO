/*
 */
package de.jena.mdo.ibis.ibis_common;

import de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Message#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Message#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Message#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Message#getMessageText <em>Message Text</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getMessage()
 * @model extendedMetaData="name='MessageStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID</em>' containment reference.
	 * @see #setMessageID(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getMessage_MessageID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Message-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getMessageID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageID <em>Message ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' containment reference.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ... of the ErrorMessage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getMessage_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.Message#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #setMessageType(MessageTypeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getMessage_MessageType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MessageType' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageTypeEnumeration getMessageType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageTypeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageTypeEnumeration)
	 * @generated
	 */
	void unsetMessageType();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageType <em>Message Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Type</em>' attribute is set.
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageTypeEnumeration)
	 * @generated
	 */
	boolean isSetMessageType();

	/**
	 * Returns the value of the '<em><b>Message Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Text</em>' containment reference.
	 * @see #setMessageText(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getMessage_MessageText()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MessageText' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getMessageText();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageText <em>Message Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Text</em>' containment reference.
	 * @see #getMessageText()
	 * @generated
	 */
	void setMessageText(IBISIPString value);

} // Message
