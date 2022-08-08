/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getParentObject <em>Parent Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getObjectDefinition <em>Object Definition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCreate()
 * @model extendedMetaData="name='Create' kind='elementOnly'"
 * @generated
 */
public interface Create extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Object</em>' containment reference.
	 * @see #setParentObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCreate_ParentObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParentObject'"
	 * @generated
	 */
	ObjectReference getParentObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getParentObject <em>Parent Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Object</em>' containment reference.
	 * @see #getParentObject()
	 * @generated
	 */
	void setParentObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>Object Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Definition</em>' containment reference.
	 * @see #setObjectDefinition(MajorObject)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCreate_ObjectDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectDefinition'"
	 * @generated
	 */
	MajorObject getObjectDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getObjectDefinition <em>Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Definition</em>' containment reference.
	 * @see #getObjectDefinition()
	 * @generated
	 */
	void setObjectDefinition(MajorObject value);

	/**
	 * Returns the value of the '<em><b>Allow Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Overwrite</em>' attribute.
	 * @see #isSetAllowOverwrite()
	 * @see #unsetAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCreate_AllowOverwrite()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='AllowOverwrite'"
	 * @generated
	 */
	boolean isAllowOverwrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Overwrite</em>' attribute.
	 * @see #isSetAllowOverwrite()
	 * @see #unsetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @generated
	 */
	void setAllowOverwrite(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#isAllowOverwrite <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @generated
	 */
	void unsetAllowOverwrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#isAllowOverwrite <em>Allow Overwrite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Overwrite</em>' attribute is set.
	 * @see #unsetAllowOverwrite()
	 * @see #isAllowOverwrite()
	 * @see #setAllowOverwrite(boolean)
	 * @generated
	 */
	boolean isSetAllowOverwrite();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(Scope)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCreate_Scope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Scope'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	boolean isSetScope();

} // Create
