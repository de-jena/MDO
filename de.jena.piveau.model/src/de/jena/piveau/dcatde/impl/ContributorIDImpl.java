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
package de.jena.piveau.dcatde.impl;

import de.jena.piveau.dcatde.ContributorID;
import de.jena.piveau.dcatde.DcatDEPackage;

import de.jena.piveau.rdf.impl.ResourceImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributor ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContributorIDImpl extends ResourceImpl implements ContributorID {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributorIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatDEPackage.Literals.CONTRIBUTOR_ID;
	}

} //ContributorIDImpl
