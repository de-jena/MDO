/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.StopSequence;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Stop Sequence Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getStopSequence <em>Stop Sequence</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceData()
 * @model extendedMetaData="name='CustomerInformationService.PartialStopSequenceData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PartialStopSequenceData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Stop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Sequence</em>' containment reference.
	 * @see #setStopSequence(StopSequence)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceData_StopSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	StopSequence getStopSequence();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getStopSequence <em>Stop Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Sequence</em>' containment reference.
	 * @see #getStopSequence()
	 * @generated
	 */
	void setStopSequence(StopSequence value);

} // PartialStopSequenceData
