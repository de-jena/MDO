/**
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
package de.jena.piveau.terms.impl;

import de.jena.piveau.terms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsFactoryImpl extends EFactoryImpl implements TermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TermsFactory init() {
		try {
			TermsFactory theTermsFactory = (TermsFactory)EPackage.Registry.INSTANCE.getEFactory(TermsPackage.eNS_URI);
			if (theTermsFactory != null) {
				return theTermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TermsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TermsPackage.LICENSE_DOCUMENT: return createLicenseDocument();
			case TermsPackage.LICENSE_DOCUMENT_TYPE: return createLicenseDocumentType();
			case TermsPackage.LOCATION: return createLocation();
			case TermsPackage.LOCATION_TYPE: return createLocationType();
			case TermsPackage.PERIOD_OF_TIME: return createPeriodOfTime();
			case TermsPackage.PERIOD_OF_TIME_TYPE: return createPeriodOfTimeType();
			case TermsPackage.PROVENANCE_STATEMENT: return createProvenanceStatement();
			case TermsPackage.PROVENANCE_STATEMENT_TYPE: return createProvenanceStatementType();
			case TermsPackage.RIGHTS_STATEMENT: return createRightsStatement();
			case TermsPackage.RIGHTS_STATEMENT_TYPE: return createRightsStatementType();
			case TermsPackage.STANDARD: return createStandard();
			case TermsPackage.STANDARD_TYPE: return createStandardType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseDocument createLicenseDocument() {
		LicenseDocumentImpl licenseDocument = new LicenseDocumentImpl();
		return licenseDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseDocumentType createLicenseDocumentType() {
		LicenseDocumentTypeImpl licenseDocumentType = new LicenseDocumentTypeImpl();
		return licenseDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodOfTime createPeriodOfTime() {
		PeriodOfTimeImpl periodOfTime = new PeriodOfTimeImpl();
		return periodOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodOfTimeType createPeriodOfTimeType() {
		PeriodOfTimeTypeImpl periodOfTimeType = new PeriodOfTimeTypeImpl();
		return periodOfTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceStatement createProvenanceStatement() {
		ProvenanceStatementImpl provenanceStatement = new ProvenanceStatementImpl();
		return provenanceStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceStatementType createProvenanceStatementType() {
		ProvenanceStatementTypeImpl provenanceStatementType = new ProvenanceStatementTypeImpl();
		return provenanceStatementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightsStatement createRightsStatement() {
		RightsStatementImpl rightsStatement = new RightsStatementImpl();
		return rightsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightsStatementType createRightsStatementType() {
		RightsStatementTypeImpl rightsStatementType = new RightsStatementTypeImpl();
		return rightsStatementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardType createStandardType() {
		StandardTypeImpl standardType = new StandardTypeImpl();
		return standardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsPackage getTermsPackage() {
		return (TermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TermsPackage getPackage() {
		return TermsPackage.eINSTANCE;
	}

} //TermsFactoryImpl
