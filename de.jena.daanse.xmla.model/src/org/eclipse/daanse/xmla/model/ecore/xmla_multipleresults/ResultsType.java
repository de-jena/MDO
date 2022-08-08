/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Emptyresult;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.ResultsType#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage#getResultsType()
 * @model extendedMetaData="name='results_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_empty.Emptyresult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage#getResultsType_Root()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='urn:schemas-microsoft-com:xml-analysis:empty'"
	 * @generated
	 */
	EList<Emptyresult> getRoot();

} // ResultsType
