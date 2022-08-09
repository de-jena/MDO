/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Many Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getDirectSlice <em>Direct Slice</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getManyToManyMeasureGroupDimension()
 * @model extendedMetaData="name='ManyToManyMeasureGroupDimension' kind='elementOnly'"
 * @generated
 */
public interface ManyToManyMeasureGroupDimension extends MeasureGroupDimension {
	/**
	 * Returns the value of the '<em><b>Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #setCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getManyToManyMeasureGroupDimension_CubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeDimensionID'"
	 * @generated
	 */
	String getCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getManyToManyMeasureGroupDimension_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getAnnotations <em>Annotations</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getManyToManyMeasureGroupDimension_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	MeasureGroupDimensionBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MeasureGroupDimensionBinding value);

	/**
	 * Returns the value of the '<em><b>Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group ID</em>' attribute.
	 * @see #setMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getManyToManyMeasureGroupDimension_MeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MeasureGroupID'"
	 * @generated
	 */
	String getMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getMeasureGroupID <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group ID</em>' attribute.
	 * @see #getMeasureGroupID()
	 * @generated
	 */
	void setMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Direct Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Slice</em>' attribute.
	 * @see #setDirectSlice(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getManyToManyMeasureGroupDimension_DirectSlice()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DirectSlice'"
	 * @generated
	 */
	String getDirectSlice();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension#getDirectSlice <em>Direct Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Slice</em>' attribute.
	 * @see #getDirectSlice()
	 * @generated
	 */
	void setDirectSlice(String value);

} // ManyToManyMeasureGroupDimension
