/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getAggregations <em>Aggregations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getEstimatedPerformanceGain <em>Estimated Performance Gain</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign()
 * @model extendedMetaData="name='AggregationDesign' kind='elementOnly'"
 * @generated
 */
public interface AggregationDesign extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Created Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Timestamp</em>' attribute.
	 * @see #setCreatedTimestamp(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Timestamp</em>' attribute.
	 * @see #getCreatedTimestamp()
	 * @generated
	 */
	void setCreatedTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Schema Update</em>' attribute.
	 * @see #setLastSchemaUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Schema Update</em>' attribute.
	 * @see #getLastSchemaUpdate()
	 * @generated
	 */
	void setLastSchemaUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Estimated Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Rows</em>' attribute.
	 * @see #isSetEstimatedRows()
	 * @see #unsetEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_EstimatedRows()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedRows'"
	 * @generated
	 */
	long getEstimatedRows();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getEstimatedRows <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Rows</em>' attribute.
	 * @see #isSetEstimatedRows()
	 * @see #unsetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @generated
	 */
	void setEstimatedRows(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getEstimatedRows <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @generated
	 */
	void unsetEstimatedRows();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getEstimatedRows <em>Estimated Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Rows</em>' attribute is set.
	 * @see #unsetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @generated
	 */
	boolean isSetEstimatedRows();

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_Dimensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dimensions'"
	 * @generated
	 */
	DimensionsType getDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType value);

	/**
	 * Returns the value of the '<em><b>Aggregations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregations</em>' containment reference.
	 * @see #setAggregations(AggregationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_Aggregations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aggregations'"
	 * @generated
	 */
	AggregationsType getAggregations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getAggregations <em>Aggregations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregations</em>' containment reference.
	 * @see #getAggregations()
	 * @generated
	 */
	void setAggregations(AggregationsType value);

	/**
	 * Returns the value of the '<em><b>Estimated Performance Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Performance Gain</em>' attribute.
	 * @see #setEstimatedPerformanceGain(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationDesign_EstimatedPerformanceGain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='EstimatedPerformanceGain'"
	 * @generated
	 */
	BigInteger getEstimatedPerformanceGain();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign#getEstimatedPerformanceGain <em>Estimated Performance Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Performance Gain</em>' attribute.
	 * @see #getEstimatedPerformanceGain()
	 * @generated
	 */
	void setEstimatedPerformanceGain(BigInteger value);

} // AggregationDesign
