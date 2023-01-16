/*
 */
package de.jena.mdo.ibis.customerInformationService;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.StopInformationStructure;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Current Stop Point Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentStopPointData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentStopPointData#getCurrentStopPoint <em>Current Stop Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentStopPointData()
 * @model extendedMetaData="name='CustomerInformationService.CurrentStopPointData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceCurrentStopPointData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentStopPointData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentStopPointData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Current Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Point</em>' containment reference.
	 * @see #setCurrentStopPoint(StopInformationStructure)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentStopPointData_CurrentStopPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentStopPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	StopInformationStructure getCurrentStopPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentStopPointData#getCurrentStopPoint <em>Current Stop Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Point</em>' containment reference.
	 * @see #getCurrentStopPoint()
	 * @generated
	 */
	void setCurrentStopPoint(StopInformationStructure value);

} // CustomerInformationServiceCurrentStopPointData
