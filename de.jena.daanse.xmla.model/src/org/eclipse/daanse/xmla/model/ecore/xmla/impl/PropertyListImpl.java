/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormat;
import org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocation;
import org.eclipse.daanse.xmla.model.ecore.xmla.Content;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehavior;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExists;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlags;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibility;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueries;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollation;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailable;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehavior;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehavior;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCase;
import org.eclipse.daanse.xmla.model.ecore.xmla.Dialect;
import org.eclipse.daanse.xmla.model.ecore.xmla.Format;
import org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupport;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdate;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupport;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressions;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowset;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicer;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProviderType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncoding;
import org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptions;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValue;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateSupport;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevel;
import org.eclipse.daanse.xmla.model.ecore.xmla.VisualMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDataSourceInfo <em>Data Source Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getLocaleIdentifier <em>Locale Identifier</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getStateSupport <em>State Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getAxisFormat <em>Axis Format</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getBeginRange <em>Begin Range</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getEndRange <em>End Range</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMDXSupport <em>MDX Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getProviderVersion <em>Provider Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDBMSVersion <em>DBMS Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getProviderType <em>Provider Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isShowHiddenCubes <em>Show Hidden Cubes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSQLSupport <em>SQL Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getTransactionDDL <em>Transaction DDL</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMaximumRows <em>Maximum Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getVisualMode <em>Visual Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getEffectiveRoles <em>Effective Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getEffectiveUserName <em>Effective User Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getCatalogLocation <em>Catalog Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropCatalogTerm <em>Dbprop Catalog Term</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropCatalogUsage <em>Dbprop Catalog Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropColumnDefinition <em>Dbprop Column Definition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropConcatNullBehavior <em>Dbprop Concat Null Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isDbpropDataSourceReadOnly <em>Dbprop Data Source Read Only</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropGroupBy <em>Dbprop Group By</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropHeterogeneousTables <em>Dbprop Heterogeneous Tables</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropIdentifierCase <em>Dbprop Identifier Case</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMaxIndexSize <em>Dbprop Max Index Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMaxOpenChapters <em>Dbprop Max Open Chapters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMaxRowSize <em>Dbprop Max Row Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isDbpropMaxRowSizeIncludeBlob <em>Dbprop Max Row Size Include Blob</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMaxTablesInSelect <em>Dbprop Max Tables In Select</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isDbpropMultiTableUpdate <em>Dbprop Multi Table Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropNullCollation <em>Dbprop Null Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isDbpropOrderByColumnsInSelect <em>Dbprop Order By Columns In Select</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropOutputParameterAvailable <em>Dbprop Output Parameter Available</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropPersistentIdType <em>Dbprop Persistent Id Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropPrepareAbortBehavior <em>Dbprop Prepare Abort Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropPrepareCommitBehavior <em>Dbprop Prepare Commit Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropProcedureTerm <em>Dbprop Procedure Term</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropQuotedIdentifierCase <em>Dbprop Quoted Identifier Case</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropSchemaUsage <em>Dbprop Schema Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropSqlSupport <em>Dbprop Sql Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropSubqueries <em>Dbprop Subqueries</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropSupportedTxnDdl <em>Dbprop Supported Txn Ddl</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxSubqueries <em>Mdprop Mdx Subqueries</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropSupportedTxnIsoLevels <em>Dbprop Supported Txn Iso Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropSupportedTxnIsoRetain <em>Dbprop Supported Txn Iso Retain</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropTableTerm <em>Dbprop Table Term</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropAggregateCellUpdate <em>Mdprop Aggregate Cell Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropAxes <em>Mdprop Axes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropFlatteningSupport <em>Mdprop Flattening Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxCaseSupport <em>Mdprop Mdx Case Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxDescFlags <em>Mdprop Mdx Desc Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxDrillFunctions <em>Mdprop Mdx Drill Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxFormulas <em>Mdprop Mdx Formulas</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxJoinCubes <em>Mdprop Mdx Join Cubes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxMemberFunctions <em>Mdprop Mdx Member Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxNonMeasureExpressions <em>Mdprop Mdx Non Measure Expressions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxNumericFunctions <em>Mdprop Mdx Numeric Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxObjQualification <em>Mdprop Mdx Obj Qualification</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxOuterReference <em>Mdprop Mdx Outer Reference</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isMdpropMdxQueryByProperty <em>Mdprop Mdx Query By Property</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxRangeRowset <em>Mdprop Mdx Range Rowset</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxSetFunctions <em>Mdprop Mdx Set Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxSlicer <em>Mdprop Mdx Slicer</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxStringCompop <em>Mdprop Mdx String Compop</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropNamedLevels <em>Mdprop Named Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdMDXCompatibility <em>Dbprop Msmd MDX Compatibility</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdSQLCompatibility <em>Dbprop Msmd SQL Compatibility</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdMDXUniqueNameStyle <em>Dbprop Msmd MDX Unique Name Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdCachePolicy <em>Dbprop Msmd Cache Policy</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdCacheRatio <em>Dbprop Msmd Cache Ratio</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdCacheMode <em>Dbprop Msmd Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdCompareCaseSensitiveStringFlags <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdCompareCaseNotSensitiveStringFlags <em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isDbpropMsmdFlattened2 <em>Dbprop Msmd Flattened2</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropInitMode <em>Dbprop Init Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSspropInitAppName <em>Ssprop Init App Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSspropInitWsid <em>Ssprop Init Wsid</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSspropInitPacketsize <em>Ssprop Init Packetsize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getReadOnlySession <em>Read Only Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSecuredCellValue <em>Secured Cell Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getNonEmptyThreshold <em>Non Empty Threshold</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSafetyOptions <em>Safety Options</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdCacheRatio2 <em>Dbprop Msmd Cache Ratio2</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdUseFormulaCache <em>Dbprop Msmd Use Formula Cache</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdDynamicDebugLimit <em>Dbprop Msmd Dynamic Debug Limit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdDebugMode <em>Dbprop Msmd Debug Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isImpactAnalysis <em>Impact Analysis</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getSQLQueryMode <em>SQL Query Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getClientProcessID <em>Client Process ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isReturnCellProperties <em>Return Cell Properties</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getCommitTimeout <em>Commit Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getForceCommitTimeout <em>Force Commit Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isRealTimeOlap <em>Real Time Olap</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxNamedSets <em>Mdprop Mdx Named Sets</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdSubqueries <em>Dbprop Msmd Subqueries</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdAutoExists <em>Dbprop Msmd Auto Exists</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getCustomData <em>Custom Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#isDisablePrefetchFacts <em>Disable Prefetch Facts</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getUpdateIsolationLevel <em>Update Isolation Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdErrorMessageMode <em>Dbprop Msmd Error Message Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMdpropMdxDdlExtensions <em>Mdprop Mdx Ddl Extensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getResponseEncoding <em>Response Encoding</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getMemoryLockingMode <em>Memory Locking Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdOptimizeResponse <em>Dbprop Msmd Optimize Response</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdActivityID <em>Dbprop Msmd Activity ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdRequestID <em>Dbprop Msmd Request ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getReturnAffectedObjects <em>Return Affected Objects</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getDbpropMsmdRequestMemoryLimit <em>Dbprop Msmd Request Memory Limit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PropertyListImpl#getApplicationContext <em>Application Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyListImpl extends MinimalEObjectImpl.Container implements PropertyList {
	/**
	 * The default value of the '{@link #getDataSourceInfo() <em>Data Source Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceInfo() <em>Data Source Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceInfo()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceInfo = DATA_SOURCE_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected BigInteger timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaleIdentifier() <em>Locale Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LOCALE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocaleIdentifier() <em>Locale Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected BigInteger localeIdentifier = LOCALE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateSupport() <em>State Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSupport()
	 * @generated
	 * @ordered
	 */
	protected static final StateSupport STATE_SUPPORT_EDEFAULT = StateSupport.NONE;

	/**
	 * The cached value of the '{@link #getStateSupport() <em>State Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSupport()
	 * @generated
	 * @ordered
	 */
	protected StateSupport stateSupport = STATE_SUPPORT_EDEFAULT;

	/**
	 * This is true if the State Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateSupportESet;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final Content CONTENT_EDEFAULT = Content.NONE;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Content content = CONTENT_EDEFAULT;

	/**
	 * This is true if the Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contentESet;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format FORMAT_EDEFAULT = Format.TABULAR;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected Format format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * The default value of the '{@link #getAxisFormat() <em>Axis Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisFormat()
	 * @generated
	 * @ordered
	 */
	protected static final AxisFormat AXIS_FORMAT_EDEFAULT = AxisFormat.CLUSTER_FORMAT;

	/**
	 * The cached value of the '{@link #getAxisFormat() <em>Axis Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisFormat()
	 * @generated
	 * @ordered
	 */
	protected AxisFormat axisFormat = AXIS_FORMAT_EDEFAULT;

	/**
	 * This is true if the Axis Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axisFormatESet;

	/**
	 * The default value of the '{@link #getBeginRange() <em>Begin Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginRange()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BEGIN_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginRange() <em>Begin Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginRange()
	 * @generated
	 * @ordered
	 */
	protected BigInteger beginRange = BEGIN_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndRange() <em>End Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRange()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndRange() <em>End Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRange()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endRange = END_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMDXSupport() <em>MDX Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDXSupport()
	 * @generated
	 * @ordered
	 */
	protected static final MDXSupport MDX_SUPPORT_EDEFAULT = MDXSupport.CORE;

	/**
	 * The cached value of the '{@link #getMDXSupport() <em>MDX Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDXSupport()
	 * @generated
	 * @ordered
	 */
	protected MDXSupport mDXSupport = MDX_SUPPORT_EDEFAULT;

	/**
	 * This is true if the MDX Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mDXSupportESet;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderVersion() <em>Provider Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderVersion() <em>Provider Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderVersion()
	 * @generated
	 * @ordered
	 */
	protected String providerVersion = PROVIDER_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBMSVersion() <em>DBMS Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBMSVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DBMS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDBMSVersion() <em>DBMS Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBMSVersion()
	 * @generated
	 * @ordered
	 */
	protected String dBMSVersion = DBMS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderType() <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderType()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderType PROVIDER_TYPE_EDEFAULT = ProviderType._1;

	/**
	 * The cached value of the '{@link #getProviderType() <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderType()
	 * @generated
	 * @ordered
	 */
	protected ProviderType providerType = PROVIDER_TYPE_EDEFAULT;

	/**
	 * This is true if the Provider Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providerTypeESet;

	/**
	 * The default value of the '{@link #isShowHiddenCubes() <em>Show Hidden Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowHiddenCubes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_HIDDEN_CUBES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowHiddenCubes() <em>Show Hidden Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowHiddenCubes()
	 * @generated
	 * @ordered
	 */
	protected boolean showHiddenCubes = SHOW_HIDDEN_CUBES_EDEFAULT;

	/**
	 * This is true if the Show Hidden Cubes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showHiddenCubesESet;

	/**
	 * The default value of the '{@link #getSQLSupport() <em>SQL Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLSupport()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SQL_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSQLSupport() <em>SQL Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLSupport()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sQLSupport = SQL_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionDDL() <em>Transaction DDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDDL()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TRANSACTION_DDL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDDL() <em>Transaction DDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDDL()
	 * @generated
	 * @ordered
	 */
	protected BigInteger transactionDDL = TRANSACTION_DDL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRows() <em>Maximum Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRows()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_ROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRows() <em>Maximum Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRows()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumRows = MAXIMUM_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoles() <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected String roles = ROLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualMode() <em>Visual Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualMode()
	 * @generated
	 * @ordered
	 */
	protected static final VisualMode VISUAL_MODE_EDEFAULT = VisualMode._0;

	/**
	 * The cached value of the '{@link #getVisualMode() <em>Visual Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualMode()
	 * @generated
	 * @ordered
	 */
	protected VisualMode visualMode = VISUAL_MODE_EDEFAULT;

	/**
	 * This is true if the Visual Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visualModeESet;

	/**
	 * The default value of the '{@link #getEffectiveRoles() <em>Effective Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveRoles()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_ROLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveRoles() <em>Effective Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveRoles()
	 * @generated
	 * @ordered
	 */
	protected String effectiveRoles = EFFECTIVE_ROLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveUserName() <em>Effective User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveUserName() <em>Effective User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveUserName()
	 * @generated
	 * @ordered
	 */
	protected String effectiveUserName = EFFECTIVE_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected String serverName = SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalogLocation() <em>Catalog Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogLocation()
	 * @generated
	 * @ordered
	 */
	protected static final CatalogLocation CATALOG_LOCATION_EDEFAULT = CatalogLocation._1;

	/**
	 * The cached value of the '{@link #getCatalogLocation() <em>Catalog Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogLocation()
	 * @generated
	 * @ordered
	 */
	protected CatalogLocation catalogLocation = CATALOG_LOCATION_EDEFAULT;

	/**
	 * This is true if the Catalog Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean catalogLocationESet;

	/**
	 * The default value of the '{@link #getDbpropCatalogTerm() <em>Dbprop Catalog Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropCatalogTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_CATALOG_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropCatalogTerm() <em>Dbprop Catalog Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropCatalogTerm()
	 * @generated
	 * @ordered
	 */
	protected String dbpropCatalogTerm = DBPROP_CATALOG_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropCatalogUsage() <em>Dbprop Catalog Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropCatalogUsage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_CATALOG_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropCatalogUsage() <em>Dbprop Catalog Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropCatalogUsage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropCatalogUsage = DBPROP_CATALOG_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropColumnDefinition() <em>Dbprop Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_COLUMN_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropColumnDefinition() <em>Dbprop Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropColumnDefinition = DBPROP_COLUMN_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropConcatNullBehavior() <em>Dbprop Concat Null Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropConcatNullBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropConcatNullBehavior DBPROP_CONCAT_NULL_BEHAVIOR_EDEFAULT = DbpropConcatNullBehavior._1;

	/**
	 * The cached value of the '{@link #getDbpropConcatNullBehavior() <em>Dbprop Concat Null Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropConcatNullBehavior()
	 * @generated
	 * @ordered
	 */
	protected DbpropConcatNullBehavior dbpropConcatNullBehavior = DBPROP_CONCAT_NULL_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Dbprop Concat Null Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropConcatNullBehaviorESet;

	/**
	 * The default value of the '{@link #isDbpropDataSourceReadOnly() <em>Dbprop Data Source Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropDataSourceReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DBPROP_DATA_SOURCE_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDbpropDataSourceReadOnly() <em>Dbprop Data Source Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropDataSourceReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropDataSourceReadOnly = DBPROP_DATA_SOURCE_READ_ONLY_EDEFAULT;

	/**
	 * This is true if the Dbprop Data Source Read Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropDataSourceReadOnlyESet;

	/**
	 * The default value of the '{@link #getDbpropGroupBy() <em>Dbprop Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropGroupBy()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_GROUP_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropGroupBy() <em>Dbprop Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropGroupBy()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropGroupBy = DBPROP_GROUP_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropHeterogeneousTables() <em>Dbprop Heterogeneous Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropHeterogeneousTables()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_HETEROGENEOUS_TABLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropHeterogeneousTables() <em>Dbprop Heterogeneous Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropHeterogeneousTables()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropHeterogeneousTables = DBPROP_HETEROGENEOUS_TABLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropIdentifierCase() <em>Dbprop Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropIdentifierCase()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_IDENTIFIER_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropIdentifierCase() <em>Dbprop Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropIdentifierCase()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropIdentifierCase = DBPROP_IDENTIFIER_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMaxIndexSize() <em>Dbprop Max Index Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxIndexSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MAX_INDEX_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMaxIndexSize() <em>Dbprop Max Index Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxIndexSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMaxIndexSize = DBPROP_MAX_INDEX_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMaxOpenChapters() <em>Dbprop Max Open Chapters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxOpenChapters()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MAX_OPEN_CHAPTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMaxOpenChapters() <em>Dbprop Max Open Chapters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxOpenChapters()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMaxOpenChapters = DBPROP_MAX_OPEN_CHAPTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMaxRowSize() <em>Dbprop Max Row Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxRowSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MAX_ROW_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMaxRowSize() <em>Dbprop Max Row Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxRowSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMaxRowSize = DBPROP_MAX_ROW_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDbpropMaxRowSizeIncludeBlob() <em>Dbprop Max Row Size Include Blob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropMaxRowSizeIncludeBlob()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDbpropMaxRowSizeIncludeBlob() <em>Dbprop Max Row Size Include Blob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropMaxRowSizeIncludeBlob()
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMaxRowSizeIncludeBlob = DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB_EDEFAULT;

	/**
	 * This is true if the Dbprop Max Row Size Include Blob attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMaxRowSizeIncludeBlobESet;

	/**
	 * The default value of the '{@link #getDbpropMaxTablesInSelect() <em>Dbprop Max Tables In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxTablesInSelect()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MAX_TABLES_IN_SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMaxTablesInSelect() <em>Dbprop Max Tables In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMaxTablesInSelect()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMaxTablesInSelect = DBPROP_MAX_TABLES_IN_SELECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDbpropMultiTableUpdate() <em>Dbprop Multi Table Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropMultiTableUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DBPROP_MULTI_TABLE_UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDbpropMultiTableUpdate() <em>Dbprop Multi Table Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropMultiTableUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMultiTableUpdate = DBPROP_MULTI_TABLE_UPDATE_EDEFAULT;

	/**
	 * This is true if the Dbprop Multi Table Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMultiTableUpdateESet;

	/**
	 * The default value of the '{@link #getDbpropNullCollation() <em>Dbprop Null Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropNullCollation()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropNullCollation DBPROP_NULL_COLLATION_EDEFAULT = DbpropNullCollation._1;

	/**
	 * The cached value of the '{@link #getDbpropNullCollation() <em>Dbprop Null Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropNullCollation()
	 * @generated
	 * @ordered
	 */
	protected DbpropNullCollation dbpropNullCollation = DBPROP_NULL_COLLATION_EDEFAULT;

	/**
	 * This is true if the Dbprop Null Collation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropNullCollationESet;

	/**
	 * The default value of the '{@link #isDbpropOrderByColumnsInSelect() <em>Dbprop Order By Columns In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropOrderByColumnsInSelect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DBPROP_ORDER_BY_COLUMNS_IN_SELECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDbpropOrderByColumnsInSelect() <em>Dbprop Order By Columns In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropOrderByColumnsInSelect()
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropOrderByColumnsInSelect = DBPROP_ORDER_BY_COLUMNS_IN_SELECT_EDEFAULT;

	/**
	 * This is true if the Dbprop Order By Columns In Select attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropOrderByColumnsInSelectESet;

	/**
	 * The default value of the '{@link #getDbpropOutputParameterAvailable() <em>Dbprop Output Parameter Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropOutputParameterAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropOutputParameterAvailable DBPROP_OUTPUT_PARAMETER_AVAILABLE_EDEFAULT = DbpropOutputParameterAvailable._1;

	/**
	 * The cached value of the '{@link #getDbpropOutputParameterAvailable() <em>Dbprop Output Parameter Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropOutputParameterAvailable()
	 * @generated
	 * @ordered
	 */
	protected DbpropOutputParameterAvailable dbpropOutputParameterAvailable = DBPROP_OUTPUT_PARAMETER_AVAILABLE_EDEFAULT;

	/**
	 * This is true if the Dbprop Output Parameter Available attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropOutputParameterAvailableESet;

	/**
	 * The default value of the '{@link #getDbpropPersistentIdType() <em>Dbprop Persistent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropPersistentIdType()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropPersistentIdType DBPROP_PERSISTENT_ID_TYPE_EDEFAULT = DbpropPersistentIdType._1;

	/**
	 * The cached value of the '{@link #getDbpropPersistentIdType() <em>Dbprop Persistent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropPersistentIdType()
	 * @generated
	 * @ordered
	 */
	protected DbpropPersistentIdType dbpropPersistentIdType = DBPROP_PERSISTENT_ID_TYPE_EDEFAULT;

	/**
	 * This is true if the Dbprop Persistent Id Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropPersistentIdTypeESet;

	/**
	 * The default value of the '{@link #getDbpropPrepareAbortBehavior() <em>Dbprop Prepare Abort Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropPrepareAbortBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropPrepareAbortBehavior DBPROP_PREPARE_ABORT_BEHAVIOR_EDEFAULT = DbpropPrepareAbortBehavior._1;

	/**
	 * The cached value of the '{@link #getDbpropPrepareAbortBehavior() <em>Dbprop Prepare Abort Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropPrepareAbortBehavior()
	 * @generated
	 * @ordered
	 */
	protected DbpropPrepareAbortBehavior dbpropPrepareAbortBehavior = DBPROP_PREPARE_ABORT_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Dbprop Prepare Abort Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropPrepareAbortBehaviorESet;

	/**
	 * The default value of the '{@link #getDbpropPrepareCommitBehavior() <em>Dbprop Prepare Commit Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropPrepareCommitBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropPrepareCommitBehavior DBPROP_PREPARE_COMMIT_BEHAVIOR_EDEFAULT = DbpropPrepareCommitBehavior._1;

	/**
	 * The cached value of the '{@link #getDbpropPrepareCommitBehavior() <em>Dbprop Prepare Commit Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropPrepareCommitBehavior()
	 * @generated
	 * @ordered
	 */
	protected DbpropPrepareCommitBehavior dbpropPrepareCommitBehavior = DBPROP_PREPARE_COMMIT_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Dbprop Prepare Commit Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropPrepareCommitBehaviorESet;

	/**
	 * The default value of the '{@link #getDbpropProcedureTerm() <em>Dbprop Procedure Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropProcedureTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_PROCEDURE_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropProcedureTerm() <em>Dbprop Procedure Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropProcedureTerm()
	 * @generated
	 * @ordered
	 */
	protected String dbpropProcedureTerm = DBPROP_PROCEDURE_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropQuotedIdentifierCase() <em>Dbprop Quoted Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropQuotedIdentifierCase()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropQuotedIdentifierCase DBPROP_QUOTED_IDENTIFIER_CASE_EDEFAULT = DbpropQuotedIdentifierCase._1;

	/**
	 * The cached value of the '{@link #getDbpropQuotedIdentifierCase() <em>Dbprop Quoted Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropQuotedIdentifierCase()
	 * @generated
	 * @ordered
	 */
	protected DbpropQuotedIdentifierCase dbpropQuotedIdentifierCase = DBPROP_QUOTED_IDENTIFIER_CASE_EDEFAULT;

	/**
	 * This is true if the Dbprop Quoted Identifier Case attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropQuotedIdentifierCaseESet;

	/**
	 * The default value of the '{@link #getDbpropSchemaUsage() <em>Dbprop Schema Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSchemaUsage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_SCHEMA_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropSchemaUsage() <em>Dbprop Schema Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSchemaUsage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropSchemaUsage = DBPROP_SCHEMA_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropSqlSupport() <em>Dbprop Sql Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSqlSupport()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_SQL_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropSqlSupport() <em>Dbprop Sql Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSqlSupport()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropSqlSupport = DBPROP_SQL_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropSubqueries() <em>Dbprop Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSubqueries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_SUBQUERIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropSubqueries() <em>Dbprop Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSubqueries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropSubqueries = DBPROP_SUBQUERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropSupportedTxnDdl() <em>Dbprop Supported Txn Ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSupportedTxnDdl()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_SUPPORTED_TXN_DDL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropSupportedTxnDdl() <em>Dbprop Supported Txn Ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSupportedTxnDdl()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropSupportedTxnDdl = DBPROP_SUPPORTED_TXN_DDL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxSubqueries() <em>Mdprop Mdx Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxSubqueries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_SUBQUERIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxSubqueries() <em>Mdprop Mdx Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxSubqueries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxSubqueries = MDPROP_MDX_SUBQUERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropSupportedTxnIsoLevels() <em>Dbprop Supported Txn Iso Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSupportedTxnIsoLevels()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_SUPPORTED_TXN_ISO_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropSupportedTxnIsoLevels() <em>Dbprop Supported Txn Iso Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSupportedTxnIsoLevels()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropSupportedTxnIsoLevels = DBPROP_SUPPORTED_TXN_ISO_LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropSupportedTxnIsoRetain() <em>Dbprop Supported Txn Iso Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSupportedTxnIsoRetain()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_SUPPORTED_TXN_ISO_RETAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropSupportedTxnIsoRetain() <em>Dbprop Supported Txn Iso Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropSupportedTxnIsoRetain()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropSupportedTxnIsoRetain = DBPROP_SUPPORTED_TXN_ISO_RETAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropTableTerm() <em>Dbprop Table Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropTableTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_TABLE_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropTableTerm() <em>Dbprop Table Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropTableTerm()
	 * @generated
	 * @ordered
	 */
	protected String dbpropTableTerm = DBPROP_TABLE_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropAggregateCellUpdate() <em>Mdprop Aggregate Cell Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropAggregateCellUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final MdpropAggregateCellUpdate MDPROP_AGGREGATE_CELL_UPDATE_EDEFAULT = MdpropAggregateCellUpdate._0;

	/**
	 * The cached value of the '{@link #getMdpropAggregateCellUpdate() <em>Mdprop Aggregate Cell Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropAggregateCellUpdate()
	 * @generated
	 * @ordered
	 */
	protected MdpropAggregateCellUpdate mdpropAggregateCellUpdate = MDPROP_AGGREGATE_CELL_UPDATE_EDEFAULT;

	/**
	 * This is true if the Mdprop Aggregate Cell Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropAggregateCellUpdateESet;

	/**
	 * The default value of the '{@link #getMdpropAxes() <em>Mdprop Axes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropAxes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_AXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropAxes() <em>Mdprop Axes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropAxes()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropAxes = MDPROP_AXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropFlatteningSupport() <em>Mdprop Flattening Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropFlatteningSupport()
	 * @generated
	 * @ordered
	 */
	protected static final MdpropFlatteningSupport MDPROP_FLATTENING_SUPPORT_EDEFAULT = MdpropFlatteningSupport._1;

	/**
	 * The cached value of the '{@link #getMdpropFlatteningSupport() <em>Mdprop Flattening Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropFlatteningSupport()
	 * @generated
	 * @ordered
	 */
	protected MdpropFlatteningSupport mdpropFlatteningSupport = MDPROP_FLATTENING_SUPPORT_EDEFAULT;

	/**
	 * This is true if the Mdprop Flattening Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropFlatteningSupportESet;

	/**
	 * The default value of the '{@link #getMdpropMdxCaseSupport() <em>Mdprop Mdx Case Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxCaseSupport()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_CASE_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxCaseSupport() <em>Mdprop Mdx Case Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxCaseSupport()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxCaseSupport = MDPROP_MDX_CASE_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxDescFlags() <em>Mdprop Mdx Desc Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxDescFlags()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_DESC_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxDescFlags() <em>Mdprop Mdx Desc Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxDescFlags()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxDescFlags = MDPROP_MDX_DESC_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxDrillFunctions() <em>Mdprop Mdx Drill Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxDrillFunctions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_DRILL_FUNCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxDrillFunctions() <em>Mdprop Mdx Drill Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxDrillFunctions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxDrillFunctions = MDPROP_MDX_DRILL_FUNCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxFormulas() <em>Mdprop Mdx Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxFormulas()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_FORMULAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxFormulas() <em>Mdprop Mdx Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxFormulas()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxFormulas = MDPROP_MDX_FORMULAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxJoinCubes() <em>Mdprop Mdx Join Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxJoinCubes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_JOIN_CUBES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxJoinCubes() <em>Mdprop Mdx Join Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxJoinCubes()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxJoinCubes = MDPROP_MDX_JOIN_CUBES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxMemberFunctions() <em>Mdprop Mdx Member Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxMemberFunctions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_MEMBER_FUNCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxMemberFunctions() <em>Mdprop Mdx Member Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxMemberFunctions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxMemberFunctions = MDPROP_MDX_MEMBER_FUNCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxNonMeasureExpressions() <em>Mdprop Mdx Non Measure Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxNonMeasureExpressions()
	 * @generated
	 * @ordered
	 */
	protected static final MdpropMdxNonMeasureExpressions MDPROP_MDX_NON_MEASURE_EXPRESSIONS_EDEFAULT = MdpropMdxNonMeasureExpressions._0;

	/**
	 * The cached value of the '{@link #getMdpropMdxNonMeasureExpressions() <em>Mdprop Mdx Non Measure Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxNonMeasureExpressions()
	 * @generated
	 * @ordered
	 */
	protected MdpropMdxNonMeasureExpressions mdpropMdxNonMeasureExpressions = MDPROP_MDX_NON_MEASURE_EXPRESSIONS_EDEFAULT;

	/**
	 * This is true if the Mdprop Mdx Non Measure Expressions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropMdxNonMeasureExpressionsESet;

	/**
	 * The default value of the '{@link #getMdpropMdxNumericFunctions() <em>Mdprop Mdx Numeric Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxNumericFunctions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_NUMERIC_FUNCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxNumericFunctions() <em>Mdprop Mdx Numeric Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxNumericFunctions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxNumericFunctions = MDPROP_MDX_NUMERIC_FUNCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxObjQualification() <em>Mdprop Mdx Obj Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxObjQualification()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_OBJ_QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxObjQualification() <em>Mdprop Mdx Obj Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxObjQualification()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxObjQualification = MDPROP_MDX_OBJ_QUALIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxOuterReference() <em>Mdprop Mdx Outer Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxOuterReference()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_OUTER_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxOuterReference() <em>Mdprop Mdx Outer Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxOuterReference()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxOuterReference = MDPROP_MDX_OUTER_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMdpropMdxQueryByProperty() <em>Mdprop Mdx Query By Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMdpropMdxQueryByProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MDPROP_MDX_QUERY_BY_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMdpropMdxQueryByProperty() <em>Mdprop Mdx Query By Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMdpropMdxQueryByProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropMdxQueryByProperty = MDPROP_MDX_QUERY_BY_PROPERTY_EDEFAULT;

	/**
	 * This is true if the Mdprop Mdx Query By Property attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropMdxQueryByPropertyESet;

	/**
	 * The default value of the '{@link #getMdpropMdxRangeRowset() <em>Mdprop Mdx Range Rowset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxRangeRowset()
	 * @generated
	 * @ordered
	 */
	protected static final MdpropMdxRangeRowset MDPROP_MDX_RANGE_ROWSET_EDEFAULT = MdpropMdxRangeRowset._1;

	/**
	 * The cached value of the '{@link #getMdpropMdxRangeRowset() <em>Mdprop Mdx Range Rowset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxRangeRowset()
	 * @generated
	 * @ordered
	 */
	protected MdpropMdxRangeRowset mdpropMdxRangeRowset = MDPROP_MDX_RANGE_ROWSET_EDEFAULT;

	/**
	 * This is true if the Mdprop Mdx Range Rowset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropMdxRangeRowsetESet;

	/**
	 * The default value of the '{@link #getMdpropMdxSetFunctions() <em>Mdprop Mdx Set Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxSetFunctions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_SET_FUNCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxSetFunctions() <em>Mdprop Mdx Set Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxSetFunctions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxSetFunctions = MDPROP_MDX_SET_FUNCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxSlicer() <em>Mdprop Mdx Slicer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxSlicer()
	 * @generated
	 * @ordered
	 */
	protected static final MdpropMdxSlicer MDPROP_MDX_SLICER_EDEFAULT = MdpropMdxSlicer._1;

	/**
	 * The cached value of the '{@link #getMdpropMdxSlicer() <em>Mdprop Mdx Slicer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxSlicer()
	 * @generated
	 * @ordered
	 */
	protected MdpropMdxSlicer mdpropMdxSlicer = MDPROP_MDX_SLICER_EDEFAULT;

	/**
	 * This is true if the Mdprop Mdx Slicer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdpropMdxSlicerESet;

	/**
	 * The default value of the '{@link #getMdpropMdxStringCompop() <em>Mdprop Mdx String Compop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxStringCompop()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_STRING_COMPOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxStringCompop() <em>Mdprop Mdx String Compop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxStringCompop()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxStringCompop = MDPROP_MDX_STRING_COMPOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropNamedLevels() <em>Mdprop Named Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropNamedLevels()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_NAMED_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropNamedLevels() <em>Mdprop Named Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropNamedLevels()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropNamedLevels = MDPROP_NAMED_LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdMDXCompatibility() <em>Dbprop Msmd MDX Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdMDXCompatibility()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropMsmdMDXCompatibility DBPROP_MSMD_MDX_COMPATIBILITY_EDEFAULT = DbpropMsmdMDXCompatibility._0;

	/**
	 * The cached value of the '{@link #getDbpropMsmdMDXCompatibility() <em>Dbprop Msmd MDX Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdMDXCompatibility()
	 * @generated
	 * @ordered
	 */
	protected DbpropMsmdMDXCompatibility dbpropMsmdMDXCompatibility = DBPROP_MSMD_MDX_COMPATIBILITY_EDEFAULT;

	/**
	 * This is true if the Dbprop Msmd MDX Compatibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdMDXCompatibilityESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdSQLCompatibility() <em>Dbprop Msmd SQL Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdSQLCompatibility()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_SQL_COMPATIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdSQLCompatibility() <em>Dbprop Msmd SQL Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdSQLCompatibility()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdSQLCompatibility = DBPROP_MSMD_SQL_COMPATIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdMDXUniqueNameStyle() <em>Dbprop Msmd MDX Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdMDXUniqueNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdMDXUniqueNameStyle() <em>Dbprop Msmd MDX Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdMDXUniqueNameStyle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdMDXUniqueNameStyle = DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdCachePolicy() <em>Dbprop Msmd Cache Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCachePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_CACHE_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdCachePolicy() <em>Dbprop Msmd Cache Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCachePolicy()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdCachePolicy = DBPROP_MSMD_CACHE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdCacheRatio() <em>Dbprop Msmd Cache Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCacheRatio()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_CACHE_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdCacheRatio() <em>Dbprop Msmd Cache Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCacheRatio()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdCacheRatio = DBPROP_MSMD_CACHE_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdCacheMode() <em>Dbprop Msmd Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCacheMode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_CACHE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdCacheMode() <em>Dbprop Msmd Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCacheMode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdCacheMode = DBPROP_MSMD_CACHE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdCompareCaseSensitiveStringFlags() <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropMsmdCompareCaseSensitiveStringFlags DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_EDEFAULT = DbpropMsmdCompareCaseSensitiveStringFlags._1;

	/**
	 * The cached value of the '{@link #getDbpropMsmdCompareCaseSensitiveStringFlags() <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @generated
	 * @ordered
	 */
	protected DbpropMsmdCompareCaseSensitiveStringFlags dbpropMsmdCompareCaseSensitiveStringFlags = DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_EDEFAULT;

	/**
	 * This is true if the Dbprop Msmd Compare Case Sensitive String Flags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdCompareCaseSensitiveStringFlagsESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdCompareCaseNotSensitiveStringFlags() <em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCompareCaseNotSensitiveStringFlags()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdCompareCaseNotSensitiveStringFlags() <em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCompareCaseNotSensitiveStringFlags()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdCompareCaseNotSensitiveStringFlags = DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #isDbpropMsmdFlattened2() <em>Dbprop Msmd Flattened2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropMsmdFlattened2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DBPROP_MSMD_FLATTENED2_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDbpropMsmdFlattened2() <em>Dbprop Msmd Flattened2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbpropMsmdFlattened2()
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdFlattened2 = DBPROP_MSMD_FLATTENED2_EDEFAULT;

	/**
	 * This is true if the Dbprop Msmd Flattened2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdFlattened2ESet;

	/**
	 * The default value of the '{@link #getDbpropInitMode() <em>Dbprop Init Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropInitMode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_INIT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropInitMode() <em>Dbprop Init Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropInitMode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropInitMode = DBPROP_INIT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSspropInitAppName() <em>Ssprop Init App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspropInitAppName()
	 * @generated
	 * @ordered
	 */
	protected static final String SSPROP_INIT_APP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSspropInitAppName() <em>Ssprop Init App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspropInitAppName()
	 * @generated
	 * @ordered
	 */
	protected String sspropInitAppName = SSPROP_INIT_APP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSspropInitWsid() <em>Ssprop Init Wsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspropInitWsid()
	 * @generated
	 * @ordered
	 */
	protected static final String SSPROP_INIT_WSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSspropInitWsid() <em>Ssprop Init Wsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspropInitWsid()
	 * @generated
	 * @ordered
	 */
	protected String sspropInitWsid = SSPROP_INIT_WSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSspropInitPacketsize() <em>Ssprop Init Packetsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspropInitPacketsize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SSPROP_INIT_PACKETSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSspropInitPacketsize() <em>Ssprop Init Packetsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspropInitPacketsize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sspropInitPacketsize = SSPROP_INIT_PACKETSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnlySession() <em>Read Only Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnlySession()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger READ_ONLY_SESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnlySession() <em>Read Only Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnlySession()
	 * @generated
	 * @ordered
	 */
	protected BigInteger readOnlySession = READ_ONLY_SESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecuredCellValue() <em>Secured Cell Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredCellValue()
	 * @generated
	 * @ordered
	 */
	protected static final SecuredCellValue SECURED_CELL_VALUE_EDEFAULT = SecuredCellValue._0;

	/**
	 * The cached value of the '{@link #getSecuredCellValue() <em>Secured Cell Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredCellValue()
	 * @generated
	 * @ordered
	 */
	protected SecuredCellValue securedCellValue = SECURED_CELL_VALUE_EDEFAULT;

	/**
	 * This is true if the Secured Cell Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securedCellValueESet;

	/**
	 * The default value of the '{@link #getNonEmptyThreshold() <em>Non Empty Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonEmptyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NON_EMPTY_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonEmptyThreshold() <em>Non Empty Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonEmptyThreshold()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nonEmptyThreshold = NON_EMPTY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSafetyOptions() <em>Safety Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyOptions()
	 * @generated
	 * @ordered
	 */
	protected static final SafetyOptions SAFETY_OPTIONS_EDEFAULT = SafetyOptions._0;

	/**
	 * The cached value of the '{@link #getSafetyOptions() <em>Safety Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyOptions()
	 * @generated
	 * @ordered
	 */
	protected SafetyOptions safetyOptions = SAFETY_OPTIONS_EDEFAULT;

	/**
	 * This is true if the Safety Options attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean safetyOptionsESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdCacheRatio2() <em>Dbprop Msmd Cache Ratio2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCacheRatio2()
	 * @generated
	 * @ordered
	 */
	protected static final double DBPROP_MSMD_CACHE_RATIO2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDbpropMsmdCacheRatio2() <em>Dbprop Msmd Cache Ratio2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdCacheRatio2()
	 * @generated
	 * @ordered
	 */
	protected double dbpropMsmdCacheRatio2 = DBPROP_MSMD_CACHE_RATIO2_EDEFAULT;

	/**
	 * This is true if the Dbprop Msmd Cache Ratio2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdCacheRatio2ESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdUseFormulaCache() <em>Dbprop Msmd Use Formula Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdUseFormulaCache()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_MSMD_USE_FORMULA_CACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdUseFormulaCache() <em>Dbprop Msmd Use Formula Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdUseFormulaCache()
	 * @generated
	 * @ordered
	 */
	protected String dbpropMsmdUseFormulaCache = DBPROP_MSMD_USE_FORMULA_CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdDynamicDebugLimit() <em>Dbprop Msmd Dynamic Debug Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdDynamicDebugLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdDynamicDebugLimit() <em>Dbprop Msmd Dynamic Debug Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdDynamicDebugLimit()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdDynamicDebugLimit = DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdDebugMode() <em>Dbprop Msmd Debug Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdDebugMode()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_MSMD_DEBUG_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdDebugMode() <em>Dbprop Msmd Debug Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdDebugMode()
	 * @generated
	 * @ordered
	 */
	protected String dbpropMsmdDebugMode = DBPROP_MSMD_DEBUG_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected static final Dialect DIALECT_EDEFAULT = Dialect.MDX;

	/**
	 * The cached value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected Dialect dialect = DIALECT_EDEFAULT;

	/**
	 * This is true if the Dialect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dialectESet;

	/**
	 * The default value of the '{@link #isImpactAnalysis() <em>Impact Analysis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpactAnalysis()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPACT_ANALYSIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImpactAnalysis() <em>Impact Analysis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpactAnalysis()
	 * @generated
	 * @ordered
	 */
	protected boolean impactAnalysis = IMPACT_ANALYSIS_EDEFAULT;

	/**
	 * This is true if the Impact Analysis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impactAnalysisESet;

	/**
	 * The default value of the '{@link #getSQLQueryMode() <em>SQL Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLQueryMode()
	 * @generated
	 * @ordered
	 */
	protected static final SQLQueryMode SQL_QUERY_MODE_EDEFAULT = SQLQueryMode.DATA;

	/**
	 * The cached value of the '{@link #getSQLQueryMode() <em>SQL Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLQueryMode()
	 * @generated
	 * @ordered
	 */
	protected SQLQueryMode sQLQueryMode = SQL_QUERY_MODE_EDEFAULT;

	/**
	 * This is true if the SQL Query Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sQLQueryModeESet;

	/**
	 * The default value of the '{@link #getClientProcessID() <em>Client Process ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientProcessID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CLIENT_PROCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientProcessID() <em>Client Process ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientProcessID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger clientProcessID = CLIENT_PROCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCube() <em>Cube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected String cube = CUBE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnCellProperties() <em>Return Cell Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnCellProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_CELL_PROPERTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnCellProperties() <em>Return Cell Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnCellProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean returnCellProperties = RETURN_CELL_PROPERTIES_EDEFAULT;

	/**
	 * This is true if the Return Cell Properties attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnCellPropertiesESet;

	/**
	 * The default value of the '{@link #getCommitTimeout() <em>Commit Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COMMIT_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitTimeout() <em>Commit Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitTimeout()
	 * @generated
	 * @ordered
	 */
	protected BigInteger commitTimeout = COMMIT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceCommitTimeout() <em>Force Commit Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceCommitTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FORCE_COMMIT_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceCommitTimeout() <em>Force Commit Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceCommitTimeout()
	 * @generated
	 * @ordered
	 */
	protected BigInteger forceCommitTimeout = FORCE_COMMIT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected String executionMode = EXECUTION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRealTimeOlap() <em>Real Time Olap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealTimeOlap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REAL_TIME_OLAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRealTimeOlap() <em>Real Time Olap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealTimeOlap()
	 * @generated
	 * @ordered
	 */
	protected boolean realTimeOlap = REAL_TIME_OLAP_EDEFAULT;

	/**
	 * This is true if the Real Time Olap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean realTimeOlapESet;

	/**
	 * The default value of the '{@link #getMdxMissingMemberMode() <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxMissingMemberMode()
	 * @generated
	 * @ordered
	 */
	protected static final MdxMissingMemberMode MDX_MISSING_MEMBER_MODE_EDEFAULT = MdxMissingMemberMode.DEFAULT;

	/**
	 * The cached value of the '{@link #getMdxMissingMemberMode() <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxMissingMemberMode()
	 * @generated
	 * @ordered
	 */
	protected MdxMissingMemberMode mdxMissingMemberMode = MDX_MISSING_MEMBER_MODE_EDEFAULT;

	/**
	 * This is true if the Mdx Missing Member Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdxMissingMemberModeESet;

	/**
	 * The default value of the '{@link #getMdpropMdxNamedSets() <em>Mdprop Mdx Named Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxNamedSets()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_NAMED_SETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxNamedSets() <em>Mdprop Mdx Named Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxNamedSets()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxNamedSets = MDPROP_MDX_NAMED_SETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdSubqueries() <em>Dbprop Msmd Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdSubqueries()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropMsmdSubqueries DBPROP_MSMD_SUBQUERIES_EDEFAULT = DbpropMsmdSubqueries._0;

	/**
	 * The cached value of the '{@link #getDbpropMsmdSubqueries() <em>Dbprop Msmd Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdSubqueries()
	 * @generated
	 * @ordered
	 */
	protected DbpropMsmdSubqueries dbpropMsmdSubqueries = DBPROP_MSMD_SUBQUERIES_EDEFAULT;

	/**
	 * This is true if the Dbprop Msmd Subqueries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdSubqueriesESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdAutoExists() <em>Dbprop Msmd Auto Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdAutoExists()
	 * @generated
	 * @ordered
	 */
	protected static final DbpropMsmdAutoExists DBPROP_MSMD_AUTO_EXISTS_EDEFAULT = DbpropMsmdAutoExists._0;

	/**
	 * The cached value of the '{@link #getDbpropMsmdAutoExists() <em>Dbprop Msmd Auto Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdAutoExists()
	 * @generated
	 * @ordered
	 */
	protected DbpropMsmdAutoExists dbpropMsmdAutoExists = DBPROP_MSMD_AUTO_EXISTS_EDEFAULT;

	/**
	 * This is true if the Dbprop Msmd Auto Exists attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbpropMsmdAutoExistsESet;

	/**
	 * The default value of the '{@link #getCustomData() <em>Custom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomData()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomData() <em>Custom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomData()
	 * @generated
	 * @ordered
	 */
	protected String customData = CUSTOM_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisablePrefetchFacts() <em>Disable Prefetch Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisablePrefetchFacts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_PREFETCH_FACTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisablePrefetchFacts() <em>Disable Prefetch Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisablePrefetchFacts()
	 * @generated
	 * @ordered
	 */
	protected boolean disablePrefetchFacts = DISABLE_PREFETCH_FACTS_EDEFAULT;

	/**
	 * This is true if the Disable Prefetch Facts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disablePrefetchFactsESet;

	/**
	 * The default value of the '{@link #getUpdateIsolationLevel() <em>Update Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateIsolationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateIsolationLevel UPDATE_ISOLATION_LEVEL_EDEFAULT = UpdateIsolationLevel._1;

	/**
	 * The cached value of the '{@link #getUpdateIsolationLevel() <em>Update Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateIsolationLevel()
	 * @generated
	 * @ordered
	 */
	protected UpdateIsolationLevel updateIsolationLevel = UPDATE_ISOLATION_LEVEL_EDEFAULT;

	/**
	 * This is true if the Update Isolation Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateIsolationLevelESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdErrorMessageMode() <em>Dbprop Msmd Error Message Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdErrorMessageMode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_ERROR_MESSAGE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdErrorMessageMode() <em>Dbprop Msmd Error Message Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdErrorMessageMode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdErrorMessageMode = DBPROP_MSMD_ERROR_MESSAGE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdpropMdxDdlExtensions() <em>Mdprop Mdx Ddl Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxDdlExtensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MDPROP_MDX_DDL_EXTENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdpropMdxDdlExtensions() <em>Mdprop Mdx Ddl Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdpropMdxDdlExtensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mdpropMdxDdlExtensions = MDPROP_MDX_DDL_EXTENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseEncoding() <em>Response Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final ResponseEncoding RESPONSE_ENCODING_EDEFAULT = ResponseEncoding.DEFAULT;

	/**
	 * The cached value of the '{@link #getResponseEncoding() <em>Response Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseEncoding()
	 * @generated
	 * @ordered
	 */
	protected ResponseEncoding responseEncoding = RESPONSE_ENCODING_EDEFAULT;

	/**
	 * This is true if the Response Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseEncodingESet;

	/**
	 * The default value of the '{@link #getMemoryLockingMode() <em>Memory Locking Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLockingMode()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryLockingMode MEMORY_LOCKING_MODE_EDEFAULT = MemoryLockingMode._0;

	/**
	 * The cached value of the '{@link #getMemoryLockingMode() <em>Memory Locking Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLockingMode()
	 * @generated
	 * @ordered
	 */
	protected MemoryLockingMode memoryLockingMode = MEMORY_LOCKING_MODE_EDEFAULT;

	/**
	 * This is true if the Memory Locking Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memoryLockingModeESet;

	/**
	 * The default value of the '{@link #getDbpropMsmdOptimizeResponse() <em>Dbprop Msmd Optimize Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdOptimizeResponse()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_OPTIMIZE_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdOptimizeResponse() <em>Dbprop Msmd Optimize Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdOptimizeResponse()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdOptimizeResponse = DBPROP_MSMD_OPTIMIZE_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdActivityID() <em>Dbprop Msmd Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdActivityID()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_MSMD_ACTIVITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdActivityID() <em>Dbprop Msmd Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdActivityID()
	 * @generated
	 * @ordered
	 */
	protected String dbpropMsmdActivityID = DBPROP_MSMD_ACTIVITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdRequestID() <em>Dbprop Msmd Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdRequestID()
	 * @generated
	 * @ordered
	 */
	protected static final String DBPROP_MSMD_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdRequestID() <em>Dbprop Msmd Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdRequestID()
	 * @generated
	 * @ordered
	 */
	protected String dbpropMsmdRequestID = DBPROP_MSMD_REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnAffectedObjects() <em>Return Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAffectedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RETURN_AFFECTED_OBJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnAffectedObjects() <em>Return Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAffectedObjects()
	 * @generated
	 * @ordered
	 */
	protected BigInteger returnAffectedObjects = RETURN_AFFECTED_OBJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbpropMsmdRequestMemoryLimit() <em>Dbprop Msmd Request Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdRequestMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DBPROP_MSMD_REQUEST_MEMORY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbpropMsmdRequestMemoryLimit() <em>Dbprop Msmd Request Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpropMsmdRequestMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dbpropMsmdRequestMemoryLimit = DBPROP_MSMD_REQUEST_MEMORY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationContext() <em>Application Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationContext()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationContext() <em>Application Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationContext()
	 * @generated
	 * @ordered
	 */
	protected String applicationContext = APPLICATION_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROPERTY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceInfo() {
		return dataSourceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceInfo(String newDataSourceInfo) {
		String oldDataSourceInfo = dataSourceInfo;
		dataSourceInfo = newDataSourceInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DATA_SOURCE_INFO, oldDataSourceInfo, dataSourceInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(BigInteger newTimeout) {
		BigInteger oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLocaleIdentifier() {
		return localeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleIdentifier(BigInteger newLocaleIdentifier) {
		BigInteger oldLocaleIdentifier = localeIdentifier;
		localeIdentifier = newLocaleIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__LOCALE_IDENTIFIER, oldLocaleIdentifier, localeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSupport getStateSupport() {
		return stateSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateSupport(StateSupport newStateSupport) {
		StateSupport oldStateSupport = stateSupport;
		stateSupport = newStateSupport == null ? STATE_SUPPORT_EDEFAULT : newStateSupport;
		boolean oldStateSupportESet = stateSupportESet;
		stateSupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__STATE_SUPPORT, oldStateSupport, stateSupport, !oldStateSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStateSupport() {
		StateSupport oldStateSupport = stateSupport;
		boolean oldStateSupportESet = stateSupportESet;
		stateSupport = STATE_SUPPORT_EDEFAULT;
		stateSupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__STATE_SUPPORT, oldStateSupport, STATE_SUPPORT_EDEFAULT, oldStateSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStateSupport() {
		return stateSupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Content newContent) {
		Content oldContent = content;
		content = newContent == null ? CONTENT_EDEFAULT : newContent;
		boolean oldContentESet = contentESet;
		contentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__CONTENT, oldContent, content, !oldContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContent() {
		Content oldContent = content;
		boolean oldContentESet = contentESet;
		content = CONTENT_EDEFAULT;
		contentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__CONTENT, oldContent, CONTENT_EDEFAULT, oldContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContent() {
		return contentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(Format newFormat) {
		Format oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		Format oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFormat getAxisFormat() {
		return axisFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisFormat(AxisFormat newAxisFormat) {
		AxisFormat oldAxisFormat = axisFormat;
		axisFormat = newAxisFormat == null ? AXIS_FORMAT_EDEFAULT : newAxisFormat;
		boolean oldAxisFormatESet = axisFormatESet;
		axisFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__AXIS_FORMAT, oldAxisFormat, axisFormat, !oldAxisFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxisFormat() {
		AxisFormat oldAxisFormat = axisFormat;
		boolean oldAxisFormatESet = axisFormatESet;
		axisFormat = AXIS_FORMAT_EDEFAULT;
		axisFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__AXIS_FORMAT, oldAxisFormat, AXIS_FORMAT_EDEFAULT, oldAxisFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxisFormat() {
		return axisFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBeginRange() {
		return beginRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginRange(BigInteger newBeginRange) {
		BigInteger oldBeginRange = beginRange;
		beginRange = newBeginRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__BEGIN_RANGE, oldBeginRange, beginRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndRange() {
		return endRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndRange(BigInteger newEndRange) {
		BigInteger oldEndRange = endRange;
		endRange = newEndRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__END_RANGE, oldEndRange, endRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDXSupport getMDXSupport() {
		return mDXSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMDXSupport(MDXSupport newMDXSupport) {
		MDXSupport oldMDXSupport = mDXSupport;
		mDXSupport = newMDXSupport == null ? MDX_SUPPORT_EDEFAULT : newMDXSupport;
		boolean oldMDXSupportESet = mDXSupportESet;
		mDXSupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDX_SUPPORT, oldMDXSupport, mDXSupport, !oldMDXSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMDXSupport() {
		MDXSupport oldMDXSupport = mDXSupport;
		boolean oldMDXSupportESet = mDXSupportESet;
		mDXSupport = MDX_SUPPORT_EDEFAULT;
		mDXSupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDX_SUPPORT, oldMDXSupport, MDX_SUPPORT_EDEFAULT, oldMDXSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMDXSupport() {
		return mDXSupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderVersion() {
		return providerVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderVersion(String newProviderVersion) {
		String oldProviderVersion = providerVersion;
		providerVersion = newProviderVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__PROVIDER_VERSION, oldProviderVersion, providerVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBMSVersion() {
		return dBMSVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBMSVersion(String newDBMSVersion) {
		String oldDBMSVersion = dBMSVersion;
		dBMSVersion = newDBMSVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBMS_VERSION, oldDBMSVersion, dBMSVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType getProviderType() {
		return providerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderType(ProviderType newProviderType) {
		ProviderType oldProviderType = providerType;
		providerType = newProviderType == null ? PROVIDER_TYPE_EDEFAULT : newProviderType;
		boolean oldProviderTypeESet = providerTypeESet;
		providerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__PROVIDER_TYPE, oldProviderType, providerType, !oldProviderTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProviderType() {
		ProviderType oldProviderType = providerType;
		boolean oldProviderTypeESet = providerTypeESet;
		providerType = PROVIDER_TYPE_EDEFAULT;
		providerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__PROVIDER_TYPE, oldProviderType, PROVIDER_TYPE_EDEFAULT, oldProviderTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProviderType() {
		return providerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowHiddenCubes() {
		return showHiddenCubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowHiddenCubes(boolean newShowHiddenCubes) {
		boolean oldShowHiddenCubes = showHiddenCubes;
		showHiddenCubes = newShowHiddenCubes;
		boolean oldShowHiddenCubesESet = showHiddenCubesESet;
		showHiddenCubesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SHOW_HIDDEN_CUBES, oldShowHiddenCubes, showHiddenCubes, !oldShowHiddenCubesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowHiddenCubes() {
		boolean oldShowHiddenCubes = showHiddenCubes;
		boolean oldShowHiddenCubesESet = showHiddenCubesESet;
		showHiddenCubes = SHOW_HIDDEN_CUBES_EDEFAULT;
		showHiddenCubesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__SHOW_HIDDEN_CUBES, oldShowHiddenCubes, SHOW_HIDDEN_CUBES_EDEFAULT, oldShowHiddenCubesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowHiddenCubes() {
		return showHiddenCubesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSQLSupport() {
		return sQLSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQLSupport(BigInteger newSQLSupport) {
		BigInteger oldSQLSupport = sQLSupport;
		sQLSupport = newSQLSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SQL_SUPPORT, oldSQLSupport, sQLSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTransactionDDL() {
		return transactionDDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDDL(BigInteger newTransactionDDL) {
		BigInteger oldTransactionDDL = transactionDDL;
		transactionDDL = newTransactionDDL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__TRANSACTION_DDL, oldTransactionDDL, transactionDDL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumRows() {
		return maximumRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRows(BigInteger newMaximumRows) {
		BigInteger oldMaximumRows = maximumRows;
		maximumRows = newMaximumRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MAXIMUM_ROWS, oldMaximumRows, maximumRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(String newRoles) {
		String oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__ROLES, oldRoles, roles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualMode getVisualMode() {
		return visualMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualMode(VisualMode newVisualMode) {
		VisualMode oldVisualMode = visualMode;
		visualMode = newVisualMode == null ? VISUAL_MODE_EDEFAULT : newVisualMode;
		boolean oldVisualModeESet = visualModeESet;
		visualModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__VISUAL_MODE, oldVisualMode, visualMode, !oldVisualModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisualMode() {
		VisualMode oldVisualMode = visualMode;
		boolean oldVisualModeESet = visualModeESet;
		visualMode = VISUAL_MODE_EDEFAULT;
		visualModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__VISUAL_MODE, oldVisualMode, VISUAL_MODE_EDEFAULT, oldVisualModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisualMode() {
		return visualModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveRoles() {
		return effectiveRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveRoles(String newEffectiveRoles) {
		String oldEffectiveRoles = effectiveRoles;
		effectiveRoles = newEffectiveRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__EFFECTIVE_ROLES, oldEffectiveRoles, effectiveRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveUserName() {
		return effectiveUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveUserName(String newEffectiveUserName) {
		String oldEffectiveUserName = effectiveUserName;
		effectiveUserName = newEffectiveUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__EFFECTIVE_USER_NAME, oldEffectiveUserName, effectiveUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(String newServerName) {
		String oldServerName = serverName;
		serverName = newServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SERVER_NAME, oldServerName, serverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogLocation getCatalogLocation() {
		return catalogLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogLocation(CatalogLocation newCatalogLocation) {
		CatalogLocation oldCatalogLocation = catalogLocation;
		catalogLocation = newCatalogLocation == null ? CATALOG_LOCATION_EDEFAULT : newCatalogLocation;
		boolean oldCatalogLocationESet = catalogLocationESet;
		catalogLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__CATALOG_LOCATION, oldCatalogLocation, catalogLocation, !oldCatalogLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCatalogLocation() {
		CatalogLocation oldCatalogLocation = catalogLocation;
		boolean oldCatalogLocationESet = catalogLocationESet;
		catalogLocation = CATALOG_LOCATION_EDEFAULT;
		catalogLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__CATALOG_LOCATION, oldCatalogLocation, CATALOG_LOCATION_EDEFAULT, oldCatalogLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCatalogLocation() {
		return catalogLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropCatalogTerm() {
		return dbpropCatalogTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropCatalogTerm(String newDbpropCatalogTerm) {
		String oldDbpropCatalogTerm = dbpropCatalogTerm;
		dbpropCatalogTerm = newDbpropCatalogTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_TERM, oldDbpropCatalogTerm, dbpropCatalogTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropCatalogUsage() {
		return dbpropCatalogUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropCatalogUsage(BigInteger newDbpropCatalogUsage) {
		BigInteger oldDbpropCatalogUsage = dbpropCatalogUsage;
		dbpropCatalogUsage = newDbpropCatalogUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_USAGE, oldDbpropCatalogUsage, dbpropCatalogUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropColumnDefinition() {
		return dbpropColumnDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropColumnDefinition(BigInteger newDbpropColumnDefinition) {
		BigInteger oldDbpropColumnDefinition = dbpropColumnDefinition;
		dbpropColumnDefinition = newDbpropColumnDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_COLUMN_DEFINITION, oldDbpropColumnDefinition, dbpropColumnDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropConcatNullBehavior getDbpropConcatNullBehavior() {
		return dbpropConcatNullBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropConcatNullBehavior(DbpropConcatNullBehavior newDbpropConcatNullBehavior) {
		DbpropConcatNullBehavior oldDbpropConcatNullBehavior = dbpropConcatNullBehavior;
		dbpropConcatNullBehavior = newDbpropConcatNullBehavior == null ? DBPROP_CONCAT_NULL_BEHAVIOR_EDEFAULT : newDbpropConcatNullBehavior;
		boolean oldDbpropConcatNullBehaviorESet = dbpropConcatNullBehaviorESet;
		dbpropConcatNullBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR, oldDbpropConcatNullBehavior, dbpropConcatNullBehavior, !oldDbpropConcatNullBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropConcatNullBehavior() {
		DbpropConcatNullBehavior oldDbpropConcatNullBehavior = dbpropConcatNullBehavior;
		boolean oldDbpropConcatNullBehaviorESet = dbpropConcatNullBehaviorESet;
		dbpropConcatNullBehavior = DBPROP_CONCAT_NULL_BEHAVIOR_EDEFAULT;
		dbpropConcatNullBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR, oldDbpropConcatNullBehavior, DBPROP_CONCAT_NULL_BEHAVIOR_EDEFAULT, oldDbpropConcatNullBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropConcatNullBehavior() {
		return dbpropConcatNullBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDbpropDataSourceReadOnly() {
		return dbpropDataSourceReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropDataSourceReadOnly(boolean newDbpropDataSourceReadOnly) {
		boolean oldDbpropDataSourceReadOnly = dbpropDataSourceReadOnly;
		dbpropDataSourceReadOnly = newDbpropDataSourceReadOnly;
		boolean oldDbpropDataSourceReadOnlyESet = dbpropDataSourceReadOnlyESet;
		dbpropDataSourceReadOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY, oldDbpropDataSourceReadOnly, dbpropDataSourceReadOnly, !oldDbpropDataSourceReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropDataSourceReadOnly() {
		boolean oldDbpropDataSourceReadOnly = dbpropDataSourceReadOnly;
		boolean oldDbpropDataSourceReadOnlyESet = dbpropDataSourceReadOnlyESet;
		dbpropDataSourceReadOnly = DBPROP_DATA_SOURCE_READ_ONLY_EDEFAULT;
		dbpropDataSourceReadOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY, oldDbpropDataSourceReadOnly, DBPROP_DATA_SOURCE_READ_ONLY_EDEFAULT, oldDbpropDataSourceReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropDataSourceReadOnly() {
		return dbpropDataSourceReadOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropGroupBy() {
		return dbpropGroupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropGroupBy(BigInteger newDbpropGroupBy) {
		BigInteger oldDbpropGroupBy = dbpropGroupBy;
		dbpropGroupBy = newDbpropGroupBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_GROUP_BY, oldDbpropGroupBy, dbpropGroupBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropHeterogeneousTables() {
		return dbpropHeterogeneousTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropHeterogeneousTables(BigInteger newDbpropHeterogeneousTables) {
		BigInteger oldDbpropHeterogeneousTables = dbpropHeterogeneousTables;
		dbpropHeterogeneousTables = newDbpropHeterogeneousTables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES, oldDbpropHeterogeneousTables, dbpropHeterogeneousTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropIdentifierCase() {
		return dbpropIdentifierCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropIdentifierCase(BigInteger newDbpropIdentifierCase) {
		BigInteger oldDbpropIdentifierCase = dbpropIdentifierCase;
		dbpropIdentifierCase = newDbpropIdentifierCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_IDENTIFIER_CASE, oldDbpropIdentifierCase, dbpropIdentifierCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMaxIndexSize() {
		return dbpropMaxIndexSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMaxIndexSize(BigInteger newDbpropMaxIndexSize) {
		BigInteger oldDbpropMaxIndexSize = dbpropMaxIndexSize;
		dbpropMaxIndexSize = newDbpropMaxIndexSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE, oldDbpropMaxIndexSize, dbpropMaxIndexSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMaxOpenChapters() {
		return dbpropMaxOpenChapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMaxOpenChapters(BigInteger newDbpropMaxOpenChapters) {
		BigInteger oldDbpropMaxOpenChapters = dbpropMaxOpenChapters;
		dbpropMaxOpenChapters = newDbpropMaxOpenChapters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS, oldDbpropMaxOpenChapters, dbpropMaxOpenChapters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMaxRowSize() {
		return dbpropMaxRowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMaxRowSize(BigInteger newDbpropMaxRowSize) {
		BigInteger oldDbpropMaxRowSize = dbpropMaxRowSize;
		dbpropMaxRowSize = newDbpropMaxRowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE, oldDbpropMaxRowSize, dbpropMaxRowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDbpropMaxRowSizeIncludeBlob() {
		return dbpropMaxRowSizeIncludeBlob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMaxRowSizeIncludeBlob(boolean newDbpropMaxRowSizeIncludeBlob) {
		boolean oldDbpropMaxRowSizeIncludeBlob = dbpropMaxRowSizeIncludeBlob;
		dbpropMaxRowSizeIncludeBlob = newDbpropMaxRowSizeIncludeBlob;
		boolean oldDbpropMaxRowSizeIncludeBlobESet = dbpropMaxRowSizeIncludeBlobESet;
		dbpropMaxRowSizeIncludeBlobESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB, oldDbpropMaxRowSizeIncludeBlob, dbpropMaxRowSizeIncludeBlob, !oldDbpropMaxRowSizeIncludeBlobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMaxRowSizeIncludeBlob() {
		boolean oldDbpropMaxRowSizeIncludeBlob = dbpropMaxRowSizeIncludeBlob;
		boolean oldDbpropMaxRowSizeIncludeBlobESet = dbpropMaxRowSizeIncludeBlobESet;
		dbpropMaxRowSizeIncludeBlob = DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB_EDEFAULT;
		dbpropMaxRowSizeIncludeBlobESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB, oldDbpropMaxRowSizeIncludeBlob, DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB_EDEFAULT, oldDbpropMaxRowSizeIncludeBlobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMaxRowSizeIncludeBlob() {
		return dbpropMaxRowSizeIncludeBlobESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMaxTablesInSelect() {
		return dbpropMaxTablesInSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMaxTablesInSelect(BigInteger newDbpropMaxTablesInSelect) {
		BigInteger oldDbpropMaxTablesInSelect = dbpropMaxTablesInSelect;
		dbpropMaxTablesInSelect = newDbpropMaxTablesInSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT, oldDbpropMaxTablesInSelect, dbpropMaxTablesInSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDbpropMultiTableUpdate() {
		return dbpropMultiTableUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMultiTableUpdate(boolean newDbpropMultiTableUpdate) {
		boolean oldDbpropMultiTableUpdate = dbpropMultiTableUpdate;
		dbpropMultiTableUpdate = newDbpropMultiTableUpdate;
		boolean oldDbpropMultiTableUpdateESet = dbpropMultiTableUpdateESet;
		dbpropMultiTableUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE, oldDbpropMultiTableUpdate, dbpropMultiTableUpdate, !oldDbpropMultiTableUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMultiTableUpdate() {
		boolean oldDbpropMultiTableUpdate = dbpropMultiTableUpdate;
		boolean oldDbpropMultiTableUpdateESet = dbpropMultiTableUpdateESet;
		dbpropMultiTableUpdate = DBPROP_MULTI_TABLE_UPDATE_EDEFAULT;
		dbpropMultiTableUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE, oldDbpropMultiTableUpdate, DBPROP_MULTI_TABLE_UPDATE_EDEFAULT, oldDbpropMultiTableUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMultiTableUpdate() {
		return dbpropMultiTableUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropNullCollation getDbpropNullCollation() {
		return dbpropNullCollation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropNullCollation(DbpropNullCollation newDbpropNullCollation) {
		DbpropNullCollation oldDbpropNullCollation = dbpropNullCollation;
		dbpropNullCollation = newDbpropNullCollation == null ? DBPROP_NULL_COLLATION_EDEFAULT : newDbpropNullCollation;
		boolean oldDbpropNullCollationESet = dbpropNullCollationESet;
		dbpropNullCollationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_NULL_COLLATION, oldDbpropNullCollation, dbpropNullCollation, !oldDbpropNullCollationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropNullCollation() {
		DbpropNullCollation oldDbpropNullCollation = dbpropNullCollation;
		boolean oldDbpropNullCollationESet = dbpropNullCollationESet;
		dbpropNullCollation = DBPROP_NULL_COLLATION_EDEFAULT;
		dbpropNullCollationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_NULL_COLLATION, oldDbpropNullCollation, DBPROP_NULL_COLLATION_EDEFAULT, oldDbpropNullCollationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropNullCollation() {
		return dbpropNullCollationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDbpropOrderByColumnsInSelect() {
		return dbpropOrderByColumnsInSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropOrderByColumnsInSelect(boolean newDbpropOrderByColumnsInSelect) {
		boolean oldDbpropOrderByColumnsInSelect = dbpropOrderByColumnsInSelect;
		dbpropOrderByColumnsInSelect = newDbpropOrderByColumnsInSelect;
		boolean oldDbpropOrderByColumnsInSelectESet = dbpropOrderByColumnsInSelectESet;
		dbpropOrderByColumnsInSelectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT, oldDbpropOrderByColumnsInSelect, dbpropOrderByColumnsInSelect, !oldDbpropOrderByColumnsInSelectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropOrderByColumnsInSelect() {
		boolean oldDbpropOrderByColumnsInSelect = dbpropOrderByColumnsInSelect;
		boolean oldDbpropOrderByColumnsInSelectESet = dbpropOrderByColumnsInSelectESet;
		dbpropOrderByColumnsInSelect = DBPROP_ORDER_BY_COLUMNS_IN_SELECT_EDEFAULT;
		dbpropOrderByColumnsInSelectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT, oldDbpropOrderByColumnsInSelect, DBPROP_ORDER_BY_COLUMNS_IN_SELECT_EDEFAULT, oldDbpropOrderByColumnsInSelectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropOrderByColumnsInSelect() {
		return dbpropOrderByColumnsInSelectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropOutputParameterAvailable getDbpropOutputParameterAvailable() {
		return dbpropOutputParameterAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropOutputParameterAvailable(DbpropOutputParameterAvailable newDbpropOutputParameterAvailable) {
		DbpropOutputParameterAvailable oldDbpropOutputParameterAvailable = dbpropOutputParameterAvailable;
		dbpropOutputParameterAvailable = newDbpropOutputParameterAvailable == null ? DBPROP_OUTPUT_PARAMETER_AVAILABLE_EDEFAULT : newDbpropOutputParameterAvailable;
		boolean oldDbpropOutputParameterAvailableESet = dbpropOutputParameterAvailableESet;
		dbpropOutputParameterAvailableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE, oldDbpropOutputParameterAvailable, dbpropOutputParameterAvailable, !oldDbpropOutputParameterAvailableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropOutputParameterAvailable() {
		DbpropOutputParameterAvailable oldDbpropOutputParameterAvailable = dbpropOutputParameterAvailable;
		boolean oldDbpropOutputParameterAvailableESet = dbpropOutputParameterAvailableESet;
		dbpropOutputParameterAvailable = DBPROP_OUTPUT_PARAMETER_AVAILABLE_EDEFAULT;
		dbpropOutputParameterAvailableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE, oldDbpropOutputParameterAvailable, DBPROP_OUTPUT_PARAMETER_AVAILABLE_EDEFAULT, oldDbpropOutputParameterAvailableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropOutputParameterAvailable() {
		return dbpropOutputParameterAvailableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPersistentIdType getDbpropPersistentIdType() {
		return dbpropPersistentIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropPersistentIdType(DbpropPersistentIdType newDbpropPersistentIdType) {
		DbpropPersistentIdType oldDbpropPersistentIdType = dbpropPersistentIdType;
		dbpropPersistentIdType = newDbpropPersistentIdType == null ? DBPROP_PERSISTENT_ID_TYPE_EDEFAULT : newDbpropPersistentIdType;
		boolean oldDbpropPersistentIdTypeESet = dbpropPersistentIdTypeESet;
		dbpropPersistentIdTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE, oldDbpropPersistentIdType, dbpropPersistentIdType, !oldDbpropPersistentIdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropPersistentIdType() {
		DbpropPersistentIdType oldDbpropPersistentIdType = dbpropPersistentIdType;
		boolean oldDbpropPersistentIdTypeESet = dbpropPersistentIdTypeESet;
		dbpropPersistentIdType = DBPROP_PERSISTENT_ID_TYPE_EDEFAULT;
		dbpropPersistentIdTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE, oldDbpropPersistentIdType, DBPROP_PERSISTENT_ID_TYPE_EDEFAULT, oldDbpropPersistentIdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropPersistentIdType() {
		return dbpropPersistentIdTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareAbortBehavior getDbpropPrepareAbortBehavior() {
		return dbpropPrepareAbortBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropPrepareAbortBehavior(DbpropPrepareAbortBehavior newDbpropPrepareAbortBehavior) {
		DbpropPrepareAbortBehavior oldDbpropPrepareAbortBehavior = dbpropPrepareAbortBehavior;
		dbpropPrepareAbortBehavior = newDbpropPrepareAbortBehavior == null ? DBPROP_PREPARE_ABORT_BEHAVIOR_EDEFAULT : newDbpropPrepareAbortBehavior;
		boolean oldDbpropPrepareAbortBehaviorESet = dbpropPrepareAbortBehaviorESet;
		dbpropPrepareAbortBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR, oldDbpropPrepareAbortBehavior, dbpropPrepareAbortBehavior, !oldDbpropPrepareAbortBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropPrepareAbortBehavior() {
		DbpropPrepareAbortBehavior oldDbpropPrepareAbortBehavior = dbpropPrepareAbortBehavior;
		boolean oldDbpropPrepareAbortBehaviorESet = dbpropPrepareAbortBehaviorESet;
		dbpropPrepareAbortBehavior = DBPROP_PREPARE_ABORT_BEHAVIOR_EDEFAULT;
		dbpropPrepareAbortBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR, oldDbpropPrepareAbortBehavior, DBPROP_PREPARE_ABORT_BEHAVIOR_EDEFAULT, oldDbpropPrepareAbortBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropPrepareAbortBehavior() {
		return dbpropPrepareAbortBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareCommitBehavior getDbpropPrepareCommitBehavior() {
		return dbpropPrepareCommitBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropPrepareCommitBehavior(DbpropPrepareCommitBehavior newDbpropPrepareCommitBehavior) {
		DbpropPrepareCommitBehavior oldDbpropPrepareCommitBehavior = dbpropPrepareCommitBehavior;
		dbpropPrepareCommitBehavior = newDbpropPrepareCommitBehavior == null ? DBPROP_PREPARE_COMMIT_BEHAVIOR_EDEFAULT : newDbpropPrepareCommitBehavior;
		boolean oldDbpropPrepareCommitBehaviorESet = dbpropPrepareCommitBehaviorESet;
		dbpropPrepareCommitBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR, oldDbpropPrepareCommitBehavior, dbpropPrepareCommitBehavior, !oldDbpropPrepareCommitBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropPrepareCommitBehavior() {
		DbpropPrepareCommitBehavior oldDbpropPrepareCommitBehavior = dbpropPrepareCommitBehavior;
		boolean oldDbpropPrepareCommitBehaviorESet = dbpropPrepareCommitBehaviorESet;
		dbpropPrepareCommitBehavior = DBPROP_PREPARE_COMMIT_BEHAVIOR_EDEFAULT;
		dbpropPrepareCommitBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR, oldDbpropPrepareCommitBehavior, DBPROP_PREPARE_COMMIT_BEHAVIOR_EDEFAULT, oldDbpropPrepareCommitBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropPrepareCommitBehavior() {
		return dbpropPrepareCommitBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropProcedureTerm() {
		return dbpropProcedureTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropProcedureTerm(String newDbpropProcedureTerm) {
		String oldDbpropProcedureTerm = dbpropProcedureTerm;
		dbpropProcedureTerm = newDbpropProcedureTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_PROCEDURE_TERM, oldDbpropProcedureTerm, dbpropProcedureTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropQuotedIdentifierCase getDbpropQuotedIdentifierCase() {
		return dbpropQuotedIdentifierCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropQuotedIdentifierCase(DbpropQuotedIdentifierCase newDbpropQuotedIdentifierCase) {
		DbpropQuotedIdentifierCase oldDbpropQuotedIdentifierCase = dbpropQuotedIdentifierCase;
		dbpropQuotedIdentifierCase = newDbpropQuotedIdentifierCase == null ? DBPROP_QUOTED_IDENTIFIER_CASE_EDEFAULT : newDbpropQuotedIdentifierCase;
		boolean oldDbpropQuotedIdentifierCaseESet = dbpropQuotedIdentifierCaseESet;
		dbpropQuotedIdentifierCaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE, oldDbpropQuotedIdentifierCase, dbpropQuotedIdentifierCase, !oldDbpropQuotedIdentifierCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropQuotedIdentifierCase() {
		DbpropQuotedIdentifierCase oldDbpropQuotedIdentifierCase = dbpropQuotedIdentifierCase;
		boolean oldDbpropQuotedIdentifierCaseESet = dbpropQuotedIdentifierCaseESet;
		dbpropQuotedIdentifierCase = DBPROP_QUOTED_IDENTIFIER_CASE_EDEFAULT;
		dbpropQuotedIdentifierCaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE, oldDbpropQuotedIdentifierCase, DBPROP_QUOTED_IDENTIFIER_CASE_EDEFAULT, oldDbpropQuotedIdentifierCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropQuotedIdentifierCase() {
		return dbpropQuotedIdentifierCaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropSchemaUsage() {
		return dbpropSchemaUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropSchemaUsage(BigInteger newDbpropSchemaUsage) {
		BigInteger oldDbpropSchemaUsage = dbpropSchemaUsage;
		dbpropSchemaUsage = newDbpropSchemaUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_SCHEMA_USAGE, oldDbpropSchemaUsage, dbpropSchemaUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropSqlSupport() {
		return dbpropSqlSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropSqlSupport(BigInteger newDbpropSqlSupport) {
		BigInteger oldDbpropSqlSupport = dbpropSqlSupport;
		dbpropSqlSupport = newDbpropSqlSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_SQL_SUPPORT, oldDbpropSqlSupport, dbpropSqlSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropSubqueries() {
		return dbpropSubqueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropSubqueries(BigInteger newDbpropSubqueries) {
		BigInteger oldDbpropSubqueries = dbpropSubqueries;
		dbpropSubqueries = newDbpropSubqueries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_SUBQUERIES, oldDbpropSubqueries, dbpropSubqueries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropSupportedTxnDdl() {
		return dbpropSupportedTxnDdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropSupportedTxnDdl(BigInteger newDbpropSupportedTxnDdl) {
		BigInteger oldDbpropSupportedTxnDdl = dbpropSupportedTxnDdl;
		dbpropSupportedTxnDdl = newDbpropSupportedTxnDdl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL, oldDbpropSupportedTxnDdl, dbpropSupportedTxnDdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxSubqueries() {
		return mdpropMdxSubqueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxSubqueries(BigInteger newMdpropMdxSubqueries) {
		BigInteger oldMdpropMdxSubqueries = mdpropMdxSubqueries;
		mdpropMdxSubqueries = newMdpropMdxSubqueries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SUBQUERIES, oldMdpropMdxSubqueries, mdpropMdxSubqueries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropSupportedTxnIsoLevels() {
		return dbpropSupportedTxnIsoLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropSupportedTxnIsoLevels(BigInteger newDbpropSupportedTxnIsoLevels) {
		BigInteger oldDbpropSupportedTxnIsoLevels = dbpropSupportedTxnIsoLevels;
		dbpropSupportedTxnIsoLevels = newDbpropSupportedTxnIsoLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS, oldDbpropSupportedTxnIsoLevels, dbpropSupportedTxnIsoLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropSupportedTxnIsoRetain() {
		return dbpropSupportedTxnIsoRetain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropSupportedTxnIsoRetain(BigInteger newDbpropSupportedTxnIsoRetain) {
		BigInteger oldDbpropSupportedTxnIsoRetain = dbpropSupportedTxnIsoRetain;
		dbpropSupportedTxnIsoRetain = newDbpropSupportedTxnIsoRetain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN, oldDbpropSupportedTxnIsoRetain, dbpropSupportedTxnIsoRetain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropTableTerm() {
		return dbpropTableTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropTableTerm(String newDbpropTableTerm) {
		String oldDbpropTableTerm = dbpropTableTerm;
		dbpropTableTerm = newDbpropTableTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_TABLE_TERM, oldDbpropTableTerm, dbpropTableTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropAggregateCellUpdate getMdpropAggregateCellUpdate() {
		return mdpropAggregateCellUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropAggregateCellUpdate(MdpropAggregateCellUpdate newMdpropAggregateCellUpdate) {
		MdpropAggregateCellUpdate oldMdpropAggregateCellUpdate = mdpropAggregateCellUpdate;
		mdpropAggregateCellUpdate = newMdpropAggregateCellUpdate == null ? MDPROP_AGGREGATE_CELL_UPDATE_EDEFAULT : newMdpropAggregateCellUpdate;
		boolean oldMdpropAggregateCellUpdateESet = mdpropAggregateCellUpdateESet;
		mdpropAggregateCellUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE, oldMdpropAggregateCellUpdate, mdpropAggregateCellUpdate, !oldMdpropAggregateCellUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdpropAggregateCellUpdate() {
		MdpropAggregateCellUpdate oldMdpropAggregateCellUpdate = mdpropAggregateCellUpdate;
		boolean oldMdpropAggregateCellUpdateESet = mdpropAggregateCellUpdateESet;
		mdpropAggregateCellUpdate = MDPROP_AGGREGATE_CELL_UPDATE_EDEFAULT;
		mdpropAggregateCellUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE, oldMdpropAggregateCellUpdate, MDPROP_AGGREGATE_CELL_UPDATE_EDEFAULT, oldMdpropAggregateCellUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdpropAggregateCellUpdate() {
		return mdpropAggregateCellUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropAxes() {
		return mdpropAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropAxes(BigInteger newMdpropAxes) {
		BigInteger oldMdpropAxes = mdpropAxes;
		mdpropAxes = newMdpropAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_AXES, oldMdpropAxes, mdpropAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropFlatteningSupport getMdpropFlatteningSupport() {
		return mdpropFlatteningSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropFlatteningSupport(MdpropFlatteningSupport newMdpropFlatteningSupport) {
		MdpropFlatteningSupport oldMdpropFlatteningSupport = mdpropFlatteningSupport;
		mdpropFlatteningSupport = newMdpropFlatteningSupport == null ? MDPROP_FLATTENING_SUPPORT_EDEFAULT : newMdpropFlatteningSupport;
		boolean oldMdpropFlatteningSupportESet = mdpropFlatteningSupportESet;
		mdpropFlatteningSupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT, oldMdpropFlatteningSupport, mdpropFlatteningSupport, !oldMdpropFlatteningSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdpropFlatteningSupport() {
		MdpropFlatteningSupport oldMdpropFlatteningSupport = mdpropFlatteningSupport;
		boolean oldMdpropFlatteningSupportESet = mdpropFlatteningSupportESet;
		mdpropFlatteningSupport = MDPROP_FLATTENING_SUPPORT_EDEFAULT;
		mdpropFlatteningSupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT, oldMdpropFlatteningSupport, MDPROP_FLATTENING_SUPPORT_EDEFAULT, oldMdpropFlatteningSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdpropFlatteningSupport() {
		return mdpropFlatteningSupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxCaseSupport() {
		return mdpropMdxCaseSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxCaseSupport(BigInteger newMdpropMdxCaseSupport) {
		BigInteger oldMdpropMdxCaseSupport = mdpropMdxCaseSupport;
		mdpropMdxCaseSupport = newMdpropMdxCaseSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT, oldMdpropMdxCaseSupport, mdpropMdxCaseSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxDescFlags() {
		return mdpropMdxDescFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxDescFlags(BigInteger newMdpropMdxDescFlags) {
		BigInteger oldMdpropMdxDescFlags = mdpropMdxDescFlags;
		mdpropMdxDescFlags = newMdpropMdxDescFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS, oldMdpropMdxDescFlags, mdpropMdxDescFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxDrillFunctions() {
		return mdpropMdxDrillFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxDrillFunctions(BigInteger newMdpropMdxDrillFunctions) {
		BigInteger oldMdpropMdxDrillFunctions = mdpropMdxDrillFunctions;
		mdpropMdxDrillFunctions = newMdpropMdxDrillFunctions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS, oldMdpropMdxDrillFunctions, mdpropMdxDrillFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxFormulas() {
		return mdpropMdxFormulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxFormulas(BigInteger newMdpropMdxFormulas) {
		BigInteger oldMdpropMdxFormulas = mdpropMdxFormulas;
		mdpropMdxFormulas = newMdpropMdxFormulas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_FORMULAS, oldMdpropMdxFormulas, mdpropMdxFormulas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxJoinCubes() {
		return mdpropMdxJoinCubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxJoinCubes(BigInteger newMdpropMdxJoinCubes) {
		BigInteger oldMdpropMdxJoinCubes = mdpropMdxJoinCubes;
		mdpropMdxJoinCubes = newMdpropMdxJoinCubes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES, oldMdpropMdxJoinCubes, mdpropMdxJoinCubes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxMemberFunctions() {
		return mdpropMdxMemberFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxMemberFunctions(BigInteger newMdpropMdxMemberFunctions) {
		BigInteger oldMdpropMdxMemberFunctions = mdpropMdxMemberFunctions;
		mdpropMdxMemberFunctions = newMdpropMdxMemberFunctions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS, oldMdpropMdxMemberFunctions, mdpropMdxMemberFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxNonMeasureExpressions getMdpropMdxNonMeasureExpressions() {
		return mdpropMdxNonMeasureExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxNonMeasureExpressions(MdpropMdxNonMeasureExpressions newMdpropMdxNonMeasureExpressions) {
		MdpropMdxNonMeasureExpressions oldMdpropMdxNonMeasureExpressions = mdpropMdxNonMeasureExpressions;
		mdpropMdxNonMeasureExpressions = newMdpropMdxNonMeasureExpressions == null ? MDPROP_MDX_NON_MEASURE_EXPRESSIONS_EDEFAULT : newMdpropMdxNonMeasureExpressions;
		boolean oldMdpropMdxNonMeasureExpressionsESet = mdpropMdxNonMeasureExpressionsESet;
		mdpropMdxNonMeasureExpressionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS, oldMdpropMdxNonMeasureExpressions, mdpropMdxNonMeasureExpressions, !oldMdpropMdxNonMeasureExpressionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdpropMdxNonMeasureExpressions() {
		MdpropMdxNonMeasureExpressions oldMdpropMdxNonMeasureExpressions = mdpropMdxNonMeasureExpressions;
		boolean oldMdpropMdxNonMeasureExpressionsESet = mdpropMdxNonMeasureExpressionsESet;
		mdpropMdxNonMeasureExpressions = MDPROP_MDX_NON_MEASURE_EXPRESSIONS_EDEFAULT;
		mdpropMdxNonMeasureExpressionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS, oldMdpropMdxNonMeasureExpressions, MDPROP_MDX_NON_MEASURE_EXPRESSIONS_EDEFAULT, oldMdpropMdxNonMeasureExpressionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdpropMdxNonMeasureExpressions() {
		return mdpropMdxNonMeasureExpressionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxNumericFunctions() {
		return mdpropMdxNumericFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxNumericFunctions(BigInteger newMdpropMdxNumericFunctions) {
		BigInteger oldMdpropMdxNumericFunctions = mdpropMdxNumericFunctions;
		mdpropMdxNumericFunctions = newMdpropMdxNumericFunctions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS, oldMdpropMdxNumericFunctions, mdpropMdxNumericFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxObjQualification() {
		return mdpropMdxObjQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxObjQualification(BigInteger newMdpropMdxObjQualification) {
		BigInteger oldMdpropMdxObjQualification = mdpropMdxObjQualification;
		mdpropMdxObjQualification = newMdpropMdxObjQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION, oldMdpropMdxObjQualification, mdpropMdxObjQualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxOuterReference() {
		return mdpropMdxOuterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxOuterReference(BigInteger newMdpropMdxOuterReference) {
		BigInteger oldMdpropMdxOuterReference = mdpropMdxOuterReference;
		mdpropMdxOuterReference = newMdpropMdxOuterReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE, oldMdpropMdxOuterReference, mdpropMdxOuterReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMdpropMdxQueryByProperty() {
		return mdpropMdxQueryByProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxQueryByProperty(boolean newMdpropMdxQueryByProperty) {
		boolean oldMdpropMdxQueryByProperty = mdpropMdxQueryByProperty;
		mdpropMdxQueryByProperty = newMdpropMdxQueryByProperty;
		boolean oldMdpropMdxQueryByPropertyESet = mdpropMdxQueryByPropertyESet;
		mdpropMdxQueryByPropertyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY, oldMdpropMdxQueryByProperty, mdpropMdxQueryByProperty, !oldMdpropMdxQueryByPropertyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdpropMdxQueryByProperty() {
		boolean oldMdpropMdxQueryByProperty = mdpropMdxQueryByProperty;
		boolean oldMdpropMdxQueryByPropertyESet = mdpropMdxQueryByPropertyESet;
		mdpropMdxQueryByProperty = MDPROP_MDX_QUERY_BY_PROPERTY_EDEFAULT;
		mdpropMdxQueryByPropertyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY, oldMdpropMdxQueryByProperty, MDPROP_MDX_QUERY_BY_PROPERTY_EDEFAULT, oldMdpropMdxQueryByPropertyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdpropMdxQueryByProperty() {
		return mdpropMdxQueryByPropertyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxRangeRowset getMdpropMdxRangeRowset() {
		return mdpropMdxRangeRowset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxRangeRowset(MdpropMdxRangeRowset newMdpropMdxRangeRowset) {
		MdpropMdxRangeRowset oldMdpropMdxRangeRowset = mdpropMdxRangeRowset;
		mdpropMdxRangeRowset = newMdpropMdxRangeRowset == null ? MDPROP_MDX_RANGE_ROWSET_EDEFAULT : newMdpropMdxRangeRowset;
		boolean oldMdpropMdxRangeRowsetESet = mdpropMdxRangeRowsetESet;
		mdpropMdxRangeRowsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET, oldMdpropMdxRangeRowset, mdpropMdxRangeRowset, !oldMdpropMdxRangeRowsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdpropMdxRangeRowset() {
		MdpropMdxRangeRowset oldMdpropMdxRangeRowset = mdpropMdxRangeRowset;
		boolean oldMdpropMdxRangeRowsetESet = mdpropMdxRangeRowsetESet;
		mdpropMdxRangeRowset = MDPROP_MDX_RANGE_ROWSET_EDEFAULT;
		mdpropMdxRangeRowsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET, oldMdpropMdxRangeRowset, MDPROP_MDX_RANGE_ROWSET_EDEFAULT, oldMdpropMdxRangeRowsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdpropMdxRangeRowset() {
		return mdpropMdxRangeRowsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxSetFunctions() {
		return mdpropMdxSetFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxSetFunctions(BigInteger newMdpropMdxSetFunctions) {
		BigInteger oldMdpropMdxSetFunctions = mdpropMdxSetFunctions;
		mdpropMdxSetFunctions = newMdpropMdxSetFunctions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS, oldMdpropMdxSetFunctions, mdpropMdxSetFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxSlicer getMdpropMdxSlicer() {
		return mdpropMdxSlicer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxSlicer(MdpropMdxSlicer newMdpropMdxSlicer) {
		MdpropMdxSlicer oldMdpropMdxSlicer = mdpropMdxSlicer;
		mdpropMdxSlicer = newMdpropMdxSlicer == null ? MDPROP_MDX_SLICER_EDEFAULT : newMdpropMdxSlicer;
		boolean oldMdpropMdxSlicerESet = mdpropMdxSlicerESet;
		mdpropMdxSlicerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SLICER, oldMdpropMdxSlicer, mdpropMdxSlicer, !oldMdpropMdxSlicerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdpropMdxSlicer() {
		MdpropMdxSlicer oldMdpropMdxSlicer = mdpropMdxSlicer;
		boolean oldMdpropMdxSlicerESet = mdpropMdxSlicerESet;
		mdpropMdxSlicer = MDPROP_MDX_SLICER_EDEFAULT;
		mdpropMdxSlicerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SLICER, oldMdpropMdxSlicer, MDPROP_MDX_SLICER_EDEFAULT, oldMdpropMdxSlicerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdpropMdxSlicer() {
		return mdpropMdxSlicerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxStringCompop() {
		return mdpropMdxStringCompop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxStringCompop(BigInteger newMdpropMdxStringCompop) {
		BigInteger oldMdpropMdxStringCompop = mdpropMdxStringCompop;
		mdpropMdxStringCompop = newMdpropMdxStringCompop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP, oldMdpropMdxStringCompop, mdpropMdxStringCompop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropNamedLevels() {
		return mdpropNamedLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropNamedLevels(BigInteger newMdpropNamedLevels) {
		BigInteger oldMdpropNamedLevels = mdpropNamedLevels;
		mdpropNamedLevels = newMdpropNamedLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_NAMED_LEVELS, oldMdpropNamedLevels, mdpropNamedLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdMDXCompatibility getDbpropMsmdMDXCompatibility() {
		return dbpropMsmdMDXCompatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdMDXCompatibility(DbpropMsmdMDXCompatibility newDbpropMsmdMDXCompatibility) {
		DbpropMsmdMDXCompatibility oldDbpropMsmdMDXCompatibility = dbpropMsmdMDXCompatibility;
		dbpropMsmdMDXCompatibility = newDbpropMsmdMDXCompatibility == null ? DBPROP_MSMD_MDX_COMPATIBILITY_EDEFAULT : newDbpropMsmdMDXCompatibility;
		boolean oldDbpropMsmdMDXCompatibilityESet = dbpropMsmdMDXCompatibilityESet;
		dbpropMsmdMDXCompatibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY, oldDbpropMsmdMDXCompatibility, dbpropMsmdMDXCompatibility, !oldDbpropMsmdMDXCompatibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMsmdMDXCompatibility() {
		DbpropMsmdMDXCompatibility oldDbpropMsmdMDXCompatibility = dbpropMsmdMDXCompatibility;
		boolean oldDbpropMsmdMDXCompatibilityESet = dbpropMsmdMDXCompatibilityESet;
		dbpropMsmdMDXCompatibility = DBPROP_MSMD_MDX_COMPATIBILITY_EDEFAULT;
		dbpropMsmdMDXCompatibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY, oldDbpropMsmdMDXCompatibility, DBPROP_MSMD_MDX_COMPATIBILITY_EDEFAULT, oldDbpropMsmdMDXCompatibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMsmdMDXCompatibility() {
		return dbpropMsmdMDXCompatibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdSQLCompatibility() {
		return dbpropMsmdSQLCompatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdSQLCompatibility(BigInteger newDbpropMsmdSQLCompatibility) {
		BigInteger oldDbpropMsmdSQLCompatibility = dbpropMsmdSQLCompatibility;
		dbpropMsmdSQLCompatibility = newDbpropMsmdSQLCompatibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY, oldDbpropMsmdSQLCompatibility, dbpropMsmdSQLCompatibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdMDXUniqueNameStyle() {
		return dbpropMsmdMDXUniqueNameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdMDXUniqueNameStyle(BigInteger newDbpropMsmdMDXUniqueNameStyle) {
		BigInteger oldDbpropMsmdMDXUniqueNameStyle = dbpropMsmdMDXUniqueNameStyle;
		dbpropMsmdMDXUniqueNameStyle = newDbpropMsmdMDXUniqueNameStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE, oldDbpropMsmdMDXUniqueNameStyle, dbpropMsmdMDXUniqueNameStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdCachePolicy() {
		return dbpropMsmdCachePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdCachePolicy(BigInteger newDbpropMsmdCachePolicy) {
		BigInteger oldDbpropMsmdCachePolicy = dbpropMsmdCachePolicy;
		dbpropMsmdCachePolicy = newDbpropMsmdCachePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY, oldDbpropMsmdCachePolicy, dbpropMsmdCachePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdCacheRatio() {
		return dbpropMsmdCacheRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdCacheRatio(BigInteger newDbpropMsmdCacheRatio) {
		BigInteger oldDbpropMsmdCacheRatio = dbpropMsmdCacheRatio;
		dbpropMsmdCacheRatio = newDbpropMsmdCacheRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO, oldDbpropMsmdCacheRatio, dbpropMsmdCacheRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdCacheMode() {
		return dbpropMsmdCacheMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdCacheMode(BigInteger newDbpropMsmdCacheMode) {
		BigInteger oldDbpropMsmdCacheMode = dbpropMsmdCacheMode;
		dbpropMsmdCacheMode = newDbpropMsmdCacheMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE, oldDbpropMsmdCacheMode, dbpropMsmdCacheMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdCompareCaseSensitiveStringFlags getDbpropMsmdCompareCaseSensitiveStringFlags() {
		return dbpropMsmdCompareCaseSensitiveStringFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdCompareCaseSensitiveStringFlags(DbpropMsmdCompareCaseSensitiveStringFlags newDbpropMsmdCompareCaseSensitiveStringFlags) {
		DbpropMsmdCompareCaseSensitiveStringFlags oldDbpropMsmdCompareCaseSensitiveStringFlags = dbpropMsmdCompareCaseSensitiveStringFlags;
		dbpropMsmdCompareCaseSensitiveStringFlags = newDbpropMsmdCompareCaseSensitiveStringFlags == null ? DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_EDEFAULT : newDbpropMsmdCompareCaseSensitiveStringFlags;
		boolean oldDbpropMsmdCompareCaseSensitiveStringFlagsESet = dbpropMsmdCompareCaseSensitiveStringFlagsESet;
		dbpropMsmdCompareCaseSensitiveStringFlagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS, oldDbpropMsmdCompareCaseSensitiveStringFlags, dbpropMsmdCompareCaseSensitiveStringFlags, !oldDbpropMsmdCompareCaseSensitiveStringFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMsmdCompareCaseSensitiveStringFlags() {
		DbpropMsmdCompareCaseSensitiveStringFlags oldDbpropMsmdCompareCaseSensitiveStringFlags = dbpropMsmdCompareCaseSensitiveStringFlags;
		boolean oldDbpropMsmdCompareCaseSensitiveStringFlagsESet = dbpropMsmdCompareCaseSensitiveStringFlagsESet;
		dbpropMsmdCompareCaseSensitiveStringFlags = DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_EDEFAULT;
		dbpropMsmdCompareCaseSensitiveStringFlagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS, oldDbpropMsmdCompareCaseSensitiveStringFlags, DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_EDEFAULT, oldDbpropMsmdCompareCaseSensitiveStringFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMsmdCompareCaseSensitiveStringFlags() {
		return dbpropMsmdCompareCaseSensitiveStringFlagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdCompareCaseNotSensitiveStringFlags() {
		return dbpropMsmdCompareCaseNotSensitiveStringFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdCompareCaseNotSensitiveStringFlags(BigInteger newDbpropMsmdCompareCaseNotSensitiveStringFlags) {
		BigInteger oldDbpropMsmdCompareCaseNotSensitiveStringFlags = dbpropMsmdCompareCaseNotSensitiveStringFlags;
		dbpropMsmdCompareCaseNotSensitiveStringFlags = newDbpropMsmdCompareCaseNotSensitiveStringFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS, oldDbpropMsmdCompareCaseNotSensitiveStringFlags, dbpropMsmdCompareCaseNotSensitiveStringFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDbpropMsmdFlattened2() {
		return dbpropMsmdFlattened2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdFlattened2(boolean newDbpropMsmdFlattened2) {
		boolean oldDbpropMsmdFlattened2 = dbpropMsmdFlattened2;
		dbpropMsmdFlattened2 = newDbpropMsmdFlattened2;
		boolean oldDbpropMsmdFlattened2ESet = dbpropMsmdFlattened2ESet;
		dbpropMsmdFlattened2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_FLATTENED2, oldDbpropMsmdFlattened2, dbpropMsmdFlattened2, !oldDbpropMsmdFlattened2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMsmdFlattened2() {
		boolean oldDbpropMsmdFlattened2 = dbpropMsmdFlattened2;
		boolean oldDbpropMsmdFlattened2ESet = dbpropMsmdFlattened2ESet;
		dbpropMsmdFlattened2 = DBPROP_MSMD_FLATTENED2_EDEFAULT;
		dbpropMsmdFlattened2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_FLATTENED2, oldDbpropMsmdFlattened2, DBPROP_MSMD_FLATTENED2_EDEFAULT, oldDbpropMsmdFlattened2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMsmdFlattened2() {
		return dbpropMsmdFlattened2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropInitMode() {
		return dbpropInitMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropInitMode(BigInteger newDbpropInitMode) {
		BigInteger oldDbpropInitMode = dbpropInitMode;
		dbpropInitMode = newDbpropInitMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_INIT_MODE, oldDbpropInitMode, dbpropInitMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSspropInitAppName() {
		return sspropInitAppName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSspropInitAppName(String newSspropInitAppName) {
		String oldSspropInitAppName = sspropInitAppName;
		sspropInitAppName = newSspropInitAppName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SSPROP_INIT_APP_NAME, oldSspropInitAppName, sspropInitAppName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSspropInitWsid() {
		return sspropInitWsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSspropInitWsid(String newSspropInitWsid) {
		String oldSspropInitWsid = sspropInitWsid;
		sspropInitWsid = newSspropInitWsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SSPROP_INIT_WSID, oldSspropInitWsid, sspropInitWsid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSspropInitPacketsize() {
		return sspropInitPacketsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSspropInitPacketsize(BigInteger newSspropInitPacketsize) {
		BigInteger oldSspropInitPacketsize = sspropInitPacketsize;
		sspropInitPacketsize = newSspropInitPacketsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SSPROP_INIT_PACKETSIZE, oldSspropInitPacketsize, sspropInitPacketsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getReadOnlySession() {
		return readOnlySession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnlySession(BigInteger newReadOnlySession) {
		BigInteger oldReadOnlySession = readOnlySession;
		readOnlySession = newReadOnlySession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__READ_ONLY_SESSION, oldReadOnlySession, readOnlySession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuredCellValue getSecuredCellValue() {
		return securedCellValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuredCellValue(SecuredCellValue newSecuredCellValue) {
		SecuredCellValue oldSecuredCellValue = securedCellValue;
		securedCellValue = newSecuredCellValue == null ? SECURED_CELL_VALUE_EDEFAULT : newSecuredCellValue;
		boolean oldSecuredCellValueESet = securedCellValueESet;
		securedCellValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SECURED_CELL_VALUE, oldSecuredCellValue, securedCellValue, !oldSecuredCellValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecuredCellValue() {
		SecuredCellValue oldSecuredCellValue = securedCellValue;
		boolean oldSecuredCellValueESet = securedCellValueESet;
		securedCellValue = SECURED_CELL_VALUE_EDEFAULT;
		securedCellValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__SECURED_CELL_VALUE, oldSecuredCellValue, SECURED_CELL_VALUE_EDEFAULT, oldSecuredCellValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecuredCellValue() {
		return securedCellValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNonEmptyThreshold() {
		return nonEmptyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonEmptyThreshold(BigInteger newNonEmptyThreshold) {
		BigInteger oldNonEmptyThreshold = nonEmptyThreshold;
		nonEmptyThreshold = newNonEmptyThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__NON_EMPTY_THRESHOLD, oldNonEmptyThreshold, nonEmptyThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyOptions getSafetyOptions() {
		return safetyOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetyOptions(SafetyOptions newSafetyOptions) {
		SafetyOptions oldSafetyOptions = safetyOptions;
		safetyOptions = newSafetyOptions == null ? SAFETY_OPTIONS_EDEFAULT : newSafetyOptions;
		boolean oldSafetyOptionsESet = safetyOptionsESet;
		safetyOptionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SAFETY_OPTIONS, oldSafetyOptions, safetyOptions, !oldSafetyOptionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSafetyOptions() {
		SafetyOptions oldSafetyOptions = safetyOptions;
		boolean oldSafetyOptionsESet = safetyOptionsESet;
		safetyOptions = SAFETY_OPTIONS_EDEFAULT;
		safetyOptionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__SAFETY_OPTIONS, oldSafetyOptions, SAFETY_OPTIONS_EDEFAULT, oldSafetyOptionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSafetyOptions() {
		return safetyOptionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDbpropMsmdCacheRatio2() {
		return dbpropMsmdCacheRatio2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdCacheRatio2(double newDbpropMsmdCacheRatio2) {
		double oldDbpropMsmdCacheRatio2 = dbpropMsmdCacheRatio2;
		dbpropMsmdCacheRatio2 = newDbpropMsmdCacheRatio2;
		boolean oldDbpropMsmdCacheRatio2ESet = dbpropMsmdCacheRatio2ESet;
		dbpropMsmdCacheRatio2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2, oldDbpropMsmdCacheRatio2, dbpropMsmdCacheRatio2, !oldDbpropMsmdCacheRatio2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMsmdCacheRatio2() {
		double oldDbpropMsmdCacheRatio2 = dbpropMsmdCacheRatio2;
		boolean oldDbpropMsmdCacheRatio2ESet = dbpropMsmdCacheRatio2ESet;
		dbpropMsmdCacheRatio2 = DBPROP_MSMD_CACHE_RATIO2_EDEFAULT;
		dbpropMsmdCacheRatio2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2, oldDbpropMsmdCacheRatio2, DBPROP_MSMD_CACHE_RATIO2_EDEFAULT, oldDbpropMsmdCacheRatio2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMsmdCacheRatio2() {
		return dbpropMsmdCacheRatio2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropMsmdUseFormulaCache() {
		return dbpropMsmdUseFormulaCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdUseFormulaCache(String newDbpropMsmdUseFormulaCache) {
		String oldDbpropMsmdUseFormulaCache = dbpropMsmdUseFormulaCache;
		dbpropMsmdUseFormulaCache = newDbpropMsmdUseFormulaCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE, oldDbpropMsmdUseFormulaCache, dbpropMsmdUseFormulaCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdDynamicDebugLimit() {
		return dbpropMsmdDynamicDebugLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdDynamicDebugLimit(BigInteger newDbpropMsmdDynamicDebugLimit) {
		BigInteger oldDbpropMsmdDynamicDebugLimit = dbpropMsmdDynamicDebugLimit;
		dbpropMsmdDynamicDebugLimit = newDbpropMsmdDynamicDebugLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT, oldDbpropMsmdDynamicDebugLimit, dbpropMsmdDynamicDebugLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropMsmdDebugMode() {
		return dbpropMsmdDebugMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdDebugMode(String newDbpropMsmdDebugMode) {
		String oldDbpropMsmdDebugMode = dbpropMsmdDebugMode;
		dbpropMsmdDebugMode = newDbpropMsmdDebugMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE, oldDbpropMsmdDebugMode, dbpropMsmdDebugMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialect getDialect() {
		return dialect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialect(Dialect newDialect) {
		Dialect oldDialect = dialect;
		dialect = newDialect == null ? DIALECT_EDEFAULT : newDialect;
		boolean oldDialectESet = dialectESet;
		dialectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DIALECT, oldDialect, dialect, !oldDialectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDialect() {
		Dialect oldDialect = dialect;
		boolean oldDialectESet = dialectESet;
		dialect = DIALECT_EDEFAULT;
		dialectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DIALECT, oldDialect, DIALECT_EDEFAULT, oldDialectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDialect() {
		return dialectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImpactAnalysis() {
		return impactAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactAnalysis(boolean newImpactAnalysis) {
		boolean oldImpactAnalysis = impactAnalysis;
		impactAnalysis = newImpactAnalysis;
		boolean oldImpactAnalysisESet = impactAnalysisESet;
		impactAnalysisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__IMPACT_ANALYSIS, oldImpactAnalysis, impactAnalysis, !oldImpactAnalysisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpactAnalysis() {
		boolean oldImpactAnalysis = impactAnalysis;
		boolean oldImpactAnalysisESet = impactAnalysisESet;
		impactAnalysis = IMPACT_ANALYSIS_EDEFAULT;
		impactAnalysisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__IMPACT_ANALYSIS, oldImpactAnalysis, IMPACT_ANALYSIS_EDEFAULT, oldImpactAnalysisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpactAnalysis() {
		return impactAnalysisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQueryMode getSQLQueryMode() {
		return sQLQueryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQLQueryMode(SQLQueryMode newSQLQueryMode) {
		SQLQueryMode oldSQLQueryMode = sQLQueryMode;
		sQLQueryMode = newSQLQueryMode == null ? SQL_QUERY_MODE_EDEFAULT : newSQLQueryMode;
		boolean oldSQLQueryModeESet = sQLQueryModeESet;
		sQLQueryModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__SQL_QUERY_MODE, oldSQLQueryMode, sQLQueryMode, !oldSQLQueryModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSQLQueryMode() {
		SQLQueryMode oldSQLQueryMode = sQLQueryMode;
		boolean oldSQLQueryModeESet = sQLQueryModeESet;
		sQLQueryMode = SQL_QUERY_MODE_EDEFAULT;
		sQLQueryModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__SQL_QUERY_MODE, oldSQLQueryMode, SQL_QUERY_MODE_EDEFAULT, oldSQLQueryModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSQLQueryMode() {
		return sQLQueryModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getClientProcessID() {
		return clientProcessID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientProcessID(BigInteger newClientProcessID) {
		BigInteger oldClientProcessID = clientProcessID;
		clientProcessID = newClientProcessID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__CLIENT_PROCESS_ID, oldClientProcessID, clientProcessID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCube() {
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCube(String newCube) {
		String oldCube = cube;
		cube = newCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__CUBE, oldCube, cube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnCellProperties() {
		return returnCellProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnCellProperties(boolean newReturnCellProperties) {
		boolean oldReturnCellProperties = returnCellProperties;
		returnCellProperties = newReturnCellProperties;
		boolean oldReturnCellPropertiesESet = returnCellPropertiesESet;
		returnCellPropertiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__RETURN_CELL_PROPERTIES, oldReturnCellProperties, returnCellProperties, !oldReturnCellPropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnCellProperties() {
		boolean oldReturnCellProperties = returnCellProperties;
		boolean oldReturnCellPropertiesESet = returnCellPropertiesESet;
		returnCellProperties = RETURN_CELL_PROPERTIES_EDEFAULT;
		returnCellPropertiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__RETURN_CELL_PROPERTIES, oldReturnCellProperties, RETURN_CELL_PROPERTIES_EDEFAULT, oldReturnCellPropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnCellProperties() {
		return returnCellPropertiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCommitTimeout() {
		return commitTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitTimeout(BigInteger newCommitTimeout) {
		BigInteger oldCommitTimeout = commitTimeout;
		commitTimeout = newCommitTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__COMMIT_TIMEOUT, oldCommitTimeout, commitTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getForceCommitTimeout() {
		return forceCommitTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceCommitTimeout(BigInteger newForceCommitTimeout) {
		BigInteger oldForceCommitTimeout = forceCommitTimeout;
		forceCommitTimeout = newForceCommitTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__FORCE_COMMIT_TIMEOUT, oldForceCommitTimeout, forceCommitTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionMode() {
		return executionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionMode(String newExecutionMode) {
		String oldExecutionMode = executionMode;
		executionMode = newExecutionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__EXECUTION_MODE, oldExecutionMode, executionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRealTimeOlap() {
		return realTimeOlap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealTimeOlap(boolean newRealTimeOlap) {
		boolean oldRealTimeOlap = realTimeOlap;
		realTimeOlap = newRealTimeOlap;
		boolean oldRealTimeOlapESet = realTimeOlapESet;
		realTimeOlapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__REAL_TIME_OLAP, oldRealTimeOlap, realTimeOlap, !oldRealTimeOlapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRealTimeOlap() {
		boolean oldRealTimeOlap = realTimeOlap;
		boolean oldRealTimeOlapESet = realTimeOlapESet;
		realTimeOlap = REAL_TIME_OLAP_EDEFAULT;
		realTimeOlapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__REAL_TIME_OLAP, oldRealTimeOlap, REAL_TIME_OLAP_EDEFAULT, oldRealTimeOlapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRealTimeOlap() {
		return realTimeOlapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberMode getMdxMissingMemberMode() {
		return mdxMissingMemberMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdxMissingMemberMode(MdxMissingMemberMode newMdxMissingMemberMode) {
		MdxMissingMemberMode oldMdxMissingMemberMode = mdxMissingMemberMode;
		mdxMissingMemberMode = newMdxMissingMemberMode == null ? MDX_MISSING_MEMBER_MODE_EDEFAULT : newMdxMissingMemberMode;
		boolean oldMdxMissingMemberModeESet = mdxMissingMemberModeESet;
		mdxMissingMemberModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDX_MISSING_MEMBER_MODE, oldMdxMissingMemberMode, mdxMissingMemberMode, !oldMdxMissingMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdxMissingMemberMode() {
		MdxMissingMemberMode oldMdxMissingMemberMode = mdxMissingMemberMode;
		boolean oldMdxMissingMemberModeESet = mdxMissingMemberModeESet;
		mdxMissingMemberMode = MDX_MISSING_MEMBER_MODE_EDEFAULT;
		mdxMissingMemberModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MDX_MISSING_MEMBER_MODE, oldMdxMissingMemberMode, MDX_MISSING_MEMBER_MODE_EDEFAULT, oldMdxMissingMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdxMissingMemberMode() {
		return mdxMissingMemberModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxNamedSets() {
		return mdpropMdxNamedSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxNamedSets(BigInteger newMdpropMdxNamedSets) {
		BigInteger oldMdpropMdxNamedSets = mdpropMdxNamedSets;
		mdpropMdxNamedSets = newMdpropMdxNamedSets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NAMED_SETS, oldMdpropMdxNamedSets, mdpropMdxNamedSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdSubqueries getDbpropMsmdSubqueries() {
		return dbpropMsmdSubqueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdSubqueries(DbpropMsmdSubqueries newDbpropMsmdSubqueries) {
		DbpropMsmdSubqueries oldDbpropMsmdSubqueries = dbpropMsmdSubqueries;
		dbpropMsmdSubqueries = newDbpropMsmdSubqueries == null ? DBPROP_MSMD_SUBQUERIES_EDEFAULT : newDbpropMsmdSubqueries;
		boolean oldDbpropMsmdSubqueriesESet = dbpropMsmdSubqueriesESet;
		dbpropMsmdSubqueriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES, oldDbpropMsmdSubqueries, dbpropMsmdSubqueries, !oldDbpropMsmdSubqueriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMsmdSubqueries() {
		DbpropMsmdSubqueries oldDbpropMsmdSubqueries = dbpropMsmdSubqueries;
		boolean oldDbpropMsmdSubqueriesESet = dbpropMsmdSubqueriesESet;
		dbpropMsmdSubqueries = DBPROP_MSMD_SUBQUERIES_EDEFAULT;
		dbpropMsmdSubqueriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES, oldDbpropMsmdSubqueries, DBPROP_MSMD_SUBQUERIES_EDEFAULT, oldDbpropMsmdSubqueriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMsmdSubqueries() {
		return dbpropMsmdSubqueriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdAutoExists getDbpropMsmdAutoExists() {
		return dbpropMsmdAutoExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdAutoExists(DbpropMsmdAutoExists newDbpropMsmdAutoExists) {
		DbpropMsmdAutoExists oldDbpropMsmdAutoExists = dbpropMsmdAutoExists;
		dbpropMsmdAutoExists = newDbpropMsmdAutoExists == null ? DBPROP_MSMD_AUTO_EXISTS_EDEFAULT : newDbpropMsmdAutoExists;
		boolean oldDbpropMsmdAutoExistsESet = dbpropMsmdAutoExistsESet;
		dbpropMsmdAutoExistsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS, oldDbpropMsmdAutoExists, dbpropMsmdAutoExists, !oldDbpropMsmdAutoExistsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbpropMsmdAutoExists() {
		DbpropMsmdAutoExists oldDbpropMsmdAutoExists = dbpropMsmdAutoExists;
		boolean oldDbpropMsmdAutoExistsESet = dbpropMsmdAutoExistsESet;
		dbpropMsmdAutoExists = DBPROP_MSMD_AUTO_EXISTS_EDEFAULT;
		dbpropMsmdAutoExistsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS, oldDbpropMsmdAutoExists, DBPROP_MSMD_AUTO_EXISTS_EDEFAULT, oldDbpropMsmdAutoExistsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbpropMsmdAutoExists() {
		return dbpropMsmdAutoExistsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomData() {
		return customData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomData(String newCustomData) {
		String oldCustomData = customData;
		customData = newCustomData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__CUSTOM_DATA, oldCustomData, customData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisablePrefetchFacts() {
		return disablePrefetchFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisablePrefetchFacts(boolean newDisablePrefetchFacts) {
		boolean oldDisablePrefetchFacts = disablePrefetchFacts;
		disablePrefetchFacts = newDisablePrefetchFacts;
		boolean oldDisablePrefetchFactsESet = disablePrefetchFactsESet;
		disablePrefetchFactsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DISABLE_PREFETCH_FACTS, oldDisablePrefetchFacts, disablePrefetchFacts, !oldDisablePrefetchFactsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisablePrefetchFacts() {
		boolean oldDisablePrefetchFacts = disablePrefetchFacts;
		boolean oldDisablePrefetchFactsESet = disablePrefetchFactsESet;
		disablePrefetchFacts = DISABLE_PREFETCH_FACTS_EDEFAULT;
		disablePrefetchFactsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__DISABLE_PREFETCH_FACTS, oldDisablePrefetchFacts, DISABLE_PREFETCH_FACTS_EDEFAULT, oldDisablePrefetchFactsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisablePrefetchFacts() {
		return disablePrefetchFactsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateIsolationLevel getUpdateIsolationLevel() {
		return updateIsolationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateIsolationLevel(UpdateIsolationLevel newUpdateIsolationLevel) {
		UpdateIsolationLevel oldUpdateIsolationLevel = updateIsolationLevel;
		updateIsolationLevel = newUpdateIsolationLevel == null ? UPDATE_ISOLATION_LEVEL_EDEFAULT : newUpdateIsolationLevel;
		boolean oldUpdateIsolationLevelESet = updateIsolationLevelESet;
		updateIsolationLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__UPDATE_ISOLATION_LEVEL, oldUpdateIsolationLevel, updateIsolationLevel, !oldUpdateIsolationLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateIsolationLevel() {
		UpdateIsolationLevel oldUpdateIsolationLevel = updateIsolationLevel;
		boolean oldUpdateIsolationLevelESet = updateIsolationLevelESet;
		updateIsolationLevel = UPDATE_ISOLATION_LEVEL_EDEFAULT;
		updateIsolationLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__UPDATE_ISOLATION_LEVEL, oldUpdateIsolationLevel, UPDATE_ISOLATION_LEVEL_EDEFAULT, oldUpdateIsolationLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateIsolationLevel() {
		return updateIsolationLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdErrorMessageMode() {
		return dbpropMsmdErrorMessageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdErrorMessageMode(BigInteger newDbpropMsmdErrorMessageMode) {
		BigInteger oldDbpropMsmdErrorMessageMode = dbpropMsmdErrorMessageMode;
		dbpropMsmdErrorMessageMode = newDbpropMsmdErrorMessageMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE, oldDbpropMsmdErrorMessageMode, dbpropMsmdErrorMessageMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMdpropMdxDdlExtensions() {
		return mdpropMdxDdlExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdpropMdxDdlExtensions(BigInteger newMdpropMdxDdlExtensions) {
		BigInteger oldMdpropMdxDdlExtensions = mdpropMdxDdlExtensions;
		mdpropMdxDdlExtensions = newMdpropMdxDdlExtensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS, oldMdpropMdxDdlExtensions, mdpropMdxDdlExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEncoding getResponseEncoding() {
		return responseEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseEncoding(ResponseEncoding newResponseEncoding) {
		ResponseEncoding oldResponseEncoding = responseEncoding;
		responseEncoding = newResponseEncoding == null ? RESPONSE_ENCODING_EDEFAULT : newResponseEncoding;
		boolean oldResponseEncodingESet = responseEncodingESet;
		responseEncodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__RESPONSE_ENCODING, oldResponseEncoding, responseEncoding, !oldResponseEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseEncoding() {
		ResponseEncoding oldResponseEncoding = responseEncoding;
		boolean oldResponseEncodingESet = responseEncodingESet;
		responseEncoding = RESPONSE_ENCODING_EDEFAULT;
		responseEncodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__RESPONSE_ENCODING, oldResponseEncoding, RESPONSE_ENCODING_EDEFAULT, oldResponseEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseEncoding() {
		return responseEncodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLockingMode getMemoryLockingMode() {
		return memoryLockingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryLockingMode(MemoryLockingMode newMemoryLockingMode) {
		MemoryLockingMode oldMemoryLockingMode = memoryLockingMode;
		memoryLockingMode = newMemoryLockingMode == null ? MEMORY_LOCKING_MODE_EDEFAULT : newMemoryLockingMode;
		boolean oldMemoryLockingModeESet = memoryLockingModeESet;
		memoryLockingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__MEMORY_LOCKING_MODE, oldMemoryLockingMode, memoryLockingMode, !oldMemoryLockingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemoryLockingMode() {
		MemoryLockingMode oldMemoryLockingMode = memoryLockingMode;
		boolean oldMemoryLockingModeESet = memoryLockingModeESet;
		memoryLockingMode = MEMORY_LOCKING_MODE_EDEFAULT;
		memoryLockingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROPERTY_LIST__MEMORY_LOCKING_MODE, oldMemoryLockingMode, MEMORY_LOCKING_MODE_EDEFAULT, oldMemoryLockingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemoryLockingMode() {
		return memoryLockingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdOptimizeResponse() {
		return dbpropMsmdOptimizeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdOptimizeResponse(BigInteger newDbpropMsmdOptimizeResponse) {
		BigInteger oldDbpropMsmdOptimizeResponse = dbpropMsmdOptimizeResponse;
		dbpropMsmdOptimizeResponse = newDbpropMsmdOptimizeResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE, oldDbpropMsmdOptimizeResponse, dbpropMsmdOptimizeResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropMsmdActivityID() {
		return dbpropMsmdActivityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdActivityID(String newDbpropMsmdActivityID) {
		String oldDbpropMsmdActivityID = dbpropMsmdActivityID;
		dbpropMsmdActivityID = newDbpropMsmdActivityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID, oldDbpropMsmdActivityID, dbpropMsmdActivityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbpropMsmdRequestID() {
		return dbpropMsmdRequestID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdRequestID(String newDbpropMsmdRequestID) {
		String oldDbpropMsmdRequestID = dbpropMsmdRequestID;
		dbpropMsmdRequestID = newDbpropMsmdRequestID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID, oldDbpropMsmdRequestID, dbpropMsmdRequestID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getReturnAffectedObjects() {
		return returnAffectedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnAffectedObjects(BigInteger newReturnAffectedObjects) {
		BigInteger oldReturnAffectedObjects = returnAffectedObjects;
		returnAffectedObjects = newReturnAffectedObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__RETURN_AFFECTED_OBJECTS, oldReturnAffectedObjects, returnAffectedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDbpropMsmdRequestMemoryLimit() {
		return dbpropMsmdRequestMemoryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpropMsmdRequestMemoryLimit(BigInteger newDbpropMsmdRequestMemoryLimit) {
		BigInteger oldDbpropMsmdRequestMemoryLimit = dbpropMsmdRequestMemoryLimit;
		dbpropMsmdRequestMemoryLimit = newDbpropMsmdRequestMemoryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT, oldDbpropMsmdRequestMemoryLimit, dbpropMsmdRequestMemoryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationContext() {
		return applicationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationContext(String newApplicationContext) {
		String oldApplicationContext = applicationContext;
		applicationContext = newApplicationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROPERTY_LIST__APPLICATION_CONTEXT, oldApplicationContext, applicationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.PROPERTY_LIST__DATA_SOURCE_INFO:
				return getDataSourceInfo();
			case XmlaPackage.PROPERTY_LIST__TIMEOUT:
				return getTimeout();
			case XmlaPackage.PROPERTY_LIST__USER_NAME:
				return getUserName();
			case XmlaPackage.PROPERTY_LIST__PASSWORD:
				return getPassword();
			case XmlaPackage.PROPERTY_LIST__LOCALE_IDENTIFIER:
				return getLocaleIdentifier();
			case XmlaPackage.PROPERTY_LIST__CATALOG:
				return getCatalog();
			case XmlaPackage.PROPERTY_LIST__STATE_SUPPORT:
				return getStateSupport();
			case XmlaPackage.PROPERTY_LIST__CONTENT:
				return getContent();
			case XmlaPackage.PROPERTY_LIST__FORMAT:
				return getFormat();
			case XmlaPackage.PROPERTY_LIST__AXIS_FORMAT:
				return getAxisFormat();
			case XmlaPackage.PROPERTY_LIST__BEGIN_RANGE:
				return getBeginRange();
			case XmlaPackage.PROPERTY_LIST__END_RANGE:
				return getEndRange();
			case XmlaPackage.PROPERTY_LIST__MDX_SUPPORT:
				return getMDXSupport();
			case XmlaPackage.PROPERTY_LIST__PROVIDER_NAME:
				return getProviderName();
			case XmlaPackage.PROPERTY_LIST__PROVIDER_VERSION:
				return getProviderVersion();
			case XmlaPackage.PROPERTY_LIST__DBMS_VERSION:
				return getDBMSVersion();
			case XmlaPackage.PROPERTY_LIST__PROVIDER_TYPE:
				return getProviderType();
			case XmlaPackage.PROPERTY_LIST__SHOW_HIDDEN_CUBES:
				return isShowHiddenCubes();
			case XmlaPackage.PROPERTY_LIST__SQL_SUPPORT:
				return getSQLSupport();
			case XmlaPackage.PROPERTY_LIST__TRANSACTION_DDL:
				return getTransactionDDL();
			case XmlaPackage.PROPERTY_LIST__MAXIMUM_ROWS:
				return getMaximumRows();
			case XmlaPackage.PROPERTY_LIST__ROLES:
				return getRoles();
			case XmlaPackage.PROPERTY_LIST__VISUAL_MODE:
				return getVisualMode();
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_ROLES:
				return getEffectiveRoles();
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_USER_NAME:
				return getEffectiveUserName();
			case XmlaPackage.PROPERTY_LIST__SERVER_NAME:
				return getServerName();
			case XmlaPackage.PROPERTY_LIST__CATALOG_LOCATION:
				return getCatalogLocation();
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_TERM:
				return getDbpropCatalogTerm();
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_USAGE:
				return getDbpropCatalogUsage();
			case XmlaPackage.PROPERTY_LIST__DBPROP_COLUMN_DEFINITION:
				return getDbpropColumnDefinition();
			case XmlaPackage.PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR:
				return getDbpropConcatNullBehavior();
			case XmlaPackage.PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY:
				return isDbpropDataSourceReadOnly();
			case XmlaPackage.PROPERTY_LIST__DBPROP_GROUP_BY:
				return getDbpropGroupBy();
			case XmlaPackage.PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES:
				return getDbpropHeterogeneousTables();
			case XmlaPackage.PROPERTY_LIST__DBPROP_IDENTIFIER_CASE:
				return getDbpropIdentifierCase();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE:
				return getDbpropMaxIndexSize();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS:
				return getDbpropMaxOpenChapters();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE:
				return getDbpropMaxRowSize();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB:
				return isDbpropMaxRowSizeIncludeBlob();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT:
				return getDbpropMaxTablesInSelect();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE:
				return isDbpropMultiTableUpdate();
			case XmlaPackage.PROPERTY_LIST__DBPROP_NULL_COLLATION:
				return getDbpropNullCollation();
			case XmlaPackage.PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT:
				return isDbpropOrderByColumnsInSelect();
			case XmlaPackage.PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE:
				return getDbpropOutputParameterAvailable();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE:
				return getDbpropPersistentIdType();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR:
				return getDbpropPrepareAbortBehavior();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR:
				return getDbpropPrepareCommitBehavior();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PROCEDURE_TERM:
				return getDbpropProcedureTerm();
			case XmlaPackage.PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE:
				return getDbpropQuotedIdentifierCase();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SCHEMA_USAGE:
				return getDbpropSchemaUsage();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SQL_SUPPORT:
				return getDbpropSqlSupport();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUBQUERIES:
				return getDbpropSubqueries();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL:
				return getDbpropSupportedTxnDdl();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SUBQUERIES:
				return getMdpropMdxSubqueries();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS:
				return getDbpropSupportedTxnIsoLevels();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN:
				return getDbpropSupportedTxnIsoRetain();
			case XmlaPackage.PROPERTY_LIST__DBPROP_TABLE_TERM:
				return getDbpropTableTerm();
			case XmlaPackage.PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE:
				return getMdpropAggregateCellUpdate();
			case XmlaPackage.PROPERTY_LIST__MDPROP_AXES:
				return getMdpropAxes();
			case XmlaPackage.PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT:
				return getMdpropFlatteningSupport();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT:
				return getMdpropMdxCaseSupport();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS:
				return getMdpropMdxDescFlags();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS:
				return getMdpropMdxDrillFunctions();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_FORMULAS:
				return getMdpropMdxFormulas();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES:
				return getMdpropMdxJoinCubes();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS:
				return getMdpropMdxMemberFunctions();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS:
				return getMdpropMdxNonMeasureExpressions();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS:
				return getMdpropMdxNumericFunctions();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION:
				return getMdpropMdxObjQualification();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE:
				return getMdpropMdxOuterReference();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY:
				return isMdpropMdxQueryByProperty();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET:
				return getMdpropMdxRangeRowset();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS:
				return getMdpropMdxSetFunctions();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SLICER:
				return getMdpropMdxSlicer();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP:
				return getMdpropMdxStringCompop();
			case XmlaPackage.PROPERTY_LIST__MDPROP_NAMED_LEVELS:
				return getMdpropNamedLevels();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY:
				return getDbpropMsmdMDXCompatibility();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY:
				return getDbpropMsmdSQLCompatibility();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE:
				return getDbpropMsmdMDXUniqueNameStyle();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY:
				return getDbpropMsmdCachePolicy();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO:
				return getDbpropMsmdCacheRatio();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE:
				return getDbpropMsmdCacheMode();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS:
				return getDbpropMsmdCompareCaseSensitiveStringFlags();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS:
				return getDbpropMsmdCompareCaseNotSensitiveStringFlags();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_FLATTENED2:
				return isDbpropMsmdFlattened2();
			case XmlaPackage.PROPERTY_LIST__DBPROP_INIT_MODE:
				return getDbpropInitMode();
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_APP_NAME:
				return getSspropInitAppName();
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_WSID:
				return getSspropInitWsid();
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_PACKETSIZE:
				return getSspropInitPacketsize();
			case XmlaPackage.PROPERTY_LIST__READ_ONLY_SESSION:
				return getReadOnlySession();
			case XmlaPackage.PROPERTY_LIST__SECURED_CELL_VALUE:
				return getSecuredCellValue();
			case XmlaPackage.PROPERTY_LIST__NON_EMPTY_THRESHOLD:
				return getNonEmptyThreshold();
			case XmlaPackage.PROPERTY_LIST__SAFETY_OPTIONS:
				return getSafetyOptions();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2:
				return getDbpropMsmdCacheRatio2();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE:
				return getDbpropMsmdUseFormulaCache();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT:
				return getDbpropMsmdDynamicDebugLimit();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE:
				return getDbpropMsmdDebugMode();
			case XmlaPackage.PROPERTY_LIST__DIALECT:
				return getDialect();
			case XmlaPackage.PROPERTY_LIST__IMPACT_ANALYSIS:
				return isImpactAnalysis();
			case XmlaPackage.PROPERTY_LIST__SQL_QUERY_MODE:
				return getSQLQueryMode();
			case XmlaPackage.PROPERTY_LIST__CLIENT_PROCESS_ID:
				return getClientProcessID();
			case XmlaPackage.PROPERTY_LIST__CUBE:
				return getCube();
			case XmlaPackage.PROPERTY_LIST__RETURN_CELL_PROPERTIES:
				return isReturnCellProperties();
			case XmlaPackage.PROPERTY_LIST__COMMIT_TIMEOUT:
				return getCommitTimeout();
			case XmlaPackage.PROPERTY_LIST__FORCE_COMMIT_TIMEOUT:
				return getForceCommitTimeout();
			case XmlaPackage.PROPERTY_LIST__EXECUTION_MODE:
				return getExecutionMode();
			case XmlaPackage.PROPERTY_LIST__REAL_TIME_OLAP:
				return isRealTimeOlap();
			case XmlaPackage.PROPERTY_LIST__MDX_MISSING_MEMBER_MODE:
				return getMdxMissingMemberMode();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NAMED_SETS:
				return getMdpropMdxNamedSets();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES:
				return getDbpropMsmdSubqueries();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS:
				return getDbpropMsmdAutoExists();
			case XmlaPackage.PROPERTY_LIST__CUSTOM_DATA:
				return getCustomData();
			case XmlaPackage.PROPERTY_LIST__DISABLE_PREFETCH_FACTS:
				return isDisablePrefetchFacts();
			case XmlaPackage.PROPERTY_LIST__UPDATE_ISOLATION_LEVEL:
				return getUpdateIsolationLevel();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE:
				return getDbpropMsmdErrorMessageMode();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS:
				return getMdpropMdxDdlExtensions();
			case XmlaPackage.PROPERTY_LIST__RESPONSE_ENCODING:
				return getResponseEncoding();
			case XmlaPackage.PROPERTY_LIST__MEMORY_LOCKING_MODE:
				return getMemoryLockingMode();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE:
				return getDbpropMsmdOptimizeResponse();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID:
				return getDbpropMsmdActivityID();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID:
				return getDbpropMsmdRequestID();
			case XmlaPackage.PROPERTY_LIST__RETURN_AFFECTED_OBJECTS:
				return getReturnAffectedObjects();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT:
				return getDbpropMsmdRequestMemoryLimit();
			case XmlaPackage.PROPERTY_LIST__APPLICATION_CONTEXT:
				return getApplicationContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.PROPERTY_LIST__DATA_SOURCE_INFO:
				setDataSourceInfo((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__TIMEOUT:
				setTimeout((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__USER_NAME:
				setUserName((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__PASSWORD:
				setPassword((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__LOCALE_IDENTIFIER:
				setLocaleIdentifier((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__CATALOG:
				setCatalog((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__STATE_SUPPORT:
				setStateSupport((StateSupport)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__CONTENT:
				setContent((Content)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__FORMAT:
				setFormat((Format)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__AXIS_FORMAT:
				setAxisFormat((AxisFormat)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__BEGIN_RANGE:
				setBeginRange((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__END_RANGE:
				setEndRange((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDX_SUPPORT:
				setMDXSupport((MDXSupport)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__PROVIDER_VERSION:
				setProviderVersion((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBMS_VERSION:
				setDBMSVersion((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__PROVIDER_TYPE:
				setProviderType((ProviderType)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SHOW_HIDDEN_CUBES:
				setShowHiddenCubes((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SQL_SUPPORT:
				setSQLSupport((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__TRANSACTION_DDL:
				setTransactionDDL((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MAXIMUM_ROWS:
				setMaximumRows((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__ROLES:
				setRoles((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__VISUAL_MODE:
				setVisualMode((VisualMode)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_ROLES:
				setEffectiveRoles((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_USER_NAME:
				setEffectiveUserName((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SERVER_NAME:
				setServerName((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__CATALOG_LOCATION:
				setCatalogLocation((CatalogLocation)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_TERM:
				setDbpropCatalogTerm((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_USAGE:
				setDbpropCatalogUsage((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_COLUMN_DEFINITION:
				setDbpropColumnDefinition((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR:
				setDbpropConcatNullBehavior((DbpropConcatNullBehavior)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY:
				setDbpropDataSourceReadOnly((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_GROUP_BY:
				setDbpropGroupBy((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES:
				setDbpropHeterogeneousTables((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_IDENTIFIER_CASE:
				setDbpropIdentifierCase((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE:
				setDbpropMaxIndexSize((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS:
				setDbpropMaxOpenChapters((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE:
				setDbpropMaxRowSize((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB:
				setDbpropMaxRowSizeIncludeBlob((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT:
				setDbpropMaxTablesInSelect((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE:
				setDbpropMultiTableUpdate((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_NULL_COLLATION:
				setDbpropNullCollation((DbpropNullCollation)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT:
				setDbpropOrderByColumnsInSelect((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE:
				setDbpropOutputParameterAvailable((DbpropOutputParameterAvailable)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE:
				setDbpropPersistentIdType((DbpropPersistentIdType)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR:
				setDbpropPrepareAbortBehavior((DbpropPrepareAbortBehavior)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR:
				setDbpropPrepareCommitBehavior((DbpropPrepareCommitBehavior)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PROCEDURE_TERM:
				setDbpropProcedureTerm((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE:
				setDbpropQuotedIdentifierCase((DbpropQuotedIdentifierCase)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SCHEMA_USAGE:
				setDbpropSchemaUsage((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SQL_SUPPORT:
				setDbpropSqlSupport((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUBQUERIES:
				setDbpropSubqueries((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL:
				setDbpropSupportedTxnDdl((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SUBQUERIES:
				setMdpropMdxSubqueries((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS:
				setDbpropSupportedTxnIsoLevels((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN:
				setDbpropSupportedTxnIsoRetain((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_TABLE_TERM:
				setDbpropTableTerm((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE:
				setMdpropAggregateCellUpdate((MdpropAggregateCellUpdate)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_AXES:
				setMdpropAxes((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT:
				setMdpropFlatteningSupport((MdpropFlatteningSupport)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT:
				setMdpropMdxCaseSupport((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS:
				setMdpropMdxDescFlags((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS:
				setMdpropMdxDrillFunctions((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_FORMULAS:
				setMdpropMdxFormulas((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES:
				setMdpropMdxJoinCubes((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS:
				setMdpropMdxMemberFunctions((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS:
				setMdpropMdxNonMeasureExpressions((MdpropMdxNonMeasureExpressions)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS:
				setMdpropMdxNumericFunctions((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION:
				setMdpropMdxObjQualification((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE:
				setMdpropMdxOuterReference((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY:
				setMdpropMdxQueryByProperty((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET:
				setMdpropMdxRangeRowset((MdpropMdxRangeRowset)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS:
				setMdpropMdxSetFunctions((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SLICER:
				setMdpropMdxSlicer((MdpropMdxSlicer)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP:
				setMdpropMdxStringCompop((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_NAMED_LEVELS:
				setMdpropNamedLevels((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY:
				setDbpropMsmdMDXCompatibility((DbpropMsmdMDXCompatibility)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY:
				setDbpropMsmdSQLCompatibility((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE:
				setDbpropMsmdMDXUniqueNameStyle((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY:
				setDbpropMsmdCachePolicy((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO:
				setDbpropMsmdCacheRatio((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE:
				setDbpropMsmdCacheMode((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS:
				setDbpropMsmdCompareCaseSensitiveStringFlags((DbpropMsmdCompareCaseSensitiveStringFlags)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS:
				setDbpropMsmdCompareCaseNotSensitiveStringFlags((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_FLATTENED2:
				setDbpropMsmdFlattened2((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_INIT_MODE:
				setDbpropInitMode((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_APP_NAME:
				setSspropInitAppName((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_WSID:
				setSspropInitWsid((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_PACKETSIZE:
				setSspropInitPacketsize((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__READ_ONLY_SESSION:
				setReadOnlySession((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SECURED_CELL_VALUE:
				setSecuredCellValue((SecuredCellValue)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__NON_EMPTY_THRESHOLD:
				setNonEmptyThreshold((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SAFETY_OPTIONS:
				setSafetyOptions((SafetyOptions)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2:
				setDbpropMsmdCacheRatio2((Double)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE:
				setDbpropMsmdUseFormulaCache((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT:
				setDbpropMsmdDynamicDebugLimit((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE:
				setDbpropMsmdDebugMode((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DIALECT:
				setDialect((Dialect)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__IMPACT_ANALYSIS:
				setImpactAnalysis((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__SQL_QUERY_MODE:
				setSQLQueryMode((SQLQueryMode)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__CLIENT_PROCESS_ID:
				setClientProcessID((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__CUBE:
				setCube((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__RETURN_CELL_PROPERTIES:
				setReturnCellProperties((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__COMMIT_TIMEOUT:
				setCommitTimeout((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__FORCE_COMMIT_TIMEOUT:
				setForceCommitTimeout((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__EXECUTION_MODE:
				setExecutionMode((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__REAL_TIME_OLAP:
				setRealTimeOlap((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDX_MISSING_MEMBER_MODE:
				setMdxMissingMemberMode((MdxMissingMemberMode)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NAMED_SETS:
				setMdpropMdxNamedSets((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES:
				setDbpropMsmdSubqueries((DbpropMsmdSubqueries)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS:
				setDbpropMsmdAutoExists((DbpropMsmdAutoExists)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__CUSTOM_DATA:
				setCustomData((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DISABLE_PREFETCH_FACTS:
				setDisablePrefetchFacts((Boolean)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__UPDATE_ISOLATION_LEVEL:
				setUpdateIsolationLevel((UpdateIsolationLevel)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE:
				setDbpropMsmdErrorMessageMode((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS:
				setMdpropMdxDdlExtensions((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__RESPONSE_ENCODING:
				setResponseEncoding((ResponseEncoding)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__MEMORY_LOCKING_MODE:
				setMemoryLockingMode((MemoryLockingMode)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE:
				setDbpropMsmdOptimizeResponse((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID:
				setDbpropMsmdActivityID((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID:
				setDbpropMsmdRequestID((String)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__RETURN_AFFECTED_OBJECTS:
				setReturnAffectedObjects((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT:
				setDbpropMsmdRequestMemoryLimit((BigInteger)newValue);
				return;
			case XmlaPackage.PROPERTY_LIST__APPLICATION_CONTEXT:
				setApplicationContext((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.PROPERTY_LIST__DATA_SOURCE_INFO:
				setDataSourceInfo(DATA_SOURCE_INFO_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__LOCALE_IDENTIFIER:
				setLocaleIdentifier(LOCALE_IDENTIFIER_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__STATE_SUPPORT:
				unsetStateSupport();
				return;
			case XmlaPackage.PROPERTY_LIST__CONTENT:
				unsetContent();
				return;
			case XmlaPackage.PROPERTY_LIST__FORMAT:
				unsetFormat();
				return;
			case XmlaPackage.PROPERTY_LIST__AXIS_FORMAT:
				unsetAxisFormat();
				return;
			case XmlaPackage.PROPERTY_LIST__BEGIN_RANGE:
				setBeginRange(BEGIN_RANGE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__END_RANGE:
				setEndRange(END_RANGE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDX_SUPPORT:
				unsetMDXSupport();
				return;
			case XmlaPackage.PROPERTY_LIST__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__PROVIDER_VERSION:
				setProviderVersion(PROVIDER_VERSION_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBMS_VERSION:
				setDBMSVersion(DBMS_VERSION_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__PROVIDER_TYPE:
				unsetProviderType();
				return;
			case XmlaPackage.PROPERTY_LIST__SHOW_HIDDEN_CUBES:
				unsetShowHiddenCubes();
				return;
			case XmlaPackage.PROPERTY_LIST__SQL_SUPPORT:
				setSQLSupport(SQL_SUPPORT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__TRANSACTION_DDL:
				setTransactionDDL(TRANSACTION_DDL_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MAXIMUM_ROWS:
				setMaximumRows(MAXIMUM_ROWS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__ROLES:
				setRoles(ROLES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__VISUAL_MODE:
				unsetVisualMode();
				return;
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_ROLES:
				setEffectiveRoles(EFFECTIVE_ROLES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_USER_NAME:
				setEffectiveUserName(EFFECTIVE_USER_NAME_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__SERVER_NAME:
				setServerName(SERVER_NAME_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__CATALOG_LOCATION:
				unsetCatalogLocation();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_TERM:
				setDbpropCatalogTerm(DBPROP_CATALOG_TERM_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_USAGE:
				setDbpropCatalogUsage(DBPROP_CATALOG_USAGE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_COLUMN_DEFINITION:
				setDbpropColumnDefinition(DBPROP_COLUMN_DEFINITION_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR:
				unsetDbpropConcatNullBehavior();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY:
				unsetDbpropDataSourceReadOnly();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_GROUP_BY:
				setDbpropGroupBy(DBPROP_GROUP_BY_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES:
				setDbpropHeterogeneousTables(DBPROP_HETEROGENEOUS_TABLES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_IDENTIFIER_CASE:
				setDbpropIdentifierCase(DBPROP_IDENTIFIER_CASE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE:
				setDbpropMaxIndexSize(DBPROP_MAX_INDEX_SIZE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS:
				setDbpropMaxOpenChapters(DBPROP_MAX_OPEN_CHAPTERS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE:
				setDbpropMaxRowSize(DBPROP_MAX_ROW_SIZE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB:
				unsetDbpropMaxRowSizeIncludeBlob();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT:
				setDbpropMaxTablesInSelect(DBPROP_MAX_TABLES_IN_SELECT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE:
				unsetDbpropMultiTableUpdate();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_NULL_COLLATION:
				unsetDbpropNullCollation();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT:
				unsetDbpropOrderByColumnsInSelect();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE:
				unsetDbpropOutputParameterAvailable();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE:
				unsetDbpropPersistentIdType();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR:
				unsetDbpropPrepareAbortBehavior();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR:
				unsetDbpropPrepareCommitBehavior();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_PROCEDURE_TERM:
				setDbpropProcedureTerm(DBPROP_PROCEDURE_TERM_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE:
				unsetDbpropQuotedIdentifierCase();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SCHEMA_USAGE:
				setDbpropSchemaUsage(DBPROP_SCHEMA_USAGE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SQL_SUPPORT:
				setDbpropSqlSupport(DBPROP_SQL_SUPPORT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUBQUERIES:
				setDbpropSubqueries(DBPROP_SUBQUERIES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL:
				setDbpropSupportedTxnDdl(DBPROP_SUPPORTED_TXN_DDL_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SUBQUERIES:
				setMdpropMdxSubqueries(MDPROP_MDX_SUBQUERIES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS:
				setDbpropSupportedTxnIsoLevels(DBPROP_SUPPORTED_TXN_ISO_LEVELS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN:
				setDbpropSupportedTxnIsoRetain(DBPROP_SUPPORTED_TXN_ISO_RETAIN_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_TABLE_TERM:
				setDbpropTableTerm(DBPROP_TABLE_TERM_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE:
				unsetMdpropAggregateCellUpdate();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_AXES:
				setMdpropAxes(MDPROP_AXES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT:
				unsetMdpropFlatteningSupport();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT:
				setMdpropMdxCaseSupport(MDPROP_MDX_CASE_SUPPORT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS:
				setMdpropMdxDescFlags(MDPROP_MDX_DESC_FLAGS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS:
				setMdpropMdxDrillFunctions(MDPROP_MDX_DRILL_FUNCTIONS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_FORMULAS:
				setMdpropMdxFormulas(MDPROP_MDX_FORMULAS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES:
				setMdpropMdxJoinCubes(MDPROP_MDX_JOIN_CUBES_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS:
				setMdpropMdxMemberFunctions(MDPROP_MDX_MEMBER_FUNCTIONS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS:
				unsetMdpropMdxNonMeasureExpressions();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS:
				setMdpropMdxNumericFunctions(MDPROP_MDX_NUMERIC_FUNCTIONS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION:
				setMdpropMdxObjQualification(MDPROP_MDX_OBJ_QUALIFICATION_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE:
				setMdpropMdxOuterReference(MDPROP_MDX_OUTER_REFERENCE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY:
				unsetMdpropMdxQueryByProperty();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET:
				unsetMdpropMdxRangeRowset();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS:
				setMdpropMdxSetFunctions(MDPROP_MDX_SET_FUNCTIONS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SLICER:
				unsetMdpropMdxSlicer();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP:
				setMdpropMdxStringCompop(MDPROP_MDX_STRING_COMPOP_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_NAMED_LEVELS:
				setMdpropNamedLevels(MDPROP_NAMED_LEVELS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY:
				unsetDbpropMsmdMDXCompatibility();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY:
				setDbpropMsmdSQLCompatibility(DBPROP_MSMD_SQL_COMPATIBILITY_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE:
				setDbpropMsmdMDXUniqueNameStyle(DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY:
				setDbpropMsmdCachePolicy(DBPROP_MSMD_CACHE_POLICY_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO:
				setDbpropMsmdCacheRatio(DBPROP_MSMD_CACHE_RATIO_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE:
				setDbpropMsmdCacheMode(DBPROP_MSMD_CACHE_MODE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS:
				unsetDbpropMsmdCompareCaseSensitiveStringFlags();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS:
				setDbpropMsmdCompareCaseNotSensitiveStringFlags(DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_FLATTENED2:
				unsetDbpropMsmdFlattened2();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_INIT_MODE:
				setDbpropInitMode(DBPROP_INIT_MODE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_APP_NAME:
				setSspropInitAppName(SSPROP_INIT_APP_NAME_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_WSID:
				setSspropInitWsid(SSPROP_INIT_WSID_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_PACKETSIZE:
				setSspropInitPacketsize(SSPROP_INIT_PACKETSIZE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__READ_ONLY_SESSION:
				setReadOnlySession(READ_ONLY_SESSION_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__SECURED_CELL_VALUE:
				unsetSecuredCellValue();
				return;
			case XmlaPackage.PROPERTY_LIST__NON_EMPTY_THRESHOLD:
				setNonEmptyThreshold(NON_EMPTY_THRESHOLD_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__SAFETY_OPTIONS:
				unsetSafetyOptions();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2:
				unsetDbpropMsmdCacheRatio2();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE:
				setDbpropMsmdUseFormulaCache(DBPROP_MSMD_USE_FORMULA_CACHE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT:
				setDbpropMsmdDynamicDebugLimit(DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE:
				setDbpropMsmdDebugMode(DBPROP_MSMD_DEBUG_MODE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DIALECT:
				unsetDialect();
				return;
			case XmlaPackage.PROPERTY_LIST__IMPACT_ANALYSIS:
				unsetImpactAnalysis();
				return;
			case XmlaPackage.PROPERTY_LIST__SQL_QUERY_MODE:
				unsetSQLQueryMode();
				return;
			case XmlaPackage.PROPERTY_LIST__CLIENT_PROCESS_ID:
				setClientProcessID(CLIENT_PROCESS_ID_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__CUBE:
				setCube(CUBE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__RETURN_CELL_PROPERTIES:
				unsetReturnCellProperties();
				return;
			case XmlaPackage.PROPERTY_LIST__COMMIT_TIMEOUT:
				setCommitTimeout(COMMIT_TIMEOUT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__FORCE_COMMIT_TIMEOUT:
				setForceCommitTimeout(FORCE_COMMIT_TIMEOUT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__EXECUTION_MODE:
				setExecutionMode(EXECUTION_MODE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__REAL_TIME_OLAP:
				unsetRealTimeOlap();
				return;
			case XmlaPackage.PROPERTY_LIST__MDX_MISSING_MEMBER_MODE:
				unsetMdxMissingMemberMode();
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NAMED_SETS:
				setMdpropMdxNamedSets(MDPROP_MDX_NAMED_SETS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES:
				unsetDbpropMsmdSubqueries();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS:
				unsetDbpropMsmdAutoExists();
				return;
			case XmlaPackage.PROPERTY_LIST__CUSTOM_DATA:
				setCustomData(CUSTOM_DATA_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DISABLE_PREFETCH_FACTS:
				unsetDisablePrefetchFacts();
				return;
			case XmlaPackage.PROPERTY_LIST__UPDATE_ISOLATION_LEVEL:
				unsetUpdateIsolationLevel();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE:
				setDbpropMsmdErrorMessageMode(DBPROP_MSMD_ERROR_MESSAGE_MODE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS:
				setMdpropMdxDdlExtensions(MDPROP_MDX_DDL_EXTENSIONS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__RESPONSE_ENCODING:
				unsetResponseEncoding();
				return;
			case XmlaPackage.PROPERTY_LIST__MEMORY_LOCKING_MODE:
				unsetMemoryLockingMode();
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE:
				setDbpropMsmdOptimizeResponse(DBPROP_MSMD_OPTIMIZE_RESPONSE_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID:
				setDbpropMsmdActivityID(DBPROP_MSMD_ACTIVITY_ID_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID:
				setDbpropMsmdRequestID(DBPROP_MSMD_REQUEST_ID_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__RETURN_AFFECTED_OBJECTS:
				setReturnAffectedObjects(RETURN_AFFECTED_OBJECTS_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT:
				setDbpropMsmdRequestMemoryLimit(DBPROP_MSMD_REQUEST_MEMORY_LIMIT_EDEFAULT);
				return;
			case XmlaPackage.PROPERTY_LIST__APPLICATION_CONTEXT:
				setApplicationContext(APPLICATION_CONTEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.PROPERTY_LIST__DATA_SOURCE_INFO:
				return DATA_SOURCE_INFO_EDEFAULT == null ? dataSourceInfo != null : !DATA_SOURCE_INFO_EDEFAULT.equals(dataSourceInfo);
			case XmlaPackage.PROPERTY_LIST__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case XmlaPackage.PROPERTY_LIST__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case XmlaPackage.PROPERTY_LIST__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case XmlaPackage.PROPERTY_LIST__LOCALE_IDENTIFIER:
				return LOCALE_IDENTIFIER_EDEFAULT == null ? localeIdentifier != null : !LOCALE_IDENTIFIER_EDEFAULT.equals(localeIdentifier);
			case XmlaPackage.PROPERTY_LIST__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case XmlaPackage.PROPERTY_LIST__STATE_SUPPORT:
				return isSetStateSupport();
			case XmlaPackage.PROPERTY_LIST__CONTENT:
				return isSetContent();
			case XmlaPackage.PROPERTY_LIST__FORMAT:
				return isSetFormat();
			case XmlaPackage.PROPERTY_LIST__AXIS_FORMAT:
				return isSetAxisFormat();
			case XmlaPackage.PROPERTY_LIST__BEGIN_RANGE:
				return BEGIN_RANGE_EDEFAULT == null ? beginRange != null : !BEGIN_RANGE_EDEFAULT.equals(beginRange);
			case XmlaPackage.PROPERTY_LIST__END_RANGE:
				return END_RANGE_EDEFAULT == null ? endRange != null : !END_RANGE_EDEFAULT.equals(endRange);
			case XmlaPackage.PROPERTY_LIST__MDX_SUPPORT:
				return isSetMDXSupport();
			case XmlaPackage.PROPERTY_LIST__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case XmlaPackage.PROPERTY_LIST__PROVIDER_VERSION:
				return PROVIDER_VERSION_EDEFAULT == null ? providerVersion != null : !PROVIDER_VERSION_EDEFAULT.equals(providerVersion);
			case XmlaPackage.PROPERTY_LIST__DBMS_VERSION:
				return DBMS_VERSION_EDEFAULT == null ? dBMSVersion != null : !DBMS_VERSION_EDEFAULT.equals(dBMSVersion);
			case XmlaPackage.PROPERTY_LIST__PROVIDER_TYPE:
				return isSetProviderType();
			case XmlaPackage.PROPERTY_LIST__SHOW_HIDDEN_CUBES:
				return isSetShowHiddenCubes();
			case XmlaPackage.PROPERTY_LIST__SQL_SUPPORT:
				return SQL_SUPPORT_EDEFAULT == null ? sQLSupport != null : !SQL_SUPPORT_EDEFAULT.equals(sQLSupport);
			case XmlaPackage.PROPERTY_LIST__TRANSACTION_DDL:
				return TRANSACTION_DDL_EDEFAULT == null ? transactionDDL != null : !TRANSACTION_DDL_EDEFAULT.equals(transactionDDL);
			case XmlaPackage.PROPERTY_LIST__MAXIMUM_ROWS:
				return MAXIMUM_ROWS_EDEFAULT == null ? maximumRows != null : !MAXIMUM_ROWS_EDEFAULT.equals(maximumRows);
			case XmlaPackage.PROPERTY_LIST__ROLES:
				return ROLES_EDEFAULT == null ? roles != null : !ROLES_EDEFAULT.equals(roles);
			case XmlaPackage.PROPERTY_LIST__VISUAL_MODE:
				return isSetVisualMode();
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_ROLES:
				return EFFECTIVE_ROLES_EDEFAULT == null ? effectiveRoles != null : !EFFECTIVE_ROLES_EDEFAULT.equals(effectiveRoles);
			case XmlaPackage.PROPERTY_LIST__EFFECTIVE_USER_NAME:
				return EFFECTIVE_USER_NAME_EDEFAULT == null ? effectiveUserName != null : !EFFECTIVE_USER_NAME_EDEFAULT.equals(effectiveUserName);
			case XmlaPackage.PROPERTY_LIST__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
			case XmlaPackage.PROPERTY_LIST__CATALOG_LOCATION:
				return isSetCatalogLocation();
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_TERM:
				return DBPROP_CATALOG_TERM_EDEFAULT == null ? dbpropCatalogTerm != null : !DBPROP_CATALOG_TERM_EDEFAULT.equals(dbpropCatalogTerm);
			case XmlaPackage.PROPERTY_LIST__DBPROP_CATALOG_USAGE:
				return DBPROP_CATALOG_USAGE_EDEFAULT == null ? dbpropCatalogUsage != null : !DBPROP_CATALOG_USAGE_EDEFAULT.equals(dbpropCatalogUsage);
			case XmlaPackage.PROPERTY_LIST__DBPROP_COLUMN_DEFINITION:
				return DBPROP_COLUMN_DEFINITION_EDEFAULT == null ? dbpropColumnDefinition != null : !DBPROP_COLUMN_DEFINITION_EDEFAULT.equals(dbpropColumnDefinition);
			case XmlaPackage.PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR:
				return isSetDbpropConcatNullBehavior();
			case XmlaPackage.PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY:
				return isSetDbpropDataSourceReadOnly();
			case XmlaPackage.PROPERTY_LIST__DBPROP_GROUP_BY:
				return DBPROP_GROUP_BY_EDEFAULT == null ? dbpropGroupBy != null : !DBPROP_GROUP_BY_EDEFAULT.equals(dbpropGroupBy);
			case XmlaPackage.PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES:
				return DBPROP_HETEROGENEOUS_TABLES_EDEFAULT == null ? dbpropHeterogeneousTables != null : !DBPROP_HETEROGENEOUS_TABLES_EDEFAULT.equals(dbpropHeterogeneousTables);
			case XmlaPackage.PROPERTY_LIST__DBPROP_IDENTIFIER_CASE:
				return DBPROP_IDENTIFIER_CASE_EDEFAULT == null ? dbpropIdentifierCase != null : !DBPROP_IDENTIFIER_CASE_EDEFAULT.equals(dbpropIdentifierCase);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE:
				return DBPROP_MAX_INDEX_SIZE_EDEFAULT == null ? dbpropMaxIndexSize != null : !DBPROP_MAX_INDEX_SIZE_EDEFAULT.equals(dbpropMaxIndexSize);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS:
				return DBPROP_MAX_OPEN_CHAPTERS_EDEFAULT == null ? dbpropMaxOpenChapters != null : !DBPROP_MAX_OPEN_CHAPTERS_EDEFAULT.equals(dbpropMaxOpenChapters);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE:
				return DBPROP_MAX_ROW_SIZE_EDEFAULT == null ? dbpropMaxRowSize != null : !DBPROP_MAX_ROW_SIZE_EDEFAULT.equals(dbpropMaxRowSize);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB:
				return isSetDbpropMaxRowSizeIncludeBlob();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT:
				return DBPROP_MAX_TABLES_IN_SELECT_EDEFAULT == null ? dbpropMaxTablesInSelect != null : !DBPROP_MAX_TABLES_IN_SELECT_EDEFAULT.equals(dbpropMaxTablesInSelect);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE:
				return isSetDbpropMultiTableUpdate();
			case XmlaPackage.PROPERTY_LIST__DBPROP_NULL_COLLATION:
				return isSetDbpropNullCollation();
			case XmlaPackage.PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT:
				return isSetDbpropOrderByColumnsInSelect();
			case XmlaPackage.PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE:
				return isSetDbpropOutputParameterAvailable();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE:
				return isSetDbpropPersistentIdType();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR:
				return isSetDbpropPrepareAbortBehavior();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR:
				return isSetDbpropPrepareCommitBehavior();
			case XmlaPackage.PROPERTY_LIST__DBPROP_PROCEDURE_TERM:
				return DBPROP_PROCEDURE_TERM_EDEFAULT == null ? dbpropProcedureTerm != null : !DBPROP_PROCEDURE_TERM_EDEFAULT.equals(dbpropProcedureTerm);
			case XmlaPackage.PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE:
				return isSetDbpropQuotedIdentifierCase();
			case XmlaPackage.PROPERTY_LIST__DBPROP_SCHEMA_USAGE:
				return DBPROP_SCHEMA_USAGE_EDEFAULT == null ? dbpropSchemaUsage != null : !DBPROP_SCHEMA_USAGE_EDEFAULT.equals(dbpropSchemaUsage);
			case XmlaPackage.PROPERTY_LIST__DBPROP_SQL_SUPPORT:
				return DBPROP_SQL_SUPPORT_EDEFAULT == null ? dbpropSqlSupport != null : !DBPROP_SQL_SUPPORT_EDEFAULT.equals(dbpropSqlSupport);
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUBQUERIES:
				return DBPROP_SUBQUERIES_EDEFAULT == null ? dbpropSubqueries != null : !DBPROP_SUBQUERIES_EDEFAULT.equals(dbpropSubqueries);
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL:
				return DBPROP_SUPPORTED_TXN_DDL_EDEFAULT == null ? dbpropSupportedTxnDdl != null : !DBPROP_SUPPORTED_TXN_DDL_EDEFAULT.equals(dbpropSupportedTxnDdl);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SUBQUERIES:
				return MDPROP_MDX_SUBQUERIES_EDEFAULT == null ? mdpropMdxSubqueries != null : !MDPROP_MDX_SUBQUERIES_EDEFAULT.equals(mdpropMdxSubqueries);
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS:
				return DBPROP_SUPPORTED_TXN_ISO_LEVELS_EDEFAULT == null ? dbpropSupportedTxnIsoLevels != null : !DBPROP_SUPPORTED_TXN_ISO_LEVELS_EDEFAULT.equals(dbpropSupportedTxnIsoLevels);
			case XmlaPackage.PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN:
				return DBPROP_SUPPORTED_TXN_ISO_RETAIN_EDEFAULT == null ? dbpropSupportedTxnIsoRetain != null : !DBPROP_SUPPORTED_TXN_ISO_RETAIN_EDEFAULT.equals(dbpropSupportedTxnIsoRetain);
			case XmlaPackage.PROPERTY_LIST__DBPROP_TABLE_TERM:
				return DBPROP_TABLE_TERM_EDEFAULT == null ? dbpropTableTerm != null : !DBPROP_TABLE_TERM_EDEFAULT.equals(dbpropTableTerm);
			case XmlaPackage.PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE:
				return isSetMdpropAggregateCellUpdate();
			case XmlaPackage.PROPERTY_LIST__MDPROP_AXES:
				return MDPROP_AXES_EDEFAULT == null ? mdpropAxes != null : !MDPROP_AXES_EDEFAULT.equals(mdpropAxes);
			case XmlaPackage.PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT:
				return isSetMdpropFlatteningSupport();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT:
				return MDPROP_MDX_CASE_SUPPORT_EDEFAULT == null ? mdpropMdxCaseSupport != null : !MDPROP_MDX_CASE_SUPPORT_EDEFAULT.equals(mdpropMdxCaseSupport);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS:
				return MDPROP_MDX_DESC_FLAGS_EDEFAULT == null ? mdpropMdxDescFlags != null : !MDPROP_MDX_DESC_FLAGS_EDEFAULT.equals(mdpropMdxDescFlags);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS:
				return MDPROP_MDX_DRILL_FUNCTIONS_EDEFAULT == null ? mdpropMdxDrillFunctions != null : !MDPROP_MDX_DRILL_FUNCTIONS_EDEFAULT.equals(mdpropMdxDrillFunctions);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_FORMULAS:
				return MDPROP_MDX_FORMULAS_EDEFAULT == null ? mdpropMdxFormulas != null : !MDPROP_MDX_FORMULAS_EDEFAULT.equals(mdpropMdxFormulas);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES:
				return MDPROP_MDX_JOIN_CUBES_EDEFAULT == null ? mdpropMdxJoinCubes != null : !MDPROP_MDX_JOIN_CUBES_EDEFAULT.equals(mdpropMdxJoinCubes);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS:
				return MDPROP_MDX_MEMBER_FUNCTIONS_EDEFAULT == null ? mdpropMdxMemberFunctions != null : !MDPROP_MDX_MEMBER_FUNCTIONS_EDEFAULT.equals(mdpropMdxMemberFunctions);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS:
				return isSetMdpropMdxNonMeasureExpressions();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS:
				return MDPROP_MDX_NUMERIC_FUNCTIONS_EDEFAULT == null ? mdpropMdxNumericFunctions != null : !MDPROP_MDX_NUMERIC_FUNCTIONS_EDEFAULT.equals(mdpropMdxNumericFunctions);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION:
				return MDPROP_MDX_OBJ_QUALIFICATION_EDEFAULT == null ? mdpropMdxObjQualification != null : !MDPROP_MDX_OBJ_QUALIFICATION_EDEFAULT.equals(mdpropMdxObjQualification);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE:
				return MDPROP_MDX_OUTER_REFERENCE_EDEFAULT == null ? mdpropMdxOuterReference != null : !MDPROP_MDX_OUTER_REFERENCE_EDEFAULT.equals(mdpropMdxOuterReference);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY:
				return isSetMdpropMdxQueryByProperty();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET:
				return isSetMdpropMdxRangeRowset();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS:
				return MDPROP_MDX_SET_FUNCTIONS_EDEFAULT == null ? mdpropMdxSetFunctions != null : !MDPROP_MDX_SET_FUNCTIONS_EDEFAULT.equals(mdpropMdxSetFunctions);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_SLICER:
				return isSetMdpropMdxSlicer();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP:
				return MDPROP_MDX_STRING_COMPOP_EDEFAULT == null ? mdpropMdxStringCompop != null : !MDPROP_MDX_STRING_COMPOP_EDEFAULT.equals(mdpropMdxStringCompop);
			case XmlaPackage.PROPERTY_LIST__MDPROP_NAMED_LEVELS:
				return MDPROP_NAMED_LEVELS_EDEFAULT == null ? mdpropNamedLevels != null : !MDPROP_NAMED_LEVELS_EDEFAULT.equals(mdpropNamedLevels);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY:
				return isSetDbpropMsmdMDXCompatibility();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY:
				return DBPROP_MSMD_SQL_COMPATIBILITY_EDEFAULT == null ? dbpropMsmdSQLCompatibility != null : !DBPROP_MSMD_SQL_COMPATIBILITY_EDEFAULT.equals(dbpropMsmdSQLCompatibility);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE:
				return DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE_EDEFAULT == null ? dbpropMsmdMDXUniqueNameStyle != null : !DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE_EDEFAULT.equals(dbpropMsmdMDXUniqueNameStyle);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY:
				return DBPROP_MSMD_CACHE_POLICY_EDEFAULT == null ? dbpropMsmdCachePolicy != null : !DBPROP_MSMD_CACHE_POLICY_EDEFAULT.equals(dbpropMsmdCachePolicy);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO:
				return DBPROP_MSMD_CACHE_RATIO_EDEFAULT == null ? dbpropMsmdCacheRatio != null : !DBPROP_MSMD_CACHE_RATIO_EDEFAULT.equals(dbpropMsmdCacheRatio);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE:
				return DBPROP_MSMD_CACHE_MODE_EDEFAULT == null ? dbpropMsmdCacheMode != null : !DBPROP_MSMD_CACHE_MODE_EDEFAULT.equals(dbpropMsmdCacheMode);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS:
				return isSetDbpropMsmdCompareCaseSensitiveStringFlags();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS:
				return DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS_EDEFAULT == null ? dbpropMsmdCompareCaseNotSensitiveStringFlags != null : !DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS_EDEFAULT.equals(dbpropMsmdCompareCaseNotSensitiveStringFlags);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_FLATTENED2:
				return isSetDbpropMsmdFlattened2();
			case XmlaPackage.PROPERTY_LIST__DBPROP_INIT_MODE:
				return DBPROP_INIT_MODE_EDEFAULT == null ? dbpropInitMode != null : !DBPROP_INIT_MODE_EDEFAULT.equals(dbpropInitMode);
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_APP_NAME:
				return SSPROP_INIT_APP_NAME_EDEFAULT == null ? sspropInitAppName != null : !SSPROP_INIT_APP_NAME_EDEFAULT.equals(sspropInitAppName);
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_WSID:
				return SSPROP_INIT_WSID_EDEFAULT == null ? sspropInitWsid != null : !SSPROP_INIT_WSID_EDEFAULT.equals(sspropInitWsid);
			case XmlaPackage.PROPERTY_LIST__SSPROP_INIT_PACKETSIZE:
				return SSPROP_INIT_PACKETSIZE_EDEFAULT == null ? sspropInitPacketsize != null : !SSPROP_INIT_PACKETSIZE_EDEFAULT.equals(sspropInitPacketsize);
			case XmlaPackage.PROPERTY_LIST__READ_ONLY_SESSION:
				return READ_ONLY_SESSION_EDEFAULT == null ? readOnlySession != null : !READ_ONLY_SESSION_EDEFAULT.equals(readOnlySession);
			case XmlaPackage.PROPERTY_LIST__SECURED_CELL_VALUE:
				return isSetSecuredCellValue();
			case XmlaPackage.PROPERTY_LIST__NON_EMPTY_THRESHOLD:
				return NON_EMPTY_THRESHOLD_EDEFAULT == null ? nonEmptyThreshold != null : !NON_EMPTY_THRESHOLD_EDEFAULT.equals(nonEmptyThreshold);
			case XmlaPackage.PROPERTY_LIST__SAFETY_OPTIONS:
				return isSetSafetyOptions();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2:
				return isSetDbpropMsmdCacheRatio2();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE:
				return DBPROP_MSMD_USE_FORMULA_CACHE_EDEFAULT == null ? dbpropMsmdUseFormulaCache != null : !DBPROP_MSMD_USE_FORMULA_CACHE_EDEFAULT.equals(dbpropMsmdUseFormulaCache);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT:
				return DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT_EDEFAULT == null ? dbpropMsmdDynamicDebugLimit != null : !DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT_EDEFAULT.equals(dbpropMsmdDynamicDebugLimit);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE:
				return DBPROP_MSMD_DEBUG_MODE_EDEFAULT == null ? dbpropMsmdDebugMode != null : !DBPROP_MSMD_DEBUG_MODE_EDEFAULT.equals(dbpropMsmdDebugMode);
			case XmlaPackage.PROPERTY_LIST__DIALECT:
				return isSetDialect();
			case XmlaPackage.PROPERTY_LIST__IMPACT_ANALYSIS:
				return isSetImpactAnalysis();
			case XmlaPackage.PROPERTY_LIST__SQL_QUERY_MODE:
				return isSetSQLQueryMode();
			case XmlaPackage.PROPERTY_LIST__CLIENT_PROCESS_ID:
				return CLIENT_PROCESS_ID_EDEFAULT == null ? clientProcessID != null : !CLIENT_PROCESS_ID_EDEFAULT.equals(clientProcessID);
			case XmlaPackage.PROPERTY_LIST__CUBE:
				return CUBE_EDEFAULT == null ? cube != null : !CUBE_EDEFAULT.equals(cube);
			case XmlaPackage.PROPERTY_LIST__RETURN_CELL_PROPERTIES:
				return isSetReturnCellProperties();
			case XmlaPackage.PROPERTY_LIST__COMMIT_TIMEOUT:
				return COMMIT_TIMEOUT_EDEFAULT == null ? commitTimeout != null : !COMMIT_TIMEOUT_EDEFAULT.equals(commitTimeout);
			case XmlaPackage.PROPERTY_LIST__FORCE_COMMIT_TIMEOUT:
				return FORCE_COMMIT_TIMEOUT_EDEFAULT == null ? forceCommitTimeout != null : !FORCE_COMMIT_TIMEOUT_EDEFAULT.equals(forceCommitTimeout);
			case XmlaPackage.PROPERTY_LIST__EXECUTION_MODE:
				return EXECUTION_MODE_EDEFAULT == null ? executionMode != null : !EXECUTION_MODE_EDEFAULT.equals(executionMode);
			case XmlaPackage.PROPERTY_LIST__REAL_TIME_OLAP:
				return isSetRealTimeOlap();
			case XmlaPackage.PROPERTY_LIST__MDX_MISSING_MEMBER_MODE:
				return isSetMdxMissingMemberMode();
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_NAMED_SETS:
				return MDPROP_MDX_NAMED_SETS_EDEFAULT == null ? mdpropMdxNamedSets != null : !MDPROP_MDX_NAMED_SETS_EDEFAULT.equals(mdpropMdxNamedSets);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES:
				return isSetDbpropMsmdSubqueries();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS:
				return isSetDbpropMsmdAutoExists();
			case XmlaPackage.PROPERTY_LIST__CUSTOM_DATA:
				return CUSTOM_DATA_EDEFAULT == null ? customData != null : !CUSTOM_DATA_EDEFAULT.equals(customData);
			case XmlaPackage.PROPERTY_LIST__DISABLE_PREFETCH_FACTS:
				return isSetDisablePrefetchFacts();
			case XmlaPackage.PROPERTY_LIST__UPDATE_ISOLATION_LEVEL:
				return isSetUpdateIsolationLevel();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE:
				return DBPROP_MSMD_ERROR_MESSAGE_MODE_EDEFAULT == null ? dbpropMsmdErrorMessageMode != null : !DBPROP_MSMD_ERROR_MESSAGE_MODE_EDEFAULT.equals(dbpropMsmdErrorMessageMode);
			case XmlaPackage.PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS:
				return MDPROP_MDX_DDL_EXTENSIONS_EDEFAULT == null ? mdpropMdxDdlExtensions != null : !MDPROP_MDX_DDL_EXTENSIONS_EDEFAULT.equals(mdpropMdxDdlExtensions);
			case XmlaPackage.PROPERTY_LIST__RESPONSE_ENCODING:
				return isSetResponseEncoding();
			case XmlaPackage.PROPERTY_LIST__MEMORY_LOCKING_MODE:
				return isSetMemoryLockingMode();
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE:
				return DBPROP_MSMD_OPTIMIZE_RESPONSE_EDEFAULT == null ? dbpropMsmdOptimizeResponse != null : !DBPROP_MSMD_OPTIMIZE_RESPONSE_EDEFAULT.equals(dbpropMsmdOptimizeResponse);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID:
				return DBPROP_MSMD_ACTIVITY_ID_EDEFAULT == null ? dbpropMsmdActivityID != null : !DBPROP_MSMD_ACTIVITY_ID_EDEFAULT.equals(dbpropMsmdActivityID);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID:
				return DBPROP_MSMD_REQUEST_ID_EDEFAULT == null ? dbpropMsmdRequestID != null : !DBPROP_MSMD_REQUEST_ID_EDEFAULT.equals(dbpropMsmdRequestID);
			case XmlaPackage.PROPERTY_LIST__RETURN_AFFECTED_OBJECTS:
				return RETURN_AFFECTED_OBJECTS_EDEFAULT == null ? returnAffectedObjects != null : !RETURN_AFFECTED_OBJECTS_EDEFAULT.equals(returnAffectedObjects);
			case XmlaPackage.PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT:
				return DBPROP_MSMD_REQUEST_MEMORY_LIMIT_EDEFAULT == null ? dbpropMsmdRequestMemoryLimit != null : !DBPROP_MSMD_REQUEST_MEMORY_LIMIT_EDEFAULT.equals(dbpropMsmdRequestMemoryLimit);
			case XmlaPackage.PROPERTY_LIST__APPLICATION_CONTEXT:
				return APPLICATION_CONTEXT_EDEFAULT == null ? applicationContext != null : !APPLICATION_CONTEXT_EDEFAULT.equals(applicationContext);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataSourceInfo: ");
		result.append(dataSourceInfo);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", localeIdentifier: ");
		result.append(localeIdentifier);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", stateSupport: ");
		if (stateSupportESet) result.append(stateSupport); else result.append("<unset>");
		result.append(", content: ");
		if (contentESet) result.append(content); else result.append("<unset>");
		result.append(", format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(", axisFormat: ");
		if (axisFormatESet) result.append(axisFormat); else result.append("<unset>");
		result.append(", beginRange: ");
		result.append(beginRange);
		result.append(", endRange: ");
		result.append(endRange);
		result.append(", mDXSupport: ");
		if (mDXSupportESet) result.append(mDXSupport); else result.append("<unset>");
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", providerVersion: ");
		result.append(providerVersion);
		result.append(", dBMSVersion: ");
		result.append(dBMSVersion);
		result.append(", providerType: ");
		if (providerTypeESet) result.append(providerType); else result.append("<unset>");
		result.append(", showHiddenCubes: ");
		if (showHiddenCubesESet) result.append(showHiddenCubes); else result.append("<unset>");
		result.append(", sQLSupport: ");
		result.append(sQLSupport);
		result.append(", transactionDDL: ");
		result.append(transactionDDL);
		result.append(", maximumRows: ");
		result.append(maximumRows);
		result.append(", roles: ");
		result.append(roles);
		result.append(", visualMode: ");
		if (visualModeESet) result.append(visualMode); else result.append("<unset>");
		result.append(", effectiveRoles: ");
		result.append(effectiveRoles);
		result.append(", effectiveUserName: ");
		result.append(effectiveUserName);
		result.append(", serverName: ");
		result.append(serverName);
		result.append(", catalogLocation: ");
		if (catalogLocationESet) result.append(catalogLocation); else result.append("<unset>");
		result.append(", dbpropCatalogTerm: ");
		result.append(dbpropCatalogTerm);
		result.append(", dbpropCatalogUsage: ");
		result.append(dbpropCatalogUsage);
		result.append(", dbpropColumnDefinition: ");
		result.append(dbpropColumnDefinition);
		result.append(", dbpropConcatNullBehavior: ");
		if (dbpropConcatNullBehaviorESet) result.append(dbpropConcatNullBehavior); else result.append("<unset>");
		result.append(", dbpropDataSourceReadOnly: ");
		if (dbpropDataSourceReadOnlyESet) result.append(dbpropDataSourceReadOnly); else result.append("<unset>");
		result.append(", dbpropGroupBy: ");
		result.append(dbpropGroupBy);
		result.append(", dbpropHeterogeneousTables: ");
		result.append(dbpropHeterogeneousTables);
		result.append(", dbpropIdentifierCase: ");
		result.append(dbpropIdentifierCase);
		result.append(", dbpropMaxIndexSize: ");
		result.append(dbpropMaxIndexSize);
		result.append(", dbpropMaxOpenChapters: ");
		result.append(dbpropMaxOpenChapters);
		result.append(", dbpropMaxRowSize: ");
		result.append(dbpropMaxRowSize);
		result.append(", dbpropMaxRowSizeIncludeBlob: ");
		if (dbpropMaxRowSizeIncludeBlobESet) result.append(dbpropMaxRowSizeIncludeBlob); else result.append("<unset>");
		result.append(", dbpropMaxTablesInSelect: ");
		result.append(dbpropMaxTablesInSelect);
		result.append(", dbpropMultiTableUpdate: ");
		if (dbpropMultiTableUpdateESet) result.append(dbpropMultiTableUpdate); else result.append("<unset>");
		result.append(", dbpropNullCollation: ");
		if (dbpropNullCollationESet) result.append(dbpropNullCollation); else result.append("<unset>");
		result.append(", dbpropOrderByColumnsInSelect: ");
		if (dbpropOrderByColumnsInSelectESet) result.append(dbpropOrderByColumnsInSelect); else result.append("<unset>");
		result.append(", dbpropOutputParameterAvailable: ");
		if (dbpropOutputParameterAvailableESet) result.append(dbpropOutputParameterAvailable); else result.append("<unset>");
		result.append(", dbpropPersistentIdType: ");
		if (dbpropPersistentIdTypeESet) result.append(dbpropPersistentIdType); else result.append("<unset>");
		result.append(", dbpropPrepareAbortBehavior: ");
		if (dbpropPrepareAbortBehaviorESet) result.append(dbpropPrepareAbortBehavior); else result.append("<unset>");
		result.append(", dbpropPrepareCommitBehavior: ");
		if (dbpropPrepareCommitBehaviorESet) result.append(dbpropPrepareCommitBehavior); else result.append("<unset>");
		result.append(", dbpropProcedureTerm: ");
		result.append(dbpropProcedureTerm);
		result.append(", dbpropQuotedIdentifierCase: ");
		if (dbpropQuotedIdentifierCaseESet) result.append(dbpropQuotedIdentifierCase); else result.append("<unset>");
		result.append(", dbpropSchemaUsage: ");
		result.append(dbpropSchemaUsage);
		result.append(", dbpropSqlSupport: ");
		result.append(dbpropSqlSupport);
		result.append(", dbpropSubqueries: ");
		result.append(dbpropSubqueries);
		result.append(", dbpropSupportedTxnDdl: ");
		result.append(dbpropSupportedTxnDdl);
		result.append(", mdpropMdxSubqueries: ");
		result.append(mdpropMdxSubqueries);
		result.append(", dbpropSupportedTxnIsoLevels: ");
		result.append(dbpropSupportedTxnIsoLevels);
		result.append(", dbpropSupportedTxnIsoRetain: ");
		result.append(dbpropSupportedTxnIsoRetain);
		result.append(", dbpropTableTerm: ");
		result.append(dbpropTableTerm);
		result.append(", mdpropAggregateCellUpdate: ");
		if (mdpropAggregateCellUpdateESet) result.append(mdpropAggregateCellUpdate); else result.append("<unset>");
		result.append(", mdpropAxes: ");
		result.append(mdpropAxes);
		result.append(", mdpropFlatteningSupport: ");
		if (mdpropFlatteningSupportESet) result.append(mdpropFlatteningSupport); else result.append("<unset>");
		result.append(", mdpropMdxCaseSupport: ");
		result.append(mdpropMdxCaseSupport);
		result.append(", mdpropMdxDescFlags: ");
		result.append(mdpropMdxDescFlags);
		result.append(", mdpropMdxDrillFunctions: ");
		result.append(mdpropMdxDrillFunctions);
		result.append(", mdpropMdxFormulas: ");
		result.append(mdpropMdxFormulas);
		result.append(", mdpropMdxJoinCubes: ");
		result.append(mdpropMdxJoinCubes);
		result.append(", mdpropMdxMemberFunctions: ");
		result.append(mdpropMdxMemberFunctions);
		result.append(", mdpropMdxNonMeasureExpressions: ");
		if (mdpropMdxNonMeasureExpressionsESet) result.append(mdpropMdxNonMeasureExpressions); else result.append("<unset>");
		result.append(", mdpropMdxNumericFunctions: ");
		result.append(mdpropMdxNumericFunctions);
		result.append(", mdpropMdxObjQualification: ");
		result.append(mdpropMdxObjQualification);
		result.append(", mdpropMdxOuterReference: ");
		result.append(mdpropMdxOuterReference);
		result.append(", mdpropMdxQueryByProperty: ");
		if (mdpropMdxQueryByPropertyESet) result.append(mdpropMdxQueryByProperty); else result.append("<unset>");
		result.append(", mdpropMdxRangeRowset: ");
		if (mdpropMdxRangeRowsetESet) result.append(mdpropMdxRangeRowset); else result.append("<unset>");
		result.append(", mdpropMdxSetFunctions: ");
		result.append(mdpropMdxSetFunctions);
		result.append(", mdpropMdxSlicer: ");
		if (mdpropMdxSlicerESet) result.append(mdpropMdxSlicer); else result.append("<unset>");
		result.append(", mdpropMdxStringCompop: ");
		result.append(mdpropMdxStringCompop);
		result.append(", mdpropNamedLevels: ");
		result.append(mdpropNamedLevels);
		result.append(", dbpropMsmdMDXCompatibility: ");
		if (dbpropMsmdMDXCompatibilityESet) result.append(dbpropMsmdMDXCompatibility); else result.append("<unset>");
		result.append(", dbpropMsmdSQLCompatibility: ");
		result.append(dbpropMsmdSQLCompatibility);
		result.append(", dbpropMsmdMDXUniqueNameStyle: ");
		result.append(dbpropMsmdMDXUniqueNameStyle);
		result.append(", dbpropMsmdCachePolicy: ");
		result.append(dbpropMsmdCachePolicy);
		result.append(", dbpropMsmdCacheRatio: ");
		result.append(dbpropMsmdCacheRatio);
		result.append(", dbpropMsmdCacheMode: ");
		result.append(dbpropMsmdCacheMode);
		result.append(", dbpropMsmdCompareCaseSensitiveStringFlags: ");
		if (dbpropMsmdCompareCaseSensitiveStringFlagsESet) result.append(dbpropMsmdCompareCaseSensitiveStringFlags); else result.append("<unset>");
		result.append(", dbpropMsmdCompareCaseNotSensitiveStringFlags: ");
		result.append(dbpropMsmdCompareCaseNotSensitiveStringFlags);
		result.append(", dbpropMsmdFlattened2: ");
		if (dbpropMsmdFlattened2ESet) result.append(dbpropMsmdFlattened2); else result.append("<unset>");
		result.append(", dbpropInitMode: ");
		result.append(dbpropInitMode);
		result.append(", sspropInitAppName: ");
		result.append(sspropInitAppName);
		result.append(", sspropInitWsid: ");
		result.append(sspropInitWsid);
		result.append(", sspropInitPacketsize: ");
		result.append(sspropInitPacketsize);
		result.append(", readOnlySession: ");
		result.append(readOnlySession);
		result.append(", securedCellValue: ");
		if (securedCellValueESet) result.append(securedCellValue); else result.append("<unset>");
		result.append(", nonEmptyThreshold: ");
		result.append(nonEmptyThreshold);
		result.append(", safetyOptions: ");
		if (safetyOptionsESet) result.append(safetyOptions); else result.append("<unset>");
		result.append(", dbpropMsmdCacheRatio2: ");
		if (dbpropMsmdCacheRatio2ESet) result.append(dbpropMsmdCacheRatio2); else result.append("<unset>");
		result.append(", dbpropMsmdUseFormulaCache: ");
		result.append(dbpropMsmdUseFormulaCache);
		result.append(", dbpropMsmdDynamicDebugLimit: ");
		result.append(dbpropMsmdDynamicDebugLimit);
		result.append(", dbpropMsmdDebugMode: ");
		result.append(dbpropMsmdDebugMode);
		result.append(", dialect: ");
		if (dialectESet) result.append(dialect); else result.append("<unset>");
		result.append(", impactAnalysis: ");
		if (impactAnalysisESet) result.append(impactAnalysis); else result.append("<unset>");
		result.append(", sQLQueryMode: ");
		if (sQLQueryModeESet) result.append(sQLQueryMode); else result.append("<unset>");
		result.append(", clientProcessID: ");
		result.append(clientProcessID);
		result.append(", cube: ");
		result.append(cube);
		result.append(", returnCellProperties: ");
		if (returnCellPropertiesESet) result.append(returnCellProperties); else result.append("<unset>");
		result.append(", commitTimeout: ");
		result.append(commitTimeout);
		result.append(", forceCommitTimeout: ");
		result.append(forceCommitTimeout);
		result.append(", executionMode: ");
		result.append(executionMode);
		result.append(", realTimeOlap: ");
		if (realTimeOlapESet) result.append(realTimeOlap); else result.append("<unset>");
		result.append(", mdxMissingMemberMode: ");
		if (mdxMissingMemberModeESet) result.append(mdxMissingMemberMode); else result.append("<unset>");
		result.append(", mdpropMdxNamedSets: ");
		result.append(mdpropMdxNamedSets);
		result.append(", dbpropMsmdSubqueries: ");
		if (dbpropMsmdSubqueriesESet) result.append(dbpropMsmdSubqueries); else result.append("<unset>");
		result.append(", dbpropMsmdAutoExists: ");
		if (dbpropMsmdAutoExistsESet) result.append(dbpropMsmdAutoExists); else result.append("<unset>");
		result.append(", customData: ");
		result.append(customData);
		result.append(", disablePrefetchFacts: ");
		if (disablePrefetchFactsESet) result.append(disablePrefetchFacts); else result.append("<unset>");
		result.append(", updateIsolationLevel: ");
		if (updateIsolationLevelESet) result.append(updateIsolationLevel); else result.append("<unset>");
		result.append(", dbpropMsmdErrorMessageMode: ");
		result.append(dbpropMsmdErrorMessageMode);
		result.append(", mdpropMdxDdlExtensions: ");
		result.append(mdpropMdxDdlExtensions);
		result.append(", responseEncoding: ");
		if (responseEncodingESet) result.append(responseEncoding); else result.append("<unset>");
		result.append(", memoryLockingMode: ");
		if (memoryLockingModeESet) result.append(memoryLockingMode); else result.append("<unset>");
		result.append(", dbpropMsmdOptimizeResponse: ");
		result.append(dbpropMsmdOptimizeResponse);
		result.append(", dbpropMsmdActivityID: ");
		result.append(dbpropMsmdActivityID);
		result.append(", dbpropMsmdRequestID: ");
		result.append(dbpropMsmdRequestID);
		result.append(", returnAffectedObjects: ");
		result.append(returnAffectedObjects);
		result.append(", dbpropMsmdRequestMemoryLimit: ");
		result.append(dbpropMsmdRequestMemoryLimit);
		result.append(", applicationContext: ");
		result.append(applicationContext);
		result.append(')');
		return result.toString();
	}

} //PropertyListImpl
