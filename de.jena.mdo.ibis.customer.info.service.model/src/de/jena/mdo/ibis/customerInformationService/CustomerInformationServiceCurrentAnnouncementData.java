/*
 */
package de.jena.mdo.ibis.customerInformationService;

import de.jena.mdo.ibis.common.AnnouncementStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Current Announcement Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentAnnouncementData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentAnnouncementData#getCurrentAnnouncement <em>Current Announcement</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentAnnouncementData()
 * @model extendedMetaData="name='CustomerInformationService.CurrentAnnouncementData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceCurrentAnnouncementData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentAnnouncementData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentAnnouncementData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Current Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Announcement</em>' containment reference.
	 * @see #setCurrentAnnouncement(AnnouncementStructure)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentAnnouncementData_CurrentAnnouncement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentAnnouncement' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnouncementStructure getCurrentAnnouncement();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentAnnouncementData#getCurrentAnnouncement <em>Current Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Announcement</em>' containment reference.
	 * @see #getCurrentAnnouncement()
	 * @generated
	 */
	void setCurrentAnnouncement(AnnouncementStructure value);

} // CustomerInformationServiceCurrentAnnouncementData
