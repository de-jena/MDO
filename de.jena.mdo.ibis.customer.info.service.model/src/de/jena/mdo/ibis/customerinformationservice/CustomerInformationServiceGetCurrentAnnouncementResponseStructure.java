/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Current Announcement Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure#getCurrentAnnouncementData <em>Current Announcement Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentAnnouncementResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentAnnouncementResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetCurrentAnnouncementResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Current Announcement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Announcement Data</em>' containment reference.
	 * @see #setCurrentAnnouncementData(CustomerInformationServiceCurrentAnnouncementData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_CurrentAnnouncementData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentAnnouncementData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceCurrentAnnouncementData getCurrentAnnouncementData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure#getCurrentAnnouncementData <em>Current Announcement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Announcement Data</em>' containment reference.
	 * @see #getCurrentAnnouncementData()
	 * @generated
	 */
	void setCurrentAnnouncementData(CustomerInformationServiceCurrentAnnouncementData value);

} // CustomerInformationServiceGetCurrentAnnouncementResponseStructure
