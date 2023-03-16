/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.ServiceInformationList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Information Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getServiceInformationList <em>Service Information List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceInformationData()
 * @model extendedMetaData="name='DeviceManagementService.GetServiceInformationResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceInformationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceInformationData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Service Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Information List</em>' containment reference.
	 * @see #setServiceInformationList(ServiceInformationList)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceInformationData_ServiceInformationList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceInformationList' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceInformationList getServiceInformationList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getServiceInformationList <em>Service Information List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Information List</em>' containment reference.
	 * @see #getServiceInformationList()
	 * @generated
	 */
	void setServiceInformationList(ServiceInformationList value);

} // ServiceInformationData
