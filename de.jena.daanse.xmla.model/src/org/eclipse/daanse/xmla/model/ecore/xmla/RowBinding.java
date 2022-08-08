/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RowBinding#getTableID <em>Table ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRowBinding()
 * @model extendedMetaData="name='RowBinding' kind='elementOnly'"
 * @generated
 */
public interface RowBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Table ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table ID</em>' attribute.
	 * @see #setTableID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRowBinding_TableID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TableID'"
	 * @generated
	 */
	String getTableID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RowBinding#getTableID <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table ID</em>' attribute.
	 * @see #getTableID()
	 * @generated
	 */
	void setTableID(String value);

} // RowBinding
