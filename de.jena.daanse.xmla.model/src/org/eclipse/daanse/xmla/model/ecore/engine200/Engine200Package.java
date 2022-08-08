/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Factory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Engine200Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine200";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2010/engine/200";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine200";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine200Package eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Calculation Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALCULATION_ERROR = 3;

	/**
	 * The feature id for the '<em><b>Compatibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPATIBILITY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Warning Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WARNING_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Warning Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WARNING_MEASURE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningColumnTypeImpl <em>Warning Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningColumnTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getWarningColumnType()
	 * @generated
	 */
	int WARNING_COLUMN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_COLUMN_TYPE__DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_COLUMN_TYPE__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Warning Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_COLUMN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Warning Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningLocationObjectImpl <em>Warning Location Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningLocationObjectImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getWarningLocationObject()
	 * @generated
	 */
	int WARNING_LOCATION_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Warning Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_LOCATION_OBJECT__WARNING_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Warning Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_LOCATION_OBJECT__WARNING_MEASURE = 1;

	/**
	 * The number of structural features of the '<em>Warning Location Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_LOCATION_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Warning Location Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_LOCATION_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl <em>Warning Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getWarningMeasureType()
	 * @generated
	 */
	int WARNING_MEASURE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MEASURE_TYPE__CUBE = 0;

	/**
	 * The feature id for the '<em><b>Measure Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MEASURE_TYPE__MEASURE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MEASURE_TYPE__MEASURE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Warning Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MEASURE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Warning Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MEASURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType <em>Calculation Error Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getCalculationErrorType()
	 * @generated
	 */
	int CALCULATION_ERROR_TYPE = 4;

	/**
	 * The meta object id for the '<em>Calculation Error Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getCalculationErrorTypeObject()
	 * @generated
	 */
	int CALCULATION_ERROR_TYPE_OBJECT = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCalculationError <em>Calculation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation Error</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCalculationError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CalculationError();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCompatibilityLevel <em>Compatibility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compatibility Level</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCompatibilityLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CompatibilityLevel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningColumn <em>Warning Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warning Column</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WarningColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningMeasure <em>Warning Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warning Measure</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningMeasure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WarningMeasure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType <em>Warning Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Column Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType
	 * @generated
	 */
	EClass getWarningColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getDimension()
	 * @see #getWarningColumnType()
	 * @generated
	 */
	EAttribute getWarningColumnType_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getAttribute()
	 * @see #getWarningColumnType()
	 * @generated
	 */
	EAttribute getWarningColumnType_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject <em>Warning Location Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Location Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject
	 * @generated
	 */
	EClass getWarningLocationObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningColumn <em>Warning Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warning Column</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningColumn()
	 * @see #getWarningLocationObject()
	 * @generated
	 */
	EReference getWarningLocationObject_WarningColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningMeasure <em>Warning Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warning Measure</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningMeasure()
	 * @see #getWarningLocationObject()
	 * @generated
	 */
	EReference getWarningLocationObject_WarningMeasure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType <em>Warning Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Measure Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType
	 * @generated
	 */
	EClass getWarningMeasureType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cube</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getCube()
	 * @see #getWarningMeasureType()
	 * @generated
	 */
	EAttribute getWarningMeasureType_Cube();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureGroup <em>Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Group</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureGroup()
	 * @see #getWarningMeasureType()
	 * @generated
	 */
	EAttribute getWarningMeasureType_MeasureGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureName <em>Measure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureName()
	 * @see #getWarningMeasureType()
	 * @generated
	 */
	EAttribute getWarningMeasureType_MeasureName();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType <em>Calculation Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calculation Error Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @generated
	 */
	EEnum getCalculationErrorType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType <em>Calculation Error Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calculation Error Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType"
	 *        extendedMetaData="name='CalculationError_._type:Object' baseType='CalculationError_._type'"
	 * @generated
	 */
	EDataType getCalculationErrorTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Engine200Factory getEngine200Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Calculation Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CALCULATION_ERROR = eINSTANCE.getDocumentRoot_CalculationError();

		/**
		 * The meta object literal for the '<em><b>Compatibility Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMPATIBILITY_LEVEL = eINSTANCE.getDocumentRoot_CompatibilityLevel();

		/**
		 * The meta object literal for the '<em><b>Warning Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WARNING_COLUMN = eINSTANCE.getDocumentRoot_WarningColumn();

		/**
		 * The meta object literal for the '<em><b>Warning Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WARNING_MEASURE = eINSTANCE.getDocumentRoot_WarningMeasure();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningColumnTypeImpl <em>Warning Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningColumnTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getWarningColumnType()
		 * @generated
		 */
		EClass WARNING_COLUMN_TYPE = eINSTANCE.getWarningColumnType();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_COLUMN_TYPE__DIMENSION = eINSTANCE.getWarningColumnType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_COLUMN_TYPE__ATTRIBUTE = eINSTANCE.getWarningColumnType_Attribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningLocationObjectImpl <em>Warning Location Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningLocationObjectImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getWarningLocationObject()
		 * @generated
		 */
		EClass WARNING_LOCATION_OBJECT = eINSTANCE.getWarningLocationObject();

		/**
		 * The meta object literal for the '<em><b>Warning Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARNING_LOCATION_OBJECT__WARNING_COLUMN = eINSTANCE.getWarningLocationObject_WarningColumn();

		/**
		 * The meta object literal for the '<em><b>Warning Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARNING_LOCATION_OBJECT__WARNING_MEASURE = eINSTANCE.getWarningLocationObject_WarningMeasure();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl <em>Warning Measure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getWarningMeasureType()
		 * @generated
		 */
		EClass WARNING_MEASURE_TYPE = eINSTANCE.getWarningMeasureType();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_MEASURE_TYPE__CUBE = eINSTANCE.getWarningMeasureType_Cube();

		/**
		 * The meta object literal for the '<em><b>Measure Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_MEASURE_TYPE__MEASURE_GROUP = eINSTANCE.getWarningMeasureType_MeasureGroup();

		/**
		 * The meta object literal for the '<em><b>Measure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_MEASURE_TYPE__MEASURE_NAME = eINSTANCE.getWarningMeasureType_MeasureName();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType <em>Calculation Error Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getCalculationErrorType()
		 * @generated
		 */
		EEnum CALCULATION_ERROR_TYPE = eINSTANCE.getCalculationErrorType();

		/**
		 * The meta object literal for the '<em>Calculation Error Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl#getCalculationErrorTypeObject()
		 * @generated
		 */
		EDataType CALCULATION_ERROR_TYPE_OBJECT = eINSTANCE.getCalculationErrorTypeObject();

	}

} //Engine200Package
