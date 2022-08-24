/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Request</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRequest()
 * @model extendedMetaData="name='RequestType_._type'"
 * @generated
 */
public enum Request implements Enumerator {
	/**
	 * The '<em><b>DBSCHEMACATALOGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMACATALOGS_VALUE
	 * @generated
	 * @ordered
	 */
	DBSCHEMACATALOGS(0, "DBSCHEMACATALOGS", "DBSCHEMA_CATALOGS"),

	/**
	 * The '<em><b>MDSCHEMACUBES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMACUBES_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMACUBES(1, "MDSCHEMACUBES", "MDSCHEMA_CUBES"),

	/**
	 * The '<em><b>MDSCHEMADIMENSIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMADIMENSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMADIMENSIONS(2, "MDSCHEMADIMENSIONS", "MDSCHEMA_DIMENSIONS"),

	/**
	 * The '<em><b>MDSCHEMAHIERARCHIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAHIERARCHIES_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAHIERARCHIES(3, "MDSCHEMAHIERARCHIES", "MDSCHEMA_HIERARCHIES"),

	/**
	 * The '<em><b>MDSCHEMALEVELS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMALEVELS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMALEVELS(4, "MDSCHEMALEVELS", "MDSCHEMA_LEVELS"),

	/**
	 * The '<em><b>MDSCHEMAMEASURES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEASURES_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAMEASURES(5, "MDSCHEMAMEASURES", "MDSCHEMA_MEASURES"),

	/**
	 * The '<em><b>MDSCHEMAPROPERTIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAPROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAPROPERTIES(6, "MDSCHEMAPROPERTIES", "MDSCHEMA_PROPERTIES"),

	/**
	 * The '<em><b>MDSCHEMAMEMBERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAMEMBERS(7, "MDSCHEMAMEMBERS", "MDSCHEMA_MEMBERS"),

	/**
	 * The '<em><b>MDSCHEMAACTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAACTIONS(8, "MDSCHEMAACTIONS", "MDSCHEMA_ACTIONS"),

	/**
	 * The '<em><b>MDSCHEMASETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMASETS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMASETS(9, "MDSCHEMASETS", "MDSCHEMA_SETS"),

	/**
	 * The '<em><b>DISCOVERINSTANCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERINSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERINSTANCES(10, "DISCOVERINSTANCES", "DISCOVER_INSTANCES"),

	/**
	 * The '<em><b>MDSCHEMAKPIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAKPIS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAKPIS(11, "MDSCHEMAKPIS", "MDSCHEMA_KPIS"),

	/**
	 * The '<em><b>MDSCHEMAMEASUREGROUPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEASUREGROUPS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAMEASUREGROUPS(12, "MDSCHEMAMEASUREGROUPS", "MDSCHEMA_MEASUREGROUPS"),

	/**
	 * The '<em><b>MDSCHEMAMEASUREGROUPDIMENSIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEASUREGROUPDIMENSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAMEASUREGROUPDIMENSIONS(13, "MDSCHEMAMEASUREGROUPDIMENSIONS", "MDSCHEMA_MEASUREGROUP_DIMENSIONS"),

	/**
	 * The '<em><b>DISCOVERPROPERTIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERPROPERTIES(14, "DISCOVERPROPERTIES", "DISCOVER_PROPERTIES"),

	/**
	 * The '<em><b>DISCOVERLITERALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERLITERALS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERLITERALS(15, "DISCOVERLITERALS", "DISCOVER_LITERALS"),

	/**
	 * The '<em><b>DISCOVERSCHEMAROWSETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSCHEMAROWSETS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERSCHEMAROWSETS(16, "DISCOVERSCHEMAROWSETS", "DISCOVER_SCHEMA_ROWSETS"),

	/**
	 * The '<em><b>DISCOVERKEYWORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERKEYWORDS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERKEYWORDS(17, "DISCOVERKEYWORDS", "DISCOVER_KEYWORDS"),

	/**
	 * The '<em><b>DBSCHEMATABLES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMATABLES_VALUE
	 * @generated
	 * @ordered
	 */
	DBSCHEMATABLES(18, "DBSCHEMATABLES", "DBSCHEMA_TABLES"),

	/**
	 * The '<em><b>DBSCHEMACOLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMACOLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	DBSCHEMACOLUMNS(19, "DBSCHEMACOLUMNS", "DBSCHEMA_COLUMNS"),

	/**
	 * The '<em><b>DBSCHEMAPROVIDERTYPES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMAPROVIDERTYPES_VALUE
	 * @generated
	 * @ordered
	 */
	DBSCHEMAPROVIDERTYPES(20, "DBSCHEMAPROVIDERTYPES", "DBSCHEMA_PROVIDER_TYPES"),

	/**
	 * The '<em><b>MDSCHEMAINPUTDATASOURCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAINPUTDATASOURCES_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAINPUTDATASOURCES(21, "MDSCHEMAINPUTDATASOURCES", "MDSCHEMA_INPUT_DATASOURCES"),

	/**
	 * The '<em><b>DMSCHEMAMININGSERVICES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSERVICES_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGSERVICES(22, "DMSCHEMAMININGSERVICES", "DMSCHEMA_MINING_SERVICES"),

	/**
	 * The '<em><b>DMSCHEMAMININGSERVICEPARAMETERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSERVICEPARAMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGSERVICEPARAMETERS(23, "DMSCHEMAMININGSERVICEPARAMETERS", "DMSCHEMA_MINING_SERVICE_PARAMETERS"),

	/**
	 * The '<em><b>DMSCHEMAMININGFUNCTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGFUNCTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGFUNCTIONS(24, "DMSCHEMAMININGFUNCTIONS", "DMSCHEMA_MINING_FUNCTIONS"),

	/**
	 * The '<em><b>DMSCHEMAMININGMODELCONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELCONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGMODELCONTENT(25, "DMSCHEMAMININGMODELCONTENT", "DMSCHEMA_MINING_MODEL_CONTENT"),

	/**
	 * The '<em><b>DMSCHEMAMININGMODELXML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELXML_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGMODELXML(26, "DMSCHEMAMININGMODELXML", "DMSCHEMA_MINING_MODEL_XML"),

	/**
	 * The '<em><b>DMSCHEMAMININGMODELCONTENTPMML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELCONTENTPMML_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGMODELCONTENTPMML(27, "DMSCHEMAMININGMODELCONTENTPMML", "DMSCHEMA_MINING_MODEL_CONTENT_PMML"),

	/**
	 * The '<em><b>DMSCHEMAMININGMODELS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELS_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGMODELS(28, "DMSCHEMAMININGMODELS", "DMSCHEMA_MINING_MODELS"),

	/**
	 * The '<em><b>DMSCHEMAMININGCOLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGCOLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGCOLUMNS(29, "DMSCHEMAMININGCOLUMNS", "DMSCHEMA_MINING_COLUMNS"),

	/**
	 * The '<em><b>DMSCHEMAMININGSTRUCTURES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSTRUCTURES_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGSTRUCTURES(30, "DMSCHEMAMININGSTRUCTURES", "DMSCHEMA_MINING_STRUCTURES"),

	/**
	 * The '<em><b>DMSCHEMAMININGSTRUCTURECOLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSTRUCTURECOLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	DMSCHEMAMININGSTRUCTURECOLUMNS(31, "DMSCHEMAMININGSTRUCTURECOLUMNS", "DMSCHEMA_MINING_STRUCTURE_COLUMNS"),

	/**
	 * The '<em><b>DISCOVERDATASOURCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDATASOURCES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERDATASOURCES(32, "DISCOVERDATASOURCES", "DISCOVER_DATASOURCES"),

	/**
	 * The '<em><b>DISCOVERENUMERATORS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERENUMERATORS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERENUMERATORS(33, "DISCOVERENUMERATORS", "DISCOVER_ENUMERATORS"),

	/**
	 * The '<em><b>DISCOVERXMLMETADATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXMLMETADATA_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXMLMETADATA(34, "DISCOVERXMLMETADATA", "DISCOVER_XML_METADATA"),

	/**
	 * The '<em><b>DISCOVERTRACES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERTRACES(35, "DISCOVERTRACES", "DISCOVER_TRACES"),

	/**
	 * The '<em><b>DISCOVERTRACEDEFINITIONPROVIDERINFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACEDEFINITIONPROVIDERINFO_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERTRACEDEFINITIONPROVIDERINFO(36, "DISCOVERTRACEDEFINITIONPROVIDERINFO", "DISCOVER_TRACE_DEFINITION_PROVIDERINFO"),

	/**
	 * The '<em><b>DISCOVERTRACECOLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACECOLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERTRACECOLUMNS(37, "DISCOVERTRACECOLUMNS", "DISCOVER_TRACE_COLUMNS"),

	/**
	 * The '<em><b>DISCOVERTRACEEVENTCATEGORIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACEEVENTCATEGORIES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERTRACEEVENTCATEGORIES(38, "DISCOVERTRACEEVENTCATEGORIES", "DISCOVER_TRACE_EVENT_CATEGORIES"),

	/**
	 * The '<em><b>DISCOVERMEMORYUSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMEMORYUSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERMEMORYUSAGE(39, "DISCOVERMEMORYUSAGE", "DISCOVER_MEMORYUSAGE"),

	/**
	 * The '<em><b>DISCOVERMEMORYGRANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMEMORYGRANT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERMEMORYGRANT(40, "DISCOVERMEMORYGRANT", "DISCOVER_MEMORYGRANT"),

	/**
	 * The '<em><b>DISCOVERLOCKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERLOCKS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERLOCKS(41, "DISCOVERLOCKS", "DISCOVER_LOCKS"),

	/**
	 * The '<em><b>DISCOVERCONNECTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCONNECTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERCONNECTIONS(42, "DISCOVERCONNECTIONS", "DISCOVER_CONNECTIONS"),

	/**
	 * The '<em><b>DISCOVERSESSIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSESSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERSESSIONS(43, "DISCOVERSESSIONS", "DISCOVER_SESSIONS"),

	/**
	 * The '<em><b>DISCOVERJOBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERJOBS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERJOBS(44, "DISCOVERJOBS", "DISCOVER_JOBS"),

	/**
	 * The '<em><b>DISCOVERTRANSACTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRANSACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERTRANSACTIONS(45, "DISCOVERTRANSACTIONS", "DISCOVER_TRANSACTIONS"),

	/**
	 * The '<em><b>DISCOVERDBCONNECTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDBCONNECTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERDBCONNECTIONS(46, "DISCOVERDBCONNECTIONS", "DISCOVER_DB_CONNECTIONS"),

	/**
	 * The '<em><b>DISCOVERMASTERKEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMASTERKEY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERMASTERKEY(47, "DISCOVERMASTERKEY", "DISCOVER_MASTER_KEY"),

	/**
	 * The '<em><b>DISCOVERPERFORMANCECOUNTERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPERFORMANCECOUNTERS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERPERFORMANCECOUNTERS(48, "DISCOVERPERFORMANCECOUNTERS", "DISCOVER_PERFORMANCE_COUNTERS"),

	/**
	 * The '<em><b>DISCOVERLOCATIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERLOCATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERLOCATIONS(49, "DISCOVERLOCATIONS", "DISCOVER_LOCATIONS"),

	/**
	 * The '<em><b>DISCOVERPARTITIONDIMENSIONSTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPARTITIONDIMENSIONSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERPARTITIONDIMENSIONSTAT(50, "DISCOVERPARTITIONDIMENSIONSTAT", "DISCOVER_PARTITION_DIMENSION_STAT"),

	/**
	 * The '<em><b>DISCOVERPARTITIONSTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPARTITIONSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERPARTITIONSTAT(51, "DISCOVERPARTITIONSTAT", "DISCOVER_PARTITION_STAT"),

	/**
	 * The '<em><b>DISCOVERDIMENSIONSTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDIMENSIONSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERDIMENSIONSTAT(52, "DISCOVERDIMENSIONSTAT", "DISCOVER_DIMENSION_STAT"),

	/**
	 * The '<em><b>DISCOVERCOMMANDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCOMMANDS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERCOMMANDS(53, "DISCOVERCOMMANDS", "DISCOVER_COMMANDS"),

	/**
	 * The '<em><b>DISCOVERCOMMANDOBJECTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCOMMANDOBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERCOMMANDOBJECTS(54, "DISCOVERCOMMANDOBJECTS", "DISCOVER_COMMAND_OBJECTS"),

	/**
	 * The '<em><b>DISCOVEROBJECTACTIVITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVEROBJECTACTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVEROBJECTACTIVITY(55, "DISCOVEROBJECTACTIVITY", "DISCOVER_OBJECT_ACTIVITY"),

	/**
	 * The '<em><b>DISCOVEROBJECTMEMORYUSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVEROBJECTMEMORYUSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVEROBJECTMEMORYUSAGE(56, "DISCOVEROBJECTMEMORYUSAGE", "DISCOVER_OBJECT_MEMORY_USAGE"),

	/**
	 * The '<em><b>DISCOVERSTORAGETABLES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSTORAGETABLES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERSTORAGETABLES(57, "DISCOVERSTORAGETABLES", "DISCOVER_STORAGE_TABLES"),

	/**
	 * The '<em><b>DISCOVERSTORAGETABLECOLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSTORAGETABLECOLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERSTORAGETABLECOLUMNS(58, "DISCOVERSTORAGETABLECOLUMNS", "DISCOVER_STORAGE_TABLE_COLUMNS"),

	/**
	 * The '<em><b>DISCOVERSTORAGETABLECOLUMNSEGMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSTORAGETABLECOLUMNSEGMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERSTORAGETABLECOLUMNSEGMENTS(59, "DISCOVERSTORAGETABLECOLUMNSEGMENTS", "DISCOVER_STORAGE_TABLE_COLUMN_SEGMENTS"),

	/**
	 * The '<em><b>DISCOVERCSDLMETADATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCSDLMETADATA_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERCSDLMETADATA(60, "DISCOVERCSDLMETADATA", "DISCOVER_CSDL_METADATA"),

	/**
	 * The '<em><b>DISCOVERCALCDEPENDENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCALCDEPENDENCY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERCALCDEPENDENCY(61, "DISCOVERCALCDEPENDENCY", "DISCOVER_CALC_DEPENDENCY"),

	/**
	 * The '<em><b>MDSCHEMAFUNCTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAFUNCTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	MDSCHEMAFUNCTIONS(62, "MDSCHEMAFUNCTIONS", "MDSCHEMA_FUNCTIONS"),

	/**
	 * The '<em><b>DISCOVERRINGBUFFERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERRINGBUFFERS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERRINGBUFFERS(63, "DISCOVERRINGBUFFERS", "DISCOVER_RING_BUFFERS"),

	/**
	 * The '<em><b>DISCOVERXEVENTTRACEDEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTTRACEDEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXEVENTTRACEDEFINITION(64, "DISCOVERXEVENTTRACEDEFINITION", "DISCOVER_XEVENT_TRACE_DEFINITION"),

	/**
	 * The '<em><b>DISCOVERXEVENTPACKAGES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTPACKAGES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXEVENTPACKAGES(65, "DISCOVERXEVENTPACKAGES", "DISCOVER_XEVENT_PACKAGES"),

	/**
	 * The '<em><b>DISCOVERXEVENTOBJECTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTOBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXEVENTOBJECTS(66, "DISCOVERXEVENTOBJECTS", "DISCOVER_XEVENT_OBJECTS"),

	/**
	 * The '<em><b>DISCOVERXEVENTOBJECTCOLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTOBJECTCOLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXEVENTOBJECTCOLUMNS(67, "DISCOVERXEVENTOBJECTCOLUMNS", "DISCOVER_XEVENT_OBJECT_COLUMNS"),

	/**
	 * The '<em><b>DISCOVERXEVENTSESSIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTSESSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXEVENTSESSIONS(68, "DISCOVERXEVENTSESSIONS", "DISCOVER_XEVENT_SESSIONS"),

	/**
	 * The '<em><b>DISCOVERXEVENTSESSIONTARGETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTSESSIONTARGETS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERXEVENTSESSIONTARGETS(69, "DISCOVERXEVENTSESSIONTARGETS", "DISCOVER_XEVENT_SESSION_TARGETS"),

	/**
	 * The '<em><b>DISCOVERMEMSTATS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMEMSTATS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERMEMSTATS(70, "DISCOVERMEMSTATS", "DISCOVER_MEM_STATS"),

	/**
	 * The '<em><b>DISCOVERDBMEMSTATS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDBMEMSTATS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERDBMEMSTATS(71, "DISCOVERDBMEMSTATS", "DISCOVER_DB_MEM_STATS"),

	/**
	 * The '<em><b>DISCOVEROBJECTCOUNTERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVEROBJECTCOUNTERS_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVEROBJECTCOUNTERS(72, "DISCOVEROBJECTCOUNTERS", "DISCOVER_OBJECT_COUNTERS");

	/**
	 * The '<em><b>DBSCHEMACATALOGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMACATALOGS
	 * @model literal="DBSCHEMA_CATALOGS"
	 * @generated
	 * @ordered
	 */
	public static final int DBSCHEMACATALOGS_VALUE = 0;

	/**
	 * The '<em><b>MDSCHEMACUBES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMACUBES
	 * @model literal="MDSCHEMA_CUBES"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMACUBES_VALUE = 1;

	/**
	 * The '<em><b>MDSCHEMADIMENSIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMADIMENSIONS
	 * @model literal="MDSCHEMA_DIMENSIONS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMADIMENSIONS_VALUE = 2;

	/**
	 * The '<em><b>MDSCHEMAHIERARCHIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAHIERARCHIES
	 * @model literal="MDSCHEMA_HIERARCHIES"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAHIERARCHIES_VALUE = 3;

	/**
	 * The '<em><b>MDSCHEMALEVELS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMALEVELS
	 * @model literal="MDSCHEMA_LEVELS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMALEVELS_VALUE = 4;

	/**
	 * The '<em><b>MDSCHEMAMEASURES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEASURES
	 * @model literal="MDSCHEMA_MEASURES"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAMEASURES_VALUE = 5;

	/**
	 * The '<em><b>MDSCHEMAPROPERTIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAPROPERTIES
	 * @model literal="MDSCHEMA_PROPERTIES"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAPROPERTIES_VALUE = 6;

	/**
	 * The '<em><b>MDSCHEMAMEMBERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEMBERS
	 * @model literal="MDSCHEMA_MEMBERS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAMEMBERS_VALUE = 7;

	/**
	 * The '<em><b>MDSCHEMAACTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAACTIONS
	 * @model literal="MDSCHEMA_ACTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAACTIONS_VALUE = 8;

	/**
	 * The '<em><b>MDSCHEMASETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMASETS
	 * @model literal="MDSCHEMA_SETS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMASETS_VALUE = 9;

	/**
	 * The '<em><b>DISCOVERINSTANCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERINSTANCES
	 * @model literal="DISCOVER_INSTANCES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERINSTANCES_VALUE = 10;

	/**
	 * The '<em><b>MDSCHEMAKPIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAKPIS
	 * @model literal="MDSCHEMA_KPIS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAKPIS_VALUE = 11;

	/**
	 * The '<em><b>MDSCHEMAMEASUREGROUPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEASUREGROUPS
	 * @model literal="MDSCHEMA_MEASUREGROUPS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAMEASUREGROUPS_VALUE = 12;

	/**
	 * The '<em><b>MDSCHEMAMEASUREGROUPDIMENSIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAMEASUREGROUPDIMENSIONS
	 * @model literal="MDSCHEMA_MEASUREGROUP_DIMENSIONS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAMEASUREGROUPDIMENSIONS_VALUE = 13;

	/**
	 * The '<em><b>DISCOVERPROPERTIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPROPERTIES
	 * @model literal="DISCOVER_PROPERTIES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERPROPERTIES_VALUE = 14;

	/**
	 * The '<em><b>DISCOVERLITERALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERLITERALS
	 * @model literal="DISCOVER_LITERALS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERLITERALS_VALUE = 15;

	/**
	 * The '<em><b>DISCOVERSCHEMAROWSETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSCHEMAROWSETS
	 * @model literal="DISCOVER_SCHEMA_ROWSETS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERSCHEMAROWSETS_VALUE = 16;

	/**
	 * The '<em><b>DISCOVERKEYWORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERKEYWORDS
	 * @model literal="DISCOVER_KEYWORDS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERKEYWORDS_VALUE = 17;

	/**
	 * The '<em><b>DBSCHEMATABLES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMATABLES
	 * @model literal="DBSCHEMA_TABLES"
	 * @generated
	 * @ordered
	 */
	public static final int DBSCHEMATABLES_VALUE = 18;

	/**
	 * The '<em><b>DBSCHEMACOLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMACOLUMNS
	 * @model literal="DBSCHEMA_COLUMNS"
	 * @generated
	 * @ordered
	 */
	public static final int DBSCHEMACOLUMNS_VALUE = 19;

	/**
	 * The '<em><b>DBSCHEMAPROVIDERTYPES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBSCHEMAPROVIDERTYPES
	 * @model literal="DBSCHEMA_PROVIDER_TYPES"
	 * @generated
	 * @ordered
	 */
	public static final int DBSCHEMAPROVIDERTYPES_VALUE = 20;

	/**
	 * The '<em><b>MDSCHEMAINPUTDATASOURCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAINPUTDATASOURCES
	 * @model literal="MDSCHEMA_INPUT_DATASOURCES"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAINPUTDATASOURCES_VALUE = 21;

	/**
	 * The '<em><b>DMSCHEMAMININGSERVICES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSERVICES
	 * @model literal="DMSCHEMA_MINING_SERVICES"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGSERVICES_VALUE = 22;

	/**
	 * The '<em><b>DMSCHEMAMININGSERVICEPARAMETERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSERVICEPARAMETERS
	 * @model literal="DMSCHEMA_MINING_SERVICE_PARAMETERS"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGSERVICEPARAMETERS_VALUE = 23;

	/**
	 * The '<em><b>DMSCHEMAMININGFUNCTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGFUNCTIONS
	 * @model literal="DMSCHEMA_MINING_FUNCTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGFUNCTIONS_VALUE = 24;

	/**
	 * The '<em><b>DMSCHEMAMININGMODELCONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELCONTENT
	 * @model literal="DMSCHEMA_MINING_MODEL_CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGMODELCONTENT_VALUE = 25;

	/**
	 * The '<em><b>DMSCHEMAMININGMODELXML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELXML
	 * @model literal="DMSCHEMA_MINING_MODEL_XML"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGMODELXML_VALUE = 26;

	/**
	 * The '<em><b>DMSCHEMAMININGMODELCONTENTPMML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELCONTENTPMML
	 * @model literal="DMSCHEMA_MINING_MODEL_CONTENT_PMML"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGMODELCONTENTPMML_VALUE = 27;

	/**
	 * The '<em><b>DMSCHEMAMININGMODELS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGMODELS
	 * @model literal="DMSCHEMA_MINING_MODELS"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGMODELS_VALUE = 28;

	/**
	 * The '<em><b>DMSCHEMAMININGCOLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGCOLUMNS
	 * @model literal="DMSCHEMA_MINING_COLUMNS"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGCOLUMNS_VALUE = 29;

	/**
	 * The '<em><b>DMSCHEMAMININGSTRUCTURES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSTRUCTURES
	 * @model literal="DMSCHEMA_MINING_STRUCTURES"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGSTRUCTURES_VALUE = 30;

	/**
	 * The '<em><b>DMSCHEMAMININGSTRUCTURECOLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMSCHEMAMININGSTRUCTURECOLUMNS
	 * @model literal="DMSCHEMA_MINING_STRUCTURE_COLUMNS"
	 * @generated
	 * @ordered
	 */
	public static final int DMSCHEMAMININGSTRUCTURECOLUMNS_VALUE = 31;

	/**
	 * The '<em><b>DISCOVERDATASOURCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDATASOURCES
	 * @model literal="DISCOVER_DATASOURCES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERDATASOURCES_VALUE = 32;

	/**
	 * The '<em><b>DISCOVERENUMERATORS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERENUMERATORS
	 * @model literal="DISCOVER_ENUMERATORS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERENUMERATORS_VALUE = 33;

	/**
	 * The '<em><b>DISCOVERXMLMETADATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXMLMETADATA
	 * @model literal="DISCOVER_XML_METADATA"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXMLMETADATA_VALUE = 34;

	/**
	 * The '<em><b>DISCOVERTRACES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACES
	 * @model literal="DISCOVER_TRACES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERTRACES_VALUE = 35;

	/**
	 * The '<em><b>DISCOVERTRACEDEFINITIONPROVIDERINFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACEDEFINITIONPROVIDERINFO
	 * @model literal="DISCOVER_TRACE_DEFINITION_PROVIDERINFO"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERTRACEDEFINITIONPROVIDERINFO_VALUE = 36;

	/**
	 * The '<em><b>DISCOVERTRACECOLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACECOLUMNS
	 * @model literal="DISCOVER_TRACE_COLUMNS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERTRACECOLUMNS_VALUE = 37;

	/**
	 * The '<em><b>DISCOVERTRACEEVENTCATEGORIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRACEEVENTCATEGORIES
	 * @model literal="DISCOVER_TRACE_EVENT_CATEGORIES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERTRACEEVENTCATEGORIES_VALUE = 38;

	/**
	 * The '<em><b>DISCOVERMEMORYUSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMEMORYUSAGE
	 * @model literal="DISCOVER_MEMORYUSAGE"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERMEMORYUSAGE_VALUE = 39;

	/**
	 * The '<em><b>DISCOVERMEMORYGRANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMEMORYGRANT
	 * @model literal="DISCOVER_MEMORYGRANT"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERMEMORYGRANT_VALUE = 40;

	/**
	 * The '<em><b>DISCOVERLOCKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERLOCKS
	 * @model literal="DISCOVER_LOCKS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERLOCKS_VALUE = 41;

	/**
	 * The '<em><b>DISCOVERCONNECTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCONNECTIONS
	 * @model literal="DISCOVER_CONNECTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERCONNECTIONS_VALUE = 42;

	/**
	 * The '<em><b>DISCOVERSESSIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSESSIONS
	 * @model literal="DISCOVER_SESSIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERSESSIONS_VALUE = 43;

	/**
	 * The '<em><b>DISCOVERJOBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERJOBS
	 * @model literal="DISCOVER_JOBS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERJOBS_VALUE = 44;

	/**
	 * The '<em><b>DISCOVERTRANSACTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERTRANSACTIONS
	 * @model literal="DISCOVER_TRANSACTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERTRANSACTIONS_VALUE = 45;

	/**
	 * The '<em><b>DISCOVERDBCONNECTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDBCONNECTIONS
	 * @model literal="DISCOVER_DB_CONNECTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERDBCONNECTIONS_VALUE = 46;

	/**
	 * The '<em><b>DISCOVERMASTERKEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMASTERKEY
	 * @model literal="DISCOVER_MASTER_KEY"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERMASTERKEY_VALUE = 47;

	/**
	 * The '<em><b>DISCOVERPERFORMANCECOUNTERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPERFORMANCECOUNTERS
	 * @model literal="DISCOVER_PERFORMANCE_COUNTERS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERPERFORMANCECOUNTERS_VALUE = 48;

	/**
	 * The '<em><b>DISCOVERLOCATIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERLOCATIONS
	 * @model literal="DISCOVER_LOCATIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERLOCATIONS_VALUE = 49;

	/**
	 * The '<em><b>DISCOVERPARTITIONDIMENSIONSTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPARTITIONDIMENSIONSTAT
	 * @model literal="DISCOVER_PARTITION_DIMENSION_STAT"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERPARTITIONDIMENSIONSTAT_VALUE = 50;

	/**
	 * The '<em><b>DISCOVERPARTITIONSTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERPARTITIONSTAT
	 * @model literal="DISCOVER_PARTITION_STAT"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERPARTITIONSTAT_VALUE = 51;

	/**
	 * The '<em><b>DISCOVERDIMENSIONSTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDIMENSIONSTAT
	 * @model literal="DISCOVER_DIMENSION_STAT"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERDIMENSIONSTAT_VALUE = 52;

	/**
	 * The '<em><b>DISCOVERCOMMANDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCOMMANDS
	 * @model literal="DISCOVER_COMMANDS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERCOMMANDS_VALUE = 53;

	/**
	 * The '<em><b>DISCOVERCOMMANDOBJECTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCOMMANDOBJECTS
	 * @model literal="DISCOVER_COMMAND_OBJECTS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERCOMMANDOBJECTS_VALUE = 54;

	/**
	 * The '<em><b>DISCOVEROBJECTACTIVITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVEROBJECTACTIVITY
	 * @model literal="DISCOVER_OBJECT_ACTIVITY"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVEROBJECTACTIVITY_VALUE = 55;

	/**
	 * The '<em><b>DISCOVEROBJECTMEMORYUSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVEROBJECTMEMORYUSAGE
	 * @model literal="DISCOVER_OBJECT_MEMORY_USAGE"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVEROBJECTMEMORYUSAGE_VALUE = 56;

	/**
	 * The '<em><b>DISCOVERSTORAGETABLES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSTORAGETABLES
	 * @model literal="DISCOVER_STORAGE_TABLES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERSTORAGETABLES_VALUE = 57;

	/**
	 * The '<em><b>DISCOVERSTORAGETABLECOLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSTORAGETABLECOLUMNS
	 * @model literal="DISCOVER_STORAGE_TABLE_COLUMNS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERSTORAGETABLECOLUMNS_VALUE = 58;

	/**
	 * The '<em><b>DISCOVERSTORAGETABLECOLUMNSEGMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERSTORAGETABLECOLUMNSEGMENTS
	 * @model literal="DISCOVER_STORAGE_TABLE_COLUMN_SEGMENTS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERSTORAGETABLECOLUMNSEGMENTS_VALUE = 59;

	/**
	 * The '<em><b>DISCOVERCSDLMETADATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCSDLMETADATA
	 * @model literal="DISCOVER_CSDL_METADATA"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERCSDLMETADATA_VALUE = 60;

	/**
	 * The '<em><b>DISCOVERCALCDEPENDENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERCALCDEPENDENCY
	 * @model literal="DISCOVER_CALC_DEPENDENCY"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERCALCDEPENDENCY_VALUE = 61;

	/**
	 * The '<em><b>MDSCHEMAFUNCTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDSCHEMAFUNCTIONS
	 * @model literal="MDSCHEMA_FUNCTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int MDSCHEMAFUNCTIONS_VALUE = 62;

	/**
	 * The '<em><b>DISCOVERRINGBUFFERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERRINGBUFFERS
	 * @model literal="DISCOVER_RING_BUFFERS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERRINGBUFFERS_VALUE = 63;

	/**
	 * The '<em><b>DISCOVERXEVENTTRACEDEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTTRACEDEFINITION
	 * @model literal="DISCOVER_XEVENT_TRACE_DEFINITION"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXEVENTTRACEDEFINITION_VALUE = 64;

	/**
	 * The '<em><b>DISCOVERXEVENTPACKAGES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTPACKAGES
	 * @model literal="DISCOVER_XEVENT_PACKAGES"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXEVENTPACKAGES_VALUE = 65;

	/**
	 * The '<em><b>DISCOVERXEVENTOBJECTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTOBJECTS
	 * @model literal="DISCOVER_XEVENT_OBJECTS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXEVENTOBJECTS_VALUE = 66;

	/**
	 * The '<em><b>DISCOVERXEVENTOBJECTCOLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTOBJECTCOLUMNS
	 * @model literal="DISCOVER_XEVENT_OBJECT_COLUMNS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXEVENTOBJECTCOLUMNS_VALUE = 67;

	/**
	 * The '<em><b>DISCOVERXEVENTSESSIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTSESSIONS
	 * @model literal="DISCOVER_XEVENT_SESSIONS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXEVENTSESSIONS_VALUE = 68;

	/**
	 * The '<em><b>DISCOVERXEVENTSESSIONTARGETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERXEVENTSESSIONTARGETS
	 * @model literal="DISCOVER_XEVENT_SESSION_TARGETS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERXEVENTSESSIONTARGETS_VALUE = 69;

	/**
	 * The '<em><b>DISCOVERMEMSTATS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERMEMSTATS
	 * @model literal="DISCOVER_MEM_STATS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERMEMSTATS_VALUE = 70;

	/**
	 * The '<em><b>DISCOVERDBMEMSTATS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERDBMEMSTATS
	 * @model literal="DISCOVER_DB_MEM_STATS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERDBMEMSTATS_VALUE = 71;

	/**
	 * The '<em><b>DISCOVEROBJECTCOUNTERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVEROBJECTCOUNTERS
	 * @model literal="DISCOVER_OBJECT_COUNTERS"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVEROBJECTCOUNTERS_VALUE = 72;

	/**
	 * An array of all the '<em><b>Request</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Request[] VALUES_ARRAY =
		new Request[] {
			DBSCHEMACATALOGS,
			MDSCHEMACUBES,
			MDSCHEMADIMENSIONS,
			MDSCHEMAHIERARCHIES,
			MDSCHEMALEVELS,
			MDSCHEMAMEASURES,
			MDSCHEMAPROPERTIES,
			MDSCHEMAMEMBERS,
			MDSCHEMAACTIONS,
			MDSCHEMASETS,
			DISCOVERINSTANCES,
			MDSCHEMAKPIS,
			MDSCHEMAMEASUREGROUPS,
			MDSCHEMAMEASUREGROUPDIMENSIONS,
			DISCOVERPROPERTIES,
			DISCOVERLITERALS,
			DISCOVERSCHEMAROWSETS,
			DISCOVERKEYWORDS,
			DBSCHEMATABLES,
			DBSCHEMACOLUMNS,
			DBSCHEMAPROVIDERTYPES,
			MDSCHEMAINPUTDATASOURCES,
			DMSCHEMAMININGSERVICES,
			DMSCHEMAMININGSERVICEPARAMETERS,
			DMSCHEMAMININGFUNCTIONS,
			DMSCHEMAMININGMODELCONTENT,
			DMSCHEMAMININGMODELXML,
			DMSCHEMAMININGMODELCONTENTPMML,
			DMSCHEMAMININGMODELS,
			DMSCHEMAMININGCOLUMNS,
			DMSCHEMAMININGSTRUCTURES,
			DMSCHEMAMININGSTRUCTURECOLUMNS,
			DISCOVERDATASOURCES,
			DISCOVERENUMERATORS,
			DISCOVERXMLMETADATA,
			DISCOVERTRACES,
			DISCOVERTRACEDEFINITIONPROVIDERINFO,
			DISCOVERTRACECOLUMNS,
			DISCOVERTRACEEVENTCATEGORIES,
			DISCOVERMEMORYUSAGE,
			DISCOVERMEMORYGRANT,
			DISCOVERLOCKS,
			DISCOVERCONNECTIONS,
			DISCOVERSESSIONS,
			DISCOVERJOBS,
			DISCOVERTRANSACTIONS,
			DISCOVERDBCONNECTIONS,
			DISCOVERMASTERKEY,
			DISCOVERPERFORMANCECOUNTERS,
			DISCOVERLOCATIONS,
			DISCOVERPARTITIONDIMENSIONSTAT,
			DISCOVERPARTITIONSTAT,
			DISCOVERDIMENSIONSTAT,
			DISCOVERCOMMANDS,
			DISCOVERCOMMANDOBJECTS,
			DISCOVEROBJECTACTIVITY,
			DISCOVEROBJECTMEMORYUSAGE,
			DISCOVERSTORAGETABLES,
			DISCOVERSTORAGETABLECOLUMNS,
			DISCOVERSTORAGETABLECOLUMNSEGMENTS,
			DISCOVERCSDLMETADATA,
			DISCOVERCALCDEPENDENCY,
			MDSCHEMAFUNCTIONS,
			DISCOVERRINGBUFFERS,
			DISCOVERXEVENTTRACEDEFINITION,
			DISCOVERXEVENTPACKAGES,
			DISCOVERXEVENTOBJECTS,
			DISCOVERXEVENTOBJECTCOLUMNS,
			DISCOVERXEVENTSESSIONS,
			DISCOVERXEVENTSESSIONTARGETS,
			DISCOVERMEMSTATS,
			DISCOVERDBMEMSTATS,
			DISCOVEROBJECTCOUNTERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Request</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Request> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Request</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Request get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Request result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Request getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Request result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Request get(int value) {
		switch (value) {
			case DBSCHEMACATALOGS_VALUE: return DBSCHEMACATALOGS;
			case MDSCHEMACUBES_VALUE: return MDSCHEMACUBES;
			case MDSCHEMADIMENSIONS_VALUE: return MDSCHEMADIMENSIONS;
			case MDSCHEMAHIERARCHIES_VALUE: return MDSCHEMAHIERARCHIES;
			case MDSCHEMALEVELS_VALUE: return MDSCHEMALEVELS;
			case MDSCHEMAMEASURES_VALUE: return MDSCHEMAMEASURES;
			case MDSCHEMAPROPERTIES_VALUE: return MDSCHEMAPROPERTIES;
			case MDSCHEMAMEMBERS_VALUE: return MDSCHEMAMEMBERS;
			case MDSCHEMAACTIONS_VALUE: return MDSCHEMAACTIONS;
			case MDSCHEMASETS_VALUE: return MDSCHEMASETS;
			case DISCOVERINSTANCES_VALUE: return DISCOVERINSTANCES;
			case MDSCHEMAKPIS_VALUE: return MDSCHEMAKPIS;
			case MDSCHEMAMEASUREGROUPS_VALUE: return MDSCHEMAMEASUREGROUPS;
			case MDSCHEMAMEASUREGROUPDIMENSIONS_VALUE: return MDSCHEMAMEASUREGROUPDIMENSIONS;
			case DISCOVERPROPERTIES_VALUE: return DISCOVERPROPERTIES;
			case DISCOVERLITERALS_VALUE: return DISCOVERLITERALS;
			case DISCOVERSCHEMAROWSETS_VALUE: return DISCOVERSCHEMAROWSETS;
			case DISCOVERKEYWORDS_VALUE: return DISCOVERKEYWORDS;
			case DBSCHEMATABLES_VALUE: return DBSCHEMATABLES;
			case DBSCHEMACOLUMNS_VALUE: return DBSCHEMACOLUMNS;
			case DBSCHEMAPROVIDERTYPES_VALUE: return DBSCHEMAPROVIDERTYPES;
			case MDSCHEMAINPUTDATASOURCES_VALUE: return MDSCHEMAINPUTDATASOURCES;
			case DMSCHEMAMININGSERVICES_VALUE: return DMSCHEMAMININGSERVICES;
			case DMSCHEMAMININGSERVICEPARAMETERS_VALUE: return DMSCHEMAMININGSERVICEPARAMETERS;
			case DMSCHEMAMININGFUNCTIONS_VALUE: return DMSCHEMAMININGFUNCTIONS;
			case DMSCHEMAMININGMODELCONTENT_VALUE: return DMSCHEMAMININGMODELCONTENT;
			case DMSCHEMAMININGMODELXML_VALUE: return DMSCHEMAMININGMODELXML;
			case DMSCHEMAMININGMODELCONTENTPMML_VALUE: return DMSCHEMAMININGMODELCONTENTPMML;
			case DMSCHEMAMININGMODELS_VALUE: return DMSCHEMAMININGMODELS;
			case DMSCHEMAMININGCOLUMNS_VALUE: return DMSCHEMAMININGCOLUMNS;
			case DMSCHEMAMININGSTRUCTURES_VALUE: return DMSCHEMAMININGSTRUCTURES;
			case DMSCHEMAMININGSTRUCTURECOLUMNS_VALUE: return DMSCHEMAMININGSTRUCTURECOLUMNS;
			case DISCOVERDATASOURCES_VALUE: return DISCOVERDATASOURCES;
			case DISCOVERENUMERATORS_VALUE: return DISCOVERENUMERATORS;
			case DISCOVERXMLMETADATA_VALUE: return DISCOVERXMLMETADATA;
			case DISCOVERTRACES_VALUE: return DISCOVERTRACES;
			case DISCOVERTRACEDEFINITIONPROVIDERINFO_VALUE: return DISCOVERTRACEDEFINITIONPROVIDERINFO;
			case DISCOVERTRACECOLUMNS_VALUE: return DISCOVERTRACECOLUMNS;
			case DISCOVERTRACEEVENTCATEGORIES_VALUE: return DISCOVERTRACEEVENTCATEGORIES;
			case DISCOVERMEMORYUSAGE_VALUE: return DISCOVERMEMORYUSAGE;
			case DISCOVERMEMORYGRANT_VALUE: return DISCOVERMEMORYGRANT;
			case DISCOVERLOCKS_VALUE: return DISCOVERLOCKS;
			case DISCOVERCONNECTIONS_VALUE: return DISCOVERCONNECTIONS;
			case DISCOVERSESSIONS_VALUE: return DISCOVERSESSIONS;
			case DISCOVERJOBS_VALUE: return DISCOVERJOBS;
			case DISCOVERTRANSACTIONS_VALUE: return DISCOVERTRANSACTIONS;
			case DISCOVERDBCONNECTIONS_VALUE: return DISCOVERDBCONNECTIONS;
			case DISCOVERMASTERKEY_VALUE: return DISCOVERMASTERKEY;
			case DISCOVERPERFORMANCECOUNTERS_VALUE: return DISCOVERPERFORMANCECOUNTERS;
			case DISCOVERLOCATIONS_VALUE: return DISCOVERLOCATIONS;
			case DISCOVERPARTITIONDIMENSIONSTAT_VALUE: return DISCOVERPARTITIONDIMENSIONSTAT;
			case DISCOVERPARTITIONSTAT_VALUE: return DISCOVERPARTITIONSTAT;
			case DISCOVERDIMENSIONSTAT_VALUE: return DISCOVERDIMENSIONSTAT;
			case DISCOVERCOMMANDS_VALUE: return DISCOVERCOMMANDS;
			case DISCOVERCOMMANDOBJECTS_VALUE: return DISCOVERCOMMANDOBJECTS;
			case DISCOVEROBJECTACTIVITY_VALUE: return DISCOVEROBJECTACTIVITY;
			case DISCOVEROBJECTMEMORYUSAGE_VALUE: return DISCOVEROBJECTMEMORYUSAGE;
			case DISCOVERSTORAGETABLES_VALUE: return DISCOVERSTORAGETABLES;
			case DISCOVERSTORAGETABLECOLUMNS_VALUE: return DISCOVERSTORAGETABLECOLUMNS;
			case DISCOVERSTORAGETABLECOLUMNSEGMENTS_VALUE: return DISCOVERSTORAGETABLECOLUMNSEGMENTS;
			case DISCOVERCSDLMETADATA_VALUE: return DISCOVERCSDLMETADATA;
			case DISCOVERCALCDEPENDENCY_VALUE: return DISCOVERCALCDEPENDENCY;
			case MDSCHEMAFUNCTIONS_VALUE: return MDSCHEMAFUNCTIONS;
			case DISCOVERRINGBUFFERS_VALUE: return DISCOVERRINGBUFFERS;
			case DISCOVERXEVENTTRACEDEFINITION_VALUE: return DISCOVERXEVENTTRACEDEFINITION;
			case DISCOVERXEVENTPACKAGES_VALUE: return DISCOVERXEVENTPACKAGES;
			case DISCOVERXEVENTOBJECTS_VALUE: return DISCOVERXEVENTOBJECTS;
			case DISCOVERXEVENTOBJECTCOLUMNS_VALUE: return DISCOVERXEVENTOBJECTCOLUMNS;
			case DISCOVERXEVENTSESSIONS_VALUE: return DISCOVERXEVENTSESSIONS;
			case DISCOVERXEVENTSESSIONTARGETS_VALUE: return DISCOVERXEVENTSESSIONTARGETS;
			case DISCOVERMEMSTATS_VALUE: return DISCOVERMEMSTATS;
			case DISCOVERDBMEMSTATS_VALUE: return DISCOVERDBMEMSTATS;
			case DISCOVEROBJECTCOUNTERS_VALUE: return DISCOVEROBJECTCOUNTERS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Request(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Request
