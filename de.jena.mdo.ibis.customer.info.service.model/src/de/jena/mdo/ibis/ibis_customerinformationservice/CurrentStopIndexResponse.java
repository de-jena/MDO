/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Stop Index Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse#getCurrentStopIndexData <em>Current Stop Index Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentStopIndexResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentStopIndexResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CurrentStopIndexResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Current Stop Index Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Index Data</em>' containment reference.
	 * @see #setCurrentStopIndexData(CurrentStopIndexData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentStopIndexResponse_CurrentStopIndexData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStopIndexData' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentStopIndexData getCurrentStopIndexData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse#getCurrentStopIndexData <em>Current Stop Index Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index Data</em>' containment reference.
	 * @see #getCurrentStopIndexData()
	 * @generated
	 */
	void setCurrentStopIndexData(CurrentStopIndexData value);

} // CurrentStopIndexResponse
