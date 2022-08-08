/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Alter;
import org.eclipse.daanse.xmla.model.ecore.xmla.Attach;
import org.eclipse.daanse.xmla.model.ecore.xmla.Backup;
import org.eclipse.daanse.xmla.model.ecore.xmla.Batch;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cancel;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClearCache;
import org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase;
import org.eclipse.daanse.xmla.model.ecore.xmla.Command;
import org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Create;
import org.eclipse.daanse.xmla.model.ecore.xmla.DBCC;
import org.eclipse.daanse.xmla.model.ecore.xmla.Delete;
import org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations;
import org.eclipse.daanse.xmla.model.ecore.xmla.Detach;
import org.eclipse.daanse.xmla.model.ecore.xmla.Drop;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave;
import org.eclipse.daanse.xmla.model.ecore.xmla.Insert;
import org.eclipse.daanse.xmla.model.ecore.xmla.Lock;
import org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getAlter <em>Alter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getMergePartitions <em>Merge Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getDesignAggregations <em>Design Aggregations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getClearCache <em>Clear Cache</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getUnsubscribe <em>Unsubscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getBeginTransaction <em>Begin Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getCommitTransaction <em>Commit Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getRollbackTransaction <em>Rollback Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getLock <em>Lock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getUnlock <em>Unlock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getBackup <em>Backup</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getRestore <em>Restore</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getDetach <em>Detach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getUpdateCells <em>Update Cells</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getNotifyTableChange <em>Notify Table Change</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getBatch <em>Batch</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getImageLoad <em>Image Load</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getImageSave <em>Image Save</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getCloneDatabase <em>Clone Database</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getSetAuthContext <em>Set Auth Context</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommandImpl#getDBCC <em>DBCC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected Create create;

	/**
	 * The cached value of the '{@link #getAlter() <em>Alter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlter()
	 * @generated
	 * @ordered
	 */
	protected Alter alter;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected Delete delete;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.daanse.xmla.model.ecore.xmla.Process process;

	/**
	 * The cached value of the '{@link #getMergePartitions() <em>Merge Partitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergePartitions()
	 * @generated
	 * @ordered
	 */
	protected MergePartitions mergePartitions;

	/**
	 * The cached value of the '{@link #getDesignAggregations() <em>Design Aggregations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAggregations()
	 * @generated
	 * @ordered
	 */
	protected DesignAggregations designAggregations;

	/**
	 * The cached value of the '{@link #getClearCache() <em>Clear Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearCache()
	 * @generated
	 * @ordered
	 */
	protected ClearCache clearCache;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected Subscribe subscribe;

	/**
	 * The cached value of the '{@link #getUnsubscribe() <em>Unsubscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsubscribe()
	 * @generated
	 * @ordered
	 */
	protected Unsubscribe unsubscribe;

	/**
	 * The cached value of the '{@link #getCancel() <em>Cancel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel()
	 * @generated
	 * @ordered
	 */
	protected Cancel cancel;

	/**
	 * The cached value of the '{@link #getBeginTransaction() <em>Begin Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTransaction()
	 * @generated
	 * @ordered
	 */
	protected BeginTransaction beginTransaction;

	/**
	 * The cached value of the '{@link #getCommitTransaction() <em>Commit Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitTransaction()
	 * @generated
	 * @ordered
	 */
	protected CommitTransaction commitTransaction;

	/**
	 * The cached value of the '{@link #getRollbackTransaction() <em>Rollback Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackTransaction()
	 * @generated
	 * @ordered
	 */
	protected RollbackTransaction rollbackTransaction;

	/**
	 * The cached value of the '{@link #getLock() <em>Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLock()
	 * @generated
	 * @ordered
	 */
	protected Lock lock;

	/**
	 * The cached value of the '{@link #getUnlock() <em>Unlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlock()
	 * @generated
	 * @ordered
	 */
	protected Unlock unlock;

	/**
	 * The cached value of the '{@link #getBackup() <em>Backup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup()
	 * @generated
	 * @ordered
	 */
	protected Backup backup;

	/**
	 * The cached value of the '{@link #getRestore() <em>Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestore()
	 * @generated
	 * @ordered
	 */
	protected Restore restore;

	/**
	 * The cached value of the '{@link #getSynchronize() <em>Synchronize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronize()
	 * @generated
	 * @ordered
	 */
	protected Synchronize synchronize;

	/**
	 * The cached value of the '{@link #getAttach() <em>Attach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected Attach attach;

	/**
	 * The cached value of the '{@link #getDetach() <em>Detach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetach()
	 * @generated
	 * @ordered
	 */
	protected Detach detach;

	/**
	 * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsert()
	 * @generated
	 * @ordered
	 */
	protected Insert insert;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected Update update;

	/**
	 * The cached value of the '{@link #getDrop() <em>Drop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected Drop drop;

	/**
	 * The cached value of the '{@link #getUpdateCells() <em>Update Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCells()
	 * @generated
	 * @ordered
	 */
	protected UpdateCells updateCells;

	/**
	 * The cached value of the '{@link #getNotifyTableChange() <em>Notify Table Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyTableChange()
	 * @generated
	 * @ordered
	 */
	protected NotifyTableChange notifyTableChange;

	/**
	 * The cached value of the '{@link #getBatch() <em>Batch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected Batch batch;

	/**
	 * The cached value of the '{@link #getImageLoad() <em>Image Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageLoad()
	 * @generated
	 * @ordered
	 */
	protected ImageLoad imageLoad;

	/**
	 * The cached value of the '{@link #getImageSave() <em>Image Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageSave()
	 * @generated
	 * @ordered
	 */
	protected ImageSave imageSave;

	/**
	 * The cached value of the '{@link #getCloneDatabase() <em>Clone Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneDatabase()
	 * @generated
	 * @ordered
	 */
	protected CloneDatabase cloneDatabase;

	/**
	 * The cached value of the '{@link #getSetAuthContext() <em>Set Auth Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetAuthContext()
	 * @generated
	 * @ordered
	 */
	protected SetAuthContext setAuthContext;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create getCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreate(Create newCreate, NotificationChain msgs) {
		Create oldCreate = create;
		create = newCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CREATE, oldCreate, newCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(Create newCreate) {
		if (newCreate != create) {
			NotificationChain msgs = null;
			if (create != null)
				msgs = ((InternalEObject)create).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CREATE, null, msgs);
			if (newCreate != null)
				msgs = ((InternalEObject)newCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CREATE, null, msgs);
			msgs = basicSetCreate(newCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CREATE, newCreate, newCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alter getAlter() {
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlter(Alter newAlter, NotificationChain msgs) {
		Alter oldAlter = alter;
		alter = newAlter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__ALTER, oldAlter, newAlter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlter(Alter newAlter) {
		if (newAlter != alter) {
			NotificationChain msgs = null;
			if (alter != null)
				msgs = ((InternalEObject)alter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__ALTER, null, msgs);
			if (newAlter != null)
				msgs = ((InternalEObject)newAlter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__ALTER, null, msgs);
			msgs = basicSetAlter(newAlter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__ALTER, newAlter, newAlter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(Delete newDelete, NotificationChain msgs) {
		Delete oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DELETE, oldDelete, newDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(Delete newDelete) {
		if (newDelete != delete) {
			NotificationChain msgs = null;
			if (delete != null)
				msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DELETE, null, msgs);
			if (newDelete != null)
				msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DELETE, null, msgs);
			msgs = basicSetDelete(newDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DELETE, newDelete, newDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla.Process getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process newProcess, NotificationChain msgs) {
		org.eclipse.daanse.xmla.model.ecore.xmla.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__PROCESS, oldProcess, newProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergePartitions getMergePartitions() {
		return mergePartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMergePartitions(MergePartitions newMergePartitions, NotificationChain msgs) {
		MergePartitions oldMergePartitions = mergePartitions;
		mergePartitions = newMergePartitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__MERGE_PARTITIONS, oldMergePartitions, newMergePartitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergePartitions(MergePartitions newMergePartitions) {
		if (newMergePartitions != mergePartitions) {
			NotificationChain msgs = null;
			if (mergePartitions != null)
				msgs = ((InternalEObject)mergePartitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__MERGE_PARTITIONS, null, msgs);
			if (newMergePartitions != null)
				msgs = ((InternalEObject)newMergePartitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__MERGE_PARTITIONS, null, msgs);
			msgs = basicSetMergePartitions(newMergePartitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__MERGE_PARTITIONS, newMergePartitions, newMergePartitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAggregations getDesignAggregations() {
		return designAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignAggregations(DesignAggregations newDesignAggregations, NotificationChain msgs) {
		DesignAggregations oldDesignAggregations = designAggregations;
		designAggregations = newDesignAggregations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DESIGN_AGGREGATIONS, oldDesignAggregations, newDesignAggregations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignAggregations(DesignAggregations newDesignAggregations) {
		if (newDesignAggregations != designAggregations) {
			NotificationChain msgs = null;
			if (designAggregations != null)
				msgs = ((InternalEObject)designAggregations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DESIGN_AGGREGATIONS, null, msgs);
			if (newDesignAggregations != null)
				msgs = ((InternalEObject)newDesignAggregations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DESIGN_AGGREGATIONS, null, msgs);
			msgs = basicSetDesignAggregations(newDesignAggregations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DESIGN_AGGREGATIONS, newDesignAggregations, newDesignAggregations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearCache getClearCache() {
		return clearCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearCache(ClearCache newClearCache, NotificationChain msgs) {
		ClearCache oldClearCache = clearCache;
		clearCache = newClearCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CLEAR_CACHE, oldClearCache, newClearCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearCache(ClearCache newClearCache) {
		if (newClearCache != clearCache) {
			NotificationChain msgs = null;
			if (clearCache != null)
				msgs = ((InternalEObject)clearCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CLEAR_CACHE, null, msgs);
			if (newClearCache != null)
				msgs = ((InternalEObject)newClearCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CLEAR_CACHE, null, msgs);
			msgs = basicSetClearCache(newClearCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CLEAR_CACHE, newClearCache, newClearCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe getSubscribe() {
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribe(Subscribe newSubscribe, NotificationChain msgs) {
		Subscribe oldSubscribe = subscribe;
		subscribe = newSubscribe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__SUBSCRIBE, oldSubscribe, newSubscribe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribe(Subscribe newSubscribe) {
		if (newSubscribe != subscribe) {
			NotificationChain msgs = null;
			if (subscribe != null)
				msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__SUBSCRIBE, null, msgs);
			if (newSubscribe != null)
				msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__SUBSCRIBE, null, msgs);
			msgs = basicSetSubscribe(newSubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__SUBSCRIBE, newSubscribe, newSubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unsubscribe getUnsubscribe() {
		return unsubscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribe(Unsubscribe newUnsubscribe, NotificationChain msgs) {
		Unsubscribe oldUnsubscribe = unsubscribe;
		unsubscribe = newUnsubscribe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UNSUBSCRIBE, oldUnsubscribe, newUnsubscribe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsubscribe(Unsubscribe newUnsubscribe) {
		if (newUnsubscribe != unsubscribe) {
			NotificationChain msgs = null;
			if (unsubscribe != null)
				msgs = ((InternalEObject)unsubscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UNSUBSCRIBE, null, msgs);
			if (newUnsubscribe != null)
				msgs = ((InternalEObject)newUnsubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UNSUBSCRIBE, null, msgs);
			msgs = basicSetUnsubscribe(newUnsubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UNSUBSCRIBE, newUnsubscribe, newUnsubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cancel getCancel() {
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancel(Cancel newCancel, NotificationChain msgs) {
		Cancel oldCancel = cancel;
		cancel = newCancel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CANCEL, oldCancel, newCancel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancel(Cancel newCancel) {
		if (newCancel != cancel) {
			NotificationChain msgs = null;
			if (cancel != null)
				msgs = ((InternalEObject)cancel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CANCEL, null, msgs);
			if (newCancel != null)
				msgs = ((InternalEObject)newCancel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CANCEL, null, msgs);
			msgs = basicSetCancel(newCancel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CANCEL, newCancel, newCancel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginTransaction getBeginTransaction() {
		return beginTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeginTransaction(BeginTransaction newBeginTransaction, NotificationChain msgs) {
		BeginTransaction oldBeginTransaction = beginTransaction;
		beginTransaction = newBeginTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__BEGIN_TRANSACTION, oldBeginTransaction, newBeginTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginTransaction(BeginTransaction newBeginTransaction) {
		if (newBeginTransaction != beginTransaction) {
			NotificationChain msgs = null;
			if (beginTransaction != null)
				msgs = ((InternalEObject)beginTransaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__BEGIN_TRANSACTION, null, msgs);
			if (newBeginTransaction != null)
				msgs = ((InternalEObject)newBeginTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__BEGIN_TRANSACTION, null, msgs);
			msgs = basicSetBeginTransaction(newBeginTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__BEGIN_TRANSACTION, newBeginTransaction, newBeginTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitTransaction getCommitTransaction() {
		return commitTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitTransaction(CommitTransaction newCommitTransaction, NotificationChain msgs) {
		CommitTransaction oldCommitTransaction = commitTransaction;
		commitTransaction = newCommitTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__COMMIT_TRANSACTION, oldCommitTransaction, newCommitTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitTransaction(CommitTransaction newCommitTransaction) {
		if (newCommitTransaction != commitTransaction) {
			NotificationChain msgs = null;
			if (commitTransaction != null)
				msgs = ((InternalEObject)commitTransaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__COMMIT_TRANSACTION, null, msgs);
			if (newCommitTransaction != null)
				msgs = ((InternalEObject)newCommitTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__COMMIT_TRANSACTION, null, msgs);
			msgs = basicSetCommitTransaction(newCommitTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__COMMIT_TRANSACTION, newCommitTransaction, newCommitTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackTransaction getRollbackTransaction() {
		return rollbackTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollbackTransaction(RollbackTransaction newRollbackTransaction, NotificationChain msgs) {
		RollbackTransaction oldRollbackTransaction = rollbackTransaction;
		rollbackTransaction = newRollbackTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__ROLLBACK_TRANSACTION, oldRollbackTransaction, newRollbackTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollbackTransaction(RollbackTransaction newRollbackTransaction) {
		if (newRollbackTransaction != rollbackTransaction) {
			NotificationChain msgs = null;
			if (rollbackTransaction != null)
				msgs = ((InternalEObject)rollbackTransaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__ROLLBACK_TRANSACTION, null, msgs);
			if (newRollbackTransaction != null)
				msgs = ((InternalEObject)newRollbackTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__ROLLBACK_TRANSACTION, null, msgs);
			msgs = basicSetRollbackTransaction(newRollbackTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__ROLLBACK_TRANSACTION, newRollbackTransaction, newRollbackTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lock getLock() {
		return lock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLock(Lock newLock, NotificationChain msgs) {
		Lock oldLock = lock;
		lock = newLock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__LOCK, oldLock, newLock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLock(Lock newLock) {
		if (newLock != lock) {
			NotificationChain msgs = null;
			if (lock != null)
				msgs = ((InternalEObject)lock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__LOCK, null, msgs);
			if (newLock != null)
				msgs = ((InternalEObject)newLock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__LOCK, null, msgs);
			msgs = basicSetLock(newLock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__LOCK, newLock, newLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unlock getUnlock() {
		return unlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlock(Unlock newUnlock, NotificationChain msgs) {
		Unlock oldUnlock = unlock;
		unlock = newUnlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UNLOCK, oldUnlock, newUnlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlock(Unlock newUnlock) {
		if (newUnlock != unlock) {
			NotificationChain msgs = null;
			if (unlock != null)
				msgs = ((InternalEObject)unlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UNLOCK, null, msgs);
			if (newUnlock != null)
				msgs = ((InternalEObject)newUnlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UNLOCK, null, msgs);
			msgs = basicSetUnlock(newUnlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UNLOCK, newUnlock, newUnlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backup getBackup() {
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackup(Backup newBackup, NotificationChain msgs) {
		Backup oldBackup = backup;
		backup = newBackup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__BACKUP, oldBackup, newBackup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackup(Backup newBackup) {
		if (newBackup != backup) {
			NotificationChain msgs = null;
			if (backup != null)
				msgs = ((InternalEObject)backup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__BACKUP, null, msgs);
			if (newBackup != null)
				msgs = ((InternalEObject)newBackup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__BACKUP, null, msgs);
			msgs = basicSetBackup(newBackup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__BACKUP, newBackup, newBackup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restore getRestore() {
		return restore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestore(Restore newRestore, NotificationChain msgs) {
		Restore oldRestore = restore;
		restore = newRestore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__RESTORE, oldRestore, newRestore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestore(Restore newRestore) {
		if (newRestore != restore) {
			NotificationChain msgs = null;
			if (restore != null)
				msgs = ((InternalEObject)restore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__RESTORE, null, msgs);
			if (newRestore != null)
				msgs = ((InternalEObject)newRestore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__RESTORE, null, msgs);
			msgs = basicSetRestore(newRestore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__RESTORE, newRestore, newRestore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronize getSynchronize() {
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronize(Synchronize newSynchronize, NotificationChain msgs) {
		Synchronize oldSynchronize = synchronize;
		synchronize = newSynchronize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__SYNCHRONIZE, oldSynchronize, newSynchronize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronize(Synchronize newSynchronize) {
		if (newSynchronize != synchronize) {
			NotificationChain msgs = null;
			if (synchronize != null)
				msgs = ((InternalEObject)synchronize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__SYNCHRONIZE, null, msgs);
			if (newSynchronize != null)
				msgs = ((InternalEObject)newSynchronize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__SYNCHRONIZE, null, msgs);
			msgs = basicSetSynchronize(newSynchronize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__SYNCHRONIZE, newSynchronize, newSynchronize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attach getAttach() {
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach(Attach newAttach, NotificationChain msgs) {
		Attach oldAttach = attach;
		attach = newAttach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__ATTACH, oldAttach, newAttach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach(Attach newAttach) {
		if (newAttach != attach) {
			NotificationChain msgs = null;
			if (attach != null)
				msgs = ((InternalEObject)attach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__ATTACH, null, msgs);
			if (newAttach != null)
				msgs = ((InternalEObject)newAttach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__ATTACH, null, msgs);
			msgs = basicSetAttach(newAttach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__ATTACH, newAttach, newAttach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detach getDetach() {
		return detach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetach(Detach newDetach, NotificationChain msgs) {
		Detach oldDetach = detach;
		detach = newDetach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DETACH, oldDetach, newDetach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetach(Detach newDetach) {
		if (newDetach != detach) {
			NotificationChain msgs = null;
			if (detach != null)
				msgs = ((InternalEObject)detach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DETACH, null, msgs);
			if (newDetach != null)
				msgs = ((InternalEObject)newDetach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DETACH, null, msgs);
			msgs = basicSetDetach(newDetach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DETACH, newDetach, newDetach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert getInsert() {
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsert(Insert newInsert, NotificationChain msgs) {
		Insert oldInsert = insert;
		insert = newInsert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__INSERT, oldInsert, newInsert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(Insert newInsert) {
		if (newInsert != insert) {
			NotificationChain msgs = null;
			if (insert != null)
				msgs = ((InternalEObject)insert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__INSERT, null, msgs);
			if (newInsert != null)
				msgs = ((InternalEObject)newInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__INSERT, null, msgs);
			msgs = basicSetInsert(newInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__INSERT, newInsert, newInsert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update getUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(Update newUpdate, NotificationChain msgs) {
		Update oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UPDATE, oldUpdate, newUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(Update newUpdate) {
		if (newUpdate != update) {
			NotificationChain msgs = null;
			if (update != null)
				msgs = ((InternalEObject)update).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UPDATE, null, msgs);
			if (newUpdate != null)
				msgs = ((InternalEObject)newUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UPDATE, null, msgs);
			msgs = basicSetUpdate(newUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UPDATE, newUpdate, newUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop getDrop() {
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrop(Drop newDrop, NotificationChain msgs) {
		Drop oldDrop = drop;
		drop = newDrop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DROP, oldDrop, newDrop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrop(Drop newDrop) {
		if (newDrop != drop) {
			NotificationChain msgs = null;
			if (drop != null)
				msgs = ((InternalEObject)drop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DROP, null, msgs);
			if (newDrop != null)
				msgs = ((InternalEObject)newDrop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DROP, null, msgs);
			msgs = basicSetDrop(newDrop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DROP, newDrop, newDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateCells getUpdateCells() {
		return updateCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateCells(UpdateCells newUpdateCells, NotificationChain msgs) {
		UpdateCells oldUpdateCells = updateCells;
		updateCells = newUpdateCells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UPDATE_CELLS, oldUpdateCells, newUpdateCells);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateCells(UpdateCells newUpdateCells) {
		if (newUpdateCells != updateCells) {
			NotificationChain msgs = null;
			if (updateCells != null)
				msgs = ((InternalEObject)updateCells).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UPDATE_CELLS, null, msgs);
			if (newUpdateCells != null)
				msgs = ((InternalEObject)newUpdateCells).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__UPDATE_CELLS, null, msgs);
			msgs = basicSetUpdateCells(newUpdateCells, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__UPDATE_CELLS, newUpdateCells, newUpdateCells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyTableChange getNotifyTableChange() {
		return notifyTableChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotifyTableChange(NotifyTableChange newNotifyTableChange, NotificationChain msgs) {
		NotifyTableChange oldNotifyTableChange = notifyTableChange;
		notifyTableChange = newNotifyTableChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE, oldNotifyTableChange, newNotifyTableChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifyTableChange(NotifyTableChange newNotifyTableChange) {
		if (newNotifyTableChange != notifyTableChange) {
			NotificationChain msgs = null;
			if (notifyTableChange != null)
				msgs = ((InternalEObject)notifyTableChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE, null, msgs);
			if (newNotifyTableChange != null)
				msgs = ((InternalEObject)newNotifyTableChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE, null, msgs);
			msgs = basicSetNotifyTableChange(newNotifyTableChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE, newNotifyTableChange, newNotifyTableChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batch getBatch() {
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatch(Batch newBatch, NotificationChain msgs) {
		Batch oldBatch = batch;
		batch = newBatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__BATCH, oldBatch, newBatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatch(Batch newBatch) {
		if (newBatch != batch) {
			NotificationChain msgs = null;
			if (batch != null)
				msgs = ((InternalEObject)batch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__BATCH, null, msgs);
			if (newBatch != null)
				msgs = ((InternalEObject)newBatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__BATCH, null, msgs);
			msgs = basicSetBatch(newBatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__BATCH, newBatch, newBatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageLoad getImageLoad() {
		return imageLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageLoad(ImageLoad newImageLoad, NotificationChain msgs) {
		ImageLoad oldImageLoad = imageLoad;
		imageLoad = newImageLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__IMAGE_LOAD, oldImageLoad, newImageLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageLoad(ImageLoad newImageLoad) {
		if (newImageLoad != imageLoad) {
			NotificationChain msgs = null;
			if (imageLoad != null)
				msgs = ((InternalEObject)imageLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__IMAGE_LOAD, null, msgs);
			if (newImageLoad != null)
				msgs = ((InternalEObject)newImageLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__IMAGE_LOAD, null, msgs);
			msgs = basicSetImageLoad(newImageLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__IMAGE_LOAD, newImageLoad, newImageLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSave getImageSave() {
		return imageSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageSave(ImageSave newImageSave, NotificationChain msgs) {
		ImageSave oldImageSave = imageSave;
		imageSave = newImageSave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__IMAGE_SAVE, oldImageSave, newImageSave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageSave(ImageSave newImageSave) {
		if (newImageSave != imageSave) {
			NotificationChain msgs = null;
			if (imageSave != null)
				msgs = ((InternalEObject)imageSave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__IMAGE_SAVE, null, msgs);
			if (newImageSave != null)
				msgs = ((InternalEObject)newImageSave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__IMAGE_SAVE, null, msgs);
			msgs = basicSetImageSave(newImageSave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__IMAGE_SAVE, newImageSave, newImageSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloneDatabase getCloneDatabase() {
		return cloneDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloneDatabase(CloneDatabase newCloneDatabase, NotificationChain msgs) {
		CloneDatabase oldCloneDatabase = cloneDatabase;
		cloneDatabase = newCloneDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CLONE_DATABASE, oldCloneDatabase, newCloneDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloneDatabase(CloneDatabase newCloneDatabase) {
		if (newCloneDatabase != cloneDatabase) {
			NotificationChain msgs = null;
			if (cloneDatabase != null)
				msgs = ((InternalEObject)cloneDatabase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CLONE_DATABASE, null, msgs);
			if (newCloneDatabase != null)
				msgs = ((InternalEObject)newCloneDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__CLONE_DATABASE, null, msgs);
			msgs = basicSetCloneDatabase(newCloneDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__CLONE_DATABASE, newCloneDatabase, newCloneDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAuthContext getSetAuthContext() {
		return setAuthContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetAuthContext(SetAuthContext newSetAuthContext, NotificationChain msgs) {
		SetAuthContext oldSetAuthContext = setAuthContext;
		setAuthContext = newSetAuthContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__SET_AUTH_CONTEXT, oldSetAuthContext, newSetAuthContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetAuthContext(SetAuthContext newSetAuthContext) {
		if (newSetAuthContext != setAuthContext) {
			NotificationChain msgs = null;
			if (setAuthContext != null)
				msgs = ((InternalEObject)setAuthContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__SET_AUTH_CONTEXT, null, msgs);
			if (newSetAuthContext != null)
				msgs = ((InternalEObject)newSetAuthContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__SET_AUTH_CONTEXT, null, msgs);
			msgs = basicSetSetAuthContext(newSetAuthContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__SET_AUTH_CONTEXT, newSetAuthContext, newSetAuthContext));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DBCC, oldDBCC, newDBCC);
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
				msgs = ((InternalEObject)dBCC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DBCC, null, msgs);
			if (newDBCC != null)
				msgs = ((InternalEObject)newDBCC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.COMMAND__DBCC, null, msgs);
			msgs = basicSetDBCC(newDBCC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMAND__DBCC, newDBCC, newDBCC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.COMMAND__CREATE:
				return basicSetCreate(null, msgs);
			case XmlaPackage.COMMAND__ALTER:
				return basicSetAlter(null, msgs);
			case XmlaPackage.COMMAND__DELETE:
				return basicSetDelete(null, msgs);
			case XmlaPackage.COMMAND__PROCESS:
				return basicSetProcess(null, msgs);
			case XmlaPackage.COMMAND__MERGE_PARTITIONS:
				return basicSetMergePartitions(null, msgs);
			case XmlaPackage.COMMAND__DESIGN_AGGREGATIONS:
				return basicSetDesignAggregations(null, msgs);
			case XmlaPackage.COMMAND__CLEAR_CACHE:
				return basicSetClearCache(null, msgs);
			case XmlaPackage.COMMAND__SUBSCRIBE:
				return basicSetSubscribe(null, msgs);
			case XmlaPackage.COMMAND__UNSUBSCRIBE:
				return basicSetUnsubscribe(null, msgs);
			case XmlaPackage.COMMAND__CANCEL:
				return basicSetCancel(null, msgs);
			case XmlaPackage.COMMAND__BEGIN_TRANSACTION:
				return basicSetBeginTransaction(null, msgs);
			case XmlaPackage.COMMAND__COMMIT_TRANSACTION:
				return basicSetCommitTransaction(null, msgs);
			case XmlaPackage.COMMAND__ROLLBACK_TRANSACTION:
				return basicSetRollbackTransaction(null, msgs);
			case XmlaPackage.COMMAND__LOCK:
				return basicSetLock(null, msgs);
			case XmlaPackage.COMMAND__UNLOCK:
				return basicSetUnlock(null, msgs);
			case XmlaPackage.COMMAND__BACKUP:
				return basicSetBackup(null, msgs);
			case XmlaPackage.COMMAND__RESTORE:
				return basicSetRestore(null, msgs);
			case XmlaPackage.COMMAND__SYNCHRONIZE:
				return basicSetSynchronize(null, msgs);
			case XmlaPackage.COMMAND__ATTACH:
				return basicSetAttach(null, msgs);
			case XmlaPackage.COMMAND__DETACH:
				return basicSetDetach(null, msgs);
			case XmlaPackage.COMMAND__INSERT:
				return basicSetInsert(null, msgs);
			case XmlaPackage.COMMAND__UPDATE:
				return basicSetUpdate(null, msgs);
			case XmlaPackage.COMMAND__DROP:
				return basicSetDrop(null, msgs);
			case XmlaPackage.COMMAND__UPDATE_CELLS:
				return basicSetUpdateCells(null, msgs);
			case XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE:
				return basicSetNotifyTableChange(null, msgs);
			case XmlaPackage.COMMAND__BATCH:
				return basicSetBatch(null, msgs);
			case XmlaPackage.COMMAND__IMAGE_LOAD:
				return basicSetImageLoad(null, msgs);
			case XmlaPackage.COMMAND__IMAGE_SAVE:
				return basicSetImageSave(null, msgs);
			case XmlaPackage.COMMAND__CLONE_DATABASE:
				return basicSetCloneDatabase(null, msgs);
			case XmlaPackage.COMMAND__SET_AUTH_CONTEXT:
				return basicSetSetAuthContext(null, msgs);
			case XmlaPackage.COMMAND__DBCC:
				return basicSetDBCC(null, msgs);
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
			case XmlaPackage.COMMAND__STATEMENT:
				return getStatement();
			case XmlaPackage.COMMAND__CREATE:
				return getCreate();
			case XmlaPackage.COMMAND__ALTER:
				return getAlter();
			case XmlaPackage.COMMAND__DELETE:
				return getDelete();
			case XmlaPackage.COMMAND__PROCESS:
				return getProcess();
			case XmlaPackage.COMMAND__MERGE_PARTITIONS:
				return getMergePartitions();
			case XmlaPackage.COMMAND__DESIGN_AGGREGATIONS:
				return getDesignAggregations();
			case XmlaPackage.COMMAND__CLEAR_CACHE:
				return getClearCache();
			case XmlaPackage.COMMAND__SUBSCRIBE:
				return getSubscribe();
			case XmlaPackage.COMMAND__UNSUBSCRIBE:
				return getUnsubscribe();
			case XmlaPackage.COMMAND__CANCEL:
				return getCancel();
			case XmlaPackage.COMMAND__BEGIN_TRANSACTION:
				return getBeginTransaction();
			case XmlaPackage.COMMAND__COMMIT_TRANSACTION:
				return getCommitTransaction();
			case XmlaPackage.COMMAND__ROLLBACK_TRANSACTION:
				return getRollbackTransaction();
			case XmlaPackage.COMMAND__LOCK:
				return getLock();
			case XmlaPackage.COMMAND__UNLOCK:
				return getUnlock();
			case XmlaPackage.COMMAND__BACKUP:
				return getBackup();
			case XmlaPackage.COMMAND__RESTORE:
				return getRestore();
			case XmlaPackage.COMMAND__SYNCHRONIZE:
				return getSynchronize();
			case XmlaPackage.COMMAND__ATTACH:
				return getAttach();
			case XmlaPackage.COMMAND__DETACH:
				return getDetach();
			case XmlaPackage.COMMAND__INSERT:
				return getInsert();
			case XmlaPackage.COMMAND__UPDATE:
				return getUpdate();
			case XmlaPackage.COMMAND__DROP:
				return getDrop();
			case XmlaPackage.COMMAND__UPDATE_CELLS:
				return getUpdateCells();
			case XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE:
				return getNotifyTableChange();
			case XmlaPackage.COMMAND__BATCH:
				return getBatch();
			case XmlaPackage.COMMAND__IMAGE_LOAD:
				return getImageLoad();
			case XmlaPackage.COMMAND__IMAGE_SAVE:
				return getImageSave();
			case XmlaPackage.COMMAND__CLONE_DATABASE:
				return getCloneDatabase();
			case XmlaPackage.COMMAND__SET_AUTH_CONTEXT:
				return getSetAuthContext();
			case XmlaPackage.COMMAND__DBCC:
				return getDBCC();
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
			case XmlaPackage.COMMAND__STATEMENT:
				setStatement((String)newValue);
				return;
			case XmlaPackage.COMMAND__CREATE:
				setCreate((Create)newValue);
				return;
			case XmlaPackage.COMMAND__ALTER:
				setAlter((Alter)newValue);
				return;
			case XmlaPackage.COMMAND__DELETE:
				setDelete((Delete)newValue);
				return;
			case XmlaPackage.COMMAND__PROCESS:
				setProcess((org.eclipse.daanse.xmla.model.ecore.xmla.Process)newValue);
				return;
			case XmlaPackage.COMMAND__MERGE_PARTITIONS:
				setMergePartitions((MergePartitions)newValue);
				return;
			case XmlaPackage.COMMAND__DESIGN_AGGREGATIONS:
				setDesignAggregations((DesignAggregations)newValue);
				return;
			case XmlaPackage.COMMAND__CLEAR_CACHE:
				setClearCache((ClearCache)newValue);
				return;
			case XmlaPackage.COMMAND__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
				return;
			case XmlaPackage.COMMAND__UNSUBSCRIBE:
				setUnsubscribe((Unsubscribe)newValue);
				return;
			case XmlaPackage.COMMAND__CANCEL:
				setCancel((Cancel)newValue);
				return;
			case XmlaPackage.COMMAND__BEGIN_TRANSACTION:
				setBeginTransaction((BeginTransaction)newValue);
				return;
			case XmlaPackage.COMMAND__COMMIT_TRANSACTION:
				setCommitTransaction((CommitTransaction)newValue);
				return;
			case XmlaPackage.COMMAND__ROLLBACK_TRANSACTION:
				setRollbackTransaction((RollbackTransaction)newValue);
				return;
			case XmlaPackage.COMMAND__LOCK:
				setLock((Lock)newValue);
				return;
			case XmlaPackage.COMMAND__UNLOCK:
				setUnlock((Unlock)newValue);
				return;
			case XmlaPackage.COMMAND__BACKUP:
				setBackup((Backup)newValue);
				return;
			case XmlaPackage.COMMAND__RESTORE:
				setRestore((Restore)newValue);
				return;
			case XmlaPackage.COMMAND__SYNCHRONIZE:
				setSynchronize((Synchronize)newValue);
				return;
			case XmlaPackage.COMMAND__ATTACH:
				setAttach((Attach)newValue);
				return;
			case XmlaPackage.COMMAND__DETACH:
				setDetach((Detach)newValue);
				return;
			case XmlaPackage.COMMAND__INSERT:
				setInsert((Insert)newValue);
				return;
			case XmlaPackage.COMMAND__UPDATE:
				setUpdate((Update)newValue);
				return;
			case XmlaPackage.COMMAND__DROP:
				setDrop((Drop)newValue);
				return;
			case XmlaPackage.COMMAND__UPDATE_CELLS:
				setUpdateCells((UpdateCells)newValue);
				return;
			case XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE:
				setNotifyTableChange((NotifyTableChange)newValue);
				return;
			case XmlaPackage.COMMAND__BATCH:
				setBatch((Batch)newValue);
				return;
			case XmlaPackage.COMMAND__IMAGE_LOAD:
				setImageLoad((ImageLoad)newValue);
				return;
			case XmlaPackage.COMMAND__IMAGE_SAVE:
				setImageSave((ImageSave)newValue);
				return;
			case XmlaPackage.COMMAND__CLONE_DATABASE:
				setCloneDatabase((CloneDatabase)newValue);
				return;
			case XmlaPackage.COMMAND__SET_AUTH_CONTEXT:
				setSetAuthContext((SetAuthContext)newValue);
				return;
			case XmlaPackage.COMMAND__DBCC:
				setDBCC((DBCC)newValue);
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
			case XmlaPackage.COMMAND__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case XmlaPackage.COMMAND__CREATE:
				setCreate((Create)null);
				return;
			case XmlaPackage.COMMAND__ALTER:
				setAlter((Alter)null);
				return;
			case XmlaPackage.COMMAND__DELETE:
				setDelete((Delete)null);
				return;
			case XmlaPackage.COMMAND__PROCESS:
				setProcess((org.eclipse.daanse.xmla.model.ecore.xmla.Process)null);
				return;
			case XmlaPackage.COMMAND__MERGE_PARTITIONS:
				setMergePartitions((MergePartitions)null);
				return;
			case XmlaPackage.COMMAND__DESIGN_AGGREGATIONS:
				setDesignAggregations((DesignAggregations)null);
				return;
			case XmlaPackage.COMMAND__CLEAR_CACHE:
				setClearCache((ClearCache)null);
				return;
			case XmlaPackage.COMMAND__SUBSCRIBE:
				setSubscribe((Subscribe)null);
				return;
			case XmlaPackage.COMMAND__UNSUBSCRIBE:
				setUnsubscribe((Unsubscribe)null);
				return;
			case XmlaPackage.COMMAND__CANCEL:
				setCancel((Cancel)null);
				return;
			case XmlaPackage.COMMAND__BEGIN_TRANSACTION:
				setBeginTransaction((BeginTransaction)null);
				return;
			case XmlaPackage.COMMAND__COMMIT_TRANSACTION:
				setCommitTransaction((CommitTransaction)null);
				return;
			case XmlaPackage.COMMAND__ROLLBACK_TRANSACTION:
				setRollbackTransaction((RollbackTransaction)null);
				return;
			case XmlaPackage.COMMAND__LOCK:
				setLock((Lock)null);
				return;
			case XmlaPackage.COMMAND__UNLOCK:
				setUnlock((Unlock)null);
				return;
			case XmlaPackage.COMMAND__BACKUP:
				setBackup((Backup)null);
				return;
			case XmlaPackage.COMMAND__RESTORE:
				setRestore((Restore)null);
				return;
			case XmlaPackage.COMMAND__SYNCHRONIZE:
				setSynchronize((Synchronize)null);
				return;
			case XmlaPackage.COMMAND__ATTACH:
				setAttach((Attach)null);
				return;
			case XmlaPackage.COMMAND__DETACH:
				setDetach((Detach)null);
				return;
			case XmlaPackage.COMMAND__INSERT:
				setInsert((Insert)null);
				return;
			case XmlaPackage.COMMAND__UPDATE:
				setUpdate((Update)null);
				return;
			case XmlaPackage.COMMAND__DROP:
				setDrop((Drop)null);
				return;
			case XmlaPackage.COMMAND__UPDATE_CELLS:
				setUpdateCells((UpdateCells)null);
				return;
			case XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE:
				setNotifyTableChange((NotifyTableChange)null);
				return;
			case XmlaPackage.COMMAND__BATCH:
				setBatch((Batch)null);
				return;
			case XmlaPackage.COMMAND__IMAGE_LOAD:
				setImageLoad((ImageLoad)null);
				return;
			case XmlaPackage.COMMAND__IMAGE_SAVE:
				setImageSave((ImageSave)null);
				return;
			case XmlaPackage.COMMAND__CLONE_DATABASE:
				setCloneDatabase((CloneDatabase)null);
				return;
			case XmlaPackage.COMMAND__SET_AUTH_CONTEXT:
				setSetAuthContext((SetAuthContext)null);
				return;
			case XmlaPackage.COMMAND__DBCC:
				setDBCC((DBCC)null);
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
			case XmlaPackage.COMMAND__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case XmlaPackage.COMMAND__CREATE:
				return create != null;
			case XmlaPackage.COMMAND__ALTER:
				return alter != null;
			case XmlaPackage.COMMAND__DELETE:
				return delete != null;
			case XmlaPackage.COMMAND__PROCESS:
				return process != null;
			case XmlaPackage.COMMAND__MERGE_PARTITIONS:
				return mergePartitions != null;
			case XmlaPackage.COMMAND__DESIGN_AGGREGATIONS:
				return designAggregations != null;
			case XmlaPackage.COMMAND__CLEAR_CACHE:
				return clearCache != null;
			case XmlaPackage.COMMAND__SUBSCRIBE:
				return subscribe != null;
			case XmlaPackage.COMMAND__UNSUBSCRIBE:
				return unsubscribe != null;
			case XmlaPackage.COMMAND__CANCEL:
				return cancel != null;
			case XmlaPackage.COMMAND__BEGIN_TRANSACTION:
				return beginTransaction != null;
			case XmlaPackage.COMMAND__COMMIT_TRANSACTION:
				return commitTransaction != null;
			case XmlaPackage.COMMAND__ROLLBACK_TRANSACTION:
				return rollbackTransaction != null;
			case XmlaPackage.COMMAND__LOCK:
				return lock != null;
			case XmlaPackage.COMMAND__UNLOCK:
				return unlock != null;
			case XmlaPackage.COMMAND__BACKUP:
				return backup != null;
			case XmlaPackage.COMMAND__RESTORE:
				return restore != null;
			case XmlaPackage.COMMAND__SYNCHRONIZE:
				return synchronize != null;
			case XmlaPackage.COMMAND__ATTACH:
				return attach != null;
			case XmlaPackage.COMMAND__DETACH:
				return detach != null;
			case XmlaPackage.COMMAND__INSERT:
				return insert != null;
			case XmlaPackage.COMMAND__UPDATE:
				return update != null;
			case XmlaPackage.COMMAND__DROP:
				return drop != null;
			case XmlaPackage.COMMAND__UPDATE_CELLS:
				return updateCells != null;
			case XmlaPackage.COMMAND__NOTIFY_TABLE_CHANGE:
				return notifyTableChange != null;
			case XmlaPackage.COMMAND__BATCH:
				return batch != null;
			case XmlaPackage.COMMAND__IMAGE_LOAD:
				return imageLoad != null;
			case XmlaPackage.COMMAND__IMAGE_SAVE:
				return imageSave != null;
			case XmlaPackage.COMMAND__CLONE_DATABASE:
				return cloneDatabase != null;
			case XmlaPackage.COMMAND__SET_AUTH_CONTEXT:
				return setAuthContext != null;
			case XmlaPackage.COMMAND__DBCC:
				return dBCC != null;
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
		result.append(" (statement: ");
		result.append(statement);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
