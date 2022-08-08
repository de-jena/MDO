/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Levels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.LevelsType#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getLevelsType()
 * @model extendedMetaData="name='Levels_._type' kind='elementOnly'"
 * @generated
 */
public interface LevelsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getLevelsType_Level()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Level'"
	 * @generated
	 */
	EList<Level> getLevel();

} // LevelsType
