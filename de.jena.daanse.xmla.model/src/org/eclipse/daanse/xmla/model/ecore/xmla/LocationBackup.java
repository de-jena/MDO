/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Backup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup#getDataSourceID <em>Data Source ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getLocationBackup()
 * @model extendedMetaData="name='Location_Backup' kind='elementOnly'"
 * @generated
 */
public interface LocationBackup extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getLocationBackup_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='File'"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source ID</em>' attribute.
	 * @see #setDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getLocationBackup_DataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DataSourceID'"
	 * @generated
	 */
	String getDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup#getDataSourceID <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source ID</em>' attribute.
	 * @see #getDataSourceID()
	 * @generated
	 */
	void setDataSourceID(String value);

} // LocationBackup
