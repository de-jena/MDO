/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pushed Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource#getEndOfData <em>End Of Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPushedDataSource()
 * @model extendedMetaData="name='PushedDataSource' kind='elementOnly'"
 * @generated
 */
public interface PushedDataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(RootType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPushedDataSource_Root()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='root'"
	 * @generated
	 */
	RootType getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(RootType value);

	/**
	 * Returns the value of the '<em><b>End Of Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Data</em>' containment reference.
	 * @see #setEndOfData(EndOfDataType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPushedDataSource_EndOfData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EndOfData'"
	 * @generated
	 */
	EndOfDataType getEndOfData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource#getEndOfData <em>End Of Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Data</em>' containment reference.
	 * @see #getEndOfData()
	 * @generated
	 */
	void setEndOfData(EndOfDataType value);

} // PushedDataSource
