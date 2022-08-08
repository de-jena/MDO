/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Designs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType#getAggregationDesign <em>Aggregation Design</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesignsType()
 * @model extendedMetaData="name='AggregationDesigns_._type' kind='elementOnly'"
 * @generated
 */
public interface AggregationDesignsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation Design</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Design</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesignsType_AggregationDesign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationDesign'"
	 * @generated
	 */
	EList<AggregationDesign> getAggregationDesign();

} // AggregationDesignsType
