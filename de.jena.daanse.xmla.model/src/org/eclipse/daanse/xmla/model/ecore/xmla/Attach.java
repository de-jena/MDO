/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getReadWriteMode <em>Read Write Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttach()
 * @model extendedMetaData="name='Attach' kind='elementOnly'"
 * @generated
 */
public interface Attach extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttach_Folder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Folder'"
	 * @generated
	 */
	String getFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttach_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Allow Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Overwrite</em>' attribute.
	 * @see #isSetAllowOverwrite()
	 * @see #unsetAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttach_AllowOverwrite()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowOverwrite'"
	 * @generated
	 */
	boolean isAllowOverwrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @generated
	 */
	void unsetAllowOverwrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#isAllowOverwrite <em>Allow Overwrite</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Read Write Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Write Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see #isSetReadWriteMode()
	 * @see #unsetReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttach_ReadWriteMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReadWriteMode' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100'"
	 * @generated
	 */
	ReadWriteModeType getReadWriteMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getReadWriteMode <em>Read Write Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getReadWriteMode <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	void unsetReadWriteMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach#getReadWriteMode <em>Read Write Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Write Mode</em>' attribute is set.
	 * @see #unsetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	boolean isSetReadWriteMode();

} // Attach
