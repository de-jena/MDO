/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getServerID <em>Server ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getRoleID <em>Role ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getTraceID <em>Trace ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getAssemblyID <em>Assembly ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDimensionPermissionID <em>Dimension Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDataSourcePermissionID <em>Data Source Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDatabasePermissionID <em>Database Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getDataSourceViewID <em>Data Source View ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getCubeID <em>Cube ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getMiningStructureID <em>Mining Structure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getPerspectiveID <em>Perspective ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getCubePermissionID <em>Cube Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getMdxScriptID <em>Mdx Script ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getPartitionID <em>Partition ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getAggregationDesignID <em>Aggregation Design ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getMiningModelID <em>Mining Model ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getMiningModelPermissionID <em>Mining Model Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ObjectReferenceImpl#getMiningStructurePermissionID <em>Mining Structure Permission ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectReferenceImpl extends MinimalEObjectImpl.Container implements ObjectReference {
	/**
	 * The default value of the '{@link #getServerID() <em>Server ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerID() <em>Server ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerID()
	 * @generated
	 * @ordered
	 */
	protected String serverID = SERVER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected String databaseID = DATABASE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleID() <em>Role ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleID() <em>Role ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleID()
	 * @generated
	 * @ordered
	 */
	protected String roleID = ROLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceID() <em>Trace ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceID() <em>Trace ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceID()
	 * @generated
	 * @ordered
	 */
	protected String traceID = TRACE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssemblyID() <em>Assembly ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyID()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSEMBLY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssemblyID() <em>Assembly ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyID()
	 * @generated
	 * @ordered
	 */
	protected String assemblyID = ASSEMBLY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String dimensionID = DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensionPermissionID() <em>Dimension Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionPermissionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionPermissionID() <em>Dimension Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionPermissionID()
	 * @generated
	 * @ordered
	 */
	protected String dimensionPermissionID = DIMENSION_PERMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceID() <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceID() <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceID = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourcePermissionID() <em>Data Source Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourcePermissionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourcePermissionID() <em>Data Source Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourcePermissionID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourcePermissionID = DATA_SOURCE_PERMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabasePermissionID() <em>Database Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePermissionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePermissionID() <em>Database Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePermissionID()
	 * @generated
	 * @ordered
	 */
	protected String databasePermissionID = DATABASE_PERMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceViewID() <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViewID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_VIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceViewID() <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViewID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceViewID = DATA_SOURCE_VIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCubeID() <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeID() <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeID()
	 * @generated
	 * @ordered
	 */
	protected String cubeID = CUBE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningStructureID() <em>Mining Structure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructureID()
	 * @generated
	 * @ordered
	 */
	protected static final String MINING_STRUCTURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiningStructureID() <em>Mining Structure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructureID()
	 * @generated
	 * @ordered
	 */
	protected String miningStructureID = MINING_STRUCTURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected String measureGroupID = MEASURE_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerspectiveID() <em>Perspective ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveID()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerspectiveID() <em>Perspective ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveID()
	 * @generated
	 * @ordered
	 */
	protected String perspectiveID = PERSPECTIVE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCubePermissionID() <em>Cube Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubePermissionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubePermissionID() <em>Cube Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubePermissionID()
	 * @generated
	 * @ordered
	 */
	protected String cubePermissionID = CUBE_PERMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdxScriptID() <em>Mdx Script ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxScriptID()
	 * @generated
	 * @ordered
	 */
	protected static final String MDX_SCRIPT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdxScriptID() <em>Mdx Script ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxScriptID()
	 * @generated
	 * @ordered
	 */
	protected String mdxScriptID = MDX_SCRIPT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionID() <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionID() <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionID()
	 * @generated
	 * @ordered
	 */
	protected String partitionID = PARTITION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getMiningModelPermissionID() <em>Mining Model Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelPermissionID()
	 * @generated
	 * @ordered
	 */
	protected static final String MINING_MODEL_PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiningModelPermissionID() <em>Mining Model Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelPermissionID()
	 * @generated
	 * @ordered
	 */
	protected String miningModelPermissionID = MINING_MODEL_PERMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningStructurePermissionID() <em>Mining Structure Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructurePermissionID()
	 * @generated
	 * @ordered
	 */
	protected static final String MINING_STRUCTURE_PERMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiningStructurePermissionID() <em>Mining Structure Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructurePermissionID()
	 * @generated
	 * @ordered
	 */
	protected String miningStructurePermissionID = MINING_STRUCTURE_PERMISSION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.OBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerID() {
		return serverID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerID(String newServerID) {
		String oldServerID = serverID;
		serverID = newServerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__SERVER_ID, oldServerID, serverID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseID() {
		return databaseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseID(String newDatabaseID) {
		String oldDatabaseID = databaseID;
		databaseID = newDatabaseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DATABASE_ID, oldDatabaseID, databaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleID() {
		return roleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleID(String newRoleID) {
		String oldRoleID = roleID;
		roleID = newRoleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__ROLE_ID, oldRoleID, roleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceID() {
		return traceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceID(String newTraceID) {
		String oldTraceID = traceID;
		traceID = newTraceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__TRACE_ID, oldTraceID, traceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssemblyID() {
		return assemblyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyID(String newAssemblyID) {
		String oldAssemblyID = assemblyID;
		assemblyID = newAssemblyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__ASSEMBLY_ID, oldAssemblyID, assemblyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionID() {
		return dimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionID(String newDimensionID) {
		String oldDimensionID = dimensionID;
		dimensionID = newDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DIMENSION_ID, oldDimensionID, dimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionPermissionID() {
		return dimensionPermissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionPermissionID(String newDimensionPermissionID) {
		String oldDimensionPermissionID = dimensionPermissionID;
		dimensionPermissionID = newDimensionPermissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DIMENSION_PERMISSION_ID, oldDimensionPermissionID, dimensionPermissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceID() {
		return dataSourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceID(String newDataSourceID) {
		String oldDataSourceID = dataSourceID;
		dataSourceID = newDataSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_ID, oldDataSourceID, dataSourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourcePermissionID() {
		return dataSourcePermissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourcePermissionID(String newDataSourcePermissionID) {
		String oldDataSourcePermissionID = dataSourcePermissionID;
		dataSourcePermissionID = newDataSourcePermissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_PERMISSION_ID, oldDataSourcePermissionID, dataSourcePermissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePermissionID() {
		return databasePermissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePermissionID(String newDatabasePermissionID) {
		String oldDatabasePermissionID = databasePermissionID;
		databasePermissionID = newDatabasePermissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DATABASE_PERMISSION_ID, oldDatabasePermissionID, databasePermissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceViewID() {
		return dataSourceViewID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceViewID(String newDataSourceViewID) {
		String oldDataSourceViewID = dataSourceViewID;
		dataSourceViewID = newDataSourceViewID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_VIEW_ID, oldDataSourceViewID, dataSourceViewID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeID() {
		return cubeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeID(String newCubeID) {
		String oldCubeID = cubeID;
		cubeID = newCubeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__CUBE_ID, oldCubeID, cubeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiningStructureID() {
		return miningStructureID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningStructureID(String newMiningStructureID) {
		String oldMiningStructureID = miningStructureID;
		miningStructureID = newMiningStructureID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_ID, oldMiningStructureID, miningStructureID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureGroupID() {
		return measureGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroupID(String newMeasureGroupID) {
		String oldMeasureGroupID = measureGroupID;
		measureGroupID = newMeasureGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__MEASURE_GROUP_ID, oldMeasureGroupID, measureGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspectiveID() {
		return perspectiveID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectiveID(String newPerspectiveID) {
		String oldPerspectiveID = perspectiveID;
		perspectiveID = newPerspectiveID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__PERSPECTIVE_ID, oldPerspectiveID, perspectiveID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubePermissionID() {
		return cubePermissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubePermissionID(String newCubePermissionID) {
		String oldCubePermissionID = cubePermissionID;
		cubePermissionID = newCubePermissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__CUBE_PERMISSION_ID, oldCubePermissionID, cubePermissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdxScriptID() {
		return mdxScriptID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdxScriptID(String newMdxScriptID) {
		String oldMdxScriptID = mdxScriptID;
		mdxScriptID = newMdxScriptID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__MDX_SCRIPT_ID, oldMdxScriptID, mdxScriptID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitionID() {
		return partitionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionID(String newPartitionID) {
		String oldPartitionID = partitionID;
		partitionID = newPartitionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__PARTITION_ID, oldPartitionID, partitionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__AGGREGATION_DESIGN_ID, oldAggregationDesignID, aggregationDesignID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_ID, oldMiningModelID, miningModelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiningModelPermissionID() {
		return miningModelPermissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModelPermissionID(String newMiningModelPermissionID) {
		String oldMiningModelPermissionID = miningModelPermissionID;
		miningModelPermissionID = newMiningModelPermissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_PERMISSION_ID, oldMiningModelPermissionID, miningModelPermissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiningStructurePermissionID() {
		return miningStructurePermissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningStructurePermissionID(String newMiningStructurePermissionID) {
		String oldMiningStructurePermissionID = miningStructurePermissionID;
		miningStructurePermissionID = newMiningStructurePermissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_PERMISSION_ID, oldMiningStructurePermissionID, miningStructurePermissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.OBJECT_REFERENCE__SERVER_ID:
				return getServerID();
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_ID:
				return getDatabaseID();
			case XmlaPackage.OBJECT_REFERENCE__ROLE_ID:
				return getRoleID();
			case XmlaPackage.OBJECT_REFERENCE__TRACE_ID:
				return getTraceID();
			case XmlaPackage.OBJECT_REFERENCE__ASSEMBLY_ID:
				return getAssemblyID();
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_ID:
				return getDimensionID();
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_PERMISSION_ID:
				return getDimensionPermissionID();
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_ID:
				return getDataSourceID();
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_PERMISSION_ID:
				return getDataSourcePermissionID();
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_PERMISSION_ID:
				return getDatabasePermissionID();
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_VIEW_ID:
				return getDataSourceViewID();
			case XmlaPackage.OBJECT_REFERENCE__CUBE_ID:
				return getCubeID();
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_ID:
				return getMiningStructureID();
			case XmlaPackage.OBJECT_REFERENCE__MEASURE_GROUP_ID:
				return getMeasureGroupID();
			case XmlaPackage.OBJECT_REFERENCE__PERSPECTIVE_ID:
				return getPerspectiveID();
			case XmlaPackage.OBJECT_REFERENCE__CUBE_PERMISSION_ID:
				return getCubePermissionID();
			case XmlaPackage.OBJECT_REFERENCE__MDX_SCRIPT_ID:
				return getMdxScriptID();
			case XmlaPackage.OBJECT_REFERENCE__PARTITION_ID:
				return getPartitionID();
			case XmlaPackage.OBJECT_REFERENCE__AGGREGATION_DESIGN_ID:
				return getAggregationDesignID();
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_ID:
				return getMiningModelID();
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_PERMISSION_ID:
				return getMiningModelPermissionID();
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_PERMISSION_ID:
				return getMiningStructurePermissionID();
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
			case XmlaPackage.OBJECT_REFERENCE__SERVER_ID:
				setServerID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_ID:
				setDatabaseID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__ROLE_ID:
				setRoleID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__TRACE_ID:
				setTraceID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__ASSEMBLY_ID:
				setAssemblyID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_ID:
				setDimensionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_PERMISSION_ID:
				setDimensionPermissionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_ID:
				setDataSourceID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_PERMISSION_ID:
				setDataSourcePermissionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_PERMISSION_ID:
				setDatabasePermissionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_VIEW_ID:
				setDataSourceViewID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__CUBE_ID:
				setCubeID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_ID:
				setMiningStructureID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MEASURE_GROUP_ID:
				setMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__PERSPECTIVE_ID:
				setPerspectiveID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__CUBE_PERMISSION_ID:
				setCubePermissionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MDX_SCRIPT_ID:
				setMdxScriptID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__PARTITION_ID:
				setPartitionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__AGGREGATION_DESIGN_ID:
				setAggregationDesignID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_ID:
				setMiningModelID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_PERMISSION_ID:
				setMiningModelPermissionID((String)newValue);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_PERMISSION_ID:
				setMiningStructurePermissionID((String)newValue);
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
			case XmlaPackage.OBJECT_REFERENCE__SERVER_ID:
				setServerID(SERVER_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_ID:
				setDatabaseID(DATABASE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__ROLE_ID:
				setRoleID(ROLE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__TRACE_ID:
				setTraceID(TRACE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__ASSEMBLY_ID:
				setAssemblyID(ASSEMBLY_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_ID:
				setDimensionID(DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_PERMISSION_ID:
				setDimensionPermissionID(DIMENSION_PERMISSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_ID:
				setDataSourceID(DATA_SOURCE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_PERMISSION_ID:
				setDataSourcePermissionID(DATA_SOURCE_PERMISSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_PERMISSION_ID:
				setDatabasePermissionID(DATABASE_PERMISSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_VIEW_ID:
				setDataSourceViewID(DATA_SOURCE_VIEW_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__CUBE_ID:
				setCubeID(CUBE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_ID:
				setMiningStructureID(MINING_STRUCTURE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MEASURE_GROUP_ID:
				setMeasureGroupID(MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__PERSPECTIVE_ID:
				setPerspectiveID(PERSPECTIVE_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__CUBE_PERMISSION_ID:
				setCubePermissionID(CUBE_PERMISSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MDX_SCRIPT_ID:
				setMdxScriptID(MDX_SCRIPT_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__PARTITION_ID:
				setPartitionID(PARTITION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__AGGREGATION_DESIGN_ID:
				setAggregationDesignID(AGGREGATION_DESIGN_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_ID:
				setMiningModelID(MINING_MODEL_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_PERMISSION_ID:
				setMiningModelPermissionID(MINING_MODEL_PERMISSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_PERMISSION_ID:
				setMiningStructurePermissionID(MINING_STRUCTURE_PERMISSION_ID_EDEFAULT);
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
			case XmlaPackage.OBJECT_REFERENCE__SERVER_ID:
				return SERVER_ID_EDEFAULT == null ? serverID != null : !SERVER_ID_EDEFAULT.equals(serverID);
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_ID:
				return DATABASE_ID_EDEFAULT == null ? databaseID != null : !DATABASE_ID_EDEFAULT.equals(databaseID);
			case XmlaPackage.OBJECT_REFERENCE__ROLE_ID:
				return ROLE_ID_EDEFAULT == null ? roleID != null : !ROLE_ID_EDEFAULT.equals(roleID);
			case XmlaPackage.OBJECT_REFERENCE__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? traceID != null : !TRACE_ID_EDEFAULT.equals(traceID);
			case XmlaPackage.OBJECT_REFERENCE__ASSEMBLY_ID:
				return ASSEMBLY_ID_EDEFAULT == null ? assemblyID != null : !ASSEMBLY_ID_EDEFAULT.equals(assemblyID);
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_ID:
				return DIMENSION_ID_EDEFAULT == null ? dimensionID != null : !DIMENSION_ID_EDEFAULT.equals(dimensionID);
			case XmlaPackage.OBJECT_REFERENCE__DIMENSION_PERMISSION_ID:
				return DIMENSION_PERMISSION_ID_EDEFAULT == null ? dimensionPermissionID != null : !DIMENSION_PERMISSION_ID_EDEFAULT.equals(dimensionPermissionID);
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceID != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceID);
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_PERMISSION_ID:
				return DATA_SOURCE_PERMISSION_ID_EDEFAULT == null ? dataSourcePermissionID != null : !DATA_SOURCE_PERMISSION_ID_EDEFAULT.equals(dataSourcePermissionID);
			case XmlaPackage.OBJECT_REFERENCE__DATABASE_PERMISSION_ID:
				return DATABASE_PERMISSION_ID_EDEFAULT == null ? databasePermissionID != null : !DATABASE_PERMISSION_ID_EDEFAULT.equals(databasePermissionID);
			case XmlaPackage.OBJECT_REFERENCE__DATA_SOURCE_VIEW_ID:
				return DATA_SOURCE_VIEW_ID_EDEFAULT == null ? dataSourceViewID != null : !DATA_SOURCE_VIEW_ID_EDEFAULT.equals(dataSourceViewID);
			case XmlaPackage.OBJECT_REFERENCE__CUBE_ID:
				return CUBE_ID_EDEFAULT == null ? cubeID != null : !CUBE_ID_EDEFAULT.equals(cubeID);
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_ID:
				return MINING_STRUCTURE_ID_EDEFAULT == null ? miningStructureID != null : !MINING_STRUCTURE_ID_EDEFAULT.equals(miningStructureID);
			case XmlaPackage.OBJECT_REFERENCE__MEASURE_GROUP_ID:
				return MEASURE_GROUP_ID_EDEFAULT == null ? measureGroupID != null : !MEASURE_GROUP_ID_EDEFAULT.equals(measureGroupID);
			case XmlaPackage.OBJECT_REFERENCE__PERSPECTIVE_ID:
				return PERSPECTIVE_ID_EDEFAULT == null ? perspectiveID != null : !PERSPECTIVE_ID_EDEFAULT.equals(perspectiveID);
			case XmlaPackage.OBJECT_REFERENCE__CUBE_PERMISSION_ID:
				return CUBE_PERMISSION_ID_EDEFAULT == null ? cubePermissionID != null : !CUBE_PERMISSION_ID_EDEFAULT.equals(cubePermissionID);
			case XmlaPackage.OBJECT_REFERENCE__MDX_SCRIPT_ID:
				return MDX_SCRIPT_ID_EDEFAULT == null ? mdxScriptID != null : !MDX_SCRIPT_ID_EDEFAULT.equals(mdxScriptID);
			case XmlaPackage.OBJECT_REFERENCE__PARTITION_ID:
				return PARTITION_ID_EDEFAULT == null ? partitionID != null : !PARTITION_ID_EDEFAULT.equals(partitionID);
			case XmlaPackage.OBJECT_REFERENCE__AGGREGATION_DESIGN_ID:
				return AGGREGATION_DESIGN_ID_EDEFAULT == null ? aggregationDesignID != null : !AGGREGATION_DESIGN_ID_EDEFAULT.equals(aggregationDesignID);
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_ID:
				return MINING_MODEL_ID_EDEFAULT == null ? miningModelID != null : !MINING_MODEL_ID_EDEFAULT.equals(miningModelID);
			case XmlaPackage.OBJECT_REFERENCE__MINING_MODEL_PERMISSION_ID:
				return MINING_MODEL_PERMISSION_ID_EDEFAULT == null ? miningModelPermissionID != null : !MINING_MODEL_PERMISSION_ID_EDEFAULT.equals(miningModelPermissionID);
			case XmlaPackage.OBJECT_REFERENCE__MINING_STRUCTURE_PERMISSION_ID:
				return MINING_STRUCTURE_PERMISSION_ID_EDEFAULT == null ? miningStructurePermissionID != null : !MINING_STRUCTURE_PERMISSION_ID_EDEFAULT.equals(miningStructurePermissionID);
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
		result.append(" (serverID: ");
		result.append(serverID);
		result.append(", databaseID: ");
		result.append(databaseID);
		result.append(", roleID: ");
		result.append(roleID);
		result.append(", traceID: ");
		result.append(traceID);
		result.append(", assemblyID: ");
		result.append(assemblyID);
		result.append(", dimensionID: ");
		result.append(dimensionID);
		result.append(", dimensionPermissionID: ");
		result.append(dimensionPermissionID);
		result.append(", dataSourceID: ");
		result.append(dataSourceID);
		result.append(", dataSourcePermissionID: ");
		result.append(dataSourcePermissionID);
		result.append(", databasePermissionID: ");
		result.append(databasePermissionID);
		result.append(", dataSourceViewID: ");
		result.append(dataSourceViewID);
		result.append(", cubeID: ");
		result.append(cubeID);
		result.append(", miningStructureID: ");
		result.append(miningStructureID);
		result.append(", measureGroupID: ");
		result.append(measureGroupID);
		result.append(", perspectiveID: ");
		result.append(perspectiveID);
		result.append(", cubePermissionID: ");
		result.append(cubePermissionID);
		result.append(", mdxScriptID: ");
		result.append(mdxScriptID);
		result.append(", partitionID: ");
		result.append(partitionID);
		result.append(", aggregationDesignID: ");
		result.append(aggregationDesignID);
		result.append(", miningModelID: ");
		result.append(miningModelID);
		result.append(", miningModelPermissionID: ");
		result.append(miningModelPermissionID);
		result.append(", miningStructurePermissionID: ");
		result.append(miningStructurePermissionID);
		result.append(')');
		return result.toString();
	}

} //ObjectReferenceImpl
