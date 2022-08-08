/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Models Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelsType#getMiningModel <em>Mining Model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelsType()
 * @model extendedMetaData="name='MiningModels_._type' kind='elementOnly'"
 * @generated
 */
public interface MiningModelsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mining Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelsType_MiningModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningModel'"
	 * @generated
	 */
	EList<MiningModel> getMiningModel();

} // MiningModelsType
