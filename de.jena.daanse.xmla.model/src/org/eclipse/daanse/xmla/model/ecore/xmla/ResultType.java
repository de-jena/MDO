/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResultType#getResultId <em>Result Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getResultType()
 * @model extendedMetaData="name='Result_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Id</em>' attribute.
	 * @see #setResultId(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getResultType_ResultId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ResultId'"
	 * @generated
	 */
	String getResultId();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResultType#getResultId <em>Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Id</em>' attribute.
	 * @see #getResultId()
	 * @generated
	 */
	void setResultId(String value);

} // ResultType
