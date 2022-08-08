/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataType1#getEventCategory <em>Event Category</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataType1()
 * @model extendedMetaData="name='Data_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface DataType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Category</em>' containment reference.
	 * @see #setEventCategory(EventCategoryType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataType1_EventCategory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EventCategory'"
	 * @generated
	 */
	EventCategoryType getEventCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataType1#getEventCategory <em>Event Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Category</em>' containment reference.
	 * @see #getEventCategory()
	 * @generated
	 */
	void setEventCategory(EventCategoryType value);

} // DataType1
