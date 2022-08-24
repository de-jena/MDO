/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restrictions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions#getRestrictionList <em>Restriction List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestrictions()
 * @model extendedMetaData="name='Restrictions_._type' kind='elementOnly'"
 * @generated
 */
public interface Restrictions extends EObject {
	/**
	 * Returns the value of the '<em><b>Restriction List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction List</em>' containment reference.
	 * @see #isSetRestrictionList()
	 * @see #unsetRestrictionList()
	 * @see #setRestrictionList(RestrictionList)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestrictions_RestrictionList()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RestrictionList'"
	 * @generated
	 */
	RestrictionList getRestrictionList();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions#getRestrictionList <em>Restriction List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction List</em>' containment reference.
	 * @see #isSetRestrictionList()
	 * @see #unsetRestrictionList()
	 * @see #getRestrictionList()
	 * @generated
	 */
	void setRestrictionList(RestrictionList value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions#getRestrictionList <em>Restriction List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestrictionList()
	 * @see #getRestrictionList()
	 * @see #setRestrictionList(RestrictionList)
	 * @generated
	 */
	void unsetRestrictionList();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions#getRestrictionList <em>Restriction List</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Restriction List</em>' containment reference is set.
	 * @see #unsetRestrictionList()
	 * @see #getRestrictionList()
	 * @see #setRestrictionList(RestrictionList)
	 * @generated
	 */
	boolean isSetRestrictionList();

} // Restrictions
