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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.piveau.rdf.RdfPackage
 * @generated
 */
@ProviderType
public interface RdfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfFactory eINSTANCE = de.jena.piveau.rdf.impl.RdfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Date Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Literal</em>'.
	 * @generated
	 */
	DateLiteral createDateLiteral();

	/**
	 * Returns a new object of class '<em>Date Or Date Time Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Or Date Time Literal</em>'.
	 * @generated
	 */
	DateOrDateTimeLiteral createDateOrDateTimeLiteral();

	/**
	 * Returns a new object of class '<em>Date Time Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Literal</em>'.
	 * @generated
	 */
	DateTimeLiteral createDateTimeLiteral();

	/**
	 * Returns a new object of class '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Type</em>'.
	 * @generated
	 */
	ObjectType createObjectType();

	/**
	 * Returns a new object of class '<em>Plain Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Literal</em>'.
	 * @generated
	 */
	PlainLiteral createPlainLiteral();

	/**
	 * Returns a new object of class '<em>Predicate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Type</em>'.
	 * @generated
	 */
	PredicateType createPredicateType();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Type</em>'.
	 * @generated
	 */
	StatementType createStatementType();

	/**
	 * Returns a new object of class '<em>Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject Type</em>'.
	 * @generated
	 */
	SubjectType createSubjectType();

	/**
	 * Returns a new object of class '<em>Typed Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Literal</em>'.
	 * @generated
	 */
	TypedLiteral createTypedLiteral();

	/**
	 * Returns a new object of class '<em>RDF Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Root</em>'.
	 * @generated
	 */
	RDFRoot createRDFRoot();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdfPackage getRdfPackage();

} //RdfFactory
