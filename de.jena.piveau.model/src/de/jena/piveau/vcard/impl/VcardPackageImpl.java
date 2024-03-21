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
package de.jena.piveau.vcard.impl;

import de.jena.piveau.adms.AdmsPackage;

import de.jena.piveau.adms.impl.AdmsPackageImpl;

import de.jena.piveau.dcat.DcatPackage;

import de.jena.piveau.dcat.impl.DcatPackageImpl;

import de.jena.piveau.dcatde.DcatDEPackage;

import de.jena.piveau.dcatde.impl.DcatDEPackageImpl;

import de.jena.piveau.foaf.FoafPackage;

import de.jena.piveau.foaf.impl.FoafPackageImpl;

import de.jena.piveau.locn.LocnPackage;

import de.jena.piveau.locn.impl.LocnPackageImpl;

import de.jena.piveau.odrl.OdrlPackage;

import de.jena.piveau.odrl.impl.OdrlPackageImpl;

import de.jena.piveau.owl.OwlPackage;

import de.jena.piveau.owl.impl.OwlPackageImpl;

import de.jena.piveau.prov.ProvPackage;

import de.jena.piveau.prov.impl.ProvPackageImpl;

import de.jena.piveau.rdf.RdfPackage;

import de.jena.piveau.rdf.impl.RdfPackageImpl;

import de.jena.piveau.schema.SchemaPackage;

import de.jena.piveau.schema.impl.SchemaPackageImpl;

import de.jena.piveau.skos.SkosPackage;

import de.jena.piveau.skos.impl.SkosPackageImpl;

import de.jena.piveau.terms.TermsPackage;

import de.jena.piveau.terms.impl.TermsPackageImpl;

import de.jena.piveau.vcard.Address;
import de.jena.piveau.vcard.AddressType;
import de.jena.piveau.vcard.DocumentRoot;
import de.jena.piveau.vcard.Organization;
import de.jena.piveau.vcard.OrganizationType;
import de.jena.piveau.vcard.VcardFactory;
import de.jena.piveau.vcard.VcardPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VcardPackageImpl extends EPackageImpl implements VcardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.piveau.vcard.VcardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VcardPackageImpl() {
		super(eNS_URI, VcardFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VcardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VcardPackage init() {
		if (isInited) return (VcardPackage)EPackage.Registry.INSTANCE.getEPackage(VcardPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVcardPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VcardPackageImpl theVcardPackage = registeredVcardPackage instanceof VcardPackageImpl ? (VcardPackageImpl)registeredVcardPackage : new VcardPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcatPackage.eNS_URI);
		DcatPackageImpl theDcatPackage = (DcatPackageImpl)(registeredPackage instanceof DcatPackageImpl ? registeredPackage : DcatPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(registeredPackage instanceof FoafPackageImpl ? registeredPackage : FoafPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		RdfPackageImpl theRdfPackage = (RdfPackageImpl)(registeredPackage instanceof RdfPackageImpl ? registeredPackage : RdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(registeredPackage instanceof SkosPackageImpl ? registeredPackage : SkosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI);
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(registeredPackage instanceof AdmsPackageImpl ? registeredPackage : AdmsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LocnPackage.eNS_URI);
		LocnPackageImpl theLocnPackage = (LocnPackageImpl)(registeredPackage instanceof LocnPackageImpl ? registeredPackage : LocnPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OdrlPackage.eNS_URI);
		OdrlPackageImpl theOdrlPackage = (OdrlPackageImpl)(registeredPackage instanceof OdrlPackageImpl ? registeredPackage : OdrlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(registeredPackage instanceof OwlPackageImpl ? registeredPackage : OwlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProvPackage.eNS_URI);
		ProvPackageImpl theProvPackage = (ProvPackageImpl)(registeredPackage instanceof ProvPackageImpl ? registeredPackage : ProvPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcatDEPackage.eNS_URI);
		DcatDEPackageImpl theDcatDEPackage = (DcatDEPackageImpl)(registeredPackage instanceof DcatDEPackageImpl ? registeredPackage : DcatDEPackage.eINSTANCE);

		// Create package meta-data objects
		theVcardPackage.createPackageContents();
		theDcatPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theRdfPackage.createPackageContents();
		theSkosPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theLocnPackage.createPackageContents();
		theOdrlPackage.createPackageContents();
		theOwlPackage.createPackageContents();
		theProvPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theDcatDEPackage.createPackageContents();

		// Initialize created meta-data
		theVcardPackage.initializePackageContents();
		theDcatPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theLocnPackage.initializePackageContents();
		theOdrlPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();
		theProvPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theDcatDEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVcardPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VcardPackage.eNS_URI, theVcardPackage);
		return theVcardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Address() {
		return (EReference)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_StreetAddress() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Locality() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_PostalCode() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_CountryName() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_About() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_NodeID() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Organization() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Individual() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationType() {
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_Fn() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationName() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_HasAddress() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_HasEmail() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_HasURL() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_HasTelephone() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_About() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_NodeID() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HasAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcardFactory getVcardFactory() {
		return (VcardFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEReference(addressEClass, ADDRESS__ADDRESS);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__STREET_ADDRESS);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__LOCALITY);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__POSTAL_CODE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__COUNTRY_NAME);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__ABOUT);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__NODE_ID);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__INDIVIDUAL);

		organizationTypeEClass = createEClass(ORGANIZATION_TYPE);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__FN);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ORGANIZATION_NAME);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__HAS_ADDRESS);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__HAS_EMAIL);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__HAS_URL);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__HAS_TELEPHONE);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__ABOUT);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__NODE_ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		RdfPackage theRdfPackage = (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddress_Address(), this.getAddressType(), null, "address", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_StreetAddress(), theXMLTypePackage.getString(), "streetAddress", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Locality(), theXMLTypePackage.getString(), "locality", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_PostalCode(), theXMLTypePackage.getString(), "postalCode", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_CountryName(), theXMLTypePackage.getString(), "countryName", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Organization(), this.getOrganizationType(), null, "organization", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Individual(), this.getOrganizationType(), null, "individual", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationTypeEClass, OrganizationType.class, "OrganizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganizationType_Fn(), theXMLTypePackage.getString(), "fn", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_OrganizationName(), theXMLTypePackage.getString(), "organizationName", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_HasAddress(), this.getAddress(), null, "hasAddress", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_HasEmail(), theRdfPackage.getResource(), null, "hasEmail", null, 1, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_HasURL(), theRdfPackage.getResource(), null, "hasURL", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_HasTelephone(), theXMLTypePackage.getAnyURI(), "hasTelephone", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasAddress(), this.getAddress(), null, "hasAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (addressEClass,
		   source,
		   new String[] {
			   "name", "Address",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddress_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (addressTypeEClass,
		   source,
		   new String[] {
			   "name", "Address_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddressType_StreetAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "street-address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressType_Locality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "locality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressType_PostalCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postal-code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressType_CountryName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "country-name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getAddressType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "name", "Organization",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOrganization_Organization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Organization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganization_Individual(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Individual",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (organizationTypeEClass,
		   source,
		   new String[] {
			   "name", "Organization_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOrganizationType_Fn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganizationType_OrganizationName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organization-name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganizationType_HasAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganizationType_HasEmail(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasEmail",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganizationType_HasURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganizationType_HasTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrganizationType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getOrganizationType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_HasAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasAddress",
			   "namespace", "##targetNamespace"
		   });
	}

} //VcardPackageImpl
