/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Subdevice Information Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getSubdeviceInformationList <em>Subdevice Information List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceInformationData()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceInformationResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllSubdeviceInformationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceInformationData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Subdevice Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdevice Information List</em>' containment reference.
	 * @see #setSubdeviceInformationList(SubdeviceInformation)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceInformationData_SubdeviceInformationList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceInformationList' namespace='##targetNamespace'"
	 * @generated
	 */
	SubdeviceInformation getSubdeviceInformationList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getSubdeviceInformationList <em>Subdevice Information List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Information List</em>' containment reference.
	 * @see #getSubdeviceInformationList()
	 * @generated
	 */
	void setSubdeviceInformationList(SubdeviceInformation value);

} // AllSubdeviceInformationData
