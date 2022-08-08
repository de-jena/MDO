/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getLeaf <em>Leaf</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnaryExpr()
 * @model extendedMetaData="name='unary_expr' kind='elementOnly'"
 * @generated
 */
public interface UnaryExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(UnaryExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnaryExpr_Not()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='not'"
	 * @generated
	 */
	UnaryExpr getNot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(UnaryExpr value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(BooleanExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnaryExpr_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='and'"
	 * @generated
	 */
	BooleanExpr getAnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(BooleanExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnaryExpr_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='or'"
	 * @generated
	 */
	BooleanExpr getOr();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' containment reference.
	 * @see #setLeaf(PredLeaf)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnaryExpr_Leaf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leaf'"
	 * @generated
	 */
	PredLeaf getLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr#getLeaf <em>Leaf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' containment reference.
	 * @see #getLeaf()
	 * @generated
	 */
	void setLeaf(PredLeaf value);

} // UnaryExpr
