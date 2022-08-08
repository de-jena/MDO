/**
 */
package org.eclipse.daanse.xmla.model.ecore.ext.impl;

import org.eclipse.daanse.xmla.model.ecore.ext.*;

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
public class ExtFactoryImpl extends EFactoryImpl implements ExtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtFactory init() {
		try {
			ExtFactory theExtFactory = (ExtFactory)EPackage.Registry.INSTANCE.getEFactory(ExtPackage.eNS_URI);
			if (theExtFactory != null) {
				return theExtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtFactoryImpl() {
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
			case ExtPackage.AUTHENTICATE_RESPONSE_TYPE: return createAuthenticateResponseType();
			case ExtPackage.AUTHENTICATE_TYPE: return createAuthenticateType();
			case ExtPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ExtPackage.RETURN_TYPE: return createReturnType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticateResponseType createAuthenticateResponseType() {
		AuthenticateResponseTypeImpl authenticateResponseType = new AuthenticateResponseTypeImpl();
		return authenticateResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticateType createAuthenticateType() {
		AuthenticateTypeImpl authenticateType = new AuthenticateTypeImpl();
		return authenticateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtPackage getExtPackage() {
		return (ExtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtPackage getPackage() {
		return ExtPackage.eINSTANCE;
	}

} //ExtFactoryImpl
