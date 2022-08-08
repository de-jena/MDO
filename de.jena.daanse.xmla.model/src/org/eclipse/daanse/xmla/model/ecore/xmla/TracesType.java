/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TracesType#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTracesType()
 * @model extendedMetaData="name='Traces_._type' kind='elementOnly'"
 * @generated
 */
public interface TracesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTracesType_Trace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Trace'"
	 * @generated
	 */
	EList<Trace> getTrace();

} // TracesType
