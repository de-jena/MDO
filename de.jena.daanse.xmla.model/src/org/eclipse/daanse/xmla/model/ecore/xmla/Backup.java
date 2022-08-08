/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isApplyCompression <em>Apply Compression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isBackupRemotePartitions <em>Backup Remote Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup()
 * @model extendedMetaData="name='Backup' kind='elementOnly'"
 * @generated
 */
public interface Backup extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectReference getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='File'"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType1
	 * @see #isSetSecurity()
	 * @see #unsetSecurity()
	 * @see #setSecurity(SecurityType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_Security()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Security'"
	 * @generated
	 */
	SecurityType1 getSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType1
	 * @see #isSetSecurity()
	 * @see #unsetSecurity()
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SecurityType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurity()
	 * @see #getSecurity()
	 * @see #setSecurity(SecurityType1)
	 * @generated
	 */
	void unsetSecurity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getSecurity <em>Security</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security</em>' attribute is set.
	 * @see #unsetSecurity()
	 * @see #getSecurity()
	 * @see #setSecurity(SecurityType1)
	 * @generated
	 */
	boolean isSetSecurity();

	/**
	 * Returns the value of the '<em><b>Apply Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Compression</em>' attribute.
	 * @see #isSetApplyCompression()
	 * @see #unsetApplyCompression()
	 * @see #setApplyCompression(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_ApplyCompression()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ApplyCompression'"
	 * @generated
	 */
	boolean isApplyCompression();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isApplyCompression <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Compression</em>' attribute.
	 * @see #isSetApplyCompression()
	 * @see #unsetApplyCompression()
	 * @see #isApplyCompression()
	 * @generated
	 */
	void setApplyCompression(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isApplyCompression <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyCompression()
	 * @see #isApplyCompression()
	 * @see #setApplyCompression(boolean)
	 * @generated
	 */
	void unsetApplyCompression();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isApplyCompression <em>Apply Compression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply Compression</em>' attribute is set.
	 * @see #unsetApplyCompression()
	 * @see #isApplyCompression()
	 * @see #setApplyCompression(boolean)
	 * @generated
	 */
	boolean isSetApplyCompression();

	/**
	 * Returns the value of the '<em><b>Allow Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Overwrite</em>' attribute.
	 * @see #isSetAllowOverwrite()
	 * @see #unsetAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_AllowOverwrite()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowOverwrite'"
	 * @generated
	 */
	boolean isAllowOverwrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Overwrite</em>' attribute.
	 * @see #isSetAllowOverwrite()
	 * @see #unsetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @generated
	 */
	void setAllowOverwrite(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @generated
	 */
	void unsetAllowOverwrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isAllowOverwrite <em>Allow Overwrite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Overwrite</em>' attribute is set.
	 * @see #unsetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @generated
	 */
	boolean isSetAllowOverwrite();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Backup Remote Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Remote Partitions</em>' attribute.
	 * @see #isSetBackupRemotePartitions()
	 * @see #unsetBackupRemotePartitions()
	 * @see #setBackupRemotePartitions(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_BackupRemotePartitions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='BackupRemotePartitions'"
	 * @generated
	 */
	boolean isBackupRemotePartitions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isBackupRemotePartitions <em>Backup Remote Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Remote Partitions</em>' attribute.
	 * @see #isSetBackupRemotePartitions()
	 * @see #unsetBackupRemotePartitions()
	 * @see #isBackupRemotePartitions()
	 * @generated
	 */
	void setBackupRemotePartitions(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isBackupRemotePartitions <em>Backup Remote Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackupRemotePartitions()
	 * @see #isBackupRemotePartitions()
	 * @see #setBackupRemotePartitions(boolean)
	 * @generated
	 */
	void unsetBackupRemotePartitions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#isBackupRemotePartitions <em>Backup Remote Partitions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Backup Remote Partitions</em>' attribute is set.
	 * @see #unsetBackupRemotePartitions()
	 * @see #isBackupRemotePartitions()
	 * @see #setBackupRemotePartitions(boolean)
	 * @generated
	 */
	boolean isSetBackupRemotePartitions();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(LocationsType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBackup_Locations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Locations'"
	 * @generated
	 */
	LocationsType2 getLocations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(LocationsType2 value);

} // Backup
