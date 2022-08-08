/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportParametersType#getReportParameter <em>Report Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportParametersType()
 * @model extendedMetaData="name='ReportParameters_._type' kind='elementOnly'"
 * @generated
 */
public interface ReportParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Report Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Parameter</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportParametersType_ReportParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportParameter'"
	 * @generated
	 */
	EList<ReportParameter> getReportParameter();

} // ReportParametersType
