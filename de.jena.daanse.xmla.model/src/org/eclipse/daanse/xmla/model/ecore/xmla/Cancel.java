/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#getSPID <em>SPID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#isCancelAssociated <em>Cancel Associated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCancel()
 * @model extendedMetaData="name='Cancel' kind='elementOnly'"
 * @generated
 */
public interface Cancel extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection ID</em>' attribute.
	 * @see #setConnectionID(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCancel_ConnectionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ConnectionID'"
	 * @generated
	 */
	BigInteger getConnectionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#getConnectionID <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection ID</em>' attribute.
	 * @see #getConnectionID()
	 * @generated
	 */
	void setConnectionID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session ID</em>' attribute.
	 * @see #setSessionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCancel_SessionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SessionID'"
	 * @generated
	 */
	String getSessionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#getSessionID <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session ID</em>' attribute.
	 * @see #getSessionID()
	 * @generated
	 */
	void setSessionID(String value);

	/**
	 * Returns the value of the '<em><b>SPID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPID</em>' attribute.
	 * @see #setSPID(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCancel_SPID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SPID'"
	 * @generated
	 */
	BigInteger getSPID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#getSPID <em>SPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPID</em>' attribute.
	 * @see #getSPID()
	 * @generated
	 */
	void setSPID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cancel Associated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Associated</em>' attribute.
	 * @see #isSetCancelAssociated()
	 * @see #unsetCancelAssociated()
	 * @see #setCancelAssociated(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCancel_CancelAssociated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='CancelAssociated'"
	 * @generated
	 */
	boolean isCancelAssociated();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#isCancelAssociated <em>Cancel Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Associated</em>' attribute.
	 * @see #isSetCancelAssociated()
	 * @see #unsetCancelAssociated()
	 * @see #isCancelAssociated()
	 * @generated
	 */
	void setCancelAssociated(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#isCancelAssociated <em>Cancel Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCancelAssociated()
	 * @see #isCancelAssociated()
	 * @see #setCancelAssociated(boolean)
	 * @generated
	 */
	void unsetCancelAssociated();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel#isCancelAssociated <em>Cancel Associated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cancel Associated</em>' attribute is set.
	 * @see #unsetCancelAssociated()
	 * @see #isCancelAssociated()
	 * @see #setCancelAssociated(boolean)
	 * @generated
	 */
	boolean isSetCancelAssociated();

} // Cancel
