/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Stop Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getAnnouncement <em>Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getBayArea <em>Bay Area</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getGNSSPoint <em>GNSS Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation()
 * @model extendedMetaData="name='JourneyStopInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface JourneyStopInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the stoppoint from the planning system	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Ref</em>' containment reference.
	 * @see #setStopRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_StopRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getStopRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopRef <em>Stop Ref</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_StopName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getStopName();

	/**
	 * Returns the value of the '<em><b>Stop Alternative Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Alternative Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_StopAlternativeName()
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
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_Platform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Platform' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getPlatform();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Display Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.DisplayContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Content</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_DisplayContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisplayContent> getDisplayContent();

	/**
	 * Returns the value of the '<em><b>Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Announcement</em>' containment reference.
	 * @see #setAnnouncement(Announcement)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_Announcement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Announcement' namespace='##targetNamespace'"
	 * @generated
	 */
	Announcement getAnnouncement();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getAnnouncement <em>Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Announcement</em>' containment reference.
	 * @see #getAnnouncement()
	 * @generated
	 */
	void setAnnouncement(Announcement value);

	/**
	 * Returns the value of the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Scheduled</em>' containment reference.
	 * @see #setArrivalScheduled(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_ArrivalScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArrivalScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getArrivalScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getArrivalScheduled <em>Arrival Scheduled</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_DepartureScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DepartureScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getDepartureScheduled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDepartureScheduled <em>Departure Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Scheduled</em>' containment reference.
	 * @see #getDepartureScheduled()
	 * @generated
	 */
	void setDepartureScheduled(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Bay Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Area</em>' containment reference.
	 * @see #setBayArea(BayArea)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_BayArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BayArea' namespace='##targetNamespace'"
	 * @generated
	 */
	BayArea getBayArea();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getBayArea <em>Bay Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Area</em>' containment reference.
	 * @see #getBayArea()
	 * @generated
	 */
	void setBayArea(BayArea value);

	/**
	 * Returns the value of the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNSS Point</em>' containment reference.
	 * @see #setGNSSPoint(GNSSPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_GNSSPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GNSSPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSPoint getGNSSPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getGNSSPoint <em>GNSS Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Point</em>' containment reference.
	 * @see #getGNSSPoint()
	 * @generated
	 */
	void setGNSSPoint(GNSSPoint value);

	/**
	 * Returns the value of the '<em><b>Fare Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone</em>' containment reference.
	 * @see #setFareZone(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getJourneyStopInformation_FareZone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZone' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getFareZone();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getFareZone <em>Fare Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Zone</em>' containment reference.
	 * @see #getFareZone()
	 * @generated
	 */
	void setFareZone(IBISIPNMTOKEN value);

} // JourneyStopInformation
