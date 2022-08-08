/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axes Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo#getAxisInfo <em>Axis Info</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getAxesInfo()
 * @model extendedMetaData="name='AxesInfo' kind='elementOnly'"
 * @generated
 */
public interface AxesInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Axis Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Info</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getAxesInfo_AxisInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AxisInfo'"
	 * @generated
	 */
	EList<AxisInfo> getAxisInfo();

} // AxesInfo
