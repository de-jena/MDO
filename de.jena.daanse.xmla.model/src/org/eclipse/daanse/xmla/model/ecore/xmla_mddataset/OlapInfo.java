/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Olap Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCubeInfo <em>Cube Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getAxesInfo <em>Axes Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCellInfo <em>Cell Info</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfo()
 * @model extendedMetaData="name='OlapInfo' kind='elementOnly'"
 * @generated
 */
public interface OlapInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Cube Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Info</em>' containment reference.
	 * @see #setCubeInfo(CubeInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfo_CubeInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CubeInfo'"
	 * @generated
	 */
	CubeInfo getCubeInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCubeInfo <em>Cube Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Info</em>' containment reference.
	 * @see #getCubeInfo()
	 * @generated
	 */
	void setCubeInfo(CubeInfo value);

	/**
	 * Returns the value of the '<em><b>Axes Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes Info</em>' containment reference.
	 * @see #setAxesInfo(AxesInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfo_AxesInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AxesInfo'"
	 * @generated
	 */
	AxesInfo getAxesInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getAxesInfo <em>Axes Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axes Info</em>' containment reference.
	 * @see #getAxesInfo()
	 * @generated
	 */
	void setAxesInfo(AxesInfo value);

	/**
	 * Returns the value of the '<em><b>Cell Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Info</em>' containment reference.
	 * @see #setCellInfo(CellInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getOlapInfo_CellInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CellInfo'"
	 * @generated
	 */
	CellInfo getCellInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCellInfo <em>Cell Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Info</em>' containment reference.
	 * @see #getCellInfo()
	 * @generated
	 */
	void setCellInfo(CellInfo value);

} // OlapInfo
