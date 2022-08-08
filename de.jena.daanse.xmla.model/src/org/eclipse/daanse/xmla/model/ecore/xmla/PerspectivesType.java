/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspectives Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectivesType#getPerspective <em>Perspective</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectivesType()
 * @model extendedMetaData="name='Perspectives_._type' kind='elementOnly'"
 * @generated
 */
public interface PerspectivesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Perspective</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Perspective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectivesType_Perspective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Perspective'"
	 * @generated
	 */
	EList<Perspective> getPerspective();

} // PerspectivesType
