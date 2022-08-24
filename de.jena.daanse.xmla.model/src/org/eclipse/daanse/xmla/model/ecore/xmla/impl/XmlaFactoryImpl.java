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
			case XmlaPackage.DISCOVER_RESPONSE: return createDiscoverResponse();
			case XmlaPackage.DISCOVER: return createDiscover();
			case XmlaPackage.PROPERTIES: return createProperties();
			case XmlaPackage.PROPERTY_LIST: return createPropertyList();
			case XmlaPackage.RESTRICTION_LIST: return createRestrictionList();
			case XmlaPackage.RESTRICTIONS: return createRestrictions();
			case XmlaPackage.RETURN: return createReturn();
			case XmlaPackage.ANNOTATION: return createAnnotation();
			case XmlaPackage.ANNOTATIONS: return createAnnotations();
			case XmlaPackage.EVENT_SESSION: return createEventSession();
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
			case XmlaPackage.REQUEST:
				return createRequestFromString(eDataType, initialValue);
			case XmlaPackage.RESPONSE_ENCODING:
				return createResponseEncodingFromString(eDataType, initialValue);
			case XmlaPackage.STATE_SUPPORT:
				return createStateSupportFromString(eDataType, initialValue);
			case XmlaPackage.FORMAT:
				return createFormatFromString(eDataType, initialValue);
			case XmlaPackage.CONTENT:
				return createContentFromString(eDataType, initialValue);
			case XmlaPackage.AXIS_FORMAT:
				return createAxisFormatFromString(eDataType, initialValue);
			case XmlaPackage.MDX_SUPPORT:
				return createMDXSupportFromString(eDataType, initialValue);
			case XmlaPackage.PROVIDER_TYPE:
				return createProviderTypeFromString(eDataType, initialValue);
			case XmlaPackage.VISUAL_MODE:
				return createVisualModeFromString(eDataType, initialValue);
			case XmlaPackage.CATALOG_LOCATION:
				return createCatalogLocationFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR:
				return createDbpropConcatNullBehaviorFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_NULL_COLLATION:
				return createDbpropNullCollationFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE:
				return createDbpropOutputParameterAvailableFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE:
				return createDbpropPersistentIdTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR:
				return createDbpropPrepareAbortBehaviorFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR:
				return createDbpropPrepareCommitBehaviorFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE:
				return createDbpropQuotedIdentifierCaseFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE:
				return createMdpropAggregateCellUpdateFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT:
				return createMdpropFlatteningSupportFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS:
				return createMdpropMdxNonMeasureExpressionsFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET:
				return createMdpropMdxRangeRowsetFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_SLICER:
				return createMdpropMdxSlicerFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE:
				return createMdxMissingMemberModeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY:
				return createDbpropMsmdMDXCompatibilityFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS:
				return createDbpropMsmdCompareCaseSensitiveStringFlagsFromString(eDataType, initialValue);
			case XmlaPackage.SECURED_CELL_VALUE:
				return createSecuredCellValueFromString(eDataType, initialValue);
			case XmlaPackage.SAFETY_OPTIONS:
				return createSafetyOptionsFromString(eDataType, initialValue);
			case XmlaPackage.DIALECT:
				return createDialectFromString(eDataType, initialValue);
			case XmlaPackage.SQL_QUERY_MODE:
				return createSQLQueryModeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES:
				return createDbpropMsmdSubqueriesFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS:
				return createDbpropMsmdAutoExistsFromString(eDataType, initialValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL:
				return createUpdateIsolationLevelFromString(eDataType, initialValue);
			case XmlaPackage.MEMORY_LOCKING_MODE:
				return createMemoryLockingModeFromString(eDataType, initialValue);
			case XmlaPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case XmlaPackage.RETENTION_MODES:
				return createRetentionModesFromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_MODES:
				return createPartitionModesFromString(eDataType, initialValue);
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
			case XmlaPackage.REQUEST:
				return convertRequestToString(eDataType, instanceValue);
			case XmlaPackage.RESPONSE_ENCODING:
				return convertResponseEncodingToString(eDataType, instanceValue);
			case XmlaPackage.STATE_SUPPORT:
				return convertStateSupportToString(eDataType, instanceValue);
			case XmlaPackage.FORMAT:
				return convertFormatToString(eDataType, instanceValue);
			case XmlaPackage.CONTENT:
				return convertContentToString(eDataType, instanceValue);
			case XmlaPackage.AXIS_FORMAT:
				return convertAxisFormatToString(eDataType, instanceValue);
			case XmlaPackage.MDX_SUPPORT:
				return convertMDXSupportToString(eDataType, instanceValue);
			case XmlaPackage.PROVIDER_TYPE:
				return convertProviderTypeToString(eDataType, instanceValue);
			case XmlaPackage.VISUAL_MODE:
				return convertVisualModeToString(eDataType, instanceValue);
			case XmlaPackage.CATALOG_LOCATION:
				return convertCatalogLocationToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR:
				return convertDbpropConcatNullBehaviorToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_NULL_COLLATION:
				return convertDbpropNullCollationToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE:
				return convertDbpropOutputParameterAvailableToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE:
				return convertDbpropPersistentIdTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR:
				return convertDbpropPrepareAbortBehaviorToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR:
				return convertDbpropPrepareCommitBehaviorToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE:
				return convertDbpropQuotedIdentifierCaseToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE:
				return convertMdpropAggregateCellUpdateToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT:
				return convertMdpropFlatteningSupportToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS:
				return convertMdpropMdxNonMeasureExpressionsToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET:
				return convertMdpropMdxRangeRowsetToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_SLICER:
				return convertMdpropMdxSlicerToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE:
				return convertMdxMissingMemberModeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY:
				return convertDbpropMsmdMDXCompatibilityToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS:
				return convertDbpropMsmdCompareCaseSensitiveStringFlagsToString(eDataType, instanceValue);
			case XmlaPackage.SECURED_CELL_VALUE:
				return convertSecuredCellValueToString(eDataType, instanceValue);
			case XmlaPackage.SAFETY_OPTIONS:
				return convertSafetyOptionsToString(eDataType, instanceValue);
			case XmlaPackage.DIALECT:
				return convertDialectToString(eDataType, instanceValue);
			case XmlaPackage.SQL_QUERY_MODE:
				return convertSQLQueryModeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES:
				return convertDbpropMsmdSubqueriesToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS:
				return convertDbpropMsmdAutoExistsToString(eDataType, instanceValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL:
				return convertUpdateIsolationLevelToString(eDataType, instanceValue);
			case XmlaPackage.MEMORY_LOCKING_MODE:
				return convertMemoryLockingModeToString(eDataType, instanceValue);
			case XmlaPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case XmlaPackage.RETENTION_MODES:
				return convertRetentionModesToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_MODES:
				return convertPartitionModesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverResponse createDiscoverResponse() {
		DiscoverResponseImpl discoverResponse = new DiscoverResponseImpl();
		return discoverResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discover createDiscover() {
		DiscoverImpl discover = new DiscoverImpl();
		return discover;
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
	public PropertyList createPropertyList() {
		PropertyListImpl propertyList = new PropertyListImpl();
		return propertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionList createRestrictionList() {
		RestrictionListImpl restrictionList = new RestrictionListImpl();
		return restrictionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restrictions createRestrictions() {
		RestrictionsImpl restrictions = new RestrictionsImpl();
		return restrictions;
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
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations createAnnotations() {
		AnnotationsImpl annotations = new AnnotationsImpl();
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSession createEventSession() {
		EventSessionImpl eventSession = new EventSessionImpl();
		return eventSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequestFromString(EDataType eDataType, String initialValue) {
		Request result = Request.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEncoding createResponseEncodingFromString(EDataType eDataType, String initialValue) {
		ResponseEncoding result = ResponseEncoding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseEncodingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSupport createStateSupportFromString(EDataType eDataType, String initialValue) {
		StateSupport result = StateSupport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSupportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format createFormatFromString(EDataType eDataType, String initialValue) {
		Format result = Format.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContentFromString(EDataType eDataType, String initialValue) {
		Content result = Content.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFormat createAxisFormatFromString(EDataType eDataType, String initialValue) {
		AxisFormat result = AxisFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDXSupport createMDXSupportFromString(EDataType eDataType, String initialValue) {
		MDXSupport result = MDXSupport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDXSupportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType createProviderTypeFromString(EDataType eDataType, String initialValue) {
		ProviderType result = ProviderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualMode createVisualModeFromString(EDataType eDataType, String initialValue) {
		VisualMode result = VisualMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogLocation createCatalogLocationFromString(EDataType eDataType, String initialValue) {
		CatalogLocation result = CatalogLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropConcatNullBehavior createDbpropConcatNullBehaviorFromString(EDataType eDataType, String initialValue) {
		DbpropConcatNullBehavior result = DbpropConcatNullBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropConcatNullBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropNullCollation createDbpropNullCollationFromString(EDataType eDataType, String initialValue) {
		DbpropNullCollation result = DbpropNullCollation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropNullCollationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropOutputParameterAvailable createDbpropOutputParameterAvailableFromString(EDataType eDataType, String initialValue) {
		DbpropOutputParameterAvailable result = DbpropOutputParameterAvailable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropOutputParameterAvailableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPersistentIdType createDbpropPersistentIdTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPersistentIdType result = DbpropPersistentIdType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPersistentIdTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareAbortBehavior createDbpropPrepareAbortBehaviorFromString(EDataType eDataType, String initialValue) {
		DbpropPrepareAbortBehavior result = DbpropPrepareAbortBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareAbortBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareCommitBehavior createDbpropPrepareCommitBehaviorFromString(EDataType eDataType, String initialValue) {
		DbpropPrepareCommitBehavior result = DbpropPrepareCommitBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareCommitBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropQuotedIdentifierCase createDbpropQuotedIdentifierCaseFromString(EDataType eDataType, String initialValue) {
		DbpropQuotedIdentifierCase result = DbpropQuotedIdentifierCase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropQuotedIdentifierCaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropAggregateCellUpdate createMdpropAggregateCellUpdateFromString(EDataType eDataType, String initialValue) {
		MdpropAggregateCellUpdate result = MdpropAggregateCellUpdate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropAggregateCellUpdateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropFlatteningSupport createMdpropFlatteningSupportFromString(EDataType eDataType, String initialValue) {
		MdpropFlatteningSupport result = MdpropFlatteningSupport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropFlatteningSupportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxNonMeasureExpressions createMdpropMdxNonMeasureExpressionsFromString(EDataType eDataType, String initialValue) {
		MdpropMdxNonMeasureExpressions result = MdpropMdxNonMeasureExpressions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxNonMeasureExpressionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxRangeRowset createMdpropMdxRangeRowsetFromString(EDataType eDataType, String initialValue) {
		MdpropMdxRangeRowset result = MdpropMdxRangeRowset.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxRangeRowsetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxSlicer createMdpropMdxSlicerFromString(EDataType eDataType, String initialValue) {
		MdpropMdxSlicer result = MdpropMdxSlicer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxSlicerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberMode createMdxMissingMemberModeFromString(EDataType eDataType, String initialValue) {
		MdxMissingMemberMode result = MdxMissingMemberMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdMDXCompatibility createDbpropMsmdMDXCompatibilityFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdMDXCompatibility result = DbpropMsmdMDXCompatibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdMDXCompatibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdCompareCaseSensitiveStringFlags createDbpropMsmdCompareCaseSensitiveStringFlagsFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdCompareCaseSensitiveStringFlags result = DbpropMsmdCompareCaseSensitiveStringFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdCompareCaseSensitiveStringFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuredCellValue createSecuredCellValueFromString(EDataType eDataType, String initialValue) {
		SecuredCellValue result = SecuredCellValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuredCellValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyOptions createSafetyOptionsFromString(EDataType eDataType, String initialValue) {
		SafetyOptions result = SafetyOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSafetyOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialect createDialectFromString(EDataType eDataType, String initialValue) {
		Dialect result = Dialect.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQueryMode createSQLQueryModeFromString(EDataType eDataType, String initialValue) {
		SQLQueryMode result = SQLQueryMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSQLQueryModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdSubqueries createDbpropMsmdSubqueriesFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdSubqueries result = DbpropMsmdSubqueries.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdSubqueriesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdAutoExists createDbpropMsmdAutoExistsFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdAutoExists result = DbpropMsmdAutoExists.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdAutoExistsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateIsolationLevel createUpdateIsolationLevelFromString(EDataType eDataType, String initialValue) {
		UpdateIsolationLevel result = UpdateIsolationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateIsolationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLockingMode createMemoryLockingModeFromString(EDataType eDataType, String initialValue) {
		MemoryLockingMode result = MemoryLockingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryLockingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
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
