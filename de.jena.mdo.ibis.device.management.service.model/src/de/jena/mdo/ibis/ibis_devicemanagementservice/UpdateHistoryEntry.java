/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.DataVersionList;
import de.jena.mdo.ibis.ibis_common.IBISIPAnyURI;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update History Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateID <em>Update ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateTimestamp <em>Update Timestamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateURL <em>Update URL</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateStatus <em>Update Status</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getDataVersionList <em>Data Version List</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateDetails <em>Update Details</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry()
 * @model extendedMetaData="name='DeviceManagementService.UpdateHistoryEntryStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateHistoryEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update ID</em>' containment reference.
	 * @see #setUpdateID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry_UpdateID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getUpdateID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateID <em>Update ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update ID</em>' containment reference.
	 * @see #getUpdateID()
	 * @generated
	 */
	void setUpdateID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp given by operation InstallUpdate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Timestamp</em>' containment reference.
	 * @see #setUpdateTimestamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry_UpdateTimestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateTimestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getUpdateTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateTimestamp <em>Update Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Timestamp</em>' containment reference.
	 * @see #getUpdateTimestamp()
	 * @generated
	 */
	void setUpdateTimestamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Update URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL from which the device downloaded the update file
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update URL</em>' containment reference.
	 * @see #setUpdateURL(IBISIPAnyURI)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry_UpdateURL()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateURL' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPAnyURI getUpdateURL();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateURL <em>Update URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update URL</em>' containment reference.
	 * @see #getUpdateURL()
	 * @generated
	 */
	void setUpdateURL(IBISIPAnyURI value);

	/**
	 * Returns the value of the '<em><b>Update Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of update. Typically final status (InstallationSuccessfull or InstallationFailed)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusType)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry_UpdateStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateStatusType getUpdateStatus();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @generated
	 */
	void setUpdateStatus(UpdateStatusType value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusType)
	 * @generated
	 */
	void unsetUpdateStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateStatus <em>Update Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Status</em>' attribute is set.
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusType)
	 * @generated
	 */
	boolean isSetUpdateStatus();

	/**
	 * Returns the value of the '<em><b>Data Version List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional list of updated components
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Version List</em>' containment reference.
	 * @see #setDataVersionList(DataVersionList)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry_DataVersionList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataVersionList' namespace='##targetNamespace'"
	 * @generated
	 */
	DataVersionList getDataVersionList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getDataVersionList <em>Data Version List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Version List</em>' containment reference.
	 * @see #getDataVersionList()
	 * @generated
	 */
	void setDataVersionList(DataVersionList value);

	/**
	 * Returns the value of the '<em><b>Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional device specific update log
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Details</em>' containment reference.
	 * @see #setUpdateDetails(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryEntry_UpdateDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getUpdateDetails();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateDetails <em>Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Details</em>' containment reference.
	 * @see #getUpdateDetails()
	 * @generated
	 */
	void setUpdateDetails(IBISIPString value);

} // UpdateHistoryEntry
