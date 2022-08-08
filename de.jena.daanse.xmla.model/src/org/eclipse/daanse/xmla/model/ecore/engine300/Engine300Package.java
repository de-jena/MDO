/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

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
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Factory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Engine300Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine300";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2011/engine/300";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine300";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine300Package eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl <em>Calculation Properties Visualization Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Folder Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Contextual Name Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = 1;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Is Folder Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Is Right To Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Sort Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH = 7;

	/**
	 * The feature id for the '<em><b>Is Default Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE = 8;

	/**
	 * The feature id for the '<em><b>Default Details Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION = 9;

	/**
	 * The feature id for the '<em><b>Sort Properties Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Is Simple Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE = 11;

	/**
	 * The number of structural features of the '<em>Calculation Properties Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Calculation Properties Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl <em>Dimension Attribute Visualization Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Folder Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Contextual Name Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = 1;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Is Folder Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Is Right To Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Sort Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH = 7;

	/**
	 * The feature id for the '<em><b>Default Details Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION = 8;

	/**
	 * The feature id for the '<em><b>Common Identifier Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION = 9;

	/**
	 * The feature id for the '<em><b>Sort Properties Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Display Key Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION = 11;

	/**
	 * The feature id for the '<em><b>Is Default Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Default Aggregate Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION = 13;

	/**
	 * The number of structural features of the '<em>Dimension Attribute Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Dimension Attribute Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Current String Stores Compatibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Data Embedding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_EMBEDDING_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Processing State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESSING_STATE = 5;

	/**
	 * The feature id for the '<em><b>Query Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY_HINTS = 6;

	/**
	 * The feature id for the '<em><b>Query Impersonation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO = 7;

	/**
	 * The feature id for the '<em><b>Server Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVER_MODE = 8;

	/**
	 * The feature id for the '<em><b>String Stores Compatibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Structure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRUCTURE_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.HierarchyVisualizationPropertiesImpl <em>Hierarchy Visualization Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.HierarchyVisualizationPropertiesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getHierarchyVisualizationProperties()
	 * @generated
	 */
	int HIERARCHY_VISUALIZATION_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Contextual Name Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = 0;

	/**
	 * The feature id for the '<em><b>Folder Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION = 1;

	/**
	 * The number of structural features of the '<em>Hierarchy Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_VISUALIZATION_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hierarchy Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_VISUALIZATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl <em>Relationship End Visualization Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Folder Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Contextual Name Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = 1;

	/**
	 * The feature id for the '<em><b>Default Details Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Display Key Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION = 3;

	/**
	 * The feature id for the '<em><b>Common Identifier Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Is Default Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Is Default Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Sort Properties Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION = 7;

	/**
	 * The number of structural features of the '<em>Relationship End Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Relationship End Visualization Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_VISUALIZATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType <em>Alignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentType()
	 * @generated
	 */
	int ALIGNMENT_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1 <em>Alignment Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentType1()
	 * @generated
	 */
	int ALIGNMENT_TYPE1 = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAttributeHierarchyProcessingState()
	 * @generated
	 */
	int ATTRIBUTE_HIERARCHY_PROCESSING_STATE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType <em>Contextual Name Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1 <em>Contextual Name Rule Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType1()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE1 = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2 <em>Contextual Name Rule Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType2()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE2 = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3 <em>Contextual Name Rule Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType3()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE3 = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType <em>Current String Stores Compatibility Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getCurrentStringStoresCompatibilityLevelType()
	 * @generated
	 */
	int CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType <em>Data Embedding Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDataEmbeddingStyleType()
	 * @generated
	 */
	int DATA_EMBEDDING_STYLE_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType <em>Default Aggregate Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDefaultAggregateFunctionType()
	 * @generated
	 */
	int DEFAULT_AGGREGATE_FUNCTION_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType <em>Processing State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getProcessingStateType()
	 * @generated
	 */
	int PROCESSING_STATE_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType <em>Server Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getServerModeType()
	 * @generated
	 */
	int SERVER_MODE_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType <em>Sort Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionType()
	 * @generated
	 */
	int SORT_DIRECTION_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1 <em>Sort Direction Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionType1()
	 * @generated
	 */
	int SORT_DIRECTION_TYPE1 = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType <em>String Stores Compatibility Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStringStoresCompatibilityLevelType()
	 * @generated
	 */
	int STRING_STORES_COMPATIBILITY_LEVEL_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType <em>Structure Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStructureTypeType()
	 * @generated
	 */
	int STRUCTURE_TYPE_TYPE = 20;

	/**
	 * The meta object id for the '<em>Alignment Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentTypeObject()
	 * @generated
	 */
	int ALIGNMENT_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Alignment Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentTypeObject1()
	 * @generated
	 */
	int ALIGNMENT_TYPE_OBJECT1 = 22;

	/**
	 * The meta object id for the '<em>Attribute Hierarchy Processing State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAttributeHierarchyProcessingStateObject()
	 * @generated
	 */
	int ATTRIBUTE_HIERARCHY_PROCESSING_STATE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Contextual Name Rule Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Contextual Name Rule Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject1()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE_OBJECT1 = 25;

	/**
	 * The meta object id for the '<em>Contextual Name Rule Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject2()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE_OBJECT2 = 26;

	/**
	 * The meta object id for the '<em>Contextual Name Rule Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject3()
	 * @generated
	 */
	int CONTEXTUAL_NAME_RULE_TYPE_OBJECT3 = 27;

	/**
	 * The meta object id for the '<em>Current String Stores Compatibility Level Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getCurrentStringStoresCompatibilityLevelTypeObject()
	 * @generated
	 */
	int CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Data Embedding Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDataEmbeddingStyleTypeObject()
	 * @generated
	 */
	int DATA_EMBEDDING_STYLE_TYPE_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Default Aggregate Function Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDefaultAggregateFunctionTypeObject()
	 * @generated
	 */
	int DEFAULT_AGGREGATE_FUNCTION_TYPE_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Processing State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getProcessingStateTypeObject()
	 * @generated
	 */
	int PROCESSING_STATE_TYPE_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Server Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getServerModeTypeObject()
	 * @generated
	 */
	int SERVER_MODE_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Sort Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionTypeObject()
	 * @generated
	 */
	int SORT_DIRECTION_TYPE_OBJECT = 33;

	/**
	 * The meta object id for the '<em>Sort Direction Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionTypeObject1()
	 * @generated
	 */
	int SORT_DIRECTION_TYPE_OBJECT1 = 34;

	/**
	 * The meta object id for the '<em>String Stores Compatibility Level Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStringStoresCompatibilityLevelTypeObject()
	 * @generated
	 */
	int STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT = 35;

	/**
	 * The meta object id for the '<em>Structure Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStructureTypeTypeObject()
	 * @generated
	 */
	int STRUCTURE_TYPE_TYPE_OBJECT = 36;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties <em>Calculation Properties Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Properties Visualization Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties
	 * @generated
	 */
	EClass getCalculationPropertiesVisualizationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getFolderPosition <em>Folder Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getFolderPosition()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_FolderPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Name Rule</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getContextualNameRule()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_ContextualNameRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getAlignment()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder Default</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsFolderDefault()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_IsFolderDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Right To Left</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsRightToLeft()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_IsRightToLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Direction</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortDirection()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_SortDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getUnits()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_Units();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getWidth()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Measure</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsDefaultMeasure()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_IsDefaultMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Details Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getDefaultDetailsPosition()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_DefaultDetailsPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Properties Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortPropertiesPosition()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_SortPropertiesPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsSimpleMeasure <em>Is Simple Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Simple Measure</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsSimpleMeasure()
	 * @see #getCalculationPropertiesVisualizationProperties()
	 * @generated
	 */
	EAttribute getCalculationPropertiesVisualizationProperties_IsSimpleMeasure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties <em>Dimension Attribute Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Attribute Visualization Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties
	 * @generated
	 */
	EClass getDimensionAttributeVisualizationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getFolderPosition <em>Folder Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getFolderPosition()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_FolderPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Name Rule</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getContextualNameRule()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_ContextualNameRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getAlignment()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder Default</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsFolderDefault()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_IsFolderDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Right To Left</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsRightToLeft()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_IsRightToLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Direction</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortDirection()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_SortDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getUnits()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_Units();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getWidth()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Details Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultDetailsPosition()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_DefaultDetailsPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common Identifier Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getCommonIdentifierPosition()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_CommonIdentifierPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Properties Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortPropertiesPosition()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_SortPropertiesPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Key Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDisplayKeyPosition()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_DisplayKeyPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Image</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsDefaultImage()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_IsDefaultImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultAggregateFunction <em>Default Aggregate Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Aggregate Function</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultAggregateFunction()
	 * @see #getDimensionAttributeVisualizationProperties()
	 * @generated
	 */
	EAttribute getDimensionAttributeVisualizationProperties_DefaultAggregateFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current String Stores Compatibility Level</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getCurrentStringStoresCompatibilityLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrentStringStoresCompatibilityLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getDataEmbeddingStyle <em>Data Embedding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Embedding Style</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getDataEmbeddingStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataEmbeddingStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getProcessingState <em>Processing State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing State</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getProcessingState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProcessingState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryHints <em>Query Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Hints</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryHints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_QueryHints();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryImpersonationInfo <em>Query Impersonation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Impersonation Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryImpersonationInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_QueryImpersonationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getServerMode <em>Server Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getServerMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServerMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Stores Compatibility Level</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStringStoresCompatibilityLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StringStoresCompatibilityLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStructureType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StructureType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties <em>Hierarchy Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Visualization Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties
	 * @generated
	 */
	EClass getHierarchyVisualizationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Name Rule</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getContextualNameRule()
	 * @see #getHierarchyVisualizationProperties()
	 * @generated
	 */
	EAttribute getHierarchyVisualizationProperties_ContextualNameRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getFolderPosition <em>Folder Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getFolderPosition()
	 * @see #getHierarchyVisualizationProperties()
	 * @generated
	 */
	EAttribute getHierarchyVisualizationProperties_FolderPosition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties <em>Relationship End Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship End Visualization Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties
	 * @generated
	 */
	EClass getRelationshipEndVisualizationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getFolderPosition <em>Folder Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getFolderPosition()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_FolderPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Name Rule</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getContextualNameRule()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_ContextualNameRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Details Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDefaultDetailsPosition()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_DefaultDetailsPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Key Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDisplayKeyPosition()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_DisplayKeyPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common Identifier Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getCommonIdentifierPosition()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_CommonIdentifierPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Measure</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultMeasure()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_IsDefaultMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Image</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultImage()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_IsDefaultImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Properties Position</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getSortPropertiesPosition()
	 * @see #getRelationshipEndVisualizationProperties()
	 * @generated
	 */
	EAttribute getRelationshipEndVisualizationProperties_SortPropertiesPosition();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType <em>Alignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
	 * @generated
	 */
	EEnum getAlignmentType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1 <em>Alignment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Type1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
	 * @generated
	 */
	EEnum getAlignmentType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Hierarchy Processing State</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
	 * @generated
	 */
	EEnum getAttributeHierarchyProcessingState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType <em>Contextual Name Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contextual Name Rule Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
	 * @generated
	 */
	EEnum getContextualNameRuleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1 <em>Contextual Name Rule Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contextual Name Rule Type1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
	 * @generated
	 */
	EEnum getContextualNameRuleType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2 <em>Contextual Name Rule Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contextual Name Rule Type2</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
	 * @generated
	 */
	EEnum getContextualNameRuleType2();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3 <em>Contextual Name Rule Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contextual Name Rule Type3</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
	 * @generated
	 */
	EEnum getContextualNameRuleType3();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType <em>Current String Stores Compatibility Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Current String Stores Compatibility Level Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @generated
	 */
	EEnum getCurrentStringStoresCompatibilityLevelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType <em>Data Embedding Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Embedding Style Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @generated
	 */
	EEnum getDataEmbeddingStyleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType <em>Default Aggregate Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Aggregate Function Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
	 * @generated
	 */
	EEnum getDefaultAggregateFunctionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType <em>Processing State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing State Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @generated
	 */
	EEnum getProcessingStateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType <em>Server Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @generated
	 */
	EEnum getServerModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType <em>Sort Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
	 * @generated
	 */
	EEnum getSortDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1 <em>Sort Direction Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction Type1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
	 * @generated
	 */
	EEnum getSortDirectionType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType <em>String Stores Compatibility Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Stores Compatibility Level Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @generated
	 */
	EEnum getStringStoresCompatibilityLevelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType <em>Structure Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Type Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @generated
	 */
	EEnum getStructureTypeType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType <em>Alignment Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignment Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType"
	 *        extendedMetaData="name='Alignment_._type:Object' baseType='Alignment_._type'"
	 * @generated
	 */
	EDataType getAlignmentTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1 <em>Alignment Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignment Type Object1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1"
	 *        extendedMetaData="name='Alignment_._1_._type:Object' baseType='Alignment_._1_._type'"
	 * @generated
	 */
	EDataType getAlignmentTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Hierarchy Processing State Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState"
	 *        extendedMetaData="name='AttributeHierarchyProcessingState:Object' baseType='AttributeHierarchyProcessingState'"
	 * @generated
	 */
	EDataType getAttributeHierarchyProcessingStateObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType <em>Contextual Name Rule Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual Name Rule Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType"
	 *        extendedMetaData="name='ContextualNameRule_._type:Object' baseType='ContextualNameRule_._type'"
	 * @generated
	 */
	EDataType getContextualNameRuleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1 <em>Contextual Name Rule Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual Name Rule Type Object1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1"
	 *        extendedMetaData="name='ContextualNameRule_._1_._type:Object' baseType='ContextualNameRule_._1_._type'"
	 * @generated
	 */
	EDataType getContextualNameRuleTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2 <em>Contextual Name Rule Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual Name Rule Type Object2</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2"
	 *        extendedMetaData="name='ContextualNameRule_._2_._type:Object' baseType='ContextualNameRule_._2_._type'"
	 * @generated
	 */
	EDataType getContextualNameRuleTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3 <em>Contextual Name Rule Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual Name Rule Type Object3</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3"
	 *        extendedMetaData="name='ContextualNameRule_._3_._type:Object' baseType='ContextualNameRule_._3_._type'"
	 * @generated
	 */
	EDataType getContextualNameRuleTypeObject3();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType <em>Current String Stores Compatibility Level Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Current String Stores Compatibility Level Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType"
	 *        extendedMetaData="name='CurrentStringStoresCompatibilityLevel_._type:Object' baseType='CurrentStringStoresCompatibilityLevel_._type'"
	 * @generated
	 */
	EDataType getCurrentStringStoresCompatibilityLevelTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType <em>Data Embedding Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Embedding Style Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType"
	 *        extendedMetaData="name='DataEmbeddingStyle_._type:Object' baseType='DataEmbeddingStyle_._type'"
	 * @generated
	 */
	EDataType getDataEmbeddingStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType <em>Default Aggregate Function Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Aggregate Function Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType"
	 *        extendedMetaData="name='DefaultAggregateFunction_._type:Object' baseType='DefaultAggregateFunction_._type'"
	 * @generated
	 */
	EDataType getDefaultAggregateFunctionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType <em>Processing State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Processing State Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType"
	 *        extendedMetaData="name='ProcessingState_._type:Object' baseType='ProcessingState_._type'"
	 * @generated
	 */
	EDataType getProcessingStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType <em>Server Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Server Mode Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType"
	 *        extendedMetaData="name='ServerMode_._type:Object' baseType='ServerMode_._type'"
	 * @generated
	 */
	EDataType getServerModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType <em>Sort Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sort Direction Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType"
	 *        extendedMetaData="name='SortDirection_._type:Object' baseType='SortDirection_._type'"
	 * @generated
	 */
	EDataType getSortDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1 <em>Sort Direction Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sort Direction Type Object1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1"
	 *        extendedMetaData="name='SortDirection_._1_._type:Object' baseType='SortDirection_._1_._type'"
	 * @generated
	 */
	EDataType getSortDirectionTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType <em>String Stores Compatibility Level Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Stores Compatibility Level Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType"
	 *        extendedMetaData="name='StringStoresCompatibilityLevel_._type:Object' baseType='StringStoresCompatibilityLevel_._type'"
	 * @generated
	 */
	EDataType getStringStoresCompatibilityLevelTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType <em>Structure Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Structure Type Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType"
	 *        extendedMetaData="name='StructureType_._type:Object' baseType='StructureType_._type'"
	 * @generated
	 */
	EDataType getStructureTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Engine300Factory getEngine300Factory();

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
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl <em>Calculation Properties Visualization Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getCalculationPropertiesVisualizationProperties()
		 * @generated
		 */
		EClass CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES = eINSTANCE.getCalculationPropertiesVisualizationProperties();

		/**
		 * The meta object literal for the '<em><b>Folder Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION = eINSTANCE.getCalculationPropertiesVisualizationProperties_FolderPosition();

		/**
		 * The meta object literal for the '<em><b>Contextual Name Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = eINSTANCE.getCalculationPropertiesVisualizationProperties_ContextualNameRule();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT = eINSTANCE.getCalculationPropertiesVisualizationProperties_Alignment();

		/**
		 * The meta object literal for the '<em><b>Is Folder Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT = eINSTANCE.getCalculationPropertiesVisualizationProperties_IsFolderDefault();

		/**
		 * The meta object literal for the '<em><b>Is Right To Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT = eINSTANCE.getCalculationPropertiesVisualizationProperties_IsRightToLeft();

		/**
		 * The meta object literal for the '<em><b>Sort Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION = eINSTANCE.getCalculationPropertiesVisualizationProperties_SortDirection();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS = eINSTANCE.getCalculationPropertiesVisualizationProperties_Units();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH = eINSTANCE.getCalculationPropertiesVisualizationProperties_Width();

		/**
		 * The meta object literal for the '<em><b>Is Default Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE = eINSTANCE.getCalculationPropertiesVisualizationProperties_IsDefaultMeasure();

		/**
		 * The meta object literal for the '<em><b>Default Details Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION = eINSTANCE.getCalculationPropertiesVisualizationProperties_DefaultDetailsPosition();

		/**
		 * The meta object literal for the '<em><b>Sort Properties Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION = eINSTANCE.getCalculationPropertiesVisualizationProperties_SortPropertiesPosition();

		/**
		 * The meta object literal for the '<em><b>Is Simple Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE = eINSTANCE.getCalculationPropertiesVisualizationProperties_IsSimpleMeasure();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl <em>Dimension Attribute Visualization Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDimensionAttributeVisualizationProperties()
		 * @generated
		 */
		EClass DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES = eINSTANCE.getDimensionAttributeVisualizationProperties();

		/**
		 * The meta object literal for the '<em><b>Folder Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION = eINSTANCE.getDimensionAttributeVisualizationProperties_FolderPosition();

		/**
		 * The meta object literal for the '<em><b>Contextual Name Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = eINSTANCE.getDimensionAttributeVisualizationProperties_ContextualNameRule();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT = eINSTANCE.getDimensionAttributeVisualizationProperties_Alignment();

		/**
		 * The meta object literal for the '<em><b>Is Folder Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT = eINSTANCE.getDimensionAttributeVisualizationProperties_IsFolderDefault();

		/**
		 * The meta object literal for the '<em><b>Is Right To Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT = eINSTANCE.getDimensionAttributeVisualizationProperties_IsRightToLeft();

		/**
		 * The meta object literal for the '<em><b>Sort Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION = eINSTANCE.getDimensionAttributeVisualizationProperties_SortDirection();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS = eINSTANCE.getDimensionAttributeVisualizationProperties_Units();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH = eINSTANCE.getDimensionAttributeVisualizationProperties_Width();

		/**
		 * The meta object literal for the '<em><b>Default Details Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION = eINSTANCE.getDimensionAttributeVisualizationProperties_DefaultDetailsPosition();

		/**
		 * The meta object literal for the '<em><b>Common Identifier Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION = eINSTANCE.getDimensionAttributeVisualizationProperties_CommonIdentifierPosition();

		/**
		 * The meta object literal for the '<em><b>Sort Properties Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION = eINSTANCE.getDimensionAttributeVisualizationProperties_SortPropertiesPosition();

		/**
		 * The meta object literal for the '<em><b>Display Key Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION = eINSTANCE.getDimensionAttributeVisualizationProperties_DisplayKeyPosition();

		/**
		 * The meta object literal for the '<em><b>Is Default Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE = eINSTANCE.getDimensionAttributeVisualizationProperties_IsDefaultImage();

		/**
		 * The meta object literal for the '<em><b>Default Aggregate Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION = eINSTANCE.getDimensionAttributeVisualizationProperties_DefaultAggregateFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Current String Stores Compatibility Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL = eINSTANCE.getDocumentRoot_CurrentStringStoresCompatibilityLevel();

		/**
		 * The meta object literal for the '<em><b>Data Embedding Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_EMBEDDING_STYLE = eINSTANCE.getDocumentRoot_DataEmbeddingStyle();

		/**
		 * The meta object literal for the '<em><b>Processing State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROCESSING_STATE = eINSTANCE.getDocumentRoot_ProcessingState();

		/**
		 * The meta object literal for the '<em><b>Query Hints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__QUERY_HINTS = eINSTANCE.getDocumentRoot_QueryHints();

		/**
		 * The meta object literal for the '<em><b>Query Impersonation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO = eINSTANCE.getDocumentRoot_QueryImpersonationInfo();

		/**
		 * The meta object literal for the '<em><b>Server Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVER_MODE = eINSTANCE.getDocumentRoot_ServerMode();

		/**
		 * The meta object literal for the '<em><b>String Stores Compatibility Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL = eINSTANCE.getDocumentRoot_StringStoresCompatibilityLevel();

		/**
		 * The meta object literal for the '<em><b>Structure Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STRUCTURE_TYPE = eINSTANCE.getDocumentRoot_StructureType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.HierarchyVisualizationPropertiesImpl <em>Hierarchy Visualization Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.HierarchyVisualizationPropertiesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getHierarchyVisualizationProperties()
		 * @generated
		 */
		EClass HIERARCHY_VISUALIZATION_PROPERTIES = eINSTANCE.getHierarchyVisualizationProperties();

		/**
		 * The meta object literal for the '<em><b>Contextual Name Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = eINSTANCE.getHierarchyVisualizationProperties_ContextualNameRule();

		/**
		 * The meta object literal for the '<em><b>Folder Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION = eINSTANCE.getHierarchyVisualizationProperties_FolderPosition();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl <em>Relationship End Visualization Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getRelationshipEndVisualizationProperties()
		 * @generated
		 */
		EClass RELATIONSHIP_END_VISUALIZATION_PROPERTIES = eINSTANCE.getRelationshipEndVisualizationProperties();

		/**
		 * The meta object literal for the '<em><b>Folder Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION = eINSTANCE.getRelationshipEndVisualizationProperties_FolderPosition();

		/**
		 * The meta object literal for the '<em><b>Contextual Name Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE = eINSTANCE.getRelationshipEndVisualizationProperties_ContextualNameRule();

		/**
		 * The meta object literal for the '<em><b>Default Details Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION = eINSTANCE.getRelationshipEndVisualizationProperties_DefaultDetailsPosition();

		/**
		 * The meta object literal for the '<em><b>Display Key Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION = eINSTANCE.getRelationshipEndVisualizationProperties_DisplayKeyPosition();

		/**
		 * The meta object literal for the '<em><b>Common Identifier Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION = eINSTANCE.getRelationshipEndVisualizationProperties_CommonIdentifierPosition();

		/**
		 * The meta object literal for the '<em><b>Is Default Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE = eINSTANCE.getRelationshipEndVisualizationProperties_IsDefaultMeasure();

		/**
		 * The meta object literal for the '<em><b>Is Default Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE = eINSTANCE.getRelationshipEndVisualizationProperties_IsDefaultImage();

		/**
		 * The meta object literal for the '<em><b>Sort Properties Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION = eINSTANCE.getRelationshipEndVisualizationProperties_SortPropertiesPosition();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType <em>Alignment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentType()
		 * @generated
		 */
		EEnum ALIGNMENT_TYPE = eINSTANCE.getAlignmentType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1 <em>Alignment Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentType1()
		 * @generated
		 */
		EEnum ALIGNMENT_TYPE1 = eINSTANCE.getAlignmentType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAttributeHierarchyProcessingState()
		 * @generated
		 */
		EEnum ATTRIBUTE_HIERARCHY_PROCESSING_STATE = eINSTANCE.getAttributeHierarchyProcessingState();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType <em>Contextual Name Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType()
		 * @generated
		 */
		EEnum CONTEXTUAL_NAME_RULE_TYPE = eINSTANCE.getContextualNameRuleType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1 <em>Contextual Name Rule Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType1()
		 * @generated
		 */
		EEnum CONTEXTUAL_NAME_RULE_TYPE1 = eINSTANCE.getContextualNameRuleType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2 <em>Contextual Name Rule Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType2()
		 * @generated
		 */
		EEnum CONTEXTUAL_NAME_RULE_TYPE2 = eINSTANCE.getContextualNameRuleType2();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3 <em>Contextual Name Rule Type3</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleType3()
		 * @generated
		 */
		EEnum CONTEXTUAL_NAME_RULE_TYPE3 = eINSTANCE.getContextualNameRuleType3();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType <em>Current String Stores Compatibility Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getCurrentStringStoresCompatibilityLevelType()
		 * @generated
		 */
		EEnum CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE = eINSTANCE.getCurrentStringStoresCompatibilityLevelType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType <em>Data Embedding Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDataEmbeddingStyleType()
		 * @generated
		 */
		EEnum DATA_EMBEDDING_STYLE_TYPE = eINSTANCE.getDataEmbeddingStyleType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType <em>Default Aggregate Function Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDefaultAggregateFunctionType()
		 * @generated
		 */
		EEnum DEFAULT_AGGREGATE_FUNCTION_TYPE = eINSTANCE.getDefaultAggregateFunctionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType <em>Processing State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getProcessingStateType()
		 * @generated
		 */
		EEnum PROCESSING_STATE_TYPE = eINSTANCE.getProcessingStateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType <em>Server Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getServerModeType()
		 * @generated
		 */
		EEnum SERVER_MODE_TYPE = eINSTANCE.getServerModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType <em>Sort Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionType()
		 * @generated
		 */
		EEnum SORT_DIRECTION_TYPE = eINSTANCE.getSortDirectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1 <em>Sort Direction Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionType1()
		 * @generated
		 */
		EEnum SORT_DIRECTION_TYPE1 = eINSTANCE.getSortDirectionType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType <em>String Stores Compatibility Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStringStoresCompatibilityLevelType()
		 * @generated
		 */
		EEnum STRING_STORES_COMPATIBILITY_LEVEL_TYPE = eINSTANCE.getStringStoresCompatibilityLevelType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType <em>Structure Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStructureTypeType()
		 * @generated
		 */
		EEnum STRUCTURE_TYPE_TYPE = eINSTANCE.getStructureTypeType();

		/**
		 * The meta object literal for the '<em>Alignment Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentTypeObject()
		 * @generated
		 */
		EDataType ALIGNMENT_TYPE_OBJECT = eINSTANCE.getAlignmentTypeObject();

		/**
		 * The meta object literal for the '<em>Alignment Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAlignmentTypeObject1()
		 * @generated
		 */
		EDataType ALIGNMENT_TYPE_OBJECT1 = eINSTANCE.getAlignmentTypeObject1();

		/**
		 * The meta object literal for the '<em>Attribute Hierarchy Processing State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getAttributeHierarchyProcessingStateObject()
		 * @generated
		 */
		EDataType ATTRIBUTE_HIERARCHY_PROCESSING_STATE_OBJECT = eINSTANCE.getAttributeHierarchyProcessingStateObject();

		/**
		 * The meta object literal for the '<em>Contextual Name Rule Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject()
		 * @generated
		 */
		EDataType CONTEXTUAL_NAME_RULE_TYPE_OBJECT = eINSTANCE.getContextualNameRuleTypeObject();

		/**
		 * The meta object literal for the '<em>Contextual Name Rule Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject1()
		 * @generated
		 */
		EDataType CONTEXTUAL_NAME_RULE_TYPE_OBJECT1 = eINSTANCE.getContextualNameRuleTypeObject1();

		/**
		 * The meta object literal for the '<em>Contextual Name Rule Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject2()
		 * @generated
		 */
		EDataType CONTEXTUAL_NAME_RULE_TYPE_OBJECT2 = eINSTANCE.getContextualNameRuleTypeObject2();

		/**
		 * The meta object literal for the '<em>Contextual Name Rule Type Object3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getContextualNameRuleTypeObject3()
		 * @generated
		 */
		EDataType CONTEXTUAL_NAME_RULE_TYPE_OBJECT3 = eINSTANCE.getContextualNameRuleTypeObject3();

		/**
		 * The meta object literal for the '<em>Current String Stores Compatibility Level Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getCurrentStringStoresCompatibilityLevelTypeObject()
		 * @generated
		 */
		EDataType CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT = eINSTANCE.getCurrentStringStoresCompatibilityLevelTypeObject();

		/**
		 * The meta object literal for the '<em>Data Embedding Style Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDataEmbeddingStyleTypeObject()
		 * @generated
		 */
		EDataType DATA_EMBEDDING_STYLE_TYPE_OBJECT = eINSTANCE.getDataEmbeddingStyleTypeObject();

		/**
		 * The meta object literal for the '<em>Default Aggregate Function Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getDefaultAggregateFunctionTypeObject()
		 * @generated
		 */
		EDataType DEFAULT_AGGREGATE_FUNCTION_TYPE_OBJECT = eINSTANCE.getDefaultAggregateFunctionTypeObject();

		/**
		 * The meta object literal for the '<em>Processing State Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getProcessingStateTypeObject()
		 * @generated
		 */
		EDataType PROCESSING_STATE_TYPE_OBJECT = eINSTANCE.getProcessingStateTypeObject();

		/**
		 * The meta object literal for the '<em>Server Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getServerModeTypeObject()
		 * @generated
		 */
		EDataType SERVER_MODE_TYPE_OBJECT = eINSTANCE.getServerModeTypeObject();

		/**
		 * The meta object literal for the '<em>Sort Direction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionTypeObject()
		 * @generated
		 */
		EDataType SORT_DIRECTION_TYPE_OBJECT = eINSTANCE.getSortDirectionTypeObject();

		/**
		 * The meta object literal for the '<em>Sort Direction Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getSortDirectionTypeObject1()
		 * @generated
		 */
		EDataType SORT_DIRECTION_TYPE_OBJECT1 = eINSTANCE.getSortDirectionTypeObject1();

		/**
		 * The meta object literal for the '<em>String Stores Compatibility Level Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStringStoresCompatibilityLevelTypeObject()
		 * @generated
		 */
		EDataType STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT = eINSTANCE.getStringStoresCompatibilityLevelTypeObject();

		/**
		 * The meta object literal for the '<em>Structure Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl#getStructureTypeTypeObject()
		 * @generated
		 */
		EDataType STRUCTURE_TYPE_TYPE_OBJECT = eINSTANCE.getStructureTypeTypeObject();

	}

} //Engine300Package
