/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getNotEqual <em>Not Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getLess <em>Less</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getLessOrEqual <em>Less Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getGreater <em>Greater</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getGreaterOrEqual <em>Greater Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getLike <em>Like</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getNotLike <em>Not Like</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter()
 * @model extendedMetaData="name='TraceFilter' kind='elementOnly'"
 * @generated
 */
public interface TraceFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(NotType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_Not()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Not'"
	 * @generated
	 */
	NotType getNot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(NotType value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(AndOrType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Or'"
	 * @generated
	 */
	AndOrType getOr();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(AndOrType value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(AndOrType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='And'"
	 * @generated
	 */
	AndOrType getAnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(AndOrType value);

	/**
	 * Returns the value of the '<em><b>Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal</em>' containment reference.
	 * @see #setEqual(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_Equal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Equal'"
	 * @generated
	 */
	BoolBinop getEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getEqual <em>Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equal</em>' containment reference.
	 * @see #getEqual()
	 * @generated
	 */
	void setEqual(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Not Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Equal</em>' containment reference.
	 * @see #setNotEqual(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_NotEqual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotEqual'"
	 * @generated
	 */
	BoolBinop getNotEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getNotEqual <em>Not Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Equal</em>' containment reference.
	 * @see #getNotEqual()
	 * @generated
	 */
	void setNotEqual(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Less</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Less</em>' containment reference.
	 * @see #setLess(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_Less()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Less'"
	 * @generated
	 */
	BoolBinop getLess();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getLess <em>Less</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Less</em>' containment reference.
	 * @see #getLess()
	 * @generated
	 */
	void setLess(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Less Or Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Less Or Equal</em>' containment reference.
	 * @see #setLessOrEqual(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_LessOrEqual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LessOrEqual'"
	 * @generated
	 */
	BoolBinop getLessOrEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getLessOrEqual <em>Less Or Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Less Or Equal</em>' containment reference.
	 * @see #getLessOrEqual()
	 * @generated
	 */
	void setLessOrEqual(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Greater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater</em>' containment reference.
	 * @see #setGreater(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_Greater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Greater'"
	 * @generated
	 */
	BoolBinop getGreater();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getGreater <em>Greater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greater</em>' containment reference.
	 * @see #getGreater()
	 * @generated
	 */
	void setGreater(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Greater Or Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater Or Equal</em>' containment reference.
	 * @see #setGreaterOrEqual(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_GreaterOrEqual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GreaterOrEqual'"
	 * @generated
	 */
	BoolBinop getGreaterOrEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getGreaterOrEqual <em>Greater Or Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greater Or Equal</em>' containment reference.
	 * @see #getGreaterOrEqual()
	 * @generated
	 */
	void setGreaterOrEqual(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Like</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Like</em>' containment reference.
	 * @see #setLike(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_Like()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Like'"
	 * @generated
	 */
	BoolBinop getLike();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getLike <em>Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Like</em>' containment reference.
	 * @see #getLike()
	 * @generated
	 */
	void setLike(BoolBinop value);

	/**
	 * Returns the value of the '<em><b>Not Like</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Like</em>' containment reference.
	 * @see #setNotLike(BoolBinop)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceFilter_NotLike()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotLike'"
	 * @generated
	 */
	BoolBinop getNotLike();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter#getNotLike <em>Not Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Like</em>' containment reference.
	 * @see #getNotLike()
	 * @generated
	 */
	void setNotLike(BoolBinop value);

} // TraceFilter
