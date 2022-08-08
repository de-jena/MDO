/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDataSourceView <em>Data Source View</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getAlter <em>Alter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getMergePartitions <em>Merge Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDesignAggregations <em>Design Aggregations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getNotifyTableChange <em>Notify Table Change</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getUpdateCells <em>Update Cells</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getBackup <em>Backup</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getRestore <em>Restore</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getCancel <em>Cancel</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getBeginTransaction <em>Begin Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getCommitTransaction <em>Commit Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getRollbackTransaction <em>Rollback Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getClearCache <em>Clear Cache</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getUnsubscribe <em>Unsubscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDetach <em>Detach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getAttach <em>Attach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getLock <em>Lock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getUnlock <em>Unlock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getImageLoad <em>Image Load</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getImageSave <em>Image Save</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getCloneDatabase <em>Clone Database</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getSetAuthContext <em>Set Auth Context</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDBCC <em>DBCC</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDiscover <em>Discover</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isProcessAffectedObjects <em>Process Affected Objects</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch()
 * @model extendedMetaData="name='Batch' kind='elementOnly'"
 * @generated
 */
public interface Batch extends EObject {
	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Parallel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parallel'"
	 * @generated
	 */
	EList<ParallelType> getParallel();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference.
	 * @see #setBindings(OutOfLineBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Bindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bindings'"
	 * @generated
	 */
	OutOfLineBinding getBindings();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getBindings <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' containment reference.
	 * @see #getBindings()
	 * @generated
	 */
	void setBindings(OutOfLineBinding value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_DataSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSource'"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDataSource <em>Data Source</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_DataSourceView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourceView'"
	 * @generated
	 */
	DataSourceView getDataSourceView();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDataSourceView <em>Data Source View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source View</em>' containment reference.
	 * @see #getDataSourceView()
	 * @generated
	 */
	void setDataSourceView(DataSourceView value);

	/**
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Create}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Create()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Create'"
	 * @generated
	 */
	EList<Create> getCreate();

	/**
	 * Returns the value of the '<em><b>Alter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Alter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Alter'"
	 * @generated
	 */
	EList<Alter> getAlter();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Delete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Delete'"
	 * @generated
	 */
	EList<Delete> getDelete();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Process()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Process'"
	 * @generated
	 */
	EList<org.eclipse.daanse.xmla.model.ecore.xmla.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Merge Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Partitions</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_MergePartitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MergePartitions'"
	 * @generated
	 */
	EList<MergePartitions> getMergePartitions();

	/**
	 * Returns the value of the '<em><b>Design Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Aggregations</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_DesignAggregations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DesignAggregations'"
	 * @generated
	 */
	EList<DesignAggregations> getDesignAggregations();

	/**
	 * Returns the value of the '<em><b>Notify Table Change</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify Table Change</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_NotifyTableChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotifyTableChange'"
	 * @generated
	 */
	EList<NotifyTableChange> getNotifyTableChange();

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Insert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Insert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Insert'"
	 * @generated
	 */
	EList<Insert> getInsert();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Update}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Update()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Update'"
	 * @generated
	 */
	EList<Update> getUpdate();

	/**
	 * Returns the value of the '<em><b>Drop</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Drop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Drop'"
	 * @generated
	 */
	EList<Drop> getDrop();

	/**
	 * Returns the value of the '<em><b>Update Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.UpdateCells}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Cells</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_UpdateCells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateCells'"
	 * @generated
	 */
	EList<UpdateCells> getUpdateCells();

	/**
	 * Returns the value of the '<em><b>Backup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Backup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Backup'"
	 * @generated
	 */
	EList<Backup> getBackup();

	/**
	 * Returns the value of the '<em><b>Restore</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restore</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Restore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Restore'"
	 * @generated
	 */
	EList<Restore> getRestore();

	/**
	 * Returns the value of the '<em><b>Synchronize</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Synchronize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Synchronize'"
	 * @generated
	 */
	EList<Synchronize> getSynchronize();

	/**
	 * Returns the value of the '<em><b>Cancel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Cancel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cancel'"
	 * @generated
	 */
	EList<Cancel> getCancel();

	/**
	 * Returns the value of the '<em><b>Begin Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Transaction</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_BeginTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BeginTransaction'"
	 * @generated
	 */
	EList<BeginTransaction> getBeginTransaction();

	/**
	 * Returns the value of the '<em><b>Commit Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Transaction</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_CommitTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommitTransaction'"
	 * @generated
	 */
	EList<CommitTransaction> getCommitTransaction();

	/**
	 * Returns the value of the '<em><b>Rollback Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.RollbackTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback Transaction</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_RollbackTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RollbackTransaction'"
	 * @generated
	 */
	EList<RollbackTransaction> getRollbackTransaction();

	/**
	 * Returns the value of the '<em><b>Clear Cache</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ClearCache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Cache</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_ClearCache()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClearCache'"
	 * @generated
	 */
	EList<ClearCache> getClearCache();

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Subscribe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Subscribe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subscribe'"
	 * @generated
	 */
	EList<Subscribe> getSubscribe();

	/**
	 * Returns the value of the '<em><b>Unsubscribe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Unsubscribe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Unsubscribe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unsubscribe'"
	 * @generated
	 */
	EList<Unsubscribe> getUnsubscribe();

	/**
	 * Returns the value of the '<em><b>Detach</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Detach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Detach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Detach'"
	 * @generated
	 */
	EList<Detach> getDetach();

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Attach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attach'"
	 * @generated
	 */
	EList<Attach> getAttach();

	/**
	 * Returns the value of the '<em><b>Lock</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Lock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Lock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lock'"
	 * @generated
	 */
	EList<Lock> getLock();

	/**
	 * Returns the value of the '<em><b>Unlock</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Unlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Unlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unlock'"
	 * @generated
	 */
	EList<Unlock> getUnlock();

	/**
	 * Returns the value of the '<em><b>Image Load</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Load</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_ImageLoad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageLoad'"
	 * @generated
	 */
	EList<ImageLoad> getImageLoad();

	/**
	 * Returns the value of the '<em><b>Image Save</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Save</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_ImageSave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageSave'"
	 * @generated
	 */
	EList<ImageSave> getImageSave();

	/**
	 * Returns the value of the '<em><b>Clone Database</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone Database</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_CloneDatabase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CloneDatabase'"
	 * @generated
	 */
	EList<CloneDatabase> getCloneDatabase();

	/**
	 * Returns the value of the '<em><b>Set Auth Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Auth Context</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_SetAuthContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetAuthContext'"
	 * @generated
	 */
	EList<SetAuthContext> getSetAuthContext();

	/**
	 * Returns the value of the '<em><b>DBCC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DBCC</em>' containment reference.
	 * @see #setDBCC(DBCC)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_DBCC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DBCC'"
	 * @generated
	 */
	DBCC getDBCC();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#getDBCC <em>DBCC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBCC</em>' containment reference.
	 * @see #getDBCC()
	 * @generated
	 */
	void setDBCC(DBCC value);

	/**
	 * Returns the value of the '<em><b>Discover</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discover</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Discover()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Discover' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiscoverType> getDiscover();

	/**
	 * Returns the value of the '<em><b>Process Affected Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Affected Objects</em>' attribute.
	 * @see #isSetProcessAffectedObjects()
	 * @see #unsetProcessAffectedObjects()
	 * @see #setProcessAffectedObjects(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_ProcessAffectedObjects()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ProcessAffectedObjects'"
	 * @generated
	 */
	boolean isProcessAffectedObjects();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isProcessAffectedObjects <em>Process Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Affected Objects</em>' attribute.
	 * @see #isSetProcessAffectedObjects()
	 * @see #unsetProcessAffectedObjects()
	 * @see #isProcessAffectedObjects()
	 * @generated
	 */
	void setProcessAffectedObjects(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isProcessAffectedObjects <em>Process Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessAffectedObjects()
	 * @see #isProcessAffectedObjects()
	 * @see #setProcessAffectedObjects(boolean)
	 * @generated
	 */
	void unsetProcessAffectedObjects();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isProcessAffectedObjects <em>Process Affected Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Affected Objects</em>' attribute is set.
	 * @see #unsetProcessAffectedObjects()
	 * @see #isProcessAffectedObjects()
	 * @see #setProcessAffectedObjects(boolean)
	 * @generated
	 */
	boolean isSetProcessAffectedObjects();

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' attribute.
	 * @see #isSetTransaction()
	 * @see #unsetTransaction()
	 * @see #setTransaction(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBatch_Transaction()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Transaction'"
	 * @generated
	 */
	boolean isTransaction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isTransaction <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' attribute.
	 * @see #isSetTransaction()
	 * @see #unsetTransaction()
	 * @see #isTransaction()
	 * @generated
	 */
	void setTransaction(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isTransaction <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransaction()
	 * @see #isTransaction()
	 * @see #setTransaction(boolean)
	 * @generated
	 */
	void unsetTransaction();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch#isTransaction <em>Transaction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction</em>' attribute is set.
	 * @see #unsetTransaction()
	 * @see #isTransaction()
	 * @see #setTransaction(boolean)
	 * @generated
	 */
	boolean isSetTransaction();

} // Batch
