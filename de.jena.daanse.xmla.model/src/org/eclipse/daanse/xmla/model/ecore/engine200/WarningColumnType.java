/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningColumnType()
 * @model extendedMetaData="name='WarningColumn_._type' kind='elementOnly'"
 * @generated
 */
public interface WarningColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningColumnType_Dimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Dimension'"
	 * @generated
	 */
	String getDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getWarningColumnType_Attribute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Attribute'"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

} // WarningColumnType
