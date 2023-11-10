/*
 */
package rdf;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdf.DateTimeLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see rdf.RdfPackage#getDateTimeLiteral()
 * @model extendedMetaData="name='DateTimeLiteral' kind='simple'"
 * @generated
 */
@ProviderType
public interface DateTimeLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see rdf.RdfPackage#getDateTimeLiteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link rdf.DateTimeLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The default value is <code>"http://www.w3.org/2001/XMLSchema#dateTime"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #setDatatype(String)
	 * @see rdf.RdfPackage#getDateTimeLiteral_Datatype()
	 * @model default="http://www.w3.org/2001/XMLSchema#dateTime" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
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
	 * Unsets the value of the '{@link rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(String)
	 * @generated
	 */
	void unsetDatatype();

	/**
	 * Returns whether the value of the '{@link rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datatype</em>' attribute is set.
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(String)
	 * @generated
	 */
	boolean isSetDatatype();

} // DateTimeLiteral
