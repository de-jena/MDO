/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.ValueType#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getValueType()
 * @model extendedMetaData="name='Value_._type' kind='elementOnly'"
 * @generated
 */
public interface ValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getValueType_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Error'"
	 * @generated
	 */
	EList<CellTypeError> getError();

} // ValueType
