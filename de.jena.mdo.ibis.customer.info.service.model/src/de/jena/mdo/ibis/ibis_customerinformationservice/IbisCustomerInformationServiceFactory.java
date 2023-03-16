/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage
 * @generated
 */
@ProviderType
public interface IbisCustomerInformationServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisCustomerInformationServiceFactory eINSTANCE = de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>All Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Data</em>'.
	 * @generated
	 */
	AllData createAllData();

	/**
	 * Returns a new object of class '<em>Current Announcement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Announcement Data</em>'.
	 * @generated
	 */
	CurrentAnnouncementData createCurrentAnnouncementData();

	/**
	 * Returns a new object of class '<em>Current Connection Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Connection Information Data</em>'.
	 * @generated
	 */
	CurrentConnectionInformationData createCurrentConnectionInformationData();

	/**
	 * Returns a new object of class '<em>Current Display Content Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Display Content Data</em>'.
	 * @generated
	 */
	CurrentDisplayContentData createCurrentDisplayContentData();

	/**
	 * Returns a new object of class '<em>Current Stop Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Stop Index Data</em>'.
	 * @generated
	 */
	CurrentStopIndexData createCurrentStopIndexData();

	/**
	 * Returns a new object of class '<em>Current Stop Point Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Stop Point Data</em>'.
	 * @generated
	 */
	CurrentStopPointData createCurrentStopPointData();

	/**
	 * Returns a new object of class '<em>All Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Data Response</em>'.
	 * @generated
	 */
	AllDataResponse createAllDataResponse();

	/**
	 * Returns a new object of class '<em>Current Announcement Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Announcement Response</em>'.
	 * @generated
	 */
	CurrentAnnouncementResponse createCurrentAnnouncementResponse();

	/**
	 * Returns a new object of class '<em>Current Connection Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Connection Information Response</em>'.
	 * @generated
	 */
	CurrentConnectionInformationResponse createCurrentConnectionInformationResponse();

	/**
	 * Returns a new object of class '<em>Current Display Content Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Display Content Response</em>'.
	 * @generated
	 */
	CurrentDisplayContentResponse createCurrentDisplayContentResponse();

	/**
	 * Returns a new object of class '<em>Current Stop Index Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Stop Index Response</em>'.
	 * @generated
	 */
	CurrentStopIndexResponse createCurrentStopIndexResponse();

	/**
	 * Returns a new object of class '<em>Current Stop Point Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Stop Point Response</em>'.
	 * @generated
	 */
	CurrentStopPointResponse createCurrentStopPointResponse();

	/**
	 * Returns a new object of class '<em>Trip Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Data Response</em>'.
	 * @generated
	 */
	TripDataResponse createTripDataResponse();

	/**
	 * Returns a new object of class '<em>Vehicle Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Data Response</em>'.
	 * @generated
	 */
	VehicleDataResponse createVehicleDataResponse();

	/**
	 * Returns a new object of class '<em>Partial Stop Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Stop Sequence Data</em>'.
	 * @generated
	 */
	PartialStopSequenceData createPartialStopSequenceData();

	/**
	 * Returns a new object of class '<em>Partial Stop Sequence Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Stop Sequence Request</em>'.
	 * @generated
	 */
	PartialStopSequenceRequest createPartialStopSequenceRequest();

	/**
	 * Returns a new object of class '<em>Partial Stop Sequence Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Stop Sequence Response</em>'.
	 * @generated
	 */
	PartialStopSequenceResponse createPartialStopSequenceResponse();

	/**
	 * Returns a new object of class '<em>Trip Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Data</em>'.
	 * @generated
	 */
	TripData createTripData();

	/**
	 * Returns a new object of class '<em>Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Data</em>'.
	 * @generated
	 */
	VehicleData createVehicleData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisCustomerInformationServicePackage getIbisCustomerInformationServicePackage();

} //IbisCustomerInformationServiceFactory
