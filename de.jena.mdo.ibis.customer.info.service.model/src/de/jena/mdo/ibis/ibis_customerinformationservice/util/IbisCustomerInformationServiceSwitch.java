/**
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.util;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import de.jena.mdo.ibis.ibis_customerinformationservice.*;

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
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage
 * @generated
 */
public class IbisCustomerInformationServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisCustomerInformationServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisCustomerInformationServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = IbisCustomerInformationServicePackage.eINSTANCE;
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
			case IbisCustomerInformationServicePackage.ALL_DATA: {
				AllData allData = (AllData)theEObject;
				T result = caseAllData(allData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA: {
				CurrentAnnouncementData currentAnnouncementData = (CurrentAnnouncementData)theEObject;
				T result = caseCurrentAnnouncementData(currentAnnouncementData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_CONNECTION_INFORMATION_DATA: {
				CurrentConnectionInformationData currentConnectionInformationData = (CurrentConnectionInformationData)theEObject;
				T result = caseCurrentConnectionInformationData(currentConnectionInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_DISPLAY_CONTENT_DATA: {
				CurrentDisplayContentData currentDisplayContentData = (CurrentDisplayContentData)theEObject;
				T result = caseCurrentDisplayContentData(currentDisplayContentData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA: {
				CurrentStopIndexData currentStopIndexData = (CurrentStopIndexData)theEObject;
				T result = caseCurrentStopIndexData(currentStopIndexData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_DATA: {
				CurrentStopPointData currentStopPointData = (CurrentStopPointData)theEObject;
				T result = caseCurrentStopPointData(currentStopPointData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.ALL_DATA_RESPONSE: {
				AllDataResponse allDataResponse = (AllDataResponse)theEObject;
				T result = caseAllDataResponse(allDataResponse);
				if (result == null) result = caseGeneralResponse(allDataResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE: {
				CurrentAnnouncementResponse currentAnnouncementResponse = (CurrentAnnouncementResponse)theEObject;
				T result = caseCurrentAnnouncementResponse(currentAnnouncementResponse);
				if (result == null) result = caseGeneralResponse(currentAnnouncementResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_CONNECTION_INFORMATION_RESPONSE: {
				CurrentConnectionInformationResponse currentConnectionInformationResponse = (CurrentConnectionInformationResponse)theEObject;
				T result = caseCurrentConnectionInformationResponse(currentConnectionInformationResponse);
				if (result == null) result = caseGeneralResponse(currentConnectionInformationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_DISPLAY_CONTENT_RESPONSE: {
				CurrentDisplayContentResponse currentDisplayContentResponse = (CurrentDisplayContentResponse)theEObject;
				T result = caseCurrentDisplayContentResponse(currentDisplayContentResponse);
				if (result == null) result = caseGeneralResponse(currentDisplayContentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_RESPONSE: {
				CurrentStopIndexResponse currentStopIndexResponse = (CurrentStopIndexResponse)theEObject;
				T result = caseCurrentStopIndexResponse(currentStopIndexResponse);
				if (result == null) result = caseGeneralResponse(currentStopIndexResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE: {
				CurrentStopPointResponse currentStopPointResponse = (CurrentStopPointResponse)theEObject;
				T result = caseCurrentStopPointResponse(currentStopPointResponse);
				if (result == null) result = caseGeneralResponse(currentStopPointResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.TRIP_DATA_RESPONSE: {
				TripDataResponse tripDataResponse = (TripDataResponse)theEObject;
				T result = caseTripDataResponse(tripDataResponse);
				if (result == null) result = caseGeneralResponse(tripDataResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE: {
				VehicleDataResponse vehicleDataResponse = (VehicleDataResponse)theEObject;
				T result = caseVehicleDataResponse(vehicleDataResponse);
				if (result == null) result = caseGeneralResponse(vehicleDataResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA: {
				PartialStopSequenceData partialStopSequenceData = (PartialStopSequenceData)theEObject;
				T result = casePartialStopSequenceData(partialStopSequenceData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_REQUEST: {
				PartialStopSequenceRequest partialStopSequenceRequest = (PartialStopSequenceRequest)theEObject;
				T result = casePartialStopSequenceRequest(partialStopSequenceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE: {
				PartialStopSequenceResponse partialStopSequenceResponse = (PartialStopSequenceResponse)theEObject;
				T result = casePartialStopSequenceResponse(partialStopSequenceResponse);
				if (result == null) result = caseGeneralResponse(partialStopSequenceResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.TRIP_DATA: {
				TripData tripData = (TripData)theEObject;
				T result = caseTripData(tripData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCustomerInformationServicePackage.VEHICLE_DATA: {
				VehicleData vehicleData = (VehicleData)theEObject;
				T result = caseVehicleData(vehicleData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllData(AllData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Announcement Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Announcement Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentAnnouncementData(CurrentAnnouncementData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Connection Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Connection Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentConnectionInformationData(CurrentConnectionInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Display Content Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Display Content Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentDisplayContentData(CurrentDisplayContentData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Stop Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Stop Index Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStopIndexData(CurrentStopIndexData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Stop Point Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Stop Point Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStopPointData(CurrentStopPointData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Data Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllDataResponse(AllDataResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Announcement Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Announcement Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentAnnouncementResponse(CurrentAnnouncementResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Connection Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Connection Information Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentConnectionInformationResponse(CurrentConnectionInformationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Display Content Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Display Content Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentDisplayContentResponse(CurrentDisplayContentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Stop Index Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Stop Index Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStopIndexResponse(CurrentStopIndexResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Stop Point Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Stop Point Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStopPointResponse(CurrentStopPointResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Data Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripDataResponse(TripDataResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Data Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleDataResponse(VehicleDataResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Stop Sequence Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Stop Sequence Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialStopSequenceData(PartialStopSequenceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Stop Sequence Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Stop Sequence Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialStopSequenceRequest(PartialStopSequenceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Stop Sequence Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Stop Sequence Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialStopSequenceResponse(PartialStopSequenceResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripData(TripData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleData(VehicleData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResponse(GeneralResponse object) {
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

} //IbisCustomerInformationServiceSwitch
