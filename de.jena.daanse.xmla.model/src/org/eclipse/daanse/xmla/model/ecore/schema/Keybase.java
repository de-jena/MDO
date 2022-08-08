/**
 */
package org.eclipse.daanse.xmla.model.ecore.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keybase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.schema.Keybase#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.schema.Keybase#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.schema.Keybase#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage#getKeybase()
 * @model extendedMetaData="name='keybase' kind='elementOnly'"
 * @generated
 */
public interface Keybase extends Annotated {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(SelectorType)
	 * @see org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage#getKeybase_Selector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='selector' namespace='##targetNamespace'"
	 * @generated
	 */
	SelectorType getSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.schema.Keybase#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(SelectorType value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.schema.FieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage#getKeybase_Field()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldType> getField();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage#getKeybase_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.schema.Keybase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Keybase
