/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObjectDefinition <em>Object Definition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#isAllowCreate <em>Allow Create</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObjectExpansion <em>Object Expansion</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlter()
 * @model extendedMetaData="name='Alter' kind='elementOnly'"
 * @generated
 */
public interface Alter extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlter_Object()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectReference getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>Object Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Definition</em>' containment reference.
	 * @see #setObjectDefinition(MajorObject)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlter_ObjectDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectDefinition'"
	 * @generated
	 */
	MajorObject getObjectDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObjectDefinition <em>Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Definition</em>' containment reference.
	 * @see #getObjectDefinition()
	 * @generated
	 */
	void setObjectDefinition(MajorObject value);

	/**
	 * Returns the value of the '<em><b>Allow Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Create</em>' attribute.
	 * @see #isSetAllowCreate()
	 * @see #unsetAllowCreate()
	 * @see #setAllowCreate(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlter_AllowCreate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='AllowCreate'"
	 * @generated
	 */
	boolean isAllowCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#isAllowCreate <em>Allow Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Create</em>' attribute.
	 * @see #isSetAllowCreate()
	 * @see #unsetAllowCreate()
	 * @see #isAllowCreate()
	 * @generated
	 */
	void setAllowCreate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#isAllowCreate <em>Allow Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowCreate()
	 * @see #isAllowCreate()
	 * @see #setAllowCreate(boolean)
	 * @generated
	 */
	void unsetAllowCreate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#isAllowCreate <em>Allow Create</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Create</em>' attribute is set.
	 * @see #unsetAllowCreate()
	 * @see #isAllowCreate()
	 * @see #setAllowCreate(boolean)
	 * @generated
	 */
	boolean isSetAllowCreate();

	/**
	 * Returns the value of the '<em><b>Object Expansion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectExpansion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Expansion</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ObjectExpansion
	 * @see #isSetObjectExpansion()
	 * @see #unsetObjectExpansion()
	 * @see #setObjectExpansion(ObjectExpansion)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlter_ObjectExpansion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ObjectExpansion'"
	 * @generated
	 */
	ObjectExpansion getObjectExpansion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObjectExpansion <em>Object Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Expansion</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ObjectExpansion
	 * @see #isSetObjectExpansion()
	 * @see #unsetObjectExpansion()
	 * @see #getObjectExpansion()
	 * @generated
	 */
	void setObjectExpansion(ObjectExpansion value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObjectExpansion <em>Object Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectExpansion()
	 * @see #getObjectExpansion()
	 * @see #setObjectExpansion(ObjectExpansion)
	 * @generated
	 */
	void unsetObjectExpansion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getObjectExpansion <em>Object Expansion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Expansion</em>' attribute is set.
	 * @see #unsetObjectExpansion()
	 * @see #getObjectExpansion()
	 * @see #setObjectExpansion(ObjectExpansion)
	 * @generated
	 */
	boolean isSetObjectExpansion();

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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlter_Scope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Scope'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getScope <em>Scope</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	boolean isSetScope();

} // Alter
