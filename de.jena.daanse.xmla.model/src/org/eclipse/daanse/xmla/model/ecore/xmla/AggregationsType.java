/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationsType#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationsType()
 * @model extendedMetaData="name='Aggregations_._type' kind='elementOnly'"
 * @generated
 */
public interface AggregationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationsType_Aggregation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aggregation'"
	 * @generated
	 */
	EList<Aggregation> getAggregation();

} // AggregationsType
