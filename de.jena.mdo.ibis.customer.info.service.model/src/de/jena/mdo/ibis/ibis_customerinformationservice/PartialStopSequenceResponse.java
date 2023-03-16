/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Stop Sequence Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceResponse()
 * @model extendedMetaData="name='CustomerInformationService.RetrievePartialStopSequenceResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PartialStopSequenceResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Partial Stop Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Stop Sequence Data</em>' containment reference.
	 * @see #setPartialStopSequenceData(PartialStopSequenceData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceResponse_PartialStopSequenceData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PartialStopSequenceData' namespace='##targetNamespace'"
	 * @generated
	 */
	PartialStopSequenceData getPartialStopSequenceData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Stop Sequence Data</em>' containment reference.
	 * @see #getPartialStopSequenceData()
	 * @generated
	 */
	void setPartialStopSequenceData(PartialStopSequenceData value);

} // PartialStopSequenceResponse
