/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getServerID <em>Server ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getRoleID <em>Role ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getTraceID <em>Trace ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getAssemblyID <em>Assembly ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDimensionPermissionID <em>Dimension Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDataSourcePermissionID <em>Data Source Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDatabasePermissionID <em>Database Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDataSourceViewID <em>Data Source View ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getCubeID <em>Cube ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningStructureID <em>Mining Structure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getPerspectiveID <em>Perspective ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getCubePermissionID <em>Cube Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMdxScriptID <em>Mdx Script ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getPartitionID <em>Partition ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getAggregationDesignID <em>Aggregation Design ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningModelID <em>Mining Model ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningModelPermissionID <em>Mining Model Permission ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningStructurePermissionID <em>Mining Structure Permission ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference()
 * @model extendedMetaData="name='ObjectReference' kind='elementOnly'"
 * @generated
 */
public interface ObjectReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Server ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server ID</em>' attribute.
	 * @see #setServerID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_ServerID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerID'"
	 * @generated
	 */
	String getServerID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getServerID <em>Server ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server ID</em>' attribute.
	 * @see #getServerID()
	 * @generated
	 */
	void setServerID(String value);

	/**
	 * Returns the value of the '<em><b>Database ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database ID</em>' attribute.
	 * @see #setDatabaseID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DatabaseID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	String getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDatabaseID <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' attribute.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(String value);

	/**
	 * Returns the value of the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role ID</em>' attribute.
	 * @see #setRoleID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_RoleID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='RoleID'"
	 * @generated
	 */
	String getRoleID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getRoleID <em>Role ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role ID</em>' attribute.
	 * @see #getRoleID()
	 * @generated
	 */
	void setRoleID(String value);

	/**
	 * Returns the value of the '<em><b>Trace ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace ID</em>' attribute.
	 * @see #setTraceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_TraceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TraceID'"
	 * @generated
	 */
	String getTraceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getTraceID <em>Trace ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace ID</em>' attribute.
	 * @see #getTraceID()
	 * @generated
	 */
	void setTraceID(String value);

	/**
	 * Returns the value of the '<em><b>Assembly ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly ID</em>' attribute.
	 * @see #setAssemblyID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_AssemblyID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssemblyID'"
	 * @generated
	 */
	String getAssemblyID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getAssemblyID <em>Assembly ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly ID</em>' attribute.
	 * @see #getAssemblyID()
	 * @generated
	 */
	void setAssemblyID(String value);

	/**
	 * Returns the value of the '<em><b>Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension ID</em>' attribute.
	 * @see #setDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DimensionID'"
	 * @generated
	 */
	String getDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDimensionID <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension ID</em>' attribute.
	 * @see #getDimensionID()
	 * @generated
	 */
	void setDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Dimension Permission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Permission ID</em>' attribute.
	 * @see #setDimensionPermissionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DimensionPermissionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DimensionPermissionID'"
	 * @generated
	 */
	String getDimensionPermissionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDimensionPermissionID <em>Dimension Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Permission ID</em>' attribute.
	 * @see #getDimensionPermissionID()
	 * @generated
	 */
	void setDimensionPermissionID(String value);

	/**
	 * Returns the value of the '<em><b>Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source ID</em>' attribute.
	 * @see #setDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSourceID'"
	 * @generated
	 */
	String getDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDataSourceID <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source ID</em>' attribute.
	 * @see #getDataSourceID()
	 * @generated
	 */
	void setDataSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Permission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Permission ID</em>' attribute.
	 * @see #setDataSourcePermissionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DataSourcePermissionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSourcePermissionID'"
	 * @generated
	 */
	String getDataSourcePermissionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDataSourcePermissionID <em>Data Source Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Permission ID</em>' attribute.
	 * @see #getDataSourcePermissionID()
	 * @generated
	 */
	void setDataSourcePermissionID(String value);

	/**
	 * Returns the value of the '<em><b>Database Permission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Permission ID</em>' attribute.
	 * @see #setDatabasePermissionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DatabasePermissionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DatabasePermissionID'"
	 * @generated
	 */
	String getDatabasePermissionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDatabasePermissionID <em>Database Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Permission ID</em>' attribute.
	 * @see #getDatabasePermissionID()
	 * @generated
	 */
	void setDatabasePermissionID(String value);

	/**
	 * Returns the value of the '<em><b>Data Source View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source View ID</em>' attribute.
	 * @see #setDataSourceViewID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_DataSourceViewID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSourceViewID'"
	 * @generated
	 */
	String getDataSourceViewID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getDataSourceViewID <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source View ID</em>' attribute.
	 * @see #getDataSourceViewID()
	 * @generated
	 */
	void setDataSourceViewID(String value);

	/**
	 * Returns the value of the '<em><b>Cube ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube ID</em>' attribute.
	 * @see #setCubeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_CubeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CubeID'"
	 * @generated
	 */
	String getCubeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getCubeID <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube ID</em>' attribute.
	 * @see #getCubeID()
	 * @generated
	 */
	void setCubeID(String value);

	/**
	 * Returns the value of the '<em><b>Mining Structure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structure ID</em>' attribute.
	 * @see #setMiningStructureID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_MiningStructureID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningStructureID'"
	 * @generated
	 */
	String getMiningStructureID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningStructureID <em>Mining Structure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Structure ID</em>' attribute.
	 * @see #getMiningStructureID()
	 * @generated
	 */
	void setMiningStructureID(String value);

	/**
	 * Returns the value of the '<em><b>Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group ID</em>' attribute.
	 * @see #setMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_MeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MeasureGroupID'"
	 * @generated
	 */
	String getMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMeasureGroupID <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group ID</em>' attribute.
	 * @see #getMeasureGroupID()
	 * @generated
	 */
	void setMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Perspective ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective ID</em>' attribute.
	 * @see #setPerspectiveID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_PerspectiveID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PerspectiveID'"
	 * @generated
	 */
	String getPerspectiveID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getPerspectiveID <em>Perspective ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective ID</em>' attribute.
	 * @see #getPerspectiveID()
	 * @generated
	 */
	void setPerspectiveID(String value);

	/**
	 * Returns the value of the '<em><b>Cube Permission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Permission ID</em>' attribute.
	 * @see #setCubePermissionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_CubePermissionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CubePermissionID'"
	 * @generated
	 */
	String getCubePermissionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getCubePermissionID <em>Cube Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Permission ID</em>' attribute.
	 * @see #getCubePermissionID()
	 * @generated
	 */
	void setCubePermissionID(String value);

	/**
	 * Returns the value of the '<em><b>Mdx Script ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdx Script ID</em>' attribute.
	 * @see #setMdxScriptID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_MdxScriptID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MdxScriptID'"
	 * @generated
	 */
	String getMdxScriptID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMdxScriptID <em>Mdx Script ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdx Script ID</em>' attribute.
	 * @see #getMdxScriptID()
	 * @generated
	 */
	void setMdxScriptID(String value);

	/**
	 * Returns the value of the '<em><b>Partition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition ID</em>' attribute.
	 * @see #setPartitionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_PartitionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PartitionID'"
	 * @generated
	 */
	String getPartitionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getPartitionID <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition ID</em>' attribute.
	 * @see #getPartitionID()
	 * @generated
	 */
	void setPartitionID(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Design ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Design ID</em>' attribute.
	 * @see #setAggregationDesignID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_AggregationDesignID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AggregationDesignID'"
	 * @generated
	 */
	String getAggregationDesignID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getAggregationDesignID <em>Aggregation Design ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Design ID</em>' attribute.
	 * @see #getAggregationDesignID()
	 * @generated
	 */
	void setAggregationDesignID(String value);

	/**
	 * Returns the value of the '<em><b>Mining Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model ID</em>' attribute.
	 * @see #setMiningModelID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_MiningModelID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningModelID'"
	 * @generated
	 */
	String getMiningModelID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningModelID <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model ID</em>' attribute.
	 * @see #getMiningModelID()
	 * @generated
	 */
	void setMiningModelID(String value);

	/**
	 * Returns the value of the '<em><b>Mining Model Permission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model Permission ID</em>' attribute.
	 * @see #setMiningModelPermissionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_MiningModelPermissionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningModelPermissionID'"
	 * @generated
	 */
	String getMiningModelPermissionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningModelPermissionID <em>Mining Model Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model Permission ID</em>' attribute.
	 * @see #getMiningModelPermissionID()
	 * @generated
	 */
	void setMiningModelPermissionID(String value);

	/**
	 * Returns the value of the '<em><b>Mining Structure Permission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structure Permission ID</em>' attribute.
	 * @see #setMiningStructurePermissionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectReference_MiningStructurePermissionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningStructurePermissionID'"
	 * @generated
	 */
	String getMiningStructurePermissionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference#getMiningStructurePermissionID <em>Mining Structure Permission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Structure Permission ID</em>' attribute.
	 * @see #getMiningStructurePermissionID()
	 * @generated
	 */
	void setMiningStructurePermissionID(String value);

} // ObjectReference
