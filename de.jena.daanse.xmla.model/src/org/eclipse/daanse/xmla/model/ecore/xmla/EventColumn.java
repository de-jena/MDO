/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn#getEventColumnSubclassList <em>Event Column Subclass List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumn()
 * @model extendedMetaData="name='EventColumn' kind='elementOnly'"
 * @generated
 */
public interface EventColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumn_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	BigInteger getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Event Column Subclass List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Column Subclass List</em>' containment reference.
	 * @see #setEventColumnSubclassList(EventColumnSubclassListType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventColumn_EventColumnSubclassList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventColumnSubclassList'"
	 * @generated
	 */
	EventColumnSubclassListType getEventColumnSubclassList();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn#getEventColumnSubclassList <em>Event Column Subclass List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Column Subclass List</em>' containment reference.
	 * @see #getEventColumnSubclassList()
	 * @generated
	 */
	void setEventColumnSubclassList(EventColumnSubclassListType value);

} // EventColumn
