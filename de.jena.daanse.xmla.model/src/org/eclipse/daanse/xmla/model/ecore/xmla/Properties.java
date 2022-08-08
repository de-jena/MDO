/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Properties#getPropertyList <em>Property List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProperties()
 * @model extendedMetaData="name='Properties' kind='elementOnly'"
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Property List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property List</em>' containment reference.
	 * @see #setPropertyList(PropertyList)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProperties_PropertyList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyList'"
	 * @generated
	 */
	PropertyList getPropertyList();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Properties#getPropertyList <em>Property List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property List</em>' containment reference.
	 * @see #getPropertyList()
	 * @generated
	 */
	void setPropertyList(PropertyList value);

} // Properties
