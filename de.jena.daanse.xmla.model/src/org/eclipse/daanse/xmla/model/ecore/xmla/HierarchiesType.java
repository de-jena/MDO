/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchiesType()
 * @model extendedMetaData="name='Hierarchies_._type' kind='elementOnly'"
 * @generated
 */
public interface HierarchiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchiesType_Hierarchy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hierarchy'"
	 * @generated
	 */
	EList<Hierarchy> getHierarchy();

} // HierarchiesType
