/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionFactory;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xmla_exceptionFactoryImpl extends EFactoryImpl implements Xmla_exceptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xmla_exceptionFactory init() {
		try {
			Xmla_exceptionFactory theXmla_exceptionFactory = (Xmla_exceptionFactory)EPackage.Registry.INSTANCE.getEFactory(Xmla_exceptionPackage.eNS_URI);
			if (theXmla_exceptionFactory != null) {
				return theXmla_exceptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xmla_exceptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_exceptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Xmla_exceptionPackage.END_TYPE: return createEndType();
			case Xmla_exceptionPackage.ERROR_TYPE: return createErrorType();
			case Xmla_exceptionPackage.EXCEPTION: return createException();
			case Xmla_exceptionPackage.MESSAGE_LOCATION: return createMessageLocation();
			case Xmla_exceptionPackage.MESSAGES: return createMessages();
			case Xmla_exceptionPackage.START_TYPE: return createStartType();
			case Xmla_exceptionPackage.WARNING_TYPE: return createWarningType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndType createEndType() {
		EndTypeImpl endType = new EndTypeImpl();
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLocation createMessageLocation() {
		MessageLocationImpl messageLocation = new MessageLocationImpl();
		return messageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messages createMessages() {
		MessagesImpl messages = new MessagesImpl();
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartType createStartType() {
		StartTypeImpl startType = new StartTypeImpl();
		return startType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningType createWarningType() {
		WarningTypeImpl warningType = new WarningTypeImpl();
		return warningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_exceptionPackage getXmla_exceptionPackage() {
		return (Xmla_exceptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xmla_exceptionPackage getPackage() {
		return Xmla_exceptionPackage.eINSTANCE;
	}

} //Xmla_exceptionFactoryImpl
