/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStatement()
 * @model extendedMetaData="name='Statement' kind='elementOnly'"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStatement_Statement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Statement'"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Statement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

} // Statement