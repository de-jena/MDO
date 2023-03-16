/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Display Content Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse#getCurrentDisplayContentData <em>Current Display Content Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentDisplayContentResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentDisplayContentResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CurrentDisplayContentResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Current Display Content Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Display Content Data</em>' containment reference.
	 * @see #setCurrentDisplayContentData(CurrentDisplayContentData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentDisplayContentResponse_CurrentDisplayContentData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentDisplayContentData' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentDisplayContentData getCurrentDisplayContentData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse#getCurrentDisplayContentData <em>Current Display Content Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Display Content Data</em>' containment reference.
	 * @see #getCurrentDisplayContentData()
	 * @generated
	 */
	void setCurrentDisplayContentData(CurrentDisplayContentData value);

} // CurrentDisplayContentResponse
