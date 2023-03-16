/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Connection Information Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse#getCurrentConnectionData <em>Current Connection Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentConnectionInformationResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentConnectionInformationResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CurrentConnectionInformationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Current Connection Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Connection Data</em>' containment reference.
	 * @see #setCurrentConnectionData(CurrentConnectionInformationData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentConnectionInformationResponse_CurrentConnectionData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentConnectionData' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentConnectionInformationData getCurrentConnectionData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse#getCurrentConnectionData <em>Current Connection Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Connection Data</em>' containment reference.
	 * @see #getCurrentConnectionData()
	 * @generated
	 */
	void setCurrentConnectionData(CurrentConnectionInformationData value);

} // CurrentConnectionInformationResponse
