/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective Measure Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveMeasureGroup()
 * @model extendedMetaData="name='PerspectiveMeasureGroup' kind='elementOnly'"
 * @generated
 */
public interface PerspectiveMeasureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group ID</em>' attribute.
	 * @see #setMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveMeasureGroup_MeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureGroupID'"
	 * @generated
	 */
	String getMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup#getMeasureGroupID <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group ID</em>' attribute.
	 * @see #getMeasureGroupID()
	 * @generated
	 */
	void setMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference.
	 * @see #setMeasures(MeasuresType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveMeasureGroup_Measures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measures'"
	 * @generated
	 */
	MeasuresType2 getMeasures();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup#getMeasures <em>Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measures</em>' containment reference.
	 * @see #getMeasures()
	 * @generated
	 */
	void setMeasures(MeasuresType2 value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType31)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveMeasureGroup_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType31 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType31 value);

} // PerspectiveMeasureGroup
