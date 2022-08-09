/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAggregationUsage <em>Aggregation Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute()
 * @model extendedMetaData="name='CubeAttribute' kind='elementOnly'"
 * @generated
 */
public interface CubeAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationUsageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationUsageType
	 * @see #isSetAggregationUsage()
	 * @see #unsetAggregationUsage()
	 * @see #setAggregationUsage(AggregationUsageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute_AggregationUsage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AggregationUsage'"
	 * @generated
	 */
	AggregationUsageType getAggregationUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAggregationUsage <em>Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationUsageType
	 * @see #isSetAggregationUsage()
	 * @see #unsetAggregationUsage()
	 * @see #getAggregationUsage()
	 * @generated
	 */
	void setAggregationUsage(AggregationUsageType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAggregationUsage <em>Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationUsage()
	 * @see #getAggregationUsage()
	 * @see #setAggregationUsage(AggregationUsageType)
	 * @generated
	 */
	void unsetAggregationUsage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAggregationUsage <em>Aggregation Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Usage</em>' attribute is set.
	 * @see #unsetAggregationUsage()
	 * @see #getAggregationUsage()
	 * @see #setAggregationUsage(AggregationUsageType)
	 * @generated
	 */
	boolean isSetAggregationUsage();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Optimized State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Optimized State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType1
	 * @see #isSetAttributeHierarchyOptimizedState()
	 * @see #unsetAttributeHierarchyOptimizedState()
	 * @see #setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute_AttributeHierarchyOptimizedState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyOptimizedState'"
	 * @generated
	 */
	AttributeHierarchyOptimizedStateType1 getAttributeHierarchyOptimizedState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Optimized State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType1
	 * @see #isSetAttributeHierarchyOptimizedState()
	 * @see #unsetAttributeHierarchyOptimizedState()
	 * @see #getAttributeHierarchyOptimizedState()
	 * @generated
	 */
	void setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyOptimizedState()
	 * @see #getAttributeHierarchyOptimizedState()
	 * @see #setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType1)
	 * @generated
	 */
	void unsetAttributeHierarchyOptimizedState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Optimized State</em>' attribute is set.
	 * @see #unsetAttributeHierarchyOptimizedState()
	 * @see #getAttributeHierarchyOptimizedState()
	 * @see #setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType1)
	 * @generated
	 */
	boolean isSetAttributeHierarchyOptimizedState();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Enabled</em>' attribute.
	 * @see #isSetAttributeHierarchyEnabled()
	 * @see #unsetAttributeHierarchyEnabled()
	 * @see #setAttributeHierarchyEnabled(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute_AttributeHierarchyEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyEnabled'"
	 * @generated
	 */
	boolean isAttributeHierarchyEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Enabled</em>' attribute.
	 * @see #isSetAttributeHierarchyEnabled()
	 * @see #unsetAttributeHierarchyEnabled()
	 * @see #isAttributeHierarchyEnabled()
	 * @generated
	 */
	void setAttributeHierarchyEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyEnabled()
	 * @see #isAttributeHierarchyEnabled()
	 * @see #setAttributeHierarchyEnabled(boolean)
	 * @generated
	 */
	void unsetAttributeHierarchyEnabled();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Enabled</em>' attribute is set.
	 * @see #unsetAttributeHierarchyEnabled()
	 * @see #isAttributeHierarchyEnabled()
	 * @see #setAttributeHierarchyEnabled(boolean)
	 * @generated
	 */
	boolean isSetAttributeHierarchyEnabled();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Visible</em>' attribute.
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute_AttributeHierarchyVisible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyVisible'"
	 * @generated
	 */
	boolean isAttributeHierarchyVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Visible</em>' attribute.
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 */
	void setAttributeHierarchyVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @generated
	 */
	void unsetAttributeHierarchyVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Visible</em>' attribute is set.
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @generated
	 */
	boolean isSetAttributeHierarchyVisible();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeAttribute_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // CubeAttribute
