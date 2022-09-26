/**
 */
package org.w3.ns.rdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.rdf.ObjectType#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3.ns.rdf.ObjectType#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.w3.ns.rdf.ObjectType#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.rdf.RdfPackage#getObjectType()
 * @model extendedMetaData="name='object_._type' kind='simple'"
 * @generated
 */
public interface ObjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.w3.ns.rdf.RdfPackage#getObjectType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.w3.ns.rdf.ObjectType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #setDatatype(String)
	 * @see org.w3.ns.rdf.RdfPackage#getObjectType_Datatype()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link org.w3.ns.rdf.ObjectType#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.w3.ns.rdf.RdfPackage#getObjectType_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.w3.ns.rdf.ObjectType#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // ObjectType
