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
package de.jena.piveau.adms;

import de.jena.piveau.rdf.TypedLiteral;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.adms.IdentifierType#getNotation <em>Notation</em>}</li>
 *   <li>{@link de.jena.piveau.adms.IdentifierType#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.adms.AdmsPackage#getIdentifierType()
 * @model extendedMetaData="name='Identifier_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference.
	 * @see #setNotation(TypedLiteral)
	 * @see de.jena.piveau.adms.AdmsPackage#getIdentifierType_Notation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='notation' namespace='http://www.w3.org/2004/02/skos/core#'"
	 * @generated
	 */
	TypedLiteral getNotation();

	/**
	 * Sets the value of the '{@link de.jena.piveau.adms.IdentifierType#getNotation <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' containment reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(TypedLiteral value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see de.jena.piveau.adms.AdmsPackage#getIdentifierType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link de.jena.piveau.adms.IdentifierType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // IdentifierType
