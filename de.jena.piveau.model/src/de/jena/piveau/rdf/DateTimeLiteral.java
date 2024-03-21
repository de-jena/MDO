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
 * A representation of the model object '<em><b>Date Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.rdf.DateTimeLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.piveau.rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.rdf.RdfPackage#getDateTimeLiteral()
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
	 * @see de.jena.piveau.rdf.RdfPackage#getDateTimeLiteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.DateTimeLiteral#getValue <em>Value</em>}' attribute.
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
	 * @see de.jena.piveau.rdf.RdfPackage#getDateTimeLiteral_Datatype()
	 * @model default="http://www.w3.org/2001/XMLSchema#dateTime" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.piveau.rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(String)
	 * @generated
	 */
	void unsetDatatype();

	/**
	 * Returns whether the value of the '{@link de.jena.piveau.rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}' attribute is set.
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
