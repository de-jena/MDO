/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Instance Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute#getKeyColumns <em>Key Columns</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstanceAttribute()
 * @model extendedMetaData="name='AggregationInstanceAttribute' kind='elementOnly'"
 * @generated
 */
public interface AggregationInstanceAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstanceAttribute_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' containment reference.
	 * @see #setKeyColumns(KeyColumnsType4)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationInstanceAttribute_KeyColumns()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='KeyColumns'"
	 * @generated
	 */
	KeyColumnsType4 getKeyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute#getKeyColumns <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Columns</em>' containment reference.
	 * @see #getKeyColumns()
	 * @generated
	 */
	void setKeyColumns(KeyColumnsType4 value);

} // AggregationInstanceAttribute
