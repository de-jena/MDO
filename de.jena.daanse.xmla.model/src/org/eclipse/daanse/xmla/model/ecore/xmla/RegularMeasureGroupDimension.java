/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRegularMeasureGroupDimension()
 * @model extendedMetaData="name='RegularMeasureGroupDimension' kind='elementOnly'"
 * @generated
 */
public interface RegularMeasureGroupDimension extends MeasureGroupDimension {
	/**
	 * Returns the value of the '<em><b>Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #setCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRegularMeasureGroupDimension_CubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeDimensionID'"
	 * @generated
	 */
	String getCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #getCubeDimensionID()
	 * @generated
	 */
	void setCubeDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRegularMeasureGroupDimension_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MeasureGroupDimensionBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRegularMeasureGroupDimension_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	MeasureGroupDimensionBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MeasureGroupDimensionBinding value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType
	 * @see #isSetCardinality()
	 * @see #unsetCardinality()
	 * @see #setCardinality(CardinalityType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRegularMeasureGroupDimension_Cardinality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Cardinality'"
	 * @generated
	 */
	CardinalityType getCardinality();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType
	 * @see #isSetCardinality()
	 * @see #unsetCardinality()
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCardinality()
	 * @see #getCardinality()
	 * @see #setCardinality(CardinalityType)
	 * @generated
	 */
	void unsetCardinality();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getCardinality <em>Cardinality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cardinality</em>' attribute is set.
	 * @see #unsetCardinality()
	 * @see #getCardinality()
	 * @see #setCardinality(CardinalityType)
	 * @generated
	 */
	boolean isSetCardinality();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributesType6)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRegularMeasureGroupDimension_Attributes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Attributes'"
	 * @generated
	 */
	AttributesType6 getAttributes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributesType6 value);

} // RegularMeasureGroupDimension
