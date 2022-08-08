/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getAttributePermissions <em>Attribute Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getWrite <em>Write</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getAllowedRowsExpression <em>Allowed Rows Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionPermission()
 * @model extendedMetaData="name='DimensionPermission' kind='elementOnly'"
 * @generated
 */
public interface DimensionPermission extends Permission {
	/**
	 * Returns the value of the '<em><b>Attribute Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Permissions</em>' containment reference.
	 * @see #setAttributePermissions(AttributePermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionPermission_AttributePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributePermissions'"
	 * @generated
	 */
	AttributePermissionsType getAttributePermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getAttributePermissions <em>Attribute Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Permissions</em>' containment reference.
	 * @see #getAttributePermissions()
	 * @generated
	 */
	void setAttributePermissions(AttributePermissionsType value);

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType1
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionPermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType1 getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType1
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType1)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType1)
	 * @generated
	 */
	boolean isSetWrite();

	/**
	 * Returns the value of the '<em><b>Allowed Rows Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Rows Expression</em>' attribute.
	 * @see #setAllowedRowsExpression(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionPermission_AllowedRowsExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AllowedRowsExpression' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300/300'"
	 * @generated
	 */
	String getAllowedRowsExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission#getAllowedRowsExpression <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Rows Expression</em>' attribute.
	 * @see #getAllowedRowsExpression()
	 * @generated
	 */
	void setAllowedRowsExpression(String value);

} // DimensionPermission
