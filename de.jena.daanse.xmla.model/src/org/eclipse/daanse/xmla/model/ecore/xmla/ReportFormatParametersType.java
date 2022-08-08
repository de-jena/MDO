/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Format Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParametersType#getReportFormatParameter <em>Report Format Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportFormatParametersType()
 * @model extendedMetaData="name='ReportFormatParameters_._type' kind='elementOnly'"
 * @generated
 */
public interface ReportFormatParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Report Format Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Format Parameter</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportFormatParametersType_ReportFormatParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportFormatParameter'"
	 * @generated
	 */
	EList<ReportFormatParameter> getReportFormatParameter();

} // ReportFormatParametersType
