/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopAnnouncement <em>Stop Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getArrivalExpected <em>Arrival Expected</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getDepartureExpected <em>Departure Expected</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getRecordedArrivalTime <em>Recorded Arrival Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getDistanceToNextStop <em>Distance To Next Stop</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.StopInformationStructure#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure()
 * @model extendedMetaData="name='StopInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StopInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StopIndex on current trip	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Index</em>' containment reference.
	 * @see #setStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_StopIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopIndex <em>Stop Index</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_StopRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getStopRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopRef <em>Stop Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Ref</em>' containment reference.
	 * @see #getStopRef()
	 * @generated
	 */
	void setStopRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Stop Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_StopName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getStopName();

	/**
	 * Returns the value of the '<em><b>Stop Alternative Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Alternative Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_StopAlternativeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopAlternativeName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getStopAlternativeName();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_Platform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Platform' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getPlatform();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Display Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DisplayContentStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Content</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_DisplayContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisplayContentStructure> getDisplayContent();

	/**
	 * Returns the value of the '<em><b>Stop Announcement</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.AnnouncementStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Announcement</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_StopAnnouncement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopAnnouncement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnouncementStructure> getStopAnnouncement();

	/**
	 * Returns the value of the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Scheduled</em>' containment reference.
	 * @see #setArrivalScheduled(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_ArrivalScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArrivalScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getArrivalScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getArrivalScheduled <em>Arrival Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Scheduled</em>' containment reference.
	 * @see #getArrivalScheduled()
	 * @generated
	 */
	void setArrivalScheduled(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Arrival Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resolution of 30s is recommended, for the display it is recommended to show the arrival time in minutes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arrival Expected</em>' containment reference.
	 * @see #setArrivalExpected(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_ArrivalExpected()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArrivalExpected' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getArrivalExpected();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getArrivalExpected <em>Arrival Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Expected</em>' containment reference.
	 * @see #getArrivalExpected()
	 * @generated
	 */
	void setArrivalExpected(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Scheduled</em>' containment reference.
	 * @see #setDepartureScheduled(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_DepartureScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DepartureScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getDepartureScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDepartureScheduled <em>Departure Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Scheduled</em>' containment reference.
	 * @see #getDepartureScheduled()
	 * @generated
	 */
	void setDepartureScheduled(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Departure Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Expected</em>' containment reference.
	 * @see #setDepartureExpected(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_DepartureExpected()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DepartureExpected' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getDepartureExpected();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDepartureExpected <em>Departure Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Expected</em>' containment reference.
	 * @see #getDepartureExpected()
	 * @generated
	 */
	void setDepartureExpected(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This Value is needed for the demonstration at the SSB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Arrival Time</em>' containment reference.
	 * @see #setRecordedArrivalTime(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_RecordedArrivalTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RecordedArrivalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getRecordedArrivalTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getRecordedArrivalTime <em>Recorded Arrival Time</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_DistanceToNextStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceToNextStop' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getDistanceToNextStop();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDistanceToNextStop <em>Distance To Next Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance To Next Stop</em>' containment reference.
	 * @see #getDistanceToNextStop()
	 * @generated
	 */
	void setDistanceToNextStop(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.ConnectionStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConnectionStructure> getConnection();

	/**
	 * Returns the value of the '<em><b>Fare Zone</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.IBISIPNMTOKEN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopInformationStructure_FareZone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZone' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IBISIPNMTOKEN> getFareZone();

} // StopInformationStructure
