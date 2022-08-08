/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source View Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding#getDataSourceViewID <em>Data Source View ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourceViewBinding()
 * @model extendedMetaData="name='DataSourceViewBinding' kind='elementOnly'"
 * @generated
 */
public interface DataSourceViewBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Data Source View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source View ID</em>' attribute.
	 * @see #setDataSourceViewID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourceViewBinding_DataSourceViewID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DataSourceViewID'"
	 * @generated
	 */
	String getDataSourceViewID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding#getDataSourceViewID <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source View ID</em>' attribute.
	 * @see #getDataSourceViewID()
	 * @generated
	 */
	void setDataSourceViewID(String value);

} // DataSourceViewBinding
