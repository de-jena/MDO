/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Definition Provider Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceDefinitionProviderInfo#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceDefinitionProviderInfo()
 * @model extendedMetaData="name='Trace_Definition_ProviderInfo' kind='elementOnly'"
 * @generated
 */
public interface TraceDefinitionProviderInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTraceDefinitionProviderInfo_Data()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Data'"
	 * @generated
	 */
	DataType2 getData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceDefinitionProviderInfo#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataType2 value);

} // TraceDefinitionProviderInfo
