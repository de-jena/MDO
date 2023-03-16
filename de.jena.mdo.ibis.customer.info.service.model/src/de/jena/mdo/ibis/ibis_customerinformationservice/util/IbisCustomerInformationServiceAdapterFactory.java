/**
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.util;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import de.jena.mdo.ibis.ibis_customerinformationservice.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage
 * @generated
 */
public class IbisCustomerInformationServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisCustomerInformationServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisCustomerInformationServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IbisCustomerInformationServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IbisCustomerInformationServiceSwitch<Adapter> modelSwitch =
		new IbisCustomerInformationServiceSwitch<Adapter>() {
			@Override
			public Adapter caseAllData(AllData object) {
				return createAllDataAdapter();
			}
			@Override
			public Adapter caseCurrentAnnouncementData(CurrentAnnouncementData object) {
				return createCurrentAnnouncementDataAdapter();
			}
			@Override
			public Adapter caseCurrentConnectionInformationData(CurrentConnectionInformationData object) {
				return createCurrentConnectionInformationDataAdapter();
			}
			@Override
			public Adapter caseCurrentDisplayContentData(CurrentDisplayContentData object) {
				return createCurrentDisplayContentDataAdapter();
			}
			@Override
			public Adapter caseCurrentStopIndexData(CurrentStopIndexData object) {
				return createCurrentStopIndexDataAdapter();
			}
			@Override
			public Adapter caseCurrentStopPointData(CurrentStopPointData object) {
				return createCurrentStopPointDataAdapter();
			}
			@Override
			public Adapter caseAllDataResponse(AllDataResponse object) {
				return createAllDataResponseAdapter();
			}
			@Override
			public Adapter caseCurrentAnnouncementResponse(CurrentAnnouncementResponse object) {
				return createCurrentAnnouncementResponseAdapter();
			}
			@Override
			public Adapter caseCurrentConnectionInformationResponse(CurrentConnectionInformationResponse object) {
				return createCurrentConnectionInformationResponseAdapter();
			}
			@Override
			public Adapter caseCurrentDisplayContentResponse(CurrentDisplayContentResponse object) {
				return createCurrentDisplayContentResponseAdapter();
			}
			@Override
			public Adapter caseCurrentStopIndexResponse(CurrentStopIndexResponse object) {
				return createCurrentStopIndexResponseAdapter();
			}
			@Override
			public Adapter caseCurrentStopPointResponse(CurrentStopPointResponse object) {
				return createCurrentStopPointResponseAdapter();
			}
			@Override
			public Adapter caseTripDataResponse(TripDataResponse object) {
				return createTripDataResponseAdapter();
			}
			@Override
			public Adapter caseVehicleDataResponse(VehicleDataResponse object) {
				return createVehicleDataResponseAdapter();
			}
			@Override
			public Adapter casePartialStopSequenceData(PartialStopSequenceData object) {
				return createPartialStopSequenceDataAdapter();
			}
			@Override
			public Adapter casePartialStopSequenceRequest(PartialStopSequenceRequest object) {
				return createPartialStopSequenceRequestAdapter();
			}
			@Override
			public Adapter casePartialStopSequenceResponse(PartialStopSequenceResponse object) {
				return createPartialStopSequenceResponseAdapter();
			}
			@Override
			public Adapter caseTripData(TripData object) {
				return createTripDataAdapter();
			}
			@Override
			public Adapter caseVehicleData(VehicleData object) {
				return createVehicleDataAdapter();
			}
			@Override
			public Adapter caseGeneralResponse(GeneralResponse object) {
				return createGeneralResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData <em>All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData
	 * @generated
	 */
	public Adapter createAllDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData <em>Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData
	 * @generated
	 */
	public Adapter createCurrentAnnouncementDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData <em>Current Connection Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData
	 * @generated
	 */
	public Adapter createCurrentConnectionInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData <em>Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData
	 * @generated
	 */
	public Adapter createCurrentDisplayContentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData <em>Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData
	 * @generated
	 */
	public Adapter createCurrentStopIndexDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData <em>Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData
	 * @generated
	 */
	public Adapter createCurrentStopPointDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse <em>All Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse
	 * @generated
	 */
	public Adapter createAllDataResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse <em>Current Announcement Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse
	 * @generated
	 */
	public Adapter createCurrentAnnouncementResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse <em>Current Connection Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse
	 * @generated
	 */
	public Adapter createCurrentConnectionInformationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse <em>Current Display Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse
	 * @generated
	 */
	public Adapter createCurrentDisplayContentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse <em>Current Stop Index Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse
	 * @generated
	 */
	public Adapter createCurrentStopIndexResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse <em>Current Stop Point Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse
	 * @generated
	 */
	public Adapter createCurrentStopPointResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse <em>Trip Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse
	 * @generated
	 */
	public Adapter createTripDataResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse <em>Vehicle Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse
	 * @generated
	 */
	public Adapter createVehicleDataResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData <em>Partial Stop Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData
	 * @generated
	 */
	public Adapter createPartialStopSequenceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest <em>Partial Stop Sequence Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest
	 * @generated
	 */
	public Adapter createPartialStopSequenceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse <em>Partial Stop Sequence Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse
	 * @generated
	 */
	public Adapter createPartialStopSequenceResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData <em>Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData
	 * @generated
	 */
	public Adapter createTripDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData <em>Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData
	 * @generated
	 */
	public Adapter createVehicleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.GeneralResponse <em>General Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.GeneralResponse
	 * @generated
	 */
	public Adapter createGeneralResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IbisCustomerInformationServiceAdapterFactory
