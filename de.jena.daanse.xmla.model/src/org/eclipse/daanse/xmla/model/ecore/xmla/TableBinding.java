/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding#getDbTableName <em>Db Table Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding#getDbSchemaName <em>Db Schema Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableBinding()
 * @model extendedMetaData="name='TableBinding' kind='elementOnly'"
 * @generated
 */
public interface TableBinding extends TabularBinding {
	/**
	 * Returns the value of the '<em><b>Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source ID</em>' attribute.
	 * @see #setDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableBinding_DataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSourceID'"
	 * @generated
	 */
	String getDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding#getDataSourceID <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source ID</em>' attribute.
	 * @see #getDataSourceID()
	 * @generated
	 */
	void setDataSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Db Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table Name</em>' attribute.
	 * @see #setDbTableName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableBinding_DbTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DbTableName'"
	 * @generated
	 */
	String getDbTableName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding#getDbTableName <em>Db Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Table Name</em>' attribute.
	 * @see #getDbTableName()
	 * @generated
	 */
	void setDbTableName(String value);

	/**
	 * Returns the value of the '<em><b>Db Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Schema Name</em>' attribute.
	 * @see #setDbSchemaName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableBinding_DbSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbSchemaName'"
	 * @generated
	 */
	String getDbSchemaName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding#getDbSchemaName <em>Db Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Schema Name</em>' attribute.
	 * @see #getDbSchemaName()
	 * @generated
	 */
	void setDbSchemaName(String value);

} // TableBinding
