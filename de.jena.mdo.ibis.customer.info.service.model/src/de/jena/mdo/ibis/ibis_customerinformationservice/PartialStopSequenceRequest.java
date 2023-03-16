/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.IBISIPInt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Stop Sequence Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getStartingStopIndex <em>Starting Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getNumberOfStopPoints <em>Number Of Stop Points</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceRequest()
 * @model extendedMetaData="name='CustomerInformationService.RetrievePartialStopSequenceRequestStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PartialStopSequenceRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Stop Index</em>' containment reference.
	 * @see #setStartingStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceRequest_StartingStopIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StartingStopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getStartingStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getStartingStopIndex <em>Starting Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Stop Index</em>' containment reference.
	 * @see #getStartingStopIndex()
	 * @generated
	 */
	void setStartingStopIndex(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Number Of Stop Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Stop Points</em>' containment reference.
	 * @see #setNumberOfStopPoints(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getPartialStopSequenceRequest_NumberOfStopPoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfStopPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getNumberOfStopPoints();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getNumberOfStopPoints <em>Number Of Stop Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Stop Points</em>' containment reference.
	 * @see #getNumberOfStopPoints()
	 * @generated
	 */
	void setNumberOfStopPoints(IBISIPInt value);

} // PartialStopSequenceRequest
