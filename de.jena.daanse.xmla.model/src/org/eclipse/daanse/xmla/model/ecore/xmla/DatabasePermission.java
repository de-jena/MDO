/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#isAdminister <em>Administer</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabasePermission()
 * @model extendedMetaData="name='DatabasePermission' kind='elementOnly'"
 * @generated
 */
public interface DatabasePermission extends Permission {
	/**
	 * Returns the value of the '<em><b>Administer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administer</em>' attribute.
	 * @see #isSetAdminister()
	 * @see #unsetAdminister()
	 * @see #setAdminister(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabasePermission_Administer()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Administer'"
	 * @generated
	 */
	boolean isAdminister();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#isAdminister <em>Administer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administer</em>' attribute.
	 * @see #isSetAdminister()
	 * @see #unsetAdminister()
	 * @see #isAdminister()
	 * @generated
	 */
	void setAdminister(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#isAdminister <em>Administer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdminister()
	 * @see #isAdminister()
	 * @see #setAdminister(boolean)
	 * @generated
	 */
	void unsetAdminister();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#isAdminister <em>Administer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Administer</em>' attribute is set.
	 * @see #unsetAdminister()
	 * @see #isAdminister()
	 * @see #setAdminister(boolean)
	 * @generated
	 */
	boolean isSetAdminister();

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType4
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType4)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabasePermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType4 getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType4
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType4 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType4)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType4)
	 * @generated
	 */
	boolean isSetWrite();

} // DatabasePermission
