/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Major Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getAggregationDesign <em>Aggregation Design</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDataSourceView <em>Data Source View</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMdxScript <em>Mdx Script</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMeasureGroup <em>Measure Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMiningStructure <em>Mining Structure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getServer <em>Server</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject()
 * @model extendedMetaData="name='MajorObject' kind='elementOnly'"
 * @generated
 */
public interface MajorObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Design</em>' containment reference.
	 * @see #setAggregationDesign(AggregationDesign)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_AggregationDesign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationDesign'"
	 * @generated
	 */
	AggregationDesign getAggregationDesign();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getAggregationDesign <em>Aggregation Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Design</em>' containment reference.
	 * @see #getAggregationDesign()
	 * @generated
	 */
	void setAggregationDesign(AggregationDesign value);

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' containment reference.
	 * @see #setAssembly(Assembly)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Assembly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assembly'"
	 * @generated
	 */
	Assembly getAssembly();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getAssembly <em>Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' containment reference.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(Assembly value);

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' containment reference.
	 * @see #setCube(Cube)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Cube()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cube'"
	 * @generated
	 */
	Cube getCube();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getCube <em>Cube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' containment reference.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(Cube value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Database()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Database'"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_DataSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSource'"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Data Source View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source View</em>' containment reference.
	 * @see #setDataSourceView(DataSourceView)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_DataSourceView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourceView'"
	 * @generated
	 */
	DataSourceView getDataSourceView();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDataSourceView <em>Data Source View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source View</em>' containment reference.
	 * @see #getDataSourceView()
	 * @generated
	 */
	void setDataSourceView(DataSourceView value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Dimension)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Dimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dimension'"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Mdx Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdx Script</em>' containment reference.
	 * @see #setMdxScript(MdxScript)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_MdxScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MdxScript'"
	 * @generated
	 */
	MdxScript getMdxScript();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMdxScript <em>Mdx Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdx Script</em>' containment reference.
	 * @see #getMdxScript()
	 * @generated
	 */
	void setMdxScript(MdxScript value);

	/**
	 * Returns the value of the '<em><b>Measure Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group</em>' containment reference.
	 * @see #setMeasureGroup(MeasureGroup)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_MeasureGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureGroup'"
	 * @generated
	 */
	MeasureGroup getMeasureGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMeasureGroup <em>Measure Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group</em>' containment reference.
	 * @see #getMeasureGroup()
	 * @generated
	 */
	void setMeasureGroup(MeasureGroup value);

	/**
	 * Returns the value of the '<em><b>Mining Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model</em>' containment reference.
	 * @see #setMiningModel(MiningModel)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_MiningModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningModel'"
	 * @generated
	 */
	MiningModel getMiningModel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMiningModel <em>Mining Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model</em>' containment reference.
	 * @see #getMiningModel()
	 * @generated
	 */
	void setMiningModel(MiningModel value);

	/**
	 * Returns the value of the '<em><b>Mining Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structure</em>' containment reference.
	 * @see #setMiningStructure(MiningStructure)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_MiningStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningStructure'"
	 * @generated
	 */
	MiningStructure getMiningStructure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getMiningStructure <em>Mining Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Structure</em>' containment reference.
	 * @see #getMiningStructure()
	 * @generated
	 */
	void setMiningStructure(MiningStructure value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' containment reference.
	 * @see #setPartition(Partition)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Partition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Partition'"
	 * @generated
	 */
	Partition getPartition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getPartition <em>Partition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition</em>' containment reference.
	 * @see #getPartition()
	 * @generated
	 */
	void setPartition(Partition value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference.
	 * @see #setPermission(Permission)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Permission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Permission'"
	 * @generated
	 */
	Permission getPermission();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getPermission <em>Permission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' containment reference.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(Permission value);

	/**
	 * Returns the value of the '<em><b>Perspective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective</em>' containment reference.
	 * @see #setPerspective(Perspective)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Perspective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Perspective'"
	 * @generated
	 */
	Perspective getPerspective();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getPerspective <em>Perspective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective</em>' containment reference.
	 * @see #getPerspective()
	 * @generated
	 */
	void setPerspective(Perspective value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Role)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role'"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(Server)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Server()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Server'"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMajorObject_Trace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Trace'"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

} // MajorObject
