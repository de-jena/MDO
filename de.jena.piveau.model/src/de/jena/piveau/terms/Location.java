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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.terms.Location#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.terms.TermsPackage#getLocation()
 * @model extendedMetaData="name='Location' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see de.jena.piveau.terms.TermsPackage#getLocation_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link de.jena.piveau.terms.Location#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

} // Location
