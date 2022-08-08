/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Flags Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType#getModelingFlag <em>Modeling Flag</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getModelingFlagsType()
 * @model extendedMetaData="name='ModelingFlags_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelingFlagsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modeling Flag</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Flag</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getModelingFlagsType_ModelingFlag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelingFlag'"
	 * @generated
	 */
	EList<MiningModelingFlag> getModelingFlag();

} // ModelingFlagsType
