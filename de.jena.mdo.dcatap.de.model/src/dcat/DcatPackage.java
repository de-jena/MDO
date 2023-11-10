/*
 */
package dcat;


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
 * <!-- begin-model-doc -->
 * DCAT Application Profile for data portals in Europe Version 2.0.0
 * <!-- end-model-doc -->
 * @see dcat.DcatFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DcatPackage.eNS_URI, genModel = "/model/dcatap.genmodel", genModelSourceLocations = {"model/dcatap.genmodel","de.jena.mdo.dcatap.de.model/model/dcatap.genmodel"}, ecore="/model/dcatap.ecore", ecoreSourceLocations="/model/dcatap.ecore")
public interface DcatPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dcat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/ns/dcat#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dcat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcatPackage eINSTANCE = dcat.impl.DcatPackageImpl.init();

	/**
	 * The meta object id for the '{@link dcat.impl.DcatResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.DcatResourceImpl
	 * @see dcat.impl.DcatPackageImpl#getDcatResource()
	 * @generated
	 */
	int DCAT_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__RESOURCE = RdfPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__ABOUT = RdfPackage.RESOURCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__IDENTIFIER = RdfPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__TITLE = RdfPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__DESCRIPTION = RdfPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__THEME = RdfPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__KEYWORD = RdfPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__TYPE = RdfPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__CONTACT_POINT = RdfPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__CREATOR = RdfPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__PUBLISHER = RdfPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__ISSUED = RdfPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__MODIFIED = RdfPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__LANDING_PAGE = RdfPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__ACCESS_RIGHTS = RdfPackage.RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__CONFORMS_TO = RdfPackage.RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__LICENSE = RdfPackage.RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__RIGHTS = RdfPackage.RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__HAS_POLICY = RdfPackage.RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__QUALIFIED_ATTRIBUTION = RdfPackage.RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__RELATION = RdfPackage.RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__QUALIFIED_RELATION = RdfPackage.RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__IS_REFERENCED_BY = RdfPackage.RESOURCE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE__LANGUAGE = RdfPackage.RESOURCE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE_FEATURE_COUNT = RdfPackage.RESOURCE_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAT_RESOURCE_OPERATION_COUNT = RdfPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcat.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.DatasetImpl
	 * @see dcat.impl.DcatPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__RESOURCE = DCAT_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ABOUT = DCAT_RESOURCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__IDENTIFIER = DCAT_RESOURCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TITLE = DCAT_RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DESCRIPTION = DCAT_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__THEME = DCAT_RESOURCE__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__KEYWORD = DCAT_RESOURCE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TYPE = DCAT_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CONTACT_POINT = DCAT_RESOURCE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CREATOR = DCAT_RESOURCE__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__PUBLISHER = DCAT_RESOURCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ISSUED = DCAT_RESOURCE__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__MODIFIED = DCAT_RESOURCE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LANDING_PAGE = DCAT_RESOURCE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ACCESS_RIGHTS = DCAT_RESOURCE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CONFORMS_TO = DCAT_RESOURCE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LICENSE = DCAT_RESOURCE__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__RIGHTS = DCAT_RESOURCE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__HAS_POLICY = DCAT_RESOURCE__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__QUALIFIED_ATTRIBUTION = DCAT_RESOURCE__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__RELATION = DCAT_RESOURCE__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__QUALIFIED_RELATION = DCAT_RESOURCE__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__IS_REFERENCED_BY = DCAT_RESOURCE__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LANGUAGE = DCAT_RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DISTRIBUTION = DCAT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__SPATIAL_RESOLUTION_IN_METERS = DCAT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TEMPORAL_RESOLUTION = DCAT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ACCRUAL_PERIODICITY = DCAT_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__SPATIAL = DCAT_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TEMPORAL = DCAT_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__WAS_GENERATED_BY = DCAT_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contributor ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CONTRIBUTOR_ID = DCAT_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = DCAT_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = DCAT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcat.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.CatalogImpl
	 * @see dcat.impl.DcatPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RESOURCE = DATASET__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ABOUT = DATASET__ABOUT;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IDENTIFIER = DATASET__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TITLE = DATASET__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DESCRIPTION = DATASET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__THEME = DATASET__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__KEYWORD = DATASET__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TYPE = DATASET__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTACT_POINT = DATASET__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CREATOR = DATASET__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PUBLISHER = DATASET__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ISSUED = DATASET__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__MODIFIED = DATASET__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__LANDING_PAGE = DATASET__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ACCESS_RIGHTS = DATASET__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONFORMS_TO = DATASET__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__LICENSE = DATASET__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RIGHTS = DATASET__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__HAS_POLICY = DATASET__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__QUALIFIED_ATTRIBUTION = DATASET__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RELATION = DATASET__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__QUALIFIED_RELATION = DATASET__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IS_REFERENCED_BY = DATASET__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__LANGUAGE = DATASET__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DISTRIBUTION = DATASET__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SPATIAL_RESOLUTION_IN_METERS = DATASET__SPATIAL_RESOLUTION_IN_METERS;

	/**
	 * The feature id for the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TEMPORAL_RESOLUTION = DATASET__TEMPORAL_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ACCRUAL_PERIODICITY = DATASET__ACCRUAL_PERIODICITY;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SPATIAL = DATASET__SPATIAL;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TEMPORAL = DATASET__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__WAS_GENERATED_BY = DATASET__WAS_GENERATED_BY;

	/**
	 * The feature id for the '<em><b>Contributor ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTRIBUTOR_ID = DATASET__CONTRIBUTOR_ID;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATALOG = DATASET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RECORD = DATASET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DATASET = DATASET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SERVICE = DATASET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Theme Taxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__THEME_TAXONOMY = DATASET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__HAS_PART = DATASET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__HOMEPAGE = DATASET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = DATASET_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcat.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.DistributionImpl
	 * @see dcat.impl.DcatPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__RESOURCE = RdfPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ABOUT = RdfPackage.RESOURCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__TITLE = RdfPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DESCRIPTION = RdfPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ACCESS_SERVICE = RdfPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__FORMAT = RdfPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__MEDIA_TYPE = RdfPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PACKAGE_FORMAT = RdfPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Byte Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__BYTE_SIZE = RdfPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Compress Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__COMPRESS_FORMAT = RdfPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__SPATIAL_RESOLUTION_IN_METERS = RdfPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__TEMPORAL_RESOLUTION = RdfPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ACCESS_RIGHTS = RdfPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__LICENSE = RdfPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__CONFORMS_TO = RdfPackage.RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__RIGHTS = RdfPackage.RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__HAS_POLICY = RdfPackage.RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ISSUED = RdfPackage.RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__MODIFIED = RdfPackage.RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__NODE_ID = RdfPackage.RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Download URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DOWNLOAD_URL = RdfPackage.RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Access URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ACCESS_URL = RdfPackage.RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>License Attribution By Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__LICENSE_ATTRIBUTION_BY_TEXT = RdfPackage.RESOURCE_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = RdfPackage.RESOURCE_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = RdfPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcat.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.RelationshipImpl
	 * @see dcat.impl.DcatPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Had Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__HAD_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NODE_ID = 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dcat.impl.CatalogRecordImpl <em>Catalog Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.CatalogRecordImpl
	 * @see dcat.impl.DcatPackageImpl#getCatalogRecord()
	 * @generated
	 */
	int CATALOG_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__ISSUED = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Primary Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__PRIMARY_TOPIC = 4;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__CONFORMS_TO = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__ABOUT = 7;

	/**
	 * The number of structural features of the '<em>Catalog Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Catalog Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dcat.impl.DataServiceImpl <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.DataServiceImpl
	 * @see dcat.impl.DcatPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__RESOURCE = DCAT_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ABOUT = DCAT_RESOURCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__IDENTIFIER = DCAT_RESOURCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__TITLE = DCAT_RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__DESCRIPTION = DCAT_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__THEME = DCAT_RESOURCE__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__KEYWORD = DCAT_RESOURCE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__TYPE = DCAT_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__CONTACT_POINT = DCAT_RESOURCE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__CREATOR = DCAT_RESOURCE__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__PUBLISHER = DCAT_RESOURCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ISSUED = DCAT_RESOURCE__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__MODIFIED = DCAT_RESOURCE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__LANDING_PAGE = DCAT_RESOURCE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ACCESS_RIGHTS = DCAT_RESOURCE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__CONFORMS_TO = DCAT_RESOURCE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__LICENSE = DCAT_RESOURCE__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__RIGHTS = DCAT_RESOURCE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__HAS_POLICY = DCAT_RESOURCE__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__QUALIFIED_ATTRIBUTION = DCAT_RESOURCE__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__RELATION = DCAT_RESOURCE__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__QUALIFIED_RELATION = DCAT_RESOURCE__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__IS_REFERENCED_BY = DCAT_RESOURCE__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__LANGUAGE = DCAT_RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Endpoint Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ENDPOINT_DESCRIPTION = DCAT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint URL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ENDPOINT_URL = DCAT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serves Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__SERVES_DATASET = DCAT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = DCAT_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_OPERATION_COUNT = DCAT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcat.impl.DCATAPRootImpl <em>DCATAP Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.DCATAPRootImpl
	 * @see dcat.impl.DcatPackageImpl#getDCATAPRoot()
	 * @generated
	 */
	int DCATAP_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__CATALOG = 3;

	/**
	 * The feature id for the '<em><b>Catalog Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__CATALOG_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Data Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__DATA_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__DATASET = 6;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT__DISTRIBUTION = 7;

	/**
	 * The number of structural features of the '<em>DCATAP Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>DCATAP Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCATAP_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dcat.impl.DatasetContainerImpl <em>Dataset Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcat.impl.DatasetContainerImpl
	 * @see dcat.impl.DcatPackageImpl#getDatasetContainer()
	 * @generated
	 */
	int DATASET_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_CONTAINER__DATASET = 0;

	/**
	 * The number of structural features of the '<em>Dataset Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dataset Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dcat.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see dcat.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Catalog#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see dcat.Catalog#getCatalog()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Catalog#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see dcat.Catalog#getRecord()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Catalog#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see dcat.Catalog#getDataset()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Catalog#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see dcat.Catalog#getService()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Catalog#getThemeTaxonomy <em>Theme Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theme Taxonomy</em>'.
	 * @see dcat.Catalog#getThemeTaxonomy()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_ThemeTaxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Catalog#getHasPart <em>Has Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Part</em>'.
	 * @see dcat.Catalog#getHasPart()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_HasPart();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Catalog#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Homepage</em>'.
	 * @see dcat.Catalog#getHomepage()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Homepage();

	/**
	 * Returns the meta object for class '{@link dcat.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see dcat.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Dataset#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distribution</em>'.
	 * @see dcat.Dataset#getDistribution()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Distribution();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Dataset#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Resolution In Meters</em>'.
	 * @see dcat.Dataset#getSpatialResolutionInMeters()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_SpatialResolutionInMeters();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Dataset#getTemporalResolution <em>Temporal Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Temporal Resolution</em>'.
	 * @see dcat.Dataset#getTemporalResolution()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_TemporalResolution();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Dataset#getAccrualPeriodicity <em>Accrual Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accrual Periodicity</em>'.
	 * @see dcat.Dataset#getAccrualPeriodicity()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_AccrualPeriodicity();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Dataset#getSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spatial</em>'.
	 * @see dcat.Dataset#getSpatial()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Spatial();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Dataset#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal</em>'.
	 * @see dcat.Dataset#getTemporal()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Temporal();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Dataset#getWasGeneratedBy <em>Was Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Was Generated By</em>'.
	 * @see dcat.Dataset#getWasGeneratedBy()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_WasGeneratedBy();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Dataset#getContributorID <em>Contributor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor ID</em>'.
	 * @see dcat.Dataset#getContributorID()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_ContributorID();

	/**
	 * Returns the meta object for class '{@link dcat.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see dcat.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see dcat.Distribution#getTitle()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see dcat.Distribution#getDescription()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getAccessService <em>Access Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Service</em>'.
	 * @see dcat.Distribution#getAccessService()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_AccessService();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see dcat.Distribution#getFormat()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Format();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Distribution#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Media Type</em>'.
	 * @see dcat.Distribution#getMediaType()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_MediaType();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Distribution#getPackageFormat <em>Package Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Package Format</em>'.
	 * @see dcat.Distribution#getPackageFormat()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_PackageFormat();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Distribution#getByteSize <em>Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byte Size</em>'.
	 * @see dcat.Distribution#getByteSize()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_ByteSize();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getCompressFormat <em>Compress Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compress Format</em>'.
	 * @see dcat.Distribution#getCompressFormat()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_CompressFormat();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Distribution#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Resolution In Meters</em>'.
	 * @see dcat.Distribution#getSpatialResolutionInMeters()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_SpatialResolutionInMeters();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.Distribution#getTemporalResolution <em>Temporal Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Temporal Resolution</em>'.
	 * @see dcat.Distribution#getTemporalResolution()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_TemporalResolution();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Rights</em>'.
	 * @see dcat.Distribution#getAccessRights()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_AccessRights();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see dcat.Distribution#getLicense()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_License();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conforms To</em>'.
	 * @see dcat.Distribution#getConformsTo()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_ConformsTo();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see dcat.Distribution#getRights()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Rights();

	/**
	 * Returns the meta object for the attribute '{@link dcat.Distribution#getHasPolicy <em>Has Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Policy</em>'.
	 * @see dcat.Distribution#getHasPolicy()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_HasPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see dcat.Distribution#getIssued()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see dcat.Distribution#getModified()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Modified();

	/**
	 * Returns the meta object for the attribute '{@link dcat.Distribution#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see dcat.Distribution#getNodeID()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_NodeID();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getDownloadURL <em>Download URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Download URL</em>'.
	 * @see dcat.Distribution#getDownloadURL()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_DownloadURL();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.Distribution#getAccessURL <em>Access URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access URL</em>'.
	 * @see dcat.Distribution#getAccessURL()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_AccessURL();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Distribution#getLicenseAttributionByText <em>License Attribution By Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Attribution By Text</em>'.
	 * @see dcat.Distribution#getLicenseAttributionByText()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_LicenseAttributionByText();

	/**
	 * Returns the meta object for class '{@link dcat.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see dcat.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Relationship#getHadRole <em>Had Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Had Role</em>'.
	 * @see dcat.Relationship#getHadRole()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_HadRole();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.Relationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see dcat.Relationship#getDescription()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Description();

	/**
	 * Returns the meta object for the attribute '{@link dcat.Relationship#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see dcat.Relationship#getAbout()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_About();

	/**
	 * Returns the meta object for the attribute '{@link dcat.Relationship#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see dcat.Relationship#getNodeID()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_NodeID();

	/**
	 * Returns the meta object for class '{@link dcat.CatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Record</em>'.
	 * @see dcat.CatalogRecord
	 * @generated
	 */
	EClass getCatalogRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.CatalogRecord#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see dcat.CatalogRecord#getTitle()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.CatalogRecord#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see dcat.CatalogRecord#getDescription()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_Description();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.CatalogRecord#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see dcat.CatalogRecord#getIssued()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.CatalogRecord#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see dcat.CatalogRecord#getModified()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_Modified();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.CatalogRecord#getPrimaryTopic <em>Primary Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Topic</em>'.
	 * @see dcat.CatalogRecord#getPrimaryTopic()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_PrimaryTopic();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.CatalogRecord#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conforms To</em>'.
	 * @see dcat.CatalogRecord#getConformsTo()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_ConformsTo();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.CatalogRecord#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see dcat.CatalogRecord#getLanguage()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_Language();

	/**
	 * Returns the meta object for the attribute '{@link dcat.CatalogRecord#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see dcat.CatalogRecord#getAbout()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EAttribute getCatalogRecord_About();

	/**
	 * Returns the meta object for class '{@link dcat.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see dcat.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.DataService#getEndpointDescription <em>Endpoint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endpoint Description</em>'.
	 * @see dcat.DataService#getEndpointDescription()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_EndpointDescription();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.DataService#getEndpointURL <em>Endpoint URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endpoint URL</em>'.
	 * @see dcat.DataService#getEndpointURL()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_EndpointURL();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DataService#getServesDataset <em>Serves Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serves Dataset</em>'.
	 * @see dcat.DataService#getServesDataset()
	 * @see #getDataService()
	 * @generated
	 */
	EReference getDataService_ServesDataset();

	/**
	 * Returns the meta object for class '{@link dcat.DcatResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see dcat.DcatResource
	 * @generated
	 */
	EClass getDcatResource();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see dcat.DcatResource#getIdentifier()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see dcat.DcatResource#getTitle()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see dcat.DcatResource#getDescription()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theme</em>'.
	 * @see dcat.DcatResource#getTheme()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Theme();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword</em>'.
	 * @see dcat.DcatResource#getKeyword()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Keyword();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see dcat.DcatResource#getType()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact Point</em>'.
	 * @see dcat.DcatResource#getContactPoint()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_ContactPoint();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DcatResource#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see dcat.DcatResource#getCreator()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DcatResource#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see dcat.DcatResource#getPublisher()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DcatResource#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see dcat.DcatResource#getIssued()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DcatResource#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see dcat.DcatResource#getModified()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Modified();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getLandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Landing Page</em>'.
	 * @see dcat.DcatResource#getLandingPage()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_LandingPage();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DcatResource#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Rights</em>'.
	 * @see dcat.DcatResource#getAccessRights()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_AccessRights();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conforms To</em>'.
	 * @see dcat.DcatResource#getConformsTo()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_ConformsTo();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DcatResource#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see dcat.DcatResource#getLicense()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_License();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights</em>'.
	 * @see dcat.DcatResource#getRights()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Rights();

	/**
	 * Returns the meta object for the attribute '{@link dcat.DcatResource#getHasPolicy <em>Has Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Policy</em>'.
	 * @see dcat.DcatResource#getHasPolicy()
	 * @see #getDcatResource()
	 * @generated
	 */
	EAttribute getDcatResource_HasPolicy();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.DcatResource#getQualifiedAttribution <em>Qualified Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualified Attribution</em>'.
	 * @see dcat.DcatResource#getQualifiedAttribution()
	 * @see #getDcatResource()
	 * @generated
	 */
	EAttribute getDcatResource_QualifiedAttribution();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see dcat.DcatResource#getRelation()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getQualifiedRelation <em>Qualified Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualified Relation</em>'.
	 * @see dcat.DcatResource#getQualifiedRelation()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_QualifiedRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getIsReferencedBy <em>Is Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Referenced By</em>'.
	 * @see dcat.DcatResource#getIsReferencedBy()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_IsReferencedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link dcat.DcatResource#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see dcat.DcatResource#getLanguage()
	 * @see #getDcatResource()
	 * @generated
	 */
	EReference getDcatResource_Language();

	/**
	 * Returns the meta object for class '{@link dcat.DCATAPRoot <em>DCATAP Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCATAP Root</em>'.
	 * @see dcat.DCATAPRoot
	 * @generated
	 */
	EClass getDCATAPRoot();

	/**
	 * Returns the meta object for the attribute list '{@link dcat.DCATAPRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see dcat.DCATAPRoot#getMixed()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EAttribute getDCATAPRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link dcat.DCATAPRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see dcat.DCATAPRoot#getXMLNSPrefixMap()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link dcat.DCATAPRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see dcat.DCATAPRoot#getXSISchemaLocation()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DCATAPRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see dcat.DCATAPRoot#getCatalog()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DCATAPRoot#getCatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog Record</em>'.
	 * @see dcat.DCATAPRoot#getCatalogRecord()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_CatalogRecord();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DCATAPRoot#getDataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Service</em>'.
	 * @see dcat.DCATAPRoot#getDataService()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_DataService();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DCATAPRoot#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see dcat.DCATAPRoot#getDataset()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_Dataset();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DCATAPRoot#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see dcat.DCATAPRoot#getDistribution()
	 * @see #getDCATAPRoot()
	 * @generated
	 */
	EReference getDCATAPRoot_Distribution();

	/**
	 * Returns the meta object for class '{@link dcat.DatasetContainer <em>Dataset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Container</em>'.
	 * @see dcat.DatasetContainer
	 * @generated
	 */
	EClass getDatasetContainer();

	/**
	 * Returns the meta object for the containment reference '{@link dcat.DatasetContainer#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see dcat.DatasetContainer#getDataset()
	 * @see #getDatasetContainer()
	 * @generated
	 */
	EReference getDatasetContainer_Dataset();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DcatFactory getDcatFactory();

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
		 * The meta object literal for the '{@link dcat.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.CatalogImpl
		 * @see dcat.impl.DcatPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CATALOG = eINSTANCE.getCatalog_Catalog();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__RECORD = eINSTANCE.getCatalog_Record();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__DATASET = eINSTANCE.getCatalog_Dataset();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__SERVICE = eINSTANCE.getCatalog_Service();

		/**
		 * The meta object literal for the '<em><b>Theme Taxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__THEME_TAXONOMY = eINSTANCE.getCatalog_ThemeTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Has Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__HAS_PART = eINSTANCE.getCatalog_HasPart();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__HOMEPAGE = eINSTANCE.getCatalog_Homepage();

		/**
		 * The meta object literal for the '{@link dcat.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.DatasetImpl
		 * @see dcat.impl.DcatPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DISTRIBUTION = eINSTANCE.getDataset_Distribution();

		/**
		 * The meta object literal for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__SPATIAL_RESOLUTION_IN_METERS = eINSTANCE.getDataset_SpatialResolutionInMeters();

		/**
		 * The meta object literal for the '<em><b>Temporal Resolution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__TEMPORAL_RESOLUTION = eINSTANCE.getDataset_TemporalResolution();

		/**
		 * The meta object literal for the '<em><b>Accrual Periodicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__ACCRUAL_PERIODICITY = eINSTANCE.getDataset_AccrualPeriodicity();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__SPATIAL = eINSTANCE.getDataset_Spatial();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__TEMPORAL = eINSTANCE.getDataset_Temporal();

		/**
		 * The meta object literal for the '<em><b>Was Generated By</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__WAS_GENERATED_BY = eINSTANCE.getDataset_WasGeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Contributor ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__CONTRIBUTOR_ID = eINSTANCE.getDataset_ContributorID();

		/**
		 * The meta object literal for the '{@link dcat.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.DistributionImpl
		 * @see dcat.impl.DcatPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__TITLE = eINSTANCE.getDistribution_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__DESCRIPTION = eINSTANCE.getDistribution_Description();

		/**
		 * The meta object literal for the '<em><b>Access Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__ACCESS_SERVICE = eINSTANCE.getDistribution_AccessService();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__FORMAT = eINSTANCE.getDistribution_Format();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__MEDIA_TYPE = eINSTANCE.getDistribution_MediaType();

		/**
		 * The meta object literal for the '<em><b>Package Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__PACKAGE_FORMAT = eINSTANCE.getDistribution_PackageFormat();

		/**
		 * The meta object literal for the '<em><b>Byte Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__BYTE_SIZE = eINSTANCE.getDistribution_ByteSize();

		/**
		 * The meta object literal for the '<em><b>Compress Format</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__COMPRESS_FORMAT = eINSTANCE.getDistribution_CompressFormat();

		/**
		 * The meta object literal for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__SPATIAL_RESOLUTION_IN_METERS = eINSTANCE.getDistribution_SpatialResolutionInMeters();

		/**
		 * The meta object literal for the '<em><b>Temporal Resolution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__TEMPORAL_RESOLUTION = eINSTANCE.getDistribution_TemporalResolution();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__ACCESS_RIGHTS = eINSTANCE.getDistribution_AccessRights();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__LICENSE = eINSTANCE.getDistribution_License();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__CONFORMS_TO = eINSTANCE.getDistribution_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__RIGHTS = eINSTANCE.getDistribution_Rights();

		/**
		 * The meta object literal for the '<em><b>Has Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__HAS_POLICY = eINSTANCE.getDistribution_HasPolicy();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__ISSUED = eINSTANCE.getDistribution_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__MODIFIED = eINSTANCE.getDistribution_Modified();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__NODE_ID = eINSTANCE.getDistribution_NodeID();

		/**
		 * The meta object literal for the '<em><b>Download URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__DOWNLOAD_URL = eINSTANCE.getDistribution_DownloadURL();

		/**
		 * The meta object literal for the '<em><b>Access URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__ACCESS_URL = eINSTANCE.getDistribution_AccessURL();

		/**
		 * The meta object literal for the '<em><b>License Attribution By Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__LICENSE_ATTRIBUTION_BY_TEXT = eINSTANCE.getDistribution_LicenseAttributionByText();

		/**
		 * The meta object literal for the '{@link dcat.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.RelationshipImpl
		 * @see dcat.impl.DcatPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Had Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__HAD_ROLE = eINSTANCE.getRelationship_HadRole();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__DESCRIPTION = eINSTANCE.getRelationship_Description();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__ABOUT = eINSTANCE.getRelationship_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NODE_ID = eINSTANCE.getRelationship_NodeID();

		/**
		 * The meta object literal for the '{@link dcat.impl.CatalogRecordImpl <em>Catalog Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.CatalogRecordImpl
		 * @see dcat.impl.DcatPackageImpl#getCatalogRecord()
		 * @generated
		 */
		EClass CATALOG_RECORD = eINSTANCE.getCatalogRecord();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__TITLE = eINSTANCE.getCatalogRecord_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__DESCRIPTION = eINSTANCE.getCatalogRecord_Description();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__ISSUED = eINSTANCE.getCatalogRecord_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__MODIFIED = eINSTANCE.getCatalogRecord_Modified();

		/**
		 * The meta object literal for the '<em><b>Primary Topic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__PRIMARY_TOPIC = eINSTANCE.getCatalogRecord_PrimaryTopic();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__CONFORMS_TO = eINSTANCE.getCatalogRecord_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__LANGUAGE = eINSTANCE.getCatalogRecord_Language();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RECORD__ABOUT = eINSTANCE.getCatalogRecord_About();

		/**
		 * The meta object literal for the '{@link dcat.impl.DataServiceImpl <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.DataServiceImpl
		 * @see dcat.impl.DcatPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Endpoint Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__ENDPOINT_DESCRIPTION = eINSTANCE.getDataService_EndpointDescription();

		/**
		 * The meta object literal for the '<em><b>Endpoint URL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__ENDPOINT_URL = eINSTANCE.getDataService_EndpointURL();

		/**
		 * The meta object literal for the '<em><b>Serves Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SERVICE__SERVES_DATASET = eINSTANCE.getDataService_ServesDataset();

		/**
		 * The meta object literal for the '{@link dcat.impl.DcatResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.DcatResourceImpl
		 * @see dcat.impl.DcatPackageImpl#getDcatResource()
		 * @generated
		 */
		EClass DCAT_RESOURCE = eINSTANCE.getDcatResource();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__IDENTIFIER = eINSTANCE.getDcatResource_Identifier();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__TITLE = eINSTANCE.getDcatResource_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__DESCRIPTION = eINSTANCE.getDcatResource_Description();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__THEME = eINSTANCE.getDcatResource_Theme();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__KEYWORD = eINSTANCE.getDcatResource_Keyword();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__TYPE = eINSTANCE.getDcatResource_Type();

		/**
		 * The meta object literal for the '<em><b>Contact Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__CONTACT_POINT = eINSTANCE.getDcatResource_ContactPoint();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__CREATOR = eINSTANCE.getDcatResource_Creator();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__PUBLISHER = eINSTANCE.getDcatResource_Publisher();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__ISSUED = eINSTANCE.getDcatResource_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__MODIFIED = eINSTANCE.getDcatResource_Modified();

		/**
		 * The meta object literal for the '<em><b>Landing Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__LANDING_PAGE = eINSTANCE.getDcatResource_LandingPage();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__ACCESS_RIGHTS = eINSTANCE.getDcatResource_AccessRights();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__CONFORMS_TO = eINSTANCE.getDcatResource_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__LICENSE = eINSTANCE.getDcatResource_License();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__RIGHTS = eINSTANCE.getDcatResource_Rights();

		/**
		 * The meta object literal for the '<em><b>Has Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAT_RESOURCE__HAS_POLICY = eINSTANCE.getDcatResource_HasPolicy();

		/**
		 * The meta object literal for the '<em><b>Qualified Attribution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAT_RESOURCE__QUALIFIED_ATTRIBUTION = eINSTANCE.getDcatResource_QualifiedAttribution();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__RELATION = eINSTANCE.getDcatResource_Relation();

		/**
		 * The meta object literal for the '<em><b>Qualified Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__QUALIFIED_RELATION = eINSTANCE.getDcatResource_QualifiedRelation();

		/**
		 * The meta object literal for the '<em><b>Is Referenced By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__IS_REFERENCED_BY = eINSTANCE.getDcatResource_IsReferencedBy();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAT_RESOURCE__LANGUAGE = eINSTANCE.getDcatResource_Language();

		/**
		 * The meta object literal for the '{@link dcat.impl.DCATAPRootImpl <em>DCATAP Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.DCATAPRootImpl
		 * @see dcat.impl.DcatPackageImpl#getDCATAPRoot()
		 * @generated
		 */
		EClass DCATAP_ROOT = eINSTANCE.getDCATAPRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCATAP_ROOT__MIXED = eINSTANCE.getDCATAPRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDCATAPRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDCATAPRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__CATALOG = eINSTANCE.getDCATAPRoot_Catalog();

		/**
		 * The meta object literal for the '<em><b>Catalog Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__CATALOG_RECORD = eINSTANCE.getDCATAPRoot_CatalogRecord();

		/**
		 * The meta object literal for the '<em><b>Data Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__DATA_SERVICE = eINSTANCE.getDCATAPRoot_DataService();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__DATASET = eINSTANCE.getDCATAPRoot_Dataset();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCATAP_ROOT__DISTRIBUTION = eINSTANCE.getDCATAPRoot_Distribution();

		/**
		 * The meta object literal for the '{@link dcat.impl.DatasetContainerImpl <em>Dataset Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcat.impl.DatasetContainerImpl
		 * @see dcat.impl.DcatPackageImpl#getDatasetContainer()
		 * @generated
		 */
		EClass DATASET_CONTAINER = eINSTANCE.getDatasetContainer();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_CONTAINER__DATASET = eINSTANCE.getDatasetContainer_Dataset();

	}

} //DcatPackage
