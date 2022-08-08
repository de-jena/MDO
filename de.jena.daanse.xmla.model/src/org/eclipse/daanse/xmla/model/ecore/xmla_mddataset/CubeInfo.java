/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo#getCube <em>Cube</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getCubeInfo()
 * @model extendedMetaData="name='CubeInfo' kind='elementOnly'"
 * @generated
 */
public interface CubeInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Cube</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getCubeInfo_Cube()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Cube'"
	 * @generated
	 */
	EList<OlapInfoCube> getCube();

} // CubeInfo
