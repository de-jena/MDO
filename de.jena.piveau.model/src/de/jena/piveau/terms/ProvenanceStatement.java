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
package de.jena.piveau.terms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.terms.ProvenanceStatement#getProvenanceStatement <em>Provenance Statement</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.terms.TermsPackage#getProvenanceStatement()
 * @model extendedMetaData="name='ProvenanceStatement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProvenanceStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Provenance Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance Statement</em>' containment reference.
	 * @see #setProvenanceStatement(ProvenanceStatementType)
	 * @see de.jena.piveau.terms.TermsPackage#getProvenanceStatement_ProvenanceStatement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProvenanceStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	ProvenanceStatementType getProvenanceStatement();

	/**
	 * Sets the value of the '{@link de.jena.piveau.terms.ProvenanceStatement#getProvenanceStatement <em>Provenance Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance Statement</em>' containment reference.
	 * @see #getProvenanceStatement()
	 * @generated
	 */
	void setProvenanceStatement(ProvenanceStatementType value);

} // ProvenanceStatement
