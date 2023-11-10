/*
 */
package dcatde;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

import rdf.RdfPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dcatde.DcatDEFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DcatDEPackage.eNS_URI, genModel = "/model/dcatap.genmodel", genModelSourceLocations = {"model/dcatap.genmodel","de.jena.mdo.dcatap.de.model/model/dcatap.genmodel"}, ecore="/model/dcatap.de.ecore", ecoreSourceLocations="/model/dcatap.de.ecore")
public interface DcatDEPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dcatde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dcat-ap.de/def/dcatde/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dcatde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcatDEPackage eINSTANCE = dcatde.impl.DcatDEPackageImpl.init();

	/**
	 * The meta object id for the '{@link dcatde.impl.ContributorIDImpl <em>Contributor ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatde.impl.ContributorIDImpl
	 * @see dcatde.impl.DcatDEPackageImpl#getContributorID()
	 * @generated
	 */
	int CONTRIBUTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_ID__RESOURCE = RdfPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_ID__ABOUT = RdfPackage.RESOURCE__ABOUT;

	/**
	 * The number of structural features of the '<em>Contributor ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_ID_FEATURE_COUNT = RdfPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contributor ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_ID_OPERATION_COUNT = RdfPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcatde.impl.DCATDERootImpl <em>DCATDE Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatde.impl.DCATDERootImpl
	 * @see dcatde.impl.DcatDEPackageImpl#getDCATDERoot()
	 * @generated
	 */
	int DCATDE_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>License Attribution By Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Contributor ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT__CONTRIBUTOR_ID = 4;

	/**
	 * The number of structural features of the '<em>DCATDE Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>DCATDE Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATDE_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dcatde.ContributorID <em>Contributor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor ID</em>'.
	 * @see dcatde.ContributorID
	 * @generated
	 */
	EClass getContributorID();

	/**
	 * Returns the meta object for class '{@link dcatde.DCATDERoot <em>DCATDE Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCATDE Root</em>'.
	 * @see dcatde.DCATDERoot
	 * @generated
	 */
	EClass getDCATDERoot();

	/**
	 * Returns the meta object for the attribute list '{@link dcatde.DCATDERoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see dcatde.DCATDERoot#getMixed()
	 * @see #getDCATDERoot()
	 * @generated
	 */
	EAttribute getDCATDERoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link dcatde.DCATDERoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see dcatde.DCATDERoot#getXMLNSPrefixMap()
	 * @see #getDCATDERoot()
	 * @generated
	 */
	EReference getDCATDERoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link dcatde.DCATDERoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see dcatde.DCATDERoot#getXSISchemaLocation()
	 * @see #getDCATDERoot()
	 * @generated
	 */
	EReference getDCATDERoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link dcatde.DCATDERoot#getLicenseAttributionByText <em>License Attribution By Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Attribution By Text</em>'.
	 * @see dcatde.DCATDERoot#getLicenseAttributionByText()
	 * @see #getDCATDERoot()
	 * @generated
	 */
	EReference getDCATDERoot_LicenseAttributionByText();

	/**
	 * Returns the meta object for the containment reference '{@link dcatde.DCATDERoot#getContributorID <em>Contributor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor ID</em>'.
	 * @see dcatde.DCATDERoot#getContributorID()
	 * @see #getDCATDERoot()
	 * @generated
	 */
	EReference getDCATDERoot_ContributorID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DcatDEFactory getDcatDEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dcatde.impl.ContributorIDImpl <em>Contributor ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatde.impl.ContributorIDImpl
		 * @see dcatde.impl.DcatDEPackageImpl#getContributorID()
		 * @generated
		 */
		EClass CONTRIBUTOR_ID = eINSTANCE.getContributorID();

		/**
		 * The meta object literal for the '{@link dcatde.impl.DCATDERootImpl <em>DCATDE Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatde.impl.DCATDERootImpl
		 * @see dcatde.impl.DcatDEPackageImpl#getDCATDERoot()
		 * @generated
		 */
		EClass DCATDE_ROOT = eINSTANCE.getDCATDERoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCATDE_ROOT__MIXED = eINSTANCE.getDCATDERoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATDE_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDCATDERoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATDE_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDCATDERoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>License Attribution By Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT = eINSTANCE.getDCATDERoot_LicenseAttributionByText();

		/**
		 * The meta object literal for the '<em><b>Contributor ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATDE_ROOT__CONTRIBUTOR_ID = eINSTANCE.getDCATDERoot_ContributorID();

	}

} //DcatDEPackage
