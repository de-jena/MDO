/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Stop Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getAnnouncement <em>Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getBayArea <em>Bay Area</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getGNSSPoint <em>GNSS Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure()
 * @model extendedMetaData="name='JourneyStopInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface JourneyStopInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the stoppoint from the planning system	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Ref</em>' containment reference.
	 * @see #setStopRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_StopRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getStopRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopRef <em>Stop Ref</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_StopName()
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_StopAlternativeName()
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_Platform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Platform' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getPlatform();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getPlatform <em>Platform</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_DisplayContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisplayContentStructure> getDisplayContent();

	/**
	 * Returns the value of the '<em><b>Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Announcement</em>' containment reference.
	 * @see #setAnnouncement(AnnouncementStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_Announcement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Announcement' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnouncementStructure getAnnouncement();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getAnnouncement <em>Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Announcement</em>' containment reference.
	 * @see #getAnnouncement()
	 * @generated
	 */
	void setAnnouncement(AnnouncementStructure value);

	/**
	 * Returns the value of the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Scheduled</em>' containment reference.
	 * @see #setArrivalScheduled(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_ArrivalScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArrivalScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getArrivalScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getArrivalScheduled <em>Arrival Scheduled</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_DepartureScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DepartureScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getDepartureScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDepartureScheduled <em>Departure Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Scheduled</em>' containment reference.
	 * @see #getDepartureScheduled()
	 * @generated
	 */
	void setDepartureScheduled(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.ConnectionStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConnectionStructure> getConnection();

	/**
	 * Returns the value of the '<em><b>Bay Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Area</em>' containment reference.
	 * @see #setBayArea(BayAreaStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_BayArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BayArea' namespace='##targetNamespace'"
	 * @generated
	 */
	BayAreaStructure getBayArea();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getBayArea <em>Bay Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Area</em>' containment reference.
	 * @see #getBayArea()
	 * @generated
	 */
	void setBayArea(BayAreaStructure value);

	/**
	 * Returns the value of the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNSS Point</em>' containment reference.
	 * @see #setGNSSPoint(GNSSPointStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_GNSSPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GNSSPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSPointStructure getGNSSPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getGNSSPoint <em>GNSS Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Point</em>' containment reference.
	 * @see #getGNSSPoint()
	 * @generated
	 */
	void setGNSSPoint(GNSSPointStructure value);

	/**
	 * Returns the value of the '<em><b>Fare Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone</em>' containment reference.
	 * @see #setFareZone(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getJourneyStopInformationStructure_FareZone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZone' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getFareZone();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getFareZone <em>Fare Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Zone</em>' containment reference.
	 * @see #getFareZone()
	 * @generated
	 */
	void setFareZone(IBISIPNMTOKEN value);

} // JourneyStopInformationStructure
