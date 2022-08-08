/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImageVersion <em>Image Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getReadWriteMode <em>Read Write Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad()
 * @model extendedMetaData="name='ImageLoad' kind='elementOnly'"
 * @generated
 */
public interface ImageLoad extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_ImagePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImagePath' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_ImageUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImageUrl' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Image Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Unique ID</em>' attribute.
	 * @see #setImageUniqueID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_ImageUniqueID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImageUniqueID' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImageUniqueID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImageUniqueID <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Unique ID</em>' attribute.
	 * @see #getImageUniqueID()
	 * @generated
	 */
	void setImageUniqueID(String value);

	/**
	 * Returns the value of the '<em><b>Image Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Version</em>' attribute.
	 * @see #setImageVersion(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_ImageVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImageVersion' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImageVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getImageVersion <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Version</em>' attribute.
	 * @see #getImageVersion()
	 * @generated
	 */
	void setImageVersion(String value);

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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_ReadWriteMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ReadWriteMode' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100'"
	 * @generated
	 */
	ReadWriteModeType getReadWriteMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getReadWriteMode <em>Read Write Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getReadWriteMode <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	void unsetReadWriteMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getReadWriteMode <em>Read Write Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Storage Location</em>' attribute.
	 * @see #setDbStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_DbStorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbStorageLocation' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	String getDbStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getDbStorageLocation <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Storage Location</em>' attribute.
	 * @see #getDbStorageLocation()
	 * @generated
	 */
	void setDbStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_DatabaseName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DatabaseName'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getDatabaseName <em>Database Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_DatabaseID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	String getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getDatabaseID <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' attribute.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getImageLoad_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Data'"
	 * @generated
	 */
	DataType3 getData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataType3 value);

} // ImageLoad
