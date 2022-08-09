/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType;

import org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeAllMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Dimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingGroupType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getMiningModelID <em>Mining Model ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getUnknownMember <em>Unknown Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#isWriteEnabled <em>Write Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getDimensionPermissions <em>Dimension Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getDependsOnDimensionID <em>Depends On Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getUnknownMemberName <em>Unknown Member Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getUnknownMemberTranslations <em>Unknown Member Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getProcessingGroup <em>Processing Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getCurrentStorageMode <em>Current Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getAttributeAllMemberName <em>Attribute All Member Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getAttributeAllMemberTranslations <em>Attribute All Member Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getProcessingRecommendation <em>Processing Recommendation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionImpl#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
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
	 * The default value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createdTimestamp = CREATED_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_SCHEMA_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastSchemaUpdate = LAST_SCHEMA_UPDATE_EDEFAULT;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType annotations;

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
	 * The default value of the '{@link #getMiningModelID() <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelID()
	 * @generated
	 * @ordered
	 */
	protected static final String MINING_MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiningModelID() <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelID()
	 * @generated
	 * @ordered
	 */
	protected String miningModelID = MINING_MODEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType3 TYPE_EDEFAULT = TypeType3.REGULAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType3 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getUnknownMember() <em>Unknown Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownMember()
	 * @generated
	 * @ordered
	 */
	protected UnknownMemberType unknownMember;

	/**
	 * The default value of the '{@link #getMdxMissingMemberMode() <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxMissingMemberMode()
	 * @generated
	 * @ordered
	 */
	protected static final MdxMissingMemberModeType MDX_MISSING_MEMBER_MODE_EDEFAULT = MdxMissingMemberModeType.DEFAULT;

	/**
	 * The cached value of the '{@link #getMdxMissingMemberMode() <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxMissingMemberMode()
	 * @generated
	 * @ordered
	 */
	protected MdxMissingMemberModeType mdxMissingMemberMode = MDX_MISSING_MEMBER_MODE_EDEFAULT;

	/**
	 * This is true if the Mdx Missing Member Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdxMissingMemberModeESet;

	/**
	 * The cached value of the '{@link #getErrorConfiguration() <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ErrorConfiguration errorConfiguration;

	/**
	 * The default value of the '{@link #getStorageMode() <em>Storage Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageMode()
	 * @generated
	 * @ordered
	 */
	protected static final StorageModeType1 STORAGE_MODE_EDEFAULT = StorageModeType1.MOLAP;

	/**
	 * The cached value of the '{@link #getStorageMode() <em>Storage Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageMode()
	 * @generated
	 * @ordered
	 */
	protected StorageModeType1 storageMode = STORAGE_MODE_EDEFAULT;

	/**
	 * This is true if the Storage Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storageModeESet;

	/**
	 * The default value of the '{@link #isWriteEnabled() <em>Write Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteEnabled() <em>Write Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean writeEnabled = WRITE_ENABLED_EDEFAULT;

	/**
	 * This is true if the Write Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeEnabledESet;

	/**
	 * The default value of the '{@link #getProcessingPriority() <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PROCESSING_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessingPriority() <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger processingPriority = PROCESSING_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastProcessed() <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_PROCESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastProcessed() <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProcessed()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastProcessed = LAST_PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensionPermissions() <em>Dimension Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionPermissions()
	 * @generated
	 * @ordered
	 */
	protected DimensionPermissionsType dimensionPermissions;

	/**
	 * The default value of the '{@link #getDependsOnDimensionID() <em>Depends On Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_ON_DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependsOnDimensionID() <em>Depends On Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String dependsOnDimensionID = DEPENDS_ON_DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected String collation = COLLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknownMemberName() <em>Unknown Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNKNOWN_MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnknownMemberName() <em>Unknown Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownMemberName()
	 * @generated
	 * @ordered
	 */
	protected String unknownMemberName = UNKNOWN_MEMBER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnknownMemberTranslations() <em>Unknown Member Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownMemberTranslations()
	 * @generated
	 * @ordered
	 */
	protected UnknownMemberTranslationsType unknownMemberTranslations;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType2 STATE_EDEFAULT = StateType2.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType2 state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The cached value of the '{@link #getProactiveCaching() <em>Proactive Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProactiveCaching()
	 * @generated
	 * @ordered
	 */
	protected ProactiveCaching proactiveCaching;

	/**
	 * The default value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingModeType PROCESSING_MODE_EDEFAULT = ProcessingModeType.REGULAR;

	/**
	 * The cached value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected ProcessingModeType processingMode = PROCESSING_MODE_EDEFAULT;

	/**
	 * This is true if the Processing Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingModeESet;

	/**
	 * The default value of the '{@link #getProcessingGroup() <em>Processing Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingGroup()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingGroupType PROCESSING_GROUP_EDEFAULT = ProcessingGroupType.BY_ATTRIBUTE;

	/**
	 * The cached value of the '{@link #getProcessingGroup() <em>Processing Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingGroup()
	 * @generated
	 * @ordered
	 */
	protected ProcessingGroupType processingGroup = PROCESSING_GROUP_EDEFAULT;

	/**
	 * This is true if the Processing Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingGroupESet;

	/**
	 * The cached value of the '{@link #getCurrentStorageMode() <em>Current Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStorageMode()
	 * @generated
	 * @ordered
	 */
	protected CurrentStorageModeType currentStorageMode;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType attributes;

	/**
	 * The default value of the '{@link #getAttributeAllMemberName() <em>Attribute All Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAllMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ALL_MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeAllMemberName() <em>Attribute All Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAllMemberName()
	 * @generated
	 * @ordered
	 */
	protected String attributeAllMemberName = ATTRIBUTE_ALL_MEMBER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeAllMemberTranslations() <em>Attribute All Member Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAllMemberTranslations()
	 * @generated
	 * @ordered
	 */
	protected AttributeAllMemberTranslationsType attributeAllMemberTranslations;

	/**
	 * The cached value of the '{@link #getHierarchies() <em>Hierarchies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchies()
	 * @generated
	 * @ordered
	 */
	protected HierarchiesType hierarchies;

	/**
	 * The default value of the '{@link #getProcessingRecommendation() <em>Processing Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingRecommendationType PROCESSING_RECOMMENDATION_EDEFAULT = ProcessingRecommendationType.NONE;

	/**
	 * The cached value of the '{@link #getProcessingRecommendation() <em>Processing Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRecommendation()
	 * @generated
	 * @ordered
	 */
	protected ProcessingRecommendationType processingRecommendation = PROCESSING_RECOMMENDATION_EDEFAULT;

	/**
	 * This is true if the Processing Recommendation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingRecommendationESet;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected Relationships relationships;

	/**
	 * The default value of the '{@link #getStringStoresCompatibilityLevel() <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringStoresCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final StringStoresCompatibilityLevelType STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT = StringStoresCompatibilityLevelType._1050;

	/**
	 * The cached value of the '{@link #getStringStoresCompatibilityLevel() <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringStoresCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected StringStoresCompatibilityLevelType stringStoresCompatibilityLevel = STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT;

	/**
	 * This is true if the String Stores Compatibility Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stringStoresCompatibilityLevelESet;

	/**
	 * The default value of the '{@link #getCurrentStringStoresCompatibilityLevel() <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CurrentStringStoresCompatibilityLevelType CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT = CurrentStringStoresCompatibilityLevelType._1050;

	/**
	 * The cached value of the '{@link #getCurrentStringStoresCompatibilityLevel() <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected CurrentStringStoresCompatibilityLevelType currentStringStoresCompatibilityLevel = CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Current String Stores Compatibility Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentStringStoresCompatibilityLevelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedTimestamp(XMLGregorianCalendar newCreatedTimestamp) {
		XMLGregorianCalendar oldCreatedTimestamp = createdTimestamp;
		createdTimestamp = newCreatedTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastSchemaUpdate() {
		return lastSchemaUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSchemaUpdate(XMLGregorianCalendar newLastSchemaUpdate) {
		XMLGregorianCalendar oldLastSchemaUpdate = lastSchemaUpdate;
		lastSchemaUpdate = newLastSchemaUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType newAnnotations, NotificationChain msgs) {
		AnnotationsType oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ANNOTATIONS, newAnnotations, newAnnotations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiningModelID() {
		return miningModelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModelID(String newMiningModelID) {
		String oldMiningModelID = miningModelID;
		miningModelID = newMiningModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__MINING_MODEL_ID, oldMiningModelID, miningModelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType3 newType) {
		TypeType3 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType3 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownMemberType getUnknownMember() {
		return unknownMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownMember(UnknownMemberType newUnknownMember, NotificationChain msgs) {
		UnknownMemberType oldUnknownMember = unknownMember;
		unknownMember = newUnknownMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__UNKNOWN_MEMBER, oldUnknownMember, newUnknownMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownMember(UnknownMemberType newUnknownMember) {
		if (newUnknownMember != unknownMember) {
			NotificationChain msgs = null;
			if (unknownMember != null)
				msgs = ((InternalEObject)unknownMember).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__UNKNOWN_MEMBER, null, msgs);
			if (newUnknownMember != null)
				msgs = ((InternalEObject)newUnknownMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__UNKNOWN_MEMBER, null, msgs);
			msgs = basicSetUnknownMember(newUnknownMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__UNKNOWN_MEMBER, newUnknownMember, newUnknownMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType getMdxMissingMemberMode() {
		return mdxMissingMemberMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdxMissingMemberMode(MdxMissingMemberModeType newMdxMissingMemberMode) {
		MdxMissingMemberModeType oldMdxMissingMemberMode = mdxMissingMemberMode;
		mdxMissingMemberMode = newMdxMissingMemberMode == null ? MDX_MISSING_MEMBER_MODE_EDEFAULT : newMdxMissingMemberMode;
		boolean oldMdxMissingMemberModeESet = mdxMissingMemberModeESet;
		mdxMissingMemberModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__MDX_MISSING_MEMBER_MODE, oldMdxMissingMemberMode, mdxMissingMemberMode, !oldMdxMissingMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdxMissingMemberMode() {
		MdxMissingMemberModeType oldMdxMissingMemberMode = mdxMissingMemberMode;
		boolean oldMdxMissingMemberModeESet = mdxMissingMemberModeESet;
		mdxMissingMemberMode = MDX_MISSING_MEMBER_MODE_EDEFAULT;
		mdxMissingMemberModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__MDX_MISSING_MEMBER_MODE, oldMdxMissingMemberMode, MDX_MISSING_MEMBER_MODE_EDEFAULT, oldMdxMissingMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdxMissingMemberMode() {
		return mdxMissingMemberModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorConfiguration getErrorConfiguration() {
		return errorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorConfiguration(ErrorConfiguration newErrorConfiguration, NotificationChain msgs) {
		ErrorConfiguration oldErrorConfiguration = errorConfiguration;
		errorConfiguration = newErrorConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorConfiguration(ErrorConfiguration newErrorConfiguration) {
		if (newErrorConfiguration != errorConfiguration) {
			NotificationChain msgs = null;
			if (errorConfiguration != null)
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType1 getStorageMode() {
		return storageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageMode(StorageModeType1 newStorageMode) {
		StorageModeType1 oldStorageMode = storageMode;
		storageMode = newStorageMode == null ? STORAGE_MODE_EDEFAULT : newStorageMode;
		boolean oldStorageModeESet = storageModeESet;
		storageModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__STORAGE_MODE, oldStorageMode, storageMode, !oldStorageModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStorageMode() {
		StorageModeType1 oldStorageMode = storageMode;
		boolean oldStorageModeESet = storageModeESet;
		storageMode = STORAGE_MODE_EDEFAULT;
		storageModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__STORAGE_MODE, oldStorageMode, STORAGE_MODE_EDEFAULT, oldStorageModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStorageMode() {
		return storageModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteEnabled() {
		return writeEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteEnabled(boolean newWriteEnabled) {
		boolean oldWriteEnabled = writeEnabled;
		writeEnabled = newWriteEnabled;
		boolean oldWriteEnabledESet = writeEnabledESet;
		writeEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__WRITE_ENABLED, oldWriteEnabled, writeEnabled, !oldWriteEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteEnabled() {
		boolean oldWriteEnabled = writeEnabled;
		boolean oldWriteEnabledESet = writeEnabledESet;
		writeEnabled = WRITE_ENABLED_EDEFAULT;
		writeEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__WRITE_ENABLED, oldWriteEnabled, WRITE_ENABLED_EDEFAULT, oldWriteEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteEnabled() {
		return writeEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getProcessingPriority() {
		return processingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingPriority(BigInteger newProcessingPriority) {
		BigInteger oldProcessingPriority = processingPriority;
		processingPriority = newProcessingPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__PROCESSING_PRIORITY, oldProcessingPriority, processingPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastProcessed() {
		return lastProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastProcessed(XMLGregorianCalendar newLastProcessed) {
		XMLGregorianCalendar oldLastProcessed = lastProcessed;
		lastProcessed = newLastProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__LAST_PROCESSED, oldLastProcessed, lastProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionPermissionsType getDimensionPermissions() {
		return dimensionPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionPermissions(DimensionPermissionsType newDimensionPermissions, NotificationChain msgs) {
		DimensionPermissionsType oldDimensionPermissions = dimensionPermissions;
		dimensionPermissions = newDimensionPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS, oldDimensionPermissions, newDimensionPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionPermissions(DimensionPermissionsType newDimensionPermissions) {
		if (newDimensionPermissions != dimensionPermissions) {
			NotificationChain msgs = null;
			if (dimensionPermissions != null)
				msgs = ((InternalEObject)dimensionPermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS, null, msgs);
			if (newDimensionPermissions != null)
				msgs = ((InternalEObject)newDimensionPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS, null, msgs);
			msgs = basicSetDimensionPermissions(newDimensionPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS, newDimensionPermissions, newDimensionPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependsOnDimensionID() {
		return dependsOnDimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOnDimensionID(String newDependsOnDimensionID) {
		String oldDependsOnDimensionID = dependsOnDimensionID;
		dependsOnDimensionID = newDependsOnDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__DEPENDS_ON_DIMENSION_ID, oldDependsOnDimensionID, dependsOnDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(BigInteger newLanguage) {
		BigInteger oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollation() {
		return collation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollation(String newCollation) {
		String oldCollation = collation;
		collation = newCollation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnknownMemberName() {
		return unknownMemberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownMemberName(String newUnknownMemberName) {
		String oldUnknownMemberName = unknownMemberName;
		unknownMemberName = newUnknownMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__UNKNOWN_MEMBER_NAME, oldUnknownMemberName, unknownMemberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownMemberTranslationsType getUnknownMemberTranslations() {
		return unknownMemberTranslations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownMemberTranslations(UnknownMemberTranslationsType newUnknownMemberTranslations, NotificationChain msgs) {
		UnknownMemberTranslationsType oldUnknownMemberTranslations = unknownMemberTranslations;
		unknownMemberTranslations = newUnknownMemberTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS, oldUnknownMemberTranslations, newUnknownMemberTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownMemberTranslations(UnknownMemberTranslationsType newUnknownMemberTranslations) {
		if (newUnknownMemberTranslations != unknownMemberTranslations) {
			NotificationChain msgs = null;
			if (unknownMemberTranslations != null)
				msgs = ((InternalEObject)unknownMemberTranslations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS, null, msgs);
			if (newUnknownMemberTranslations != null)
				msgs = ((InternalEObject)newUnknownMemberTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS, null, msgs);
			msgs = basicSetUnknownMemberTranslations(newUnknownMemberTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS, newUnknownMemberTranslations, newUnknownMemberTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType2 getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType2 newState) {
		StateType2 oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType2 oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCaching getProactiveCaching() {
		return proactiveCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProactiveCaching(ProactiveCaching newProactiveCaching, NotificationChain msgs) {
		ProactiveCaching oldProactiveCaching = proactiveCaching;
		proactiveCaching = newProactiveCaching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__PROACTIVE_CACHING, oldProactiveCaching, newProactiveCaching);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProactiveCaching(ProactiveCaching newProactiveCaching) {
		if (newProactiveCaching != proactiveCaching) {
			NotificationChain msgs = null;
			if (proactiveCaching != null)
				msgs = ((InternalEObject)proactiveCaching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__PROACTIVE_CACHING, null, msgs);
			if (newProactiveCaching != null)
				msgs = ((InternalEObject)newProactiveCaching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__PROACTIVE_CACHING, null, msgs);
			msgs = basicSetProactiveCaching(newProactiveCaching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__PROACTIVE_CACHING, newProactiveCaching, newProactiveCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType getProcessingMode() {
		return processingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingMode(ProcessingModeType newProcessingMode) {
		ProcessingModeType oldProcessingMode = processingMode;
		processingMode = newProcessingMode == null ? PROCESSING_MODE_EDEFAULT : newProcessingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__PROCESSING_MODE, oldProcessingMode, processingMode, !oldProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingMode() {
		ProcessingModeType oldProcessingMode = processingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingMode = PROCESSING_MODE_EDEFAULT;
		processingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__PROCESSING_MODE, oldProcessingMode, PROCESSING_MODE_EDEFAULT, oldProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingMode() {
		return processingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingGroupType getProcessingGroup() {
		return processingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingGroup(ProcessingGroupType newProcessingGroup) {
		ProcessingGroupType oldProcessingGroup = processingGroup;
		processingGroup = newProcessingGroup == null ? PROCESSING_GROUP_EDEFAULT : newProcessingGroup;
		boolean oldProcessingGroupESet = processingGroupESet;
		processingGroupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__PROCESSING_GROUP, oldProcessingGroup, processingGroup, !oldProcessingGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingGroup() {
		ProcessingGroupType oldProcessingGroup = processingGroup;
		boolean oldProcessingGroupESet = processingGroupESet;
		processingGroup = PROCESSING_GROUP_EDEFAULT;
		processingGroupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__PROCESSING_GROUP, oldProcessingGroup, PROCESSING_GROUP_EDEFAULT, oldProcessingGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingGroup() {
		return processingGroupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStorageModeType getCurrentStorageMode() {
		return currentStorageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStorageMode(CurrentStorageModeType newCurrentStorageMode, NotificationChain msgs) {
		CurrentStorageModeType oldCurrentStorageMode = currentStorageMode;
		currentStorageMode = newCurrentStorageMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE, oldCurrentStorageMode, newCurrentStorageMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStorageMode(CurrentStorageModeType newCurrentStorageMode) {
		if (newCurrentStorageMode != currentStorageMode) {
			NotificationChain msgs = null;
			if (currentStorageMode != null)
				msgs = ((InternalEObject)currentStorageMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE, null, msgs);
			if (newCurrentStorageMode != null)
				msgs = ((InternalEObject)newCurrentStorageMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE, null, msgs);
			msgs = basicSetCurrentStorageMode(newCurrentStorageMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE, newCurrentStorageMode, newCurrentStorageMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType newTranslations, NotificationChain msgs) {
		TranslationsType oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType newAttributes, NotificationChain msgs) {
		AttributesType oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeAllMemberName() {
		return attributeAllMemberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeAllMemberName(String newAttributeAllMemberName) {
		String oldAttributeAllMemberName = attributeAllMemberName;
		attributeAllMemberName = newAttributeAllMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_NAME, oldAttributeAllMemberName, attributeAllMemberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAllMemberTranslationsType getAttributeAllMemberTranslations() {
		return attributeAllMemberTranslations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeAllMemberTranslations(AttributeAllMemberTranslationsType newAttributeAllMemberTranslations, NotificationChain msgs) {
		AttributeAllMemberTranslationsType oldAttributeAllMemberTranslations = attributeAllMemberTranslations;
		attributeAllMemberTranslations = newAttributeAllMemberTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS, oldAttributeAllMemberTranslations, newAttributeAllMemberTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeAllMemberTranslations(AttributeAllMemberTranslationsType newAttributeAllMemberTranslations) {
		if (newAttributeAllMemberTranslations != attributeAllMemberTranslations) {
			NotificationChain msgs = null;
			if (attributeAllMemberTranslations != null)
				msgs = ((InternalEObject)attributeAllMemberTranslations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS, null, msgs);
			if (newAttributeAllMemberTranslations != null)
				msgs = ((InternalEObject)newAttributeAllMemberTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS, null, msgs);
			msgs = basicSetAttributeAllMemberTranslations(newAttributeAllMemberTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS, newAttributeAllMemberTranslations, newAttributeAllMemberTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchiesType getHierarchies() {
		return hierarchies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchies(HierarchiesType newHierarchies, NotificationChain msgs) {
		HierarchiesType oldHierarchies = hierarchies;
		hierarchies = newHierarchies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__HIERARCHIES, oldHierarchies, newHierarchies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchies(HierarchiesType newHierarchies) {
		if (newHierarchies != hierarchies) {
			NotificationChain msgs = null;
			if (hierarchies != null)
				msgs = ((InternalEObject)hierarchies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__HIERARCHIES, null, msgs);
			if (newHierarchies != null)
				msgs = ((InternalEObject)newHierarchies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__HIERARCHIES, null, msgs);
			msgs = basicSetHierarchies(newHierarchies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__HIERARCHIES, newHierarchies, newHierarchies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingRecommendationType getProcessingRecommendation() {
		return processingRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingRecommendation(ProcessingRecommendationType newProcessingRecommendation) {
		ProcessingRecommendationType oldProcessingRecommendation = processingRecommendation;
		processingRecommendation = newProcessingRecommendation == null ? PROCESSING_RECOMMENDATION_EDEFAULT : newProcessingRecommendation;
		boolean oldProcessingRecommendationESet = processingRecommendationESet;
		processingRecommendationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__PROCESSING_RECOMMENDATION, oldProcessingRecommendation, processingRecommendation, !oldProcessingRecommendationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingRecommendation() {
		ProcessingRecommendationType oldProcessingRecommendation = processingRecommendation;
		boolean oldProcessingRecommendationESet = processingRecommendationESet;
		processingRecommendation = PROCESSING_RECOMMENDATION_EDEFAULT;
		processingRecommendationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__PROCESSING_RECOMMENDATION, oldProcessingRecommendation, PROCESSING_RECOMMENDATION_EDEFAULT, oldProcessingRecommendationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingRecommendation() {
		return processingRecommendationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationships getRelationships() {
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationships(Relationships newRelationships, NotificationChain msgs) {
		Relationships oldRelationships = relationships;
		relationships = newRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__RELATIONSHIPS, oldRelationships, newRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationships(Relationships newRelationships) {
		if (newRelationships != relationships) {
			NotificationChain msgs = null;
			if (relationships != null)
				msgs = ((InternalEObject)relationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__RELATIONSHIPS, null, msgs);
			if (newRelationships != null)
				msgs = ((InternalEObject)newRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DIMENSION__RELATIONSHIPS, null, msgs);
			msgs = basicSetRelationships(newRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__RELATIONSHIPS, newRelationships, newRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringStoresCompatibilityLevelType getStringStoresCompatibilityLevel() {
		return stringStoresCompatibilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType newStringStoresCompatibilityLevel) {
		StringStoresCompatibilityLevelType oldStringStoresCompatibilityLevel = stringStoresCompatibilityLevel;
		stringStoresCompatibilityLevel = newStringStoresCompatibilityLevel == null ? STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT : newStringStoresCompatibilityLevel;
		boolean oldStringStoresCompatibilityLevelESet = stringStoresCompatibilityLevelESet;
		stringStoresCompatibilityLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__STRING_STORES_COMPATIBILITY_LEVEL, oldStringStoresCompatibilityLevel, stringStoresCompatibilityLevel, !oldStringStoresCompatibilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStringStoresCompatibilityLevel() {
		StringStoresCompatibilityLevelType oldStringStoresCompatibilityLevel = stringStoresCompatibilityLevel;
		boolean oldStringStoresCompatibilityLevelESet = stringStoresCompatibilityLevelESet;
		stringStoresCompatibilityLevel = STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT;
		stringStoresCompatibilityLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__STRING_STORES_COMPATIBILITY_LEVEL, oldStringStoresCompatibilityLevel, STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT, oldStringStoresCompatibilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStringStoresCompatibilityLevel() {
		return stringStoresCompatibilityLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStringStoresCompatibilityLevelType getCurrentStringStoresCompatibilityLevel() {
		return currentStringStoresCompatibilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType newCurrentStringStoresCompatibilityLevel) {
		CurrentStringStoresCompatibilityLevelType oldCurrentStringStoresCompatibilityLevel = currentStringStoresCompatibilityLevel;
		currentStringStoresCompatibilityLevel = newCurrentStringStoresCompatibilityLevel == null ? CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT : newCurrentStringStoresCompatibilityLevel;
		boolean oldCurrentStringStoresCompatibilityLevelESet = currentStringStoresCompatibilityLevelESet;
		currentStringStoresCompatibilityLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL, oldCurrentStringStoresCompatibilityLevel, currentStringStoresCompatibilityLevel, !oldCurrentStringStoresCompatibilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentStringStoresCompatibilityLevel() {
		CurrentStringStoresCompatibilityLevelType oldCurrentStringStoresCompatibilityLevel = currentStringStoresCompatibilityLevel;
		boolean oldCurrentStringStoresCompatibilityLevelESet = currentStringStoresCompatibilityLevelESet;
		currentStringStoresCompatibilityLevel = CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT;
		currentStringStoresCompatibilityLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL, oldCurrentStringStoresCompatibilityLevel, CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT, oldCurrentStringStoresCompatibilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentStringStoresCompatibilityLevel() {
		return currentStringStoresCompatibilityLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DIMENSION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.DIMENSION__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER:
				return basicSetUnknownMember(null, msgs);
			case XmlaPackage.DIMENSION__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
			case XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS:
				return basicSetDimensionPermissions(null, msgs);
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS:
				return basicSetUnknownMemberTranslations(null, msgs);
			case XmlaPackage.DIMENSION__PROACTIVE_CACHING:
				return basicSetProactiveCaching(null, msgs);
			case XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE:
				return basicSetCurrentStorageMode(null, msgs);
			case XmlaPackage.DIMENSION__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.DIMENSION__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS:
				return basicSetAttributeAllMemberTranslations(null, msgs);
			case XmlaPackage.DIMENSION__HIERARCHIES:
				return basicSetHierarchies(null, msgs);
			case XmlaPackage.DIMENSION__RELATIONSHIPS:
				return basicSetRelationships(null, msgs);
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
			case XmlaPackage.DIMENSION__NAME:
				return getName();
			case XmlaPackage.DIMENSION__ID:
				return getID();
			case XmlaPackage.DIMENSION__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.DIMENSION__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.DIMENSION__DESCRIPTION:
				return getDescription();
			case XmlaPackage.DIMENSION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.DIMENSION__SOURCE:
				return getSource();
			case XmlaPackage.DIMENSION__MINING_MODEL_ID:
				return getMiningModelID();
			case XmlaPackage.DIMENSION__TYPE:
				return getType();
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER:
				return getUnknownMember();
			case XmlaPackage.DIMENSION__MDX_MISSING_MEMBER_MODE:
				return getMdxMissingMemberMode();
			case XmlaPackage.DIMENSION__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.DIMENSION__STORAGE_MODE:
				return getStorageMode();
			case XmlaPackage.DIMENSION__WRITE_ENABLED:
				return isWriteEnabled();
			case XmlaPackage.DIMENSION__PROCESSING_PRIORITY:
				return getProcessingPriority();
			case XmlaPackage.DIMENSION__LAST_PROCESSED:
				return getLastProcessed();
			case XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS:
				return getDimensionPermissions();
			case XmlaPackage.DIMENSION__DEPENDS_ON_DIMENSION_ID:
				return getDependsOnDimensionID();
			case XmlaPackage.DIMENSION__LANGUAGE:
				return getLanguage();
			case XmlaPackage.DIMENSION__COLLATION:
				return getCollation();
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_NAME:
				return getUnknownMemberName();
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS:
				return getUnknownMemberTranslations();
			case XmlaPackage.DIMENSION__STATE:
				return getState();
			case XmlaPackage.DIMENSION__PROACTIVE_CACHING:
				return getProactiveCaching();
			case XmlaPackage.DIMENSION__PROCESSING_MODE:
				return getProcessingMode();
			case XmlaPackage.DIMENSION__PROCESSING_GROUP:
				return getProcessingGroup();
			case XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE:
				return getCurrentStorageMode();
			case XmlaPackage.DIMENSION__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.DIMENSION__ATTRIBUTES:
				return getAttributes();
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_NAME:
				return getAttributeAllMemberName();
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS:
				return getAttributeAllMemberTranslations();
			case XmlaPackage.DIMENSION__HIERARCHIES:
				return getHierarchies();
			case XmlaPackage.DIMENSION__PROCESSING_RECOMMENDATION:
				return getProcessingRecommendation();
			case XmlaPackage.DIMENSION__RELATIONSHIPS:
				return getRelationships();
			case XmlaPackage.DIMENSION__STRING_STORES_COMPATIBILITY_LEVEL:
				return getStringStoresCompatibilityLevel();
			case XmlaPackage.DIMENSION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				return getCurrentStringStoresCompatibilityLevel();
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
			case XmlaPackage.DIMENSION__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.DIMENSION__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.DIMENSION__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DIMENSION__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DIMENSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.DIMENSION__SOURCE:
				setSource((Binding)newValue);
				return;
			case XmlaPackage.DIMENSION__MINING_MODEL_ID:
				setMiningModelID((String)newValue);
				return;
			case XmlaPackage.DIMENSION__TYPE:
				setType((TypeType3)newValue);
				return;
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER:
				setUnknownMember((UnknownMemberType)newValue);
				return;
			case XmlaPackage.DIMENSION__MDX_MISSING_MEMBER_MODE:
				setMdxMissingMemberMode((MdxMissingMemberModeType)newValue);
				return;
			case XmlaPackage.DIMENSION__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.DIMENSION__STORAGE_MODE:
				setStorageMode((StorageModeType1)newValue);
				return;
			case XmlaPackage.DIMENSION__WRITE_ENABLED:
				setWriteEnabled((Boolean)newValue);
				return;
			case XmlaPackage.DIMENSION__PROCESSING_PRIORITY:
				setProcessingPriority((BigInteger)newValue);
				return;
			case XmlaPackage.DIMENSION__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS:
				setDimensionPermissions((DimensionPermissionsType)newValue);
				return;
			case XmlaPackage.DIMENSION__DEPENDS_ON_DIMENSION_ID:
				setDependsOnDimensionID((String)newValue);
				return;
			case XmlaPackage.DIMENSION__LANGUAGE:
				setLanguage((BigInteger)newValue);
				return;
			case XmlaPackage.DIMENSION__COLLATION:
				setCollation((String)newValue);
				return;
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_NAME:
				setUnknownMemberName((String)newValue);
				return;
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS:
				setUnknownMemberTranslations((UnknownMemberTranslationsType)newValue);
				return;
			case XmlaPackage.DIMENSION__STATE:
				setState((StateType2)newValue);
				return;
			case XmlaPackage.DIMENSION__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)newValue);
				return;
			case XmlaPackage.DIMENSION__PROCESSING_MODE:
				setProcessingMode((ProcessingModeType)newValue);
				return;
			case XmlaPackage.DIMENSION__PROCESSING_GROUP:
				setProcessingGroup((ProcessingGroupType)newValue);
				return;
			case XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE:
				setCurrentStorageMode((CurrentStorageModeType)newValue);
				return;
			case XmlaPackage.DIMENSION__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.DIMENSION__ATTRIBUTES:
				setAttributes((AttributesType)newValue);
				return;
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_NAME:
				setAttributeAllMemberName((String)newValue);
				return;
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS:
				setAttributeAllMemberTranslations((AttributeAllMemberTranslationsType)newValue);
				return;
			case XmlaPackage.DIMENSION__HIERARCHIES:
				setHierarchies((HierarchiesType)newValue);
				return;
			case XmlaPackage.DIMENSION__PROCESSING_RECOMMENDATION:
				setProcessingRecommendation((ProcessingRecommendationType)newValue);
				return;
			case XmlaPackage.DIMENSION__RELATIONSHIPS:
				setRelationships((Relationships)newValue);
				return;
			case XmlaPackage.DIMENSION__STRING_STORES_COMPATIBILITY_LEVEL:
				setStringStoresCompatibilityLevel((StringStoresCompatibilityLevelType)newValue);
				return;
			case XmlaPackage.DIMENSION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				setCurrentStringStoresCompatibilityLevel((CurrentStringStoresCompatibilityLevelType)newValue);
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
			case XmlaPackage.DIMENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.DIMENSION__SOURCE:
				setSource((Binding)null);
				return;
			case XmlaPackage.DIMENSION__MINING_MODEL_ID:
				setMiningModelID(MINING_MODEL_ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__TYPE:
				unsetType();
				return;
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER:
				setUnknownMember((UnknownMemberType)null);
				return;
			case XmlaPackage.DIMENSION__MDX_MISSING_MEMBER_MODE:
				unsetMdxMissingMemberMode();
				return;
			case XmlaPackage.DIMENSION__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.DIMENSION__STORAGE_MODE:
				unsetStorageMode();
				return;
			case XmlaPackage.DIMENSION__WRITE_ENABLED:
				unsetWriteEnabled();
				return;
			case XmlaPackage.DIMENSION__PROCESSING_PRIORITY:
				setProcessingPriority(PROCESSING_PRIORITY_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS:
				setDimensionPermissions((DimensionPermissionsType)null);
				return;
			case XmlaPackage.DIMENSION__DEPENDS_ON_DIMENSION_ID:
				setDependsOnDimensionID(DEPENDS_ON_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_NAME:
				setUnknownMemberName(UNKNOWN_MEMBER_NAME_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS:
				setUnknownMemberTranslations((UnknownMemberTranslationsType)null);
				return;
			case XmlaPackage.DIMENSION__STATE:
				unsetState();
				return;
			case XmlaPackage.DIMENSION__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)null);
				return;
			case XmlaPackage.DIMENSION__PROCESSING_MODE:
				unsetProcessingMode();
				return;
			case XmlaPackage.DIMENSION__PROCESSING_GROUP:
				unsetProcessingGroup();
				return;
			case XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE:
				setCurrentStorageMode((CurrentStorageModeType)null);
				return;
			case XmlaPackage.DIMENSION__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.DIMENSION__ATTRIBUTES:
				setAttributes((AttributesType)null);
				return;
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_NAME:
				setAttributeAllMemberName(ATTRIBUTE_ALL_MEMBER_NAME_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS:
				setAttributeAllMemberTranslations((AttributeAllMemberTranslationsType)null);
				return;
			case XmlaPackage.DIMENSION__HIERARCHIES:
				setHierarchies((HierarchiesType)null);
				return;
			case XmlaPackage.DIMENSION__PROCESSING_RECOMMENDATION:
				unsetProcessingRecommendation();
				return;
			case XmlaPackage.DIMENSION__RELATIONSHIPS:
				setRelationships((Relationships)null);
				return;
			case XmlaPackage.DIMENSION__STRING_STORES_COMPATIBILITY_LEVEL:
				unsetStringStoresCompatibilityLevel();
				return;
			case XmlaPackage.DIMENSION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				unsetCurrentStringStoresCompatibilityLevel();
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
			case XmlaPackage.DIMENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.DIMENSION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.DIMENSION__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.DIMENSION__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.DIMENSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.DIMENSION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.DIMENSION__SOURCE:
				return source != null;
			case XmlaPackage.DIMENSION__MINING_MODEL_ID:
				return MINING_MODEL_ID_EDEFAULT == null ? miningModelID != null : !MINING_MODEL_ID_EDEFAULT.equals(miningModelID);
			case XmlaPackage.DIMENSION__TYPE:
				return isSetType();
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER:
				return unknownMember != null;
			case XmlaPackage.DIMENSION__MDX_MISSING_MEMBER_MODE:
				return isSetMdxMissingMemberMode();
			case XmlaPackage.DIMENSION__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.DIMENSION__STORAGE_MODE:
				return isSetStorageMode();
			case XmlaPackage.DIMENSION__WRITE_ENABLED:
				return isSetWriteEnabled();
			case XmlaPackage.DIMENSION__PROCESSING_PRIORITY:
				return PROCESSING_PRIORITY_EDEFAULT == null ? processingPriority != null : !PROCESSING_PRIORITY_EDEFAULT.equals(processingPriority);
			case XmlaPackage.DIMENSION__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
			case XmlaPackage.DIMENSION__DIMENSION_PERMISSIONS:
				return dimensionPermissions != null;
			case XmlaPackage.DIMENSION__DEPENDS_ON_DIMENSION_ID:
				return DEPENDS_ON_DIMENSION_ID_EDEFAULT == null ? dependsOnDimensionID != null : !DEPENDS_ON_DIMENSION_ID_EDEFAULT.equals(dependsOnDimensionID);
			case XmlaPackage.DIMENSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case XmlaPackage.DIMENSION__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_NAME:
				return UNKNOWN_MEMBER_NAME_EDEFAULT == null ? unknownMemberName != null : !UNKNOWN_MEMBER_NAME_EDEFAULT.equals(unknownMemberName);
			case XmlaPackage.DIMENSION__UNKNOWN_MEMBER_TRANSLATIONS:
				return unknownMemberTranslations != null;
			case XmlaPackage.DIMENSION__STATE:
				return isSetState();
			case XmlaPackage.DIMENSION__PROACTIVE_CACHING:
				return proactiveCaching != null;
			case XmlaPackage.DIMENSION__PROCESSING_MODE:
				return isSetProcessingMode();
			case XmlaPackage.DIMENSION__PROCESSING_GROUP:
				return isSetProcessingGroup();
			case XmlaPackage.DIMENSION__CURRENT_STORAGE_MODE:
				return currentStorageMode != null;
			case XmlaPackage.DIMENSION__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.DIMENSION__ATTRIBUTES:
				return attributes != null;
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_NAME:
				return ATTRIBUTE_ALL_MEMBER_NAME_EDEFAULT == null ? attributeAllMemberName != null : !ATTRIBUTE_ALL_MEMBER_NAME_EDEFAULT.equals(attributeAllMemberName);
			case XmlaPackage.DIMENSION__ATTRIBUTE_ALL_MEMBER_TRANSLATIONS:
				return attributeAllMemberTranslations != null;
			case XmlaPackage.DIMENSION__HIERARCHIES:
				return hierarchies != null;
			case XmlaPackage.DIMENSION__PROCESSING_RECOMMENDATION:
				return isSetProcessingRecommendation();
			case XmlaPackage.DIMENSION__RELATIONSHIPS:
				return relationships != null;
			case XmlaPackage.DIMENSION__STRING_STORES_COMPATIBILITY_LEVEL:
				return isSetStringStoresCompatibilityLevel();
			case XmlaPackage.DIMENSION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				return isSetCurrentStringStoresCompatibilityLevel();
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
		result.append(", createdTimestamp: ");
		result.append(createdTimestamp);
		result.append(", lastSchemaUpdate: ");
		result.append(lastSchemaUpdate);
		result.append(", description: ");
		result.append(description);
		result.append(", miningModelID: ");
		result.append(miningModelID);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", mdxMissingMemberMode: ");
		if (mdxMissingMemberModeESet) result.append(mdxMissingMemberMode); else result.append("<unset>");
		result.append(", storageMode: ");
		if (storageModeESet) result.append(storageMode); else result.append("<unset>");
		result.append(", writeEnabled: ");
		if (writeEnabledESet) result.append(writeEnabled); else result.append("<unset>");
		result.append(", processingPriority: ");
		result.append(processingPriority);
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(", dependsOnDimensionID: ");
		result.append(dependsOnDimensionID);
		result.append(", language: ");
		result.append(language);
		result.append(", collation: ");
		result.append(collation);
		result.append(", unknownMemberName: ");
		result.append(unknownMemberName);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", processingMode: ");
		if (processingModeESet) result.append(processingMode); else result.append("<unset>");
		result.append(", processingGroup: ");
		if (processingGroupESet) result.append(processingGroup); else result.append("<unset>");
		result.append(", attributeAllMemberName: ");
		result.append(attributeAllMemberName);
		result.append(", processingRecommendation: ");
		if (processingRecommendationESet) result.append(processingRecommendation); else result.append("<unset>");
		result.append(", stringStoresCompatibilityLevel: ");
		if (stringStoresCompatibilityLevelESet) result.append(stringStoresCompatibilityLevel); else result.append("<unset>");
		result.append(", currentStringStoresCompatibilityLevel: ");
		if (currentStringStoresCompatibilityLevelESet) result.append(currentStringStoresCompatibilityLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
