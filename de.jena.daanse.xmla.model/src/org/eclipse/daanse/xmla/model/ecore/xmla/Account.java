/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAggregationFunction <em>Aggregation Function</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAccount()
 * @model extendedMetaData="name='Account' kind='elementOnly'"
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Type</em>' attribute.
	 * @see #setAccountType(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAccount_AccountType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AccountType'"
	 * @generated
	 */
	String getAccountType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAccountType <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Type</em>' attribute.
	 * @see #getAccountType()
	 * @generated
	 */
	void setAccountType(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Function</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationFunctionType
	 * @see #isSetAggregationFunction()
	 * @see #unsetAggregationFunction()
	 * @see #setAggregationFunction(AggregationFunctionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAccount_AggregationFunction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AggregationFunction'"
	 * @generated
	 */
	AggregationFunctionType getAggregationFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAggregationFunction <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Function</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationFunctionType
	 * @see #isSetAggregationFunction()
	 * @see #unsetAggregationFunction()
	 * @see #getAggregationFunction()
	 * @generated
	 */
	void setAggregationFunction(AggregationFunctionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAggregationFunction <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationFunction()
	 * @see #getAggregationFunction()
	 * @see #setAggregationFunction(AggregationFunctionType)
	 * @generated
	 */
	void unsetAggregationFunction();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAggregationFunction <em>Aggregation Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Function</em>' attribute is set.
	 * @see #unsetAggregationFunction()
	 * @see #getAggregationFunction()
	 * @see #setAggregationFunction(AggregationFunctionType)
	 * @generated
	 */
	boolean isSetAggregationFunction();

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference.
	 * @see #setAliases(AliasesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAccount_Aliases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aliases'"
	 * @generated
	 */
	AliasesType getAliases();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAliases <em>Aliases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliases</em>' containment reference.
	 * @see #getAliases()
	 * @generated
	 */
	void setAliases(AliasesType value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType6)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAccount_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType6 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType6 value);

} // Account
