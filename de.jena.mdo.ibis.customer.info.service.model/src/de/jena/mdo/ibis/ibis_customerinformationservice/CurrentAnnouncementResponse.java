/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Announcement Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse#getCurrentAnnouncementData <em>Current Announcement Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentAnnouncementResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentAnnouncementResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CurrentAnnouncementResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Current Announcement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Announcement Data</em>' containment reference.
	 * @see #setCurrentAnnouncementData(CurrentAnnouncementData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getCurrentAnnouncementResponse_CurrentAnnouncementData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentAnnouncementData' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentAnnouncementData getCurrentAnnouncementData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse#getCurrentAnnouncementData <em>Current Announcement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Announcement Data</em>' containment reference.
	 * @see #getCurrentAnnouncementData()
	 * @generated
	 */
	void setCurrentAnnouncementData(CurrentAnnouncementData value);

} // CurrentAnnouncementResponse
