/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Subdevice Status Information Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceStatusInformationData()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceStatusInformationResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllSubdeviceStatusInformationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceStatusInformationData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Subdevice Status Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdevice Status Information List</em>' containment reference.
	 * @see #setSubdeviceStatusInformationList(SubdeviceStatusInformation)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceStatusInformationData_SubdeviceStatusInformationList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceStatusInformationList' namespace='##targetNamespace'"
	 * @generated
	 */
	SubdeviceStatusInformation getSubdeviceStatusInformationList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Status Information List</em>' containment reference.
	 * @see #getSubdeviceStatusInformationList()
	 * @generated
	 */
	void setSubdeviceStatusInformationList(SubdeviceStatusInformation value);

} // AllSubdeviceStatusInformationData
