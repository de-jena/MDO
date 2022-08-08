/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RootType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRootType()
 * @model extendedMetaData="name='root_._type' kind='empty'"
 * @generated
 */
public interface RootType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType1
	 * @see #isSetParameter()
	 * @see #unsetParameter()
	 * @see #setParameter(ParameterType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRootType_Parameter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Parameter'"
	 * @generated
	 */
	ParameterType1 getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RootType#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType1
	 * @see #isSetParameter()
	 * @see #unsetParameter()
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RootType#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParameter()
	 * @see #getParameter()
	 * @see #setParameter(ParameterType1)
	 * @generated
	 */
	void unsetParameter();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RootType#getParameter <em>Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parameter</em>' attribute is set.
	 * @see #unsetParameter()
	 * @see #getParameter()
	 * @see #setParameter(ParameterType1)
	 * @generated
	 */
	boolean isSetParameter();

} // RootType
