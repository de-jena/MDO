/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Groups Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1#getMeasureGroup <em>Measure Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupsType1()
 * @model extendedMetaData="name='MeasureGroups_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface MeasureGroupsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupsType1_MeasureGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureGroup'"
	 * @generated
	 */
	EList<PerspectiveMeasureGroup> getMeasureGroup();

} // MeasureGroupsType1
