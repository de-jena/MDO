/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300.*;

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
public class Engine300FactoryImpl extends EFactoryImpl implements Engine300Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Engine300Factory init() {
		try {
			Engine300Factory theEngine300Factory = (Engine300Factory)EPackage.Registry.INSTANCE.getEFactory(Engine300Package.eNS_URI);
			if (theEngine300Factory != null) {
				return theEngine300Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Engine300FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300FactoryImpl() {
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
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES: return createCalculationPropertiesVisualizationProperties();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES: return createDimensionAttributeVisualizationProperties();
			case Engine300Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES: return createHierarchyVisualizationProperties();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES: return createRelationshipEndVisualizationProperties();
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
			case Engine300Package.ALIGNMENT_TYPE:
				return createAlignmentTypeFromString(eDataType, initialValue);
			case Engine300Package.ALIGNMENT_TYPE1:
				return createAlignmentType1FromString(eDataType, initialValue);
			case Engine300Package.ATTRIBUTE_HIERARCHY_PROCESSING_STATE:
				return createAttributeHierarchyProcessingStateFromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE:
				return createContextualNameRuleTypeFromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE1:
				return createContextualNameRuleType1FromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE2:
				return createContextualNameRuleType2FromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE3:
				return createContextualNameRuleType3FromString(eDataType, initialValue);
			case Engine300Package.CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE:
				return createCurrentStringStoresCompatibilityLevelTypeFromString(eDataType, initialValue);
			case Engine300Package.DATA_EMBEDDING_STYLE_TYPE:
				return createDataEmbeddingStyleTypeFromString(eDataType, initialValue);
			case Engine300Package.DEFAULT_AGGREGATE_FUNCTION_TYPE:
				return createDefaultAggregateFunctionTypeFromString(eDataType, initialValue);
			case Engine300Package.PROCESSING_STATE_TYPE:
				return createProcessingStateTypeFromString(eDataType, initialValue);
			case Engine300Package.SERVER_MODE_TYPE:
				return createServerModeTypeFromString(eDataType, initialValue);
			case Engine300Package.SORT_DIRECTION_TYPE:
				return createSortDirectionTypeFromString(eDataType, initialValue);
			case Engine300Package.SORT_DIRECTION_TYPE1:
				return createSortDirectionType1FromString(eDataType, initialValue);
			case Engine300Package.STRING_STORES_COMPATIBILITY_LEVEL_TYPE:
				return createStringStoresCompatibilityLevelTypeFromString(eDataType, initialValue);
			case Engine300Package.STRUCTURE_TYPE_TYPE:
				return createStructureTypeTypeFromString(eDataType, initialValue);
			case Engine300Package.ALIGNMENT_TYPE_OBJECT:
				return createAlignmentTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.ALIGNMENT_TYPE_OBJECT1:
				return createAlignmentTypeObject1FromString(eDataType, initialValue);
			case Engine300Package.ATTRIBUTE_HIERARCHY_PROCESSING_STATE_OBJECT:
				return createAttributeHierarchyProcessingStateObjectFromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT:
				return createContextualNameRuleTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT1:
				return createContextualNameRuleTypeObject1FromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT2:
				return createContextualNameRuleTypeObject2FromString(eDataType, initialValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT3:
				return createContextualNameRuleTypeObject3FromString(eDataType, initialValue);
			case Engine300Package.CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT:
				return createCurrentStringStoresCompatibilityLevelTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.DATA_EMBEDDING_STYLE_TYPE_OBJECT:
				return createDataEmbeddingStyleTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.DEFAULT_AGGREGATE_FUNCTION_TYPE_OBJECT:
				return createDefaultAggregateFunctionTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.PROCESSING_STATE_TYPE_OBJECT:
				return createProcessingStateTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.SERVER_MODE_TYPE_OBJECT:
				return createServerModeTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.SORT_DIRECTION_TYPE_OBJECT:
				return createSortDirectionTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.SORT_DIRECTION_TYPE_OBJECT1:
				return createSortDirectionTypeObject1FromString(eDataType, initialValue);
			case Engine300Package.STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT:
				return createStringStoresCompatibilityLevelTypeObjectFromString(eDataType, initialValue);
			case Engine300Package.STRUCTURE_TYPE_TYPE_OBJECT:
				return createStructureTypeTypeObjectFromString(eDataType, initialValue);
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
			case Engine300Package.ALIGNMENT_TYPE:
				return convertAlignmentTypeToString(eDataType, instanceValue);
			case Engine300Package.ALIGNMENT_TYPE1:
				return convertAlignmentType1ToString(eDataType, instanceValue);
			case Engine300Package.ATTRIBUTE_HIERARCHY_PROCESSING_STATE:
				return convertAttributeHierarchyProcessingStateToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE:
				return convertContextualNameRuleTypeToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE1:
				return convertContextualNameRuleType1ToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE2:
				return convertContextualNameRuleType2ToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE3:
				return convertContextualNameRuleType3ToString(eDataType, instanceValue);
			case Engine300Package.CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE:
				return convertCurrentStringStoresCompatibilityLevelTypeToString(eDataType, instanceValue);
			case Engine300Package.DATA_EMBEDDING_STYLE_TYPE:
				return convertDataEmbeddingStyleTypeToString(eDataType, instanceValue);
			case Engine300Package.DEFAULT_AGGREGATE_FUNCTION_TYPE:
				return convertDefaultAggregateFunctionTypeToString(eDataType, instanceValue);
			case Engine300Package.PROCESSING_STATE_TYPE:
				return convertProcessingStateTypeToString(eDataType, instanceValue);
			case Engine300Package.SERVER_MODE_TYPE:
				return convertServerModeTypeToString(eDataType, instanceValue);
			case Engine300Package.SORT_DIRECTION_TYPE:
				return convertSortDirectionTypeToString(eDataType, instanceValue);
			case Engine300Package.SORT_DIRECTION_TYPE1:
				return convertSortDirectionType1ToString(eDataType, instanceValue);
			case Engine300Package.STRING_STORES_COMPATIBILITY_LEVEL_TYPE:
				return convertStringStoresCompatibilityLevelTypeToString(eDataType, instanceValue);
			case Engine300Package.STRUCTURE_TYPE_TYPE:
				return convertStructureTypeTypeToString(eDataType, instanceValue);
			case Engine300Package.ALIGNMENT_TYPE_OBJECT:
				return convertAlignmentTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.ALIGNMENT_TYPE_OBJECT1:
				return convertAlignmentTypeObject1ToString(eDataType, instanceValue);
			case Engine300Package.ATTRIBUTE_HIERARCHY_PROCESSING_STATE_OBJECT:
				return convertAttributeHierarchyProcessingStateObjectToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT:
				return convertContextualNameRuleTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT1:
				return convertContextualNameRuleTypeObject1ToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT2:
				return convertContextualNameRuleTypeObject2ToString(eDataType, instanceValue);
			case Engine300Package.CONTEXTUAL_NAME_RULE_TYPE_OBJECT3:
				return convertContextualNameRuleTypeObject3ToString(eDataType, instanceValue);
			case Engine300Package.CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT:
				return convertCurrentStringStoresCompatibilityLevelTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.DATA_EMBEDDING_STYLE_TYPE_OBJECT:
				return convertDataEmbeddingStyleTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.DEFAULT_AGGREGATE_FUNCTION_TYPE_OBJECT:
				return convertDefaultAggregateFunctionTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.PROCESSING_STATE_TYPE_OBJECT:
				return convertProcessingStateTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.SERVER_MODE_TYPE_OBJECT:
				return convertServerModeTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.SORT_DIRECTION_TYPE_OBJECT:
				return convertSortDirectionTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.SORT_DIRECTION_TYPE_OBJECT1:
				return convertSortDirectionTypeObject1ToString(eDataType, instanceValue);
			case Engine300Package.STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT:
				return convertStringStoresCompatibilityLevelTypeObjectToString(eDataType, instanceValue);
			case Engine300Package.STRUCTURE_TYPE_TYPE_OBJECT:
				return convertStructureTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationPropertiesVisualizationProperties createCalculationPropertiesVisualizationProperties() {
		CalculationPropertiesVisualizationPropertiesImpl calculationPropertiesVisualizationProperties = new CalculationPropertiesVisualizationPropertiesImpl();
		return calculationPropertiesVisualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionAttributeVisualizationProperties createDimensionAttributeVisualizationProperties() {
		DimensionAttributeVisualizationPropertiesImpl dimensionAttributeVisualizationProperties = new DimensionAttributeVisualizationPropertiesImpl();
		return dimensionAttributeVisualizationProperties;
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
	public HierarchyVisualizationProperties createHierarchyVisualizationProperties() {
		HierarchyVisualizationPropertiesImpl hierarchyVisualizationProperties = new HierarchyVisualizationPropertiesImpl();
		return hierarchyVisualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipEndVisualizationProperties createRelationshipEndVisualizationProperties() {
		RelationshipEndVisualizationPropertiesImpl relationshipEndVisualizationProperties = new RelationshipEndVisualizationPropertiesImpl();
		return relationshipEndVisualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		AlignmentType result = AlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType1 createAlignmentType1FromString(EDataType eDataType, String initialValue) {
		AlignmentType1 result = AlignmentType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyProcessingState createAttributeHierarchyProcessingStateFromString(EDataType eDataType, String initialValue) {
		AttributeHierarchyProcessingState result = AttributeHierarchyProcessingState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeHierarchyProcessingStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType createContextualNameRuleTypeFromString(EDataType eDataType, String initialValue) {
		ContextualNameRuleType result = ContextualNameRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType1 createContextualNameRuleType1FromString(EDataType eDataType, String initialValue) {
		ContextualNameRuleType1 result = ContextualNameRuleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType2 createContextualNameRuleType2FromString(EDataType eDataType, String initialValue) {
		ContextualNameRuleType2 result = ContextualNameRuleType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType3 createContextualNameRuleType3FromString(EDataType eDataType, String initialValue) {
		ContextualNameRuleType3 result = ContextualNameRuleType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStringStoresCompatibilityLevelType createCurrentStringStoresCompatibilityLevelTypeFromString(EDataType eDataType, String initialValue) {
		CurrentStringStoresCompatibilityLevelType result = CurrentStringStoresCompatibilityLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrentStringStoresCompatibilityLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEmbeddingStyleType createDataEmbeddingStyleTypeFromString(EDataType eDataType, String initialValue) {
		DataEmbeddingStyleType result = DataEmbeddingStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEmbeddingStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAggregateFunctionType createDefaultAggregateFunctionTypeFromString(EDataType eDataType, String initialValue) {
		DefaultAggregateFunctionType result = DefaultAggregateFunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultAggregateFunctionTypeToString(EDataType eDataType, Object instanceValue) {
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
	public ServerModeType createServerModeTypeFromString(EDataType eDataType, String initialValue) {
		ServerModeType result = ServerModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionType createSortDirectionTypeFromString(EDataType eDataType, String initialValue) {
		SortDirectionType result = SortDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionType1 createSortDirectionType1FromString(EDataType eDataType, String initialValue) {
		SortDirectionType1 result = SortDirectionType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringStoresCompatibilityLevelType createStringStoresCompatibilityLevelTypeFromString(EDataType eDataType, String initialValue) {
		StringStoresCompatibilityLevelType result = StringStoresCompatibilityLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringStoresCompatibilityLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeType createStructureTypeTypeFromString(EDataType eDataType, String initialValue) {
		StructureTypeType result = StructureTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignmentTypeFromString(Engine300Package.Literals.ALIGNMENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentTypeToString(Engine300Package.Literals.ALIGNMENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType1 createAlignmentTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAlignmentType1FromString(Engine300Package.Literals.ALIGNMENT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentType1ToString(Engine300Package.Literals.ALIGNMENT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyProcessingState createAttributeHierarchyProcessingStateObjectFromString(EDataType eDataType, String initialValue) {
		return createAttributeHierarchyProcessingStateFromString(Engine300Package.Literals.ATTRIBUTE_HIERARCHY_PROCESSING_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeHierarchyProcessingStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAttributeHierarchyProcessingStateToString(Engine300Package.Literals.ATTRIBUTE_HIERARCHY_PROCESSING_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType createContextualNameRuleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContextualNameRuleTypeFromString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContextualNameRuleTypeToString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType1 createContextualNameRuleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createContextualNameRuleType1FromString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertContextualNameRuleType1ToString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType2 createContextualNameRuleTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createContextualNameRuleType2FromString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertContextualNameRuleType2ToString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType3 createContextualNameRuleTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createContextualNameRuleType3FromString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualNameRuleTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertContextualNameRuleType3ToString(Engine300Package.Literals.CONTEXTUAL_NAME_RULE_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStringStoresCompatibilityLevelType createCurrentStringStoresCompatibilityLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCurrentStringStoresCompatibilityLevelTypeFromString(Engine300Package.Literals.CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrentStringStoresCompatibilityLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCurrentStringStoresCompatibilityLevelTypeToString(Engine300Package.Literals.CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEmbeddingStyleType createDataEmbeddingStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataEmbeddingStyleTypeFromString(Engine300Package.Literals.DATA_EMBEDDING_STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEmbeddingStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataEmbeddingStyleTypeToString(Engine300Package.Literals.DATA_EMBEDDING_STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAggregateFunctionType createDefaultAggregateFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultAggregateFunctionTypeFromString(Engine300Package.Literals.DEFAULT_AGGREGATE_FUNCTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultAggregateFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultAggregateFunctionTypeToString(Engine300Package.Literals.DEFAULT_AGGREGATE_FUNCTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType createProcessingStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessingStateTypeFromString(Engine300Package.Literals.PROCESSING_STATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingStateTypeToString(Engine300Package.Literals.PROCESSING_STATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerModeType createServerModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createServerModeTypeFromString(Engine300Package.Literals.SERVER_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServerModeTypeToString(Engine300Package.Literals.SERVER_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionType createSortDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSortDirectionTypeFromString(Engine300Package.Literals.SORT_DIRECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortDirectionTypeToString(Engine300Package.Literals.SORT_DIRECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionType1 createSortDirectionTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSortDirectionType1FromString(Engine300Package.Literals.SORT_DIRECTION_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSortDirectionType1ToString(Engine300Package.Literals.SORT_DIRECTION_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringStoresCompatibilityLevelType createStringStoresCompatibilityLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStringStoresCompatibilityLevelTypeFromString(Engine300Package.Literals.STRING_STORES_COMPATIBILITY_LEVEL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringStoresCompatibilityLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStringStoresCompatibilityLevelTypeToString(Engine300Package.Literals.STRING_STORES_COMPATIBILITY_LEVEL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeType createStructureTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureTypeTypeFromString(Engine300Package.Literals.STRUCTURE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureTypeTypeToString(Engine300Package.Literals.STRUCTURE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300Package getEngine300Package() {
		return (Engine300Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Engine300Package getPackage() {
		return Engine300Package.eINSTANCE;
	}

} //Engine300FactoryImpl
