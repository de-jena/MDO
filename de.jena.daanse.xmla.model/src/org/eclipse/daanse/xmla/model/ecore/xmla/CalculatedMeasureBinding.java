/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Measure Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculatedMeasureBinding#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculatedMeasureBinding()
 * @model extendedMetaData="name='CalculatedMeasureBinding' kind='elementOnly'"
 * @generated
 */
public interface CalculatedMeasureBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Name</em>' attribute.
	 * @see #setMeasureName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculatedMeasureBinding_MeasureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureName'"
	 * @generated
	 */
	String getMeasureName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculatedMeasureBinding#getMeasureName <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Name</em>' attribute.
	 * @see #getMeasureName()
	 * @generated
	 */
	void setMeasureName(String value);

} // CalculatedMeasureBinding
