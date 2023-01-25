/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get All Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure#getAllData <em>All Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetAllDataResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetAllDataResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetAllDataResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>All Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Data</em>' containment reference.
	 * @see #setAllData(CustomerInformationServiceAllData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetAllDataResponseStructure_AllData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceAllData getAllData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure#getAllData <em>All Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Data</em>' containment reference.
	 * @see #getAllData()
	 * @generated
	 */
	void setAllData(CustomerInformationServiceAllData value);

} // CustomerInformationServiceGetAllDataResponseStructure
