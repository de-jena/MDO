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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.rdf.Statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.rdf.RdfPackage#getStatement()
 * @model extendedMetaData="name='Statement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(StatementType)
	 * @see de.jena.piveau.rdf.RdfPackage#getStatement_Statement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Statement' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementType getStatement();

	/**
	 * Sets the value of the '{@link de.jena.piveau.rdf.Statement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(StatementType value);

} // Statement
