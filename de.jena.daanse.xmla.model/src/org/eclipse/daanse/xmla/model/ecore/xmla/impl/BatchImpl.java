/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.Alter;
import org.eclipse.daanse.xmla.model.ecore.xmla.Attach;
import org.eclipse.daanse.xmla.model.ecore.xmla.Backup;
import org.eclipse.daanse.xmla.model.ecore.xmla.Batch;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cancel;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClearCache;
import org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase;
import org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Create;
import org.eclipse.daanse.xmla.model.ecore.xmla.DBCC;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView;
import org.eclipse.daanse.xmla.model.ecore.xmla.Delete;
import org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations;
import org.eclipse.daanse.xmla.model.ecore.xmla.Detach;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Drop;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave;
import org.eclipse.daanse.xmla.model.ecore.xmla.Insert;
import org.eclipse.daanse.xmla.model.ecore.xmla.Lock;
import org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange;
import org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restore;
import org.eclipse.daanse.xmla.model.ecore.xmla.RollbackTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext;
import org.eclipse.daanse.xmla.model.ecore.xmla.Subscribe;
import org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize;
import org.eclipse.daanse.xmla.model.ecore.xmla.Unlock;
import org.eclipse.daanse.xmla.model.ecore.xmla.Unsubscribe;
import org.eclipse.daanse.xmla.model.ecore.xmla.Update;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateCells;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDataSourceView <em>Data Source View</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getAlter <em>Alter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getMergePartitions <em>Merge Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDesignAggregations <em>Design Aggregations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getNotifyTableChange <em>Notify Table Change</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getUpdateCells <em>Update Cells</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getBackup <em>Backup</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getRestore <em>Restore</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getBeginTransaction <em>Begin Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getCommitTransaction <em>Commit Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getRollbackTransaction <em>Rollback Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getClearCache <em>Clear Cache</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getUnsubscribe <em>Unsubscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDetach <em>Detach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getLock <em>Lock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getUnlock <em>Unlock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getImageLoad <em>Image Load</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getImageSave <em>Image Save</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getCloneDatabase <em>Clone Database</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getSetAuthContext <em>Set Auth Context</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDBCC <em>DBCC</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#getDiscover <em>Discover</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#isProcessAffectedObjects <em>Process Affected Objects</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BatchImpl#isTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchImpl extends MinimalEObjectImpl.Container implements Batch {
	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected EList<ParallelType> parallel;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected OutOfLineBinding bindings;

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
	 * The cached value of the '{@link #getErrorConfiguration() <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ErrorConfiguration errorConfiguration;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected EList<Create> create;

	/**
	 * The cached value of the '{@link #getAlter() <em>Alter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlter()
	 * @generated
	 * @ordered
	 */
	protected EList<Alter> alter;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected EList<Delete> delete;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.daanse.xmla.model.ecore.xmla.Process> process;

	/**
	 * The cached value of the '{@link #getMergePartitions() <em>Merge Partitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergePartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MergePartitions> mergePartitions;

	/**
	 * The cached value of the '{@link #getDesignAggregations() <em>Design Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignAggregations> designAggregations;

	/**
	 * The cached value of the '{@link #getNotifyTableChange() <em>Notify Table Change</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyTableChange()
	 * @generated
	 * @ordered
	 */
	protected EList<NotifyTableChange> notifyTableChange;

	/**
	 * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsert()
	 * @generated
	 * @ordered
	 */
	protected EList<Insert> insert;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected EList<Update> update;

	/**
	 * The cached value of the '{@link #getDrop() <em>Drop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected EList<Drop> drop;

	/**
	 * The cached value of the '{@link #getUpdateCells() <em>Update Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCells()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateCells> updateCells;

	/**
	 * The cached value of the '{@link #getBackup() <em>Backup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup()
	 * @generated
	 * @ordered
	 */
	protected EList<Backup> backup;

	/**
	 * The cached value of the '{@link #getRestore() <em>Restore</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestore()
	 * @generated
	 * @ordered
	 */
	protected EList<Restore> restore;

	/**
	 * The cached value of the '{@link #getSynchronize() <em>Synchronize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronize()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronize> synchronize;

	/**
	 * The cached value of the '{@link #getCancel() <em>Cancel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel()
	 * @generated
	 * @ordered
	 */
	protected EList<Cancel> cancel;

	/**
	 * The cached value of the '{@link #getBeginTransaction() <em>Begin Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<BeginTransaction> beginTransaction;

	/**
	 * The cached value of the '{@link #getCommitTransaction() <em>Commit Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<CommitTransaction> commitTransaction;

	/**
	 * The cached value of the '{@link #getRollbackTransaction() <em>Rollback Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<RollbackTransaction> rollbackTransaction;

	/**
	 * The cached value of the '{@link #getClearCache() <em>Clear Cache</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearCache()
	 * @generated
	 * @ordered
	 */
	protected EList<ClearCache> clearCache;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscribe> subscribe;

	/**
	 * The cached value of the '{@link #getUnsubscribe() <em>Unsubscribe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsubscribe()
	 * @generated
	 * @ordered
	 */
	protected EList<Unsubscribe> unsubscribe;

	/**
	 * The cached value of the '{@link #getDetach() <em>Detach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetach()
	 * @generated
	 * @ordered
	 */
	protected EList<Detach> detach;

	/**
	 * The cached value of the '{@link #getAttach() <em>Attach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected EList<Attach> attach;

	/**
	 * The cached value of the '{@link #getLock() <em>Lock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLock()
	 * @generated
	 * @ordered
	 */
	protected EList<Lock> lock;

	/**
	 * The cached value of the '{@link #getUnlock() <em>Unlock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Unlock> unlock;

	/**
	 * The cached value of the '{@link #getImageLoad() <em>Image Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageLoad> imageLoad;

	/**
	 * The cached value of the '{@link #getImageSave() <em>Image Save</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageSave()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageSave> imageSave;

	/**
	 * The cached value of the '{@link #getCloneDatabase() <em>Clone Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<CloneDatabase> cloneDatabase;

	/**
	 * The cached value of the '{@link #getSetAuthContext() <em>Set Auth Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetAuthContext()
	 * @generated
	 * @ordered
	 */
	protected EList<SetAuthContext> setAuthContext;

	/**
	 * The cached value of the '{@link #getDBCC() <em>DBCC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBCC()
	 * @generated
	 * @ordered
	 */
	protected DBCC dBCC;

	/**
	 * The cached value of the '{@link #getDiscover() <em>Discover</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscover()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscoverType> discover;

	/**
	 * The default value of the '{@link #isProcessAffectedObjects() <em>Process Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessAffectedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESS_AFFECTED_OBJECTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProcessAffectedObjects() <em>Process Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessAffectedObjects()
	 * @generated
	 * @ordered
	 */
	protected boolean processAffectedObjects = PROCESS_AFFECTED_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Process Affected Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processAffectedObjectsESet;

	/**
	 * The default value of the '{@link #isTransaction() <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransaction() <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransaction()
	 * @generated
	 * @ordered
	 */
	protected boolean transaction = TRANSACTION_EDEFAULT;

	/**
	 * This is true if the Transaction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.BATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParallelType> getParallel() {
		if (parallel == null) {
			parallel = new EObjectContainmentEList<ParallelType>(ParallelType.class, this, XmlaPackage.BATCH__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutOfLineBinding getBindings() {
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindings(OutOfLineBinding newBindings, NotificationChain msgs) {
		OutOfLineBinding oldBindings = bindings;
		bindings = newBindings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__BINDINGS, oldBindings, newBindings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindings(OutOfLineBinding newBindings) {
		if (newBindings != bindings) {
			NotificationChain msgs = null;
			if (bindings != null)
				msgs = ((InternalEObject)bindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__BINDINGS, null, msgs);
			if (newBindings != null)
				msgs = ((InternalEObject)newBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__BINDINGS, null, msgs);
			msgs = basicSetBindings(newBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__BINDINGS, newBindings, newBindings));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__DATA_SOURCE, oldDataSource, newDataSource);
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
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__DATA_SOURCE, newDataSource, newDataSource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__DATA_SOURCE_VIEW, oldDataSourceView, newDataSourceView);
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
				msgs = ((InternalEObject)dataSourceView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__DATA_SOURCE_VIEW, null, msgs);
			if (newDataSourceView != null)
				msgs = ((InternalEObject)newDataSourceView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__DATA_SOURCE_VIEW, null, msgs);
			msgs = basicSetDataSourceView(newDataSourceView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__DATA_SOURCE_VIEW, newDataSourceView, newDataSourceView));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
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
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Create> getCreate() {
		if (create == null) {
			create = new EObjectContainmentEList<Create>(Create.class, this, XmlaPackage.BATCH__CREATE);
		}
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alter> getAlter() {
		if (alter == null) {
			alter = new EObjectContainmentEList<Alter>(Alter.class, this, XmlaPackage.BATCH__ALTER);
		}
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delete> getDelete() {
		if (delete == null) {
			delete = new EObjectContainmentEList<Delete>(Delete.class, this, XmlaPackage.BATCH__DELETE);
		}
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.daanse.xmla.model.ecore.xmla.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<org.eclipse.daanse.xmla.model.ecore.xmla.Process>(org.eclipse.daanse.xmla.model.ecore.xmla.Process.class, this, XmlaPackage.BATCH__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergePartitions> getMergePartitions() {
		if (mergePartitions == null) {
			mergePartitions = new EObjectContainmentEList<MergePartitions>(MergePartitions.class, this, XmlaPackage.BATCH__MERGE_PARTITIONS);
		}
		return mergePartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignAggregations> getDesignAggregations() {
		if (designAggregations == null) {
			designAggregations = new EObjectContainmentEList<DesignAggregations>(DesignAggregations.class, this, XmlaPackage.BATCH__DESIGN_AGGREGATIONS);
		}
		return designAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotifyTableChange> getNotifyTableChange() {
		if (notifyTableChange == null) {
			notifyTableChange = new EObjectContainmentEList<NotifyTableChange>(NotifyTableChange.class, this, XmlaPackage.BATCH__NOTIFY_TABLE_CHANGE);
		}
		return notifyTableChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Insert> getInsert() {
		if (insert == null) {
			insert = new EObjectContainmentEList<Insert>(Insert.class, this, XmlaPackage.BATCH__INSERT);
		}
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Update> getUpdate() {
		if (update == null) {
			update = new EObjectContainmentEList<Update>(Update.class, this, XmlaPackage.BATCH__UPDATE);
		}
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drop> getDrop() {
		if (drop == null) {
			drop = new EObjectContainmentEList<Drop>(Drop.class, this, XmlaPackage.BATCH__DROP);
		}
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UpdateCells> getUpdateCells() {
		if (updateCells == null) {
			updateCells = new EObjectContainmentEList<UpdateCells>(UpdateCells.class, this, XmlaPackage.BATCH__UPDATE_CELLS);
		}
		return updateCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Backup> getBackup() {
		if (backup == null) {
			backup = new EObjectContainmentEList<Backup>(Backup.class, this, XmlaPackage.BATCH__BACKUP);
		}
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Restore> getRestore() {
		if (restore == null) {
			restore = new EObjectContainmentEList<Restore>(Restore.class, this, XmlaPackage.BATCH__RESTORE);
		}
		return restore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronize> getSynchronize() {
		if (synchronize == null) {
			synchronize = new EObjectContainmentEList<Synchronize>(Synchronize.class, this, XmlaPackage.BATCH__SYNCHRONIZE);
		}
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cancel> getCancel() {
		if (cancel == null) {
			cancel = new EObjectContainmentEList<Cancel>(Cancel.class, this, XmlaPackage.BATCH__CANCEL);
		}
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeginTransaction> getBeginTransaction() {
		if (beginTransaction == null) {
			beginTransaction = new EObjectContainmentEList<BeginTransaction>(BeginTransaction.class, this, XmlaPackage.BATCH__BEGIN_TRANSACTION);
		}
		return beginTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommitTransaction> getCommitTransaction() {
		if (commitTransaction == null) {
			commitTransaction = new EObjectContainmentEList<CommitTransaction>(CommitTransaction.class, this, XmlaPackage.BATCH__COMMIT_TRANSACTION);
		}
		return commitTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackTransaction> getRollbackTransaction() {
		if (rollbackTransaction == null) {
			rollbackTransaction = new EObjectContainmentEList<RollbackTransaction>(RollbackTransaction.class, this, XmlaPackage.BATCH__ROLLBACK_TRANSACTION);
		}
		return rollbackTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClearCache> getClearCache() {
		if (clearCache == null) {
			clearCache = new EObjectContainmentEList<ClearCache>(ClearCache.class, this, XmlaPackage.BATCH__CLEAR_CACHE);
		}
		return clearCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscribe> getSubscribe() {
		if (subscribe == null) {
			subscribe = new EObjectContainmentEList<Subscribe>(Subscribe.class, this, XmlaPackage.BATCH__SUBSCRIBE);
		}
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unsubscribe> getUnsubscribe() {
		if (unsubscribe == null) {
			unsubscribe = new EObjectContainmentEList<Unsubscribe>(Unsubscribe.class, this, XmlaPackage.BATCH__UNSUBSCRIBE);
		}
		return unsubscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Detach> getDetach() {
		if (detach == null) {
			detach = new EObjectContainmentEList<Detach>(Detach.class, this, XmlaPackage.BATCH__DETACH);
		}
		return detach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attach> getAttach() {
		if (attach == null) {
			attach = new EObjectContainmentEList<Attach>(Attach.class, this, XmlaPackage.BATCH__ATTACH);
		}
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lock> getLock() {
		if (lock == null) {
			lock = new EObjectContainmentEList<Lock>(Lock.class, this, XmlaPackage.BATCH__LOCK);
		}
		return lock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unlock> getUnlock() {
		if (unlock == null) {
			unlock = new EObjectContainmentEList<Unlock>(Unlock.class, this, XmlaPackage.BATCH__UNLOCK);
		}
		return unlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageLoad> getImageLoad() {
		if (imageLoad == null) {
			imageLoad = new EObjectContainmentEList<ImageLoad>(ImageLoad.class, this, XmlaPackage.BATCH__IMAGE_LOAD);
		}
		return imageLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageSave> getImageSave() {
		if (imageSave == null) {
			imageSave = new EObjectContainmentEList<ImageSave>(ImageSave.class, this, XmlaPackage.BATCH__IMAGE_SAVE);
		}
		return imageSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloneDatabase> getCloneDatabase() {
		if (cloneDatabase == null) {
			cloneDatabase = new EObjectContainmentEList<CloneDatabase>(CloneDatabase.class, this, XmlaPackage.BATCH__CLONE_DATABASE);
		}
		return cloneDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetAuthContext> getSetAuthContext() {
		if (setAuthContext == null) {
			setAuthContext = new EObjectContainmentEList<SetAuthContext>(SetAuthContext.class, this, XmlaPackage.BATCH__SET_AUTH_CONTEXT);
		}
		return setAuthContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBCC getDBCC() {
		return dBCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDBCC(DBCC newDBCC, NotificationChain msgs) {
		DBCC oldDBCC = dBCC;
		dBCC = newDBCC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__DBCC, oldDBCC, newDBCC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBCC(DBCC newDBCC) {
		if (newDBCC != dBCC) {
			NotificationChain msgs = null;
			if (dBCC != null)
				msgs = ((InternalEObject)dBCC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__DBCC, null, msgs);
			if (newDBCC != null)
				msgs = ((InternalEObject)newDBCC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BATCH__DBCC, null, msgs);
			msgs = basicSetDBCC(newDBCC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__DBCC, newDBCC, newDBCC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscoverType> getDiscover() {
		if (discover == null) {
			discover = new EObjectContainmentEList<DiscoverType>(DiscoverType.class, this, XmlaPackage.BATCH__DISCOVER);
		}
		return discover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProcessAffectedObjects() {
		return processAffectedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessAffectedObjects(boolean newProcessAffectedObjects) {
		boolean oldProcessAffectedObjects = processAffectedObjects;
		processAffectedObjects = newProcessAffectedObjects;
		boolean oldProcessAffectedObjectsESet = processAffectedObjectsESet;
		processAffectedObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__PROCESS_AFFECTED_OBJECTS, oldProcessAffectedObjects, processAffectedObjects, !oldProcessAffectedObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessAffectedObjects() {
		boolean oldProcessAffectedObjects = processAffectedObjects;
		boolean oldProcessAffectedObjectsESet = processAffectedObjectsESet;
		processAffectedObjects = PROCESS_AFFECTED_OBJECTS_EDEFAULT;
		processAffectedObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.BATCH__PROCESS_AFFECTED_OBJECTS, oldProcessAffectedObjects, PROCESS_AFFECTED_OBJECTS_EDEFAULT, oldProcessAffectedObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessAffectedObjects() {
		return processAffectedObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(boolean newTransaction) {
		boolean oldTransaction = transaction;
		transaction = newTransaction;
		boolean oldTransactionESet = transactionESet;
		transactionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BATCH__TRANSACTION, oldTransaction, transaction, !oldTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransaction() {
		boolean oldTransaction = transaction;
		boolean oldTransactionESet = transactionESet;
		transaction = TRANSACTION_EDEFAULT;
		transactionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.BATCH__TRANSACTION, oldTransaction, TRANSACTION_EDEFAULT, oldTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransaction() {
		return transactionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.BATCH__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__BINDINGS:
				return basicSetBindings(null, msgs);
			case XmlaPackage.BATCH__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case XmlaPackage.BATCH__DATA_SOURCE_VIEW:
				return basicSetDataSourceView(null, msgs);
			case XmlaPackage.BATCH__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
			case XmlaPackage.BATCH__CREATE:
				return ((InternalEList<?>)getCreate()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__ALTER:
				return ((InternalEList<?>)getAlter()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__MERGE_PARTITIONS:
				return ((InternalEList<?>)getMergePartitions()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__DESIGN_AGGREGATIONS:
				return ((InternalEList<?>)getDesignAggregations()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__NOTIFY_TABLE_CHANGE:
				return ((InternalEList<?>)getNotifyTableChange()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__INSERT:
				return ((InternalEList<?>)getInsert()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__UPDATE:
				return ((InternalEList<?>)getUpdate()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__DROP:
				return ((InternalEList<?>)getDrop()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__UPDATE_CELLS:
				return ((InternalEList<?>)getUpdateCells()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__BACKUP:
				return ((InternalEList<?>)getBackup()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__RESTORE:
				return ((InternalEList<?>)getRestore()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__SYNCHRONIZE:
				return ((InternalEList<?>)getSynchronize()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__CANCEL:
				return ((InternalEList<?>)getCancel()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__BEGIN_TRANSACTION:
				return ((InternalEList<?>)getBeginTransaction()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__COMMIT_TRANSACTION:
				return ((InternalEList<?>)getCommitTransaction()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__ROLLBACK_TRANSACTION:
				return ((InternalEList<?>)getRollbackTransaction()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__CLEAR_CACHE:
				return ((InternalEList<?>)getClearCache()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__SUBSCRIBE:
				return ((InternalEList<?>)getSubscribe()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__UNSUBSCRIBE:
				return ((InternalEList<?>)getUnsubscribe()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__DETACH:
				return ((InternalEList<?>)getDetach()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__ATTACH:
				return ((InternalEList<?>)getAttach()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__LOCK:
				return ((InternalEList<?>)getLock()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__UNLOCK:
				return ((InternalEList<?>)getUnlock()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__IMAGE_LOAD:
				return ((InternalEList<?>)getImageLoad()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__IMAGE_SAVE:
				return ((InternalEList<?>)getImageSave()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__CLONE_DATABASE:
				return ((InternalEList<?>)getCloneDatabase()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__SET_AUTH_CONTEXT:
				return ((InternalEList<?>)getSetAuthContext()).basicRemove(otherEnd, msgs);
			case XmlaPackage.BATCH__DBCC:
				return basicSetDBCC(null, msgs);
			case XmlaPackage.BATCH__DISCOVER:
				return ((InternalEList<?>)getDiscover()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.BATCH__PARALLEL:
				return getParallel();
			case XmlaPackage.BATCH__BINDINGS:
				return getBindings();
			case XmlaPackage.BATCH__DATA_SOURCE:
				return getDataSource();
			case XmlaPackage.BATCH__DATA_SOURCE_VIEW:
				return getDataSourceView();
			case XmlaPackage.BATCH__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.BATCH__CREATE:
				return getCreate();
			case XmlaPackage.BATCH__ALTER:
				return getAlter();
			case XmlaPackage.BATCH__DELETE:
				return getDelete();
			case XmlaPackage.BATCH__PROCESS:
				return getProcess();
			case XmlaPackage.BATCH__MERGE_PARTITIONS:
				return getMergePartitions();
			case XmlaPackage.BATCH__DESIGN_AGGREGATIONS:
				return getDesignAggregations();
			case XmlaPackage.BATCH__NOTIFY_TABLE_CHANGE:
				return getNotifyTableChange();
			case XmlaPackage.BATCH__INSERT:
				return getInsert();
			case XmlaPackage.BATCH__UPDATE:
				return getUpdate();
			case XmlaPackage.BATCH__DROP:
				return getDrop();
			case XmlaPackage.BATCH__UPDATE_CELLS:
				return getUpdateCells();
			case XmlaPackage.BATCH__BACKUP:
				return getBackup();
			case XmlaPackage.BATCH__RESTORE:
				return getRestore();
			case XmlaPackage.BATCH__SYNCHRONIZE:
				return getSynchronize();
			case XmlaPackage.BATCH__CANCEL:
				return getCancel();
			case XmlaPackage.BATCH__BEGIN_TRANSACTION:
				return getBeginTransaction();
			case XmlaPackage.BATCH__COMMIT_TRANSACTION:
				return getCommitTransaction();
			case XmlaPackage.BATCH__ROLLBACK_TRANSACTION:
				return getRollbackTransaction();
			case XmlaPackage.BATCH__CLEAR_CACHE:
				return getClearCache();
			case XmlaPackage.BATCH__SUBSCRIBE:
				return getSubscribe();
			case XmlaPackage.BATCH__UNSUBSCRIBE:
				return getUnsubscribe();
			case XmlaPackage.BATCH__DETACH:
				return getDetach();
			case XmlaPackage.BATCH__ATTACH:
				return getAttach();
			case XmlaPackage.BATCH__LOCK:
				return getLock();
			case XmlaPackage.BATCH__UNLOCK:
				return getUnlock();
			case XmlaPackage.BATCH__IMAGE_LOAD:
				return getImageLoad();
			case XmlaPackage.BATCH__IMAGE_SAVE:
				return getImageSave();
			case XmlaPackage.BATCH__CLONE_DATABASE:
				return getCloneDatabase();
			case XmlaPackage.BATCH__SET_AUTH_CONTEXT:
				return getSetAuthContext();
			case XmlaPackage.BATCH__DBCC:
				return getDBCC();
			case XmlaPackage.BATCH__DISCOVER:
				return getDiscover();
			case XmlaPackage.BATCH__PROCESS_AFFECTED_OBJECTS:
				return isProcessAffectedObjects();
			case XmlaPackage.BATCH__TRANSACTION:
				return isTransaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.BATCH__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends ParallelType>)newValue);
				return;
			case XmlaPackage.BATCH__BINDINGS:
				setBindings((OutOfLineBinding)newValue);
				return;
			case XmlaPackage.BATCH__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case XmlaPackage.BATCH__DATA_SOURCE_VIEW:
				setDataSourceView((DataSourceView)newValue);
				return;
			case XmlaPackage.BATCH__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.BATCH__CREATE:
				getCreate().clear();
				getCreate().addAll((Collection<? extends Create>)newValue);
				return;
			case XmlaPackage.BATCH__ALTER:
				getAlter().clear();
				getAlter().addAll((Collection<? extends Alter>)newValue);
				return;
			case XmlaPackage.BATCH__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends Delete>)newValue);
				return;
			case XmlaPackage.BATCH__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends org.eclipse.daanse.xmla.model.ecore.xmla.Process>)newValue);
				return;
			case XmlaPackage.BATCH__MERGE_PARTITIONS:
				getMergePartitions().clear();
				getMergePartitions().addAll((Collection<? extends MergePartitions>)newValue);
				return;
			case XmlaPackage.BATCH__DESIGN_AGGREGATIONS:
				getDesignAggregations().clear();
				getDesignAggregations().addAll((Collection<? extends DesignAggregations>)newValue);
				return;
			case XmlaPackage.BATCH__NOTIFY_TABLE_CHANGE:
				getNotifyTableChange().clear();
				getNotifyTableChange().addAll((Collection<? extends NotifyTableChange>)newValue);
				return;
			case XmlaPackage.BATCH__INSERT:
				getInsert().clear();
				getInsert().addAll((Collection<? extends Insert>)newValue);
				return;
			case XmlaPackage.BATCH__UPDATE:
				getUpdate().clear();
				getUpdate().addAll((Collection<? extends Update>)newValue);
				return;
			case XmlaPackage.BATCH__DROP:
				getDrop().clear();
				getDrop().addAll((Collection<? extends Drop>)newValue);
				return;
			case XmlaPackage.BATCH__UPDATE_CELLS:
				getUpdateCells().clear();
				getUpdateCells().addAll((Collection<? extends UpdateCells>)newValue);
				return;
			case XmlaPackage.BATCH__BACKUP:
				getBackup().clear();
				getBackup().addAll((Collection<? extends Backup>)newValue);
				return;
			case XmlaPackage.BATCH__RESTORE:
				getRestore().clear();
				getRestore().addAll((Collection<? extends Restore>)newValue);
				return;
			case XmlaPackage.BATCH__SYNCHRONIZE:
				getSynchronize().clear();
				getSynchronize().addAll((Collection<? extends Synchronize>)newValue);
				return;
			case XmlaPackage.BATCH__CANCEL:
				getCancel().clear();
				getCancel().addAll((Collection<? extends Cancel>)newValue);
				return;
			case XmlaPackage.BATCH__BEGIN_TRANSACTION:
				getBeginTransaction().clear();
				getBeginTransaction().addAll((Collection<? extends BeginTransaction>)newValue);
				return;
			case XmlaPackage.BATCH__COMMIT_TRANSACTION:
				getCommitTransaction().clear();
				getCommitTransaction().addAll((Collection<? extends CommitTransaction>)newValue);
				return;
			case XmlaPackage.BATCH__ROLLBACK_TRANSACTION:
				getRollbackTransaction().clear();
				getRollbackTransaction().addAll((Collection<? extends RollbackTransaction>)newValue);
				return;
			case XmlaPackage.BATCH__CLEAR_CACHE:
				getClearCache().clear();
				getClearCache().addAll((Collection<? extends ClearCache>)newValue);
				return;
			case XmlaPackage.BATCH__SUBSCRIBE:
				getSubscribe().clear();
				getSubscribe().addAll((Collection<? extends Subscribe>)newValue);
				return;
			case XmlaPackage.BATCH__UNSUBSCRIBE:
				getUnsubscribe().clear();
				getUnsubscribe().addAll((Collection<? extends Unsubscribe>)newValue);
				return;
			case XmlaPackage.BATCH__DETACH:
				getDetach().clear();
				getDetach().addAll((Collection<? extends Detach>)newValue);
				return;
			case XmlaPackage.BATCH__ATTACH:
				getAttach().clear();
				getAttach().addAll((Collection<? extends Attach>)newValue);
				return;
			case XmlaPackage.BATCH__LOCK:
				getLock().clear();
				getLock().addAll((Collection<? extends Lock>)newValue);
				return;
			case XmlaPackage.BATCH__UNLOCK:
				getUnlock().clear();
				getUnlock().addAll((Collection<? extends Unlock>)newValue);
				return;
			case XmlaPackage.BATCH__IMAGE_LOAD:
				getImageLoad().clear();
				getImageLoad().addAll((Collection<? extends ImageLoad>)newValue);
				return;
			case XmlaPackage.BATCH__IMAGE_SAVE:
				getImageSave().clear();
				getImageSave().addAll((Collection<? extends ImageSave>)newValue);
				return;
			case XmlaPackage.BATCH__CLONE_DATABASE:
				getCloneDatabase().clear();
				getCloneDatabase().addAll((Collection<? extends CloneDatabase>)newValue);
				return;
			case XmlaPackage.BATCH__SET_AUTH_CONTEXT:
				getSetAuthContext().clear();
				getSetAuthContext().addAll((Collection<? extends SetAuthContext>)newValue);
				return;
			case XmlaPackage.BATCH__DBCC:
				setDBCC((DBCC)newValue);
				return;
			case XmlaPackage.BATCH__DISCOVER:
				getDiscover().clear();
				getDiscover().addAll((Collection<? extends DiscoverType>)newValue);
				return;
			case XmlaPackage.BATCH__PROCESS_AFFECTED_OBJECTS:
				setProcessAffectedObjects((Boolean)newValue);
				return;
			case XmlaPackage.BATCH__TRANSACTION:
				setTransaction((Boolean)newValue);
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
			case XmlaPackage.BATCH__PARALLEL:
				getParallel().clear();
				return;
			case XmlaPackage.BATCH__BINDINGS:
				setBindings((OutOfLineBinding)null);
				return;
			case XmlaPackage.BATCH__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case XmlaPackage.BATCH__DATA_SOURCE_VIEW:
				setDataSourceView((DataSourceView)null);
				return;
			case XmlaPackage.BATCH__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.BATCH__CREATE:
				getCreate().clear();
				return;
			case XmlaPackage.BATCH__ALTER:
				getAlter().clear();
				return;
			case XmlaPackage.BATCH__DELETE:
				getDelete().clear();
				return;
			case XmlaPackage.BATCH__PROCESS:
				getProcess().clear();
				return;
			case XmlaPackage.BATCH__MERGE_PARTITIONS:
				getMergePartitions().clear();
				return;
			case XmlaPackage.BATCH__DESIGN_AGGREGATIONS:
				getDesignAggregations().clear();
				return;
			case XmlaPackage.BATCH__NOTIFY_TABLE_CHANGE:
				getNotifyTableChange().clear();
				return;
			case XmlaPackage.BATCH__INSERT:
				getInsert().clear();
				return;
			case XmlaPackage.BATCH__UPDATE:
				getUpdate().clear();
				return;
			case XmlaPackage.BATCH__DROP:
				getDrop().clear();
				return;
			case XmlaPackage.BATCH__UPDATE_CELLS:
				getUpdateCells().clear();
				return;
			case XmlaPackage.BATCH__BACKUP:
				getBackup().clear();
				return;
			case XmlaPackage.BATCH__RESTORE:
				getRestore().clear();
				return;
			case XmlaPackage.BATCH__SYNCHRONIZE:
				getSynchronize().clear();
				return;
			case XmlaPackage.BATCH__CANCEL:
				getCancel().clear();
				return;
			case XmlaPackage.BATCH__BEGIN_TRANSACTION:
				getBeginTransaction().clear();
				return;
			case XmlaPackage.BATCH__COMMIT_TRANSACTION:
				getCommitTransaction().clear();
				return;
			case XmlaPackage.BATCH__ROLLBACK_TRANSACTION:
				getRollbackTransaction().clear();
				return;
			case XmlaPackage.BATCH__CLEAR_CACHE:
				getClearCache().clear();
				return;
			case XmlaPackage.BATCH__SUBSCRIBE:
				getSubscribe().clear();
				return;
			case XmlaPackage.BATCH__UNSUBSCRIBE:
				getUnsubscribe().clear();
				return;
			case XmlaPackage.BATCH__DETACH:
				getDetach().clear();
				return;
			case XmlaPackage.BATCH__ATTACH:
				getAttach().clear();
				return;
			case XmlaPackage.BATCH__LOCK:
				getLock().clear();
				return;
			case XmlaPackage.BATCH__UNLOCK:
				getUnlock().clear();
				return;
			case XmlaPackage.BATCH__IMAGE_LOAD:
				getImageLoad().clear();
				return;
			case XmlaPackage.BATCH__IMAGE_SAVE:
				getImageSave().clear();
				return;
			case XmlaPackage.BATCH__CLONE_DATABASE:
				getCloneDatabase().clear();
				return;
			case XmlaPackage.BATCH__SET_AUTH_CONTEXT:
				getSetAuthContext().clear();
				return;
			case XmlaPackage.BATCH__DBCC:
				setDBCC((DBCC)null);
				return;
			case XmlaPackage.BATCH__DISCOVER:
				getDiscover().clear();
				return;
			case XmlaPackage.BATCH__PROCESS_AFFECTED_OBJECTS:
				unsetProcessAffectedObjects();
				return;
			case XmlaPackage.BATCH__TRANSACTION:
				unsetTransaction();
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
			case XmlaPackage.BATCH__PARALLEL:
				return parallel != null && !parallel.isEmpty();
			case XmlaPackage.BATCH__BINDINGS:
				return bindings != null;
			case XmlaPackage.BATCH__DATA_SOURCE:
				return dataSource != null;
			case XmlaPackage.BATCH__DATA_SOURCE_VIEW:
				return dataSourceView != null;
			case XmlaPackage.BATCH__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.BATCH__CREATE:
				return create != null && !create.isEmpty();
			case XmlaPackage.BATCH__ALTER:
				return alter != null && !alter.isEmpty();
			case XmlaPackage.BATCH__DELETE:
				return delete != null && !delete.isEmpty();
			case XmlaPackage.BATCH__PROCESS:
				return process != null && !process.isEmpty();
			case XmlaPackage.BATCH__MERGE_PARTITIONS:
				return mergePartitions != null && !mergePartitions.isEmpty();
			case XmlaPackage.BATCH__DESIGN_AGGREGATIONS:
				return designAggregations != null && !designAggregations.isEmpty();
			case XmlaPackage.BATCH__NOTIFY_TABLE_CHANGE:
				return notifyTableChange != null && !notifyTableChange.isEmpty();
			case XmlaPackage.BATCH__INSERT:
				return insert != null && !insert.isEmpty();
			case XmlaPackage.BATCH__UPDATE:
				return update != null && !update.isEmpty();
			case XmlaPackage.BATCH__DROP:
				return drop != null && !drop.isEmpty();
			case XmlaPackage.BATCH__UPDATE_CELLS:
				return updateCells != null && !updateCells.isEmpty();
			case XmlaPackage.BATCH__BACKUP:
				return backup != null && !backup.isEmpty();
			case XmlaPackage.BATCH__RESTORE:
				return restore != null && !restore.isEmpty();
			case XmlaPackage.BATCH__SYNCHRONIZE:
				return synchronize != null && !synchronize.isEmpty();
			case XmlaPackage.BATCH__CANCEL:
				return cancel != null && !cancel.isEmpty();
			case XmlaPackage.BATCH__BEGIN_TRANSACTION:
				return beginTransaction != null && !beginTransaction.isEmpty();
			case XmlaPackage.BATCH__COMMIT_TRANSACTION:
				return commitTransaction != null && !commitTransaction.isEmpty();
			case XmlaPackage.BATCH__ROLLBACK_TRANSACTION:
				return rollbackTransaction != null && !rollbackTransaction.isEmpty();
			case XmlaPackage.BATCH__CLEAR_CACHE:
				return clearCache != null && !clearCache.isEmpty();
			case XmlaPackage.BATCH__SUBSCRIBE:
				return subscribe != null && !subscribe.isEmpty();
			case XmlaPackage.BATCH__UNSUBSCRIBE:
				return unsubscribe != null && !unsubscribe.isEmpty();
			case XmlaPackage.BATCH__DETACH:
				return detach != null && !detach.isEmpty();
			case XmlaPackage.BATCH__ATTACH:
				return attach != null && !attach.isEmpty();
			case XmlaPackage.BATCH__LOCK:
				return lock != null && !lock.isEmpty();
			case XmlaPackage.BATCH__UNLOCK:
				return unlock != null && !unlock.isEmpty();
			case XmlaPackage.BATCH__IMAGE_LOAD:
				return imageLoad != null && !imageLoad.isEmpty();
			case XmlaPackage.BATCH__IMAGE_SAVE:
				return imageSave != null && !imageSave.isEmpty();
			case XmlaPackage.BATCH__CLONE_DATABASE:
				return cloneDatabase != null && !cloneDatabase.isEmpty();
			case XmlaPackage.BATCH__SET_AUTH_CONTEXT:
				return setAuthContext != null && !setAuthContext.isEmpty();
			case XmlaPackage.BATCH__DBCC:
				return dBCC != null;
			case XmlaPackage.BATCH__DISCOVER:
				return discover != null && !discover.isEmpty();
			case XmlaPackage.BATCH__PROCESS_AFFECTED_OBJECTS:
				return isSetProcessAffectedObjects();
			case XmlaPackage.BATCH__TRANSACTION:
				return isSetTransaction();
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
		result.append(" (processAffectedObjects: ");
		if (processAffectedObjectsESet) result.append(processAffectedObjects); else result.append("<unset>");
		result.append(", transaction: ");
		if (transactionESet) result.append(transaction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BatchImpl
