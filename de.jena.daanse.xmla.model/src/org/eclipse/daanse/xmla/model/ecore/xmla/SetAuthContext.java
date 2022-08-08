/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Auth Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext#getDatabaseID <em>Database ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSetAuthContext()
 * @model extendedMetaData="name='SetAuthContext' kind='elementOnly'"
 * @generated
 */
public interface SetAuthContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSetAuthContext_Token()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Token' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Database ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database ID</em>' attribute.
	 * @see #setDatabaseID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSetAuthContext_DatabaseID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	String getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext#getDatabaseID <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' attribute.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(String value);

} // SetAuthContext
