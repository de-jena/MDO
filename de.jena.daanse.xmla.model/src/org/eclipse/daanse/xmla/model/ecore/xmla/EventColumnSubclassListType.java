/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Column Subclass List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassListType#getEventColumnSubclass <em>Event Column Subclass</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumnSubclassListType()
 * @model extendedMetaData="name='EventColumnSubclassList_._type' kind='elementOnly'"
 * @generated
 */
public interface EventColumnSubclassListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Column Subclass</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Column Subclass</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumnSubclassListType_EventColumnSubclass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventColumnSubclass'"
	 * @generated
	 */
	EList<EventColumnSubclassType> getEventColumnSubclass();

} // EventColumnSubclassListType
