/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>International Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.InternationalTextType#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.InternationalTextType#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.InternationalTextType#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getInternationalTextType()
 * @model extendedMetaData="name='InternationalTextType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InternationalTextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getInternationalTextType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.InternationalTextType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getInternationalTextType_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language" required="true"
	 *        extendedMetaData="kind='element' name='Language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.InternationalTextType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getInternationalTextType_ErrorCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ErrorCode' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorCodeEnumeration getErrorCode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.InternationalTextType#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.InternationalTextType#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @generated
	 */
	void unsetErrorCode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.InternationalTextType#getErrorCode <em>Error Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Code</em>' attribute is set.
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(ErrorCodeEnumeration)
	 * @generated
	 */
	boolean isSetErrorCode();

} // InternationalTextType
