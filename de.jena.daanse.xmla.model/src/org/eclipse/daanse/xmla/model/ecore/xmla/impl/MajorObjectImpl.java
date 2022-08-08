/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign;
import org.eclipse.daanse.xmla.model.ecore.xmla.Assembly;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cube;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView;
import org.eclipse.daanse.xmla.model.ecore.xmla.Database;
import org.eclipse.daanse.xmla.model.ecore.xmla.Dimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure;
import org.eclipse.daanse.xmla.model.ecore.xmla.Partition;
import org.eclipse.daanse.xmla.model.ecore.xmla.Permission;
import org.eclipse.daanse.xmla.model.ecore.xmla.Perspective;
import org.eclipse.daanse.xmla.model.ecore.xmla.Role;
import org.eclipse.daanse.xmla.model.ecore.xmla.Server;
import org.eclipse.daanse.xmla.model.ecore.xmla.Trace;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Major Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getAggregationDesign <em>Aggregation Design</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getDataSourceView <em>Data Source View</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getMdxScript <em>Mdx Script</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getMeasureGroup <em>Measure Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getMiningStructure <em>Mining Structure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MajorObjectImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MajorObjectImpl extends MinimalEObjectImpl.Container implements MajorObject {
	/**
	 * The cached value of the '{@link #getAggregationDesign() <em>Aggregation Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDesign()
	 * @generated
	 * @ordered
	 */
	protected AggregationDesign aggregationDesign;

	/**
	 * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected Assembly assembly;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected Cube cube;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource;

	/**
	 * The cached value of the '{@link #getDataSourceView() <em>Data Source View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceView()
	 * @generated
	 * @ordered
	 */
	protected DataSourceView dataSourceView;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The cached value of the '{@link #getMdxScript() <em>Mdx Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxScript()
	 * @generated
	 * @ordered
	 */
	protected MdxScript mdxScript;

	/**
	 * The cached value of the '{@link #getMeasureGroup() <em>Measure Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroup()
	 * @generated
	 * @ordered
	 */
	protected MeasureGroup measureGroup;

	/**
	 * The cached value of the '{@link #getMiningModel() <em>Mining Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModel()
	 * @generated
	 * @ordered
	 */
	protected MiningModel miningModel;

	/**
	 * The cached value of the '{@link #getMiningStructure() <em>Mining Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructure()
	 * @generated
	 * @ordered
	 */
	protected MiningStructure miningStructure;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected Partition partition;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected Permission permission;

	/**
	 * The cached value of the '{@link #getPerspective() <em>Perspective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspective()
	 * @generated
	 * @ordered
	 */
	protected Perspective perspective;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected Trace trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajorObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MAJOR_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDesign getAggregationDesign() {
		return aggregationDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationDesign(AggregationDesign newAggregationDesign, NotificationChain msgs) {
		AggregationDesign oldAggregationDesign = aggregationDesign;
		aggregationDesign = newAggregationDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN, oldAggregationDesign, newAggregationDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationDesign(AggregationDesign newAggregationDesign) {
		if (newAggregationDesign != aggregationDesign) {
			NotificationChain msgs = null;
			if (aggregationDesign != null)
				msgs = ((InternalEObject)aggregationDesign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN, null, msgs);
			if (newAggregationDesign != null)
				msgs = ((InternalEObject)newAggregationDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN, null, msgs);
			msgs = basicSetAggregationDesign(newAggregationDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN, newAggregationDesign, newAggregationDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly getAssembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssembly(Assembly newAssembly, NotificationChain msgs) {
		Assembly oldAssembly = assembly;
		assembly = newAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__ASSEMBLY, oldAssembly, newAssembly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembly(Assembly newAssembly) {
		if (newAssembly != assembly) {
			NotificationChain msgs = null;
			if (assembly != null)
				msgs = ((InternalEObject)assembly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__ASSEMBLY, null, msgs);
			if (newAssembly != null)
				msgs = ((InternalEObject)newAssembly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__ASSEMBLY, null, msgs);
			msgs = basicSetAssembly(newAssembly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__ASSEMBLY, newAssembly, newAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cube getCube() {
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCube(Cube newCube, NotificationChain msgs) {
		Cube oldCube = cube;
		cube = newCube;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__CUBE, oldCube, newCube);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCube(Cube newCube) {
		if (newCube != cube) {
			NotificationChain msgs = null;
			if (cube != null)
				msgs = ((InternalEObject)cube).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__CUBE, null, msgs);
			if (newCube != null)
				msgs = ((InternalEObject)newCube).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__CUBE, null, msgs);
			msgs = basicSetCube(newCube, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__CUBE, newCube, newCube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceView getDataSourceView() {
		return dataSourceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSourceView(DataSourceView newDataSourceView, NotificationChain msgs) {
		DataSourceView oldDataSourceView = dataSourceView;
		dataSourceView = newDataSourceView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW, oldDataSourceView, newDataSourceView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceView(DataSourceView newDataSourceView) {
		if (newDataSourceView != dataSourceView) {
			NotificationChain msgs = null;
			if (dataSourceView != null)
				msgs = ((InternalEObject)dataSourceView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW, null, msgs);
			if (newDataSourceView != null)
				msgs = ((InternalEObject)newDataSourceView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW, null, msgs);
			msgs = basicSetDataSourceView(newDataSourceView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW, newDataSourceView, newDataSourceView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DIMENSION, oldDimension, newDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject)dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxScript getMdxScript() {
		return mdxScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMdxScript(MdxScript newMdxScript, NotificationChain msgs) {
		MdxScript oldMdxScript = mdxScript;
		mdxScript = newMdxScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT, oldMdxScript, newMdxScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdxScript(MdxScript newMdxScript) {
		if (newMdxScript != mdxScript) {
			NotificationChain msgs = null;
			if (mdxScript != null)
				msgs = ((InternalEObject)mdxScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT, null, msgs);
			if (newMdxScript != null)
				msgs = ((InternalEObject)newMdxScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT, null, msgs);
			msgs = basicSetMdxScript(newMdxScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT, newMdxScript, newMdxScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroup getMeasureGroup() {
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureGroup(MeasureGroup newMeasureGroup, NotificationChain msgs) {
		MeasureGroup oldMeasureGroup = measureGroup;
		measureGroup = newMeasureGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP, oldMeasureGroup, newMeasureGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroup(MeasureGroup newMeasureGroup) {
		if (newMeasureGroup != measureGroup) {
			NotificationChain msgs = null;
			if (measureGroup != null)
				msgs = ((InternalEObject)measureGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP, null, msgs);
			if (newMeasureGroup != null)
				msgs = ((InternalEObject)newMeasureGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP, null, msgs);
			msgs = basicSetMeasureGroup(newMeasureGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP, newMeasureGroup, newMeasureGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel getMiningModel() {
		return miningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningModel(MiningModel newMiningModel, NotificationChain msgs) {
		MiningModel oldMiningModel = miningModel;
		miningModel = newMiningModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MINING_MODEL, oldMiningModel, newMiningModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModel(MiningModel newMiningModel) {
		if (newMiningModel != miningModel) {
			NotificationChain msgs = null;
			if (miningModel != null)
				msgs = ((InternalEObject)miningModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MINING_MODEL, null, msgs);
			if (newMiningModel != null)
				msgs = ((InternalEObject)newMiningModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MINING_MODEL, null, msgs);
			msgs = basicSetMiningModel(newMiningModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MINING_MODEL, newMiningModel, newMiningModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningStructure getMiningStructure() {
		return miningStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningStructure(MiningStructure newMiningStructure, NotificationChain msgs) {
		MiningStructure oldMiningStructure = miningStructure;
		miningStructure = newMiningStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE, oldMiningStructure, newMiningStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningStructure(MiningStructure newMiningStructure) {
		if (newMiningStructure != miningStructure) {
			NotificationChain msgs = null;
			if (miningStructure != null)
				msgs = ((InternalEObject)miningStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE, null, msgs);
			if (newMiningStructure != null)
				msgs = ((InternalEObject)newMiningStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE, null, msgs);
			msgs = basicSetMiningStructure(newMiningStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE, newMiningStructure, newMiningStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getPartition() {
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartition(Partition newPartition, NotificationChain msgs) {
		Partition oldPartition = partition;
		partition = newPartition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__PARTITION, oldPartition, newPartition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartition(Partition newPartition) {
		if (newPartition != partition) {
			NotificationChain msgs = null;
			if (partition != null)
				msgs = ((InternalEObject)partition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__PARTITION, null, msgs);
			if (newPartition != null)
				msgs = ((InternalEObject)newPartition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__PARTITION, null, msgs);
			msgs = basicSetPartition(newPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__PARTITION, newPartition, newPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermission(Permission newPermission, NotificationChain msgs) {
		Permission oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__PERMISSION, oldPermission, newPermission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(Permission newPermission) {
		if (newPermission != permission) {
			NotificationChain msgs = null;
			if (permission != null)
				msgs = ((InternalEObject)permission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__PERMISSION, null, msgs);
			if (newPermission != null)
				msgs = ((InternalEObject)newPermission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__PERMISSION, null, msgs);
			msgs = basicSetPermission(newPermission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__PERMISSION, newPermission, newPermission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perspective getPerspective() {
		return perspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerspective(Perspective newPerspective, NotificationChain msgs) {
		Perspective oldPerspective = perspective;
		perspective = newPerspective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__PERSPECTIVE, oldPerspective, newPerspective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspective(Perspective newPerspective) {
		if (newPerspective != perspective) {
			NotificationChain msgs = null;
			if (perspective != null)
				msgs = ((InternalEObject)perspective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__PERSPECTIVE, null, msgs);
			if (newPerspective != null)
				msgs = ((InternalEObject)newPerspective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__PERSPECTIVE, null, msgs);
			msgs = basicSetPerspective(newPerspective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__PERSPECTIVE, newPerspective, newPerspective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(Server newServer, NotificationChain msgs) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(Trace newTrace, NotificationChain msgs) {
		Trace oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(Trace newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__TRACE, null, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MAJOR_OBJECT__TRACE, null, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MAJOR_OBJECT__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN:
				return basicSetAggregationDesign(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__ASSEMBLY:
				return basicSetAssembly(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__CUBE:
				return basicSetCube(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__DATABASE:
				return basicSetDatabase(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW:
				return basicSetDataSourceView(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__DIMENSION:
				return basicSetDimension(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT:
				return basicSetMdxScript(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP:
				return basicSetMeasureGroup(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__MINING_MODEL:
				return basicSetMiningModel(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE:
				return basicSetMiningStructure(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__PARTITION:
				return basicSetPartition(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__PERMISSION:
				return basicSetPermission(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__PERSPECTIVE:
				return basicSetPerspective(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__ROLE:
				return basicSetRole(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__SERVER:
				return basicSetServer(null, msgs);
			case XmlaPackage.MAJOR_OBJECT__TRACE:
				return basicSetTrace(null, msgs);
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
			case XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN:
				return getAggregationDesign();
			case XmlaPackage.MAJOR_OBJECT__ASSEMBLY:
				return getAssembly();
			case XmlaPackage.MAJOR_OBJECT__CUBE:
				return getCube();
			case XmlaPackage.MAJOR_OBJECT__DATABASE:
				return getDatabase();
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE:
				return getDataSource();
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW:
				return getDataSourceView();
			case XmlaPackage.MAJOR_OBJECT__DIMENSION:
				return getDimension();
			case XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT:
				return getMdxScript();
			case XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP:
				return getMeasureGroup();
			case XmlaPackage.MAJOR_OBJECT__MINING_MODEL:
				return getMiningModel();
			case XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE:
				return getMiningStructure();
			case XmlaPackage.MAJOR_OBJECT__PARTITION:
				return getPartition();
			case XmlaPackage.MAJOR_OBJECT__PERMISSION:
				return getPermission();
			case XmlaPackage.MAJOR_OBJECT__PERSPECTIVE:
				return getPerspective();
			case XmlaPackage.MAJOR_OBJECT__ROLE:
				return getRole();
			case XmlaPackage.MAJOR_OBJECT__SERVER:
				return getServer();
			case XmlaPackage.MAJOR_OBJECT__TRACE:
				return getTrace();
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
			case XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN:
				setAggregationDesign((AggregationDesign)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__ASSEMBLY:
				setAssembly((Assembly)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__CUBE:
				setCube((Cube)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__DATABASE:
				setDatabase((Database)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW:
				setDataSourceView((DataSourceView)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__DIMENSION:
				setDimension((Dimension)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT:
				setMdxScript((MdxScript)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP:
				setMeasureGroup((MeasureGroup)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__MINING_MODEL:
				setMiningModel((MiningModel)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE:
				setMiningStructure((MiningStructure)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__PARTITION:
				setPartition((Partition)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__PERMISSION:
				setPermission((Permission)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__PERSPECTIVE:
				setPerspective((Perspective)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__ROLE:
				setRole((Role)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__SERVER:
				setServer((Server)newValue);
				return;
			case XmlaPackage.MAJOR_OBJECT__TRACE:
				setTrace((Trace)newValue);
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
			case XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN:
				setAggregationDesign((AggregationDesign)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__ASSEMBLY:
				setAssembly((Assembly)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__CUBE:
				setCube((Cube)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__DATABASE:
				setDatabase((Database)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW:
				setDataSourceView((DataSourceView)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__DIMENSION:
				setDimension((Dimension)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT:
				setMdxScript((MdxScript)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP:
				setMeasureGroup((MeasureGroup)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__MINING_MODEL:
				setMiningModel((MiningModel)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE:
				setMiningStructure((MiningStructure)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__PARTITION:
				setPartition((Partition)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__PERMISSION:
				setPermission((Permission)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__PERSPECTIVE:
				setPerspective((Perspective)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__ROLE:
				setRole((Role)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__SERVER:
				setServer((Server)null);
				return;
			case XmlaPackage.MAJOR_OBJECT__TRACE:
				setTrace((Trace)null);
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
			case XmlaPackage.MAJOR_OBJECT__AGGREGATION_DESIGN:
				return aggregationDesign != null;
			case XmlaPackage.MAJOR_OBJECT__ASSEMBLY:
				return assembly != null;
			case XmlaPackage.MAJOR_OBJECT__CUBE:
				return cube != null;
			case XmlaPackage.MAJOR_OBJECT__DATABASE:
				return database != null;
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE:
				return dataSource != null;
			case XmlaPackage.MAJOR_OBJECT__DATA_SOURCE_VIEW:
				return dataSourceView != null;
			case XmlaPackage.MAJOR_OBJECT__DIMENSION:
				return dimension != null;
			case XmlaPackage.MAJOR_OBJECT__MDX_SCRIPT:
				return mdxScript != null;
			case XmlaPackage.MAJOR_OBJECT__MEASURE_GROUP:
				return measureGroup != null;
			case XmlaPackage.MAJOR_OBJECT__MINING_MODEL:
				return miningModel != null;
			case XmlaPackage.MAJOR_OBJECT__MINING_STRUCTURE:
				return miningStructure != null;
			case XmlaPackage.MAJOR_OBJECT__PARTITION:
				return partition != null;
			case XmlaPackage.MAJOR_OBJECT__PERMISSION:
				return permission != null;
			case XmlaPackage.MAJOR_OBJECT__PERSPECTIVE:
				return perspective != null;
			case XmlaPackage.MAJOR_OBJECT__ROLE:
				return role != null;
			case XmlaPackage.MAJOR_OBJECT__SERVER:
				return server != null;
			case XmlaPackage.MAJOR_OBJECT__TRACE:
				return trace != null;
		}
		return super.eIsSet(featureID);
	}

} //MajorObjectImpl
