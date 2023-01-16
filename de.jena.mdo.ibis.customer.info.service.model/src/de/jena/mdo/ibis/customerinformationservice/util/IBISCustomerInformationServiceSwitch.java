/**
 */
package de.jena.mdo.ibis.customerinformationservice.util;

import de.jena.mdo.ibis.customerinformationservice.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage
 * @generated
 */
public class IBISCustomerInformationServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IBISCustomerInformationServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBISCustomerInformationServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = IBISCustomerInformationServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_ALL_DATA: {
				CustomerInformationServiceAllData customerInformationServiceAllData = (CustomerInformationServiceAllData)theEObject;
				T result = caseCustomerInformationServiceAllData(customerInformationServiceAllData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA: {
				CustomerInformationServiceCurrentAnnouncementData customerInformationServiceCurrentAnnouncementData = (CustomerInformationServiceCurrentAnnouncementData)theEObject;
				T result = caseCustomerInformationServiceCurrentAnnouncementData(customerInformationServiceCurrentAnnouncementData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA: {
				CustomerInformationServiceCurrentConnectionInformationData customerInformationServiceCurrentConnectionInformationData = (CustomerInformationServiceCurrentConnectionInformationData)theEObject;
				T result = caseCustomerInformationServiceCurrentConnectionInformationData(customerInformationServiceCurrentConnectionInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA: {
				CustomerInformationServiceCurrentDisplayContentData customerInformationServiceCurrentDisplayContentData = (CustomerInformationServiceCurrentDisplayContentData)theEObject;
				T result = caseCustomerInformationServiceCurrentDisplayContentData(customerInformationServiceCurrentDisplayContentData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA: {
				CustomerInformationServiceCurrentStopIndexData customerInformationServiceCurrentStopIndexData = (CustomerInformationServiceCurrentStopIndexData)theEObject;
				T result = caseCustomerInformationServiceCurrentStopIndexData(customerInformationServiceCurrentStopIndexData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA: {
				CustomerInformationServiceCurrentStopPointData customerInformationServiceCurrentStopPointData = (CustomerInformationServiceCurrentStopPointData)theEObject;
				T result = caseCustomerInformationServiceCurrentStopPointData(customerInformationServiceCurrentStopPointData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetAllDataResponseStructure customerInformationServiceGetAllDataResponseStructure = (CustomerInformationServiceGetAllDataResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetAllDataResponseStructure(customerInformationServiceGetAllDataResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetCurrentAnnouncementResponseStructure customerInformationServiceGetCurrentAnnouncementResponseStructure = (CustomerInformationServiceGetCurrentAnnouncementResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetCurrentAnnouncementResponseStructure(customerInformationServiceGetCurrentAnnouncementResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetCurrentConnectionInformationResponseStructure customerInformationServiceGetCurrentConnectionInformationResponseStructure = (CustomerInformationServiceGetCurrentConnectionInformationResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetCurrentConnectionInformationResponseStructure(customerInformationServiceGetCurrentConnectionInformationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetCurrentDisplayContentResponseStructure customerInformationServiceGetCurrentDisplayContentResponseStructure = (CustomerInformationServiceGetCurrentDisplayContentResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetCurrentDisplayContentResponseStructure(customerInformationServiceGetCurrentDisplayContentResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetCurrentStopIndexResponseStructure customerInformationServiceGetCurrentStopIndexResponseStructure = (CustomerInformationServiceGetCurrentStopIndexResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetCurrentStopIndexResponseStructure(customerInformationServiceGetCurrentStopIndexResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetCurrentStopPointResponseStructure customerInformationServiceGetCurrentStopPointResponseStructure = (CustomerInformationServiceGetCurrentStopPointResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetCurrentStopPointResponseStructure(customerInformationServiceGetCurrentStopPointResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetTripDataResponseStructure customerInformationServiceGetTripDataResponseStructure = (CustomerInformationServiceGetTripDataResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetTripDataResponseStructure(customerInformationServiceGetTripDataResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE: {
				CustomerInformationServiceGetVehicleDataResponseStructure customerInformationServiceGetVehicleDataResponseStructure = (CustomerInformationServiceGetVehicleDataResponseStructure)theEObject;
				T result = caseCustomerInformationServiceGetVehicleDataResponseStructure(customerInformationServiceGetVehicleDataResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA: {
				CustomerInformationServicePartialStopSequenceData customerInformationServicePartialStopSequenceData = (CustomerInformationServicePartialStopSequenceData)theEObject;
				T result = caseCustomerInformationServicePartialStopSequenceData(customerInformationServicePartialStopSequenceData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE: {
				CustomerInformationServiceRetrievePartialStopSequenceRequestStructure customerInformationServiceRetrievePartialStopSequenceRequestStructure = (CustomerInformationServiceRetrievePartialStopSequenceRequestStructure)theEObject;
				T result = caseCustomerInformationServiceRetrievePartialStopSequenceRequestStructure(customerInformationServiceRetrievePartialStopSequenceRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE: {
				CustomerInformationServiceRetrievePartialStopSequenceResponseStructure customerInformationServiceRetrievePartialStopSequenceResponseStructure = (CustomerInformationServiceRetrievePartialStopSequenceResponseStructure)theEObject;
				T result = caseCustomerInformationServiceRetrievePartialStopSequenceResponseStructure(customerInformationServiceRetrievePartialStopSequenceResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA: {
				CustomerInformationServiceTripData customerInformationServiceTripData = (CustomerInformationServiceTripData)theEObject;
				T result = caseCustomerInformationServiceTripData(customerInformationServiceTripData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA: {
				CustomerInformationServiceVehicleData customerInformationServiceVehicleData = (CustomerInformationServiceVehicleData)theEObject;
				T result = caseCustomerInformationServiceVehicleData(customerInformationServiceVehicleData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service All Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service All Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceAllData(CustomerInformationServiceAllData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Current Announcement Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Current Announcement Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceCurrentAnnouncementData(CustomerInformationServiceCurrentAnnouncementData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Current Connection Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Current Connection Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceCurrentConnectionInformationData(CustomerInformationServiceCurrentConnectionInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Current Display Content Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Current Display Content Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceCurrentDisplayContentData(CustomerInformationServiceCurrentDisplayContentData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Current Stop Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Current Stop Index Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceCurrentStopIndexData(CustomerInformationServiceCurrentStopIndexData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Current Stop Point Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Current Stop Point Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceCurrentStopPointData(CustomerInformationServiceCurrentStopPointData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get All Data Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get All Data Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetAllDataResponseStructure(CustomerInformationServiceGetAllDataResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Announcement Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Announcement Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetCurrentAnnouncementResponseStructure(CustomerInformationServiceGetCurrentAnnouncementResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Connection Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Connection Information Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetCurrentConnectionInformationResponseStructure(CustomerInformationServiceGetCurrentConnectionInformationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Display Content Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Display Content Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetCurrentDisplayContentResponseStructure(CustomerInformationServiceGetCurrentDisplayContentResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Stop Index Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Stop Index Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetCurrentStopIndexResponseStructure(CustomerInformationServiceGetCurrentStopIndexResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Stop Point Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Current Stop Point Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetCurrentStopPointResponseStructure(CustomerInformationServiceGetCurrentStopPointResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Trip Data Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Trip Data Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetTripDataResponseStructure(CustomerInformationServiceGetTripDataResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Get Vehicle Data Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Get Vehicle Data Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceGetVehicleDataResponseStructure(CustomerInformationServiceGetVehicleDataResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Partial Stop Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Partial Stop Sequence Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServicePartialStopSequenceData(CustomerInformationServicePartialStopSequenceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceRetrievePartialStopSequenceRequestStructure(CustomerInformationServiceRetrievePartialStopSequenceRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceRetrievePartialStopSequenceResponseStructure(CustomerInformationServiceRetrievePartialStopSequenceResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Trip Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Trip Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceTripData(CustomerInformationServiceTripData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Information Service Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Information Service Vehicle Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInformationServiceVehicleData(CustomerInformationServiceVehicleData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IBISCustomerInformationServiceSwitch
