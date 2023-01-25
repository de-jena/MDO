/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Retrieve Partial Stop Sequence Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.RetrievePartialStopSequenceResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceRetrievePartialStopSequenceResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Partial Stop Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Stop Sequence Data</em>' containment reference.
	 * @see #setPartialStopSequenceData(CustomerInformationServicePartialStopSequenceData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_PartialStopSequenceData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PartialStopSequenceData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServicePartialStopSequenceData getPartialStopSequenceData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Stop Sequence Data</em>' containment reference.
	 * @see #getPartialStopSequenceData()
	 * @generated
	 */
	void setPartialStopSequenceData(CustomerInformationServicePartialStopSequenceData value);

} // CustomerInformationServiceRetrievePartialStopSequenceResponseStructure
