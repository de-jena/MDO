/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getIntermediateCubeDimensionID <em>Intermediate Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getIntermediateGranularityAttributeID <em>Intermediate Granularity Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getMaterialization <em>Materialization</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getProcessingState <em>Processing State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension()
 * @model extendedMetaData="name='ReferenceMeasureGroupDimension' kind='elementOnly'"
 * @generated
 */
public interface ReferenceMeasureGroupDimension extends MeasureGroupDimension {
	/**
	 * Returns the value of the '<em><b>Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #setCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_CubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeDimensionID'"
	 * @generated
	 */
	String getCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}' attribute.
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
	 * @see #setAnnotations(AnnotationsType44)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType44 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType44 value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MeasureGroupDimensionBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	MeasureGroupDimensionBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MeasureGroupDimensionBinding value);

	/**
	 * Returns the value of the '<em><b>Intermediate Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Cube Dimension ID</em>' attribute.
	 * @see #setIntermediateCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_IntermediateCubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='IntermediateCubeDimensionID'"
	 * @generated
	 */
	String getIntermediateCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getIntermediateCubeDimensionID <em>Intermediate Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Cube Dimension ID</em>' attribute.
	 * @see #getIntermediateCubeDimensionID()
	 * @generated
	 */
	void setIntermediateCubeDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Intermediate Granularity Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Granularity Attribute ID</em>' attribute.
	 * @see #setIntermediateGranularityAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_IntermediateGranularityAttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='IntermediateGranularityAttributeID'"
	 * @generated
	 */
	String getIntermediateGranularityAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getIntermediateGranularityAttributeID <em>Intermediate Granularity Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Granularity Attribute ID</em>' attribute.
	 * @see #getIntermediateGranularityAttributeID()
	 * @generated
	 */
	void setIntermediateGranularityAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Materialization</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MaterializationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materialization</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MaterializationType
	 * @see #isSetMaterialization()
	 * @see #unsetMaterialization()
	 * @see #setMaterialization(MaterializationType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_Materialization()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Materialization'"
	 * @generated
	 */
	MaterializationType getMaterialization();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getMaterialization <em>Materialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materialization</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MaterializationType
	 * @see #isSetMaterialization()
	 * @see #unsetMaterialization()
	 * @see #getMaterialization()
	 * @generated
	 */
	void setMaterialization(MaterializationType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getMaterialization <em>Materialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterialization()
	 * @see #getMaterialization()
	 * @see #setMaterialization(MaterializationType)
	 * @generated
	 */
	void unsetMaterialization();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getMaterialization <em>Materialization</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Materialization</em>' attribute is set.
	 * @see #unsetMaterialization()
	 * @see #getMaterialization()
	 * @see #setMaterialization(MaterializationType)
	 * @generated
	 */
	boolean isSetMaterialization();

	/**
	 * Returns the value of the '<em><b>Processing State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @see #isSetProcessingState()
	 * @see #unsetProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReferenceMeasureGroupDimension_ProcessingState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingState' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	ProcessingStateType getProcessingState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @see #isSetProcessingState()
	 * @see #unsetProcessingState()
	 * @see #getProcessingState()
	 * @generated
	 */
	void setProcessingState(ProcessingStateType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingState()
	 * @see #getProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @generated
	 */
	void unsetProcessingState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension#getProcessingState <em>Processing State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing State</em>' attribute is set.
	 * @see #unsetProcessingState()
	 * @see #getProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @generated
	 */
	boolean isSetProcessingState();

} // ReferenceMeasureGroupDimension
