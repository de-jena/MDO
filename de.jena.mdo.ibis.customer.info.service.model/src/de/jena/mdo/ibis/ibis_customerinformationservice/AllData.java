/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.DisplayContent;
import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPInt;
import de.jena.mdo.ibis.ibis_common.IBISIPLanguage;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.NetexMode;
import de.jena.mdo.ibis.ibis_common.TripInformation;

import de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripInformation <em>Trip Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getInPanic <em>In Panic</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleStopRequested <em>Vehicle Stop Requested</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getSpeakerActive <em>Speaker Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getStopInformationActive <em>Stop Information Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripState <em>Trip State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getGlobalDisplayContent <em>Global Display Content</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData()
 * @model extendedMetaData="name='CustomerInformationService.AllData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Ref</em>' containment reference.
	 * @see #setVehicleRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_VehicleRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VehicleRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getVehicleRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleRef <em>Vehicle Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Ref</em>' containment reference.
	 * @see #getVehicleRef()
	 * @generated
	 */
	void setVehicleRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Language</em>' containment reference.
	 * @see #setDefaultLanguage(IBISIPLanguage)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_DefaultLanguage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DefaultLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPLanguage getDefaultLanguage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDefaultLanguage <em>Default Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Language</em>' containment reference.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(IBISIPLanguage value);

	/**
	 * Returns the value of the '<em><b>Trip Information</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.TripInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if vehicle is not on a trip and no tripinformation is available occurrence typically is 0
	 * 									if vehicle is on a trip or knows the next trip to run  occurrence typically is 1
	 * 									if vehicle is on a trip and also knows the subsequent trip that info can be provided in the second TripInformation so occurrence is 2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trip Information</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_TripInformation()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='TripInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TripInformation> getTripInformation();

	/**
	 * Returns the value of the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index of the Stoppoint in the Stopsequence, which is the next Stop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #setCurrentStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_CurrentStopIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentStopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getCurrentStopIndex <em>Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #getCurrentStopIndex()
	 * @generated
	 */
	void setCurrentStopIndex(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Route Deviation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the information about route deviation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Deviation</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
	 * @see #isSetRouteDeviation()
	 * @see #unsetRouteDeviation()
	 * @see #setRouteDeviation(RouteDeviationEnumeration)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_RouteDeviation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RouteDeviation' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteDeviationEnumeration getRouteDeviation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getRouteDeviation <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Deviation</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
	 * @see #isSetRouteDeviation()
	 * @see #unsetRouteDeviation()
	 * @see #getRouteDeviation()
	 * @generated
	 */
	void setRouteDeviation(RouteDeviationEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getRouteDeviation <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRouteDeviation()
	 * @see #getRouteDeviation()
	 * @see #setRouteDeviation(RouteDeviationEnumeration)
	 * @generated
	 */
	void unsetRouteDeviation();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getRouteDeviation <em>Route Deviation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Route Deviation</em>' attribute is set.
	 * @see #unsetRouteDeviation()
	 * @see #getRouteDeviation()
	 * @see #setRouteDeviation(RouteDeviationEnumeration)
	 * @generated
	 */
	boolean isSetRouteDeviation();

	/**
	 * Returns the value of the '<em><b>Door State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on DoorState
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Door State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
	 * @see #isSetDoorState()
	 * @see #unsetDoorState()
	 * @see #setDoorState(DoorOpenStateEnumeration)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_DoorState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DoorState' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorOpenStateEnumeration getDoorState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDoorState <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
	 * @see #isSetDoorState()
	 * @see #unsetDoorState()
	 * @see #getDoorState()
	 * @generated
	 */
	void setDoorState(DoorOpenStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDoorState <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoorState()
	 * @see #getDoorState()
	 * @see #setDoorState(DoorOpenStateEnumeration)
	 * @generated
	 */
	void unsetDoorState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDoorState <em>Door State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door State</em>' attribute is set.
	 * @see #unsetDoorState()
	 * @see #getDoorState()
	 * @see #setDoorState(DoorOpenStateEnumeration)
	 * @generated
	 */
	boolean isSetDoorState();

	/**
	 * Returns the value of the '<em><b>In Panic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is the Emergency-Button pressed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Panic</em>' containment reference.
	 * @see #setInPanic(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_InPanic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InPanic' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getInPanic();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getInPanic <em>In Panic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Panic</em>' containment reference.
	 * @see #getInPanic()
	 * @generated
	 */
	void setInPanic(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Vehicle Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is the Stop-Button inside the vehicle pressed? 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Stop Requested</em>' containment reference.
	 * @see #setVehicleStopRequested(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_VehicleStopRequested()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleStopRequested' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getVehicleStopRequested();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleStopRequested <em>Vehicle Stop Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Stop Requested</em>' containment reference.
	 * @see #getVehicleStopRequested()
	 * @generated
	 */
	void setVehicleStopRequested(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Exit Side</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the exit side     		
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Side</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
	 * @see #isSetExitSide()
	 * @see #unsetExitSide()
	 * @see #setExitSide(ExitSideEnumeration)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_ExitSide()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ExitSide' namespace='##targetNamespace'"
	 * @generated
	 */
	ExitSideEnumeration getExitSide();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getExitSide <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Side</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
	 * @see #isSetExitSide()
	 * @see #unsetExitSide()
	 * @see #getExitSide()
	 * @generated
	 */
	void setExitSide(ExitSideEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getExitSide <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExitSide()
	 * @see #getExitSide()
	 * @see #setExitSide(ExitSideEnumeration)
	 * @generated
	 */
	void unsetExitSide();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getExitSide <em>Exit Side</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exit Side</em>' attribute is set.
	 * @see #unsetExitSide()
	 * @see #getExitSide()
	 * @see #setExitSide(ExitSideEnumeration)
	 * @generated
	 */
	boolean isSetExitSide();

	/**
	 * Returns the value of the '<em><b>Moving Direction Forward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives information, if the vehicle is moving forward, default value is "true"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moving Direction Forward</em>' containment reference.
	 * @see #setMovingDirectionForward(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_MovingDirectionForward()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MovingDirectionForward' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getMovingDirectionForward();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMovingDirectionForward <em>Moving Direction Forward</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving Direction Forward</em>' containment reference.
	 * @see #getMovingDirectionForward()
	 * @generated
	 */
	void setMovingDirectionForward(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Vehicle Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATED, is of type VehicleModeEnumeration. MyOwnVehicleMode SHOULD BE USED INSTEAD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
	 * @see #isSetVehicleMode()
	 * @see #unsetVehicleMode()
	 * @see #setVehicleMode(VehicleModeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_VehicleMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VehicleMode' namespace='##targetNamespace'"
	 * @generated
	 */
	VehicleModeEnumeration getVehicleMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleMode <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
	 * @see #isSetVehicleMode()
	 * @see #unsetVehicleMode()
	 * @see #getVehicleMode()
	 * @generated
	 */
	void setVehicleMode(VehicleModeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleMode <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVehicleMode()
	 * @see #getVehicleMode()
	 * @see #setVehicleMode(VehicleModeEnumeration)
	 * @generated
	 */
	void unsetVehicleMode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleMode <em>Vehicle Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vehicle Mode</em>' attribute is set.
	 * @see #unsetVehicleMode()
	 * @see #getVehicleMode()
	 * @see #setVehicleMode(VehicleModeEnumeration)
	 * @generated
	 */
	boolean isSetVehicleMode();

	/**
	 * Returns the value of the '<em><b>My Own Vehicle Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mode- and Submode information vehicle I am in - in accordance with Netex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>My Own Vehicle Mode</em>' containment reference.
	 * @see #setMyOwnVehicleMode(NetexMode)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_MyOwnVehicleMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MyOwnVehicleMode' namespace='##targetNamespace'"
	 * @generated
	 */
	NetexMode getMyOwnVehicleMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Own Vehicle Mode</em>' containment reference.
	 * @see #getMyOwnVehicleMode()
	 * @generated
	 */
	void setMyOwnVehicleMode(NetexMode value);

	/**
	 * Returns the value of the '<em><b>Speaker Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives information, if the loud speaker is activated for a passenger announcement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speaker Active</em>' containment reference.
	 * @see #setSpeakerActive(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_SpeakerActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpeakerActive' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getSpeakerActive();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getSpeakerActive <em>Speaker Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker Active</em>' containment reference.
	 * @see #getSpeakerActive()
	 * @generated
	 */
	void setSpeakerActive(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Stop Information Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives information, if the stopInformation inside the vehicle is in active or in passiv state (intentionally, e.g. due to "route left)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Information Active</em>' containment reference.
	 * @see #setStopInformationActive(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_StopInformationActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopInformationActive' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getStopInformationActive();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getStopInformationActive <em>Stop Information Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Information Active</em>' containment reference.
	 * @see #getStopInformationActive()
	 * @generated
	 */
	void setStopInformationActive(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Trip State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
	 * @see #isSetTripState()
	 * @see #unsetTripState()
	 * @see #setTripState(TripStateEnumeration)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_TripState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TripState' namespace='##targetNamespace'"
	 * @generated
	 */
	TripStateEnumeration getTripState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripState <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
	 * @see #isSetTripState()
	 * @see #unsetTripState()
	 * @see #getTripState()
	 * @generated
	 */
	void setTripState(TripStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripState <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTripState()
	 * @see #getTripState()
	 * @see #setTripState(TripStateEnumeration)
	 * @generated
	 */
	void unsetTripState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripState <em>Trip State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trip State</em>' attribute is set.
	 * @see #unsetTripState()
	 * @see #getTripState()
	 * @see #setTripState(TripStateEnumeration)
	 * @generated
	 */
	boolean isSetTripState();

	/**
	 * Returns the value of the '<em><b>Global Display Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.DisplayContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global display content - this content should be used if no stop specific display content is available
	 * 					please make sure that the global display content and the stop specific content are provided for the same DisplayContentRefs. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Display Content</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getAllData_GlobalDisplayContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GlobalDisplayContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisplayContent> getGlobalDisplayContent();

} // AllData
