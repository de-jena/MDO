/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Column List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnListType#getEventColumn <em>Event Column</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumnListType()
 * @model extendedMetaData="name='EventColumnList_._type' kind='elementOnly'"
 * @generated
 */
public interface EventColumnListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Column</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumnListType_EventColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventColumn'"
	 * @generated
	 */
	EList<EventColumn> getEventColumn();

} // EventColumnListType
