/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Accepted Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponse#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataAcceptedResponse()
 * @model extendedMetaData="name='DataAcceptedResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataAcceptedResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Data Accepted Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Accepted Response Data</em>' containment reference.
	 * @see #setDataAcceptedResponseData(DataAcceptedResponseData)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataAcceptedResponse_DataAcceptedResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataAcceptedResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DataAcceptedResponseData getDataAcceptedResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponse#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Accepted Response Data</em>' containment reference.
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 */
	void setDataAcceptedResponseData(DataAcceptedResponseData value);

} // DataAcceptedResponse
