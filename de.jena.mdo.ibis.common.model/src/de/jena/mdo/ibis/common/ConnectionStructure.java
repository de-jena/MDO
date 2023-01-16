/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.ConnectionStateEnumeration;
import de.jena.mdo.ibis.enumerations.ConnectionTypeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing a connection
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionRef <em>Connection Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionState <em>Connection State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getTransportMode <em>Transport Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionMode <em>Connection Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getExpectedDepartureTime <em>Expected Departure Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ConnectionStructure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure()
 * @model extendedMetaData="name='ConnectionStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConnectionStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StopPoint, where the connection should take place (from planning system)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Ref</em>' containment reference.
	 * @see #setStopRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_StopRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StopRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getStopRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getStopRef <em>Stop Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Ref</em>' containment reference.
	 * @see #getStopRef()
	 * @generated
	 */
	void setStopRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Connection Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StopPoint-referenced connection-reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Ref</em>' containment reference.
	 * @see #setConnectionRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_ConnectionRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConnectionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getConnectionRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionRef <em>Connection Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Ref</em>' containment reference.
	 * @see #getConnectionRef()
	 * @generated
	 */
	void setConnectionRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.ConnectionTypeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the kind of connection 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ConnectionTypeEnumeration
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #setConnectionType(ConnectionTypeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_ConnectionType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ConnectionType' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionTypeEnumeration getConnectionType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ConnectionTypeEnumeration
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionTypeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(ConnectionTypeEnumeration)
	 * @generated
	 */
	void unsetConnectionType();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionType <em>Connection Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Type</em>' attribute is set.
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(ConnectionTypeEnumeration)
	 * @generated
	 */
	boolean isSetConnectionType();

	/**
	 * Returns the value of the '<em><b>Display Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structure for desccribing the information which is shown on a head- or sidesign
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Content</em>' containment reference.
	 * @see #setDisplayContent(DisplayContentStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_DisplayContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayContentStructure getDisplayContent();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getDisplayContent <em>Display Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Content</em>' containment reference.
	 * @see #getDisplayContent()
	 * @generated
	 */
	void setDisplayContent(DisplayContentStructure value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Platform, on which the connection should take place
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_Platform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Platform' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getPlatform();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Connection State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.ConnectionStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the status of the connection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ConnectionStateEnumeration
	 * @see #isSetConnectionState()
	 * @see #unsetConnectionState()
	 * @see #setConnectionState(ConnectionStateEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_ConnectionState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConnectionState' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionStateEnumeration getConnectionState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionState <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ConnectionStateEnumeration
	 * @see #isSetConnectionState()
	 * @see #unsetConnectionState()
	 * @see #getConnectionState()
	 * @generated
	 */
	void setConnectionState(ConnectionStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionState <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionState()
	 * @see #getConnectionState()
	 * @see #setConnectionState(ConnectionStateEnumeration)
	 * @generated
	 */
	void unsetConnectionState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionState <em>Connection State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection State</em>' attribute is set.
	 * @see #unsetConnectionState()
	 * @see #getConnectionState()
	 * @see #setConnectionState(ConnectionStateEnumeration)
	 * @generated
	 */
	boolean isSetConnectionState();

	/**
	 * Returns the value of the '<em><b>Transport Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the mode of the pick-up vehicle, DEPRECATED !, THE ConnectionMode SHOULD BE USED INSTEAD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Mode</em>' containment reference.
	 * @see #setTransportMode(VehicleStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_TransportMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransportMode' namespace='##targetNamespace'"
	 * @generated
	 */
	VehicleStructure getTransportMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getTransportMode <em>Transport Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Mode</em>' containment reference.
	 * @see #getTransportMode()
	 * @generated
	 */
	void setTransportMode(VehicleStructure value);

	/**
	 * Returns the value of the '<em><b>Connection Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mode- and Submode information of the pick-up vehicle in accordance with Netex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Mode</em>' containment reference.
	 * @see #setConnectionMode(NetexMode)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_ConnectionMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConnectionMode' namespace='##targetNamespace'"
	 * @generated
	 */
	NetexMode getConnectionMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionMode <em>Connection Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Mode</em>' containment reference.
	 * @see #getConnectionMode()
	 * @generated
	 */
	void setConnectionMode(NetexMode value);

	/**
	 * Returns the value of the '<em><b>Expected Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information, at which time the leaving vehicle will depart based on realtime information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Departure Time</em>' containment reference.
	 * @see #setExpectedDepartureTime(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_ExpectedDepartureTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExpectedDepartureTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getExpectedDepartureTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getExpectedDepartureTime <em>Expected Departure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Departure Time</em>' containment reference.
	 * @see #getExpectedDepartureTime()
	 * @generated
	 */
	void setExpectedDepartureTime(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Scheduled Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information, at which time the leaving vehicle is planned to depart
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduled Departure Time</em>' containment reference.
	 * @see #setScheduledDepartureTime(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getConnectionStructure_ScheduledDepartureTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduledDepartureTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getScheduledDepartureTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ConnectionStructure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Departure Time</em>' containment reference.
	 * @see #getScheduledDepartureTime()
	 * @generated
	 */
	void setScheduledDepartureTime(IBISIPDateTime value);

} // ConnectionStructure
