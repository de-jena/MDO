/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discover Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDiscoverType()
 * @model extendedMetaData="name='Discover_._type' kind='elementOnly'"
 * @generated
 */
public interface DiscoverType extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
	 * @see #isSetRequestType()
	 * @see #unsetRequestType()
	 * @see #setRequestType(RequestTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDiscoverType_RequestType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RequestType'"
	 * @generated
	 */
	RequestTypeType getRequestType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
	 * @see #isSetRequestType()
	 * @see #unsetRequestType()
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(RequestTypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestType()
	 * @see #getRequestType()
	 * @see #setRequestType(RequestTypeType)
	 * @generated
	 */
	void unsetRequestType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRequestType <em>Request Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Type</em>' attribute is set.
	 * @see #unsetRequestType()
	 * @see #getRequestType()
	 * @see #setRequestType(RequestTypeType)
	 * @generated
	 */
	boolean isSetRequestType();

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference.
	 * @see #setRestrictions(RestrictionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDiscoverType_Restrictions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Restrictions'"
	 * @generated
	 */
	RestrictionsType getRestrictions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRestrictions <em>Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions</em>' containment reference.
	 * @see #getRestrictions()
	 * @generated
	 */
	void setRestrictions(RestrictionsType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDiscoverType_Properties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Properties'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

} // DiscoverType
