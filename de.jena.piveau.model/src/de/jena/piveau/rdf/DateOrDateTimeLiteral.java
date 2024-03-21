/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package de.jena.piveau.rdf;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Or Date Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.rdf.RdfPackage#getDateOrDateTimeLiteral()
 * @model extendedMetaData="name='DateOrDateTimeLiteral' kind='simple'"
 * @generated
 */
@ProviderType
public interface DateOrDateTimeLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see de.jena.piveau.rdf.RdfPackage#getDateOrDateTimeLiteral_Value()
	 * @model dataType="de.jena.piveau.rdf.DateOrDateTime"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.piveau.rdf.DatatypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see de.jena.piveau.rdf.DatatypeType
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @see de.jena.piveau.rdf.RdfPackage#getDateOrDateTimeLiteral_Datatype()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeType getDatatype();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see de.jena.piveau.rdf.DatatypeType
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DatatypeType value);

	/**
	 * Unsets the value of the '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @generated
	 */
	void unsetDatatype();

	/**
	 * Returns whether the value of the '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}' attribute is set.
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
