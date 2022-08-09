/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.AccountsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Database;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructuresType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RolesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType;
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
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getReadWriteMode <em>Read Write Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getEstimatedSize <em>Estimated Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getMasterDataSourceID <em>Master Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDataSourceImpersonationInfo <em>Data Source Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDataSourceViews <em>Data Source Views</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getCubes <em>Cubes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getMiningStructures <em>Mining Structures</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getAssemblies <em>Assemblies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDatabasePermissions <em>Database Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getStorageEngineUsed <em>Storage Engine Used</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getImageVersion <em>Image Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getCompatibilityLevel <em>Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabaseImpl#getDirectQueryMode <em>Direct Query Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
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
	 * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastUpdate = LAST_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType STATE_EDEFAULT = StateType.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getReadWriteMode() <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWriteMode()
	 * @generated
	 * @ordered
	 */
	protected static final ReadWriteModeType READ_WRITE_MODE_EDEFAULT = ReadWriteModeType.READ_WRITE;

	/**
	 * The cached value of the '{@link #getReadWriteMode() <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWriteMode()
	 * @generated
	 * @ordered
	 */
	protected ReadWriteModeType readWriteMode = READ_WRITE_MODE_EDEFAULT;

	/**
	 * This is true if the Read Write Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readWriteModeESet;

	/**
	 * The default value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_STORAGE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected String dbStorageLocation = DB_STORAGE_LOCATION_EDEFAULT;

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
	 * The default value of the '{@link #getMasterDataSourceID() <em>Master Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterDataSourceID() <em>Master Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected String masterDataSourceID = MASTER_DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSourceImpersonationInfo() <em>Data Source Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceImpersonationInfo()
	 * @generated
	 * @ordered
	 */
	protected ImpersonationInfo dataSourceImpersonationInfo;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected AccountsType accounts;

	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected DataSourcesType dataSources;

	/**
	 * The cached value of the '{@link #getDataSourceViews() <em>Data Source Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViews()
	 * @generated
	 * @ordered
	 */
	protected DataSourceViewsType dataSourceViews;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType dimensions;

	/**
	 * The cached value of the '{@link #getCubes() <em>Cubes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubes()
	 * @generated
	 * @ordered
	 */
	protected CubesType cubes;

	/**
	 * The cached value of the '{@link #getMiningStructures() <em>Mining Structures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructures()
	 * @generated
	 * @ordered
	 */
	protected MiningStructuresType miningStructures;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected RolesType1 roles;

	/**
	 * The cached value of the '{@link #getAssemblies() <em>Assemblies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblies()
	 * @generated
	 * @ordered
	 */
	protected AssembliesType1 assemblies;

	/**
	 * The cached value of the '{@link #getDatabasePermissions() <em>Database Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePermissions()
	 * @generated
	 * @ordered
	 */
	protected DatabasePermissionsType databasePermissions;

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
	 * The default value of the '{@link #getStorageEngineUsed() <em>Storage Engine Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEngineUsed()
	 * @generated
	 * @ordered
	 */
	protected static final StorageEngineUsedType STORAGE_ENGINE_USED_EDEFAULT = StorageEngineUsedType.TRADITIONAL;

	/**
	 * The cached value of the '{@link #getStorageEngineUsed() <em>Storage Engine Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEngineUsed()
	 * @generated
	 * @ordered
	 */
	protected StorageEngineUsedType storageEngineUsed = STORAGE_ENGINE_USED_EDEFAULT;

	/**
	 * This is true if the Storage Engine Used attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storageEngineUsedESet;

	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUniqueID() <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUniqueID() <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String imageUniqueID = IMAGE_UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageVersion() <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageVersion() <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageVersion()
	 * @generated
	 * @ordered
	 */
	protected String imageVersion = IMAGE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompatibilityLevel() <em>Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COMPATIBILITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompatibilityLevel() <em>Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger compatibilityLevel = COMPATIBILITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectQueryMode() <em>Direct Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectQueryMode()
	 * @generated
	 * @ordered
	 */
	protected static final DirectQueryModeType DIRECT_QUERY_MODE_EDEFAULT = DirectQueryModeType.IN_MEMORY;

	/**
	 * The cached value of the '{@link #getDirectQueryMode() <em>Direct Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectQueryMode()
	 * @generated
	 * @ordered
	 */
	protected DirectQueryModeType directQueryMode = DIRECT_QUERY_MODE_EDEFAULT;

	/**
	 * This is true if the Direct Query Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directQueryModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATABASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdate(XMLGregorianCalendar newLastUpdate) {
		XMLGregorianCalendar oldLastUpdate = lastUpdate;
		lastUpdate = newLastUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__LAST_UPDATE, oldLastUpdate, lastUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType newState) {
		StateType oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
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
	public ReadWriteModeType getReadWriteMode() {
		return readWriteMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadWriteMode(ReadWriteModeType newReadWriteMode) {
		ReadWriteModeType oldReadWriteMode = readWriteMode;
		readWriteMode = newReadWriteMode == null ? READ_WRITE_MODE_EDEFAULT : newReadWriteMode;
		boolean oldReadWriteModeESet = readWriteModeESet;
		readWriteModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__READ_WRITE_MODE, oldReadWriteMode, readWriteMode, !oldReadWriteModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadWriteMode() {
		ReadWriteModeType oldReadWriteMode = readWriteMode;
		boolean oldReadWriteModeESet = readWriteModeESet;
		readWriteMode = READ_WRITE_MODE_EDEFAULT;
		readWriteModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE__READ_WRITE_MODE, oldReadWriteMode, READ_WRITE_MODE_EDEFAULT, oldReadWriteModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadWriteMode() {
		return readWriteModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbStorageLocation() {
		return dbStorageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbStorageLocation(String newDbStorageLocation) {
		String oldDbStorageLocation = dbStorageLocation;
		dbStorageLocation = newDbStorageLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DB_STORAGE_LOCATION, oldDbStorageLocation, dbStorageLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__AGGREGATION_PREFIX, oldAggregationPrefix, aggregationPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__PROCESSING_PRIORITY, oldProcessingPriority, processingPriority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ESTIMATED_SIZE, oldEstimatedSize, estimatedSize, !oldEstimatedSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE__ESTIMATED_SIZE, oldEstimatedSize, ESTIMATED_SIZE_EDEFAULT, oldEstimatedSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__LAST_PROCESSED, oldLastProcessed, lastProcessed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__COLLATION, oldCollation, collation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__VISIBLE, oldVisible, visible, !oldVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
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
	public String getMasterDataSourceID() {
		return masterDataSourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterDataSourceID(String newMasterDataSourceID) {
		String oldMasterDataSourceID = masterDataSourceID;
		masterDataSourceID = newMasterDataSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__MASTER_DATA_SOURCE_ID, oldMasterDataSourceID, masterDataSourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfo getDataSourceImpersonationInfo() {
		return dataSourceImpersonationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSourceImpersonationInfo(ImpersonationInfo newDataSourceImpersonationInfo, NotificationChain msgs) {
		ImpersonationInfo oldDataSourceImpersonationInfo = dataSourceImpersonationInfo;
		dataSourceImpersonationInfo = newDataSourceImpersonationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO, oldDataSourceImpersonationInfo, newDataSourceImpersonationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceImpersonationInfo(ImpersonationInfo newDataSourceImpersonationInfo) {
		if (newDataSourceImpersonationInfo != dataSourceImpersonationInfo) {
			NotificationChain msgs = null;
			if (dataSourceImpersonationInfo != null)
				msgs = ((InternalEObject)dataSourceImpersonationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO, null, msgs);
			if (newDataSourceImpersonationInfo != null)
				msgs = ((InternalEObject)newDataSourceImpersonationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO, null, msgs);
			msgs = basicSetDataSourceImpersonationInfo(newDataSourceImpersonationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO, newDataSourceImpersonationInfo, newDataSourceImpersonationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsType getAccounts() {
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccounts(AccountsType newAccounts, NotificationChain msgs) {
		AccountsType oldAccounts = accounts;
		accounts = newAccounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ACCOUNTS, oldAccounts, newAccounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccounts(AccountsType newAccounts) {
		if (newAccounts != accounts) {
			NotificationChain msgs = null;
			if (accounts != null)
				msgs = ((InternalEObject)accounts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ACCOUNTS, null, msgs);
			if (newAccounts != null)
				msgs = ((InternalEObject)newAccounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ACCOUNTS, null, msgs);
			msgs = basicSetAccounts(newAccounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ACCOUNTS, newAccounts, newAccounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourcesType getDataSources() {
		return dataSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSources(DataSourcesType newDataSources, NotificationChain msgs) {
		DataSourcesType oldDataSources = dataSources;
		dataSources = newDataSources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATA_SOURCES, oldDataSources, newDataSources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSources(DataSourcesType newDataSources) {
		if (newDataSources != dataSources) {
			NotificationChain msgs = null;
			if (dataSources != null)
				msgs = ((InternalEObject)dataSources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATA_SOURCES, null, msgs);
			if (newDataSources != null)
				msgs = ((InternalEObject)newDataSources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATA_SOURCES, null, msgs);
			msgs = basicSetDataSources(newDataSources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATA_SOURCES, newDataSources, newDataSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceViewsType getDataSourceViews() {
		return dataSourceViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSourceViews(DataSourceViewsType newDataSourceViews, NotificationChain msgs) {
		DataSourceViewsType oldDataSourceViews = dataSourceViews;
		dataSourceViews = newDataSourceViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATA_SOURCE_VIEWS, oldDataSourceViews, newDataSourceViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceViews(DataSourceViewsType newDataSourceViews) {
		if (newDataSourceViews != dataSourceViews) {
			NotificationChain msgs = null;
			if (dataSourceViews != null)
				msgs = ((InternalEObject)dataSourceViews).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATA_SOURCE_VIEWS, null, msgs);
			if (newDataSourceViews != null)
				msgs = ((InternalEObject)newDataSourceViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATA_SOURCE_VIEWS, null, msgs);
			msgs = basicSetDataSourceViews(newDataSourceViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATA_SOURCE_VIEWS, newDataSourceViews, newDataSourceViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(DimensionsType newDimensions, NotificationChain msgs) {
		DimensionsType oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubesType getCubes() {
		return cubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCubes(CubesType newCubes, NotificationChain msgs) {
		CubesType oldCubes = cubes;
		cubes = newCubes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__CUBES, oldCubes, newCubes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubes(CubesType newCubes) {
		if (newCubes != cubes) {
			NotificationChain msgs = null;
			if (cubes != null)
				msgs = ((InternalEObject)cubes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__CUBES, null, msgs);
			if (newCubes != null)
				msgs = ((InternalEObject)newCubes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__CUBES, null, msgs);
			msgs = basicSetCubes(newCubes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__CUBES, newCubes, newCubes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningStructuresType getMiningStructures() {
		return miningStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningStructures(MiningStructuresType newMiningStructures, NotificationChain msgs) {
		MiningStructuresType oldMiningStructures = miningStructures;
		miningStructures = newMiningStructures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__MINING_STRUCTURES, oldMiningStructures, newMiningStructures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningStructures(MiningStructuresType newMiningStructures) {
		if (newMiningStructures != miningStructures) {
			NotificationChain msgs = null;
			if (miningStructures != null)
				msgs = ((InternalEObject)miningStructures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__MINING_STRUCTURES, null, msgs);
			if (newMiningStructures != null)
				msgs = ((InternalEObject)newMiningStructures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__MINING_STRUCTURES, null, msgs);
			msgs = basicSetMiningStructures(newMiningStructures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__MINING_STRUCTURES, newMiningStructures, newMiningStructures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType1 getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(RolesType1 newRoles, NotificationChain msgs) {
		RolesType1 oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(RolesType1 newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembliesType1 getAssemblies() {
		return assemblies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblies(AssembliesType1 newAssemblies, NotificationChain msgs) {
		AssembliesType1 oldAssemblies = assemblies;
		assemblies = newAssemblies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ASSEMBLIES, oldAssemblies, newAssemblies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblies(AssembliesType1 newAssemblies) {
		if (newAssemblies != assemblies) {
			NotificationChain msgs = null;
			if (assemblies != null)
				msgs = ((InternalEObject)assemblies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ASSEMBLIES, null, msgs);
			if (newAssemblies != null)
				msgs = ((InternalEObject)newAssemblies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__ASSEMBLIES, null, msgs);
			msgs = basicSetAssemblies(newAssemblies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__ASSEMBLIES, newAssemblies, newAssemblies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasePermissionsType getDatabasePermissions() {
		return databasePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabasePermissions(DatabasePermissionsType newDatabasePermissions, NotificationChain msgs) {
		DatabasePermissionsType oldDatabasePermissions = databasePermissions;
		databasePermissions = newDatabasePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATABASE_PERMISSIONS, oldDatabasePermissions, newDatabasePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePermissions(DatabasePermissionsType newDatabasePermissions) {
		if (newDatabasePermissions != databasePermissions) {
			NotificationChain msgs = null;
			if (databasePermissions != null)
				msgs = ((InternalEObject)databasePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATABASE_PERMISSIONS, null, msgs);
			if (newDatabasePermissions != null)
				msgs = ((InternalEObject)newDatabasePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__DATABASE_PERMISSIONS, null, msgs);
			msgs = basicSetDatabasePermissions(newDatabasePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DATABASE_PERMISSIONS, newDatabasePermissions, newDatabasePermissions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATABASE__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageEngineUsedType getStorageEngineUsed() {
		return storageEngineUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageEngineUsed(StorageEngineUsedType newStorageEngineUsed) {
		StorageEngineUsedType oldStorageEngineUsed = storageEngineUsed;
		storageEngineUsed = newStorageEngineUsed == null ? STORAGE_ENGINE_USED_EDEFAULT : newStorageEngineUsed;
		boolean oldStorageEngineUsedESet = storageEngineUsedESet;
		storageEngineUsedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__STORAGE_ENGINE_USED, oldStorageEngineUsed, storageEngineUsed, !oldStorageEngineUsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStorageEngineUsed() {
		StorageEngineUsedType oldStorageEngineUsed = storageEngineUsed;
		boolean oldStorageEngineUsedESet = storageEngineUsedESet;
		storageEngineUsed = STORAGE_ENGINE_USED_EDEFAULT;
		storageEngineUsedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE__STORAGE_ENGINE_USED, oldStorageEngineUsed, STORAGE_ENGINE_USED_EDEFAULT, oldStorageEngineUsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStorageEngineUsed() {
		return storageEngineUsedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__IMAGE_URL, oldImageUrl, imageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUniqueID() {
		return imageUniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUniqueID(String newImageUniqueID) {
		String oldImageUniqueID = imageUniqueID;
		imageUniqueID = newImageUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__IMAGE_UNIQUE_ID, oldImageUniqueID, imageUniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageVersion() {
		return imageVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageVersion(String newImageVersion) {
		String oldImageVersion = imageVersion;
		imageVersion = newImageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__IMAGE_VERSION, oldImageVersion, imageVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCompatibilityLevel() {
		return compatibilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompatibilityLevel(BigInteger newCompatibilityLevel) {
		BigInteger oldCompatibilityLevel = compatibilityLevel;
		compatibilityLevel = newCompatibilityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__COMPATIBILITY_LEVEL, oldCompatibilityLevel, compatibilityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryModeType getDirectQueryMode() {
		return directQueryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectQueryMode(DirectQueryModeType newDirectQueryMode) {
		DirectQueryModeType oldDirectQueryMode = directQueryMode;
		directQueryMode = newDirectQueryMode == null ? DIRECT_QUERY_MODE_EDEFAULT : newDirectQueryMode;
		boolean oldDirectQueryModeESet = directQueryModeESet;
		directQueryModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATABASE__DIRECT_QUERY_MODE, oldDirectQueryMode, directQueryMode, !oldDirectQueryModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectQueryMode() {
		DirectQueryModeType oldDirectQueryMode = directQueryMode;
		boolean oldDirectQueryModeESet = directQueryModeESet;
		directQueryMode = DIRECT_QUERY_MODE_EDEFAULT;
		directQueryModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATABASE__DIRECT_QUERY_MODE, oldDirectQueryMode, DIRECT_QUERY_MODE_EDEFAULT, oldDirectQueryModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectQueryMode() {
		return directQueryModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATABASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO:
				return basicSetDataSourceImpersonationInfo(null, msgs);
			case XmlaPackage.DATABASE__ACCOUNTS:
				return basicSetAccounts(null, msgs);
			case XmlaPackage.DATABASE__DATA_SOURCES:
				return basicSetDataSources(null, msgs);
			case XmlaPackage.DATABASE__DATA_SOURCE_VIEWS:
				return basicSetDataSourceViews(null, msgs);
			case XmlaPackage.DATABASE__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case XmlaPackage.DATABASE__CUBES:
				return basicSetCubes(null, msgs);
			case XmlaPackage.DATABASE__MINING_STRUCTURES:
				return basicSetMiningStructures(null, msgs);
			case XmlaPackage.DATABASE__ROLES:
				return basicSetRoles(null, msgs);
			case XmlaPackage.DATABASE__ASSEMBLIES:
				return basicSetAssemblies(null, msgs);
			case XmlaPackage.DATABASE__DATABASE_PERMISSIONS:
				return basicSetDatabasePermissions(null, msgs);
			case XmlaPackage.DATABASE__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
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
			case XmlaPackage.DATABASE__NAME:
				return getName();
			case XmlaPackage.DATABASE__ID:
				return getID();
			case XmlaPackage.DATABASE__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.DATABASE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.DATABASE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.DATABASE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.DATABASE__LAST_UPDATE:
				return getLastUpdate();
			case XmlaPackage.DATABASE__STATE:
				return getState();
			case XmlaPackage.DATABASE__READ_WRITE_MODE:
				return getReadWriteMode();
			case XmlaPackage.DATABASE__DB_STORAGE_LOCATION:
				return getDbStorageLocation();
			case XmlaPackage.DATABASE__AGGREGATION_PREFIX:
				return getAggregationPrefix();
			case XmlaPackage.DATABASE__PROCESSING_PRIORITY:
				return getProcessingPriority();
			case XmlaPackage.DATABASE__ESTIMATED_SIZE:
				return getEstimatedSize();
			case XmlaPackage.DATABASE__LAST_PROCESSED:
				return getLastProcessed();
			case XmlaPackage.DATABASE__LANGUAGE:
				return getLanguage();
			case XmlaPackage.DATABASE__COLLATION:
				return getCollation();
			case XmlaPackage.DATABASE__VISIBLE:
				return isVisible();
			case XmlaPackage.DATABASE__MASTER_DATA_SOURCE_ID:
				return getMasterDataSourceID();
			case XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO:
				return getDataSourceImpersonationInfo();
			case XmlaPackage.DATABASE__ACCOUNTS:
				return getAccounts();
			case XmlaPackage.DATABASE__DATA_SOURCES:
				return getDataSources();
			case XmlaPackage.DATABASE__DATA_SOURCE_VIEWS:
				return getDataSourceViews();
			case XmlaPackage.DATABASE__DIMENSIONS:
				return getDimensions();
			case XmlaPackage.DATABASE__CUBES:
				return getCubes();
			case XmlaPackage.DATABASE__MINING_STRUCTURES:
				return getMiningStructures();
			case XmlaPackage.DATABASE__ROLES:
				return getRoles();
			case XmlaPackage.DATABASE__ASSEMBLIES:
				return getAssemblies();
			case XmlaPackage.DATABASE__DATABASE_PERMISSIONS:
				return getDatabasePermissions();
			case XmlaPackage.DATABASE__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.DATABASE__STORAGE_ENGINE_USED:
				return getStorageEngineUsed();
			case XmlaPackage.DATABASE__IMAGE_PATH:
				return getImagePath();
			case XmlaPackage.DATABASE__IMAGE_URL:
				return getImageUrl();
			case XmlaPackage.DATABASE__IMAGE_UNIQUE_ID:
				return getImageUniqueID();
			case XmlaPackage.DATABASE__IMAGE_VERSION:
				return getImageVersion();
			case XmlaPackage.DATABASE__TOKEN:
				return getToken();
			case XmlaPackage.DATABASE__COMPATIBILITY_LEVEL:
				return getCompatibilityLevel();
			case XmlaPackage.DATABASE__DIRECT_QUERY_MODE:
				return getDirectQueryMode();
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
			case XmlaPackage.DATABASE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.DATABASE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.DATABASE__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DATABASE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DATABASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.DATABASE__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.DATABASE__LAST_UPDATE:
				setLastUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DATABASE__STATE:
				setState((StateType)newValue);
				return;
			case XmlaPackage.DATABASE__READ_WRITE_MODE:
				setReadWriteMode((ReadWriteModeType)newValue);
				return;
			case XmlaPackage.DATABASE__DB_STORAGE_LOCATION:
				setDbStorageLocation((String)newValue);
				return;
			case XmlaPackage.DATABASE__AGGREGATION_PREFIX:
				setAggregationPrefix((String)newValue);
				return;
			case XmlaPackage.DATABASE__PROCESSING_PRIORITY:
				setProcessingPriority((BigInteger)newValue);
				return;
			case XmlaPackage.DATABASE__ESTIMATED_SIZE:
				setEstimatedSize((Long)newValue);
				return;
			case XmlaPackage.DATABASE__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DATABASE__LANGUAGE:
				setLanguage((BigInteger)newValue);
				return;
			case XmlaPackage.DATABASE__COLLATION:
				setCollation((String)newValue);
				return;
			case XmlaPackage.DATABASE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case XmlaPackage.DATABASE__MASTER_DATA_SOURCE_ID:
				setMasterDataSourceID((String)newValue);
				return;
			case XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO:
				setDataSourceImpersonationInfo((ImpersonationInfo)newValue);
				return;
			case XmlaPackage.DATABASE__ACCOUNTS:
				setAccounts((AccountsType)newValue);
				return;
			case XmlaPackage.DATABASE__DATA_SOURCES:
				setDataSources((DataSourcesType)newValue);
				return;
			case XmlaPackage.DATABASE__DATA_SOURCE_VIEWS:
				setDataSourceViews((DataSourceViewsType)newValue);
				return;
			case XmlaPackage.DATABASE__DIMENSIONS:
				setDimensions((DimensionsType)newValue);
				return;
			case XmlaPackage.DATABASE__CUBES:
				setCubes((CubesType)newValue);
				return;
			case XmlaPackage.DATABASE__MINING_STRUCTURES:
				setMiningStructures((MiningStructuresType)newValue);
				return;
			case XmlaPackage.DATABASE__ROLES:
				setRoles((RolesType1)newValue);
				return;
			case XmlaPackage.DATABASE__ASSEMBLIES:
				setAssemblies((AssembliesType1)newValue);
				return;
			case XmlaPackage.DATABASE__DATABASE_PERMISSIONS:
				setDatabasePermissions((DatabasePermissionsType)newValue);
				return;
			case XmlaPackage.DATABASE__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.DATABASE__STORAGE_ENGINE_USED:
				setStorageEngineUsed((StorageEngineUsedType)newValue);
				return;
			case XmlaPackage.DATABASE__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case XmlaPackage.DATABASE__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case XmlaPackage.DATABASE__IMAGE_UNIQUE_ID:
				setImageUniqueID((String)newValue);
				return;
			case XmlaPackage.DATABASE__IMAGE_VERSION:
				setImageVersion((String)newValue);
				return;
			case XmlaPackage.DATABASE__TOKEN:
				setToken((String)newValue);
				return;
			case XmlaPackage.DATABASE__COMPATIBILITY_LEVEL:
				setCompatibilityLevel((BigInteger)newValue);
				return;
			case XmlaPackage.DATABASE__DIRECT_QUERY_MODE:
				setDirectQueryMode((DirectQueryModeType)newValue);
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
			case XmlaPackage.DATABASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.DATABASE__LAST_UPDATE:
				setLastUpdate(LAST_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__STATE:
				unsetState();
				return;
			case XmlaPackage.DATABASE__READ_WRITE_MODE:
				unsetReadWriteMode();
				return;
			case XmlaPackage.DATABASE__DB_STORAGE_LOCATION:
				setDbStorageLocation(DB_STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__AGGREGATION_PREFIX:
				setAggregationPrefix(AGGREGATION_PREFIX_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__PROCESSING_PRIORITY:
				setProcessingPriority(PROCESSING_PRIORITY_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__ESTIMATED_SIZE:
				unsetEstimatedSize();
				return;
			case XmlaPackage.DATABASE__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__VISIBLE:
				unsetVisible();
				return;
			case XmlaPackage.DATABASE__MASTER_DATA_SOURCE_ID:
				setMasterDataSourceID(MASTER_DATA_SOURCE_ID_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO:
				setDataSourceImpersonationInfo((ImpersonationInfo)null);
				return;
			case XmlaPackage.DATABASE__ACCOUNTS:
				setAccounts((AccountsType)null);
				return;
			case XmlaPackage.DATABASE__DATA_SOURCES:
				setDataSources((DataSourcesType)null);
				return;
			case XmlaPackage.DATABASE__DATA_SOURCE_VIEWS:
				setDataSourceViews((DataSourceViewsType)null);
				return;
			case XmlaPackage.DATABASE__DIMENSIONS:
				setDimensions((DimensionsType)null);
				return;
			case XmlaPackage.DATABASE__CUBES:
				setCubes((CubesType)null);
				return;
			case XmlaPackage.DATABASE__MINING_STRUCTURES:
				setMiningStructures((MiningStructuresType)null);
				return;
			case XmlaPackage.DATABASE__ROLES:
				setRoles((RolesType1)null);
				return;
			case XmlaPackage.DATABASE__ASSEMBLIES:
				setAssemblies((AssembliesType1)null);
				return;
			case XmlaPackage.DATABASE__DATABASE_PERMISSIONS:
				setDatabasePermissions((DatabasePermissionsType)null);
				return;
			case XmlaPackage.DATABASE__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.DATABASE__STORAGE_ENGINE_USED:
				unsetStorageEngineUsed();
				return;
			case XmlaPackage.DATABASE__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__IMAGE_UNIQUE_ID:
				setImageUniqueID(IMAGE_UNIQUE_ID_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__IMAGE_VERSION:
				setImageVersion(IMAGE_VERSION_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__COMPATIBILITY_LEVEL:
				setCompatibilityLevel(COMPATIBILITY_LEVEL_EDEFAULT);
				return;
			case XmlaPackage.DATABASE__DIRECT_QUERY_MODE:
				unsetDirectQueryMode();
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
			case XmlaPackage.DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.DATABASE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.DATABASE__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.DATABASE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.DATABASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.DATABASE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.DATABASE__LAST_UPDATE:
				return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
			case XmlaPackage.DATABASE__STATE:
				return isSetState();
			case XmlaPackage.DATABASE__READ_WRITE_MODE:
				return isSetReadWriteMode();
			case XmlaPackage.DATABASE__DB_STORAGE_LOCATION:
				return DB_STORAGE_LOCATION_EDEFAULT == null ? dbStorageLocation != null : !DB_STORAGE_LOCATION_EDEFAULT.equals(dbStorageLocation);
			case XmlaPackage.DATABASE__AGGREGATION_PREFIX:
				return AGGREGATION_PREFIX_EDEFAULT == null ? aggregationPrefix != null : !AGGREGATION_PREFIX_EDEFAULT.equals(aggregationPrefix);
			case XmlaPackage.DATABASE__PROCESSING_PRIORITY:
				return PROCESSING_PRIORITY_EDEFAULT == null ? processingPriority != null : !PROCESSING_PRIORITY_EDEFAULT.equals(processingPriority);
			case XmlaPackage.DATABASE__ESTIMATED_SIZE:
				return isSetEstimatedSize();
			case XmlaPackage.DATABASE__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
			case XmlaPackage.DATABASE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case XmlaPackage.DATABASE__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case XmlaPackage.DATABASE__VISIBLE:
				return isSetVisible();
			case XmlaPackage.DATABASE__MASTER_DATA_SOURCE_ID:
				return MASTER_DATA_SOURCE_ID_EDEFAULT == null ? masterDataSourceID != null : !MASTER_DATA_SOURCE_ID_EDEFAULT.equals(masterDataSourceID);
			case XmlaPackage.DATABASE__DATA_SOURCE_IMPERSONATION_INFO:
				return dataSourceImpersonationInfo != null;
			case XmlaPackage.DATABASE__ACCOUNTS:
				return accounts != null;
			case XmlaPackage.DATABASE__DATA_SOURCES:
				return dataSources != null;
			case XmlaPackage.DATABASE__DATA_SOURCE_VIEWS:
				return dataSourceViews != null;
			case XmlaPackage.DATABASE__DIMENSIONS:
				return dimensions != null;
			case XmlaPackage.DATABASE__CUBES:
				return cubes != null;
			case XmlaPackage.DATABASE__MINING_STRUCTURES:
				return miningStructures != null;
			case XmlaPackage.DATABASE__ROLES:
				return roles != null;
			case XmlaPackage.DATABASE__ASSEMBLIES:
				return assemblies != null;
			case XmlaPackage.DATABASE__DATABASE_PERMISSIONS:
				return databasePermissions != null;
			case XmlaPackage.DATABASE__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.DATABASE__STORAGE_ENGINE_USED:
				return isSetStorageEngineUsed();
			case XmlaPackage.DATABASE__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case XmlaPackage.DATABASE__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case XmlaPackage.DATABASE__IMAGE_UNIQUE_ID:
				return IMAGE_UNIQUE_ID_EDEFAULT == null ? imageUniqueID != null : !IMAGE_UNIQUE_ID_EDEFAULT.equals(imageUniqueID);
			case XmlaPackage.DATABASE__IMAGE_VERSION:
				return IMAGE_VERSION_EDEFAULT == null ? imageVersion != null : !IMAGE_VERSION_EDEFAULT.equals(imageVersion);
			case XmlaPackage.DATABASE__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case XmlaPackage.DATABASE__COMPATIBILITY_LEVEL:
				return COMPATIBILITY_LEVEL_EDEFAULT == null ? compatibilityLevel != null : !COMPATIBILITY_LEVEL_EDEFAULT.equals(compatibilityLevel);
			case XmlaPackage.DATABASE__DIRECT_QUERY_MODE:
				return isSetDirectQueryMode();
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
		result.append(", lastUpdate: ");
		result.append(lastUpdate);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", readWriteMode: ");
		if (readWriteModeESet) result.append(readWriteMode); else result.append("<unset>");
		result.append(", dbStorageLocation: ");
		result.append(dbStorageLocation);
		result.append(", aggregationPrefix: ");
		result.append(aggregationPrefix);
		result.append(", processingPriority: ");
		result.append(processingPriority);
		result.append(", estimatedSize: ");
		if (estimatedSizeESet) result.append(estimatedSize); else result.append("<unset>");
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(", language: ");
		result.append(language);
		result.append(", collation: ");
		result.append(collation);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", masterDataSourceID: ");
		result.append(masterDataSourceID);
		result.append(", storageEngineUsed: ");
		if (storageEngineUsedESet) result.append(storageEngineUsed); else result.append("<unset>");
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", imageUniqueID: ");
		result.append(imageUniqueID);
		result.append(", imageVersion: ");
		result.append(imageVersion);
		result.append(", token: ");
		result.append(token);
		result.append(", compatibilityLevel: ");
		result.append(compatibilityLevel);
		result.append(", directQueryMode: ");
		if (directQueryModeESet) result.append(directQueryMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
