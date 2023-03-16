/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Data Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse#getAllData <em>All Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllDataResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetAllDataResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllDataResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>All Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Data</em>' containment reference.
	 * @see #setAllData(AllData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllDataResponse_AllData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllData' namespace='##targetNamespace'"
	 * @generated
	 */
	AllData getAllData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse#getAllData <em>All Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Data</em>' containment reference.
	 * @see #getAllData()
	 * @generated
	 */
	void setAllData(AllData value);

} // AllDataResponse
