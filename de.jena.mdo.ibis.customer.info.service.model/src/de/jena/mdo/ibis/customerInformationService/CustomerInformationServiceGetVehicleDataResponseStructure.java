/*
 */
package de.jena.mdo.ibis.customerInformationService;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Vehicle Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetVehicleDataResponseStructure#getVehicleData <em>Vehicle Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetVehicleDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetVehicleDataResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetVehicleDataResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetVehicleDataResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #setVehicleData(CustomerInformationServiceVehicleData)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceVehicleData getVehicleData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetVehicleDataResponseStructure#getVehicleData <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #getVehicleData()
	 * @generated
	 */
	void setVehicleData(CustomerInformationServiceVehicleData value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetVehicleDataResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetVehicleDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // CustomerInformationServiceGetVehicleDataResponseStructure
