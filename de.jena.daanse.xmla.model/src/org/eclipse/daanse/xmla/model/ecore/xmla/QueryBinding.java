/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding#getQueryDefinition <em>Query Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getQueryBinding()
 * @model extendedMetaData="name='QueryBinding' kind='elementOnly'"
 * @generated
 */
public interface QueryBinding extends TabularBinding {
	/**
	 * Returns the value of the '<em><b>Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source ID</em>' attribute.
	 * @see #setDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getQueryBinding_DataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSourceID'"
	 * @generated
	 */
	String getDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding#getDataSourceID <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source ID</em>' attribute.
	 * @see #getDataSourceID()
	 * @generated
	 */
	void setDataSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Query Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Definition</em>' attribute.
	 * @see #setQueryDefinition(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getQueryBinding_QueryDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='QueryDefinition'"
	 * @generated
	 */
	String getQueryDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding#getQueryDefinition <em>Query Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Definition</em>' attribute.
	 * @see #getQueryDefinition()
	 * @generated
	 */
	void setQueryDefinition(String value);

} // QueryBinding
