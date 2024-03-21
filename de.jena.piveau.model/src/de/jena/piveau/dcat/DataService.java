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
package de.jena.piveau.dcat;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         dcat:DataService represents a data service. A data service is a collection of operations accessible through an
 *         interface (API) that provide access to one or more datasets or data processing functions.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.DataService#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DataService#getEndpointURL <em>Endpoint URL</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DataService#getServesDataset <em>Serves Dataset</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.dcat.DcatPackage#getDataService()
 * @model extendedMetaData="name='DataService' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataService extends DcatResource {
	/**
	 * Returns the value of the '<em><b>Endpoint Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Description</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDataService_EndpointDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='endpointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEndpointDescription();

	/**
	 * Returns the value of the '<em><b>Endpoint URL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint URL</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDataService_EndpointURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='endpointURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEndpointURL();

	/**
	 * Returns the value of the '<em><b>Serves Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves Dataset</em>' containment reference.
	 * @see #setServesDataset(Dataset)
	 * @see de.jena.piveau.dcat.DcatPackage#getDataService_ServesDataset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servesDataset' namespace='##targetNamespace'"
	 * @generated
	 */
	Dataset getServesDataset();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DataService#getServesDataset <em>Serves Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves Dataset</em>' containment reference.
	 * @see #getServesDataset()
	 * @generated
	 */
	void setServesDataset(Dataset value);

} // DataService
