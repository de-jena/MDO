/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPInt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Current Stop Index Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentStopIndexData()
 * @model extendedMetaData="name='CustomerInformationService.CurrentStopIndexData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceCurrentStopIndexData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentStopIndexData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #setCurrentStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentStopIndexData_CurrentStopIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentStopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getCurrentStopIndex <em>Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #getCurrentStopIndex()
	 * @generated
	 */
	void setCurrentStopIndex(IBISIPInt value);

} // CustomerInformationServiceCurrentStopIndexData
