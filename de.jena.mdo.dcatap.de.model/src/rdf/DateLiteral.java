/*
 */
package rdf;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdf.DateLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link rdf.DateLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see rdf.RdfPackage#getDateLiteral()
 * @model extendedMetaData="name='DateLiteral' kind='simple'"
 * @generated
 */
@ProviderType
public interface DateLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see rdf.RdfPackage#getDateLiteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link rdf.DateLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The default value is <code>"http://www.w3.org/2001/XMLSchema#date"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #setDatatype(String)
	 * @see rdf.RdfPackage#getDateLiteral_Datatype()
	 * @model default="http://www.w3.org/2001/XMLSchema#date" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link rdf.DateLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(String value);

	/**
	 * Unsets the value of the '{@link rdf.DateLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(String)
	 * @generated
	 */
	void unsetDatatype();

	/**
	 * Returns whether the value of the '{@link rdf.DateLiteral#getDatatype <em>Datatype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datatype</em>' attribute is set.
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(String)
	 * @generated
	 */
	boolean isSetDatatype();

} // DateLiteral
