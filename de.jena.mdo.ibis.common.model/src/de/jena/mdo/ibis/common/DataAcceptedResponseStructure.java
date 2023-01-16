/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Accepted Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseStructure()
 * @model extendedMetaData="name='DataAcceptedResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataAcceptedResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Accepted Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Accepted Response Data</em>' containment reference.
	 * @see #setDataAcceptedResponseData(DataAcceptedResponseDataStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseStructure_DataAcceptedResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataAcceptedResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DataAcceptedResponseDataStructure getDataAcceptedResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Accepted Response Data</em>' containment reference.
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 */
	void setDataAcceptedResponseData(DataAcceptedResponseDataStructure value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // DataAcceptedResponseStructure
