/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType#getAlgorithmParameter <em>Algorithm Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlgorithmParametersType()
 * @model extendedMetaData="name='AlgorithmParameters_._type' kind='elementOnly'"
 * @generated
 */
public interface AlgorithmParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Parameter</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlgorithmParametersType_AlgorithmParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlgorithmParameter'"
	 * @generated
	 */
	EList<AlgorithmParameter> getAlgorithmParameter();

} // AlgorithmParametersType
