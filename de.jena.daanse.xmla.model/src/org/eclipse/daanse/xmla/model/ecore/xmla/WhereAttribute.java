/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getWhereAttribute()
 * @model extendedMetaData="name='Where_Attribute' kind='elementOnly'"
 * @generated
 */
public interface WhereAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getWhereAttribute_AttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeName'"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference.
	 * @see #setKeys(KeysType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getWhereAttribute_Keys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Keys'"
	 * @generated
	 */
	KeysType getKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute#getKeys <em>Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys</em>' containment reference.
	 * @see #getKeys()
	 * @generated
	 */
	void setKeys(KeysType value);

} // WhereAttribute
