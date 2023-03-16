/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Information Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopAnnouncement <em>Stop Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getRecordedArrivalTime <em>Recorded Arrival Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDistanceToNextStop <em>Distance To Next Stop</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest()
 * @model extendedMetaData="name='StopInformationRequestStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StopInformationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StopIndex on current trip	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Index</em>' containment reference.
	 * @see #setStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_StopIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopIndex <em>Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Index</em>' containment reference.
	 * @see #getStopIndex()
	 * @generated
	 */
	void setStopIndex(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the stoppoint from the planning system	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Ref</em>' containment reference.
	 * @see #setStopRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_StopRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getStopRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopRef <em>Stop Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Ref</em>' containment reference.
	 * @see #getStopRef()
	 * @generated
	 */
	void setStopRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Stop Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_StopName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getStopName();

	/**
	 * Returns the value of the '<em><b>Display Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.DisplayContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Content</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_DisplayContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisplayContent> getDisplayContent();

	/**
	 * Returns the value of the '<em><b>Stop Announcement</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.Announcement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Announcement</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_StopAnnouncement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopAnnouncement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Announcement> getStopAnnouncement();

	/**
	 * Returns the value of the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Scheduled</em>' containment reference.
	 * @see #setArrivalScheduled(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_ArrivalScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArrivalScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getArrivalScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getArrivalScheduled <em>Arrival Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Scheduled</em>' containment reference.
	 * @see #getArrivalScheduled()
	 * @generated
	 */
	void setArrivalScheduled(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Scheduled</em>' containment reference.
	 * @see #setDepartureScheduled(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_DepartureScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DepartureScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getDepartureScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDepartureScheduled <em>Departure Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Scheduled</em>' containment reference.
	 * @see #getDepartureScheduled()
	 * @generated
	 */
	void setDepartureScheduled(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This Value is needed for the demonstration at the SSB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Arrival Time</em>' containment reference.
	 * @see #setRecordedArrivalTime(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_RecordedArrivalTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RecordedArrivalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getRecordedArrivalTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getRecordedArrivalTime <em>Recorded Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Arrival Time</em>' containment reference.
	 * @see #getRecordedArrivalTime()
	 * @generated
	 */
	void setRecordedArrivalTime(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Distance To Next Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll-Abstand zwischen den Haltestellen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance To Next Stop</em>' containment reference.
	 * @see #setDistanceToNextStop(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_DistanceToNextStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceToNextStop' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getDistanceToNextStop();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDistanceToNextStop <em>Distance To Next Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance To Next Stop</em>' containment reference.
	 * @see #getDistanceToNextStop()
	 * @generated
	 */
	void setDistanceToNextStop(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Fare Zone</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopInformationRequest_FareZone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZone' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IBISIPNMTOKEN> getFareZone();

} // StopInformationRequest
