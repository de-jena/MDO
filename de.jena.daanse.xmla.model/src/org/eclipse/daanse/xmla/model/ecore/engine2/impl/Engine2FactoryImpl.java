/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine2.impl;

import org.eclipse.daanse.xmla.model.ecore.engine2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Engine2FactoryImpl extends EFactoryImpl implements Engine2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Engine2Factory init() {
		try {
			Engine2Factory theEngine2Factory = (Engine2Factory)EPackage.Registry.INSTANCE.getEFactory(Engine2Package.eNS_URI);
			if (theEngine2Factory != null) {
				return theEngine2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Engine2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine2FactoryImpl() {
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
			case Engine2Package.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Engine2Package.MEMBER_KEYS_UNIQUE_TYPE:
				return createMemberKeysUniqueTypeFromString(eDataType, initialValue);
			case Engine2Package.MEMBER_KEYS_UNIQUE_TYPE_OBJECT:
				return createMemberKeysUniqueTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Engine2Package.MEMBER_KEYS_UNIQUE_TYPE:
				return convertMemberKeysUniqueTypeToString(eDataType, instanceValue);
			case Engine2Package.MEMBER_KEYS_UNIQUE_TYPE_OBJECT:
				return convertMemberKeysUniqueTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public MemberKeysUniqueType createMemberKeysUniqueTypeFromString(EDataType eDataType, String initialValue) {
		MemberKeysUniqueType result = MemberKeysUniqueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberKeysUniqueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberKeysUniqueType createMemberKeysUniqueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMemberKeysUniqueTypeFromString(Engine2Package.Literals.MEMBER_KEYS_UNIQUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberKeysUniqueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMemberKeysUniqueTypeToString(Engine2Package.Literals.MEMBER_KEYS_UNIQUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine2Package getEngine2Package() {
		return (Engine2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Engine2Package getPackage() {
		return Engine2Package.eINSTANCE;
	}

} //Engine2FactoryImpl
