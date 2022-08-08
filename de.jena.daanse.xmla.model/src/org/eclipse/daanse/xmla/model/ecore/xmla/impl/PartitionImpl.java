/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstancesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType32;
import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.Partition;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.TabularBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getStorageLocation <em>Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getRemoteDatasourceID <em>Remote Datasource ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getEstimatedSize <em>Estimated Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getCurrentStorageMode <em>Current Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getAggregationDesignID <em>Aggregation Design ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getAggregationInstances <em>Aggregation Instances</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getAggregationInstanceSource <em>Aggregation Instance Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PartitionImpl#getDirectQueryUsage <em>Direct Query Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends MinimalEObjectImpl.Container implements Partition {
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
	protected AnnotationsType32 annotations;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TabularBinding source;

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
	 * The cached value of the '{@link #getStorageMode() <em>Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageMode()
	 * @generated
	 * @ordered
	 */
	protected StorageModeType2 storageMode;

	/**
	 * The default value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingModeType2 PROCESSING_MODE_EDEFAULT = ProcessingModeType2.REGULAR;

	/**
	 * The cached value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected ProcessingModeType2 processingMode = PROCESSING_MODE_EDEFAULT;

	/**
	 * This is true if the Processing Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingModeESet;

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
	 * The default value of the '{@link #getRemoteDatasourceID() <em>Remote Datasource ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteDatasourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_DATASOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteDatasourceID() <em>Remote Datasource ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteDatasourceID()
	 * @generated
	 * @ordered
	 */
	protected String remoteDatasourceID = REMOTE_DATASOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlice() <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlice()
	 * @generated
	 * @ordered
	 */
	protected static final String SLICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlice() <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlice()
	 * @generated
	 * @ordered
	 */
	protected String slice = SLICE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.DATA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getEstimatedSize() <em>Estimated Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedSize()
	 * @generated
	 * @ordered
	 */
	protected static final long ESTIMATED_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEstimatedSize() <em>Estimated Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedSize()
	 * @generated
	 * @ordered
	 */
	protected long estimatedSize = ESTIMATED_SIZE_EDEFAULT;

	/**
	 * This is true if the Estimated Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedSizeESet;

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
	 * The cached value of the '{@link #getCurrentStorageMode() <em>Current Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStorageMode()
	 * @generated
	 * @ordered
	 */
	protected CurrentStorageModeType1 currentStorageMode;

	/**
	 * The default value of the '{@link #getAggregationDesignID() <em>Aggregation Design ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDesignID()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_DESIGN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationDesignID() <em>Aggregation Design ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDesignID()
	 * @generated
	 * @ordered
	 */
	protected String aggregationDesignID = AGGREGATION_DESIGN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAggregationInstances() <em>Aggregation Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationInstances()
	 * @generated
	 * @ordered
	 */
	protected AggregationInstancesType aggregationInstances;

	/**
	 * The cached value of the '{@link #getAggregationInstanceSource() <em>Aggregation Instance Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationInstanceSource()
	 * @generated
	 * @ordered
	 */
	protected DataSourceViewBinding aggregationInstanceSource;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType4 STATE_EDEFAULT = StateType4.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType4 state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

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
	 * The default value of the '{@link #getDirectQueryUsage() <em>Direct Query Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectQueryUsage()
	 * @generated
	 * @ordered
	 */
	protected static final DirectQueryUsageType DIRECT_QUERY_USAGE_EDEFAULT = DirectQueryUsageType.IN_MEMORY_WITH_DIRECT_QUERY;

	/**
	 * The cached value of the '{@link #getDirectQueryUsage() <em>Direct Query Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectQueryUsage()
	 * @generated
	 * @ordered
	 */
	protected DirectQueryUsageType directQueryUsage = DIRECT_QUERY_USAGE_EDEFAULT;

	/**
	 * This is true if the Direct Query Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directQueryUsageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PARTITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType32 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType32 newAnnotations, NotificationChain msgs) {
		AnnotationsType32 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType32 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabularBinding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(TabularBinding newSource, NotificationChain msgs) {
		TabularBinding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TabularBinding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__SOURCE, newSource, newSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__PROCESSING_PRIORITY, oldProcessingPriority, processingPriority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__AGGREGATION_PREFIX, oldAggregationPrefix, aggregationPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType2 getStorageMode() {
		return storageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageMode(StorageModeType2 newStorageMode, NotificationChain msgs) {
		StorageModeType2 oldStorageMode = storageMode;
		storageMode = newStorageMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__STORAGE_MODE, oldStorageMode, newStorageMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageMode(StorageModeType2 newStorageMode) {
		if (newStorageMode != storageMode) {
			NotificationChain msgs = null;
			if (storageMode != null)
				msgs = ((InternalEObject)storageMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__STORAGE_MODE, null, msgs);
			if (newStorageMode != null)
				msgs = ((InternalEObject)newStorageMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__STORAGE_MODE, null, msgs);
			msgs = basicSetStorageMode(newStorageMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__STORAGE_MODE, newStorageMode, newStorageMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType2 getProcessingMode() {
		return processingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingMode(ProcessingModeType2 newProcessingMode) {
		ProcessingModeType2 oldProcessingMode = processingMode;
		processingMode = newProcessingMode == null ? PROCESSING_MODE_EDEFAULT : newProcessingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__PROCESSING_MODE, oldProcessingMode, processingMode, !oldProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingMode() {
		ProcessingModeType2 oldProcessingMode = processingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingMode = PROCESSING_MODE_EDEFAULT;
		processingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__PROCESSING_MODE, oldProcessingMode, PROCESSING_MODE_EDEFAULT, oldProcessingModeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
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
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__STORAGE_LOCATION, oldStorageLocation, storageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteDatasourceID() {
		return remoteDatasourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteDatasourceID(String newRemoteDatasourceID) {
		String oldRemoteDatasourceID = remoteDatasourceID;
		remoteDatasourceID = newRemoteDatasourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__REMOTE_DATASOURCE_ID, oldRemoteDatasourceID, remoteDatasourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlice() {
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlice(String newSlice) {
		String oldSlice = slice;
		slice = newSlice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__SLICE, oldSlice, slice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__PROACTIVE_CACHING, oldProactiveCaching, newProactiveCaching);
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
				msgs = ((InternalEObject)proactiveCaching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__PROACTIVE_CACHING, null, msgs);
			if (newProactiveCaching != null)
				msgs = ((InternalEObject)newProactiveCaching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__PROACTIVE_CACHING, null, msgs);
			msgs = basicSetProactiveCaching(newProactiveCaching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__PROACTIVE_CACHING, newProactiveCaching, newProactiveCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public long getEstimatedSize() {
		return estimatedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedSize(long newEstimatedSize) {
		long oldEstimatedSize = estimatedSize;
		estimatedSize = newEstimatedSize;
		boolean oldEstimatedSizeESet = estimatedSizeESet;
		estimatedSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ESTIMATED_SIZE, oldEstimatedSize, estimatedSize, !oldEstimatedSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstimatedSize() {
		long oldEstimatedSize = estimatedSize;
		boolean oldEstimatedSizeESet = estimatedSizeESet;
		estimatedSize = ESTIMATED_SIZE_EDEFAULT;
		estimatedSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__ESTIMATED_SIZE, oldEstimatedSize, ESTIMATED_SIZE_EDEFAULT, oldEstimatedSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstimatedSize() {
		return estimatedSizeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__ESTIMATED_ROWS, oldEstimatedRows, estimatedRows, !oldEstimatedRowsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__ESTIMATED_ROWS, oldEstimatedRows, ESTIMATED_ROWS_EDEFAULT, oldEstimatedRowsESet));
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
	public CurrentStorageModeType1 getCurrentStorageMode() {
		return currentStorageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStorageMode(CurrentStorageModeType1 newCurrentStorageMode, NotificationChain msgs) {
		CurrentStorageModeType1 oldCurrentStorageMode = currentStorageMode;
		currentStorageMode = newCurrentStorageMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__CURRENT_STORAGE_MODE, oldCurrentStorageMode, newCurrentStorageMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStorageMode(CurrentStorageModeType1 newCurrentStorageMode) {
		if (newCurrentStorageMode != currentStorageMode) {
			NotificationChain msgs = null;
			if (currentStorageMode != null)
				msgs = ((InternalEObject)currentStorageMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__CURRENT_STORAGE_MODE, null, msgs);
			if (newCurrentStorageMode != null)
				msgs = ((InternalEObject)newCurrentStorageMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__CURRENT_STORAGE_MODE, null, msgs);
			msgs = basicSetCurrentStorageMode(newCurrentStorageMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__CURRENT_STORAGE_MODE, newCurrentStorageMode, newCurrentStorageMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregationDesignID() {
		return aggregationDesignID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationDesignID(String newAggregationDesignID) {
		String oldAggregationDesignID = aggregationDesignID;
		aggregationDesignID = newAggregationDesignID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__AGGREGATION_DESIGN_ID, oldAggregationDesignID, aggregationDesignID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationInstancesType getAggregationInstances() {
		return aggregationInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationInstances(AggregationInstancesType newAggregationInstances, NotificationChain msgs) {
		AggregationInstancesType oldAggregationInstances = aggregationInstances;
		aggregationInstances = newAggregationInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__AGGREGATION_INSTANCES, oldAggregationInstances, newAggregationInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationInstances(AggregationInstancesType newAggregationInstances) {
		if (newAggregationInstances != aggregationInstances) {
			NotificationChain msgs = null;
			if (aggregationInstances != null)
				msgs = ((InternalEObject)aggregationInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__AGGREGATION_INSTANCES, null, msgs);
			if (newAggregationInstances != null)
				msgs = ((InternalEObject)newAggregationInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__AGGREGATION_INSTANCES, null, msgs);
			msgs = basicSetAggregationInstances(newAggregationInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__AGGREGATION_INSTANCES, newAggregationInstances, newAggregationInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceViewBinding getAggregationInstanceSource() {
		return aggregationInstanceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationInstanceSource(DataSourceViewBinding newAggregationInstanceSource, NotificationChain msgs) {
		DataSourceViewBinding oldAggregationInstanceSource = aggregationInstanceSource;
		aggregationInstanceSource = newAggregationInstanceSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE, oldAggregationInstanceSource, newAggregationInstanceSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationInstanceSource(DataSourceViewBinding newAggregationInstanceSource) {
		if (newAggregationInstanceSource != aggregationInstanceSource) {
			NotificationChain msgs = null;
			if (aggregationInstanceSource != null)
				msgs = ((InternalEObject)aggregationInstanceSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE, null, msgs);
			if (newAggregationInstanceSource != null)
				msgs = ((InternalEObject)newAggregationInstanceSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE, null, msgs);
			msgs = basicSetAggregationInstanceSource(newAggregationInstanceSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE, newAggregationInstanceSource, newAggregationInstanceSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__LAST_PROCESSED, oldLastProcessed, lastProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType4 getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType4 newState) {
		StateType4 oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType4 oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__STATE, oldState, STATE_EDEFAULT, oldStateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__STRING_STORES_COMPATIBILITY_LEVEL, oldStringStoresCompatibilityLevel, stringStoresCompatibilityLevel, !oldStringStoresCompatibilityLevelESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__STRING_STORES_COMPATIBILITY_LEVEL, oldStringStoresCompatibilityLevel, STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT, oldStringStoresCompatibilityLevelESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL, oldCurrentStringStoresCompatibilityLevel, currentStringStoresCompatibilityLevel, !oldCurrentStringStoresCompatibilityLevelESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL, oldCurrentStringStoresCompatibilityLevel, CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT, oldCurrentStringStoresCompatibilityLevelESet));
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
	public DirectQueryUsageType getDirectQueryUsage() {
		return directQueryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectQueryUsage(DirectQueryUsageType newDirectQueryUsage) {
		DirectQueryUsageType oldDirectQueryUsage = directQueryUsage;
		directQueryUsage = newDirectQueryUsage == null ? DIRECT_QUERY_USAGE_EDEFAULT : newDirectQueryUsage;
		boolean oldDirectQueryUsageESet = directQueryUsageESet;
		directQueryUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARTITION__DIRECT_QUERY_USAGE, oldDirectQueryUsage, directQueryUsage, !oldDirectQueryUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectQueryUsage() {
		DirectQueryUsageType oldDirectQueryUsage = directQueryUsage;
		boolean oldDirectQueryUsageESet = directQueryUsageESet;
		directQueryUsage = DIRECT_QUERY_USAGE_EDEFAULT;
		directQueryUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARTITION__DIRECT_QUERY_USAGE, oldDirectQueryUsage, DIRECT_QUERY_USAGE_EDEFAULT, oldDirectQueryUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectQueryUsage() {
		return directQueryUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PARTITION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.PARTITION__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.PARTITION__STORAGE_MODE:
				return basicSetStorageMode(null, msgs);
			case XmlaPackage.PARTITION__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
			case XmlaPackage.PARTITION__PROACTIVE_CACHING:
				return basicSetProactiveCaching(null, msgs);
			case XmlaPackage.PARTITION__CURRENT_STORAGE_MODE:
				return basicSetCurrentStorageMode(null, msgs);
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCES:
				return basicSetAggregationInstances(null, msgs);
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE:
				return basicSetAggregationInstanceSource(null, msgs);
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
			case XmlaPackage.PARTITION__NAME:
				return getName();
			case XmlaPackage.PARTITION__ID:
				return getID();
			case XmlaPackage.PARTITION__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.PARTITION__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.PARTITION__DESCRIPTION:
				return getDescription();
			case XmlaPackage.PARTITION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.PARTITION__SOURCE:
				return getSource();
			case XmlaPackage.PARTITION__PROCESSING_PRIORITY:
				return getProcessingPriority();
			case XmlaPackage.PARTITION__AGGREGATION_PREFIX:
				return getAggregationPrefix();
			case XmlaPackage.PARTITION__STORAGE_MODE:
				return getStorageMode();
			case XmlaPackage.PARTITION__PROCESSING_MODE:
				return getProcessingMode();
			case XmlaPackage.PARTITION__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.PARTITION__STORAGE_LOCATION:
				return getStorageLocation();
			case XmlaPackage.PARTITION__REMOTE_DATASOURCE_ID:
				return getRemoteDatasourceID();
			case XmlaPackage.PARTITION__SLICE:
				return getSlice();
			case XmlaPackage.PARTITION__PROACTIVE_CACHING:
				return getProactiveCaching();
			case XmlaPackage.PARTITION__TYPE:
				return getType();
			case XmlaPackage.PARTITION__ESTIMATED_SIZE:
				return getEstimatedSize();
			case XmlaPackage.PARTITION__ESTIMATED_ROWS:
				return getEstimatedRows();
			case XmlaPackage.PARTITION__CURRENT_STORAGE_MODE:
				return getCurrentStorageMode();
			case XmlaPackage.PARTITION__AGGREGATION_DESIGN_ID:
				return getAggregationDesignID();
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCES:
				return getAggregationInstances();
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE:
				return getAggregationInstanceSource();
			case XmlaPackage.PARTITION__LAST_PROCESSED:
				return getLastProcessed();
			case XmlaPackage.PARTITION__STATE:
				return getState();
			case XmlaPackage.PARTITION__STRING_STORES_COMPATIBILITY_LEVEL:
				return getStringStoresCompatibilityLevel();
			case XmlaPackage.PARTITION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				return getCurrentStringStoresCompatibilityLevel();
			case XmlaPackage.PARTITION__DIRECT_QUERY_USAGE:
				return getDirectQueryUsage();
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
			case XmlaPackage.PARTITION__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.PARTITION__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.PARTITION__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.PARTITION__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.PARTITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.PARTITION__ANNOTATIONS:
				setAnnotations((AnnotationsType32)newValue);
				return;
			case XmlaPackage.PARTITION__SOURCE:
				setSource((TabularBinding)newValue);
				return;
			case XmlaPackage.PARTITION__PROCESSING_PRIORITY:
				setProcessingPriority((BigInteger)newValue);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_PREFIX:
				setAggregationPrefix((String)newValue);
				return;
			case XmlaPackage.PARTITION__STORAGE_MODE:
				setStorageMode((StorageModeType2)newValue);
				return;
			case XmlaPackage.PARTITION__PROCESSING_MODE:
				setProcessingMode((ProcessingModeType2)newValue);
				return;
			case XmlaPackage.PARTITION__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.PARTITION__STORAGE_LOCATION:
				setStorageLocation((String)newValue);
				return;
			case XmlaPackage.PARTITION__REMOTE_DATASOURCE_ID:
				setRemoteDatasourceID((String)newValue);
				return;
			case XmlaPackage.PARTITION__SLICE:
				setSlice((String)newValue);
				return;
			case XmlaPackage.PARTITION__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)newValue);
				return;
			case XmlaPackage.PARTITION__TYPE:
				setType((TypeType)newValue);
				return;
			case XmlaPackage.PARTITION__ESTIMATED_SIZE:
				setEstimatedSize((Long)newValue);
				return;
			case XmlaPackage.PARTITION__ESTIMATED_ROWS:
				setEstimatedRows((Long)newValue);
				return;
			case XmlaPackage.PARTITION__CURRENT_STORAGE_MODE:
				setCurrentStorageMode((CurrentStorageModeType1)newValue);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_DESIGN_ID:
				setAggregationDesignID((String)newValue);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCES:
				setAggregationInstances((AggregationInstancesType)newValue);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE:
				setAggregationInstanceSource((DataSourceViewBinding)newValue);
				return;
			case XmlaPackage.PARTITION__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.PARTITION__STATE:
				setState((StateType4)newValue);
				return;
			case XmlaPackage.PARTITION__STRING_STORES_COMPATIBILITY_LEVEL:
				setStringStoresCompatibilityLevel((StringStoresCompatibilityLevelType)newValue);
				return;
			case XmlaPackage.PARTITION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				setCurrentStringStoresCompatibilityLevel((CurrentStringStoresCompatibilityLevelType)newValue);
				return;
			case XmlaPackage.PARTITION__DIRECT_QUERY_USAGE:
				setDirectQueryUsage((DirectQueryUsageType)newValue);
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
			case XmlaPackage.PARTITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__ANNOTATIONS:
				setAnnotations((AnnotationsType32)null);
				return;
			case XmlaPackage.PARTITION__SOURCE:
				setSource((TabularBinding)null);
				return;
			case XmlaPackage.PARTITION__PROCESSING_PRIORITY:
				setProcessingPriority(PROCESSING_PRIORITY_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_PREFIX:
				setAggregationPrefix(AGGREGATION_PREFIX_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__STORAGE_MODE:
				setStorageMode((StorageModeType2)null);
				return;
			case XmlaPackage.PARTITION__PROCESSING_MODE:
				unsetProcessingMode();
				return;
			case XmlaPackage.PARTITION__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.PARTITION__STORAGE_LOCATION:
				setStorageLocation(STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__REMOTE_DATASOURCE_ID:
				setRemoteDatasourceID(REMOTE_DATASOURCE_ID_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__SLICE:
				setSlice(SLICE_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)null);
				return;
			case XmlaPackage.PARTITION__TYPE:
				unsetType();
				return;
			case XmlaPackage.PARTITION__ESTIMATED_SIZE:
				unsetEstimatedSize();
				return;
			case XmlaPackage.PARTITION__ESTIMATED_ROWS:
				unsetEstimatedRows();
				return;
			case XmlaPackage.PARTITION__CURRENT_STORAGE_MODE:
				setCurrentStorageMode((CurrentStorageModeType1)null);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_DESIGN_ID:
				setAggregationDesignID(AGGREGATION_DESIGN_ID_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCES:
				setAggregationInstances((AggregationInstancesType)null);
				return;
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE:
				setAggregationInstanceSource((DataSourceViewBinding)null);
				return;
			case XmlaPackage.PARTITION__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
				return;
			case XmlaPackage.PARTITION__STATE:
				unsetState();
				return;
			case XmlaPackage.PARTITION__STRING_STORES_COMPATIBILITY_LEVEL:
				unsetStringStoresCompatibilityLevel();
				return;
			case XmlaPackage.PARTITION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				unsetCurrentStringStoresCompatibilityLevel();
				return;
			case XmlaPackage.PARTITION__DIRECT_QUERY_USAGE:
				unsetDirectQueryUsage();
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
			case XmlaPackage.PARTITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.PARTITION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.PARTITION__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.PARTITION__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.PARTITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.PARTITION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.PARTITION__SOURCE:
				return source != null;
			case XmlaPackage.PARTITION__PROCESSING_PRIORITY:
				return PROCESSING_PRIORITY_EDEFAULT == null ? processingPriority != null : !PROCESSING_PRIORITY_EDEFAULT.equals(processingPriority);
			case XmlaPackage.PARTITION__AGGREGATION_PREFIX:
				return AGGREGATION_PREFIX_EDEFAULT == null ? aggregationPrefix != null : !AGGREGATION_PREFIX_EDEFAULT.equals(aggregationPrefix);
			case XmlaPackage.PARTITION__STORAGE_MODE:
				return storageMode != null;
			case XmlaPackage.PARTITION__PROCESSING_MODE:
				return isSetProcessingMode();
			case XmlaPackage.PARTITION__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.PARTITION__STORAGE_LOCATION:
				return STORAGE_LOCATION_EDEFAULT == null ? storageLocation != null : !STORAGE_LOCATION_EDEFAULT.equals(storageLocation);
			case XmlaPackage.PARTITION__REMOTE_DATASOURCE_ID:
				return REMOTE_DATASOURCE_ID_EDEFAULT == null ? remoteDatasourceID != null : !REMOTE_DATASOURCE_ID_EDEFAULT.equals(remoteDatasourceID);
			case XmlaPackage.PARTITION__SLICE:
				return SLICE_EDEFAULT == null ? slice != null : !SLICE_EDEFAULT.equals(slice);
			case XmlaPackage.PARTITION__PROACTIVE_CACHING:
				return proactiveCaching != null;
			case XmlaPackage.PARTITION__TYPE:
				return isSetType();
			case XmlaPackage.PARTITION__ESTIMATED_SIZE:
				return isSetEstimatedSize();
			case XmlaPackage.PARTITION__ESTIMATED_ROWS:
				return isSetEstimatedRows();
			case XmlaPackage.PARTITION__CURRENT_STORAGE_MODE:
				return currentStorageMode != null;
			case XmlaPackage.PARTITION__AGGREGATION_DESIGN_ID:
				return AGGREGATION_DESIGN_ID_EDEFAULT == null ? aggregationDesignID != null : !AGGREGATION_DESIGN_ID_EDEFAULT.equals(aggregationDesignID);
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCES:
				return aggregationInstances != null;
			case XmlaPackage.PARTITION__AGGREGATION_INSTANCE_SOURCE:
				return aggregationInstanceSource != null;
			case XmlaPackage.PARTITION__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
			case XmlaPackage.PARTITION__STATE:
				return isSetState();
			case XmlaPackage.PARTITION__STRING_STORES_COMPATIBILITY_LEVEL:
				return isSetStringStoresCompatibilityLevel();
			case XmlaPackage.PARTITION__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				return isSetCurrentStringStoresCompatibilityLevel();
			case XmlaPackage.PARTITION__DIRECT_QUERY_USAGE:
				return isSetDirectQueryUsage();
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
		result.append(", processingPriority: ");
		result.append(processingPriority);
		result.append(", aggregationPrefix: ");
		result.append(aggregationPrefix);
		result.append(", processingMode: ");
		if (processingModeESet) result.append(processingMode); else result.append("<unset>");
		result.append(", storageLocation: ");
		result.append(storageLocation);
		result.append(", remoteDatasourceID: ");
		result.append(remoteDatasourceID);
		result.append(", slice: ");
		result.append(slice);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", estimatedSize: ");
		if (estimatedSizeESet) result.append(estimatedSize); else result.append("<unset>");
		result.append(", estimatedRows: ");
		if (estimatedRowsESet) result.append(estimatedRows); else result.append("<unset>");
		result.append(", aggregationDesignID: ");
		result.append(aggregationDesignID);
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", stringStoresCompatibilityLevel: ");
		if (stringStoresCompatibilityLevelESet) result.append(stringStoresCompatibilityLevel); else result.append("<unset>");
		result.append(", currentStringStoresCompatibilityLevel: ");
		if (currentStringStoresCompatibilityLevelESet) result.append(currentStringStoresCompatibilityLevel); else result.append("<unset>");
		result.append(", directQueryUsage: ");
		if (directQueryUsageESet) result.append(directQueryUsage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
