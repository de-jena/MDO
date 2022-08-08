/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_rowset;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rowset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage#getRowset()
 * @model extendedMetaData="name='rowset' kind='elementOnly'"
 * @generated
 */
public interface Rowset extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage#getRowset_Row()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='row'"
	 * @generated
	 */
	EList<Row> getRow();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage#getRowset_Exception()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Exception'"
	 * @generated
	 */
	org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception getException();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference.
	 * @see #setMessages(Messages)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage#getRowset_Messages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Messages'"
	 * @generated
	 */
	Messages getMessages();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset#getMessages <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' containment reference.
	 * @see #getMessages()
	 * @generated
	 */
	void setMessages(Messages value);

} // Rowset
