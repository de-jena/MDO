/*
 */
package de.jena.mdo.ibis.customerInformationService;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Trip Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetTripDataResponseStructure#getTripData <em>Trip Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetTripDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetTripDataResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetTripDataResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetTripDataResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Data</em>' containment reference.
	 * @see #setTripData(CustomerInformationServiceTripData)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetTripDataResponseStructure_TripData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TripData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceTripData getTripData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetTripDataResponseStructure#getTripData <em>Trip Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Data</em>' containment reference.
	 * @see #getTripData()
	 * @generated
	 */
	void setTripData(CustomerInformationServiceTripData value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetTripDataResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetTripDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // CustomerInformationServiceGetTripDataResponseStructure
