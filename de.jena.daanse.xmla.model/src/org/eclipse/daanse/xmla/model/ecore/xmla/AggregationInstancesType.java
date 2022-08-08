/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstancesType#getAggregationInstance <em>Aggregation Instance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstancesType()
 * @model extendedMetaData="name='AggregationInstances_._type' kind='elementOnly'"
 * @generated
 */
public interface AggregationInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Instance</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstancesType_AggregationInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationInstance'"
	 * @generated
	 */
	EList<AggregationInstance> getAggregationInstance();

} // AggregationInstancesType
