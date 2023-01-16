/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.JourneyModeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Sequence Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripRef <em>Trip Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripIndex <em>Trip Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripStart <em>Trip Start</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripSequenceStructure#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripSequenceStructure#getJourneyMode <em>Journey Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripSequenceStructure#getPointSequence <em>Point Sequence</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure()
 * @model extendedMetaData="name='TripSequenceStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TripSequenceStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Ref</em>' containment reference.
	 * @see #setTripRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure_TripRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TripRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getTripRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripRef <em>Trip Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Ref</em>' containment reference.
	 * @see #getTripRef()
	 * @generated
	 */
	void setTripRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Trip Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Index</em>' containment reference.
	 * @see #setTripIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure_TripIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TripIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getTripIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripIndex <em>Trip Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Index</em>' containment reference.
	 * @see #getTripIndex()
	 * @generated
	 */
	void setTripIndex(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Trip Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time, at which the trip is starting
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trip Start</em>' containment reference.
	 * @see #setTripStart(IBISIPTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure_TripStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TripStart' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPTime getTripStart();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripStart <em>Trip Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Start</em>' containment reference.
	 * @see #getTripStart()
	 * @generated
	 */
	void setTripStart(IBISIPTime value);

	/**
	 * Returns the value of the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #setCurrentStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure_CurrentStopIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getCurrentStopIndex <em>Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #getCurrentStopIndex()
	 * @generated
	 */
	void setCurrentStopIndex(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Journey Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.JourneyModeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.JourneyModeEnumeration
	 * @see #isSetJourneyMode()
	 * @see #unsetJourneyMode()
	 * @see #setJourneyMode(JourneyModeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure_JourneyMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='JourneyMode' namespace='##targetNamespace'"
	 * @generated
	 */
	JourneyModeEnumeration getJourneyMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getJourneyMode <em>Journey Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.JourneyModeEnumeration
	 * @see #isSetJourneyMode()
	 * @see #unsetJourneyMode()
	 * @see #getJourneyMode()
	 * @generated
	 */
	void setJourneyMode(JourneyModeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getJourneyMode <em>Journey Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJourneyMode()
	 * @see #getJourneyMode()
	 * @see #setJourneyMode(JourneyModeEnumeration)
	 * @generated
	 */
	void unsetJourneyMode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getJourneyMode <em>Journey Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Journey Mode</em>' attribute is set.
	 * @see #unsetJourneyMode()
	 * @see #getJourneyMode()
	 * @see #setJourneyMode(JourneyModeEnumeration)
	 * @generated
	 */
	boolean isSetJourneyMode();

	/**
	 * Returns the value of the '<em><b>Point Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Analogie zu LID-Verlauf aus VDV 452
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Sequence</em>' containment reference.
	 * @see #setPointSequence(PointSequenceStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripSequenceStructure_PointSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PointSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PointSequenceStructure getPointSequence();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getPointSequence <em>Point Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Sequence</em>' containment reference.
	 * @see #getPointSequence()
	 * @generated
	 */
	void setPointSequence(PointSequenceStructure value);

} // TripSequenceStructure
