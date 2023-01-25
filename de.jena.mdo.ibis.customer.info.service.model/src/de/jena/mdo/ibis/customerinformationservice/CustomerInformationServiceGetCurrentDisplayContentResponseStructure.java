/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Current Display Content Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure#getCurrentDisplayContentData <em>Current Display Content Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentDisplayContentResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentDisplayContentResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetCurrentDisplayContentResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Current Display Content Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Display Content Data</em>' containment reference.
	 * @see #setCurrentDisplayContentData(CustomerInformationServiceCurrentDisplayContentData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_CurrentDisplayContentData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentDisplayContentData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceCurrentDisplayContentData getCurrentDisplayContentData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure#getCurrentDisplayContentData <em>Current Display Content Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Display Content Data</em>' containment reference.
	 * @see #getCurrentDisplayContentData()
	 * @generated
	 */
	void setCurrentDisplayContentData(CustomerInformationServiceCurrentDisplayContentData value);

} // CustomerInformationServiceGetCurrentDisplayContentResponseStructure
