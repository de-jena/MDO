/**
 */
package de.jena.mdo.ibis.customerinformationservice.util;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import de.jena.mdo.ibis.customerinformationservice.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage
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
			public Adapter caseCustomerInformationServiceAllData(CustomerInformationServiceAllData object) {
				return createCustomerInformationServiceAllDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceCurrentAnnouncementData(CustomerInformationServiceCurrentAnnouncementData object) {
				return createCustomerInformationServiceCurrentAnnouncementDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceCurrentConnectionInformationData(CustomerInformationServiceCurrentConnectionInformationData object) {
				return createCustomerInformationServiceCurrentConnectionInformationDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceCurrentDisplayContentData(CustomerInformationServiceCurrentDisplayContentData object) {
				return createCustomerInformationServiceCurrentDisplayContentDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceCurrentStopIndexData(CustomerInformationServiceCurrentStopIndexData object) {
				return createCustomerInformationServiceCurrentStopIndexDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceCurrentStopPointData(CustomerInformationServiceCurrentStopPointData object) {
				return createCustomerInformationServiceCurrentStopPointDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetAllDataResponseStructure(CustomerInformationServiceGetAllDataResponseStructure object) {
				return createCustomerInformationServiceGetAllDataResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetCurrentAnnouncementResponseStructure(CustomerInformationServiceGetCurrentAnnouncementResponseStructure object) {
				return createCustomerInformationServiceGetCurrentAnnouncementResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetCurrentConnectionInformationResponseStructure(CustomerInformationServiceGetCurrentConnectionInformationResponseStructure object) {
				return createCustomerInformationServiceGetCurrentConnectionInformationResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetCurrentDisplayContentResponseStructure(CustomerInformationServiceGetCurrentDisplayContentResponseStructure object) {
				return createCustomerInformationServiceGetCurrentDisplayContentResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetCurrentStopIndexResponseStructure(CustomerInformationServiceGetCurrentStopIndexResponseStructure object) {
				return createCustomerInformationServiceGetCurrentStopIndexResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetCurrentStopPointResponseStructure(CustomerInformationServiceGetCurrentStopPointResponseStructure object) {
				return createCustomerInformationServiceGetCurrentStopPointResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetTripDataResponseStructure(CustomerInformationServiceGetTripDataResponseStructure object) {
				return createCustomerInformationServiceGetTripDataResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceGetVehicleDataResponseStructure(CustomerInformationServiceGetVehicleDataResponseStructure object) {
				return createCustomerInformationServiceGetVehicleDataResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServicePartialStopSequenceData(CustomerInformationServicePartialStopSequenceData object) {
				return createCustomerInformationServicePartialStopSequenceDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceRetrievePartialStopSequenceRequestStructure(CustomerInformationServiceRetrievePartialStopSequenceRequestStructure object) {
				return createCustomerInformationServiceRetrievePartialStopSequenceRequestStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceRetrievePartialStopSequenceResponseStructure(CustomerInformationServiceRetrievePartialStopSequenceResponseStructure object) {
				return createCustomerInformationServiceRetrievePartialStopSequenceResponseStructureAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceTripData(CustomerInformationServiceTripData object) {
				return createCustomerInformationServiceTripDataAdapter();
			}
			@Override
			public Adapter caseCustomerInformationServiceVehicleData(CustomerInformationServiceVehicleData object) {
				return createCustomerInformationServiceVehicleDataAdapter();
			}
			@Override
			public Adapter caseGeneralResponseStructure(GeneralResponseStructure object) {
				return createGeneralResponseStructureAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData <em>Customer Information Service All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceAllDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData <em>Customer Information Service Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceCurrentAnnouncementDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData <em>Customer Information Service Current Connection Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceCurrentConnectionInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData <em>Customer Information Service Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceCurrentDisplayContentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData <em>Customer Information Service Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceCurrentStopIndexDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData <em>Customer Information Service Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceCurrentStopPointDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure <em>Customer Information Service Get All Data Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetAllDataResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure <em>Customer Information Service Get Current Announcement Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetCurrentAnnouncementResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure <em>Customer Information Service Get Current Connection Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetCurrentConnectionInformationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure <em>Customer Information Service Get Current Display Content Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetCurrentDisplayContentResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure <em>Customer Information Service Get Current Stop Index Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetCurrentStopIndexResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure <em>Customer Information Service Get Current Stop Point Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetCurrentStopPointResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure <em>Customer Information Service Get Trip Data Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetTripDataResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure <em>Customer Information Service Get Vehicle Data Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceGetVehicleDataResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData <em>Customer Information Service Partial Stop Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData
	 * @generated
	 */
	public Adapter createCustomerInformationServicePartialStopSequenceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure <em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceRetrievePartialStopSequenceRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure <em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure
	 * @generated
	 */
	public Adapter createCustomerInformationServiceRetrievePartialStopSequenceResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData <em>Customer Information Service Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceTripDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData <em>Customer Information Service Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData
	 * @generated
	 */
	public Adapter createCustomerInformationServiceVehicleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.GeneralResponseStructure <em>General Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.GeneralResponseStructure
	 * @generated
	 */
	public Adapter createGeneralResponseStructureAdapter() {
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
