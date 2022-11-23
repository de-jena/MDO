/**
 */
package rdf;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Or Date Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdf.DateOrDateTimeLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see rdf.RdfPackage#getDateOrDateTimeLiteral()
 * @model extendedMetaData="name='DateOrDateTimeLiteral' kind='simple'"
 * @generated
 */
public interface DateOrDateTimeLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see rdf.RdfPackage#getDateOrDateTimeLiteral_Value()
	 * @model dataType="rdf.DateOrDateTime"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link rdf.DateOrDateTimeLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link rdf.DatatypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see rdf.DatatypeType
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @see rdf.RdfPackage#getDateOrDateTimeLiteral_Datatype()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeType getDatatype();

	/**
	 * Sets the value of the '{@link rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see rdf.DatatypeType
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DatatypeType value);

	/**
	 * Unsets the value of the '{@link rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @generated
	 */
	void unsetDatatype();

	/**
	 * Returns whether the value of the '{@link rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datatype</em>' attribute is set.
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @generated
	 */
	boolean isSetDatatype();

} // DateOrDateTimeLiteral
