/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine.impl;

import org.eclipse.daanse.xmla.model.ecore.engine.*;

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
public class EngineFactoryImpl extends EFactoryImpl implements EngineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EngineFactory init() {
		try {
			EngineFactory theEngineFactory = (EngineFactory)EPackage.Registry.INSTANCE.getEFactory(EnginePackage.eNS_URI);
			if (theEngineFactory != null) {
				return theEngineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EngineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineFactoryImpl() {
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
			case EnginePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case EnginePackage.IMPERSONATION_INFO: return createImpersonationInfo();
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
			case EnginePackage.IMPERSONATION_INFO_SECURITY_TYPE:
				return createImpersonationInfoSecurityTypeFromString(eDataType, initialValue);
			case EnginePackage.IMPERSONATION_MODE_TYPE:
				return createImpersonationModeTypeFromString(eDataType, initialValue);
			case EnginePackage.IMPERSONATION_INFO_SECURITY_TYPE_OBJECT:
				return createImpersonationInfoSecurityTypeObjectFromString(eDataType, initialValue);
			case EnginePackage.IMPERSONATION_MODE_TYPE_OBJECT:
				return createImpersonationModeTypeObjectFromString(eDataType, initialValue);
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
			case EnginePackage.IMPERSONATION_INFO_SECURITY_TYPE:
				return convertImpersonationInfoSecurityTypeToString(eDataType, instanceValue);
			case EnginePackage.IMPERSONATION_MODE_TYPE:
				return convertImpersonationModeTypeToString(eDataType, instanceValue);
			case EnginePackage.IMPERSONATION_INFO_SECURITY_TYPE_OBJECT:
				return convertImpersonationInfoSecurityTypeObjectToString(eDataType, instanceValue);
			case EnginePackage.IMPERSONATION_MODE_TYPE_OBJECT:
				return convertImpersonationModeTypeObjectToString(eDataType, instanceValue);
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
	public ImpersonationInfo createImpersonationInfo() {
		ImpersonationInfoImpl impersonationInfo = new ImpersonationInfoImpl();
		return impersonationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfoSecurityType createImpersonationInfoSecurityTypeFromString(EDataType eDataType, String initialValue) {
		ImpersonationInfoSecurityType result = ImpersonationInfoSecurityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpersonationInfoSecurityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationModeType createImpersonationModeTypeFromString(EDataType eDataType, String initialValue) {
		ImpersonationModeType result = ImpersonationModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpersonationModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfoSecurityType createImpersonationInfoSecurityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImpersonationInfoSecurityTypeFromString(EnginePackage.Literals.IMPERSONATION_INFO_SECURITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpersonationInfoSecurityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImpersonationInfoSecurityTypeToString(EnginePackage.Literals.IMPERSONATION_INFO_SECURITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationModeType createImpersonationModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImpersonationModeTypeFromString(EnginePackage.Literals.IMPERSONATION_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpersonationModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImpersonationModeTypeToString(EnginePackage.Literals.IMPERSONATION_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnginePackage getEnginePackage() {
		return (EnginePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnginePackage getPackage() {
		return EnginePackage.eINSTANCE;
	}

} //EngineFactoryImpl
