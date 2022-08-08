/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteResponseType#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getExecuteResponseType()
 * @model extendedMetaData="name='ExecuteResponse_._type' kind='elementOnly'"
 * @generated
 */
public interface ExecuteResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(Return)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getExecuteResponseType_Return()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	Return getReturn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteResponseType#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Return value);

} // ExecuteResponseType
