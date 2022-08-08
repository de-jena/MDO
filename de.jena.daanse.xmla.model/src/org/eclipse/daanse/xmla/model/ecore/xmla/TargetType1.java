/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1#getDatabaseID <em>Database ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTargetType1()
 * @model extendedMetaData="name='Target_._type' kind='elementOnly'"
 * @generated
 */
public interface TargetType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Storage Location</em>' attribute.
	 * @see #setDbStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTargetType1_DbStorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbStorageLocation' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	String getDbStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1#getDbStorageLocation <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Storage Location</em>' attribute.
	 * @see #getDbStorageLocation()
	 * @generated
	 */
	void setDbStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTargetType1_DatabaseName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DatabaseName'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database ID</em>' attribute.
	 * @see #setDatabaseID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTargetType1_DatabaseID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	String getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1#getDatabaseID <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' attribute.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(String value);

} // TargetType1
