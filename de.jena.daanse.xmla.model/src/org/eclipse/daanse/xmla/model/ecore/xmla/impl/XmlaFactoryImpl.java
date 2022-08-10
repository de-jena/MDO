/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.*;

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
public class XmlaFactoryImpl extends EFactoryImpl implements XmlaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmlaFactory init() {
		try {
			XmlaFactory theXmlaFactory = (XmlaFactory)EPackage.Registry.INSTANCE.getEFactory(XmlaPackage.eNS_URI);
			if (theXmlaFactory != null) {
				return theXmlaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmlaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaFactoryImpl() {
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
			case XmlaPackage.DISCOVER_RESPONSE_TYPE: return createDiscoverResponseType();
			case XmlaPackage.DISCOVER_TYPE: return createDiscoverType();
			case XmlaPackage.PROPERTIES: return createProperties();
			case XmlaPackage.PROPERTIES_TYPE: return createPropertiesType();
			case XmlaPackage.PROPERTY_LIST: return createPropertyList();
			case XmlaPackage.RESTRICTION_LIST_TYPE: return createRestrictionListType();
			case XmlaPackage.RESTRICTIONS_TYPE: return createRestrictionsType();
			case XmlaPackage.RETURN: return createReturn();
			case XmlaPackage.RETURN_TYPE: return createReturnType();
			case XmlaPackage.ANNOTATION: return createAnnotation();
			case XmlaPackage.ANNOTATIONS_TYPE: return createAnnotationsType();
			case XmlaPackage.EVENT_SESSION_TYPE: return createEventSessionType();
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
			case XmlaPackage.REQUEST_TYPE_TYPE:
				return createRequestTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE:
				return createResponseEncodingTypeFromString(eDataType, initialValue);
			case XmlaPackage.STATE_SUPPORT_TYPE:
				return createStateSupportTypeFromString(eDataType, initialValue);
			case XmlaPackage.FORMAT_TYPE1:
				return createFormatType1FromString(eDataType, initialValue);
			case XmlaPackage.CONTENT_TYPE1:
				return createContentType1FromString(eDataType, initialValue);
			case XmlaPackage.AXIS_FORMAT_TYPE:
				return createAxisFormatTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDX_SUPPORT_TYPE:
				return createMDXSupportTypeFromString(eDataType, initialValue);
			case XmlaPackage.PROVIDER_TYPE_TYPE:
				return createProviderTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.VISUAL_MODE_TYPE:
				return createVisualModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.CATALOG_LOCATION_TYPE:
				return createCatalogLocationTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE:
				return createDbpropConcatNullBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE:
				return createDbpropNullCollationTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE:
				return createDbpropOutputParameterAvailableTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE:
				return createDbpropPersistentIdTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE:
				return createDbpropPrepareAbortBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE:
				return createDbpropPrepareCommitBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE:
				return createDbpropQuotedIdentifierCaseTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE:
				return createMdpropAggregateCellUpdateTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE:
				return createMdpropFlatteningSupportTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE:
				return createMdpropMdxNonMeasureExpressionsTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE:
				return createMdpropMdxRangeRowsetTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE:
				return createMdpropMdxSlicerTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE:
				return createMdxMissingMemberModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE:
				return createDbpropMsmdMDXCompatibilityTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE:
				return createDbpropMsmdCompareCaseSensitiveStringFlagsTypeFromString(eDataType, initialValue);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE:
				return createSecuredCellValueTypeFromString(eDataType, initialValue);
			case XmlaPackage.SAFETY_OPTIONS_TYPE:
				return createSafetyOptionsTypeFromString(eDataType, initialValue);
			case XmlaPackage.DIALECT_TYPE:
				return createDialectTypeFromString(eDataType, initialValue);
			case XmlaPackage.SQL_QUERY_MODE_TYPE:
				return createSQLQueryModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE1:
				return createMdxMissingMemberModeType1FromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE:
				return createDbpropMsmdSubqueriesTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE:
				return createDbpropMsmdAutoExistsTypeFromString(eDataType, initialValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE:
				return createUpdateIsolationLevelTypeFromString(eDataType, initialValue);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE:
				return createMemoryLockingModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.VISIBILITY_TYPE:
				return createVisibilityTypeFromString(eDataType, initialValue);
			case XmlaPackage.RETENTION_MODES:
				return createRetentionModesFromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_MODES:
				return createPartitionModesFromString(eDataType, initialValue);
			case XmlaPackage.REQUEST_TYPE_TYPE_OBJECT:
				return createRequestTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE_OBJECT:
				return createResponseEncodingTypeObjectFromString(eDataType, initialValue);
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
			case XmlaPackage.REQUEST_TYPE_TYPE:
				return convertRequestTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE:
				return convertResponseEncodingTypeToString(eDataType, instanceValue);
			case XmlaPackage.STATE_SUPPORT_TYPE:
				return convertStateSupportTypeToString(eDataType, instanceValue);
			case XmlaPackage.FORMAT_TYPE1:
				return convertFormatType1ToString(eDataType, instanceValue);
			case XmlaPackage.CONTENT_TYPE1:
				return convertContentType1ToString(eDataType, instanceValue);
			case XmlaPackage.AXIS_FORMAT_TYPE:
				return convertAxisFormatTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDX_SUPPORT_TYPE:
				return convertMDXSupportTypeToString(eDataType, instanceValue);
			case XmlaPackage.PROVIDER_TYPE_TYPE:
				return convertProviderTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.VISUAL_MODE_TYPE:
				return convertVisualModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.CATALOG_LOCATION_TYPE:
				return convertCatalogLocationTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE:
				return convertDbpropConcatNullBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE:
				return convertDbpropNullCollationTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE:
				return convertDbpropOutputParameterAvailableTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE:
				return convertDbpropPersistentIdTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE:
				return convertDbpropPrepareAbortBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE:
				return convertDbpropPrepareCommitBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE:
				return convertDbpropQuotedIdentifierCaseTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE:
				return convertMdpropAggregateCellUpdateTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE:
				return convertMdpropFlatteningSupportTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE:
				return convertMdpropMdxNonMeasureExpressionsTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE:
				return convertMdpropMdxRangeRowsetTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE:
				return convertMdpropMdxSlicerTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE:
				return convertMdxMissingMemberModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE:
				return convertDbpropMsmdMDXCompatibilityTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE:
				return convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeToString(eDataType, instanceValue);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE:
				return convertSecuredCellValueTypeToString(eDataType, instanceValue);
			case XmlaPackage.SAFETY_OPTIONS_TYPE:
				return convertSafetyOptionsTypeToString(eDataType, instanceValue);
			case XmlaPackage.DIALECT_TYPE:
				return convertDialectTypeToString(eDataType, instanceValue);
			case XmlaPackage.SQL_QUERY_MODE_TYPE:
				return convertSQLQueryModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE1:
				return convertMdxMissingMemberModeType1ToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE:
				return convertDbpropMsmdSubqueriesTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE:
				return convertDbpropMsmdAutoExistsTypeToString(eDataType, instanceValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE:
				return convertUpdateIsolationLevelTypeToString(eDataType, instanceValue);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE:
				return convertMemoryLockingModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.VISIBILITY_TYPE:
				return convertVisibilityTypeToString(eDataType, instanceValue);
			case XmlaPackage.RETENTION_MODES:
				return convertRetentionModesToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_MODES:
				return convertPartitionModesToString(eDataType, instanceValue);
			case XmlaPackage.REQUEST_TYPE_TYPE_OBJECT:
				return convertRequestTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE_OBJECT:
				return convertResponseEncodingTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverResponseType createDiscoverResponseType() {
		DiscoverResponseTypeImpl discoverResponseType = new DiscoverResponseTypeImpl();
		return discoverResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverType createDiscoverType() {
		DiscoverTypeImpl discoverType = new DiscoverTypeImpl();
		return discoverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyList createPropertyList() {
		PropertyListImpl propertyList = new PropertyListImpl();
		return propertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionListType createRestrictionListType() {
		RestrictionListTypeImpl restrictionListType = new RestrictionListTypeImpl();
		return restrictionListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsType createRestrictionsType() {
		RestrictionsTypeImpl restrictionsType = new RestrictionsTypeImpl();
		return restrictionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
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
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType createAnnotationsType() {
		AnnotationsTypeImpl annotationsType = new AnnotationsTypeImpl();
		return annotationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSessionType createEventSessionType() {
		EventSessionTypeImpl eventSessionType = new EventSessionTypeImpl();
		return eventSessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestTypeType createRequestTypeTypeFromString(EDataType eDataType, String initialValue) {
		RequestTypeType result = RequestTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEncodingType createResponseEncodingTypeFromString(EDataType eDataType, String initialValue) {
		ResponseEncodingType result = ResponseEncodingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseEncodingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSupportType createStateSupportTypeFromString(EDataType eDataType, String initialValue) {
		StateSupportType result = StateSupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType1 createFormatType1FromString(EDataType eDataType, String initialValue) {
		FormatType1 result = FormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType1 createContentType1FromString(EDataType eDataType, String initialValue) {
		ContentType1 result = ContentType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFormatType createAxisFormatTypeFromString(EDataType eDataType, String initialValue) {
		AxisFormatType result = AxisFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDXSupportType createMDXSupportTypeFromString(EDataType eDataType, String initialValue) {
		MDXSupportType result = MDXSupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDXSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderTypeType createProviderTypeTypeFromString(EDataType eDataType, String initialValue) {
		ProviderTypeType result = ProviderTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualModeType createVisualModeTypeFromString(EDataType eDataType, String initialValue) {
		VisualModeType result = VisualModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogLocationType createCatalogLocationTypeFromString(EDataType eDataType, String initialValue) {
		CatalogLocationType result = CatalogLocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropConcatNullBehaviorType createDbpropConcatNullBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		DbpropConcatNullBehaviorType result = DbpropConcatNullBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropConcatNullBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropNullCollationType createDbpropNullCollationTypeFromString(EDataType eDataType, String initialValue) {
		DbpropNullCollationType result = DbpropNullCollationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropNullCollationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropOutputParameterAvailableType createDbpropOutputParameterAvailableTypeFromString(EDataType eDataType, String initialValue) {
		DbpropOutputParameterAvailableType result = DbpropOutputParameterAvailableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropOutputParameterAvailableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPersistentIdTypeType createDbpropPersistentIdTypeTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPersistentIdTypeType result = DbpropPersistentIdTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPersistentIdTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareAbortBehaviorType createDbpropPrepareAbortBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPrepareAbortBehaviorType result = DbpropPrepareAbortBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareAbortBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareCommitBehaviorType createDbpropPrepareCommitBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPrepareCommitBehaviorType result = DbpropPrepareCommitBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareCommitBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropQuotedIdentifierCaseType createDbpropQuotedIdentifierCaseTypeFromString(EDataType eDataType, String initialValue) {
		DbpropQuotedIdentifierCaseType result = DbpropQuotedIdentifierCaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropQuotedIdentifierCaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropAggregateCellUpdateType createMdpropAggregateCellUpdateTypeFromString(EDataType eDataType, String initialValue) {
		MdpropAggregateCellUpdateType result = MdpropAggregateCellUpdateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropAggregateCellUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropFlatteningSupportType createMdpropFlatteningSupportTypeFromString(EDataType eDataType, String initialValue) {
		MdpropFlatteningSupportType result = MdpropFlatteningSupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropFlatteningSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxNonMeasureExpressionsType createMdpropMdxNonMeasureExpressionsTypeFromString(EDataType eDataType, String initialValue) {
		MdpropMdxNonMeasureExpressionsType result = MdpropMdxNonMeasureExpressionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxNonMeasureExpressionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxRangeRowsetType createMdpropMdxRangeRowsetTypeFromString(EDataType eDataType, String initialValue) {
		MdpropMdxRangeRowsetType result = MdpropMdxRangeRowsetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxRangeRowsetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxSlicerType createMdpropMdxSlicerTypeFromString(EDataType eDataType, String initialValue) {
		MdpropMdxSlicerType result = MdpropMdxSlicerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxSlicerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType createMdxMissingMemberModeTypeFromString(EDataType eDataType, String initialValue) {
		MdxMissingMemberModeType result = MdxMissingMemberModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdMDXCompatibilityType createDbpropMsmdMDXCompatibilityTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdMDXCompatibilityType result = DbpropMsmdMDXCompatibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdMDXCompatibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdCompareCaseSensitiveStringFlagsType createDbpropMsmdCompareCaseSensitiveStringFlagsTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdCompareCaseSensitiveStringFlagsType result = DbpropMsmdCompareCaseSensitiveStringFlagsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuredCellValueType createSecuredCellValueTypeFromString(EDataType eDataType, String initialValue) {
		SecuredCellValueType result = SecuredCellValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuredCellValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyOptionsType createSafetyOptionsTypeFromString(EDataType eDataType, String initialValue) {
		SafetyOptionsType result = SafetyOptionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSafetyOptionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialectType createDialectTypeFromString(EDataType eDataType, String initialValue) {
		DialectType result = DialectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQueryModeType createSQLQueryModeTypeFromString(EDataType eDataType, String initialValue) {
		SQLQueryModeType result = SQLQueryModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSQLQueryModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType1 createMdxMissingMemberModeType1FromString(EDataType eDataType, String initialValue) {
		MdxMissingMemberModeType1 result = MdxMissingMemberModeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdSubqueriesType createDbpropMsmdSubqueriesTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdSubqueriesType result = DbpropMsmdSubqueriesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdSubqueriesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdAutoExistsType createDbpropMsmdAutoExistsTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdAutoExistsType result = DbpropMsmdAutoExistsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdAutoExistsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateIsolationLevelType createUpdateIsolationLevelTypeFromString(EDataType eDataType, String initialValue) {
		UpdateIsolationLevelType result = UpdateIsolationLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateIsolationLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLockingModeType createMemoryLockingModeTypeFromString(EDataType eDataType, String initialValue) {
		MemoryLockingModeType result = MemoryLockingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryLockingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		VisibilityType result = VisibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetentionModes createRetentionModesFromString(EDataType eDataType, String initialValue) {
		RetentionModes result = RetentionModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRetentionModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionModes createPartitionModesFromString(EDataType eDataType, String initialValue) {
		PartitionModes result = PartitionModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestTypeType createRequestTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestTypeTypeFromString(XmlaPackage.Literals.REQUEST_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestTypeTypeToString(XmlaPackage.Literals.REQUEST_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEncodingType createResponseEncodingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseEncodingTypeFromString(XmlaPackage.Literals.RESPONSE_ENCODING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseEncodingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseEncodingTypeToString(XmlaPackage.Literals.RESPONSE_ENCODING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaPackage getXmlaPackage() {
		return (XmlaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmlaPackage getPackage() {
		return XmlaPackage.eINSTANCE;
	}

} //XmlaFactoryImpl
