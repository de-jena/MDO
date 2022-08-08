/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureGroup <em>Measure Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningMeasureType()
 * @model extendedMetaData="name='WarningMeasure_._type' kind='elementOnly'"
 * @generated
 */
public interface WarningMeasureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cube</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' attribute.
	 * @see #setCube(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningMeasureType_Cube()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Cube'"
	 * @generated
	 */
	String getCube();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getCube <em>Cube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' attribute.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(String value);

	/**
	 * Returns the value of the '<em><b>Measure Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group</em>' attribute.
	 * @see #setMeasureGroup(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningMeasureType_MeasureGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureGroup'"
	 * @generated
	 */
	String getMeasureGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureGroup <em>Measure Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group</em>' attribute.
	 * @see #getMeasureGroup()
	 * @generated
	 */
	void setMeasureGroup(String value);

	/**
	 * Returns the value of the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Name</em>' attribute.
	 * @see #setMeasureName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningMeasureType_MeasureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureName'"
	 * @generated
	 */
	String getMeasureName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType#getMeasureName <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Name</em>' attribute.
	 * @see #getMeasureName()
	 * @generated
	 */
	void setMeasureName(String value);

} // WarningMeasureType
