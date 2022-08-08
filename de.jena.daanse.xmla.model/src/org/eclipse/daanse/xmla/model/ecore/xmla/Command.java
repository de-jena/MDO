/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getAlter <em>Alter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getMergePartitions <em>Merge Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDesignAggregations <em>Design Aggregations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getClearCache <em>Clear Cache</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUnsubscribe <em>Unsubscribe</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCancel <em>Cancel</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getBeginTransaction <em>Begin Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCommitTransaction <em>Commit Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getRollbackTransaction <em>Rollback Transaction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getLock <em>Lock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUnlock <em>Unlock</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getBackup <em>Backup</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getRestore <em>Restore</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getAttach <em>Attach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDetach <em>Detach</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUpdateCells <em>Update Cells</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getNotifyTableChange <em>Notify Table Change</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getBatch <em>Batch</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getImageLoad <em>Image Load</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getImageSave <em>Image Save</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCloneDatabase <em>Clone Database</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getSetAuthContext <em>Set Auth Context</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDBCC <em>DBCC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand()
 * @model extendedMetaData="name='Command' kind='elementOnly'"
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Statement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Statement'"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference.
	 * @see #setCreate(Create)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Create()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Create'"
	 * @generated
	 */
	Create getCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCreate <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' containment reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(Create value);

	/**
	 * Returns the value of the '<em><b>Alter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter</em>' containment reference.
	 * @see #setAlter(Alter)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Alter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Alter'"
	 * @generated
	 */
	Alter getAlter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getAlter <em>Alter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alter</em>' containment reference.
	 * @see #getAlter()
	 * @generated
	 */
	void setAlter(Alter value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(Delete)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Delete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Delete'"
	 * @generated
	 */
	Delete getDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(Delete value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Process()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Process'"
	 * @generated
	 */
	org.eclipse.daanse.xmla.model.ecore.xmla.Process getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process value);

	/**
	 * Returns the value of the '<em><b>Merge Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Partitions</em>' containment reference.
	 * @see #setMergePartitions(MergePartitions)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_MergePartitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MergePartitions'"
	 * @generated
	 */
	MergePartitions getMergePartitions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getMergePartitions <em>Merge Partitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Partitions</em>' containment reference.
	 * @see #getMergePartitions()
	 * @generated
	 */
	void setMergePartitions(MergePartitions value);

	/**
	 * Returns the value of the '<em><b>Design Aggregations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Aggregations</em>' containment reference.
	 * @see #setDesignAggregations(DesignAggregations)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_DesignAggregations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DesignAggregations'"
	 * @generated
	 */
	DesignAggregations getDesignAggregations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDesignAggregations <em>Design Aggregations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Aggregations</em>' containment reference.
	 * @see #getDesignAggregations()
	 * @generated
	 */
	void setDesignAggregations(DesignAggregations value);

	/**
	 * Returns the value of the '<em><b>Clear Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Cache</em>' containment reference.
	 * @see #setClearCache(ClearCache)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_ClearCache()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClearCache'"
	 * @generated
	 */
	ClearCache getClearCache();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getClearCache <em>Clear Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Cache</em>' containment reference.
	 * @see #getClearCache()
	 * @generated
	 */
	void setClearCache(ClearCache value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' containment reference.
	 * @see #setSubscribe(Subscribe)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Subscribe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subscribe'"
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getSubscribe <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' containment reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe</em>' containment reference.
	 * @see #setUnsubscribe(Unsubscribe)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Unsubscribe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unsubscribe'"
	 * @generated
	 */
	Unsubscribe getUnsubscribe();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUnsubscribe <em>Unsubscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe</em>' containment reference.
	 * @see #getUnsubscribe()
	 * @generated
	 */
	void setUnsubscribe(Unsubscribe value);

	/**
	 * Returns the value of the '<em><b>Cancel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel</em>' containment reference.
	 * @see #setCancel(Cancel)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Cancel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cancel'"
	 * @generated
	 */
	Cancel getCancel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCancel <em>Cancel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel</em>' containment reference.
	 * @see #getCancel()
	 * @generated
	 */
	void setCancel(Cancel value);

	/**
	 * Returns the value of the '<em><b>Begin Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Transaction</em>' containment reference.
	 * @see #setBeginTransaction(BeginTransaction)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_BeginTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BeginTransaction'"
	 * @generated
	 */
	BeginTransaction getBeginTransaction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getBeginTransaction <em>Begin Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Transaction</em>' containment reference.
	 * @see #getBeginTransaction()
	 * @generated
	 */
	void setBeginTransaction(BeginTransaction value);

	/**
	 * Returns the value of the '<em><b>Commit Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Transaction</em>' containment reference.
	 * @see #setCommitTransaction(CommitTransaction)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_CommitTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommitTransaction'"
	 * @generated
	 */
	CommitTransaction getCommitTransaction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCommitTransaction <em>Commit Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Transaction</em>' containment reference.
	 * @see #getCommitTransaction()
	 * @generated
	 */
	void setCommitTransaction(CommitTransaction value);

	/**
	 * Returns the value of the '<em><b>Rollback Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback Transaction</em>' containment reference.
	 * @see #setRollbackTransaction(RollbackTransaction)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_RollbackTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RollbackTransaction'"
	 * @generated
	 */
	RollbackTransaction getRollbackTransaction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getRollbackTransaction <em>Rollback Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback Transaction</em>' containment reference.
	 * @see #getRollbackTransaction()
	 * @generated
	 */
	void setRollbackTransaction(RollbackTransaction value);

	/**
	 * Returns the value of the '<em><b>Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock</em>' containment reference.
	 * @see #setLock(Lock)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Lock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lock'"
	 * @generated
	 */
	Lock getLock();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getLock <em>Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock</em>' containment reference.
	 * @see #getLock()
	 * @generated
	 */
	void setLock(Lock value);

	/**
	 * Returns the value of the '<em><b>Unlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock</em>' containment reference.
	 * @see #setUnlock(Unlock)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Unlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unlock'"
	 * @generated
	 */
	Unlock getUnlock();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUnlock <em>Unlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlock</em>' containment reference.
	 * @see #getUnlock()
	 * @generated
	 */
	void setUnlock(Unlock value);

	/**
	 * Returns the value of the '<em><b>Backup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup</em>' containment reference.
	 * @see #setBackup(Backup)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Backup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Backup'"
	 * @generated
	 */
	Backup getBackup();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getBackup <em>Backup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup</em>' containment reference.
	 * @see #getBackup()
	 * @generated
	 */
	void setBackup(Backup value);

	/**
	 * Returns the value of the '<em><b>Restore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restore</em>' containment reference.
	 * @see #setRestore(Restore)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Restore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Restore'"
	 * @generated
	 */
	Restore getRestore();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getRestore <em>Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restore</em>' containment reference.
	 * @see #getRestore()
	 * @generated
	 */
	void setRestore(Restore value);

	/**
	 * Returns the value of the '<em><b>Synchronize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize</em>' containment reference.
	 * @see #setSynchronize(Synchronize)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Synchronize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Synchronize'"
	 * @generated
	 */
	Synchronize getSynchronize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getSynchronize <em>Synchronize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronize</em>' containment reference.
	 * @see #getSynchronize()
	 * @generated
	 */
	void setSynchronize(Synchronize value);

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' containment reference.
	 * @see #setAttach(Attach)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Attach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attach'"
	 * @generated
	 */
	Attach getAttach();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getAttach <em>Attach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach</em>' containment reference.
	 * @see #getAttach()
	 * @generated
	 */
	void setAttach(Attach value);

	/**
	 * Returns the value of the '<em><b>Detach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach</em>' containment reference.
	 * @see #setDetach(Detach)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Detach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Detach'"
	 * @generated
	 */
	Detach getDetach();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDetach <em>Detach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach</em>' containment reference.
	 * @see #getDetach()
	 * @generated
	 */
	void setDetach(Detach value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference.
	 * @see #setInsert(Insert)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Insert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Insert'"
	 * @generated
	 */
	Insert getInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getInsert <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' containment reference.
	 * @see #getInsert()
	 * @generated
	 */
	void setInsert(Insert value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(Update)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Update()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Update'"
	 * @generated
	 */
	Update getUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(Update value);

	/**
	 * Returns the value of the '<em><b>Drop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' containment reference.
	 * @see #setDrop(Drop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Drop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Drop'"
	 * @generated
	 */
	Drop getDrop();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDrop <em>Drop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop</em>' containment reference.
	 * @see #getDrop()
	 * @generated
	 */
	void setDrop(Drop value);

	/**
	 * Returns the value of the '<em><b>Update Cells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Cells</em>' containment reference.
	 * @see #setUpdateCells(UpdateCells)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_UpdateCells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateCells'"
	 * @generated
	 */
	UpdateCells getUpdateCells();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getUpdateCells <em>Update Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Cells</em>' containment reference.
	 * @see #getUpdateCells()
	 * @generated
	 */
	void setUpdateCells(UpdateCells value);

	/**
	 * Returns the value of the '<em><b>Notify Table Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify Table Change</em>' containment reference.
	 * @see #setNotifyTableChange(NotifyTableChange)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_NotifyTableChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotifyTableChange'"
	 * @generated
	 */
	NotifyTableChange getNotifyTableChange();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getNotifyTableChange <em>Notify Table Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify Table Change</em>' containment reference.
	 * @see #getNotifyTableChange()
	 * @generated
	 */
	void setNotifyTableChange(NotifyTableChange value);

	/**
	 * Returns the value of the '<em><b>Batch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch</em>' containment reference.
	 * @see #setBatch(Batch)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_Batch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Batch'"
	 * @generated
	 */
	Batch getBatch();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getBatch <em>Batch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch</em>' containment reference.
	 * @see #getBatch()
	 * @generated
	 */
	void setBatch(Batch value);

	/**
	 * Returns the value of the '<em><b>Image Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Load</em>' containment reference.
	 * @see #setImageLoad(ImageLoad)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_ImageLoad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageLoad'"
	 * @generated
	 */
	ImageLoad getImageLoad();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getImageLoad <em>Image Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Load</em>' containment reference.
	 * @see #getImageLoad()
	 * @generated
	 */
	void setImageLoad(ImageLoad value);

	/**
	 * Returns the value of the '<em><b>Image Save</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Save</em>' containment reference.
	 * @see #setImageSave(ImageSave)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_ImageSave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageSave'"
	 * @generated
	 */
	ImageSave getImageSave();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getImageSave <em>Image Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Save</em>' containment reference.
	 * @see #getImageSave()
	 * @generated
	 */
	void setImageSave(ImageSave value);

	/**
	 * Returns the value of the '<em><b>Clone Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone Database</em>' containment reference.
	 * @see #setCloneDatabase(CloneDatabase)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_CloneDatabase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CloneDatabase'"
	 * @generated
	 */
	CloneDatabase getCloneDatabase();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getCloneDatabase <em>Clone Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clone Database</em>' containment reference.
	 * @see #getCloneDatabase()
	 * @generated
	 */
	void setCloneDatabase(CloneDatabase value);

	/**
	 * Returns the value of the '<em><b>Set Auth Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Auth Context</em>' containment reference.
	 * @see #setSetAuthContext(SetAuthContext)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_SetAuthContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetAuthContext'"
	 * @generated
	 */
	SetAuthContext getSetAuthContext();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getSetAuthContext <em>Set Auth Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Auth Context</em>' containment reference.
	 * @see #getSetAuthContext()
	 * @generated
	 */
	void setSetAuthContext(SetAuthContext value);

	/**
	 * Returns the value of the '<em><b>DBCC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DBCC</em>' containment reference.
	 * @see #setDBCC(DBCC)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommand_DBCC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DBCC'"
	 * @generated
	 */
	DBCC getDBCC();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command#getDBCC <em>DBCC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBCC</em>' containment reference.
	 * @see #getDBCC()
	 * @generated
	 */
	void setDBCC(DBCC value);

} // Command
