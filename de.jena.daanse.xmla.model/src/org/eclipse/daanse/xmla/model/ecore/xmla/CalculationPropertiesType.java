/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationPropertiesType#getCalculationProperty <em>Calculation Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationPropertiesType()
 * @model extendedMetaData="name='CalculationProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface CalculationPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculation Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Property</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationPropertiesType_CalculationProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CalculationProperty'"
	 * @generated
	 */
	EList<CalculationProperty> getCalculationProperty();

} // CalculationPropertiesType
