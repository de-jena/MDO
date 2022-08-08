/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState;
import org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType17;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationshipsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataItem;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscretizationMethodType;
import org.eclipse.daanse.xmla.model.ecore.xmla.GroupingBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InstanceSelectionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MembersWithDataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OrderByType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RootMemberIfType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType18;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.UsageType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getEstimatedCount <em>Estimated Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getValueColumn <em>Value Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getAttributeRelationships <em>Attribute Relationships</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getDiscretizationMethod <em>Discretization Method</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getDiscretizationBucketCount <em>Discretization Bucket Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getRootMemberIf <em>Root Member If</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getOrderByAttributeID <em>Order By Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getSkippedLevelsColumn <em>Skipped Levels Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getNamingTemplate <em>Naming Template</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getMembersWithData <em>Members With Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getMembersWithDataCaption <em>Members With Data Caption</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getNamingTemplateTranslations <em>Naming Template Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getCustomRollupColumn <em>Custom Rollup Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getCustomRollupPropertiesColumn <em>Custom Rollup Properties Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getUnaryOperatorColumn <em>Unary Operator Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#isAttributeHierarchyOrdered <em>Attribute Hierarchy Ordered</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#isMemberNamesUnique <em>Member Names Unique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#isIsAggregatable <em>Is Aggregatable</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getAttributeHierarchyDisplayFolder <em>Attribute Hierarchy Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#isKeyUniquenessGuarantee <em>Key Uniqueness Guarantee</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getInstanceSelection <em>Instance Selection</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getAttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getVisualizationProperties <em>Visualization Properties</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionAttributeImpl#getExtendedType <em>Extended Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionAttributeImpl extends MinimalEObjectImpl.Container implements DimensionAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType6 type;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageType1 USAGE_EDEFAULT = UsageType1.REGULAR;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageType1 usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Binding source;

	/**
	 * The default value of the '{@link #getEstimatedCount() <em>Estimated Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCount()
	 * @generated
	 * @ordered
	 */
	protected static final long ESTIMATED_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEstimatedCount() <em>Estimated Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCount()
	 * @generated
	 * @ordered
	 */
	protected long estimatedCount = ESTIMATED_COUNT_EDEFAULT;

	/**
	 * This is true if the Estimated Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedCountESet;

	/**
	 * The cached value of the '{@link #getKeyColumns() <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected KeyColumnsType keyColumns;

	/**
	 * The cached value of the '{@link #getNameColumn() <em>Name Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem nameColumn;

	/**
	 * The cached value of the '{@link #getValueColumn() <em>Value Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem valueColumn;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType18 translations;

	/**
	 * The cached value of the '{@link #getAttributeRelationships() <em>Attribute Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRelationships()
	 * @generated
	 * @ordered
	 */
	protected AttributeRelationshipsType attributeRelationships;

	/**
	 * The default value of the '{@link #getDiscretizationMethod() <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final DiscretizationMethodType DISCRETIZATION_METHOD_EDEFAULT = DiscretizationMethodType.NONE;

	/**
	 * The cached value of the '{@link #getDiscretizationMethod() <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationMethod()
	 * @generated
	 * @ordered
	 */
	protected DiscretizationMethodType discretizationMethod = DISCRETIZATION_METHOD_EDEFAULT;

	/**
	 * This is true if the Discretization Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discretizationMethodESet;

	/**
	 * The default value of the '{@link #getDiscretizationBucketCount() <em>Discretization Bucket Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationBucketCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISCRETIZATION_BUCKET_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscretizationBucketCount() <em>Discretization Bucket Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationBucketCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger discretizationBucketCount = DISCRETIZATION_BUCKET_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootMemberIf() <em>Root Member If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootMemberIf()
	 * @generated
	 * @ordered
	 */
	protected static final RootMemberIfType ROOT_MEMBER_IF_EDEFAULT = RootMemberIfType.PARENT_IS_BLANK_SELF_OR_MISSING;

	/**
	 * The cached value of the '{@link #getRootMemberIf() <em>Root Member If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootMemberIf()
	 * @generated
	 * @ordered
	 */
	protected RootMemberIfType rootMemberIf = ROOT_MEMBER_IF_EDEFAULT;

	/**
	 * This is true if the Root Member If attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rootMemberIfESet;

	/**
	 * The default value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected static final OrderByType ORDER_BY_EDEFAULT = OrderByType.KEY;

	/**
	 * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected OrderByType orderBy = ORDER_BY_EDEFAULT;

	/**
	 * This is true if the Order By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderByESet;

	/**
	 * The default value of the '{@link #getDefaultMember() <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMember()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MEMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMember() <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMember()
	 * @generated
	 * @ordered
	 */
	protected String defaultMember = DEFAULT_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderByAttributeID() <em>Order By Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_BY_ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderByAttributeID() <em>Order By Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByAttributeID()
	 * @generated
	 * @ordered
	 */
	protected String orderByAttributeID = ORDER_BY_ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkippedLevelsColumn() <em>Skipped Levels Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkippedLevelsColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem skippedLevelsColumn;

	/**
	 * The default value of the '{@link #getNamingTemplate() <em>Naming Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMING_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamingTemplate() <em>Naming Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingTemplate()
	 * @generated
	 * @ordered
	 */
	protected String namingTemplate = NAMING_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMembersWithData() <em>Members With Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembersWithData()
	 * @generated
	 * @ordered
	 */
	protected static final MembersWithDataType MEMBERS_WITH_DATA_EDEFAULT = MembersWithDataType.NON_LEAF_DATA_HIDDEN;

	/**
	 * The cached value of the '{@link #getMembersWithData() <em>Members With Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembersWithData()
	 * @generated
	 * @ordered
	 */
	protected MembersWithDataType membersWithData = MEMBERS_WITH_DATA_EDEFAULT;

	/**
	 * This is true if the Members With Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean membersWithDataESet;

	/**
	 * The default value of the '{@link #getMembersWithDataCaption() <em>Members With Data Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembersWithDataCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBERS_WITH_DATA_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMembersWithDataCaption() <em>Members With Data Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembersWithDataCaption()
	 * @generated
	 * @ordered
	 */
	protected String membersWithDataCaption = MEMBERS_WITH_DATA_CAPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamingTemplateTranslations() <em>Naming Template Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingTemplateTranslations()
	 * @generated
	 * @ordered
	 */
	protected NamingTemplateTranslationsType namingTemplateTranslations;

	/**
	 * The cached value of the '{@link #getCustomRollupColumn() <em>Custom Rollup Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomRollupColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem customRollupColumn;

	/**
	 * The cached value of the '{@link #getCustomRollupPropertiesColumn() <em>Custom Rollup Properties Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomRollupPropertiesColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem customRollupPropertiesColumn;

	/**
	 * The cached value of the '{@link #getUnaryOperatorColumn() <em>Unary Operator Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperatorColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem unaryOperatorColumn;

	/**
	 * The default value of the '{@link #isAttributeHierarchyOrdered() <em>Attribute Hierarchy Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_HIERARCHY_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttributeHierarchyOrdered() <em>Attribute Hierarchy Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyOrdered = ATTRIBUTE_HIERARCHY_ORDERED_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Ordered attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyOrderedESet;

	/**
	 * The default value of the '{@link #isMemberNamesUnique() <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberNamesUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_NAMES_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMemberNamesUnique() <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberNamesUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean memberNamesUnique = MEMBER_NAMES_UNIQUE_EDEFAULT;

	/**
	 * This is true if the Member Names Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberNamesUniqueESet;

	/**
	 * The default value of the '{@link #isIsAggregatable() <em>Is Aggregatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAggregatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AGGREGATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAggregatable() <em>Is Aggregatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAggregatable()
	 * @generated
	 * @ordered
	 */
	protected boolean isAggregatable = IS_AGGREGATABLE_EDEFAULT;

	/**
	 * This is true if the Is Aggregatable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAggregatableESet;

	/**
	 * The default value of the '{@link #isAttributeHierarchyEnabled() <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttributeHierarchyEnabled() <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyEnabled = ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyEnabledESet;

	/**
	 * The default value of the '{@link #getAttributeHierarchyOptimizedState() <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyOptimizedState()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeHierarchyOptimizedStateType ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT = AttributeHierarchyOptimizedStateType.FULLY_OPTIMIZED;

	/**
	 * The cached value of the '{@link #getAttributeHierarchyOptimizedState() <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyOptimizedState()
	 * @generated
	 * @ordered
	 */
	protected AttributeHierarchyOptimizedStateType attributeHierarchyOptimizedState = ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Optimized State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyOptimizedStateESet;

	/**
	 * The default value of the '{@link #isAttributeHierarchyVisible() <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttributeHierarchyVisible() <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyVisible = ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyVisibleESet;

	/**
	 * The default value of the '{@link #getAttributeHierarchyDisplayFolder() <em>Attribute Hierarchy Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyDisplayFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeHierarchyDisplayFolder() <em>Attribute Hierarchy Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyDisplayFolder()
	 * @generated
	 * @ordered
	 */
	protected String attributeHierarchyDisplayFolder = ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isKeyUniquenessGuarantee() <em>Key Uniqueness Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyUniquenessGuarantee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_UNIQUENESS_GUARANTEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeyUniquenessGuarantee() <em>Key Uniqueness Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyUniquenessGuarantee()
	 * @generated
	 * @ordered
	 */
	protected boolean keyUniquenessGuarantee = KEY_UNIQUENESS_GUARANTEE_EDEFAULT;

	/**
	 * This is true if the Key Uniqueness Guarantee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyUniquenessGuaranteeESet;

	/**
	 * The default value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final GroupingBehaviorType GROUPING_BEHAVIOR_EDEFAULT = GroupingBehaviorType.ENCOURAGE_GROUPING;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected GroupingBehaviorType groupingBehavior = GROUPING_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Grouping Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupingBehaviorESet;

	/**
	 * The default value of the '{@link #getInstanceSelection() <em>Instance Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceSelection()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceSelectionType INSTANCE_SELECTION_EDEFAULT = InstanceSelectionType.NONE;

	/**
	 * The cached value of the '{@link #getInstanceSelection() <em>Instance Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceSelection()
	 * @generated
	 * @ordered
	 */
	protected InstanceSelectionType instanceSelection = INSTANCE_SELECTION_EDEFAULT;

	/**
	 * This is true if the Instance Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSelectionESet;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType17 annotations;

	/**
	 * The default value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingStateType PROCESSING_STATE_EDEFAULT = ProcessingStateType.PROCESSED;

	/**
	 * The cached value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected ProcessingStateType processingState = PROCESSING_STATE_EDEFAULT;

	/**
	 * This is true if the Processing State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingStateESet;

	/**
	 * The default value of the '{@link #getAttributeHierarchyProcessingState() <em>Attribute Hierarchy Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyProcessingState()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeHierarchyProcessingState ATTRIBUTE_HIERARCHY_PROCESSING_STATE_EDEFAULT = AttributeHierarchyProcessingState.PROCESSED;

	/**
	 * The cached value of the '{@link #getAttributeHierarchyProcessingState() <em>Attribute Hierarchy Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyProcessingState()
	 * @generated
	 * @ordered
	 */
	protected AttributeHierarchyProcessingState attributeHierarchyProcessingState = ATTRIBUTE_HIERARCHY_PROCESSING_STATE_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Processing State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyProcessingStateESet;

	/**
	 * The cached value of the '{@link #getVisualizationProperties() <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationProperties()
	 * @generated
	 * @ordered
	 */
	protected DimensionAttributeVisualizationProperties visualizationProperties;

	/**
	 * The default value of the '{@link #getExtendedType() <em>Extended Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedType() <em>Extended Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedType()
	 * @generated
	 * @ordered
	 */
	protected String extendedType = EXTENDED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DIMENSION_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType6 newType, NotificationChain msgs) {
		TypeType6 oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType6 newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageType1 newUsage) {
		UsageType1 oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		UsageType1 oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Binding newSource, NotificationChain msgs) {
		Binding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Binding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEstimatedCount() {
		return estimatedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedCount(long newEstimatedCount) {
		long oldEstimatedCount = estimatedCount;
		estimatedCount = newEstimatedCount;
		boolean oldEstimatedCountESet = estimatedCountESet;
		estimatedCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ESTIMATED_COUNT, oldEstimatedCount, estimatedCount, !oldEstimatedCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstimatedCount() {
		long oldEstimatedCount = estimatedCount;
		boolean oldEstimatedCountESet = estimatedCountESet;
		estimatedCount = ESTIMATED_COUNT_EDEFAULT;
		estimatedCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ESTIMATED_COUNT, oldEstimatedCount, ESTIMATED_COUNT_EDEFAULT, oldEstimatedCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstimatedCount() {
		return estimatedCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType getKeyColumns() {
		return keyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyColumns(KeyColumnsType newKeyColumns, NotificationChain msgs) {
		KeyColumnsType oldKeyColumns = keyColumns;
		keyColumns = newKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS, oldKeyColumns, newKeyColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyColumns(KeyColumnsType newKeyColumns) {
		if (newKeyColumns != keyColumns) {
			NotificationChain msgs = null;
			if (keyColumns != null)
				msgs = ((InternalEObject)keyColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS, null, msgs);
			if (newKeyColumns != null)
				msgs = ((InternalEObject)newKeyColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS, null, msgs);
			msgs = basicSetKeyColumns(newKeyColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS, newKeyColumns, newKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getNameColumn() {
		return nameColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameColumn(DataItem newNameColumn, NotificationChain msgs) {
		DataItem oldNameColumn = nameColumn;
		nameColumn = newNameColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN, oldNameColumn, newNameColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameColumn(DataItem newNameColumn) {
		if (newNameColumn != nameColumn) {
			NotificationChain msgs = null;
			if (nameColumn != null)
				msgs = ((InternalEObject)nameColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN, null, msgs);
			if (newNameColumn != null)
				msgs = ((InternalEObject)newNameColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN, null, msgs);
			msgs = basicSetNameColumn(newNameColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN, newNameColumn, newNameColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getValueColumn() {
		return valueColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueColumn(DataItem newValueColumn, NotificationChain msgs) {
		DataItem oldValueColumn = valueColumn;
		valueColumn = newValueColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN, oldValueColumn, newValueColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueColumn(DataItem newValueColumn) {
		if (newValueColumn != valueColumn) {
			NotificationChain msgs = null;
			if (valueColumn != null)
				msgs = ((InternalEObject)valueColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN, null, msgs);
			if (newValueColumn != null)
				msgs = ((InternalEObject)newValueColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN, null, msgs);
			msgs = basicSetValueColumn(newValueColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN, newValueColumn, newValueColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType18 getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType18 newTranslations, NotificationChain msgs) {
		TranslationsType18 oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType18 newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRelationshipsType getAttributeRelationships() {
		return attributeRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeRelationships(AttributeRelationshipsType newAttributeRelationships, NotificationChain msgs) {
		AttributeRelationshipsType oldAttributeRelationships = attributeRelationships;
		attributeRelationships = newAttributeRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS, oldAttributeRelationships, newAttributeRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeRelationships(AttributeRelationshipsType newAttributeRelationships) {
		if (newAttributeRelationships != attributeRelationships) {
			NotificationChain msgs = null;
			if (attributeRelationships != null)
				msgs = ((InternalEObject)attributeRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS, null, msgs);
			if (newAttributeRelationships != null)
				msgs = ((InternalEObject)newAttributeRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS, null, msgs);
			msgs = basicSetAttributeRelationships(newAttributeRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS, newAttributeRelationships, newAttributeRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretizationMethodType getDiscretizationMethod() {
		return discretizationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscretizationMethod(DiscretizationMethodType newDiscretizationMethod) {
		DiscretizationMethodType oldDiscretizationMethod = discretizationMethod;
		discretizationMethod = newDiscretizationMethod == null ? DISCRETIZATION_METHOD_EDEFAULT : newDiscretizationMethod;
		boolean oldDiscretizationMethodESet = discretizationMethodESet;
		discretizationMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_METHOD, oldDiscretizationMethod, discretizationMethod, !oldDiscretizationMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscretizationMethod() {
		DiscretizationMethodType oldDiscretizationMethod = discretizationMethod;
		boolean oldDiscretizationMethodESet = discretizationMethodESet;
		discretizationMethod = DISCRETIZATION_METHOD_EDEFAULT;
		discretizationMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_METHOD, oldDiscretizationMethod, DISCRETIZATION_METHOD_EDEFAULT, oldDiscretizationMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscretizationMethod() {
		return discretizationMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDiscretizationBucketCount() {
		return discretizationBucketCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscretizationBucketCount(BigInteger newDiscretizationBucketCount) {
		BigInteger oldDiscretizationBucketCount = discretizationBucketCount;
		discretizationBucketCount = newDiscretizationBucketCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_BUCKET_COUNT, oldDiscretizationBucketCount, discretizationBucketCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootMemberIfType getRootMemberIf() {
		return rootMemberIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootMemberIf(RootMemberIfType newRootMemberIf) {
		RootMemberIfType oldRootMemberIf = rootMemberIf;
		rootMemberIf = newRootMemberIf == null ? ROOT_MEMBER_IF_EDEFAULT : newRootMemberIf;
		boolean oldRootMemberIfESet = rootMemberIfESet;
		rootMemberIfESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ROOT_MEMBER_IF, oldRootMemberIf, rootMemberIf, !oldRootMemberIfESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRootMemberIf() {
		RootMemberIfType oldRootMemberIf = rootMemberIf;
		boolean oldRootMemberIfESet = rootMemberIfESet;
		rootMemberIf = ROOT_MEMBER_IF_EDEFAULT;
		rootMemberIfESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ROOT_MEMBER_IF, oldRootMemberIf, ROOT_MEMBER_IF_EDEFAULT, oldRootMemberIfESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRootMemberIf() {
		return rootMemberIfESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderByType getOrderBy() {
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderBy(OrderByType newOrderBy) {
		OrderByType oldOrderBy = orderBy;
		orderBy = newOrderBy == null ? ORDER_BY_EDEFAULT : newOrderBy;
		boolean oldOrderByESet = orderByESet;
		orderByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY, oldOrderBy, orderBy, !oldOrderByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrderBy() {
		OrderByType oldOrderBy = orderBy;
		boolean oldOrderByESet = orderByESet;
		orderBy = ORDER_BY_EDEFAULT;
		orderByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY, oldOrderBy, ORDER_BY_EDEFAULT, oldOrderByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrderBy() {
		return orderByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultMember() {
		return defaultMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMember(String newDefaultMember) {
		String oldDefaultMember = defaultMember;
		defaultMember = newDefaultMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__DEFAULT_MEMBER, oldDefaultMember, defaultMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderByAttributeID() {
		return orderByAttributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderByAttributeID(String newOrderByAttributeID) {
		String oldOrderByAttributeID = orderByAttributeID;
		orderByAttributeID = newOrderByAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY_ATTRIBUTE_ID, oldOrderByAttributeID, orderByAttributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getSkippedLevelsColumn() {
		return skippedLevelsColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkippedLevelsColumn(DataItem newSkippedLevelsColumn, NotificationChain msgs) {
		DataItem oldSkippedLevelsColumn = skippedLevelsColumn;
		skippedLevelsColumn = newSkippedLevelsColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN, oldSkippedLevelsColumn, newSkippedLevelsColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkippedLevelsColumn(DataItem newSkippedLevelsColumn) {
		if (newSkippedLevelsColumn != skippedLevelsColumn) {
			NotificationChain msgs = null;
			if (skippedLevelsColumn != null)
				msgs = ((InternalEObject)skippedLevelsColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN, null, msgs);
			if (newSkippedLevelsColumn != null)
				msgs = ((InternalEObject)newSkippedLevelsColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN, null, msgs);
			msgs = basicSetSkippedLevelsColumn(newSkippedLevelsColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN, newSkippedLevelsColumn, newSkippedLevelsColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamingTemplate() {
		return namingTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamingTemplate(String newNamingTemplate) {
		String oldNamingTemplate = namingTemplate;
		namingTemplate = newNamingTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE, oldNamingTemplate, namingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersWithDataType getMembersWithData() {
		return membersWithData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembersWithData(MembersWithDataType newMembersWithData) {
		MembersWithDataType oldMembersWithData = membersWithData;
		membersWithData = newMembersWithData == null ? MEMBERS_WITH_DATA_EDEFAULT : newMembersWithData;
		boolean oldMembersWithDataESet = membersWithDataESet;
		membersWithDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA, oldMembersWithData, membersWithData, !oldMembersWithDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMembersWithData() {
		MembersWithDataType oldMembersWithData = membersWithData;
		boolean oldMembersWithDataESet = membersWithDataESet;
		membersWithData = MEMBERS_WITH_DATA_EDEFAULT;
		membersWithDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA, oldMembersWithData, MEMBERS_WITH_DATA_EDEFAULT, oldMembersWithDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembersWithData() {
		return membersWithDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMembersWithDataCaption() {
		return membersWithDataCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembersWithDataCaption(String newMembersWithDataCaption) {
		String oldMembersWithDataCaption = membersWithDataCaption;
		membersWithDataCaption = newMembersWithDataCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA_CAPTION, oldMembersWithDataCaption, membersWithDataCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingTemplateTranslationsType getNamingTemplateTranslations() {
		return namingTemplateTranslations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingTemplateTranslations(NamingTemplateTranslationsType newNamingTemplateTranslations, NotificationChain msgs) {
		NamingTemplateTranslationsType oldNamingTemplateTranslations = namingTemplateTranslations;
		namingTemplateTranslations = newNamingTemplateTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS, oldNamingTemplateTranslations, newNamingTemplateTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamingTemplateTranslations(NamingTemplateTranslationsType newNamingTemplateTranslations) {
		if (newNamingTemplateTranslations != namingTemplateTranslations) {
			NotificationChain msgs = null;
			if (namingTemplateTranslations != null)
				msgs = ((InternalEObject)namingTemplateTranslations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS, null, msgs);
			if (newNamingTemplateTranslations != null)
				msgs = ((InternalEObject)newNamingTemplateTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS, null, msgs);
			msgs = basicSetNamingTemplateTranslations(newNamingTemplateTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS, newNamingTemplateTranslations, newNamingTemplateTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getCustomRollupColumn() {
		return customRollupColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomRollupColumn(DataItem newCustomRollupColumn, NotificationChain msgs) {
		DataItem oldCustomRollupColumn = customRollupColumn;
		customRollupColumn = newCustomRollupColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN, oldCustomRollupColumn, newCustomRollupColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomRollupColumn(DataItem newCustomRollupColumn) {
		if (newCustomRollupColumn != customRollupColumn) {
			NotificationChain msgs = null;
			if (customRollupColumn != null)
				msgs = ((InternalEObject)customRollupColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN, null, msgs);
			if (newCustomRollupColumn != null)
				msgs = ((InternalEObject)newCustomRollupColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN, null, msgs);
			msgs = basicSetCustomRollupColumn(newCustomRollupColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN, newCustomRollupColumn, newCustomRollupColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getCustomRollupPropertiesColumn() {
		return customRollupPropertiesColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomRollupPropertiesColumn(DataItem newCustomRollupPropertiesColumn, NotificationChain msgs) {
		DataItem oldCustomRollupPropertiesColumn = customRollupPropertiesColumn;
		customRollupPropertiesColumn = newCustomRollupPropertiesColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN, oldCustomRollupPropertiesColumn, newCustomRollupPropertiesColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomRollupPropertiesColumn(DataItem newCustomRollupPropertiesColumn) {
		if (newCustomRollupPropertiesColumn != customRollupPropertiesColumn) {
			NotificationChain msgs = null;
			if (customRollupPropertiesColumn != null)
				msgs = ((InternalEObject)customRollupPropertiesColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN, null, msgs);
			if (newCustomRollupPropertiesColumn != null)
				msgs = ((InternalEObject)newCustomRollupPropertiesColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN, null, msgs);
			msgs = basicSetCustomRollupPropertiesColumn(newCustomRollupPropertiesColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN, newCustomRollupPropertiesColumn, newCustomRollupPropertiesColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getUnaryOperatorColumn() {
		return unaryOperatorColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryOperatorColumn(DataItem newUnaryOperatorColumn, NotificationChain msgs) {
		DataItem oldUnaryOperatorColumn = unaryOperatorColumn;
		unaryOperatorColumn = newUnaryOperatorColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN, oldUnaryOperatorColumn, newUnaryOperatorColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperatorColumn(DataItem newUnaryOperatorColumn) {
		if (newUnaryOperatorColumn != unaryOperatorColumn) {
			NotificationChain msgs = null;
			if (unaryOperatorColumn != null)
				msgs = ((InternalEObject)unaryOperatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN, null, msgs);
			if (newUnaryOperatorColumn != null)
				msgs = ((InternalEObject)newUnaryOperatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN, null, msgs);
			msgs = basicSetUnaryOperatorColumn(newUnaryOperatorColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN, newUnaryOperatorColumn, newUnaryOperatorColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeHierarchyOrdered() {
		return attributeHierarchyOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyOrdered(boolean newAttributeHierarchyOrdered) {
		boolean oldAttributeHierarchyOrdered = attributeHierarchyOrdered;
		attributeHierarchyOrdered = newAttributeHierarchyOrdered;
		boolean oldAttributeHierarchyOrderedESet = attributeHierarchyOrderedESet;
		attributeHierarchyOrderedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ORDERED, oldAttributeHierarchyOrdered, attributeHierarchyOrdered, !oldAttributeHierarchyOrderedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyOrdered() {
		boolean oldAttributeHierarchyOrdered = attributeHierarchyOrdered;
		boolean oldAttributeHierarchyOrderedESet = attributeHierarchyOrderedESet;
		attributeHierarchyOrdered = ATTRIBUTE_HIERARCHY_ORDERED_EDEFAULT;
		attributeHierarchyOrderedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ORDERED, oldAttributeHierarchyOrdered, ATTRIBUTE_HIERARCHY_ORDERED_EDEFAULT, oldAttributeHierarchyOrderedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyOrdered() {
		return attributeHierarchyOrderedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemberNamesUnique() {
		return memberNamesUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberNamesUnique(boolean newMemberNamesUnique) {
		boolean oldMemberNamesUnique = memberNamesUnique;
		memberNamesUnique = newMemberNamesUnique;
		boolean oldMemberNamesUniqueESet = memberNamesUniqueESet;
		memberNamesUniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__MEMBER_NAMES_UNIQUE, oldMemberNamesUnique, memberNamesUnique, !oldMemberNamesUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberNamesUnique() {
		boolean oldMemberNamesUnique = memberNamesUnique;
		boolean oldMemberNamesUniqueESet = memberNamesUniqueESet;
		memberNamesUnique = MEMBER_NAMES_UNIQUE_EDEFAULT;
		memberNamesUniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__MEMBER_NAMES_UNIQUE, oldMemberNamesUnique, MEMBER_NAMES_UNIQUE_EDEFAULT, oldMemberNamesUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberNamesUnique() {
		return memberNamesUniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAggregatable() {
		return isAggregatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAggregatable(boolean newIsAggregatable) {
		boolean oldIsAggregatable = isAggregatable;
		isAggregatable = newIsAggregatable;
		boolean oldIsAggregatableESet = isAggregatableESet;
		isAggregatableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__IS_AGGREGATABLE, oldIsAggregatable, isAggregatable, !oldIsAggregatableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAggregatable() {
		boolean oldIsAggregatable = isAggregatable;
		boolean oldIsAggregatableESet = isAggregatableESet;
		isAggregatable = IS_AGGREGATABLE_EDEFAULT;
		isAggregatableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__IS_AGGREGATABLE, oldIsAggregatable, IS_AGGREGATABLE_EDEFAULT, oldIsAggregatableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAggregatable() {
		return isAggregatableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeHierarchyEnabled() {
		return attributeHierarchyEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyEnabled(boolean newAttributeHierarchyEnabled) {
		boolean oldAttributeHierarchyEnabled = attributeHierarchyEnabled;
		attributeHierarchyEnabled = newAttributeHierarchyEnabled;
		boolean oldAttributeHierarchyEnabledESet = attributeHierarchyEnabledESet;
		attributeHierarchyEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED, oldAttributeHierarchyEnabled, attributeHierarchyEnabled, !oldAttributeHierarchyEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyEnabled() {
		boolean oldAttributeHierarchyEnabled = attributeHierarchyEnabled;
		boolean oldAttributeHierarchyEnabledESet = attributeHierarchyEnabledESet;
		attributeHierarchyEnabled = ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT;
		attributeHierarchyEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED, oldAttributeHierarchyEnabled, ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT, oldAttributeHierarchyEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyEnabled() {
		return attributeHierarchyEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyOptimizedStateType getAttributeHierarchyOptimizedState() {
		return attributeHierarchyOptimizedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType newAttributeHierarchyOptimizedState) {
		AttributeHierarchyOptimizedStateType oldAttributeHierarchyOptimizedState = attributeHierarchyOptimizedState;
		attributeHierarchyOptimizedState = newAttributeHierarchyOptimizedState == null ? ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT : newAttributeHierarchyOptimizedState;
		boolean oldAttributeHierarchyOptimizedStateESet = attributeHierarchyOptimizedStateESet;
		attributeHierarchyOptimizedStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE, oldAttributeHierarchyOptimizedState, attributeHierarchyOptimizedState, !oldAttributeHierarchyOptimizedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyOptimizedState() {
		AttributeHierarchyOptimizedStateType oldAttributeHierarchyOptimizedState = attributeHierarchyOptimizedState;
		boolean oldAttributeHierarchyOptimizedStateESet = attributeHierarchyOptimizedStateESet;
		attributeHierarchyOptimizedState = ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT;
		attributeHierarchyOptimizedStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE, oldAttributeHierarchyOptimizedState, ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT, oldAttributeHierarchyOptimizedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyOptimizedState() {
		return attributeHierarchyOptimizedStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeHierarchyVisible() {
		return attributeHierarchyVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyVisible(boolean newAttributeHierarchyVisible) {
		boolean oldAttributeHierarchyVisible = attributeHierarchyVisible;
		attributeHierarchyVisible = newAttributeHierarchyVisible;
		boolean oldAttributeHierarchyVisibleESet = attributeHierarchyVisibleESet;
		attributeHierarchyVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE, oldAttributeHierarchyVisible, attributeHierarchyVisible, !oldAttributeHierarchyVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyVisible() {
		boolean oldAttributeHierarchyVisible = attributeHierarchyVisible;
		boolean oldAttributeHierarchyVisibleESet = attributeHierarchyVisibleESet;
		attributeHierarchyVisible = ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT;
		attributeHierarchyVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE, oldAttributeHierarchyVisible, ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT, oldAttributeHierarchyVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyVisible() {
		return attributeHierarchyVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeHierarchyDisplayFolder() {
		return attributeHierarchyDisplayFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyDisplayFolder(String newAttributeHierarchyDisplayFolder) {
		String oldAttributeHierarchyDisplayFolder = attributeHierarchyDisplayFolder;
		attributeHierarchyDisplayFolder = newAttributeHierarchyDisplayFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER, oldAttributeHierarchyDisplayFolder, attributeHierarchyDisplayFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeyUniquenessGuarantee() {
		return keyUniquenessGuarantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyUniquenessGuarantee(boolean newKeyUniquenessGuarantee) {
		boolean oldKeyUniquenessGuarantee = keyUniquenessGuarantee;
		keyUniquenessGuarantee = newKeyUniquenessGuarantee;
		boolean oldKeyUniquenessGuaranteeESet = keyUniquenessGuaranteeESet;
		keyUniquenessGuaranteeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__KEY_UNIQUENESS_GUARANTEE, oldKeyUniquenessGuarantee, keyUniquenessGuarantee, !oldKeyUniquenessGuaranteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyUniquenessGuarantee() {
		boolean oldKeyUniquenessGuarantee = keyUniquenessGuarantee;
		boolean oldKeyUniquenessGuaranteeESet = keyUniquenessGuaranteeESet;
		keyUniquenessGuarantee = KEY_UNIQUENESS_GUARANTEE_EDEFAULT;
		keyUniquenessGuaranteeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__KEY_UNIQUENESS_GUARANTEE, oldKeyUniquenessGuarantee, KEY_UNIQUENESS_GUARANTEE_EDEFAULT, oldKeyUniquenessGuaranteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyUniquenessGuarantee() {
		return keyUniquenessGuaranteeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingBehaviorType getGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(GroupingBehaviorType newGroupingBehavior) {
		GroupingBehaviorType oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior == null ? GROUPING_BEHAVIOR_EDEFAULT : newGroupingBehavior;
		boolean oldGroupingBehaviorESet = groupingBehaviorESet;
		groupingBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior, !oldGroupingBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupingBehavior() {
		GroupingBehaviorType oldGroupingBehavior = groupingBehavior;
		boolean oldGroupingBehaviorESet = groupingBehaviorESet;
		groupingBehavior = GROUPING_BEHAVIOR_EDEFAULT;
		groupingBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__GROUPING_BEHAVIOR, oldGroupingBehavior, GROUPING_BEHAVIOR_EDEFAULT, oldGroupingBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupingBehavior() {
		return groupingBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSelectionType getInstanceSelection() {
		return instanceSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSelection(InstanceSelectionType newInstanceSelection) {
		InstanceSelectionType oldInstanceSelection = instanceSelection;
		instanceSelection = newInstanceSelection == null ? INSTANCE_SELECTION_EDEFAULT : newInstanceSelection;
		boolean oldInstanceSelectionESet = instanceSelectionESet;
		instanceSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__INSTANCE_SELECTION, oldInstanceSelection, instanceSelection, !oldInstanceSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceSelection() {
		InstanceSelectionType oldInstanceSelection = instanceSelection;
		boolean oldInstanceSelectionESet = instanceSelectionESet;
		instanceSelection = INSTANCE_SELECTION_EDEFAULT;
		instanceSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__INSTANCE_SELECTION, oldInstanceSelection, INSTANCE_SELECTION_EDEFAULT, oldInstanceSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceSelection() {
		return instanceSelectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType17 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType17 newAnnotations, NotificationChain msgs) {
		AnnotationsType17 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType17 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType getProcessingState() {
		return processingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingState(ProcessingStateType newProcessingState) {
		ProcessingStateType oldProcessingState = processingState;
		processingState = newProcessingState == null ? PROCESSING_STATE_EDEFAULT : newProcessingState;
		boolean oldProcessingStateESet = processingStateESet;
		processingStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__PROCESSING_STATE, oldProcessingState, processingState, !oldProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingState() {
		ProcessingStateType oldProcessingState = processingState;
		boolean oldProcessingStateESet = processingStateESet;
		processingState = PROCESSING_STATE_EDEFAULT;
		processingStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__PROCESSING_STATE, oldProcessingState, PROCESSING_STATE_EDEFAULT, oldProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingState() {
		return processingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyProcessingState getAttributeHierarchyProcessingState() {
		return attributeHierarchyProcessingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyProcessingState(AttributeHierarchyProcessingState newAttributeHierarchyProcessingState) {
		AttributeHierarchyProcessingState oldAttributeHierarchyProcessingState = attributeHierarchyProcessingState;
		attributeHierarchyProcessingState = newAttributeHierarchyProcessingState == null ? ATTRIBUTE_HIERARCHY_PROCESSING_STATE_EDEFAULT : newAttributeHierarchyProcessingState;
		boolean oldAttributeHierarchyProcessingStateESet = attributeHierarchyProcessingStateESet;
		attributeHierarchyProcessingStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_PROCESSING_STATE, oldAttributeHierarchyProcessingState, attributeHierarchyProcessingState, !oldAttributeHierarchyProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyProcessingState() {
		AttributeHierarchyProcessingState oldAttributeHierarchyProcessingState = attributeHierarchyProcessingState;
		boolean oldAttributeHierarchyProcessingStateESet = attributeHierarchyProcessingStateESet;
		attributeHierarchyProcessingState = ATTRIBUTE_HIERARCHY_PROCESSING_STATE_EDEFAULT;
		attributeHierarchyProcessingStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_PROCESSING_STATE, oldAttributeHierarchyProcessingState, ATTRIBUTE_HIERARCHY_PROCESSING_STATE_EDEFAULT, oldAttributeHierarchyProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyProcessingState() {
		return attributeHierarchyProcessingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionAttributeVisualizationProperties getVisualizationProperties() {
		return visualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualizationProperties(DimensionAttributeVisualizationProperties newVisualizationProperties, NotificationChain msgs) {
		DimensionAttributeVisualizationProperties oldVisualizationProperties = visualizationProperties;
		visualizationProperties = newVisualizationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES, oldVisualizationProperties, newVisualizationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizationProperties(DimensionAttributeVisualizationProperties newVisualizationProperties) {
		if (newVisualizationProperties != visualizationProperties) {
			NotificationChain msgs = null;
			if (visualizationProperties != null)
				msgs = ((InternalEObject)visualizationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES, null, msgs);
			if (newVisualizationProperties != null)
				msgs = ((InternalEObject)newVisualizationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES, null, msgs);
			msgs = basicSetVisualizationProperties(newVisualizationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES, newVisualizationProperties, newVisualizationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedType() {
		return extendedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedType(String newExtendedType) {
		String oldExtendedType = extendedType;
		extendedType = newExtendedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_ATTRIBUTE__EXTENDED_TYPE, oldExtendedType, extendedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_ATTRIBUTE__TYPE:
				return basicSetType(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS:
				return basicSetKeyColumns(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN:
				return basicSetNameColumn(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN:
				return basicSetValueColumn(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS:
				return basicSetAttributeRelationships(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN:
				return basicSetSkippedLevelsColumn(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS:
				return basicSetNamingTemplateTranslations(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN:
				return basicSetCustomRollupColumn(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				return basicSetCustomRollupPropertiesColumn(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN:
				return basicSetUnaryOperatorColumn(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES:
				return basicSetVisualizationProperties(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME:
				return getName();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ID:
				return getID();
			case XmlaPackage.DIMENSION_ATTRIBUTE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.DIMENSION_ATTRIBUTE__TYPE:
				return getType();
			case XmlaPackage.DIMENSION_ATTRIBUTE__USAGE:
				return getUsage();
			case XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE:
				return getSource();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ESTIMATED_COUNT:
				return getEstimatedCount();
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS:
				return getKeyColumns();
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN:
				return getNameColumn();
			case XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN:
				return getValueColumn();
			case XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS:
				return getAttributeRelationships();
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_METHOD:
				return getDiscretizationMethod();
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_BUCKET_COUNT:
				return getDiscretizationBucketCount();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ROOT_MEMBER_IF:
				return getRootMemberIf();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY:
				return getOrderBy();
			case XmlaPackage.DIMENSION_ATTRIBUTE__DEFAULT_MEMBER:
				return getDefaultMember();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY_ATTRIBUTE_ID:
				return getOrderByAttributeID();
			case XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN:
				return getSkippedLevelsColumn();
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE:
				return getNamingTemplate();
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA:
				return getMembersWithData();
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA_CAPTION:
				return getMembersWithDataCaption();
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS:
				return getNamingTemplateTranslations();
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN:
				return getCustomRollupColumn();
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				return getCustomRollupPropertiesColumn();
			case XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN:
				return getUnaryOperatorColumn();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ORDERED:
				return isAttributeHierarchyOrdered();
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBER_NAMES_UNIQUE:
				return isMemberNamesUnique();
			case XmlaPackage.DIMENSION_ATTRIBUTE__IS_AGGREGATABLE:
				return isIsAggregatable();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				return isAttributeHierarchyEnabled();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				return getAttributeHierarchyOptimizedState();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				return isAttributeHierarchyVisible();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER:
				return getAttributeHierarchyDisplayFolder();
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_UNIQUENESS_GUARANTEE:
				return isKeyUniquenessGuarantee();
			case XmlaPackage.DIMENSION_ATTRIBUTE__GROUPING_BEHAVIOR:
				return getGroupingBehavior();
			case XmlaPackage.DIMENSION_ATTRIBUTE__INSTANCE_SELECTION:
				return getInstanceSelection();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.DIMENSION_ATTRIBUTE__PROCESSING_STATE:
				return getProcessingState();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_PROCESSING_STATE:
				return getAttributeHierarchyProcessingState();
			case XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES:
				return getVisualizationProperties();
			case XmlaPackage.DIMENSION_ATTRIBUTE__EXTENDED_TYPE:
				return getExtendedType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__TYPE:
				setType((TypeType6)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__USAGE:
				setUsage((UsageType1)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE:
				setSource((Binding)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ESTIMATED_COUNT:
				setEstimatedCount((Long)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN:
				setNameColumn((DataItem)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN:
				setValueColumn((DataItem)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS:
				setTranslations((TranslationsType18)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS:
				setAttributeRelationships((AttributeRelationshipsType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_METHOD:
				setDiscretizationMethod((DiscretizationMethodType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_BUCKET_COUNT:
				setDiscretizationBucketCount((BigInteger)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ROOT_MEMBER_IF:
				setRootMemberIf((RootMemberIfType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY:
				setOrderBy((OrderByType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DEFAULT_MEMBER:
				setDefaultMember((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY_ATTRIBUTE_ID:
				setOrderByAttributeID((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN:
				setSkippedLevelsColumn((DataItem)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE:
				setNamingTemplate((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA:
				setMembersWithData((MembersWithDataType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA_CAPTION:
				setMembersWithDataCaption((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS:
				setNamingTemplateTranslations((NamingTemplateTranslationsType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN:
				setCustomRollupColumn((DataItem)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				setCustomRollupPropertiesColumn((DataItem)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN:
				setUnaryOperatorColumn((DataItem)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ORDERED:
				setAttributeHierarchyOrdered((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBER_NAMES_UNIQUE:
				setMemberNamesUnique((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__IS_AGGREGATABLE:
				setIsAggregatable((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				setAttributeHierarchyEnabled((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				setAttributeHierarchyOptimizedState((AttributeHierarchyOptimizedStateType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				setAttributeHierarchyVisible((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER:
				setAttributeHierarchyDisplayFolder((String)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_UNIQUENESS_GUARANTEE:
				setKeyUniquenessGuarantee((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__GROUPING_BEHAVIOR:
				setGroupingBehavior((GroupingBehaviorType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__INSTANCE_SELECTION:
				setInstanceSelection((InstanceSelectionType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS:
				setAnnotations((AnnotationsType17)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__PROCESSING_STATE:
				setProcessingState((ProcessingStateType)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_PROCESSING_STATE:
				setAttributeHierarchyProcessingState((AttributeHierarchyProcessingState)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((DimensionAttributeVisualizationProperties)newValue);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__EXTENDED_TYPE:
				setExtendedType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__TYPE:
				setType((TypeType6)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__USAGE:
				unsetUsage();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE:
				setSource((Binding)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ESTIMATED_COUNT:
				unsetEstimatedCount();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN:
				setNameColumn((DataItem)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN:
				setValueColumn((DataItem)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS:
				setTranslations((TranslationsType18)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS:
				setAttributeRelationships((AttributeRelationshipsType)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_METHOD:
				unsetDiscretizationMethod();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_BUCKET_COUNT:
				setDiscretizationBucketCount(DISCRETIZATION_BUCKET_COUNT_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ROOT_MEMBER_IF:
				unsetRootMemberIf();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY:
				unsetOrderBy();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DEFAULT_MEMBER:
				setDefaultMember(DEFAULT_MEMBER_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY_ATTRIBUTE_ID:
				setOrderByAttributeID(ORDER_BY_ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN:
				setSkippedLevelsColumn((DataItem)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE:
				setNamingTemplate(NAMING_TEMPLATE_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA:
				unsetMembersWithData();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA_CAPTION:
				setMembersWithDataCaption(MEMBERS_WITH_DATA_CAPTION_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS:
				setNamingTemplateTranslations((NamingTemplateTranslationsType)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN:
				setCustomRollupColumn((DataItem)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				setCustomRollupPropertiesColumn((DataItem)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN:
				setUnaryOperatorColumn((DataItem)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ORDERED:
				unsetAttributeHierarchyOrdered();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBER_NAMES_UNIQUE:
				unsetMemberNamesUnique();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__IS_AGGREGATABLE:
				unsetIsAggregatable();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				unsetAttributeHierarchyEnabled();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				unsetAttributeHierarchyOptimizedState();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				unsetAttributeHierarchyVisible();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER:
				setAttributeHierarchyDisplayFolder(ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_UNIQUENESS_GUARANTEE:
				unsetKeyUniquenessGuarantee();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__GROUPING_BEHAVIOR:
				unsetGroupingBehavior();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__INSTANCE_SELECTION:
				unsetInstanceSelection();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS:
				setAnnotations((AnnotationsType17)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__PROCESSING_STATE:
				unsetProcessingState();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_PROCESSING_STATE:
				unsetAttributeHierarchyProcessingState();
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((DimensionAttributeVisualizationProperties)null);
				return;
			case XmlaPackage.DIMENSION_ATTRIBUTE__EXTENDED_TYPE:
				setExtendedType(EXTENDED_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.DIMENSION_ATTRIBUTE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.DIMENSION_ATTRIBUTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.DIMENSION_ATTRIBUTE__TYPE:
				return type != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__USAGE:
				return isSetUsage();
			case XmlaPackage.DIMENSION_ATTRIBUTE__SOURCE:
				return source != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ESTIMATED_COUNT:
				return isSetEstimatedCount();
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_COLUMNS:
				return keyColumns != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAME_COLUMN:
				return nameColumn != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__VALUE_COLUMN:
				return valueColumn != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_RELATIONSHIPS:
				return attributeRelationships != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_METHOD:
				return isSetDiscretizationMethod();
			case XmlaPackage.DIMENSION_ATTRIBUTE__DISCRETIZATION_BUCKET_COUNT:
				return DISCRETIZATION_BUCKET_COUNT_EDEFAULT == null ? discretizationBucketCount != null : !DISCRETIZATION_BUCKET_COUNT_EDEFAULT.equals(discretizationBucketCount);
			case XmlaPackage.DIMENSION_ATTRIBUTE__ROOT_MEMBER_IF:
				return isSetRootMemberIf();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY:
				return isSetOrderBy();
			case XmlaPackage.DIMENSION_ATTRIBUTE__DEFAULT_MEMBER:
				return DEFAULT_MEMBER_EDEFAULT == null ? defaultMember != null : !DEFAULT_MEMBER_EDEFAULT.equals(defaultMember);
			case XmlaPackage.DIMENSION_ATTRIBUTE__ORDER_BY_ATTRIBUTE_ID:
				return ORDER_BY_ATTRIBUTE_ID_EDEFAULT == null ? orderByAttributeID != null : !ORDER_BY_ATTRIBUTE_ID_EDEFAULT.equals(orderByAttributeID);
			case XmlaPackage.DIMENSION_ATTRIBUTE__SKIPPED_LEVELS_COLUMN:
				return skippedLevelsColumn != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE:
				return NAMING_TEMPLATE_EDEFAULT == null ? namingTemplate != null : !NAMING_TEMPLATE_EDEFAULT.equals(namingTemplate);
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA:
				return isSetMembersWithData();
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBERS_WITH_DATA_CAPTION:
				return MEMBERS_WITH_DATA_CAPTION_EDEFAULT == null ? membersWithDataCaption != null : !MEMBERS_WITH_DATA_CAPTION_EDEFAULT.equals(membersWithDataCaption);
			case XmlaPackage.DIMENSION_ATTRIBUTE__NAMING_TEMPLATE_TRANSLATIONS:
				return namingTemplateTranslations != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_COLUMN:
				return customRollupColumn != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				return customRollupPropertiesColumn != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__UNARY_OPERATOR_COLUMN:
				return unaryOperatorColumn != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ORDERED:
				return isSetAttributeHierarchyOrdered();
			case XmlaPackage.DIMENSION_ATTRIBUTE__MEMBER_NAMES_UNIQUE:
				return isSetMemberNamesUnique();
			case XmlaPackage.DIMENSION_ATTRIBUTE__IS_AGGREGATABLE:
				return isSetIsAggregatable();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				return isSetAttributeHierarchyEnabled();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				return isSetAttributeHierarchyOptimizedState();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				return isSetAttributeHierarchyVisible();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER:
				return ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER_EDEFAULT == null ? attributeHierarchyDisplayFolder != null : !ATTRIBUTE_HIERARCHY_DISPLAY_FOLDER_EDEFAULT.equals(attributeHierarchyDisplayFolder);
			case XmlaPackage.DIMENSION_ATTRIBUTE__KEY_UNIQUENESS_GUARANTEE:
				return isSetKeyUniquenessGuarantee();
			case XmlaPackage.DIMENSION_ATTRIBUTE__GROUPING_BEHAVIOR:
				return isSetGroupingBehavior();
			case XmlaPackage.DIMENSION_ATTRIBUTE__INSTANCE_SELECTION:
				return isSetInstanceSelection();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__PROCESSING_STATE:
				return isSetProcessingState();
			case XmlaPackage.DIMENSION_ATTRIBUTE__ATTRIBUTE_HIERARCHY_PROCESSING_STATE:
				return isSetAttributeHierarchyProcessingState();
			case XmlaPackage.DIMENSION_ATTRIBUTE__VISUALIZATION_PROPERTIES:
				return visualizationProperties != null;
			case XmlaPackage.DIMENSION_ATTRIBUTE__EXTENDED_TYPE:
				return EXTENDED_TYPE_EDEFAULT == null ? extendedType != null : !EXTENDED_TYPE_EDEFAULT.equals(extendedType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", iD: ");
		result.append(iD);
		result.append(", description: ");
		result.append(description);
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", estimatedCount: ");
		if (estimatedCountESet) result.append(estimatedCount); else result.append("<unset>");
		result.append(", discretizationMethod: ");
		if (discretizationMethodESet) result.append(discretizationMethod); else result.append("<unset>");
		result.append(", discretizationBucketCount: ");
		result.append(discretizationBucketCount);
		result.append(", rootMemberIf: ");
		if (rootMemberIfESet) result.append(rootMemberIf); else result.append("<unset>");
		result.append(", orderBy: ");
		if (orderByESet) result.append(orderBy); else result.append("<unset>");
		result.append(", defaultMember: ");
		result.append(defaultMember);
		result.append(", orderByAttributeID: ");
		result.append(orderByAttributeID);
		result.append(", namingTemplate: ");
		result.append(namingTemplate);
		result.append(", membersWithData: ");
		if (membersWithDataESet) result.append(membersWithData); else result.append("<unset>");
		result.append(", membersWithDataCaption: ");
		result.append(membersWithDataCaption);
		result.append(", attributeHierarchyOrdered: ");
		if (attributeHierarchyOrderedESet) result.append(attributeHierarchyOrdered); else result.append("<unset>");
		result.append(", memberNamesUnique: ");
		if (memberNamesUniqueESet) result.append(memberNamesUnique); else result.append("<unset>");
		result.append(", isAggregatable: ");
		if (isAggregatableESet) result.append(isAggregatable); else result.append("<unset>");
		result.append(", attributeHierarchyEnabled: ");
		if (attributeHierarchyEnabledESet) result.append(attributeHierarchyEnabled); else result.append("<unset>");
		result.append(", attributeHierarchyOptimizedState: ");
		if (attributeHierarchyOptimizedStateESet) result.append(attributeHierarchyOptimizedState); else result.append("<unset>");
		result.append(", attributeHierarchyVisible: ");
		if (attributeHierarchyVisibleESet) result.append(attributeHierarchyVisible); else result.append("<unset>");
		result.append(", attributeHierarchyDisplayFolder: ");
		result.append(attributeHierarchyDisplayFolder);
		result.append(", keyUniquenessGuarantee: ");
		if (keyUniquenessGuaranteeESet) result.append(keyUniquenessGuarantee); else result.append("<unset>");
		result.append(", groupingBehavior: ");
		if (groupingBehaviorESet) result.append(groupingBehavior); else result.append("<unset>");
		result.append(", instanceSelection: ");
		if (instanceSelectionESet) result.append(instanceSelection); else result.append("<unset>");
		result.append(", processingState: ");
		if (processingStateESet) result.append(processingState); else result.append("<unset>");
		result.append(", attributeHierarchyProcessingState: ");
		if (attributeHierarchyProcessingStateESet) result.append(attributeHierarchyProcessingState); else result.append("<unset>");
		result.append(", extendedType: ");
		result.append(extendedType);
		result.append(')');
		return result.toString();
	}

} //DimensionAttributeImpl
