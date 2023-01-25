/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Current Connection Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure#getCurrentConnectionData <em>Current Connection Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentConnectionInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetCurrentConnectionInformationResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Current Connection Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Connection Data</em>' containment reference.
	 * @see #setCurrentConnectionData(CustomerInformationServiceCurrentConnectionInformationData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_CurrentConnectionData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentConnectionData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceCurrentConnectionInformationData getCurrentConnectionData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure#getCurrentConnectionData <em>Current Connection Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Connection Data</em>' containment reference.
	 * @see #getCurrentConnectionData()
	 * @generated
	 */
	void setCurrentConnectionData(CustomerInformationServiceCurrentConnectionInformationData value);

} // CustomerInformationServiceGetCurrentConnectionInformationResponseStructure
