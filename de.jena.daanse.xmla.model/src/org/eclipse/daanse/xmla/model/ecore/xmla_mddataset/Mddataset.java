/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mddataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getOlapInfo <em>Olap Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getAxes <em>Axes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getCellData <em>Cell Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getMddataset()
 * @model extendedMetaData="name='mddataset' kind='elementOnly'"
 * @generated
 */
public interface Mddataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Olap Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Olap Info</em>' containment reference.
	 * @see #setOlapInfo(OlapInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getMddataset_OlapInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OlapInfo'"
	 * @generated
	 */
	OlapInfo getOlapInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getOlapInfo <em>Olap Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Olap Info</em>' containment reference.
	 * @see #getOlapInfo()
	 * @generated
	 */
	void setOlapInfo(OlapInfo value);

	/**
	 * Returns the value of the '<em><b>Axes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' containment reference.
	 * @see #setAxes(Axes)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getMddataset_Axes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Axes'"
	 * @generated
	 */
	Axes getAxes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getAxes <em>Axes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axes</em>' containment reference.
	 * @see #getAxes()
	 * @generated
	 */
	void setAxes(Axes value);

	/**
	 * Returns the value of the '<em><b>Cell Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Data</em>' containment reference.
	 * @see #setCellData(CellData)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getMddataset_CellData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CellData'"
	 * @generated
	 */
	CellData getCellData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getCellData <em>Cell Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Data</em>' containment reference.
	 * @see #getCellData()
	 * @generated
	 */
	void setCellData(CellData value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getMddataset_Exception()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Exception'"
	 * @generated
	 */
	org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception getException();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference.
	 * @see #setMessages(Messages)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getMddataset_Messages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Messages'"
	 * @generated
	 */
	Messages getMessages();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getMessages <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' containment reference.
	 * @see #getMessages()
	 * @generated
	 */
	void setMessages(Messages value);

} // Mddataset
