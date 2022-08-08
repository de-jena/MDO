/**
 */
package org.eclipse.daanse.xmla.model.ecore.ext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authenticate Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateResponseType#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage#getAuthenticateResponseType()
 * @model extendedMetaData="name='AuthenticateResponse_._type' kind='elementOnly'"
 * @generated
 */
public interface AuthenticateResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(ReturnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage#getAuthenticateResponseType_Return()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ReturnType getReturn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateResponseType#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnType value);

} // AuthenticateResponseType
