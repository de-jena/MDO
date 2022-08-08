/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getLeaf <em>Leaf</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getAnd1 <em>And1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getOr1 <em>Or1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getNot1 <em>Not1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getLeaf1 <em>Leaf1</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr()
 * @model extendedMetaData="name='boolean_expr' kind='elementOnly'"
 * @generated
 */
public interface BooleanExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(BooleanExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='and'"
	 * @generated
	 */
	BooleanExpr getAnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getAnd <em>And</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='or'"
	 * @generated
	 */
	BooleanExpr getOr();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(UnaryExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_Not()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='not'"
	 * @generated
	 */
	UnaryExpr getNot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(UnaryExpr value);

	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' containment reference.
	 * @see #setLeaf(PredLeaf)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_Leaf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leaf'"
	 * @generated
	 */
	PredLeaf getLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getLeaf <em>Leaf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' containment reference.
	 * @see #getLeaf()
	 * @generated
	 */
	void setLeaf(PredLeaf value);

	/**
	 * Returns the value of the '<em><b>And1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And1</em>' containment reference.
	 * @see #setAnd1(BooleanExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_And1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='and'"
	 * @generated
	 */
	BooleanExpr getAnd1();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getAnd1 <em>And1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And1</em>' containment reference.
	 * @see #getAnd1()
	 * @generated
	 */
	void setAnd1(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Or1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or1</em>' containment reference.
	 * @see #setOr1(BooleanExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_Or1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='or'"
	 * @generated
	 */
	BooleanExpr getOr1();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getOr1 <em>Or1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or1</em>' containment reference.
	 * @see #getOr1()
	 * @generated
	 */
	void setOr1(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Not1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not1</em>' containment reference.
	 * @see #setNot1(UnaryExpr)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_Not1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='not'"
	 * @generated
	 */
	UnaryExpr getNot1();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getNot1 <em>Not1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not1</em>' containment reference.
	 * @see #getNot1()
	 * @generated
	 */
	void setNot1(UnaryExpr value);

	/**
	 * Returns the value of the '<em><b>Leaf1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf1</em>' containment reference.
	 * @see #setLeaf1(PredLeaf)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBooleanExpr_Leaf1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leaf'"
	 * @generated
	 */
	PredLeaf getLeaf1();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr#getLeaf1 <em>Leaf1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf1</em>' containment reference.
	 * @see #getLeaf1()
	 * @generated
	 */
	void setLeaf1(PredLeaf value);

} // BooleanExpr
