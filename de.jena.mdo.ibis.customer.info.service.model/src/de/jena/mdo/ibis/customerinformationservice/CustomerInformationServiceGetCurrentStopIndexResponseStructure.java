/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Current Stop Index Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getCurrentStopIndexData <em>Current Stop Index Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentStopIndexResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetCurrentStopIndexResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetCurrentStopIndexResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Stop Index Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Index Data</em>' containment reference.
	 * @see #setCurrentStopIndexData(CustomerInformationServiceCurrentStopIndexData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentStopIndexResponseStructure_CurrentStopIndexData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStopIndexData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceCurrentStopIndexData getCurrentStopIndexData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getCurrentStopIndexData <em>Current Stop Index Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index Data</em>' containment reference.
	 * @see #getCurrentStopIndexData()
	 * @generated
	 */
	void setCurrentStopIndexData(CustomerInformationServiceCurrentStopIndexData value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceGetCurrentStopIndexResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // CustomerInformationServiceGetCurrentStopIndexResponseStructure
