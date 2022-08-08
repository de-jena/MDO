/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getNotEqual <em>Not Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getLess <em>Less</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getLessOrEqual <em>Less Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getGreater <em>Greater</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getGreaterOrEqual <em>Greater Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getLike <em>Like</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getNotLike <em>Not Like</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType()
 * @model extendedMetaData="name='not_type' kind='elementOnly'"
 * @generated
 */
public interface NotType extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(NotType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_Not()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Not'"
	 * @generated
	 */
	NotType getNot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getNot <em>Not</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Or'"
	 * @generated
	 */
	AndOrType getOr();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getOr <em>Or</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='And'"
	 * @generated
	 */
	AndOrType getAnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getAnd <em>And</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_Equal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Equal'"
	 * @generated
	 */
	BoolBinop getEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getEqual <em>Equal</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_NotEqual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotEqual'"
	 * @generated
	 */
	BoolBinop getNotEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getNotEqual <em>Not Equal</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_Less()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Less'"
	 * @generated
	 */
	BoolBinop getLess();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getLess <em>Less</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_LessOrEqual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LessOrEqual'"
	 * @generated
	 */
	BoolBinop getLessOrEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getLessOrEqual <em>Less Or Equal</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_Greater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Greater'"
	 * @generated
	 */
	BoolBinop getGreater();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getGreater <em>Greater</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_GreaterOrEqual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GreaterOrEqual'"
	 * @generated
	 */
	BoolBinop getGreaterOrEqual();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getGreaterOrEqual <em>Greater Or Equal</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_Like()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Like'"
	 * @generated
	 */
	BoolBinop getLike();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getLike <em>Like</em>}' containment reference.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotType_NotLike()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotLike'"
	 * @generated
	 */
	BoolBinop getNotLike();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType#getNotLike <em>Not Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Like</em>' containment reference.
	 * @see #getNotLike()
	 * @generated
	 */
	void setNotLike(BoolBinop value);

} // NotType
