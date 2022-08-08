/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200;

import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getExpressionBinding()
 * @model extendedMetaData="name='ExpressionBinding' kind='elementOnly'"
 * @generated
 */
public interface ExpressionBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getExpressionBinding_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // ExpressionBinding
