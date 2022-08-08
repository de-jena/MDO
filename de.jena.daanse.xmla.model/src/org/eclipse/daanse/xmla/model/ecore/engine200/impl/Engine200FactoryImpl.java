/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200.*;

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
public class Engine200FactoryImpl extends EFactoryImpl implements Engine200Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Engine200Factory init() {
		try {
			Engine200Factory theEngine200Factory = (Engine200Factory)EPackage.Registry.INSTANCE.getEFactory(Engine200Package.eNS_URI);
			if (theEngine200Factory != null) {
				return theEngine200Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Engine200FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine200FactoryImpl() {
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
			case Engine200Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Engine200Package.WARNING_COLUMN_TYPE: return createWarningColumnType();
			case Engine200Package.WARNING_LOCATION_OBJECT: return createWarningLocationObject();
			case Engine200Package.WARNING_MEASURE_TYPE: return createWarningMeasureType();
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
			case Engine200Package.CALCULATION_ERROR_TYPE:
				return createCalculationErrorTypeFromString(eDataType, initialValue);
			case Engine200Package.CALCULATION_ERROR_TYPE_OBJECT:
				return createCalculationErrorTypeObjectFromString(eDataType, initialValue);
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
			case Engine200Package.CALCULATION_ERROR_TYPE:
				return convertCalculationErrorTypeToString(eDataType, instanceValue);
			case Engine200Package.CALCULATION_ERROR_TYPE_OBJECT:
				return convertCalculationErrorTypeObjectToString(eDataType, instanceValue);
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
	public WarningColumnType createWarningColumnType() {
		WarningColumnTypeImpl warningColumnType = new WarningColumnTypeImpl();
		return warningColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningLocationObject createWarningLocationObject() {
		WarningLocationObjectImpl warningLocationObject = new WarningLocationObjectImpl();
		return warningLocationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningMeasureType createWarningMeasureType() {
		WarningMeasureTypeImpl warningMeasureType = new WarningMeasureTypeImpl();
		return warningMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationErrorType createCalculationErrorTypeFromString(EDataType eDataType, String initialValue) {
		CalculationErrorType result = CalculationErrorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationErrorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationErrorType createCalculationErrorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCalculationErrorTypeFromString(Engine200Package.Literals.CALCULATION_ERROR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationErrorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalculationErrorTypeToString(Engine200Package.Literals.CALCULATION_ERROR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine200Package getEngine200Package() {
		return (Engine200Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Engine200Package getPackage() {
		return Engine200Package.eINSTANCE;
	}

} //Engine200FactoryImpl
