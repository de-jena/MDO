/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getHierarchyInfo <em>Hierarchy Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getAxisInfo()
 * @model extendedMetaData="name='AxisInfo' kind='elementOnly'"
 * @generated
 */
public interface AxisInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Hierarchy Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Info</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getAxisInfo_HierarchyInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HierarchyInfo'"
	 * @generated
	 */
	EList<HierarchyInfo> getHierarchyInfo();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getAxisInfo_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AxisInfo
