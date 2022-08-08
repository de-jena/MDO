/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Design Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute#getEstimatedCount <em>Estimated Count</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesignAttribute()
 * @model extendedMetaData="name='AggregationDesignAttribute' kind='elementOnly'"
 * @generated
 */
public interface AggregationDesignAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesignAttribute_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Count</em>' attribute.
	 * @see #isSetEstimatedCount()
	 * @see #unsetEstimatedCount()
	 * @see #setEstimatedCount(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesignAttribute_EstimatedCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedCount'"
	 * @generated
	 */
	long getEstimatedCount();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute#getEstimatedCount <em>Estimated Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Count</em>' attribute.
	 * @see #isSetEstimatedCount()
	 * @see #unsetEstimatedCount()
	 * @see #getEstimatedCount()
	 * @generated
	 */
	void setEstimatedCount(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute#getEstimatedCount <em>Estimated Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedCount()
	 * @see #getEstimatedCount()
	 * @see #setEstimatedCount(long)
	 * @generated
	 */
	void unsetEstimatedCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute#getEstimatedCount <em>Estimated Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Count</em>' attribute is set.
	 * @see #unsetEstimatedCount()
	 * @see #getEstimatedCount()
	 * @see #setEstimatedCount(long)
	 * @generated
	 */
	boolean isSetEstimatedCount();

} // AggregationDesignAttribute
