/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourcePermission()
 * @model extendedMetaData="name='DataSourcePermission' kind='elementOnly'"
 * @generated
 */
public interface DataSourcePermission extends Permission {
	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType5
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType5)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourcePermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType5 getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType5
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType5 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType5)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType5)
	 * @generated
	 */
	boolean isSetWrite();

} // DataSourcePermission
