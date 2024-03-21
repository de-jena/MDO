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
package de.jena.piveau.skos;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.skos.Concept#getConcept <em>Concept</em>}</li>
 *   <li>{@link de.jena.piveau.skos.Concept#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.skos.SkosPackage#getConcept()
 * @model extendedMetaData="name='Concept' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Concept extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference.
	 * @see #setConcept(ConceptType)
	 * @see de.jena.piveau.skos.SkosPackage#getConcept_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Concept' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptType getConcept();

	/**
	 * Sets the value of the '{@link de.jena.piveau.skos.Concept#getConcept <em>Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' containment reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(ConceptType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see de.jena.piveau.skos.SkosPackage#getConcept_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='resource' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link de.jena.piveau.skos.Concept#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // Concept
