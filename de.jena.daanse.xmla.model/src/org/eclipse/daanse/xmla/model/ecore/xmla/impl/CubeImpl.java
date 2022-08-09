/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine800.DaxOptimizationModeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cube;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.KpisType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectivesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScriptCacheProcessingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScriptErrorHandlingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getCubePermissions <em>Cube Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getMdxScripts <em>Mdx Scripts</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getDefaultMeasure <em>Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getMeasureGroups <em>Measure Groups</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getScriptCacheProcessingMode <em>Script Cache Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getScriptErrorHandlingMode <em>Script Error Handling Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getDaxOptimizationMode <em>Dax Optimization Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getKpis <em>Kpis</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getStorageLocation <em>Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeImpl#getLastProcessed <em>Last Processed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeImpl extends MinimalEObjectImpl.Container implements Cube {
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
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType dimensions;

	/**
	 * The cached value of the '{@link #getCubePermissions() <em>Cube Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubePermissions()
	 * @generated
	 * @ordered
	 */
	protected CubePermissionsType cubePermissions;

	/**
	 * The cached value of the '{@link #getMdxScripts() <em>Mdx Scripts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxScripts()
	 * @generated
	 * @ordered
	 */
	protected MdxScriptsType mdxScripts;

	/**
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected PerspectivesType perspectives;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType6 STATE_EDEFAULT = StateType6.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType6 state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getDefaultMeasure() <em>Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MEASURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMeasure() <em>Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMeasure()
	 * @generated
	 * @ordered
	 */
	protected String defaultMeasure = DEFAULT_MEASURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * The cached value of the '{@link #getMeasureGroups() <em>Measure Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroups()
	 * @generated
	 * @ordered
	 */
	protected MeasureGroupsType measureGroups;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DataSourceViewBinding source;

	/**
	 * The default value of the '{@link #getAggregationPrefix() <em>Aggregation Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationPrefix() <em>Aggregation Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationPrefix()
	 * @generated
	 * @ordered
	 */
	protected String aggregationPrefix = AGGREGATION_PREFIX_EDEFAULT;

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
	 * The cached value of the '{@link #getStorageMode() <em>Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageMode()
	 * @generated
	 * @ordered
	 */
	protected StorageModeType storageMode;

	/**
	 * The default value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingModeType1 PROCESSING_MODE_EDEFAULT = ProcessingModeType1.REGULAR;

	/**
	 * The cached value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected ProcessingModeType1 processingMode = PROCESSING_MODE_EDEFAULT;

	/**
	 * This is true if the Processing Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingModeESet;

	/**
	 * The default value of the '{@link #getScriptCacheProcessingMode() <em>Script Cache Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptCacheProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptCacheProcessingModeType SCRIPT_CACHE_PROCESSING_MODE_EDEFAULT = ScriptCacheProcessingModeType.REGULAR;

	/**
	 * The cached value of the '{@link #getScriptCacheProcessingMode() <em>Script Cache Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptCacheProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected ScriptCacheProcessingModeType scriptCacheProcessingMode = SCRIPT_CACHE_PROCESSING_MODE_EDEFAULT;

	/**
	 * This is true if the Script Cache Processing Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scriptCacheProcessingModeESet;

	/**
	 * The default value of the '{@link #getScriptErrorHandlingMode() <em>Script Error Handling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptErrorHandlingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptErrorHandlingModeType SCRIPT_ERROR_HANDLING_MODE_EDEFAULT = ScriptErrorHandlingModeType.IGNORE_NONE;

	/**
	 * The cached value of the '{@link #getScriptErrorHandlingMode() <em>Script Error Handling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptErrorHandlingMode()
	 * @generated
	 * @ordered
	 */
	protected ScriptErrorHandlingModeType scriptErrorHandlingMode = SCRIPT_ERROR_HANDLING_MODE_EDEFAULT;

	/**
	 * This is true if the Script Error Handling Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scriptErrorHandlingModeESet;

	/**
	 * The default value of the '{@link #getDaxOptimizationMode() <em>Dax Optimization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaxOptimizationMode()
	 * @generated
	 * @ordered
	 */
	protected static final DaxOptimizationModeType DAX_OPTIMIZATION_MODE_EDEFAULT = DaxOptimizationModeType._1;

	/**
	 * The cached value of the '{@link #getDaxOptimizationMode() <em>Dax Optimization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaxOptimizationMode()
	 * @generated
	 * @ordered
	 */
	protected DaxOptimizationModeType daxOptimizationMode = DAX_OPTIMIZATION_MODE_EDEFAULT;

	/**
	 * This is true if the Dax Optimization Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean daxOptimizationModeESet;

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
	 * The cached value of the '{@link #getKpis() <em>Kpis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpis()
	 * @generated
	 * @ordered
	 */
	protected KpisType kpis;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected ActionsType actions;

	/**
	 * The default value of the '{@link #getStorageLocation() <em>Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageLocation() <em>Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected String storageLocation = STORAGE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedRows() <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRows()
	 * @generated
	 * @ordered
	 */
	protected static final long ESTIMATED_ROWS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEstimatedRows() <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRows()
	 * @generated
	 * @ordered
	 */
	protected long estimatedRows = ESTIMATED_ROWS_EDEFAULT;

	/**
	 * This is true if the Estimated Rows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedRowsESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ANNOTATIONS, newAnnotations, newAnnotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__COLLATION, oldCollation, collation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType getDimensions() {
		if (dimensions != null && dimensions.eIsProxy()) {
			InternalEObject oldDimensions = (InternalEObject)dimensions;
			dimensions = (DimensionsType)eResolveProxy(oldDimensions);
			if (dimensions != oldDimensions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmlaPackage.CUBE__DIMENSIONS, oldDimensions, dimensions));
			}
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType basicGetDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType newDimensions) {
		DimensionsType oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubePermissionsType getCubePermissions() {
		return cubePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCubePermissions(CubePermissionsType newCubePermissions, NotificationChain msgs) {
		CubePermissionsType oldCubePermissions = cubePermissions;
		cubePermissions = newCubePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__CUBE_PERMISSIONS, oldCubePermissions, newCubePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubePermissions(CubePermissionsType newCubePermissions) {
		if (newCubePermissions != cubePermissions) {
			NotificationChain msgs = null;
			if (cubePermissions != null)
				msgs = ((InternalEObject)cubePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__CUBE_PERMISSIONS, null, msgs);
			if (newCubePermissions != null)
				msgs = ((InternalEObject)newCubePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__CUBE_PERMISSIONS, null, msgs);
			msgs = basicSetCubePermissions(newCubePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__CUBE_PERMISSIONS, newCubePermissions, newCubePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxScriptsType getMdxScripts() {
		return mdxScripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMdxScripts(MdxScriptsType newMdxScripts, NotificationChain msgs) {
		MdxScriptsType oldMdxScripts = mdxScripts;
		mdxScripts = newMdxScripts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__MDX_SCRIPTS, oldMdxScripts, newMdxScripts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdxScripts(MdxScriptsType newMdxScripts) {
		if (newMdxScripts != mdxScripts) {
			NotificationChain msgs = null;
			if (mdxScripts != null)
				msgs = ((InternalEObject)mdxScripts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__MDX_SCRIPTS, null, msgs);
			if (newMdxScripts != null)
				msgs = ((InternalEObject)newMdxScripts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__MDX_SCRIPTS, null, msgs);
			msgs = basicSetMdxScripts(newMdxScripts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__MDX_SCRIPTS, newMdxScripts, newMdxScripts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectivesType getPerspectives() {
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerspectives(PerspectivesType newPerspectives, NotificationChain msgs) {
		PerspectivesType oldPerspectives = perspectives;
		perspectives = newPerspectives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__PERSPECTIVES, oldPerspectives, newPerspectives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectives(PerspectivesType newPerspectives) {
		if (newPerspectives != perspectives) {
			NotificationChain msgs = null;
			if (perspectives != null)
				msgs = ((InternalEObject)perspectives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__PERSPECTIVES, null, msgs);
			if (newPerspectives != null)
				msgs = ((InternalEObject)newPerspectives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__PERSPECTIVES, null, msgs);
			msgs = basicSetPerspectives(newPerspectives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__PERSPECTIVES, newPerspectives, newPerspectives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType6 getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType6 newState) {
		StateType6 oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType6 oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
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
	public String getDefaultMeasure() {
		return defaultMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMeasure(String newDefaultMeasure) {
		String oldDefaultMeasure = defaultMeasure;
		defaultMeasure = newDefaultMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__DEFAULT_MEASURE, oldDefaultMeasure, defaultMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		boolean oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupsType getMeasureGroups() {
		return measureGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureGroups(MeasureGroupsType newMeasureGroups, NotificationChain msgs) {
		MeasureGroupsType oldMeasureGroups = measureGroups;
		measureGroups = newMeasureGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__MEASURE_GROUPS, oldMeasureGroups, newMeasureGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroups(MeasureGroupsType newMeasureGroups) {
		if (newMeasureGroups != measureGroups) {
			NotificationChain msgs = null;
			if (measureGroups != null)
				msgs = ((InternalEObject)measureGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__MEASURE_GROUPS, null, msgs);
			if (newMeasureGroups != null)
				msgs = ((InternalEObject)newMeasureGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__MEASURE_GROUPS, null, msgs);
			msgs = basicSetMeasureGroups(newMeasureGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__MEASURE_GROUPS, newMeasureGroups, newMeasureGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceViewBinding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(DataSourceViewBinding newSource, NotificationChain msgs) {
		DataSourceViewBinding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DataSourceViewBinding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregationPrefix() {
		return aggregationPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationPrefix(String newAggregationPrefix) {
		String oldAggregationPrefix = aggregationPrefix;
		aggregationPrefix = newAggregationPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__AGGREGATION_PREFIX, oldAggregationPrefix, aggregationPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__PROCESSING_PRIORITY, oldProcessingPriority, processingPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType getStorageMode() {
		return storageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageMode(StorageModeType newStorageMode, NotificationChain msgs) {
		StorageModeType oldStorageMode = storageMode;
		storageMode = newStorageMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__STORAGE_MODE, oldStorageMode, newStorageMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageMode(StorageModeType newStorageMode) {
		if (newStorageMode != storageMode) {
			NotificationChain msgs = null;
			if (storageMode != null)
				msgs = ((InternalEObject)storageMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__STORAGE_MODE, null, msgs);
			if (newStorageMode != null)
				msgs = ((InternalEObject)newStorageMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__STORAGE_MODE, null, msgs);
			msgs = basicSetStorageMode(newStorageMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__STORAGE_MODE, newStorageMode, newStorageMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType1 getProcessingMode() {
		return processingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingMode(ProcessingModeType1 newProcessingMode) {
		ProcessingModeType1 oldProcessingMode = processingMode;
		processingMode = newProcessingMode == null ? PROCESSING_MODE_EDEFAULT : newProcessingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__PROCESSING_MODE, oldProcessingMode, processingMode, !oldProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingMode() {
		ProcessingModeType1 oldProcessingMode = processingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingMode = PROCESSING_MODE_EDEFAULT;
		processingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__PROCESSING_MODE, oldProcessingMode, PROCESSING_MODE_EDEFAULT, oldProcessingModeESet));
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
	public ScriptCacheProcessingModeType getScriptCacheProcessingMode() {
		return scriptCacheProcessingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptCacheProcessingMode(ScriptCacheProcessingModeType newScriptCacheProcessingMode) {
		ScriptCacheProcessingModeType oldScriptCacheProcessingMode = scriptCacheProcessingMode;
		scriptCacheProcessingMode = newScriptCacheProcessingMode == null ? SCRIPT_CACHE_PROCESSING_MODE_EDEFAULT : newScriptCacheProcessingMode;
		boolean oldScriptCacheProcessingModeESet = scriptCacheProcessingModeESet;
		scriptCacheProcessingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__SCRIPT_CACHE_PROCESSING_MODE, oldScriptCacheProcessingMode, scriptCacheProcessingMode, !oldScriptCacheProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScriptCacheProcessingMode() {
		ScriptCacheProcessingModeType oldScriptCacheProcessingMode = scriptCacheProcessingMode;
		boolean oldScriptCacheProcessingModeESet = scriptCacheProcessingModeESet;
		scriptCacheProcessingMode = SCRIPT_CACHE_PROCESSING_MODE_EDEFAULT;
		scriptCacheProcessingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__SCRIPT_CACHE_PROCESSING_MODE, oldScriptCacheProcessingMode, SCRIPT_CACHE_PROCESSING_MODE_EDEFAULT, oldScriptCacheProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScriptCacheProcessingMode() {
		return scriptCacheProcessingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptErrorHandlingModeType getScriptErrorHandlingMode() {
		return scriptErrorHandlingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptErrorHandlingMode(ScriptErrorHandlingModeType newScriptErrorHandlingMode) {
		ScriptErrorHandlingModeType oldScriptErrorHandlingMode = scriptErrorHandlingMode;
		scriptErrorHandlingMode = newScriptErrorHandlingMode == null ? SCRIPT_ERROR_HANDLING_MODE_EDEFAULT : newScriptErrorHandlingMode;
		boolean oldScriptErrorHandlingModeESet = scriptErrorHandlingModeESet;
		scriptErrorHandlingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__SCRIPT_ERROR_HANDLING_MODE, oldScriptErrorHandlingMode, scriptErrorHandlingMode, !oldScriptErrorHandlingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScriptErrorHandlingMode() {
		ScriptErrorHandlingModeType oldScriptErrorHandlingMode = scriptErrorHandlingMode;
		boolean oldScriptErrorHandlingModeESet = scriptErrorHandlingModeESet;
		scriptErrorHandlingMode = SCRIPT_ERROR_HANDLING_MODE_EDEFAULT;
		scriptErrorHandlingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__SCRIPT_ERROR_HANDLING_MODE, oldScriptErrorHandlingMode, SCRIPT_ERROR_HANDLING_MODE_EDEFAULT, oldScriptErrorHandlingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScriptErrorHandlingMode() {
		return scriptErrorHandlingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaxOptimizationModeType getDaxOptimizationMode() {
		return daxOptimizationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaxOptimizationMode(DaxOptimizationModeType newDaxOptimizationMode) {
		DaxOptimizationModeType oldDaxOptimizationMode = daxOptimizationMode;
		daxOptimizationMode = newDaxOptimizationMode == null ? DAX_OPTIMIZATION_MODE_EDEFAULT : newDaxOptimizationMode;
		boolean oldDaxOptimizationModeESet = daxOptimizationModeESet;
		daxOptimizationModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__DAX_OPTIMIZATION_MODE, oldDaxOptimizationMode, daxOptimizationMode, !oldDaxOptimizationModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDaxOptimizationMode() {
		DaxOptimizationModeType oldDaxOptimizationMode = daxOptimizationMode;
		boolean oldDaxOptimizationModeESet = daxOptimizationModeESet;
		daxOptimizationMode = DAX_OPTIMIZATION_MODE_EDEFAULT;
		daxOptimizationModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__DAX_OPTIMIZATION_MODE, oldDaxOptimizationMode, DAX_OPTIMIZATION_MODE_EDEFAULT, oldDaxOptimizationModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDaxOptimizationMode() {
		return daxOptimizationModeESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__PROACTIVE_CACHING, oldProactiveCaching, newProactiveCaching);
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
				msgs = ((InternalEObject)proactiveCaching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__PROACTIVE_CACHING, null, msgs);
			if (newProactiveCaching != null)
				msgs = ((InternalEObject)newProactiveCaching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__PROACTIVE_CACHING, null, msgs);
			msgs = basicSetProactiveCaching(newProactiveCaching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__PROACTIVE_CACHING, newProactiveCaching, newProactiveCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpisType getKpis() {
		return kpis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKpis(KpisType newKpis, NotificationChain msgs) {
		KpisType oldKpis = kpis;
		kpis = newKpis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__KPIS, oldKpis, newKpis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpis(KpisType newKpis) {
		if (newKpis != kpis) {
			NotificationChain msgs = null;
			if (kpis != null)
				msgs = ((InternalEObject)kpis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__KPIS, null, msgs);
			if (newKpis != null)
				msgs = ((InternalEObject)newKpis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__KPIS, null, msgs);
			msgs = basicSetKpis(newKpis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__KPIS, newKpis, newKpis));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
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
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsType getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(ActionsType newActions, NotificationChain msgs) {
		ActionsType oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(ActionsType newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStorageLocation() {
		return storageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageLocation(String newStorageLocation) {
		String oldStorageLocation = storageLocation;
		storageLocation = newStorageLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__STORAGE_LOCATION, oldStorageLocation, storageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEstimatedRows() {
		return estimatedRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedRows(long newEstimatedRows) {
		long oldEstimatedRows = estimatedRows;
		estimatedRows = newEstimatedRows;
		boolean oldEstimatedRowsESet = estimatedRowsESet;
		estimatedRowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__ESTIMATED_ROWS, oldEstimatedRows, estimatedRows, !oldEstimatedRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstimatedRows() {
		long oldEstimatedRows = estimatedRows;
		boolean oldEstimatedRowsESet = estimatedRowsESet;
		estimatedRows = ESTIMATED_ROWS_EDEFAULT;
		estimatedRowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE__ESTIMATED_ROWS, oldEstimatedRows, ESTIMATED_ROWS_EDEFAULT, oldEstimatedRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstimatedRows() {
		return estimatedRowsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE__LAST_PROCESSED, oldLastProcessed, lastProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.CUBE__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.CUBE__CUBE_PERMISSIONS:
				return basicSetCubePermissions(null, msgs);
			case XmlaPackage.CUBE__MDX_SCRIPTS:
				return basicSetMdxScripts(null, msgs);
			case XmlaPackage.CUBE__PERSPECTIVES:
				return basicSetPerspectives(null, msgs);
			case XmlaPackage.CUBE__MEASURE_GROUPS:
				return basicSetMeasureGroups(null, msgs);
			case XmlaPackage.CUBE__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.CUBE__STORAGE_MODE:
				return basicSetStorageMode(null, msgs);
			case XmlaPackage.CUBE__PROACTIVE_CACHING:
				return basicSetProactiveCaching(null, msgs);
			case XmlaPackage.CUBE__KPIS:
				return basicSetKpis(null, msgs);
			case XmlaPackage.CUBE__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
			case XmlaPackage.CUBE__ACTIONS:
				return basicSetActions(null, msgs);
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
			case XmlaPackage.CUBE__NAME:
				return getName();
			case XmlaPackage.CUBE__ID:
				return getID();
			case XmlaPackage.CUBE__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.CUBE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.CUBE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.CUBE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.CUBE__LANGUAGE:
				return getLanguage();
			case XmlaPackage.CUBE__COLLATION:
				return getCollation();
			case XmlaPackage.CUBE__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.CUBE__DIMENSIONS:
				if (resolve) return getDimensions();
				return basicGetDimensions();
			case XmlaPackage.CUBE__CUBE_PERMISSIONS:
				return getCubePermissions();
			case XmlaPackage.CUBE__MDX_SCRIPTS:
				return getMdxScripts();
			case XmlaPackage.CUBE__PERSPECTIVES:
				return getPerspectives();
			case XmlaPackage.CUBE__STATE:
				return getState();
			case XmlaPackage.CUBE__DEFAULT_MEASURE:
				return getDefaultMeasure();
			case XmlaPackage.CUBE__VISIBLE:
				return isVisible();
			case XmlaPackage.CUBE__MEASURE_GROUPS:
				return getMeasureGroups();
			case XmlaPackage.CUBE__SOURCE:
				return getSource();
			case XmlaPackage.CUBE__AGGREGATION_PREFIX:
				return getAggregationPrefix();
			case XmlaPackage.CUBE__PROCESSING_PRIORITY:
				return getProcessingPriority();
			case XmlaPackage.CUBE__STORAGE_MODE:
				return getStorageMode();
			case XmlaPackage.CUBE__PROCESSING_MODE:
				return getProcessingMode();
			case XmlaPackage.CUBE__SCRIPT_CACHE_PROCESSING_MODE:
				return getScriptCacheProcessingMode();
			case XmlaPackage.CUBE__SCRIPT_ERROR_HANDLING_MODE:
				return getScriptErrorHandlingMode();
			case XmlaPackage.CUBE__DAX_OPTIMIZATION_MODE:
				return getDaxOptimizationMode();
			case XmlaPackage.CUBE__PROACTIVE_CACHING:
				return getProactiveCaching();
			case XmlaPackage.CUBE__KPIS:
				return getKpis();
			case XmlaPackage.CUBE__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.CUBE__ACTIONS:
				return getActions();
			case XmlaPackage.CUBE__STORAGE_LOCATION:
				return getStorageLocation();
			case XmlaPackage.CUBE__ESTIMATED_ROWS:
				return getEstimatedRows();
			case XmlaPackage.CUBE__LAST_PROCESSED:
				return getLastProcessed();
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
			case XmlaPackage.CUBE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.CUBE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.CUBE__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.CUBE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.CUBE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.CUBE__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.CUBE__LANGUAGE:
				setLanguage((BigInteger)newValue);
				return;
			case XmlaPackage.CUBE__COLLATION:
				setCollation((String)newValue);
				return;
			case XmlaPackage.CUBE__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.CUBE__DIMENSIONS:
				setDimensions((DimensionsType)newValue);
				return;
			case XmlaPackage.CUBE__CUBE_PERMISSIONS:
				setCubePermissions((CubePermissionsType)newValue);
				return;
			case XmlaPackage.CUBE__MDX_SCRIPTS:
				setMdxScripts((MdxScriptsType)newValue);
				return;
			case XmlaPackage.CUBE__PERSPECTIVES:
				setPerspectives((PerspectivesType)newValue);
				return;
			case XmlaPackage.CUBE__STATE:
				setState((StateType6)newValue);
				return;
			case XmlaPackage.CUBE__DEFAULT_MEASURE:
				setDefaultMeasure((String)newValue);
				return;
			case XmlaPackage.CUBE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case XmlaPackage.CUBE__MEASURE_GROUPS:
				setMeasureGroups((MeasureGroupsType)newValue);
				return;
			case XmlaPackage.CUBE__SOURCE:
				setSource((DataSourceViewBinding)newValue);
				return;
			case XmlaPackage.CUBE__AGGREGATION_PREFIX:
				setAggregationPrefix((String)newValue);
				return;
			case XmlaPackage.CUBE__PROCESSING_PRIORITY:
				setProcessingPriority((BigInteger)newValue);
				return;
			case XmlaPackage.CUBE__STORAGE_MODE:
				setStorageMode((StorageModeType)newValue);
				return;
			case XmlaPackage.CUBE__PROCESSING_MODE:
				setProcessingMode((ProcessingModeType1)newValue);
				return;
			case XmlaPackage.CUBE__SCRIPT_CACHE_PROCESSING_MODE:
				setScriptCacheProcessingMode((ScriptCacheProcessingModeType)newValue);
				return;
			case XmlaPackage.CUBE__SCRIPT_ERROR_HANDLING_MODE:
				setScriptErrorHandlingMode((ScriptErrorHandlingModeType)newValue);
				return;
			case XmlaPackage.CUBE__DAX_OPTIMIZATION_MODE:
				setDaxOptimizationMode((DaxOptimizationModeType)newValue);
				return;
			case XmlaPackage.CUBE__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)newValue);
				return;
			case XmlaPackage.CUBE__KPIS:
				setKpis((KpisType)newValue);
				return;
			case XmlaPackage.CUBE__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.CUBE__ACTIONS:
				setActions((ActionsType)newValue);
				return;
			case XmlaPackage.CUBE__STORAGE_LOCATION:
				setStorageLocation((String)newValue);
				return;
			case XmlaPackage.CUBE__ESTIMATED_ROWS:
				setEstimatedRows((Long)newValue);
				return;
			case XmlaPackage.CUBE__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
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
			case XmlaPackage.CUBE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.CUBE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.CUBE__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.CUBE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.CUBE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.CUBE__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.CUBE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.CUBE__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case XmlaPackage.CUBE__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.CUBE__DIMENSIONS:
				setDimensions((DimensionsType)null);
				return;
			case XmlaPackage.CUBE__CUBE_PERMISSIONS:
				setCubePermissions((CubePermissionsType)null);
				return;
			case XmlaPackage.CUBE__MDX_SCRIPTS:
				setMdxScripts((MdxScriptsType)null);
				return;
			case XmlaPackage.CUBE__PERSPECTIVES:
				setPerspectives((PerspectivesType)null);
				return;
			case XmlaPackage.CUBE__STATE:
				unsetState();
				return;
			case XmlaPackage.CUBE__DEFAULT_MEASURE:
				setDefaultMeasure(DEFAULT_MEASURE_EDEFAULT);
				return;
			case XmlaPackage.CUBE__VISIBLE:
				unsetVisible();
				return;
			case XmlaPackage.CUBE__MEASURE_GROUPS:
				setMeasureGroups((MeasureGroupsType)null);
				return;
			case XmlaPackage.CUBE__SOURCE:
				setSource((DataSourceViewBinding)null);
				return;
			case XmlaPackage.CUBE__AGGREGATION_PREFIX:
				setAggregationPrefix(AGGREGATION_PREFIX_EDEFAULT);
				return;
			case XmlaPackage.CUBE__PROCESSING_PRIORITY:
				setProcessingPriority(PROCESSING_PRIORITY_EDEFAULT);
				return;
			case XmlaPackage.CUBE__STORAGE_MODE:
				setStorageMode((StorageModeType)null);
				return;
			case XmlaPackage.CUBE__PROCESSING_MODE:
				unsetProcessingMode();
				return;
			case XmlaPackage.CUBE__SCRIPT_CACHE_PROCESSING_MODE:
				unsetScriptCacheProcessingMode();
				return;
			case XmlaPackage.CUBE__SCRIPT_ERROR_HANDLING_MODE:
				unsetScriptErrorHandlingMode();
				return;
			case XmlaPackage.CUBE__DAX_OPTIMIZATION_MODE:
				unsetDaxOptimizationMode();
				return;
			case XmlaPackage.CUBE__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)null);
				return;
			case XmlaPackage.CUBE__KPIS:
				setKpis((KpisType)null);
				return;
			case XmlaPackage.CUBE__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.CUBE__ACTIONS:
				setActions((ActionsType)null);
				return;
			case XmlaPackage.CUBE__STORAGE_LOCATION:
				setStorageLocation(STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.CUBE__ESTIMATED_ROWS:
				unsetEstimatedRows();
				return;
			case XmlaPackage.CUBE__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
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
			case XmlaPackage.CUBE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.CUBE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.CUBE__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.CUBE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.CUBE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.CUBE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.CUBE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case XmlaPackage.CUBE__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case XmlaPackage.CUBE__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.CUBE__DIMENSIONS:
				return dimensions != null;
			case XmlaPackage.CUBE__CUBE_PERMISSIONS:
				return cubePermissions != null;
			case XmlaPackage.CUBE__MDX_SCRIPTS:
				return mdxScripts != null;
			case XmlaPackage.CUBE__PERSPECTIVES:
				return perspectives != null;
			case XmlaPackage.CUBE__STATE:
				return isSetState();
			case XmlaPackage.CUBE__DEFAULT_MEASURE:
				return DEFAULT_MEASURE_EDEFAULT == null ? defaultMeasure != null : !DEFAULT_MEASURE_EDEFAULT.equals(defaultMeasure);
			case XmlaPackage.CUBE__VISIBLE:
				return isSetVisible();
			case XmlaPackage.CUBE__MEASURE_GROUPS:
				return measureGroups != null;
			case XmlaPackage.CUBE__SOURCE:
				return source != null;
			case XmlaPackage.CUBE__AGGREGATION_PREFIX:
				return AGGREGATION_PREFIX_EDEFAULT == null ? aggregationPrefix != null : !AGGREGATION_PREFIX_EDEFAULT.equals(aggregationPrefix);
			case XmlaPackage.CUBE__PROCESSING_PRIORITY:
				return PROCESSING_PRIORITY_EDEFAULT == null ? processingPriority != null : !PROCESSING_PRIORITY_EDEFAULT.equals(processingPriority);
			case XmlaPackage.CUBE__STORAGE_MODE:
				return storageMode != null;
			case XmlaPackage.CUBE__PROCESSING_MODE:
				return isSetProcessingMode();
			case XmlaPackage.CUBE__SCRIPT_CACHE_PROCESSING_MODE:
				return isSetScriptCacheProcessingMode();
			case XmlaPackage.CUBE__SCRIPT_ERROR_HANDLING_MODE:
				return isSetScriptErrorHandlingMode();
			case XmlaPackage.CUBE__DAX_OPTIMIZATION_MODE:
				return isSetDaxOptimizationMode();
			case XmlaPackage.CUBE__PROACTIVE_CACHING:
				return proactiveCaching != null;
			case XmlaPackage.CUBE__KPIS:
				return kpis != null;
			case XmlaPackage.CUBE__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.CUBE__ACTIONS:
				return actions != null;
			case XmlaPackage.CUBE__STORAGE_LOCATION:
				return STORAGE_LOCATION_EDEFAULT == null ? storageLocation != null : !STORAGE_LOCATION_EDEFAULT.equals(storageLocation);
			case XmlaPackage.CUBE__ESTIMATED_ROWS:
				return isSetEstimatedRows();
			case XmlaPackage.CUBE__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
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
		result.append(", language: ");
		result.append(language);
		result.append(", collation: ");
		result.append(collation);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", defaultMeasure: ");
		result.append(defaultMeasure);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", aggregationPrefix: ");
		result.append(aggregationPrefix);
		result.append(", processingPriority: ");
		result.append(processingPriority);
		result.append(", processingMode: ");
		if (processingModeESet) result.append(processingMode); else result.append("<unset>");
		result.append(", scriptCacheProcessingMode: ");
		if (scriptCacheProcessingModeESet) result.append(scriptCacheProcessingMode); else result.append("<unset>");
		result.append(", scriptErrorHandlingMode: ");
		if (scriptErrorHandlingModeESet) result.append(scriptErrorHandlingMode); else result.append("<unset>");
		result.append(", daxOptimizationMode: ");
		if (daxOptimizationModeESet) result.append(daxOptimizationMode); else result.append("<unset>");
		result.append(", storageLocation: ");
		result.append(storageLocation);
		result.append(", estimatedRows: ");
		if (estimatedRowsESet) result.append(estimatedRows); else result.append("<unset>");
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(')');
		return result.toString();
	}

} //CubeImpl
