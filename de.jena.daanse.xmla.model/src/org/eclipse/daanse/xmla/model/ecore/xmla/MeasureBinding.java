/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureBinding#getMeasureID <em>Measure ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureBinding()
 * @model extendedMetaData="name='MeasureBinding' kind='elementOnly'"
 * @generated
 */
public interface MeasureBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Measure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure ID</em>' attribute.
	 * @see #setMeasureID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureBinding_MeasureID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureID'"
	 * @generated
	 */
	String getMeasureID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureBinding#getMeasureID <em>Measure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure ID</em>' attribute.
	 * @see #getMeasureID()
	 * @generated
	 */
	void setMeasureID(String value);

} // MeasureBinding
