/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#isDeleteWithDescendants <em>Delete With Descendants</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDrop()
 * @model extendedMetaData="name='Drop' kind='elementOnly'"
 * @generated
 */
public interface Drop extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDrop_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	org.eclipse.daanse.xmla.model.ecore.xmla.Object getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object value);

	/**
	 * Returns the value of the '<em><b>Delete With Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete With Descendants</em>' attribute.
	 * @see #isSetDeleteWithDescendants()
	 * @see #unsetDeleteWithDescendants()
	 * @see #setDeleteWithDescendants(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDrop_DeleteWithDescendants()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DeleteWithDescendants'"
	 * @generated
	 */
	boolean isDeleteWithDescendants();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#isDeleteWithDescendants <em>Delete With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete With Descendants</em>' attribute.
	 * @see #isSetDeleteWithDescendants()
	 * @see #unsetDeleteWithDescendants()
	 * @see #isDeleteWithDescendants()
	 * @generated
	 */
	void setDeleteWithDescendants(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#isDeleteWithDescendants <em>Delete With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteWithDescendants()
	 * @see #isDeleteWithDescendants()
	 * @see #setDeleteWithDescendants(boolean)
	 * @generated
	 */
	void unsetDeleteWithDescendants();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#isDeleteWithDescendants <em>Delete With Descendants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete With Descendants</em>' attribute is set.
	 * @see #unsetDeleteWithDescendants()
	 * @see #isDeleteWithDescendants()
	 * @see #setDeleteWithDescendants(boolean)
	 * @generated
	 */
	boolean isSetDeleteWithDescendants();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Where)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDrop_Where()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Where'"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

} // Drop
