/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clr Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly#getPermissionSet <em>Permission Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getClrAssembly()
 * @model extendedMetaData="name='ClrAssembly' kind='elementOnly'"
 * @generated
 */
public interface ClrAssembly extends Assembly {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference.
	 * @see #setFiles(FilesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getClrAssembly_Files()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Files'"
	 * @generated
	 */
	FilesType getFiles();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly#getFiles <em>Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files</em>' containment reference.
	 * @see #getFiles()
	 * @generated
	 */
	void setFiles(FilesType value);

	/**
	 * Returns the value of the '<em><b>Permission Set</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.PermissionSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Set</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PermissionSetType
	 * @see #isSetPermissionSet()
	 * @see #unsetPermissionSet()
	 * @see #setPermissionSet(PermissionSetType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getClrAssembly_PermissionSet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PermissionSet'"
	 * @generated
	 */
	PermissionSetType getPermissionSet();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly#getPermissionSet <em>Permission Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Set</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PermissionSetType
	 * @see #isSetPermissionSet()
	 * @see #unsetPermissionSet()
	 * @see #getPermissionSet()
	 * @generated
	 */
	void setPermissionSet(PermissionSetType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly#getPermissionSet <em>Permission Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermissionSet()
	 * @see #getPermissionSet()
	 * @see #setPermissionSet(PermissionSetType)
	 * @generated
	 */
	void unsetPermissionSet();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly#getPermissionSet <em>Permission Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permission Set</em>' attribute is set.
	 * @see #unsetPermissionSet()
	 * @see #getPermissionSet()
	 * @see #setPermissionSet(PermissionSetType)
	 * @generated
	 */
	boolean isSetPermissionSet();

} // ClrAssembly
