/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.DisplayContentStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Current Display Content Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getCurrentDisplayContent <em>Current Display Content</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentDisplayContentData()
 * @model extendedMetaData="name='CustomerInformationService.CurrentDisplayContentData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceCurrentDisplayContentData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentDisplayContentData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Current Display Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DisplayContentStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Display Content</em>' containment reference list.
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#getCustomerInformationServiceCurrentDisplayContentData_CurrentDisplayContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentDisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisplayContentStructure> getCurrentDisplayContent();

} // CustomerInformationServiceCurrentDisplayContentData
