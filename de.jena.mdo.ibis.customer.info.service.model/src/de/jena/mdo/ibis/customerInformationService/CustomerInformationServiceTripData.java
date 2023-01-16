/*
 */
package de.jena.mdo.ibis.customerInformationService;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPLanguage;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.TripInformationStructure;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Trip Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getTripInformation <em>Trip Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceTripData()
 * @model extendedMetaData="name='CustomerInformationService.TripData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceTripData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceTripData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getTimeStamp <em>Time Stamp</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceTripData_VehicleRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VehicleRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getVehicleRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getVehicleRef <em>Vehicle Ref</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceTripData_DefaultLanguage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DefaultLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPLanguage getDefaultLanguage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getDefaultLanguage <em>Default Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Language</em>' containment reference.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(IBISIPLanguage value);

	/**
	 * Returns the value of the '<em><b>Trip Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Information</em>' containment reference.
	 * @see #setTripInformation(TripInformationStructure)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceTripData_TripInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TripInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TripInformationStructure getTripInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getTripInformation <em>Trip Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Information</em>' containment reference.
	 * @see #getTripInformation()
	 * @generated
	 */
	void setTripInformation(TripInformationStructure value);

	/**
	 * Returns the value of the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index of the Stoppoint in the Stopsequence, which is the next Stop in the first trip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #setCurrentStopIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage#getCustomerInformationServiceTripData_CurrentStopIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentStopIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceTripData#getCurrentStopIndex <em>Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index</em>' containment reference.
	 * @see #getCurrentStopIndex()
	 * @generated
	 */
	void setCurrentStopIndex(IBISIPInt value);

} // CustomerInformationServiceTripData
