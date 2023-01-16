/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Accepted Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getDataAccepted <em>Data Accepted</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorInformation <em>Error Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseDataStructure()
 * @model extendedMetaData="name='DataAcceptedResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataAcceptedResponseDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseDataStructure_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Data Accepted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Accepted</em>' containment reference.
	 * @see #setDataAccepted(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseDataStructure_DataAccepted()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataAccepted' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getDataAccepted();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getDataAccepted <em>Data Accepted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Accepted</em>' containment reference.
	 * @see #getDataAccepted()
	 * @generated
	 */
	void setDataAccepted(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseDataStructure_ErrorCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ErrorCode' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorCodeEnumeration getErrorCode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @generated
	 */
	void unsetErrorCode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorCode <em>Error Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Code</em>' attribute is set.
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @generated
	 */
	boolean isSetErrorCode();

	/**
	 * Returns the value of the '<em><b>Error Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Information</em>' containment reference.
	 * @see #setErrorInformation(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseDataStructure_ErrorInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getErrorInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorInformation <em>Error Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Information</em>' containment reference.
	 * @see #getErrorInformation()
	 * @generated
	 */
	void setErrorInformation(IBISIPString value);

} // DataAcceptedResponseDataStructure
