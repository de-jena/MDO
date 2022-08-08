/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getReadWriteMode <em>Read Write Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore()
 * @model extendedMetaData="name='Restore' kind='elementOnly'"
 * @generated
 */
public interface Restore extends EObject {
	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_DatabaseName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DatabaseName'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database ID</em>' attribute.
	 * @see #setDatabaseID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_DatabaseID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	String getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getDatabaseID <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' attribute.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='File'"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType
	 * @see #isSetSecurity()
	 * @see #unsetSecurity()
	 * @see #setSecurity(SecurityType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_Security()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Security'"
	 * @generated
	 */
	SecurityType getSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType
	 * @see #isSetSecurity()
	 * @see #unsetSecurity()
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SecurityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurity()
	 * @see #getSecurity()
	 * @see #setSecurity(SecurityType)
	 * @generated
	 */
	void unsetSecurity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getSecurity <em>Security</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security</em>' attribute is set.
	 * @see #unsetSecurity()
	 * @see #getSecurity()
	 * @see #setSecurity(SecurityType)
	 * @generated
	 */
	boolean isSetSecurity();

	/**
	 * Returns the value of the '<em><b>Allow Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Overwrite</em>' attribute.
	 * @see #isSetAllowOverwrite()
	 * @see #unsetAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_AllowOverwrite()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowOverwrite'"
	 * @generated
	 */
	boolean isAllowOverwrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @generated
	 */
	void unsetAllowOverwrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#isAllowOverwrite <em>Allow Overwrite</em>}' attribute is set.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Storage Location</em>' attribute.
	 * @see #setDbStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_DbStorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbStorageLocation' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	String getDbStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getDbStorageLocation <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Storage Location</em>' attribute.
	 * @see #getDbStorageLocation()
	 * @generated
	 */
	void setDbStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Read Write Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Write Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see #isSetReadWriteMode()
	 * @see #unsetReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_ReadWriteMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReadWriteMode' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100'"
	 * @generated
	 */
	ReadWriteModeType getReadWriteMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getReadWriteMode <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Write Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see #isSetReadWriteMode()
	 * @see #unsetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @generated
	 */
	void setReadWriteMode(ReadWriteModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getReadWriteMode <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	void unsetReadWriteMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getReadWriteMode <em>Read Write Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Write Mode</em>' attribute is set.
	 * @see #unsetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	boolean isSetReadWriteMode();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(LocationsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestore_Locations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Locations'"
	 * @generated
	 */
	LocationsType1 getLocations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(LocationsType1 value);

} // Restore
