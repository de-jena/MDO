/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification#getDbTableName <em>Db Table Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification#getDbSchemaName <em>Db Schema Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableNotification()
 * @model extendedMetaData="name='TableNotification' kind='elementOnly'"
 * @generated
 */
public interface TableNotification extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table Name</em>' attribute.
	 * @see #setDbTableName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableNotification_DbTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DbTableName'"
	 * @generated
	 */
	String getDbTableName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification#getDbTableName <em>Db Table Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableNotification_DbSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbSchemaName'"
	 * @generated
	 */
	String getDbSchemaName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification#getDbSchemaName <em>Db Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Schema Name</em>' attribute.
	 * @see #getDbSchemaName()
	 * @generated
	 */
	void setDbSchemaName(String value);

} // TableNotification
