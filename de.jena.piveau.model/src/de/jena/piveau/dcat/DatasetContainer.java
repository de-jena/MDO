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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.DatasetContainer#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.dcat.DcatPackage#getDatasetContainer()
 * @model extendedMetaData="name='dataset' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DatasetContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(Dataset)
	 * @see de.jena.piveau.dcat.DcatPackage#getDatasetContainer_Dataset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace' name='Dataset'"
	 * @generated
	 */
	Dataset getDataset();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DatasetContainer#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(Dataset value);

} // DatasetContainer
