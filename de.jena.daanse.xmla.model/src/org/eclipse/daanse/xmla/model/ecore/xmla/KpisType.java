/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kpis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.KpisType#getKpi <em>Kpi</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpisType()
 * @model extendedMetaData="name='Kpis_._type' kind='elementOnly'"
 * @generated
 */
public interface KpisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kpi</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpisType_Kpi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kpi'"
	 * @generated
	 */
	EList<Kpi> getKpi();

} // KpisType