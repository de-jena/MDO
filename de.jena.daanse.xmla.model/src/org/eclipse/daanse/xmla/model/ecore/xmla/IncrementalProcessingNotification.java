/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incremental Processing Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification#getTableID <em>Table ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification#getProcessingQuery <em>Processing Query</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getIncrementalProcessingNotification()
 * @model extendedMetaData="name='IncrementalProcessingNotification' kind='elementOnly'"
 * @generated
 */
public interface IncrementalProcessingNotification extends EObject {
	/**
	 * Returns the value of the '<em><b>Table ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table ID</em>' attribute.
	 * @see #setTableID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getIncrementalProcessingNotification_TableID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TableID'"
	 * @generated
	 */
	String getTableID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification#getTableID <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table ID</em>' attribute.
	 * @see #getTableID()
	 * @generated
	 */
	void setTableID(String value);

	/**
	 * Returns the value of the '<em><b>Processing Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Query</em>' attribute.
	 * @see #setProcessingQuery(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getIncrementalProcessingNotification_ProcessingQuery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ProcessingQuery'"
	 * @generated
	 */
	String getProcessingQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification#getProcessingQuery <em>Processing Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Query</em>' attribute.
	 * @see #getProcessingQuery()
	 * @generated
	 */
	void setProcessingQuery(String value);

} // IncrementalProcessingNotification
