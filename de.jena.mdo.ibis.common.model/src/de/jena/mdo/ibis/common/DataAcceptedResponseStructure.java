/*
 */
package de.jena.mdo.ibis.common;

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
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataAcceptedResponseStructure()
 * @model extendedMetaData="name='DataAcceptedResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataAcceptedResponseStructure extends GeneralResponseStructure {
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

} // DataAcceptedResponseStructure
