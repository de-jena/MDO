/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Instance Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure#getMeasureID <em>Measure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstanceMeasure()
 * @model extendedMetaData="name='AggregationInstanceMeasure' kind='elementOnly'"
 * @generated
 */
public interface AggregationInstanceMeasure extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure ID</em>' attribute.
	 * @see #setMeasureID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstanceMeasure_MeasureID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureID'"
	 * @generated
	 */
	String getMeasureID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure#getMeasureID <em>Measure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure ID</em>' attribute.
	 * @see #getMeasureID()
	 * @generated
	 */
	void setMeasureID(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ColumnBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstanceMeasure_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	ColumnBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ColumnBinding value);

} // AggregationInstanceMeasure
