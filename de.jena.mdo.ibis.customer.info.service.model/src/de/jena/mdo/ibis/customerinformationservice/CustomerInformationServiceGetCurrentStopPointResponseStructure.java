/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Current Stop Point Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure#getCurrentStopPointData <em>Current Stop Point Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentStopPointResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentStopPointResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetCurrentStopPointResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Current Stop Point Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Point Data</em>' containment reference.
	 * @see #setCurrentStopPointData(CustomerInformationServiceCurrentStopPointData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentStopPointResponseStructure_CurrentStopPointData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStopPointData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceCurrentStopPointData getCurrentStopPointData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure#getCurrentStopPointData <em>Current Stop Point Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Point Data</em>' containment reference.
	 * @see #getCurrentStopPointData()
	 * @generated
	 */
	void setCurrentStopPointData(CustomerInformationServiceCurrentStopPointData value);

} // CustomerInformationServiceGetCurrentStopPointResponseStructure
