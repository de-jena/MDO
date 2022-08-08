/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Folder#getOriginal <em>Original</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Folder#getNew <em>New</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFolder()
 * @model extendedMetaData="name='Folder' kind='elementOnly'"
 * @generated
 */
public interface Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' attribute.
	 * @see #setOriginal(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFolder_Original()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Original'"
	 * @generated
	 */
	String getOriginal();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Folder#getOriginal <em>Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' attribute.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(String value);

	/**
	 * Returns the value of the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New</em>' attribute.
	 * @see #setNew(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFolder_New()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='New'"
	 * @generated
	 */
	String getNew();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Folder#getNew <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' attribute.
	 * @see #getNew()
	 * @generated
	 */
	void setNew(String value);

} // Folder
