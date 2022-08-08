/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning Location Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningColumn <em>Warning Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningMeasure <em>Warning Measure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningLocationObject()
 * @model extendedMetaData="name='WarningLocationObject' kind='elementOnly'"
 * @generated
 */
public interface WarningLocationObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Warning Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Column</em>' containment reference.
	 * @see #setWarningColumn(WarningColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningLocationObject_WarningColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WarningColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	WarningColumnType getWarningColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningColumn <em>Warning Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Column</em>' containment reference.
	 * @see #getWarningColumn()
	 * @generated
	 */
	void setWarningColumn(WarningColumnType value);

	/**
	 * Returns the value of the '<em><b>Warning Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Measure</em>' containment reference.
	 * @see #setWarningMeasure(WarningMeasureType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningLocationObject_WarningMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WarningMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	WarningMeasureType getWarningMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject#getWarningMeasure <em>Warning Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Measure</em>' containment reference.
	 * @see #getWarningMeasure()
	 * @generated
	 */
	void setWarningMeasure(WarningMeasureType value);

} // WarningLocationObject
