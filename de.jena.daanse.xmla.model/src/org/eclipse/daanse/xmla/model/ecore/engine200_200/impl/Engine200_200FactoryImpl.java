/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.*;

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
public class Engine200_200FactoryImpl extends EFactoryImpl implements Engine200_200Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Engine200_200Factory init() {
		try {
			Engine200_200Factory theEngine200_200Factory = (Engine200_200Factory)EPackage.Registry.INSTANCE.getEFactory(Engine200_200Package.eNS_URI);
			if (theEngine200_200Factory != null) {
				return theEngine200_200Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Engine200_200FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine200_200FactoryImpl() {
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
			case Engine200_200Package.EXPRESSION_BINDING: return createExpressionBinding();
			case Engine200_200Package.ROW_NUMBER_BINDING: return createRowNumberBinding();
			case Engine200_200Package.DOCUMENT_ROOT: return createDocumentRoot();
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
			case Engine200_200Package.PROCESSING_RECOMMENDATION_TYPE:
				return createProcessingRecommendationTypeFromString(eDataType, initialValue);
			case Engine200_200Package.PROCESSING_STATE_TYPE:
				return createProcessingStateTypeFromString(eDataType, initialValue);
			case Engine200_200Package.SHARE_DIMENSION_STORAGE_TYPE:
				return createShareDimensionStorageTypeFromString(eDataType, initialValue);
			case Engine200_200Package.STORAGE_ENGINE_USED_TYPE:
				return createStorageEngineUsedTypeFromString(eDataType, initialValue);
			case Engine200_200Package.PROCESSING_RECOMMENDATION_TYPE_OBJECT:
				return createProcessingRecommendationTypeObjectFromString(eDataType, initialValue);
			case Engine200_200Package.PROCESSING_STATE_TYPE_OBJECT:
				return createProcessingStateTypeObjectFromString(eDataType, initialValue);
			case Engine200_200Package.SHARE_DIMENSION_STORAGE_TYPE_OBJECT:
				return createShareDimensionStorageTypeObjectFromString(eDataType, initialValue);
			case Engine200_200Package.STORAGE_ENGINE_USED_TYPE_OBJECT:
				return createStorageEngineUsedTypeObjectFromString(eDataType, initialValue);
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
			case Engine200_200Package.PROCESSING_RECOMMENDATION_TYPE:
				return convertProcessingRecommendationTypeToString(eDataType, instanceValue);
			case Engine200_200Package.PROCESSING_STATE_TYPE:
				return convertProcessingStateTypeToString(eDataType, instanceValue);
			case Engine200_200Package.SHARE_DIMENSION_STORAGE_TYPE:
				return convertShareDimensionStorageTypeToString(eDataType, instanceValue);
			case Engine200_200Package.STORAGE_ENGINE_USED_TYPE:
				return convertStorageEngineUsedTypeToString(eDataType, instanceValue);
			case Engine200_200Package.PROCESSING_RECOMMENDATION_TYPE_OBJECT:
				return convertProcessingRecommendationTypeObjectToString(eDataType, instanceValue);
			case Engine200_200Package.PROCESSING_STATE_TYPE_OBJECT:
				return convertProcessingStateTypeObjectToString(eDataType, instanceValue);
			case Engine200_200Package.SHARE_DIMENSION_STORAGE_TYPE_OBJECT:
				return convertShareDimensionStorageTypeObjectToString(eDataType, instanceValue);
			case Engine200_200Package.STORAGE_ENGINE_USED_TYPE_OBJECT:
				return convertStorageEngineUsedTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBinding createExpressionBinding() {
		ExpressionBindingImpl expressionBinding = new ExpressionBindingImpl();
		return expressionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowNumberBinding createRowNumberBinding() {
		RowNumberBindingImpl rowNumberBinding = new RowNumberBindingImpl();
		return rowNumberBinding;
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
	public ProcessingRecommendationType createProcessingRecommendationTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingRecommendationType result = ProcessingRecommendationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingRecommendationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType createProcessingStateTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingStateType result = ProcessingStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareDimensionStorageType createShareDimensionStorageTypeFromString(EDataType eDataType, String initialValue) {
		ShareDimensionStorageType result = ShareDimensionStorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareDimensionStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageEngineUsedType createStorageEngineUsedTypeFromString(EDataType eDataType, String initialValue) {
		StorageEngineUsedType result = StorageEngineUsedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageEngineUsedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingRecommendationType createProcessingRecommendationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessingRecommendationTypeFromString(Engine200_200Package.Literals.PROCESSING_RECOMMENDATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingRecommendationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingRecommendationTypeToString(Engine200_200Package.Literals.PROCESSING_RECOMMENDATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType createProcessingStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessingStateTypeFromString(Engine200_200Package.Literals.PROCESSING_STATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingStateTypeToString(Engine200_200Package.Literals.PROCESSING_STATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareDimensionStorageType createShareDimensionStorageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShareDimensionStorageTypeFromString(Engine200_200Package.Literals.SHARE_DIMENSION_STORAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareDimensionStorageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShareDimensionStorageTypeToString(Engine200_200Package.Literals.SHARE_DIMENSION_STORAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageEngineUsedType createStorageEngineUsedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStorageEngineUsedTypeFromString(Engine200_200Package.Literals.STORAGE_ENGINE_USED_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageEngineUsedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStorageEngineUsedTypeToString(Engine200_200Package.Literals.STORAGE_ENGINE_USED_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine200_200Package getEngine200_200Package() {
		return (Engine200_200Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Engine200_200Package getPackage() {
		return Engine200_200Package.eINSTANCE;
	}

} //Engine200_200FactoryImpl
