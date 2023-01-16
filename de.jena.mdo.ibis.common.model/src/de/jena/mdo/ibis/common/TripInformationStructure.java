/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.LocationStateEnumeration;
import de.jena.mdo.ibis.enumerations.RouteDirectionEnumeration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getTripRef <em>Trip Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getStopSequence <em>Stop Sequence</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getLocationState <em>Location State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getTimetableDelay <em>Timetable Delay</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage <em>Additional Text Message</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage1 <em>Additional Text Message1</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage2 <em>Additional Text Message2</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage3 <em>Additional Text Message3</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage4 <em>Additional Text Message4</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage5 <em>Additional Text Message5</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage6 <em>Additional Text Message6</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage7 <em>Additional Text Message7</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage8 <em>Additional Text Message8</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage9 <em>Additional Text Message9</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalAnnouncement <em>Additional Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getRouteDirection <em>Route Direction</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TripInformationStructure#getPathDestinationNumber <em>Path Destination Number</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure()
 * @model extendedMetaData="name='TripInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TripInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Ref</em>' containment reference.
	 * @see #setTripRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_TripRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TripRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getTripRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getTripRef <em>Trip Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Ref</em>' containment reference.
	 * @see #getTripRef()
	 * @generated
	 */
	void setTripRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Stop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of StopPoints; with additional information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Sequence</em>' containment reference.
	 * @see #setStopSequence(StopSequenceStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_StopSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	StopSequenceStructure getStopSequence();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getStopSequence <em>Stop Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Sequence</em>' containment reference.
	 * @see #getStopSequence()
	 * @generated
	 */
	void setStopSequence(StopSequenceStructure value);

	/**
	 * Returns the value of the '<em><b>Location State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.LocationStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information of the location state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.LocationStateEnumeration
	 * @see #isSetLocationState()
	 * @see #unsetLocationState()
	 * @see #setLocationState(LocationStateEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_LocationState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='LocationState' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationStateEnumeration getLocationState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getLocationState <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.LocationStateEnumeration
	 * @see #isSetLocationState()
	 * @see #unsetLocationState()
	 * @see #getLocationState()
	 * @generated
	 */
	void setLocationState(LocationStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getLocationState <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocationState()
	 * @see #getLocationState()
	 * @see #setLocationState(LocationStateEnumeration)
	 * @generated
	 */
	void unsetLocationState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getLocationState <em>Location State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location State</em>' attribute is set.
	 * @see #unsetLocationState()
	 * @see #getLocationState()
	 * @see #setLocationState(LocationStateEnumeration)
	 * @generated
	 */
	boolean isSetLocationState();

	/**
	 * Returns the value of the '<em><b>Timetable Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delay in seconds. Early times are shown as negative values.
	 * 
	 *             			tbd: what happens, if this value isn't set
	 *             		
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timetable Delay</em>' containment reference.
	 * @see #setTimetableDelay(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_TimetableDelay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimetableDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getTimetableDelay();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getTimetableDelay <em>Timetable Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable Delay</em>' containment reference.
	 * @see #getTimetableDelay()
	 * @generated
	 */
	void setTimetableDelay(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message</em>' containment reference.
	 * @see #setAdditionalTextMessage(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage <em>Additional Text Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message</em>' containment reference.
	 * @see #getAdditionalTextMessage()
	 * @generated
	 */
	void setAdditionalTextMessage(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message1</em>' containment reference.
	 * @see #setAdditionalTextMessage1(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage1' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage1();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage1 <em>Additional Text Message1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message1</em>' containment reference.
	 * @see #getAdditionalTextMessage1()
	 * @generated
	 */
	void setAdditionalTextMessage1(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message2</em>' containment reference.
	 * @see #setAdditionalTextMessage2(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage2' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage2();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage2 <em>Additional Text Message2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message2</em>' containment reference.
	 * @see #getAdditionalTextMessage2()
	 * @generated
	 */
	void setAdditionalTextMessage2(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message3</em>' containment reference.
	 * @see #setAdditionalTextMessage3(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage3' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage3();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage3 <em>Additional Text Message3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message3</em>' containment reference.
	 * @see #getAdditionalTextMessage3()
	 * @generated
	 */
	void setAdditionalTextMessage3(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message4</em>' containment reference.
	 * @see #setAdditionalTextMessage4(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage4' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage4();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage4 <em>Additional Text Message4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message4</em>' containment reference.
	 * @see #getAdditionalTextMessage4()
	 * @generated
	 */
	void setAdditionalTextMessage4(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message5</em>' containment reference.
	 * @see #setAdditionalTextMessage5(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage5' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage5();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage5 <em>Additional Text Message5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message5</em>' containment reference.
	 * @see #getAdditionalTextMessage5()
	 * @generated
	 */
	void setAdditionalTextMessage5(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message6</em>' containment reference.
	 * @see #setAdditionalTextMessage6(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage6' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage6();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage6 <em>Additional Text Message6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message6</em>' containment reference.
	 * @see #getAdditionalTextMessage6()
	 * @generated
	 */
	void setAdditionalTextMessage6(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message7</em>' containment reference.
	 * @see #setAdditionalTextMessage7(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage7' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage7();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage7 <em>Additional Text Message7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message7</em>' containment reference.
	 * @see #getAdditionalTextMessage7()
	 * @generated
	 */
	void setAdditionalTextMessage7(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message8</em>' containment reference.
	 * @see #setAdditionalTextMessage8(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage8' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage8();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage8 <em>Additional Text Message8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message8</em>' containment reference.
	 * @see #getAdditionalTextMessage8()
	 * @generated
	 */
	void setAdditionalTextMessage8(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Text Message9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Message9</em>' containment reference.
	 * @see #setAdditionalTextMessage9(InternationalTextType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalTextMessage9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalTextMessage9' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getAdditionalTextMessage9();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage9 <em>Additional Text Message9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Message9</em>' containment reference.
	 * @see #getAdditionalTextMessage9()
	 * @generated
	 */
	void setAdditionalTextMessage9(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Additional Announcement</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not StopPointAnnouncements; additional announcements; e.g. of the operator or dispatcher
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Announcement</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_AdditionalAnnouncement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalAnnouncement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdditionalAnnouncementStructure> getAdditionalAnnouncement();

	/**
	 * Returns the value of the '<em><b>Route Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.RouteDirectionEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction of the route, 1->forward 2->backwards and  0->UNDEFINED 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Direction</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.RouteDirectionEnumeration
	 * @see #isSetRouteDirection()
	 * @see #unsetRouteDirection()
	 * @see #setRouteDirection(RouteDirectionEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_RouteDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RouteDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteDirectionEnumeration getRouteDirection();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getRouteDirection <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Direction</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.RouteDirectionEnumeration
	 * @see #isSetRouteDirection()
	 * @see #unsetRouteDirection()
	 * @see #getRouteDirection()
	 * @generated
	 */
	void setRouteDirection(RouteDirectionEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getRouteDirection <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRouteDirection()
	 * @see #getRouteDirection()
	 * @see #setRouteDirection(RouteDirectionEnumeration)
	 * @generated
	 */
	void unsetRouteDirection();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getRouteDirection <em>Route Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Route Direction</em>' attribute is set.
	 * @see #unsetRouteDirection()
	 * @see #getRouteDirection()
	 * @see #setRouteDirection(RouteDirectionEnumeration)
	 * @generated
	 */
	boolean isSetRouteDirection();

	/**
	 * Returns the value of the '<em><b>Run Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The run number (Kurs-Nummer) the trip is operated 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Number</em>' containment reference.
	 * @see #setRunNumber(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_RunNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RunNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getRunNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getRunNumber <em>Run Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Number</em>' containment reference.
	 * @see #getRunNumber()
	 * @generated
	 */
	void setRunNumber(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Pattern Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pattern number (Linienfahrweg-Nummer) the trip is operated 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Number</em>' containment reference.
	 * @see #setPatternNumber(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_PatternNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PatternNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getPatternNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getPatternNumber <em>Pattern Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Number</em>' containment reference.
	 * @see #getPatternNumber()
	 * @generated
	 */
	void setPatternNumber(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Path Destination Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path destination number (RoutenZiel-Nummer) the trip is operated 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Destination Number</em>' containment reference.
	 * @see #setPathDestinationNumber(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTripInformationStructure_PathDestinationNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathDestinationNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getPathDestinationNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TripInformationStructure#getPathDestinationNumber <em>Path Destination Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Destination Number</em>' containment reference.
	 * @see #getPathDestinationNumber()
	 * @generated
	 */
	void setPathDestinationNumber(IBISIPInt value);

} // TripInformationStructure
