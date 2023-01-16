/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ZoneType#getFarezoneTypeID <em>Farezone Type ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ZoneType#getFareZoneTypeName <em>Fare Zone Type Name</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getZoneType()
 * @model extendedMetaData="name='ZoneType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZoneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Farezone Type ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farezone Type ID</em>' containment reference.
	 * @see #setFarezoneTypeID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getZoneType_FarezoneTypeID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FarezoneTypeID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getFarezoneTypeID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ZoneType#getFarezoneTypeID <em>Farezone Type ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farezone Type ID</em>' containment reference.
	 * @see #getFarezoneTypeID()
	 * @generated
	 */
	void setFarezoneTypeID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Fare Zone Type Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone Type Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getZoneType_FareZoneTypeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZoneTypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getFareZoneTypeName();

} // ZoneType
