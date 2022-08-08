/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType27;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataAggregationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType21;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType11;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getDataAggregation <em>Data Aggregation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getStorageLocation <em>Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#isIgnoreUnrelatedDimensions <em>Ignore Unrelated Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getEstimatedSize <em>Estimated Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupImpl#getAggregationDesigns <em>Aggregation Designs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureGroupImpl extends MinimalEObjectImpl.Container implements MeasureGroup {
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
	protected AnnotationsType27 annotations;

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
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType21 translations;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType11 TYPE_EDEFAULT = TypeType11.REGULAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType11 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType3 STATE_EDEFAULT = StateType3.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType3 state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected MeasuresType1 measures;

	/**
	 * The default value of the '{@link #getDataAggregation() <em>Data Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final DataAggregationType DATA_AGGREGATION_EDEFAULT = DataAggregationType.NONE;

	/**
	 * The cached value of the '{@link #getDataAggregation() <em>Data Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAggregation()
	 * @generated
	 * @ordered
	 */
	protected DataAggregationType dataAggregation = DATA_AGGREGATION_EDEFAULT;

	/**
	 * This is true if the Data Aggregation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataAggregationESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MeasureGroupBinding source;

	/**
	 * The cached value of the '{@link #getStorageMode() <em>Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageMode()
	 * @generated
	 * @ordered
	 */
	protected StorageModeType3 storageMode;

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
	 * The default value of the '{@link #isIgnoreUnrelatedDimensions() <em>Ignore Unrelated Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreUnrelatedDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_UNRELATED_DIMENSIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreUnrelatedDimensions() <em>Ignore Unrelated Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreUnrelatedDimensions()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreUnrelatedDimensions = IGNORE_UNRELATED_DIMENSIONS_EDEFAULT;

	/**
	 * This is true if the Ignore Unrelated Dimensions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreUnrelatedDimensionsESet;

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
	 * The cached value of the '{@link #getErrorConfiguration() <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ErrorConfiguration errorConfiguration;

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
	 * The default value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingModeType3 PROCESSING_MODE_EDEFAULT = ProcessingModeType3.REGULAR;

	/**
	 * The cached value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected ProcessingModeType3 processingMode = PROCESSING_MODE_EDEFAULT;

	/**
	 * This is true if the Processing Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingModeESet;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType5 dimensions;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected PartitionsType partitions;

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
	 * The cached value of the '{@link #getAggregationDesigns() <em>Aggregation Designs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDesigns()
	 * @generated
	 * @ordered
	 */
	protected AggregationDesignsType aggregationDesigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MEASURE_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType27 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType27 newAnnotations, NotificationChain msgs) {
		AnnotationsType27 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType27 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ANNOTATIONS, newAnnotations, newAnnotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__LAST_PROCESSED, oldLastProcessed, lastProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType21 getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType21 newTranslations, NotificationChain msgs) {
		TranslationsType21 oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType21 newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType11 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType11 newType) {
		TypeType11 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType11 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public StateType3 getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType3 newState) {
		StateType3 oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType3 oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__STATE, oldState, STATE_EDEFAULT, oldStateESet));
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
	public MeasuresType1 getMeasures() {
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasures(MeasuresType1 newMeasures, NotificationChain msgs) {
		MeasuresType1 oldMeasures = measures;
		measures = newMeasures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__MEASURES, oldMeasures, newMeasures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasures(MeasuresType1 newMeasures) {
		if (newMeasures != measures) {
			NotificationChain msgs = null;
			if (measures != null)
				msgs = ((InternalEObject)measures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__MEASURES, null, msgs);
			if (newMeasures != null)
				msgs = ((InternalEObject)newMeasures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__MEASURES, null, msgs);
			msgs = basicSetMeasures(newMeasures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__MEASURES, newMeasures, newMeasures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAggregationType getDataAggregation() {
		return dataAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAggregation(DataAggregationType newDataAggregation) {
		DataAggregationType oldDataAggregation = dataAggregation;
		dataAggregation = newDataAggregation == null ? DATA_AGGREGATION_EDEFAULT : newDataAggregation;
		boolean oldDataAggregationESet = dataAggregationESet;
		dataAggregationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__DATA_AGGREGATION, oldDataAggregation, dataAggregation, !oldDataAggregationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataAggregation() {
		DataAggregationType oldDataAggregation = dataAggregation;
		boolean oldDataAggregationESet = dataAggregationESet;
		dataAggregation = DATA_AGGREGATION_EDEFAULT;
		dataAggregationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__DATA_AGGREGATION, oldDataAggregation, DATA_AGGREGATION_EDEFAULT, oldDataAggregationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataAggregation() {
		return dataAggregationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupBinding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(MeasureGroupBinding newSource, NotificationChain msgs) {
		MeasureGroupBinding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MeasureGroupBinding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType3 getStorageMode() {
		return storageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageMode(StorageModeType3 newStorageMode, NotificationChain msgs) {
		StorageModeType3 oldStorageMode = storageMode;
		storageMode = newStorageMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__STORAGE_MODE, oldStorageMode, newStorageMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageMode(StorageModeType3 newStorageMode) {
		if (newStorageMode != storageMode) {
			NotificationChain msgs = null;
			if (storageMode != null)
				msgs = ((InternalEObject)storageMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__STORAGE_MODE, null, msgs);
			if (newStorageMode != null)
				msgs = ((InternalEObject)newStorageMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__STORAGE_MODE, null, msgs);
			msgs = basicSetStorageMode(newStorageMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__STORAGE_MODE, newStorageMode, newStorageMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__STORAGE_LOCATION, oldStorageLocation, storageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreUnrelatedDimensions() {
		return ignoreUnrelatedDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreUnrelatedDimensions(boolean newIgnoreUnrelatedDimensions) {
		boolean oldIgnoreUnrelatedDimensions = ignoreUnrelatedDimensions;
		ignoreUnrelatedDimensions = newIgnoreUnrelatedDimensions;
		boolean oldIgnoreUnrelatedDimensionsESet = ignoreUnrelatedDimensionsESet;
		ignoreUnrelatedDimensionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__IGNORE_UNRELATED_DIMENSIONS, oldIgnoreUnrelatedDimensions, ignoreUnrelatedDimensions, !oldIgnoreUnrelatedDimensionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreUnrelatedDimensions() {
		boolean oldIgnoreUnrelatedDimensions = ignoreUnrelatedDimensions;
		boolean oldIgnoreUnrelatedDimensionsESet = ignoreUnrelatedDimensionsESet;
		ignoreUnrelatedDimensions = IGNORE_UNRELATED_DIMENSIONS_EDEFAULT;
		ignoreUnrelatedDimensionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__IGNORE_UNRELATED_DIMENSIONS, oldIgnoreUnrelatedDimensions, IGNORE_UNRELATED_DIMENSIONS_EDEFAULT, oldIgnoreUnrelatedDimensionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreUnrelatedDimensions() {
		return ignoreUnrelatedDimensionsESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING, oldProactiveCaching, newProactiveCaching);
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
				msgs = ((InternalEObject)proactiveCaching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING, null, msgs);
			if (newProactiveCaching != null)
				msgs = ((InternalEObject)newProactiveCaching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING, null, msgs);
			msgs = basicSetProactiveCaching(newProactiveCaching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING, newProactiveCaching, newProactiveCaching));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ESTIMATED_ROWS, oldEstimatedRows, estimatedRows, !oldEstimatedRowsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__ESTIMATED_ROWS, oldEstimatedRows, ESTIMATED_ROWS_EDEFAULT, oldEstimatedRowsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
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
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__ESTIMATED_SIZE, oldEstimatedSize, estimatedSize, !oldEstimatedSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__ESTIMATED_SIZE, oldEstimatedSize, ESTIMATED_SIZE_EDEFAULT, oldEstimatedSizeESet));
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
	public ProcessingModeType3 getProcessingMode() {
		return processingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingMode(ProcessingModeType3 newProcessingMode) {
		ProcessingModeType3 oldProcessingMode = processingMode;
		processingMode = newProcessingMode == null ? PROCESSING_MODE_EDEFAULT : newProcessingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__PROCESSING_MODE, oldProcessingMode, processingMode, !oldProcessingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingMode() {
		ProcessingModeType3 oldProcessingMode = processingMode;
		boolean oldProcessingModeESet = processingModeESet;
		processingMode = PROCESSING_MODE_EDEFAULT;
		processingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP__PROCESSING_MODE, oldProcessingMode, PROCESSING_MODE_EDEFAULT, oldProcessingModeESet));
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
	public DimensionsType5 getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(DimensionsType5 newDimensions, NotificationChain msgs) {
		DimensionsType5 oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType5 newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionsType getPartitions() {
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitions(PartitionsType newPartitions, NotificationChain msgs) {
		PartitionsType oldPartitions = partitions;
		partitions = newPartitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__PARTITIONS, oldPartitions, newPartitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitions(PartitionsType newPartitions) {
		if (newPartitions != partitions) {
			NotificationChain msgs = null;
			if (partitions != null)
				msgs = ((InternalEObject)partitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__PARTITIONS, null, msgs);
			if (newPartitions != null)
				msgs = ((InternalEObject)newPartitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__PARTITIONS, null, msgs);
			msgs = basicSetPartitions(newPartitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__PARTITIONS, newPartitions, newPartitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__AGGREGATION_PREFIX, oldAggregationPrefix, aggregationPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__PROCESSING_PRIORITY, oldProcessingPriority, processingPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDesignsType getAggregationDesigns() {
		return aggregationDesigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationDesigns(AggregationDesignsType newAggregationDesigns, NotificationChain msgs) {
		AggregationDesignsType oldAggregationDesigns = aggregationDesigns;
		aggregationDesigns = newAggregationDesigns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS, oldAggregationDesigns, newAggregationDesigns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationDesigns(AggregationDesignsType newAggregationDesigns) {
		if (newAggregationDesigns != aggregationDesigns) {
			NotificationChain msgs = null;
			if (aggregationDesigns != null)
				msgs = ((InternalEObject)aggregationDesigns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS, null, msgs);
			if (newAggregationDesigns != null)
				msgs = ((InternalEObject)newAggregationDesigns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS, null, msgs);
			msgs = basicSetAggregationDesigns(newAggregationDesigns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS, newAggregationDesigns, newAggregationDesigns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MEASURE_GROUP__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.MEASURE_GROUP__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.MEASURE_GROUP__MEASURES:
				return basicSetMeasures(null, msgs);
			case XmlaPackage.MEASURE_GROUP__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.MEASURE_GROUP__STORAGE_MODE:
				return basicSetStorageMode(null, msgs);
			case XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING:
				return basicSetProactiveCaching(null, msgs);
			case XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
			case XmlaPackage.MEASURE_GROUP__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case XmlaPackage.MEASURE_GROUP__PARTITIONS:
				return basicSetPartitions(null, msgs);
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS:
				return basicSetAggregationDesigns(null, msgs);
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
			case XmlaPackage.MEASURE_GROUP__NAME:
				return getName();
			case XmlaPackage.MEASURE_GROUP__ID:
				return getID();
			case XmlaPackage.MEASURE_GROUP__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.MEASURE_GROUP__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.MEASURE_GROUP__DESCRIPTION:
				return getDescription();
			case XmlaPackage.MEASURE_GROUP__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.MEASURE_GROUP__LAST_PROCESSED:
				return getLastProcessed();
			case XmlaPackage.MEASURE_GROUP__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.MEASURE_GROUP__TYPE:
				return getType();
			case XmlaPackage.MEASURE_GROUP__STATE:
				return getState();
			case XmlaPackage.MEASURE_GROUP__MEASURES:
				return getMeasures();
			case XmlaPackage.MEASURE_GROUP__DATA_AGGREGATION:
				return getDataAggregation();
			case XmlaPackage.MEASURE_GROUP__SOURCE:
				return getSource();
			case XmlaPackage.MEASURE_GROUP__STORAGE_MODE:
				return getStorageMode();
			case XmlaPackage.MEASURE_GROUP__STORAGE_LOCATION:
				return getStorageLocation();
			case XmlaPackage.MEASURE_GROUP__IGNORE_UNRELATED_DIMENSIONS:
				return isIgnoreUnrelatedDimensions();
			case XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING:
				return getProactiveCaching();
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_ROWS:
				return getEstimatedRows();
			case XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_SIZE:
				return getEstimatedSize();
			case XmlaPackage.MEASURE_GROUP__PROCESSING_MODE:
				return getProcessingMode();
			case XmlaPackage.MEASURE_GROUP__DIMENSIONS:
				return getDimensions();
			case XmlaPackage.MEASURE_GROUP__PARTITIONS:
				return getPartitions();
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_PREFIX:
				return getAggregationPrefix();
			case XmlaPackage.MEASURE_GROUP__PROCESSING_PRIORITY:
				return getProcessingPriority();
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS:
				return getAggregationDesigns();
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
			case XmlaPackage.MEASURE_GROUP__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__ANNOTATIONS:
				setAnnotations((AnnotationsType27)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__TRANSLATIONS:
				setTranslations((TranslationsType21)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__TYPE:
				setType((TypeType11)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__STATE:
				setState((StateType3)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__MEASURES:
				setMeasures((MeasuresType1)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__DATA_AGGREGATION:
				setDataAggregation((DataAggregationType)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__SOURCE:
				setSource((MeasureGroupBinding)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__STORAGE_MODE:
				setStorageMode((StorageModeType3)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__STORAGE_LOCATION:
				setStorageLocation((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__IGNORE_UNRELATED_DIMENSIONS:
				setIgnoreUnrelatedDimensions((Boolean)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_ROWS:
				setEstimatedRows((Long)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_SIZE:
				setEstimatedSize((Long)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__PROCESSING_MODE:
				setProcessingMode((ProcessingModeType3)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__DIMENSIONS:
				setDimensions((DimensionsType5)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__PARTITIONS:
				setPartitions((PartitionsType)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_PREFIX:
				setAggregationPrefix((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__PROCESSING_PRIORITY:
				setProcessingPriority((BigInteger)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS:
				setAggregationDesigns((AggregationDesignsType)newValue);
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
			case XmlaPackage.MEASURE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__ANNOTATIONS:
				setAnnotations((AnnotationsType27)null);
				return;
			case XmlaPackage.MEASURE_GROUP__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__TRANSLATIONS:
				setTranslations((TranslationsType21)null);
				return;
			case XmlaPackage.MEASURE_GROUP__TYPE:
				unsetType();
				return;
			case XmlaPackage.MEASURE_GROUP__STATE:
				unsetState();
				return;
			case XmlaPackage.MEASURE_GROUP__MEASURES:
				setMeasures((MeasuresType1)null);
				return;
			case XmlaPackage.MEASURE_GROUP__DATA_AGGREGATION:
				unsetDataAggregation();
				return;
			case XmlaPackage.MEASURE_GROUP__SOURCE:
				setSource((MeasureGroupBinding)null);
				return;
			case XmlaPackage.MEASURE_GROUP__STORAGE_MODE:
				setStorageMode((StorageModeType3)null);
				return;
			case XmlaPackage.MEASURE_GROUP__STORAGE_LOCATION:
				setStorageLocation(STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__IGNORE_UNRELATED_DIMENSIONS:
				unsetIgnoreUnrelatedDimensions();
				return;
			case XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING:
				setProactiveCaching((ProactiveCaching)null);
				return;
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_ROWS:
				unsetEstimatedRows();
				return;
			case XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_SIZE:
				unsetEstimatedSize();
				return;
			case XmlaPackage.MEASURE_GROUP__PROCESSING_MODE:
				unsetProcessingMode();
				return;
			case XmlaPackage.MEASURE_GROUP__DIMENSIONS:
				setDimensions((DimensionsType5)null);
				return;
			case XmlaPackage.MEASURE_GROUP__PARTITIONS:
				setPartitions((PartitionsType)null);
				return;
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_PREFIX:
				setAggregationPrefix(AGGREGATION_PREFIX_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__PROCESSING_PRIORITY:
				setProcessingPriority(PROCESSING_PRIORITY_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS:
				setAggregationDesigns((AggregationDesignsType)null);
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
			case XmlaPackage.MEASURE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.MEASURE_GROUP__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.MEASURE_GROUP__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.MEASURE_GROUP__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.MEASURE_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.MEASURE_GROUP__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.MEASURE_GROUP__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
			case XmlaPackage.MEASURE_GROUP__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.MEASURE_GROUP__TYPE:
				return isSetType();
			case XmlaPackage.MEASURE_GROUP__STATE:
				return isSetState();
			case XmlaPackage.MEASURE_GROUP__MEASURES:
				return measures != null;
			case XmlaPackage.MEASURE_GROUP__DATA_AGGREGATION:
				return isSetDataAggregation();
			case XmlaPackage.MEASURE_GROUP__SOURCE:
				return source != null;
			case XmlaPackage.MEASURE_GROUP__STORAGE_MODE:
				return storageMode != null;
			case XmlaPackage.MEASURE_GROUP__STORAGE_LOCATION:
				return STORAGE_LOCATION_EDEFAULT == null ? storageLocation != null : !STORAGE_LOCATION_EDEFAULT.equals(storageLocation);
			case XmlaPackage.MEASURE_GROUP__IGNORE_UNRELATED_DIMENSIONS:
				return isSetIgnoreUnrelatedDimensions();
			case XmlaPackage.MEASURE_GROUP__PROACTIVE_CACHING:
				return proactiveCaching != null;
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_ROWS:
				return isSetEstimatedRows();
			case XmlaPackage.MEASURE_GROUP__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.MEASURE_GROUP__ESTIMATED_SIZE:
				return isSetEstimatedSize();
			case XmlaPackage.MEASURE_GROUP__PROCESSING_MODE:
				return isSetProcessingMode();
			case XmlaPackage.MEASURE_GROUP__DIMENSIONS:
				return dimensions != null;
			case XmlaPackage.MEASURE_GROUP__PARTITIONS:
				return partitions != null;
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_PREFIX:
				return AGGREGATION_PREFIX_EDEFAULT == null ? aggregationPrefix != null : !AGGREGATION_PREFIX_EDEFAULT.equals(aggregationPrefix);
			case XmlaPackage.MEASURE_GROUP__PROCESSING_PRIORITY:
				return PROCESSING_PRIORITY_EDEFAULT == null ? processingPriority != null : !PROCESSING_PRIORITY_EDEFAULT.equals(processingPriority);
			case XmlaPackage.MEASURE_GROUP__AGGREGATION_DESIGNS:
				return aggregationDesigns != null;
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
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", dataAggregation: ");
		if (dataAggregationESet) result.append(dataAggregation); else result.append("<unset>");
		result.append(", storageLocation: ");
		result.append(storageLocation);
		result.append(", ignoreUnrelatedDimensions: ");
		if (ignoreUnrelatedDimensionsESet) result.append(ignoreUnrelatedDimensions); else result.append("<unset>");
		result.append(", estimatedRows: ");
		if (estimatedRowsESet) result.append(estimatedRows); else result.append("<unset>");
		result.append(", estimatedSize: ");
		if (estimatedSizeESet) result.append(estimatedSize); else result.append("<unset>");
		result.append(", processingMode: ");
		if (processingModeESet) result.append(processingMode); else result.append("<unset>");
		result.append(", aggregationPrefix: ");
		result.append(aggregationPrefix);
		result.append(", processingPriority: ");
		result.append(processingPriority);
		result.append(')');
		return result.toString();
	}

} //MeasureGroupImpl
