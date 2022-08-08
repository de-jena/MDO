/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Olap Info Cube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getCubeName <em>Cube Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastDataUpdate <em>Last Data Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfoCube()
 * @model extendedMetaData="name='OlapInfoCube' kind='elementOnly'"
 * @generated
 */
public interface OlapInfoCube extends EObject {
	/**
	 * Returns the value of the '<em><b>Cube Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Name</em>' attribute.
	 * @see #setCubeName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfoCube_CubeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeName'"
	 * @generated
	 */
	String getCubeName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getCubeName <em>Cube Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Name</em>' attribute.
	 * @see #getCubeName()
	 * @generated
	 */
	void setCubeName(String value);

	/**
	 * Returns the value of the '<em><b>Last Data Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Data Update</em>' attribute.
	 * @see #setLastDataUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfoCube_LastDataUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastDataUpdate' namespace='http://schemas.microsoft.com/analysisservices/2003/engine'"
	 * @generated
	 */
	XMLGregorianCalendar getLastDataUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastDataUpdate <em>Last Data Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Data Update</em>' attribute.
	 * @see #getLastDataUpdate()
	 * @generated
	 */
	void setLastDataUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Schema Update</em>' attribute.
	 * @see #setLastSchemaUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfoCube_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate' namespace='http://schemas.microsoft.com/analysisservices/2003/engine'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Schema Update</em>' attribute.
	 * @see #getLastSchemaUpdate()
	 * @generated
	 */
	void setLastSchemaUpdate(XMLGregorianCalendar value);

} // OlapInfoCube
