/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Subdevice Error Messages Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceErrorMessagesData()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllSubdeviceErrorMessagesData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceErrorMessagesData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Subdevice Error Messages List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdevice Error Messages List</em>' containment reference.
	 * @see #setSubdeviceErrorMessagesList(SubdeviceErrorMessages)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceErrorMessagesData_SubdeviceErrorMessagesList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceErrorMessagesList' namespace='##targetNamespace'"
	 * @generated
	 */
	SubdeviceErrorMessages getSubdeviceErrorMessagesList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Error Messages List</em>' containment reference.
	 * @see #getSubdeviceErrorMessagesList()
	 * @generated
	 */
	void setSubdeviceErrorMessagesList(SubdeviceErrorMessages value);

} // AllSubdeviceErrorMessagesData
