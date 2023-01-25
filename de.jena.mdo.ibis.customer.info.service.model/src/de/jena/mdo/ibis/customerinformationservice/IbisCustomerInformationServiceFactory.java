/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage
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
	IbisCustomerInformationServiceFactory eINSTANCE = de.jena.mdo.ibis.customerinformationservice.impl.IbisCustomerInformationServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customer Information Service All Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service All Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceAllData createCustomerInformationServiceAllData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Current Announcement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Current Announcement Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceCurrentAnnouncementData createCustomerInformationServiceCurrentAnnouncementData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Current Connection Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Current Connection Information Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceCurrentConnectionInformationData createCustomerInformationServiceCurrentConnectionInformationData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Current Display Content Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Current Display Content Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceCurrentDisplayContentData createCustomerInformationServiceCurrentDisplayContentData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Current Stop Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Current Stop Index Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceCurrentStopIndexData createCustomerInformationServiceCurrentStopIndexData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Current Stop Point Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Current Stop Point Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceCurrentStopPointData createCustomerInformationServiceCurrentStopPointData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get All Data Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get All Data Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetAllDataResponseStructure createCustomerInformationServiceGetAllDataResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Current Announcement Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Current Announcement Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetCurrentAnnouncementResponseStructure createCustomerInformationServiceGetCurrentAnnouncementResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Current Connection Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Current Connection Information Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetCurrentConnectionInformationResponseStructure createCustomerInformationServiceGetCurrentConnectionInformationResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Current Display Content Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Current Display Content Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetCurrentDisplayContentResponseStructure createCustomerInformationServiceGetCurrentDisplayContentResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Current Stop Index Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Current Stop Index Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetCurrentStopIndexResponseStructure createCustomerInformationServiceGetCurrentStopIndexResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Current Stop Point Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Current Stop Point Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetCurrentStopPointResponseStructure createCustomerInformationServiceGetCurrentStopPointResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Trip Data Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Trip Data Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetTripDataResponseStructure createCustomerInformationServiceGetTripDataResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Get Vehicle Data Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Get Vehicle Data Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceGetVehicleDataResponseStructure createCustomerInformationServiceGetVehicleDataResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Partial Stop Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Partial Stop Sequence Data</em>'.
	 * @generated
	 */
	CustomerInformationServicePartialStopSequenceData createCustomerInformationServicePartialStopSequenceData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceRetrievePartialStopSequenceRequestStructure createCustomerInformationServiceRetrievePartialStopSequenceRequestStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>'.
	 * @generated
	 */
	CustomerInformationServiceRetrievePartialStopSequenceResponseStructure createCustomerInformationServiceRetrievePartialStopSequenceResponseStructure();

	/**
	 * Returns a new object of class '<em>Customer Information Service Trip Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Trip Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceTripData createCustomerInformationServiceTripData();

	/**
	 * Returns a new object of class '<em>Customer Information Service Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Information Service Vehicle Data</em>'.
	 * @generated
	 */
	CustomerInformationServiceVehicleData createCustomerInformationServiceVehicleData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisCustomerInformationServicePackage getIbisCustomerInformationServicePackage();

} //IbisCustomerInformationServiceFactory
