/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaFactory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 *        annotation="http://www.eclipse.org/OCL/Import _xmla_empty='xmla_empty.ecore#/' _xmla_mddataset='xmla_mddataset.ecore#/' _xmla_multipleresults='xmla_multipleresults.ecore#/' _xmla_rowset='xmla_rowset.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 * @generated
 */
public interface XmlaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmla";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:schemas-microsoft-com:xml-analysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_xmla";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmlaPackage eINSTANCE = org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverResponseTypeImpl <em>Discover Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverResponseTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDiscoverResponseType()
	 * @generated
	 */
	int DISCOVER_RESPONSE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_RESPONSE_TYPE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Discover Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_RESPONSE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Discover Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverTypeImpl <em>Discover Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDiscoverType()
	 * @generated
	 */
	int DISCOVER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_TYPE__REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_TYPE__RESTRICTIONS = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_TYPE__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Discover Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Discover Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Property List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTY_LIST = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Property List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTY_LIST = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl <em>Property List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getPropertyList()
	 * @generated
	 */
	int PROPERTY_LIST = 4;

	/**
	 * The feature id for the '<em><b>Data Source Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DATA_SOURCE_INFO = 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__USER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Locale Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__LOCALE_IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__CATALOG = 5;

	/**
	 * The feature id for the '<em><b>State Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__STATE_SUPPORT = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__FORMAT = 8;

	/**
	 * The feature id for the '<em><b>Axis Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__AXIS_FORMAT = 9;

	/**
	 * The feature id for the '<em><b>Begin Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__BEGIN_RANGE = 10;

	/**
	 * The feature id for the '<em><b>End Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__END_RANGE = 11;

	/**
	 * The feature id for the '<em><b>MDX Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDX_SUPPORT = 12;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__PROVIDER_NAME = 13;

	/**
	 * The feature id for the '<em><b>Provider Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__PROVIDER_VERSION = 14;

	/**
	 * The feature id for the '<em><b>DBMS Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBMS_VERSION = 15;

	/**
	 * The feature id for the '<em><b>Provider Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__PROVIDER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Show Hidden Cubes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SHOW_HIDDEN_CUBES = 17;

	/**
	 * The feature id for the '<em><b>SQL Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SQL_SUPPORT = 18;

	/**
	 * The feature id for the '<em><b>Transaction DDL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__TRANSACTION_DDL = 19;

	/**
	 * The feature id for the '<em><b>Maximum Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MAXIMUM_ROWS = 20;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__ROLES = 21;

	/**
	 * The feature id for the '<em><b>Visual Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__VISUAL_MODE = 22;

	/**
	 * The feature id for the '<em><b>Effective Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__EFFECTIVE_ROLES = 23;

	/**
	 * The feature id for the '<em><b>Effective User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__EFFECTIVE_USER_NAME = 24;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SERVER_NAME = 25;

	/**
	 * The feature id for the '<em><b>Catalog Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__CATALOG_LOCATION = 26;

	/**
	 * The feature id for the '<em><b>Dbprop Catalog Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_CATALOG_TERM = 27;

	/**
	 * The feature id for the '<em><b>Dbprop Catalog Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_CATALOG_USAGE = 28;

	/**
	 * The feature id for the '<em><b>Dbprop Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_COLUMN_DEFINITION = 29;

	/**
	 * The feature id for the '<em><b>Dbprop Concat Null Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR = 30;

	/**
	 * The feature id for the '<em><b>Dbprop Data Source Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY = 31;

	/**
	 * The feature id for the '<em><b>Dbprop Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_GROUP_BY = 32;

	/**
	 * The feature id for the '<em><b>Dbprop Heterogeneous Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES = 33;

	/**
	 * The feature id for the '<em><b>Dbprop Identifier Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_IDENTIFIER_CASE = 34;

	/**
	 * The feature id for the '<em><b>Dbprop Max Index Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE = 35;

	/**
	 * The feature id for the '<em><b>Dbprop Max Open Chapters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS = 36;

	/**
	 * The feature id for the '<em><b>Dbprop Max Row Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MAX_ROW_SIZE = 37;

	/**
	 * The feature id for the '<em><b>Dbprop Max Row Size Include Blob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB = 38;

	/**
	 * The feature id for the '<em><b>Dbprop Max Tables In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT = 39;

	/**
	 * The feature id for the '<em><b>Dbprop Multi Table Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE = 40;

	/**
	 * The feature id for the '<em><b>Dbprop Null Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_NULL_COLLATION = 41;

	/**
	 * The feature id for the '<em><b>Dbprop Order By Columns In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT = 42;

	/**
	 * The feature id for the '<em><b>Dbprop Output Parameter Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE = 43;

	/**
	 * The feature id for the '<em><b>Dbprop Persistent Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Dbprop Prepare Abort Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR = 45;

	/**
	 * The feature id for the '<em><b>Dbprop Prepare Commit Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR = 46;

	/**
	 * The feature id for the '<em><b>Dbprop Procedure Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_PROCEDURE_TERM = 47;

	/**
	 * The feature id for the '<em><b>Dbprop Quoted Identifier Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE = 48;

	/**
	 * The feature id for the '<em><b>Dbprop Schema Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_SCHEMA_USAGE = 49;

	/**
	 * The feature id for the '<em><b>Dbprop Sql Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_SQL_SUPPORT = 50;

	/**
	 * The feature id for the '<em><b>Dbprop Subqueries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_SUBQUERIES = 51;

	/**
	 * The feature id for the '<em><b>Dbprop Supported Txn Ddl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL = 52;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Subqueries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_SUBQUERIES = 53;

	/**
	 * The feature id for the '<em><b>Dbprop Supported Txn Iso Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS = 54;

	/**
	 * The feature id for the '<em><b>Dbprop Supported Txn Iso Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN = 55;

	/**
	 * The feature id for the '<em><b>Dbprop Table Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_TABLE_TERM = 56;

	/**
	 * The feature id for the '<em><b>Mdprop Aggregate Cell Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE = 57;

	/**
	 * The feature id for the '<em><b>Mdprop Axes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_AXES = 58;

	/**
	 * The feature id for the '<em><b>Mdprop Flattening Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT = 59;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Case Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT = 60;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Desc Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS = 61;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Drill Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS = 62;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Formulas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_FORMULAS = 63;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Join Cubes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES = 64;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Member Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS = 65;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Non Measure Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS = 66;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Numeric Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS = 67;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Obj Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION = 68;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Outer Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE = 69;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Query By Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY = 70;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Range Rowset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET = 71;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Set Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS = 72;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Slicer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_SLICER = 73;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx String Compop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP = 74;

	/**
	 * The feature id for the '<em><b>Mdprop Named Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_NAMED_LEVELS = 75;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY = 76;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd SQL Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY = 77;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd MDX Unique Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE = 78;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Cache Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY = 79;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Cache Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO = 80;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Cache Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE = 81;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS = 82;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Compare Case Not Sensitive String Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS = 83;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Flattened2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_FLATTENED2 = 84;

	/**
	 * The feature id for the '<em><b>Dbprop Init Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_INIT_MODE = 85;

	/**
	 * The feature id for the '<em><b>Ssprop Init App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SSPROP_INIT_APP_NAME = 86;

	/**
	 * The feature id for the '<em><b>Ssprop Init Wsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SSPROP_INIT_WSID = 87;

	/**
	 * The feature id for the '<em><b>Ssprop Init Packetsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SSPROP_INIT_PACKETSIZE = 88;

	/**
	 * The feature id for the '<em><b>Read Only Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__READ_ONLY_SESSION = 89;

	/**
	 * The feature id for the '<em><b>Secured Cell Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SECURED_CELL_VALUE = 90;

	/**
	 * The feature id for the '<em><b>Non Empty Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__NON_EMPTY_THRESHOLD = 91;

	/**
	 * The feature id for the '<em><b>Safety Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SAFETY_OPTIONS = 92;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Cache Ratio2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2 = 93;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Use Formula Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE = 94;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Dynamic Debug Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT = 95;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Debug Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE = 96;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DIALECT = 97;

	/**
	 * The feature id for the '<em><b>Impact Analysis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__IMPACT_ANALYSIS = 98;

	/**
	 * The feature id for the '<em><b>SQL Query Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__SQL_QUERY_MODE = 99;

	/**
	 * The feature id for the '<em><b>Client Process ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__CLIENT_PROCESS_ID = 100;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__CUBE = 101;

	/**
	 * The feature id for the '<em><b>Return Cell Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__RETURN_CELL_PROPERTIES = 102;

	/**
	 * The feature id for the '<em><b>Commit Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__COMMIT_TIMEOUT = 103;

	/**
	 * The feature id for the '<em><b>Force Commit Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__FORCE_COMMIT_TIMEOUT = 104;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__EXECUTION_MODE = 105;

	/**
	 * The feature id for the '<em><b>Real Time Olap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__REAL_TIME_OLAP = 106;

	/**
	 * The feature id for the '<em><b>Mdx Missing Member Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDX_MISSING_MEMBER_MODE = 107;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Named Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_NAMED_SETS = 108;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Subqueries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES = 109;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Auto Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS = 110;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__CUSTOM_DATA = 111;

	/**
	 * The feature id for the '<em><b>Disable Prefetch Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DISABLE_PREFETCH_FACTS = 112;

	/**
	 * The feature id for the '<em><b>Update Isolation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__UPDATE_ISOLATION_LEVEL = 113;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Error Message Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE = 114;

	/**
	 * The feature id for the '<em><b>Mdprop Mdx Ddl Extensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS = 115;

	/**
	 * The feature id for the '<em><b>Response Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__RESPONSE_ENCODING = 116;

	/**
	 * The feature id for the '<em><b>Memory Locking Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__MEMORY_LOCKING_MODE = 117;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Optimize Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE = 118;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Activity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID = 119;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Request ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID = 120;

	/**
	 * The feature id for the '<em><b>Return Affected Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__RETURN_AFFECTED_OBJECTS = 121;

	/**
	 * The feature id for the '<em><b>Dbprop Msmd Request Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT = 122;

	/**
	 * The feature id for the '<em><b>Application Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST__APPLICATION_CONTEXT = 123;

	/**
	 * The number of structural features of the '<em>Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST_FEATURE_COUNT = 124;

	/**
	 * The number of operations of the '<em>Property List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionListTypeImpl <em>Restriction List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionListTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRestrictionListType()
	 * @generated
	 */
	int RESTRICTION_LIST_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_LIST_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Restriction List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Restriction List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionsTypeImpl <em>Restrictions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionsTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRestrictionsType()
	 * @generated
	 */
	int RESTRICTIONS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Restriction List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_TYPE__RESTRICTION_LIST = 0;

	/**
	 * The number of structural features of the '<em>Restrictions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Restrictions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 7;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Root1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__ROOT1 = 1;

	/**
	 * The feature id for the '<em><b>Root2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__ROOT2 = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RESULTS = 3;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationsTypeImpl <em>Annotations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationsTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getAnnotationsType()
	 * @generated
	 */
	int ANNOTATIONS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE__ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.BindingImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 11;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionTypeImpl <em>Event Session Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getEventSessionType()
	 * @generated
	 */
	int EVENT_SESSION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Template Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__TEMPLATE_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__TEMPLATE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Template Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__TEMPLATE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Dispatch Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__DISPATCH_LATENCY = 5;

	/**
	 * The feature id for the '<em><b>Event Retention Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__EVENT_RETENTION_MODE = 6;

	/**
	 * The feature id for the '<em><b>Max Event Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__MAX_EVENT_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Max Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__MAX_MEMORY = 8;

	/**
	 * The feature id for the '<em><b>Memory Partition Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__MEMORY_PARTITION_MODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Track Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE__TRACK_CAUSALITY = 11;

	/**
	 * The number of structural features of the '<em>Event Session Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Event Session Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType <em>Request Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRequestTypeType()
	 * @generated
	 */
	int REQUEST_TYPE_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType <em>Response Encoding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getResponseEncodingType()
	 * @generated
	 */
	int RESPONSE_ENCODING_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType <em>State Support Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getStateSupportType()
	 * @generated
	 */
	int STATE_SUPPORT_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1 <em>Format Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getFormatType1()
	 * @generated
	 */
	int FORMAT_TYPE1 = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1 <em>Content Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getContentType1()
	 * @generated
	 */
	int CONTENT_TYPE1 = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType <em>Axis Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getAxisFormatType()
	 * @generated
	 */
	int AXIS_FORMAT_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType <em>MDX Support Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMDXSupportType()
	 * @generated
	 */
	int MDX_SUPPORT_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType <em>Provider Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getProviderTypeType()
	 * @generated
	 */
	int PROVIDER_TYPE_TYPE = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType <em>Visual Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getVisualModeType()
	 * @generated
	 */
	int VISUAL_MODE_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType <em>Catalog Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getCatalogLocationType()
	 * @generated
	 */
	int CATALOG_LOCATION_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType <em>Dbprop Concat Null Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropConcatNullBehaviorType()
	 * @generated
	 */
	int DBPROP_CONCAT_NULL_BEHAVIOR_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType <em>Dbprop Null Collation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropNullCollationType()
	 * @generated
	 */
	int DBPROP_NULL_COLLATION_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType <em>Dbprop Output Parameter Available Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropOutputParameterAvailableType()
	 * @generated
	 */
	int DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType <em>Dbprop Persistent Id Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropPersistentIdTypeType()
	 * @generated
	 */
	int DBPROP_PERSISTENT_ID_TYPE_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType <em>Dbprop Prepare Abort Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropPrepareAbortBehaviorType()
	 * @generated
	 */
	int DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType <em>Dbprop Prepare Commit Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropPrepareCommitBehaviorType()
	 * @generated
	 */
	int DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType <em>Dbprop Quoted Identifier Case Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropQuotedIdentifierCaseType()
	 * @generated
	 */
	int DBPROP_QUOTED_IDENTIFIER_CASE_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType <em>Mdprop Aggregate Cell Update Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropAggregateCellUpdateType()
	 * @generated
	 */
	int MDPROP_AGGREGATE_CELL_UPDATE_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType <em>Mdprop Flattening Support Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropFlatteningSupportType()
	 * @generated
	 */
	int MDPROP_FLATTENING_SUPPORT_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType <em>Mdprop Mdx Non Measure Expressions Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropMdxNonMeasureExpressionsType()
	 * @generated
	 */
	int MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType <em>Mdprop Mdx Range Rowset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropMdxRangeRowsetType()
	 * @generated
	 */
	int MDPROP_MDX_RANGE_ROWSET_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType <em>Mdprop Mdx Slicer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropMdxSlicerType()
	 * @generated
	 */
	int MDPROP_MDX_SLICER_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType <em>Mdx Missing Member Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdxMissingMemberModeType()
	 * @generated
	 */
	int MDX_MISSING_MEMBER_MODE_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType <em>Dbprop Msmd MDX Compatibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdMDXCompatibilityType()
	 * @generated
	 */
	int DBPROP_MSMD_MDX_COMPATIBILITY_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType <em>Dbprop Msmd Compare Case Sensitive String Flags Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdCompareCaseSensitiveStringFlagsType()
	 * @generated
	 */
	int DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType <em>Secured Cell Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getSecuredCellValueType()
	 * @generated
	 */
	int SECURED_CELL_VALUE_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType <em>Safety Options Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getSafetyOptionsType()
	 * @generated
	 */
	int SAFETY_OPTIONS_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DialectType <em>Dialect Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DialectType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDialectType()
	 * @generated
	 */
	int DIALECT_TYPE = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType <em>SQL Query Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getSQLQueryModeType()
	 * @generated
	 */
	int SQL_QUERY_MODE_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1 <em>Mdx Missing Member Mode Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdxMissingMemberModeType1()
	 * @generated
	 */
	int MDX_MISSING_MEMBER_MODE_TYPE1 = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType <em>Dbprop Msmd Subqueries Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdSubqueriesType()
	 * @generated
	 */
	int DBPROP_MSMD_SUBQUERIES_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType <em>Dbprop Msmd Auto Exists Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdAutoExistsType()
	 * @generated
	 */
	int DBPROP_MSMD_AUTO_EXISTS_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType <em>Update Isolation Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getUpdateIsolationLevelType()
	 * @generated
	 */
	int UPDATE_ISOLATION_LEVEL_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType <em>Memory Locking Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMemoryLockingModeType()
	 * @generated
	 */
	int MEMORY_LOCKING_MODE_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType <em>Visibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes <em>Retention Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRetentionModes()
	 * @generated
	 */
	int RETENTION_MODES = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes <em>Partition Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getPartitionModes()
	 * @generated
	 */
	int PARTITION_MODES = 49;

	/**
	 * The meta object id for the '<em>Request Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRequestTypeTypeObject()
	 * @generated
	 */
	int REQUEST_TYPE_TYPE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Response Encoding Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getResponseEncodingTypeObject()
	 * @generated
	 */
	int RESPONSE_ENCODING_TYPE_OBJECT = 51;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType <em>Discover Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discover Response Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType
	 * @generated
	 */
	EClass getDiscoverResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType#getReturn()
	 * @see #getDiscoverResponseType()
	 * @generated
	 */
	EReference getDiscoverResponseType_Return();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType <em>Discover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discover Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType
	 * @generated
	 */
	EClass getDiscoverType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRequestType()
	 * @see #getDiscoverType()
	 * @generated
	 */
	EAttribute getDiscoverType_RequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restrictions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getRestrictions()
	 * @see #getDiscoverType()
	 * @generated
	 */
	EReference getDiscoverType_Restrictions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType#getProperties()
	 * @see #getDiscoverType()
	 * @generated
	 */
	EReference getDiscoverType_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Properties#getPropertyList <em>Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property List</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Properties#getPropertyList()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_PropertyList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType#getPropertyList <em>Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property List</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType#getPropertyList()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_PropertyList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList <em>Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property List</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList
	 * @generated
	 */
	EClass getPropertyList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDataSourceInfo <em>Data Source Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDataSourceInfo()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DataSourceInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTimeout()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUserName()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getPassword()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getLocaleIdentifier <em>Locale Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale Identifier</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getLocaleIdentifier()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_LocaleIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalog()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getStateSupport <em>State Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Support</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getStateSupport()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_StateSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getContent()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getFormat()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getAxisFormat <em>Axis Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Format</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getAxisFormat()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_AxisFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getBeginRange <em>Begin Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Range</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getBeginRange()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_BeginRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEndRange <em>End Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Range</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEndRange()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_EndRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMDXSupport <em>MDX Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MDX Support</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMDXSupport()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MDXSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderName()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderVersion <em>Provider Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Version</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderVersion()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ProviderVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDBMSVersion <em>DBMS Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DBMS Version</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDBMSVersion()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DBMSVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderType <em>Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderType()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ProviderType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isShowHiddenCubes <em>Show Hidden Cubes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Hidden Cubes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isShowHiddenCubes()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ShowHiddenCubes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLSupport <em>SQL Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SQL Support</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLSupport()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SQLSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTransactionDDL <em>Transaction DDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction DDL</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTransactionDDL()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_TransactionDDL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMaximumRows <em>Maximum Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Rows</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMaximumRows()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MaximumRows();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getRoles()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getVisualMode <em>Visual Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getVisualMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_VisualMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveRoles <em>Effective Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Roles</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveRoles()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_EffectiveRoles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveUserName <em>Effective User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective User Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveUserName()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_EffectiveUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getServerName()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalogLocation <em>Catalog Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalogLocation()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_CatalogLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogTerm <em>Dbprop Catalog Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Catalog Term</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogTerm()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropCatalogTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogUsage <em>Dbprop Catalog Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Catalog Usage</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogUsage()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropCatalogUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropColumnDefinition <em>Dbprop Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Column Definition</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropColumnDefinition()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropConcatNullBehavior <em>Dbprop Concat Null Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Concat Null Behavior</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropConcatNullBehavior()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropConcatNullBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropDataSourceReadOnly <em>Dbprop Data Source Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Data Source Read Only</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropDataSourceReadOnly()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropDataSourceReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropGroupBy <em>Dbprop Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Group By</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropGroupBy()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropGroupBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropHeterogeneousTables <em>Dbprop Heterogeneous Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Heterogeneous Tables</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropHeterogeneousTables()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropHeterogeneousTables();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropIdentifierCase <em>Dbprop Identifier Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Identifier Case</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropIdentifierCase()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropIdentifierCase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxIndexSize <em>Dbprop Max Index Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Max Index Size</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxIndexSize()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMaxIndexSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxOpenChapters <em>Dbprop Max Open Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Max Open Chapters</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxOpenChapters()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMaxOpenChapters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxRowSize <em>Dbprop Max Row Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Max Row Size</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxRowSize()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMaxRowSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMaxRowSizeIncludeBlob <em>Dbprop Max Row Size Include Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Max Row Size Include Blob</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMaxRowSizeIncludeBlob()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMaxRowSizeIncludeBlob();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxTablesInSelect <em>Dbprop Max Tables In Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Max Tables In Select</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxTablesInSelect()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMaxTablesInSelect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMultiTableUpdate <em>Dbprop Multi Table Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Multi Table Update</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMultiTableUpdate()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMultiTableUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropNullCollation <em>Dbprop Null Collation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Null Collation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropNullCollation()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropNullCollation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropOrderByColumnsInSelect <em>Dbprop Order By Columns In Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Order By Columns In Select</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropOrderByColumnsInSelect()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropOrderByColumnsInSelect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropOutputParameterAvailable <em>Dbprop Output Parameter Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Output Parameter Available</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropOutputParameterAvailable()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropOutputParameterAvailable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPersistentIdType <em>Dbprop Persistent Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Persistent Id Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPersistentIdType()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropPersistentIdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareAbortBehavior <em>Dbprop Prepare Abort Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Prepare Abort Behavior</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareAbortBehavior()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropPrepareAbortBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareCommitBehavior <em>Dbprop Prepare Commit Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Prepare Commit Behavior</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareCommitBehavior()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropPrepareCommitBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropProcedureTerm <em>Dbprop Procedure Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Procedure Term</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropProcedureTerm()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropProcedureTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropQuotedIdentifierCase <em>Dbprop Quoted Identifier Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Quoted Identifier Case</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropQuotedIdentifierCase()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropQuotedIdentifierCase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSchemaUsage <em>Dbprop Schema Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Schema Usage</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSchemaUsage()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropSchemaUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSqlSupport <em>Dbprop Sql Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Sql Support</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSqlSupport()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropSqlSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSubqueries <em>Dbprop Subqueries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Subqueries</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSubqueries()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropSubqueries();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnDdl <em>Dbprop Supported Txn Ddl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Supported Txn Ddl</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnDdl()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropSupportedTxnDdl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSubqueries <em>Mdprop Mdx Subqueries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Subqueries</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSubqueries()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxSubqueries();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoLevels <em>Dbprop Supported Txn Iso Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Supported Txn Iso Levels</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoLevels()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropSupportedTxnIsoLevels();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoRetain <em>Dbprop Supported Txn Iso Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Supported Txn Iso Retain</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoRetain()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropSupportedTxnIsoRetain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropTableTerm <em>Dbprop Table Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Table Term</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropTableTerm()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropTableTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAggregateCellUpdate <em>Mdprop Aggregate Cell Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Aggregate Cell Update</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAggregateCellUpdate()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropAggregateCellUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAxes <em>Mdprop Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Axes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAxes()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropAxes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropFlatteningSupport <em>Mdprop Flattening Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Flattening Support</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropFlatteningSupport()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropFlatteningSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxCaseSupport <em>Mdprop Mdx Case Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Case Support</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxCaseSupport()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxCaseSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDescFlags <em>Mdprop Mdx Desc Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Desc Flags</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDescFlags()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxDescFlags();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDrillFunctions <em>Mdprop Mdx Drill Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Drill Functions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDrillFunctions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxDrillFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxFormulas <em>Mdprop Mdx Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Formulas</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxFormulas()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxFormulas();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxJoinCubes <em>Mdprop Mdx Join Cubes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Join Cubes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxJoinCubes()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxJoinCubes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxMemberFunctions <em>Mdprop Mdx Member Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Member Functions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxMemberFunctions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxMemberFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNonMeasureExpressions <em>Mdprop Mdx Non Measure Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Non Measure Expressions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNonMeasureExpressions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxNonMeasureExpressions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNumericFunctions <em>Mdprop Mdx Numeric Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Numeric Functions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNumericFunctions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxNumericFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxObjQualification <em>Mdprop Mdx Obj Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Obj Qualification</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxObjQualification()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxObjQualification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxOuterReference <em>Mdprop Mdx Outer Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Outer Reference</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxOuterReference()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxOuterReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isMdpropMdxQueryByProperty <em>Mdprop Mdx Query By Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Query By Property</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isMdpropMdxQueryByProperty()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxQueryByProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxRangeRowset <em>Mdprop Mdx Range Rowset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Range Rowset</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxRangeRowset()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxRangeRowset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSetFunctions <em>Mdprop Mdx Set Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Set Functions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSetFunctions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxSetFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSlicer <em>Mdprop Mdx Slicer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Slicer</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSlicer()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxSlicer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxStringCompop <em>Mdprop Mdx String Compop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx String Compop</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxStringCompop()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxStringCompop();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropNamedLevels <em>Mdprop Named Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Named Levels</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropNamedLevels()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropNamedLevels();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXCompatibility <em>Dbprop Msmd MDX Compatibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd MDX Compatibility</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXCompatibility()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdMDXCompatibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSQLCompatibility <em>Dbprop Msmd SQL Compatibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd SQL Compatibility</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSQLCompatibility()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdSQLCompatibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXUniqueNameStyle <em>Dbprop Msmd MDX Unique Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd MDX Unique Name Style</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXUniqueNameStyle()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdMDXUniqueNameStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCachePolicy <em>Dbprop Msmd Cache Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Cache Policy</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCachePolicy()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdCachePolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio <em>Dbprop Msmd Cache Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Cache Ratio</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdCacheRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheMode <em>Dbprop Msmd Cache Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Cache Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdCacheMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseSensitiveStringFlags <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Compare Case Sensitive String Flags</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseNotSensitiveStringFlags <em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseNotSensitiveStringFlags()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMsmdFlattened2 <em>Dbprop Msmd Flattened2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Flattened2</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMsmdFlattened2()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdFlattened2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropInitMode <em>Dbprop Init Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Init Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropInitMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropInitMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitAppName <em>Ssprop Init App Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssprop Init App Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitAppName()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SspropInitAppName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitWsid <em>Ssprop Init Wsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssprop Init Wsid</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitWsid()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SspropInitWsid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitPacketsize <em>Ssprop Init Packetsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssprop Init Packetsize</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitPacketsize()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SspropInitPacketsize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReadOnlySession <em>Read Only Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only Session</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReadOnlySession()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ReadOnlySession();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSecuredCellValue <em>Secured Cell Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secured Cell Value</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSecuredCellValue()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SecuredCellValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getNonEmptyThreshold <em>Non Empty Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Empty Threshold</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getNonEmptyThreshold()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_NonEmptyThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSafetyOptions <em>Safety Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety Options</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSafetyOptions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SafetyOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio2 <em>Dbprop Msmd Cache Ratio2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Cache Ratio2</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio2()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdCacheRatio2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdUseFormulaCache <em>Dbprop Msmd Use Formula Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Use Formula Cache</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdUseFormulaCache()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdUseFormulaCache();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDynamicDebugLimit <em>Dbprop Msmd Dynamic Debug Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Dynamic Debug Limit</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDynamicDebugLimit()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdDynamicDebugLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDebugMode <em>Dbprop Msmd Debug Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Debug Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDebugMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdDebugMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDialect()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Dialect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isImpactAnalysis <em>Impact Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Analysis</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isImpactAnalysis()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ImpactAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLQueryMode <em>SQL Query Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SQL Query Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLQueryMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_SQLQueryMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getClientProcessID <em>Client Process ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Process ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getClientProcessID()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ClientProcessID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cube</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCube()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_Cube();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isReturnCellProperties <em>Return Cell Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Cell Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isReturnCellProperties()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ReturnCellProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCommitTimeout <em>Commit Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Timeout</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCommitTimeout()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_CommitTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getForceCommitTimeout <em>Force Commit Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Commit Timeout</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getForceCommitTimeout()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ForceCommitTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getExecutionMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ExecutionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isRealTimeOlap <em>Real Time Olap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Time Olap</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isRealTimeOlap()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_RealTimeOlap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdx Missing Member Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdxMissingMemberMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdxMissingMemberMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNamedSets <em>Mdprop Mdx Named Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Named Sets</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNamedSets()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxNamedSets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSubqueries <em>Dbprop Msmd Subqueries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Subqueries</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSubqueries()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdSubqueries();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdAutoExists <em>Dbprop Msmd Auto Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Auto Exists</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdAutoExists()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdAutoExists();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCustomData <em>Custom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Data</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCustomData()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_CustomData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDisablePrefetchFacts <em>Disable Prefetch Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Prefetch Facts</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDisablePrefetchFacts()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DisablePrefetchFacts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUpdateIsolationLevel <em>Update Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Isolation Level</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUpdateIsolationLevel()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_UpdateIsolationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdErrorMessageMode <em>Dbprop Msmd Error Message Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Error Message Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdErrorMessageMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdErrorMessageMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDdlExtensions <em>Mdprop Mdx Ddl Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdprop Mdx Ddl Extensions</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDdlExtensions()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MdpropMdxDdlExtensions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getResponseEncoding <em>Response Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Encoding</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getResponseEncoding()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ResponseEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMemoryLockingMode <em>Memory Locking Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Locking Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMemoryLockingMode()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_MemoryLockingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdOptimizeResponse <em>Dbprop Msmd Optimize Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Optimize Response</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdOptimizeResponse()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdOptimizeResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdActivityID <em>Dbprop Msmd Activity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Activity ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdActivityID()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdActivityID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestID <em>Dbprop Msmd Request ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Request ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestID()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdRequestID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReturnAffectedObjects <em>Return Affected Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Affected Objects</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReturnAffectedObjects()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ReturnAffectedObjects();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestMemoryLimit <em>Dbprop Msmd Request Memory Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbprop Msmd Request Memory Limit</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestMemoryLimit()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_DbpropMsmdRequestMemoryLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getApplicationContext <em>Application Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Context</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getApplicationContext()
	 * @see #getPropertyList()
	 * @generated
	 */
	EAttribute getPropertyList_ApplicationContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType <em>Restriction List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction List Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType
	 * @generated
	 */
	EClass getRestrictionListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType#getAny()
	 * @see #getRestrictionListType()
	 * @generated
	 */
	EAttribute getRestrictionListType_Any();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType <em>Restrictions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restrictions Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType
	 * @generated
	 */
	EClass getRestrictionsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType#getRestrictionList <em>Restriction List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction List</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType#getRestrictionList()
	 * @see #getRestrictionsType()
	 * @generated
	 */
	EReference getRestrictionsType_RestrictionList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Root();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot1 <em>Root1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot1()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Root1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot2 <em>Root2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root2</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Return#getRoot2()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Root2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Results</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Return#getResults()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Results();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType#getRoot()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Annotation#getVisibility()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType <em>Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType
	 * @generated
	 */
	EClass getAnnotationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType#getAnnotation()
	 * @see #getAnnotationsType()
	 * @generated
	 */
	EReference getAnnotationsType_Annotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType <em>Event Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Session Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType
	 * @generated
	 */
	EClass getEventSessionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTemplateCategory <em>Template Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Category</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTemplateCategory()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_TemplateCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTemplateName()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_TemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTemplateDescription <em>Template Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Description</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTemplateDescription()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_TemplateDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getEvent()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EReference getEventSessionType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getTarget()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EReference getEventSessionType_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getDispatchLatency <em>Dispatch Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatch Latency</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getDispatchLatency()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_DispatchLatency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getEventRetentionMode <em>Event Retention Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Retention Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getEventRetentionMode()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_EventRetentionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getMaxEventSize <em>Max Event Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Event Size</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getMaxEventSize()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_MaxEventSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getMaxMemory <em>Max Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Memory</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getMaxMemory()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_MaxMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getMemoryPartitionMode <em>Memory Partition Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Partition Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getMemoryPartitionMode()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_MemoryPartitionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#getName()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#isTrackCausality <em>Track Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Causality</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType#isTrackCausality()
	 * @see #getEventSessionType()
	 * @generated
	 */
	EAttribute getEventSessionType_TrackCausality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType <em>Request Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Type Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
	 * @generated
	 */
	EEnum getRequestTypeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType <em>Response Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Encoding Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType
	 * @generated
	 */
	EEnum getResponseEncodingType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType <em>State Support Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Support Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType
	 * @generated
	 */
	EEnum getStateSupportType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1 <em>Format Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1
	 * @generated
	 */
	EEnum getFormatType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1 <em>Content Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Type1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1
	 * @generated
	 */
	EEnum getContentType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType <em>Axis Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis Format Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType
	 * @generated
	 */
	EEnum getAxisFormatType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType <em>MDX Support Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MDX Support Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType
	 * @generated
	 */
	EEnum getMDXSupportType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType <em>Provider Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provider Type Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType
	 * @generated
	 */
	EEnum getProviderTypeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType <em>Visual Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visual Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType
	 * @generated
	 */
	EEnum getVisualModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType <em>Catalog Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Catalog Location Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType
	 * @generated
	 */
	EEnum getCatalogLocationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType <em>Dbprop Concat Null Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Concat Null Behavior Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType
	 * @generated
	 */
	EEnum getDbpropConcatNullBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType <em>Dbprop Null Collation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Null Collation Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType
	 * @generated
	 */
	EEnum getDbpropNullCollationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType <em>Dbprop Output Parameter Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Output Parameter Available Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType
	 * @generated
	 */
	EEnum getDbpropOutputParameterAvailableType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType <em>Dbprop Persistent Id Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Persistent Id Type Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType
	 * @generated
	 */
	EEnum getDbpropPersistentIdTypeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType <em>Dbprop Prepare Abort Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Prepare Abort Behavior Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType
	 * @generated
	 */
	EEnum getDbpropPrepareAbortBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType <em>Dbprop Prepare Commit Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Prepare Commit Behavior Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType
	 * @generated
	 */
	EEnum getDbpropPrepareCommitBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType <em>Dbprop Quoted Identifier Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Quoted Identifier Case Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType
	 * @generated
	 */
	EEnum getDbpropQuotedIdentifierCaseType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType <em>Mdprop Aggregate Cell Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdprop Aggregate Cell Update Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType
	 * @generated
	 */
	EEnum getMdpropAggregateCellUpdateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType <em>Mdprop Flattening Support Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdprop Flattening Support Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType
	 * @generated
	 */
	EEnum getMdpropFlatteningSupportType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType <em>Mdprop Mdx Non Measure Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdprop Mdx Non Measure Expressions Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType
	 * @generated
	 */
	EEnum getMdpropMdxNonMeasureExpressionsType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType <em>Mdprop Mdx Range Rowset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdprop Mdx Range Rowset Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType
	 * @generated
	 */
	EEnum getMdpropMdxRangeRowsetType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType <em>Mdprop Mdx Slicer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdprop Mdx Slicer Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType
	 * @generated
	 */
	EEnum getMdpropMdxSlicerType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType <em>Mdx Missing Member Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdx Missing Member Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType
	 * @generated
	 */
	EEnum getMdxMissingMemberModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType <em>Dbprop Msmd MDX Compatibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Msmd MDX Compatibility Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType
	 * @generated
	 */
	EEnum getDbpropMsmdMDXCompatibilityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType <em>Dbprop Msmd Compare Case Sensitive String Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Msmd Compare Case Sensitive String Flags Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType
	 * @generated
	 */
	EEnum getDbpropMsmdCompareCaseSensitiveStringFlagsType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType <em>Secured Cell Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Secured Cell Value Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType
	 * @generated
	 */
	EEnum getSecuredCellValueType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType <em>Safety Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Safety Options Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType
	 * @generated
	 */
	EEnum getSafetyOptionsType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DialectType <em>Dialect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dialect Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DialectType
	 * @generated
	 */
	EEnum getDialectType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType <em>SQL Query Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SQL Query Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType
	 * @generated
	 */
	EEnum getSQLQueryModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1 <em>Mdx Missing Member Mode Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mdx Missing Member Mode Type1</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1
	 * @generated
	 */
	EEnum getMdxMissingMemberModeType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType <em>Dbprop Msmd Subqueries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Msmd Subqueries Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType
	 * @generated
	 */
	EEnum getDbpropMsmdSubqueriesType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType <em>Dbprop Msmd Auto Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dbprop Msmd Auto Exists Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType
	 * @generated
	 */
	EEnum getDbpropMsmdAutoExistsType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType <em>Update Isolation Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Isolation Level Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType
	 * @generated
	 */
	EEnum getUpdateIsolationLevelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType <em>Memory Locking Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Locking Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType
	 * @generated
	 */
	EEnum getMemoryLockingModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType
	 * @generated
	 */
	EEnum getVisibilityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes <em>Retention Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Retention Modes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes
	 * @generated
	 */
	EEnum getRetentionModes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes <em>Partition Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partition Modes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes
	 * @generated
	 */
	EEnum getPartitionModes();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType <em>Request Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Request Type Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType"
	 *        extendedMetaData="name='RequestType_._type:Object' baseType='RequestType_._type'"
	 * @generated
	 */
	EDataType getRequestTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType <em>Response Encoding Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Response Encoding Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType"
	 *        extendedMetaData="name='ResponseEncoding_._type:Object' baseType='ResponseEncoding_._type'"
	 * @generated
	 */
	EDataType getResponseEncodingTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmlaFactory getXmlaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverResponseTypeImpl <em>Discover Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverResponseTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDiscoverResponseType()
		 * @generated
		 */
		EClass DISCOVER_RESPONSE_TYPE = eINSTANCE.getDiscoverResponseType();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVER_RESPONSE_TYPE__RETURN = eINSTANCE.getDiscoverResponseType_Return();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverTypeImpl <em>Discover Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.DiscoverTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDiscoverType()
		 * @generated
		 */
		EClass DISCOVER_TYPE = eINSTANCE.getDiscoverType();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVER_TYPE__REQUEST_TYPE = eINSTANCE.getDiscoverType_RequestType();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVER_TYPE__RESTRICTIONS = eINSTANCE.getDiscoverType_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVER_TYPE__PROPERTIES = eINSTANCE.getDiscoverType_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Property List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTY_LIST = eINSTANCE.getProperties_PropertyList();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertiesTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__PROPERTY_LIST = eINSTANCE.getPropertiesType_PropertyList();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl <em>Property List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getPropertyList()
		 * @generated
		 */
		EClass PROPERTY_LIST = eINSTANCE.getPropertyList();

		/**
		 * The meta object literal for the '<em><b>Data Source Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DATA_SOURCE_INFO = eINSTANCE.getPropertyList_DataSourceInfo();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__TIMEOUT = eINSTANCE.getPropertyList_Timeout();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__USER_NAME = eINSTANCE.getPropertyList_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__PASSWORD = eINSTANCE.getPropertyList_Password();

		/**
		 * The meta object literal for the '<em><b>Locale Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__LOCALE_IDENTIFIER = eINSTANCE.getPropertyList_LocaleIdentifier();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__CATALOG = eINSTANCE.getPropertyList_Catalog();

		/**
		 * The meta object literal for the '<em><b>State Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__STATE_SUPPORT = eINSTANCE.getPropertyList_StateSupport();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__CONTENT = eINSTANCE.getPropertyList_Content();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__FORMAT = eINSTANCE.getPropertyList_Format();

		/**
		 * The meta object literal for the '<em><b>Axis Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__AXIS_FORMAT = eINSTANCE.getPropertyList_AxisFormat();

		/**
		 * The meta object literal for the '<em><b>Begin Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__BEGIN_RANGE = eINSTANCE.getPropertyList_BeginRange();

		/**
		 * The meta object literal for the '<em><b>End Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__END_RANGE = eINSTANCE.getPropertyList_EndRange();

		/**
		 * The meta object literal for the '<em><b>MDX Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDX_SUPPORT = eINSTANCE.getPropertyList_MDXSupport();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__PROVIDER_NAME = eINSTANCE.getPropertyList_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Provider Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__PROVIDER_VERSION = eINSTANCE.getPropertyList_ProviderVersion();

		/**
		 * The meta object literal for the '<em><b>DBMS Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBMS_VERSION = eINSTANCE.getPropertyList_DBMSVersion();

		/**
		 * The meta object literal for the '<em><b>Provider Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__PROVIDER_TYPE = eINSTANCE.getPropertyList_ProviderType();

		/**
		 * The meta object literal for the '<em><b>Show Hidden Cubes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SHOW_HIDDEN_CUBES = eINSTANCE.getPropertyList_ShowHiddenCubes();

		/**
		 * The meta object literal for the '<em><b>SQL Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SQL_SUPPORT = eINSTANCE.getPropertyList_SQLSupport();

		/**
		 * The meta object literal for the '<em><b>Transaction DDL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__TRANSACTION_DDL = eINSTANCE.getPropertyList_TransactionDDL();

		/**
		 * The meta object literal for the '<em><b>Maximum Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MAXIMUM_ROWS = eINSTANCE.getPropertyList_MaximumRows();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__ROLES = eINSTANCE.getPropertyList_Roles();

		/**
		 * The meta object literal for the '<em><b>Visual Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__VISUAL_MODE = eINSTANCE.getPropertyList_VisualMode();

		/**
		 * The meta object literal for the '<em><b>Effective Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__EFFECTIVE_ROLES = eINSTANCE.getPropertyList_EffectiveRoles();

		/**
		 * The meta object literal for the '<em><b>Effective User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__EFFECTIVE_USER_NAME = eINSTANCE.getPropertyList_EffectiveUserName();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SERVER_NAME = eINSTANCE.getPropertyList_ServerName();

		/**
		 * The meta object literal for the '<em><b>Catalog Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__CATALOG_LOCATION = eINSTANCE.getPropertyList_CatalogLocation();

		/**
		 * The meta object literal for the '<em><b>Dbprop Catalog Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_CATALOG_TERM = eINSTANCE.getPropertyList_DbpropCatalogTerm();

		/**
		 * The meta object literal for the '<em><b>Dbprop Catalog Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_CATALOG_USAGE = eINSTANCE.getPropertyList_DbpropCatalogUsage();

		/**
		 * The meta object literal for the '<em><b>Dbprop Column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_COLUMN_DEFINITION = eINSTANCE.getPropertyList_DbpropColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Dbprop Concat Null Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR = eINSTANCE.getPropertyList_DbpropConcatNullBehavior();

		/**
		 * The meta object literal for the '<em><b>Dbprop Data Source Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY = eINSTANCE.getPropertyList_DbpropDataSourceReadOnly();

		/**
		 * The meta object literal for the '<em><b>Dbprop Group By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_GROUP_BY = eINSTANCE.getPropertyList_DbpropGroupBy();

		/**
		 * The meta object literal for the '<em><b>Dbprop Heterogeneous Tables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES = eINSTANCE.getPropertyList_DbpropHeterogeneousTables();

		/**
		 * The meta object literal for the '<em><b>Dbprop Identifier Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_IDENTIFIER_CASE = eINSTANCE.getPropertyList_DbpropIdentifierCase();

		/**
		 * The meta object literal for the '<em><b>Dbprop Max Index Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE = eINSTANCE.getPropertyList_DbpropMaxIndexSize();

		/**
		 * The meta object literal for the '<em><b>Dbprop Max Open Chapters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS = eINSTANCE.getPropertyList_DbpropMaxOpenChapters();

		/**
		 * The meta object literal for the '<em><b>Dbprop Max Row Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MAX_ROW_SIZE = eINSTANCE.getPropertyList_DbpropMaxRowSize();

		/**
		 * The meta object literal for the '<em><b>Dbprop Max Row Size Include Blob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB = eINSTANCE.getPropertyList_DbpropMaxRowSizeIncludeBlob();

		/**
		 * The meta object literal for the '<em><b>Dbprop Max Tables In Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT = eINSTANCE.getPropertyList_DbpropMaxTablesInSelect();

		/**
		 * The meta object literal for the '<em><b>Dbprop Multi Table Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE = eINSTANCE.getPropertyList_DbpropMultiTableUpdate();

		/**
		 * The meta object literal for the '<em><b>Dbprop Null Collation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_NULL_COLLATION = eINSTANCE.getPropertyList_DbpropNullCollation();

		/**
		 * The meta object literal for the '<em><b>Dbprop Order By Columns In Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT = eINSTANCE.getPropertyList_DbpropOrderByColumnsInSelect();

		/**
		 * The meta object literal for the '<em><b>Dbprop Output Parameter Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE = eINSTANCE.getPropertyList_DbpropOutputParameterAvailable();

		/**
		 * The meta object literal for the '<em><b>Dbprop Persistent Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE = eINSTANCE.getPropertyList_DbpropPersistentIdType();

		/**
		 * The meta object literal for the '<em><b>Dbprop Prepare Abort Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR = eINSTANCE.getPropertyList_DbpropPrepareAbortBehavior();

		/**
		 * The meta object literal for the '<em><b>Dbprop Prepare Commit Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR = eINSTANCE.getPropertyList_DbpropPrepareCommitBehavior();

		/**
		 * The meta object literal for the '<em><b>Dbprop Procedure Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_PROCEDURE_TERM = eINSTANCE.getPropertyList_DbpropProcedureTerm();

		/**
		 * The meta object literal for the '<em><b>Dbprop Quoted Identifier Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE = eINSTANCE.getPropertyList_DbpropQuotedIdentifierCase();

		/**
		 * The meta object literal for the '<em><b>Dbprop Schema Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_SCHEMA_USAGE = eINSTANCE.getPropertyList_DbpropSchemaUsage();

		/**
		 * The meta object literal for the '<em><b>Dbprop Sql Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_SQL_SUPPORT = eINSTANCE.getPropertyList_DbpropSqlSupport();

		/**
		 * The meta object literal for the '<em><b>Dbprop Subqueries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_SUBQUERIES = eINSTANCE.getPropertyList_DbpropSubqueries();

		/**
		 * The meta object literal for the '<em><b>Dbprop Supported Txn Ddl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL = eINSTANCE.getPropertyList_DbpropSupportedTxnDdl();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Subqueries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_SUBQUERIES = eINSTANCE.getPropertyList_MdpropMdxSubqueries();

		/**
		 * The meta object literal for the '<em><b>Dbprop Supported Txn Iso Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS = eINSTANCE.getPropertyList_DbpropSupportedTxnIsoLevels();

		/**
		 * The meta object literal for the '<em><b>Dbprop Supported Txn Iso Retain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN = eINSTANCE.getPropertyList_DbpropSupportedTxnIsoRetain();

		/**
		 * The meta object literal for the '<em><b>Dbprop Table Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_TABLE_TERM = eINSTANCE.getPropertyList_DbpropTableTerm();

		/**
		 * The meta object literal for the '<em><b>Mdprop Aggregate Cell Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE = eINSTANCE.getPropertyList_MdpropAggregateCellUpdate();

		/**
		 * The meta object literal for the '<em><b>Mdprop Axes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_AXES = eINSTANCE.getPropertyList_MdpropAxes();

		/**
		 * The meta object literal for the '<em><b>Mdprop Flattening Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT = eINSTANCE.getPropertyList_MdpropFlatteningSupport();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Case Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT = eINSTANCE.getPropertyList_MdpropMdxCaseSupport();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Desc Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS = eINSTANCE.getPropertyList_MdpropMdxDescFlags();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Drill Functions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS = eINSTANCE.getPropertyList_MdpropMdxDrillFunctions();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Formulas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_FORMULAS = eINSTANCE.getPropertyList_MdpropMdxFormulas();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Join Cubes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES = eINSTANCE.getPropertyList_MdpropMdxJoinCubes();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Member Functions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS = eINSTANCE.getPropertyList_MdpropMdxMemberFunctions();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Non Measure Expressions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS = eINSTANCE.getPropertyList_MdpropMdxNonMeasureExpressions();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Numeric Functions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS = eINSTANCE.getPropertyList_MdpropMdxNumericFunctions();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Obj Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION = eINSTANCE.getPropertyList_MdpropMdxObjQualification();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Outer Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE = eINSTANCE.getPropertyList_MdpropMdxOuterReference();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Query By Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY = eINSTANCE.getPropertyList_MdpropMdxQueryByProperty();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Range Rowset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET = eINSTANCE.getPropertyList_MdpropMdxRangeRowset();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Set Functions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS = eINSTANCE.getPropertyList_MdpropMdxSetFunctions();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Slicer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_SLICER = eINSTANCE.getPropertyList_MdpropMdxSlicer();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx String Compop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP = eINSTANCE.getPropertyList_MdpropMdxStringCompop();

		/**
		 * The meta object literal for the '<em><b>Mdprop Named Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_NAMED_LEVELS = eINSTANCE.getPropertyList_MdpropNamedLevels();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY = eINSTANCE.getPropertyList_DbpropMsmdMDXCompatibility();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd SQL Compatibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY = eINSTANCE.getPropertyList_DbpropMsmdSQLCompatibility();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd MDX Unique Name Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE = eINSTANCE.getPropertyList_DbpropMsmdMDXUniqueNameStyle();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Cache Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY = eINSTANCE.getPropertyList_DbpropMsmdCachePolicy();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Cache Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO = eINSTANCE.getPropertyList_DbpropMsmdCacheRatio();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Cache Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE = eINSTANCE.getPropertyList_DbpropMsmdCacheMode();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS = eINSTANCE.getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Compare Case Not Sensitive String Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS = eINSTANCE.getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Flattened2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_FLATTENED2 = eINSTANCE.getPropertyList_DbpropMsmdFlattened2();

		/**
		 * The meta object literal for the '<em><b>Dbprop Init Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_INIT_MODE = eINSTANCE.getPropertyList_DbpropInitMode();

		/**
		 * The meta object literal for the '<em><b>Ssprop Init App Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SSPROP_INIT_APP_NAME = eINSTANCE.getPropertyList_SspropInitAppName();

		/**
		 * The meta object literal for the '<em><b>Ssprop Init Wsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SSPROP_INIT_WSID = eINSTANCE.getPropertyList_SspropInitWsid();

		/**
		 * The meta object literal for the '<em><b>Ssprop Init Packetsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SSPROP_INIT_PACKETSIZE = eINSTANCE.getPropertyList_SspropInitPacketsize();

		/**
		 * The meta object literal for the '<em><b>Read Only Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__READ_ONLY_SESSION = eINSTANCE.getPropertyList_ReadOnlySession();

		/**
		 * The meta object literal for the '<em><b>Secured Cell Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SECURED_CELL_VALUE = eINSTANCE.getPropertyList_SecuredCellValue();

		/**
		 * The meta object literal for the '<em><b>Non Empty Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__NON_EMPTY_THRESHOLD = eINSTANCE.getPropertyList_NonEmptyThreshold();

		/**
		 * The meta object literal for the '<em><b>Safety Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SAFETY_OPTIONS = eINSTANCE.getPropertyList_SafetyOptions();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Cache Ratio2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2 = eINSTANCE.getPropertyList_DbpropMsmdCacheRatio2();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Use Formula Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE = eINSTANCE.getPropertyList_DbpropMsmdUseFormulaCache();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Dynamic Debug Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT = eINSTANCE.getPropertyList_DbpropMsmdDynamicDebugLimit();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Debug Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE = eINSTANCE.getPropertyList_DbpropMsmdDebugMode();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DIALECT = eINSTANCE.getPropertyList_Dialect();

		/**
		 * The meta object literal for the '<em><b>Impact Analysis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__IMPACT_ANALYSIS = eINSTANCE.getPropertyList_ImpactAnalysis();

		/**
		 * The meta object literal for the '<em><b>SQL Query Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__SQL_QUERY_MODE = eINSTANCE.getPropertyList_SQLQueryMode();

		/**
		 * The meta object literal for the '<em><b>Client Process ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__CLIENT_PROCESS_ID = eINSTANCE.getPropertyList_ClientProcessID();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__CUBE = eINSTANCE.getPropertyList_Cube();

		/**
		 * The meta object literal for the '<em><b>Return Cell Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__RETURN_CELL_PROPERTIES = eINSTANCE.getPropertyList_ReturnCellProperties();

		/**
		 * The meta object literal for the '<em><b>Commit Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__COMMIT_TIMEOUT = eINSTANCE.getPropertyList_CommitTimeout();

		/**
		 * The meta object literal for the '<em><b>Force Commit Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__FORCE_COMMIT_TIMEOUT = eINSTANCE.getPropertyList_ForceCommitTimeout();

		/**
		 * The meta object literal for the '<em><b>Execution Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__EXECUTION_MODE = eINSTANCE.getPropertyList_ExecutionMode();

		/**
		 * The meta object literal for the '<em><b>Real Time Olap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__REAL_TIME_OLAP = eINSTANCE.getPropertyList_RealTimeOlap();

		/**
		 * The meta object literal for the '<em><b>Mdx Missing Member Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDX_MISSING_MEMBER_MODE = eINSTANCE.getPropertyList_MdxMissingMemberMode();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Named Sets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_NAMED_SETS = eINSTANCE.getPropertyList_MdpropMdxNamedSets();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Subqueries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES = eINSTANCE.getPropertyList_DbpropMsmdSubqueries();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Auto Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS = eINSTANCE.getPropertyList_DbpropMsmdAutoExists();

		/**
		 * The meta object literal for the '<em><b>Custom Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__CUSTOM_DATA = eINSTANCE.getPropertyList_CustomData();

		/**
		 * The meta object literal for the '<em><b>Disable Prefetch Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DISABLE_PREFETCH_FACTS = eINSTANCE.getPropertyList_DisablePrefetchFacts();

		/**
		 * The meta object literal for the '<em><b>Update Isolation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__UPDATE_ISOLATION_LEVEL = eINSTANCE.getPropertyList_UpdateIsolationLevel();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Error Message Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE = eINSTANCE.getPropertyList_DbpropMsmdErrorMessageMode();

		/**
		 * The meta object literal for the '<em><b>Mdprop Mdx Ddl Extensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS = eINSTANCE.getPropertyList_MdpropMdxDdlExtensions();

		/**
		 * The meta object literal for the '<em><b>Response Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__RESPONSE_ENCODING = eINSTANCE.getPropertyList_ResponseEncoding();

		/**
		 * The meta object literal for the '<em><b>Memory Locking Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__MEMORY_LOCKING_MODE = eINSTANCE.getPropertyList_MemoryLockingMode();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Optimize Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE = eINSTANCE.getPropertyList_DbpropMsmdOptimizeResponse();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Activity ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID = eINSTANCE.getPropertyList_DbpropMsmdActivityID();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Request ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID = eINSTANCE.getPropertyList_DbpropMsmdRequestID();

		/**
		 * The meta object literal for the '<em><b>Return Affected Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__RETURN_AFFECTED_OBJECTS = eINSTANCE.getPropertyList_ReturnAffectedObjects();

		/**
		 * The meta object literal for the '<em><b>Dbprop Msmd Request Memory Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT = eINSTANCE.getPropertyList_DbpropMsmdRequestMemoryLimit();

		/**
		 * The meta object literal for the '<em><b>Application Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_LIST__APPLICATION_CONTEXT = eINSTANCE.getPropertyList_ApplicationContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionListTypeImpl <em>Restriction List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionListTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRestrictionListType()
		 * @generated
		 */
		EClass RESTRICTION_LIST_TYPE = eINSTANCE.getRestrictionListType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_LIST_TYPE__ANY = eINSTANCE.getRestrictionListType_Any();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionsTypeImpl <em>Restrictions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionsTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRestrictionsType()
		 * @generated
		 */
		EClass RESTRICTIONS_TYPE = eINSTANCE.getRestrictionsType();

		/**
		 * The meta object literal for the '<em><b>Restriction List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_TYPE__RESTRICTION_LIST = eINSTANCE.getRestrictionsType_RestrictionList();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__ROOT = eINSTANCE.getReturn_Root();

		/**
		 * The meta object literal for the '<em><b>Root1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__ROOT1 = eINSTANCE.getReturn_Root1();

		/**
		 * The meta object literal for the '<em><b>Root2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__ROOT2 = eINSTANCE.getReturn_Root2();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__RESULTS = eINSTANCE.getReturn_Results();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_TYPE__ROOT = eINSTANCE.getReturnType_Root();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VISIBILITY = eINSTANCE.getAnnotation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationsTypeImpl <em>Annotations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.AnnotationsTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getAnnotationsType()
		 * @generated
		 */
		EClass ANNOTATIONS_TYPE = eINSTANCE.getAnnotationsType();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS_TYPE__ANNOTATION = eINSTANCE.getAnnotationsType_Annotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.BindingImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionTypeImpl <em>Event Session Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getEventSessionType()
		 * @generated
		 */
		EClass EVENT_SESSION_TYPE = eINSTANCE.getEventSessionType();

		/**
		 * The meta object literal for the '<em><b>Template Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__TEMPLATE_CATEGORY = eINSTANCE.getEventSessionType_TemplateCategory();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__TEMPLATE_NAME = eINSTANCE.getEventSessionType_TemplateName();

		/**
		 * The meta object literal for the '<em><b>Template Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__TEMPLATE_DESCRIPTION = eINSTANCE.getEventSessionType_TemplateDescription();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SESSION_TYPE__EVENT = eINSTANCE.getEventSessionType_Event();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SESSION_TYPE__TARGET = eINSTANCE.getEventSessionType_Target();

		/**
		 * The meta object literal for the '<em><b>Dispatch Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__DISPATCH_LATENCY = eINSTANCE.getEventSessionType_DispatchLatency();

		/**
		 * The meta object literal for the '<em><b>Event Retention Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__EVENT_RETENTION_MODE = eINSTANCE.getEventSessionType_EventRetentionMode();

		/**
		 * The meta object literal for the '<em><b>Max Event Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__MAX_EVENT_SIZE = eINSTANCE.getEventSessionType_MaxEventSize();

		/**
		 * The meta object literal for the '<em><b>Max Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__MAX_MEMORY = eINSTANCE.getEventSessionType_MaxMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Partition Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__MEMORY_PARTITION_MODE = eINSTANCE.getEventSessionType_MemoryPartitionMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__NAME = eINSTANCE.getEventSessionType_Name();

		/**
		 * The meta object literal for the '<em><b>Track Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SESSION_TYPE__TRACK_CAUSALITY = eINSTANCE.getEventSessionType_TrackCausality();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType <em>Request Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRequestTypeType()
		 * @generated
		 */
		EEnum REQUEST_TYPE_TYPE = eINSTANCE.getRequestTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType <em>Response Encoding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getResponseEncodingType()
		 * @generated
		 */
		EEnum RESPONSE_ENCODING_TYPE = eINSTANCE.getResponseEncodingType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType <em>State Support Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getStateSupportType()
		 * @generated
		 */
		EEnum STATE_SUPPORT_TYPE = eINSTANCE.getStateSupportType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1 <em>Format Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getFormatType1()
		 * @generated
		 */
		EEnum FORMAT_TYPE1 = eINSTANCE.getFormatType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1 <em>Content Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getContentType1()
		 * @generated
		 */
		EEnum CONTENT_TYPE1 = eINSTANCE.getContentType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType <em>Axis Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getAxisFormatType()
		 * @generated
		 */
		EEnum AXIS_FORMAT_TYPE = eINSTANCE.getAxisFormatType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType <em>MDX Support Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMDXSupportType()
		 * @generated
		 */
		EEnum MDX_SUPPORT_TYPE = eINSTANCE.getMDXSupportType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType <em>Provider Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getProviderTypeType()
		 * @generated
		 */
		EEnum PROVIDER_TYPE_TYPE = eINSTANCE.getProviderTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType <em>Visual Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getVisualModeType()
		 * @generated
		 */
		EEnum VISUAL_MODE_TYPE = eINSTANCE.getVisualModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType <em>Catalog Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getCatalogLocationType()
		 * @generated
		 */
		EEnum CATALOG_LOCATION_TYPE = eINSTANCE.getCatalogLocationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType <em>Dbprop Concat Null Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropConcatNullBehaviorType()
		 * @generated
		 */
		EEnum DBPROP_CONCAT_NULL_BEHAVIOR_TYPE = eINSTANCE.getDbpropConcatNullBehaviorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType <em>Dbprop Null Collation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropNullCollationType()
		 * @generated
		 */
		EEnum DBPROP_NULL_COLLATION_TYPE = eINSTANCE.getDbpropNullCollationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType <em>Dbprop Output Parameter Available Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropOutputParameterAvailableType()
		 * @generated
		 */
		EEnum DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE = eINSTANCE.getDbpropOutputParameterAvailableType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType <em>Dbprop Persistent Id Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropPersistentIdTypeType()
		 * @generated
		 */
		EEnum DBPROP_PERSISTENT_ID_TYPE_TYPE = eINSTANCE.getDbpropPersistentIdTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType <em>Dbprop Prepare Abort Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropPrepareAbortBehaviorType()
		 * @generated
		 */
		EEnum DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE = eINSTANCE.getDbpropPrepareAbortBehaviorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType <em>Dbprop Prepare Commit Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropPrepareCommitBehaviorType()
		 * @generated
		 */
		EEnum DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE = eINSTANCE.getDbpropPrepareCommitBehaviorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType <em>Dbprop Quoted Identifier Case Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropQuotedIdentifierCaseType()
		 * @generated
		 */
		EEnum DBPROP_QUOTED_IDENTIFIER_CASE_TYPE = eINSTANCE.getDbpropQuotedIdentifierCaseType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType <em>Mdprop Aggregate Cell Update Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropAggregateCellUpdateType()
		 * @generated
		 */
		EEnum MDPROP_AGGREGATE_CELL_UPDATE_TYPE = eINSTANCE.getMdpropAggregateCellUpdateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType <em>Mdprop Flattening Support Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropFlatteningSupportType()
		 * @generated
		 */
		EEnum MDPROP_FLATTENING_SUPPORT_TYPE = eINSTANCE.getMdpropFlatteningSupportType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType <em>Mdprop Mdx Non Measure Expressions Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropMdxNonMeasureExpressionsType()
		 * @generated
		 */
		EEnum MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE = eINSTANCE.getMdpropMdxNonMeasureExpressionsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType <em>Mdprop Mdx Range Rowset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropMdxRangeRowsetType()
		 * @generated
		 */
		EEnum MDPROP_MDX_RANGE_ROWSET_TYPE = eINSTANCE.getMdpropMdxRangeRowsetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType <em>Mdprop Mdx Slicer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdpropMdxSlicerType()
		 * @generated
		 */
		EEnum MDPROP_MDX_SLICER_TYPE = eINSTANCE.getMdpropMdxSlicerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType <em>Mdx Missing Member Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdxMissingMemberModeType()
		 * @generated
		 */
		EEnum MDX_MISSING_MEMBER_MODE_TYPE = eINSTANCE.getMdxMissingMemberModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType <em>Dbprop Msmd MDX Compatibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdMDXCompatibilityType()
		 * @generated
		 */
		EEnum DBPROP_MSMD_MDX_COMPATIBILITY_TYPE = eINSTANCE.getDbpropMsmdMDXCompatibilityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType <em>Dbprop Msmd Compare Case Sensitive String Flags Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdCompareCaseSensitiveStringFlagsType()
		 * @generated
		 */
		EEnum DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE = eINSTANCE.getDbpropMsmdCompareCaseSensitiveStringFlagsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType <em>Secured Cell Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getSecuredCellValueType()
		 * @generated
		 */
		EEnum SECURED_CELL_VALUE_TYPE = eINSTANCE.getSecuredCellValueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType <em>Safety Options Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getSafetyOptionsType()
		 * @generated
		 */
		EEnum SAFETY_OPTIONS_TYPE = eINSTANCE.getSafetyOptionsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DialectType <em>Dialect Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DialectType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDialectType()
		 * @generated
		 */
		EEnum DIALECT_TYPE = eINSTANCE.getDialectType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType <em>SQL Query Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getSQLQueryModeType()
		 * @generated
		 */
		EEnum SQL_QUERY_MODE_TYPE = eINSTANCE.getSQLQueryModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1 <em>Mdx Missing Member Mode Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMdxMissingMemberModeType1()
		 * @generated
		 */
		EEnum MDX_MISSING_MEMBER_MODE_TYPE1 = eINSTANCE.getMdxMissingMemberModeType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType <em>Dbprop Msmd Subqueries Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdSubqueriesType()
		 * @generated
		 */
		EEnum DBPROP_MSMD_SUBQUERIES_TYPE = eINSTANCE.getDbpropMsmdSubqueriesType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType <em>Dbprop Msmd Auto Exists Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getDbpropMsmdAutoExistsType()
		 * @generated
		 */
		EEnum DBPROP_MSMD_AUTO_EXISTS_TYPE = eINSTANCE.getDbpropMsmdAutoExistsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType <em>Update Isolation Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getUpdateIsolationLevelType()
		 * @generated
		 */
		EEnum UPDATE_ISOLATION_LEVEL_TYPE = eINSTANCE.getUpdateIsolationLevelType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType <em>Memory Locking Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getMemoryLockingModeType()
		 * @generated
		 */
		EEnum MEMORY_LOCKING_MODE_TYPE = eINSTANCE.getMemoryLockingModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType <em>Visibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getVisibilityType()
		 * @generated
		 */
		EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes <em>Retention Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRetentionModes()
		 * @generated
		 */
		EEnum RETENTION_MODES = eINSTANCE.getRetentionModes();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes <em>Partition Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getPartitionModes()
		 * @generated
		 */
		EEnum PARTITION_MODES = eINSTANCE.getPartitionModes();

		/**
		 * The meta object literal for the '<em>Request Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getRequestTypeTypeObject()
		 * @generated
		 */
		EDataType REQUEST_TYPE_TYPE_OBJECT = eINSTANCE.getRequestTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Response Encoding Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl#getResponseEncodingTypeObject()
		 * @generated
		 */
		EDataType RESPONSE_ENCODING_TYPE_OBJECT = eINSTANCE.getResponseEncodingTypeObject();

	}

} //XmlaPackage
