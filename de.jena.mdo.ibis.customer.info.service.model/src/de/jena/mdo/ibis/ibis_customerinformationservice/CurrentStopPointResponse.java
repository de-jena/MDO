/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Stop Point Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse#getCurrentStopPointData <em>Current Stop Point Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentStopPointResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentStopPointResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CurrentStopPointResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Current Stop Point Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Point Data</em>' containment reference.
	 * @see #setCurrentStopPointData(CurrentStopPointData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentStopPointResponse_CurrentStopPointData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStopPointData' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentStopPointData getCurrentStopPointData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse#getCurrentStopPointData <em>Current Stop Point Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Point Data</em>' containment reference.
	 * @see #getCurrentStopPointData()
	 * @generated
	 */
	void setCurrentStopPointData(CurrentStopPointData value);

} // CurrentStopPointResponse
