/*
 */
package de.jena.piveau.rdf;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The Resource Description Framework [RDF] is defined to have an extensible system of typed literals, based on XML
 *         Schema datatypes [XSD], and also to have plain literals. In the RDF specification, plain literals differ from
 *         typed literals in that plain literals have no datatype and can optionally have a language tag, indicating the
 *         natural language of the content.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.rdf.PlainLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.piveau.rdf.PlainLiteral#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.rdf.RdfPackage#getPlainLiteral()
 * @model extendedMetaData="name='PlainLiteral' kind='simple'"
 * @generated
 */
@ProviderType
public interface PlainLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.jena.piveau.rdf.RdfPackage#getPlainLiteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.PlainLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In due course, we should install the relevant ISO 2- and 3-letter
	 *         codes as the enumerated possible values . . .
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see de.jena.piveau.rdf.RdfPackage#getPlainLiteral_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.PlainLiteral#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

} // PlainLiteral
