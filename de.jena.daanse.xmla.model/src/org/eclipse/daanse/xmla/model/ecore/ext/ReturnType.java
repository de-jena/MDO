/**
 */
package org.eclipse.daanse.xmla.model.ecore.ext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.ext.ReturnType#getSspiHandshake <em>Sspi Handshake</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage#getReturnType()
 * @model extendedMetaData="name='return_._type' kind='elementOnly'"
 * @generated
 */
public interface ReturnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sspi Handshake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sspi Handshake</em>' attribute.
	 * @see #setSspiHandshake(byte[])
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage#getReturnType_SspiHandshake()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
	 *        extendedMetaData="kind='element' name='SspiHandshake'"
	 * @generated
	 */
	byte[] getSspiHandshake();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.ext.ReturnType#getSspiHandshake <em>Sspi Handshake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sspi Handshake</em>' attribute.
	 * @see #getSspiHandshake()
	 * @generated
	 */
	void setSspiHandshake(byte[] value);

} // ReturnType
