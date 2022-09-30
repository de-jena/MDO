/**
 */
package de.dcatde.dcatde;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.w3.ns.dcat.DcatPackage;

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
 * @see de.dcatde.dcatde.DcatDEFactory
 * @model kind="package"
 * @generated
 */
public interface DcatDEPackage extends EPackage {
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
	DcatDEPackage eINSTANCE = de.dcatde.dcatde.impl.DcatDEPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dcatde.dcatde.impl.ContributorImpl <em>Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dcatde.dcatde.impl.ContributorImpl
	 * @see de.dcatde.dcatde.impl.DcatDEPackageImpl#getContributor()
	 * @generated
	 */
	int CONTRIBUTOR = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__IDENTIFIER = DcatPackage.RESOURCE_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__TITLE = DcatPackage.RESOURCE_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__DESCRIPTION = DcatPackage.RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__THEME = DcatPackage.RESOURCE_TYPE__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__KEYWORD = DcatPackage.RESOURCE_TYPE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__TYPE = DcatPackage.RESOURCE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__CONTACT_POINT = DcatPackage.RESOURCE_TYPE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__CREATOR = DcatPackage.RESOURCE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__PUBLISHER = DcatPackage.RESOURCE_TYPE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ISSUED = DcatPackage.RESOURCE_TYPE__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__MODIFIED = DcatPackage.RESOURCE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__LANDING_PAGE = DcatPackage.RESOURCE_TYPE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ACCESS_RIGHTS = DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__CONFORMS_TO = DcatPackage.RESOURCE_TYPE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__LICENSE = DcatPackage.RESOURCE_TYPE__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__RIGHTS = DcatPackage.RESOURCE_TYPE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__HAS_POLICY = DcatPackage.RESOURCE_TYPE__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__QUALIFIED_ATTRIBUTION = DcatPackage.RESOURCE_TYPE__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__RELATION = DcatPackage.RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__QUALIFIED_RELATION = DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__IS_REFERENCED_BY = DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__LANGUAGE = DcatPackage.RESOURCE_TYPE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ABOUT = DcatPackage.RESOURCE_TYPE__ABOUT;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = DcatPackage.RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_OPERATION_COUNT = DcatPackage.RESOURCE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dcatde.dcatde.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor</em>'.
	 * @see de.dcatde.dcatde.Contributor
	 * @generated
	 */
	EClass getContributor();

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
		 * The meta object literal for the '{@link de.dcatde.dcatde.impl.ContributorImpl <em>Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dcatde.dcatde.impl.ContributorImpl
		 * @see de.dcatde.dcatde.impl.DcatDEPackageImpl#getContributor()
		 * @generated
		 */
		EClass CONTRIBUTOR = eINSTANCE.getContributor();

	}

} //DcatDEPackage
