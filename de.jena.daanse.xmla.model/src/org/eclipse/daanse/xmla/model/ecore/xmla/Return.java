/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Emptyresult;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.ResultsType;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot1 <em>Root1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot2 <em>Root2</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReturn()
 * @model extendedMetaData="name='return' kind='elementOnly'"
 * @generated
 */
public interface Return extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Mddataset)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReturn_Root()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='urn:schemas-microsoft-com:xml-analysis:mddataset'"
	 * @generated
	 */
	Mddataset getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Mddataset value);

	/**
	 * Returns the value of the '<em><b>Root1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root1</em>' containment reference.
	 * @see #setRoot1(Rowset)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReturn_Root1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='urn:schemas-microsoft-com:xml-analysis:rowset'"
	 * @generated
	 */
	Rowset getRoot1();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot1 <em>Root1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root1</em>' containment reference.
	 * @see #getRoot1()
	 * @generated
	 */
	void setRoot1(Rowset value);

	/**
	 * Returns the value of the '<em><b>Root2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root2</em>' containment reference.
	 * @see #setRoot2(Emptyresult)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReturn_Root2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='urn:schemas-microsoft-com:xml-analysis:empty'"
	 * @generated
	 */
	Emptyresult getRoot2();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot2 <em>Root2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root2</em>' containment reference.
	 * @see #getRoot2()
	 * @generated
	 */
	void setRoot2(Emptyresult value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference.
	 * @see #setResults(ResultsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReturn_Results()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='results' namespace='http://schemas.microsoft.com/analysisservices/2003/xmla-multipleresults'"
	 * @generated
	 */
	ResultsType getResults();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getResults <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' containment reference.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(ResultsType value);

} // Return
