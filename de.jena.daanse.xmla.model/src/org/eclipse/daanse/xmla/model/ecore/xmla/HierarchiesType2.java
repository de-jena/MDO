/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchies Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType2#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchiesType2()
 * @model extendedMetaData="name='Hierarchies_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface HierarchiesType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeHierarchy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchiesType2_Hierarchy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hierarchy'"
	 * @generated
	 */
	EList<CubeHierarchy> getHierarchy();

} // HierarchiesType2
