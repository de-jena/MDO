/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception.util;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage
 * @generated
 */
public class Xmla_exceptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xmla_exceptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_exceptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Xmla_exceptionPackage.eINSTANCE;
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
	protected Xmla_exceptionSwitch<Adapter> modelSwitch =
		new Xmla_exceptionSwitch<Adapter>() {
			@Override
			public Adapter caseEndType(EndType object) {
				return createEndTypeAdapter();
			}
			@Override
			public Adapter caseErrorType(ErrorType object) {
				return createErrorTypeAdapter();
			}
			@Override
			public Adapter caseException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseMessageLocation(MessageLocation object) {
				return createMessageLocationAdapter();
			}
			@Override
			public Adapter caseMessages(Messages object) {
				return createMessagesAdapter();
			}
			@Override
			public Adapter caseStartType(StartType object) {
				return createStartTypeAdapter();
			}
			@Override
			public Adapter caseWarningType(WarningType object) {
				return createWarningTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType
	 * @generated
	 */
	public Adapter createEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType
	 * @generated
	 */
	public Adapter createErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation <em>Message Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation
	 * @generated
	 */
	public Adapter createMessageLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages
	 * @generated
	 */
	public Adapter createMessagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType
	 * @generated
	 */
	public Adapter createStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType <em>Warning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType
	 * @generated
	 */
	public Adapter createWarningTypeAdapter() {
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

} //Xmla_exceptionAdapterFactory
