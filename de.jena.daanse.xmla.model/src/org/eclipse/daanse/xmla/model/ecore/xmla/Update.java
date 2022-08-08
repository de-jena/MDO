/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveWithDescendants <em>Move With Descendants</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveToRoot <em>Move To Root</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUpdate()
 * @model extendedMetaData="name='Update' kind='elementOnly'"
 * @generated
 */
public interface Update extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUpdate_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	org.eclipse.daanse.xmla.model.ecore.xmla.Object getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributesType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUpdate_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attributes'"
	 * @generated
	 */
	AttributesType3 getAttributes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributesType3 value);

	/**
	 * Returns the value of the '<em><b>Move With Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move With Descendants</em>' attribute.
	 * @see #isSetMoveWithDescendants()
	 * @see #unsetMoveWithDescendants()
	 * @see #setMoveWithDescendants(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUpdate_MoveWithDescendants()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='MoveWithDescendants'"
	 * @generated
	 */
	boolean isMoveWithDescendants();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveWithDescendants <em>Move With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move With Descendants</em>' attribute.
	 * @see #isSetMoveWithDescendants()
	 * @see #unsetMoveWithDescendants()
	 * @see #isMoveWithDescendants()
	 * @generated
	 */
	void setMoveWithDescendants(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveWithDescendants <em>Move With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoveWithDescendants()
	 * @see #isMoveWithDescendants()
	 * @see #setMoveWithDescendants(boolean)
	 * @generated
	 */
	void unsetMoveWithDescendants();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveWithDescendants <em>Move With Descendants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Move With Descendants</em>' attribute is set.
	 * @see #unsetMoveWithDescendants()
	 * @see #isMoveWithDescendants()
	 * @see #setMoveWithDescendants(boolean)
	 * @generated
	 */
	boolean isSetMoveWithDescendants();

	/**
	 * Returns the value of the '<em><b>Move To Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move To Root</em>' attribute.
	 * @see #isSetMoveToRoot()
	 * @see #unsetMoveToRoot()
	 * @see #setMoveToRoot(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUpdate_MoveToRoot()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='MoveToRoot'"
	 * @generated
	 */
	boolean isMoveToRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveToRoot <em>Move To Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move To Root</em>' attribute.
	 * @see #isSetMoveToRoot()
	 * @see #unsetMoveToRoot()
	 * @see #isMoveToRoot()
	 * @generated
	 */
	void setMoveToRoot(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveToRoot <em>Move To Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoveToRoot()
	 * @see #isMoveToRoot()
	 * @see #setMoveToRoot(boolean)
	 * @generated
	 */
	void unsetMoveToRoot();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#isMoveToRoot <em>Move To Root</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Move To Root</em>' attribute is set.
	 * @see #unsetMoveToRoot()
	 * @see #isMoveToRoot()
	 * @see #setMoveToRoot(boolean)
	 * @generated
	 */
	boolean isSetMoveToRoot();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Where)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUpdate_Where()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Where'"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

} // Update
