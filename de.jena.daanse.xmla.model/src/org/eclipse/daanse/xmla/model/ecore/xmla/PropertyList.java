/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDataSourceInfo <em>Data Source Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getLocaleIdentifier <em>Locale Identifier</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getStateSupport <em>State Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getAxisFormat <em>Axis Format</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getBeginRange <em>Begin Range</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEndRange <em>End Range</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMDXSupport <em>MDX Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderVersion <em>Provider Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDBMSVersion <em>DBMS Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderType <em>Provider Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isShowHiddenCubes <em>Show Hidden Cubes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLSupport <em>SQL Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTransactionDDL <em>Transaction DDL</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMaximumRows <em>Maximum Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getVisualMode <em>Visual Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveRoles <em>Effective Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveUserName <em>Effective User Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalogLocation <em>Catalog Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogTerm <em>Dbprop Catalog Term</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogUsage <em>Dbprop Catalog Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropColumnDefinition <em>Dbprop Column Definition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropConcatNullBehavior <em>Dbprop Concat Null Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropDataSourceReadOnly <em>Dbprop Data Source Read Only</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropGroupBy <em>Dbprop Group By</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropHeterogeneousTables <em>Dbprop Heterogeneous Tables</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropIdentifierCase <em>Dbprop Identifier Case</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxIndexSize <em>Dbprop Max Index Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxOpenChapters <em>Dbprop Max Open Chapters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxRowSize <em>Dbprop Max Row Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMaxRowSizeIncludeBlob <em>Dbprop Max Row Size Include Blob</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxTablesInSelect <em>Dbprop Max Tables In Select</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMultiTableUpdate <em>Dbprop Multi Table Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropNullCollation <em>Dbprop Null Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropOrderByColumnsInSelect <em>Dbprop Order By Columns In Select</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropOutputParameterAvailable <em>Dbprop Output Parameter Available</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPersistentIdType <em>Dbprop Persistent Id Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareAbortBehavior <em>Dbprop Prepare Abort Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareCommitBehavior <em>Dbprop Prepare Commit Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropProcedureTerm <em>Dbprop Procedure Term</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropQuotedIdentifierCase <em>Dbprop Quoted Identifier Case</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSchemaUsage <em>Dbprop Schema Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSqlSupport <em>Dbprop Sql Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSubqueries <em>Dbprop Subqueries</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnDdl <em>Dbprop Supported Txn Ddl</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSubqueries <em>Mdprop Mdx Subqueries</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoLevels <em>Dbprop Supported Txn Iso Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoRetain <em>Dbprop Supported Txn Iso Retain</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropTableTerm <em>Dbprop Table Term</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAggregateCellUpdate <em>Mdprop Aggregate Cell Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAxes <em>Mdprop Axes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropFlatteningSupport <em>Mdprop Flattening Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxCaseSupport <em>Mdprop Mdx Case Support</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDescFlags <em>Mdprop Mdx Desc Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDrillFunctions <em>Mdprop Mdx Drill Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxFormulas <em>Mdprop Mdx Formulas</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxJoinCubes <em>Mdprop Mdx Join Cubes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxMemberFunctions <em>Mdprop Mdx Member Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNonMeasureExpressions <em>Mdprop Mdx Non Measure Expressions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNumericFunctions <em>Mdprop Mdx Numeric Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxObjQualification <em>Mdprop Mdx Obj Qualification</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxOuterReference <em>Mdprop Mdx Outer Reference</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isMdpropMdxQueryByProperty <em>Mdprop Mdx Query By Property</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxRangeRowset <em>Mdprop Mdx Range Rowset</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSetFunctions <em>Mdprop Mdx Set Functions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSlicer <em>Mdprop Mdx Slicer</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxStringCompop <em>Mdprop Mdx String Compop</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropNamedLevels <em>Mdprop Named Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXCompatibility <em>Dbprop Msmd MDX Compatibility</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSQLCompatibility <em>Dbprop Msmd SQL Compatibility</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXUniqueNameStyle <em>Dbprop Msmd MDX Unique Name Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCachePolicy <em>Dbprop Msmd Cache Policy</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio <em>Dbprop Msmd Cache Ratio</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheMode <em>Dbprop Msmd Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseSensitiveStringFlags <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseNotSensitiveStringFlags <em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMsmdFlattened2 <em>Dbprop Msmd Flattened2</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropInitMode <em>Dbprop Init Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitAppName <em>Ssprop Init App Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitWsid <em>Ssprop Init Wsid</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitPacketsize <em>Ssprop Init Packetsize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReadOnlySession <em>Read Only Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSecuredCellValue <em>Secured Cell Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getNonEmptyThreshold <em>Non Empty Threshold</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSafetyOptions <em>Safety Options</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio2 <em>Dbprop Msmd Cache Ratio2</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdUseFormulaCache <em>Dbprop Msmd Use Formula Cache</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDynamicDebugLimit <em>Dbprop Msmd Dynamic Debug Limit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDebugMode <em>Dbprop Msmd Debug Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isImpactAnalysis <em>Impact Analysis</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLQueryMode <em>SQL Query Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getClientProcessID <em>Client Process ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isReturnCellProperties <em>Return Cell Properties</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCommitTimeout <em>Commit Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getForceCommitTimeout <em>Force Commit Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isRealTimeOlap <em>Real Time Olap</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNamedSets <em>Mdprop Mdx Named Sets</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSubqueries <em>Dbprop Msmd Subqueries</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdAutoExists <em>Dbprop Msmd Auto Exists</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCustomData <em>Custom Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDisablePrefetchFacts <em>Disable Prefetch Facts</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUpdateIsolationLevel <em>Update Isolation Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdErrorMessageMode <em>Dbprop Msmd Error Message Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDdlExtensions <em>Mdprop Mdx Ddl Extensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getResponseEncoding <em>Response Encoding</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMemoryLockingMode <em>Memory Locking Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdOptimizeResponse <em>Dbprop Msmd Optimize Response</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdActivityID <em>Dbprop Msmd Activity ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestID <em>Dbprop Msmd Request ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReturnAffectedObjects <em>Return Affected Objects</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestMemoryLimit <em>Dbprop Msmd Request Memory Limit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getApplicationContext <em>Application Context</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList()
 * @model extendedMetaData="name='PropertyList' kind='elementOnly'"
 * @generated
 */
public interface PropertyList extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Info</em>' attribute.
	 * @see #setDataSourceInfo(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DataSourceInfo()
	 * @model extendedMetaData="kind='element' name='DataSourceInfo'"
	 * @generated
	 */
	String getDataSourceInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDataSourceInfo <em>Data Source Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Info</em>' attribute.
	 * @see #getDataSourceInfo()
	 * @generated
	 */
	void setDataSourceInfo(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Timeout()
	 * @model extendedMetaData="kind='element' name='Timeout'"
	 * @generated
	 */
	BigInteger getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(BigInteger value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_UserName()
	 * @model extendedMetaData="kind='element' name='UserName'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Password()
	 * @model extendedMetaData="kind='element' name='Password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Locale Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Identifier</em>' attribute.
	 * @see #setLocaleIdentifier(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_LocaleIdentifier()
	 * @model extendedMetaData="kind='element' name='LocaleIdentifier'"
	 * @generated
	 */
	BigInteger getLocaleIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getLocaleIdentifier <em>Locale Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Identifier</em>' attribute.
	 * @see #getLocaleIdentifier()
	 * @generated
	 */
	void setLocaleIdentifier(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Catalog()
	 * @model extendedMetaData="kind='element' name='Catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>State Support</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Support</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateSupport
	 * @see #isSetStateSupport()
	 * @see #unsetStateSupport()
	 * @see #setStateSupport(StateSupport)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_StateSupport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StateSupport'"
	 * @generated
	 */
	StateSupport getStateSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getStateSupport <em>State Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Support</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateSupport
	 * @see #isSetStateSupport()
	 * @see #unsetStateSupport()
	 * @see #getStateSupport()
	 * @generated
	 */
	void setStateSupport(StateSupport value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getStateSupport <em>State Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStateSupport()
	 * @see #getStateSupport()
	 * @see #setStateSupport(StateSupport)
	 * @generated
	 */
	void unsetStateSupport();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getStateSupport <em>State Support</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State Support</em>' attribute is set.
	 * @see #unsetStateSupport()
	 * @see #getStateSupport()
	 * @see #setStateSupport(StateSupport)
	 * @generated
	 */
	boolean isSetStateSupport();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Content
	 * @see #isSetContent()
	 * @see #unsetContent()
	 * @see #setContent(Content)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Content()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Content'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Content
	 * @see #isSetContent()
	 * @see #unsetContent()
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContent()
	 * @see #getContent()
	 * @see #setContent(Content)
	 * @generated
	 */
	void unsetContent();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getContent <em>Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Content</em>' attribute is set.
	 * @see #unsetContent()
	 * @see #getContent()
	 * @see #setContent(Content)
	 * @generated
	 */
	boolean isSetContent();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.Format}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Format
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(Format)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Format()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Format'"
	 * @generated
	 */
	Format getFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Format
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Format value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(Format)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(Format)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Axis Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Format</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormat
	 * @see #isSetAxisFormat()
	 * @see #unsetAxisFormat()
	 * @see #setAxisFormat(AxisFormat)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_AxisFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AxisFormat'"
	 * @generated
	 */
	AxisFormat getAxisFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getAxisFormat <em>Axis Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Format</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormat
	 * @see #isSetAxisFormat()
	 * @see #unsetAxisFormat()
	 * @see #getAxisFormat()
	 * @generated
	 */
	void setAxisFormat(AxisFormat value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getAxisFormat <em>Axis Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxisFormat()
	 * @see #getAxisFormat()
	 * @see #setAxisFormat(AxisFormat)
	 * @generated
	 */
	void unsetAxisFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getAxisFormat <em>Axis Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis Format</em>' attribute is set.
	 * @see #unsetAxisFormat()
	 * @see #getAxisFormat()
	 * @see #setAxisFormat(AxisFormat)
	 * @generated
	 */
	boolean isSetAxisFormat();

	/**
	 * Returns the value of the '<em><b>Begin Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Range</em>' attribute.
	 * @see #setBeginRange(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_BeginRange()
	 * @model extendedMetaData="kind='element' name='BeginRange'"
	 * @generated
	 */
	BigInteger getBeginRange();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getBeginRange <em>Begin Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Range</em>' attribute.
	 * @see #getBeginRange()
	 * @generated
	 */
	void setBeginRange(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Range</em>' attribute.
	 * @see #setEndRange(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_EndRange()
	 * @model extendedMetaData="kind='element' name='EndRange'"
	 * @generated
	 */
	BigInteger getEndRange();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEndRange <em>End Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Range</em>' attribute.
	 * @see #getEndRange()
	 * @generated
	 */
	void setEndRange(BigInteger value);

	/**
	 * Returns the value of the '<em><b>MDX Support</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDX Support</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupport
	 * @see #isSetMDXSupport()
	 * @see #unsetMDXSupport()
	 * @see #setMDXSupport(MDXSupport)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MDXSupport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MDXSupport'"
	 * @generated
	 */
	MDXSupport getMDXSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMDXSupport <em>MDX Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDX Support</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupport
	 * @see #isSetMDXSupport()
	 * @see #unsetMDXSupport()
	 * @see #getMDXSupport()
	 * @generated
	 */
	void setMDXSupport(MDXSupport value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMDXSupport <em>MDX Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMDXSupport()
	 * @see #getMDXSupport()
	 * @see #setMDXSupport(MDXSupport)
	 * @generated
	 */
	void unsetMDXSupport();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMDXSupport <em>MDX Support</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MDX Support</em>' attribute is set.
	 * @see #unsetMDXSupport()
	 * @see #getMDXSupport()
	 * @see #setMDXSupport(MDXSupport)
	 * @generated
	 */
	boolean isSetMDXSupport();

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ProviderName()
	 * @model extendedMetaData="kind='element' name='ProviderName'"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Version</em>' attribute.
	 * @see #setProviderVersion(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ProviderVersion()
	 * @model extendedMetaData="kind='element' name='ProviderVersion'"
	 * @generated
	 */
	String getProviderVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderVersion <em>Provider Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Version</em>' attribute.
	 * @see #getProviderVersion()
	 * @generated
	 */
	void setProviderVersion(String value);

	/**
	 * Returns the value of the '<em><b>DBMS Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DBMS Version</em>' attribute.
	 * @see #setDBMSVersion(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DBMSVersion()
	 * @model extendedMetaData="kind='element' name='DBMSVersion'"
	 * @generated
	 */
	String getDBMSVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDBMSVersion <em>DBMS Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBMS Version</em>' attribute.
	 * @see #getDBMSVersion()
	 * @generated
	 */
	void setDBMSVersion(String value);

	/**
	 * Returns the value of the '<em><b>Provider Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProviderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProviderType
	 * @see #isSetProviderType()
	 * @see #unsetProviderType()
	 * @see #setProviderType(ProviderType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ProviderType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProviderType'"
	 * @generated
	 */
	ProviderType getProviderType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderType <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProviderType
	 * @see #isSetProviderType()
	 * @see #unsetProviderType()
	 * @see #getProviderType()
	 * @generated
	 */
	void setProviderType(ProviderType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderType <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProviderType()
	 * @see #getProviderType()
	 * @see #setProviderType(ProviderType)
	 * @generated
	 */
	void unsetProviderType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getProviderType <em>Provider Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provider Type</em>' attribute is set.
	 * @see #unsetProviderType()
	 * @see #getProviderType()
	 * @see #setProviderType(ProviderType)
	 * @generated
	 */
	boolean isSetProviderType();

	/**
	 * Returns the value of the '<em><b>Show Hidden Cubes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Hidden Cubes</em>' attribute.
	 * @see #isSetShowHiddenCubes()
	 * @see #unsetShowHiddenCubes()
	 * @see #setShowHiddenCubes(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ShowHiddenCubes()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ShowHiddenCubes'"
	 * @generated
	 */
	boolean isShowHiddenCubes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isShowHiddenCubes <em>Show Hidden Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Hidden Cubes</em>' attribute.
	 * @see #isSetShowHiddenCubes()
	 * @see #unsetShowHiddenCubes()
	 * @see #isShowHiddenCubes()
	 * @generated
	 */
	void setShowHiddenCubes(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isShowHiddenCubes <em>Show Hidden Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowHiddenCubes()
	 * @see #isShowHiddenCubes()
	 * @see #setShowHiddenCubes(boolean)
	 * @generated
	 */
	void unsetShowHiddenCubes();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isShowHiddenCubes <em>Show Hidden Cubes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Hidden Cubes</em>' attribute is set.
	 * @see #unsetShowHiddenCubes()
	 * @see #isShowHiddenCubes()
	 * @see #setShowHiddenCubes(boolean)
	 * @generated
	 */
	boolean isSetShowHiddenCubes();

	/**
	 * Returns the value of the '<em><b>SQL Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Support</em>' attribute.
	 * @see #setSQLSupport(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SQLSupport()
	 * @model extendedMetaData="kind='element' name='SQLSupport'"
	 * @generated
	 */
	BigInteger getSQLSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLSupport <em>SQL Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQL Support</em>' attribute.
	 * @see #getSQLSupport()
	 * @generated
	 */
	void setSQLSupport(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Transaction DDL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction DDL</em>' attribute.
	 * @see #setTransactionDDL(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_TransactionDDL()
	 * @model extendedMetaData="kind='element' name='TransactionDDL'"
	 * @generated
	 */
	BigInteger getTransactionDDL();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getTransactionDDL <em>Transaction DDL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction DDL</em>' attribute.
	 * @see #getTransactionDDL()
	 * @generated
	 */
	void setTransactionDDL(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Maximum Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Rows</em>' attribute.
	 * @see #setMaximumRows(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MaximumRows()
	 * @model extendedMetaData="kind='element' name='MaximumRows'"
	 * @generated
	 */
	BigInteger getMaximumRows();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMaximumRows <em>Maximum Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Rows</em>' attribute.
	 * @see #getMaximumRows()
	 * @generated
	 */
	void setMaximumRows(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute.
	 * @see #setRoles(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Roles()
	 * @model extendedMetaData="kind='element' name='Roles'"
	 * @generated
	 */
	String getRoles();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getRoles <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' attribute.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(String value);

	/**
	 * Returns the value of the '<em><b>Visual Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.VisualMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisualMode
	 * @see #isSetVisualMode()
	 * @see #unsetVisualMode()
	 * @see #setVisualMode(VisualMode)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_VisualMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VisualMode'"
	 * @generated
	 */
	VisualMode getVisualMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getVisualMode <em>Visual Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VisualMode
	 * @see #isSetVisualMode()
	 * @see #unsetVisualMode()
	 * @see #getVisualMode()
	 * @generated
	 */
	void setVisualMode(VisualMode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getVisualMode <em>Visual Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisualMode()
	 * @see #getVisualMode()
	 * @see #setVisualMode(VisualMode)
	 * @generated
	 */
	void unsetVisualMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getVisualMode <em>Visual Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visual Mode</em>' attribute is set.
	 * @see #unsetVisualMode()
	 * @see #getVisualMode()
	 * @see #setVisualMode(VisualMode)
	 * @generated
	 */
	boolean isSetVisualMode();

	/**
	 * Returns the value of the '<em><b>Effective Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Roles</em>' attribute.
	 * @see #setEffectiveRoles(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_EffectiveRoles()
	 * @model extendedMetaData="kind='element' name='EffectiveRoles'"
	 * @generated
	 */
	String getEffectiveRoles();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveRoles <em>Effective Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Roles</em>' attribute.
	 * @see #getEffectiveRoles()
	 * @generated
	 */
	void setEffectiveRoles(String value);

	/**
	 * Returns the value of the '<em><b>Effective User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective User Name</em>' attribute.
	 * @see #setEffectiveUserName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_EffectiveUserName()
	 * @model extendedMetaData="kind='element' name='EffectiveUserName'"
	 * @generated
	 */
	String getEffectiveUserName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getEffectiveUserName <em>Effective User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective User Name</em>' attribute.
	 * @see #getEffectiveUserName()
	 * @generated
	 */
	void setEffectiveUserName(String value);

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #setServerName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ServerName()
	 * @model extendedMetaData="kind='element' name='ServerName'"
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Returns the value of the '<em><b>Catalog Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Location</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocation
	 * @see #isSetCatalogLocation()
	 * @see #unsetCatalogLocation()
	 * @see #setCatalogLocation(CatalogLocation)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_CatalogLocation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CatalogLocation'"
	 * @generated
	 */
	CatalogLocation getCatalogLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalogLocation <em>Catalog Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Location</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocation
	 * @see #isSetCatalogLocation()
	 * @see #unsetCatalogLocation()
	 * @see #getCatalogLocation()
	 * @generated
	 */
	void setCatalogLocation(CatalogLocation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalogLocation <em>Catalog Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCatalogLocation()
	 * @see #getCatalogLocation()
	 * @see #setCatalogLocation(CatalogLocation)
	 * @generated
	 */
	void unsetCatalogLocation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCatalogLocation <em>Catalog Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Catalog Location</em>' attribute is set.
	 * @see #unsetCatalogLocation()
	 * @see #getCatalogLocation()
	 * @see #setCatalogLocation(CatalogLocation)
	 * @generated
	 */
	boolean isSetCatalogLocation();

	/**
	 * Returns the value of the '<em><b>Dbprop Catalog Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Catalog Term</em>' attribute.
	 * @see #setDbpropCatalogTerm(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropCatalogTerm()
	 * @model extendedMetaData="kind='element' name='DbpropCatalogTerm'"
	 * @generated
	 */
	String getDbpropCatalogTerm();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogTerm <em>Dbprop Catalog Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Catalog Term</em>' attribute.
	 * @see #getDbpropCatalogTerm()
	 * @generated
	 */
	void setDbpropCatalogTerm(String value);

	/**
	 * Returns the value of the '<em><b>Dbprop Catalog Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Catalog Usage</em>' attribute.
	 * @see #setDbpropCatalogUsage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropCatalogUsage()
	 * @model extendedMetaData="kind='element' name='DbpropCatalogUsage'"
	 * @generated
	 */
	BigInteger getDbpropCatalogUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropCatalogUsage <em>Dbprop Catalog Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Catalog Usage</em>' attribute.
	 * @see #getDbpropCatalogUsage()
	 * @generated
	 */
	void setDbpropCatalogUsage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Column Definition</em>' attribute.
	 * @see #setDbpropColumnDefinition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropColumnDefinition()
	 * @model extendedMetaData="kind='element' name='DbpropColumnDefinition'"
	 * @generated
	 */
	BigInteger getDbpropColumnDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropColumnDefinition <em>Dbprop Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Column Definition</em>' attribute.
	 * @see #getDbpropColumnDefinition()
	 * @generated
	 */
	void setDbpropColumnDefinition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Concat Null Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Concat Null Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehavior
	 * @see #isSetDbpropConcatNullBehavior()
	 * @see #unsetDbpropConcatNullBehavior()
	 * @see #setDbpropConcatNullBehavior(DbpropConcatNullBehavior)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropConcatNullBehavior()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropConcatNullBehavior'"
	 * @generated
	 */
	DbpropConcatNullBehavior getDbpropConcatNullBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropConcatNullBehavior <em>Dbprop Concat Null Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Concat Null Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehavior
	 * @see #isSetDbpropConcatNullBehavior()
	 * @see #unsetDbpropConcatNullBehavior()
	 * @see #getDbpropConcatNullBehavior()
	 * @generated
	 */
	void setDbpropConcatNullBehavior(DbpropConcatNullBehavior value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropConcatNullBehavior <em>Dbprop Concat Null Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropConcatNullBehavior()
	 * @see #getDbpropConcatNullBehavior()
	 * @see #setDbpropConcatNullBehavior(DbpropConcatNullBehavior)
	 * @generated
	 */
	void unsetDbpropConcatNullBehavior();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropConcatNullBehavior <em>Dbprop Concat Null Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Concat Null Behavior</em>' attribute is set.
	 * @see #unsetDbpropConcatNullBehavior()
	 * @see #getDbpropConcatNullBehavior()
	 * @see #setDbpropConcatNullBehavior(DbpropConcatNullBehavior)
	 * @generated
	 */
	boolean isSetDbpropConcatNullBehavior();

	/**
	 * Returns the value of the '<em><b>Dbprop Data Source Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Data Source Read Only</em>' attribute.
	 * @see #isSetDbpropDataSourceReadOnly()
	 * @see #unsetDbpropDataSourceReadOnly()
	 * @see #setDbpropDataSourceReadOnly(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropDataSourceReadOnly()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DbpropDataSourceReadOnly'"
	 * @generated
	 */
	boolean isDbpropDataSourceReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropDataSourceReadOnly <em>Dbprop Data Source Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Data Source Read Only</em>' attribute.
	 * @see #isSetDbpropDataSourceReadOnly()
	 * @see #unsetDbpropDataSourceReadOnly()
	 * @see #isDbpropDataSourceReadOnly()
	 * @generated
	 */
	void setDbpropDataSourceReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropDataSourceReadOnly <em>Dbprop Data Source Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropDataSourceReadOnly()
	 * @see #isDbpropDataSourceReadOnly()
	 * @see #setDbpropDataSourceReadOnly(boolean)
	 * @generated
	 */
	void unsetDbpropDataSourceReadOnly();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropDataSourceReadOnly <em>Dbprop Data Source Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Data Source Read Only</em>' attribute is set.
	 * @see #unsetDbpropDataSourceReadOnly()
	 * @see #isDbpropDataSourceReadOnly()
	 * @see #setDbpropDataSourceReadOnly(boolean)
	 * @generated
	 */
	boolean isSetDbpropDataSourceReadOnly();

	/**
	 * Returns the value of the '<em><b>Dbprop Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Group By</em>' attribute.
	 * @see #setDbpropGroupBy(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropGroupBy()
	 * @model extendedMetaData="kind='element' name='DbpropGroupBy'"
	 * @generated
	 */
	BigInteger getDbpropGroupBy();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropGroupBy <em>Dbprop Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Group By</em>' attribute.
	 * @see #getDbpropGroupBy()
	 * @generated
	 */
	void setDbpropGroupBy(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Heterogeneous Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Heterogeneous Tables</em>' attribute.
	 * @see #setDbpropHeterogeneousTables(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropHeterogeneousTables()
	 * @model extendedMetaData="kind='element' name='DbpropHeterogeneousTables'"
	 * @generated
	 */
	BigInteger getDbpropHeterogeneousTables();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropHeterogeneousTables <em>Dbprop Heterogeneous Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Heterogeneous Tables</em>' attribute.
	 * @see #getDbpropHeterogeneousTables()
	 * @generated
	 */
	void setDbpropHeterogeneousTables(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Identifier Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Identifier Case</em>' attribute.
	 * @see #setDbpropIdentifierCase(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropIdentifierCase()
	 * @model extendedMetaData="kind='element' name='DbpropIdentifierCase'"
	 * @generated
	 */
	BigInteger getDbpropIdentifierCase();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropIdentifierCase <em>Dbprop Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Identifier Case</em>' attribute.
	 * @see #getDbpropIdentifierCase()
	 * @generated
	 */
	void setDbpropIdentifierCase(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Max Index Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Max Index Size</em>' attribute.
	 * @see #setDbpropMaxIndexSize(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMaxIndexSize()
	 * @model extendedMetaData="kind='element' name='DbpropMaxIndexSize'"
	 * @generated
	 */
	BigInteger getDbpropMaxIndexSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxIndexSize <em>Dbprop Max Index Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Max Index Size</em>' attribute.
	 * @see #getDbpropMaxIndexSize()
	 * @generated
	 */
	void setDbpropMaxIndexSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Max Open Chapters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Max Open Chapters</em>' attribute.
	 * @see #setDbpropMaxOpenChapters(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMaxOpenChapters()
	 * @model extendedMetaData="kind='element' name='DbpropMaxOpenChapters'"
	 * @generated
	 */
	BigInteger getDbpropMaxOpenChapters();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxOpenChapters <em>Dbprop Max Open Chapters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Max Open Chapters</em>' attribute.
	 * @see #getDbpropMaxOpenChapters()
	 * @generated
	 */
	void setDbpropMaxOpenChapters(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Max Row Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Max Row Size</em>' attribute.
	 * @see #setDbpropMaxRowSize(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMaxRowSize()
	 * @model extendedMetaData="kind='element' name='DbpropMaxRowSize'"
	 * @generated
	 */
	BigInteger getDbpropMaxRowSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxRowSize <em>Dbprop Max Row Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Max Row Size</em>' attribute.
	 * @see #getDbpropMaxRowSize()
	 * @generated
	 */
	void setDbpropMaxRowSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Max Row Size Include Blob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Max Row Size Include Blob</em>' attribute.
	 * @see #isSetDbpropMaxRowSizeIncludeBlob()
	 * @see #unsetDbpropMaxRowSizeIncludeBlob()
	 * @see #setDbpropMaxRowSizeIncludeBlob(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMaxRowSizeIncludeBlob()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DbpropMaxRowSizeIncludeBlob'"
	 * @generated
	 */
	boolean isDbpropMaxRowSizeIncludeBlob();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMaxRowSizeIncludeBlob <em>Dbprop Max Row Size Include Blob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Max Row Size Include Blob</em>' attribute.
	 * @see #isSetDbpropMaxRowSizeIncludeBlob()
	 * @see #unsetDbpropMaxRowSizeIncludeBlob()
	 * @see #isDbpropMaxRowSizeIncludeBlob()
	 * @generated
	 */
	void setDbpropMaxRowSizeIncludeBlob(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMaxRowSizeIncludeBlob <em>Dbprop Max Row Size Include Blob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMaxRowSizeIncludeBlob()
	 * @see #isDbpropMaxRowSizeIncludeBlob()
	 * @see #setDbpropMaxRowSizeIncludeBlob(boolean)
	 * @generated
	 */
	void unsetDbpropMaxRowSizeIncludeBlob();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMaxRowSizeIncludeBlob <em>Dbprop Max Row Size Include Blob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Max Row Size Include Blob</em>' attribute is set.
	 * @see #unsetDbpropMaxRowSizeIncludeBlob()
	 * @see #isDbpropMaxRowSizeIncludeBlob()
	 * @see #setDbpropMaxRowSizeIncludeBlob(boolean)
	 * @generated
	 */
	boolean isSetDbpropMaxRowSizeIncludeBlob();

	/**
	 * Returns the value of the '<em><b>Dbprop Max Tables In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Max Tables In Select</em>' attribute.
	 * @see #setDbpropMaxTablesInSelect(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMaxTablesInSelect()
	 * @model extendedMetaData="kind='element' name='DbpropMaxTablesInSelect'"
	 * @generated
	 */
	BigInteger getDbpropMaxTablesInSelect();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMaxTablesInSelect <em>Dbprop Max Tables In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Max Tables In Select</em>' attribute.
	 * @see #getDbpropMaxTablesInSelect()
	 * @generated
	 */
	void setDbpropMaxTablesInSelect(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Multi Table Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Multi Table Update</em>' attribute.
	 * @see #isSetDbpropMultiTableUpdate()
	 * @see #unsetDbpropMultiTableUpdate()
	 * @see #setDbpropMultiTableUpdate(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMultiTableUpdate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DbpropMultiTableUpdate'"
	 * @generated
	 */
	boolean isDbpropMultiTableUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMultiTableUpdate <em>Dbprop Multi Table Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Multi Table Update</em>' attribute.
	 * @see #isSetDbpropMultiTableUpdate()
	 * @see #unsetDbpropMultiTableUpdate()
	 * @see #isDbpropMultiTableUpdate()
	 * @generated
	 */
	void setDbpropMultiTableUpdate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMultiTableUpdate <em>Dbprop Multi Table Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMultiTableUpdate()
	 * @see #isDbpropMultiTableUpdate()
	 * @see #setDbpropMultiTableUpdate(boolean)
	 * @generated
	 */
	void unsetDbpropMultiTableUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMultiTableUpdate <em>Dbprop Multi Table Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Multi Table Update</em>' attribute is set.
	 * @see #unsetDbpropMultiTableUpdate()
	 * @see #isDbpropMultiTableUpdate()
	 * @see #setDbpropMultiTableUpdate(boolean)
	 * @generated
	 */
	boolean isSetDbpropMultiTableUpdate();

	/**
	 * Returns the value of the '<em><b>Dbprop Null Collation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Null Collation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollation
	 * @see #isSetDbpropNullCollation()
	 * @see #unsetDbpropNullCollation()
	 * @see #setDbpropNullCollation(DbpropNullCollation)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropNullCollation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropNullCollation'"
	 * @generated
	 */
	DbpropNullCollation getDbpropNullCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropNullCollation <em>Dbprop Null Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Null Collation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollation
	 * @see #isSetDbpropNullCollation()
	 * @see #unsetDbpropNullCollation()
	 * @see #getDbpropNullCollation()
	 * @generated
	 */
	void setDbpropNullCollation(DbpropNullCollation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropNullCollation <em>Dbprop Null Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropNullCollation()
	 * @see #getDbpropNullCollation()
	 * @see #setDbpropNullCollation(DbpropNullCollation)
	 * @generated
	 */
	void unsetDbpropNullCollation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropNullCollation <em>Dbprop Null Collation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Null Collation</em>' attribute is set.
	 * @see #unsetDbpropNullCollation()
	 * @see #getDbpropNullCollation()
	 * @see #setDbpropNullCollation(DbpropNullCollation)
	 * @generated
	 */
	boolean isSetDbpropNullCollation();

	/**
	 * Returns the value of the '<em><b>Dbprop Order By Columns In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Order By Columns In Select</em>' attribute.
	 * @see #isSetDbpropOrderByColumnsInSelect()
	 * @see #unsetDbpropOrderByColumnsInSelect()
	 * @see #setDbpropOrderByColumnsInSelect(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropOrderByColumnsInSelect()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DbpropOrderByColumnsInSelect'"
	 * @generated
	 */
	boolean isDbpropOrderByColumnsInSelect();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropOrderByColumnsInSelect <em>Dbprop Order By Columns In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Order By Columns In Select</em>' attribute.
	 * @see #isSetDbpropOrderByColumnsInSelect()
	 * @see #unsetDbpropOrderByColumnsInSelect()
	 * @see #isDbpropOrderByColumnsInSelect()
	 * @generated
	 */
	void setDbpropOrderByColumnsInSelect(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropOrderByColumnsInSelect <em>Dbprop Order By Columns In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropOrderByColumnsInSelect()
	 * @see #isDbpropOrderByColumnsInSelect()
	 * @see #setDbpropOrderByColumnsInSelect(boolean)
	 * @generated
	 */
	void unsetDbpropOrderByColumnsInSelect();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropOrderByColumnsInSelect <em>Dbprop Order By Columns In Select</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Order By Columns In Select</em>' attribute is set.
	 * @see #unsetDbpropOrderByColumnsInSelect()
	 * @see #isDbpropOrderByColumnsInSelect()
	 * @see #setDbpropOrderByColumnsInSelect(boolean)
	 * @generated
	 */
	boolean isSetDbpropOrderByColumnsInSelect();

	/**
	 * Returns the value of the '<em><b>Dbprop Output Parameter Available</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Output Parameter Available</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailable
	 * @see #isSetDbpropOutputParameterAvailable()
	 * @see #unsetDbpropOutputParameterAvailable()
	 * @see #setDbpropOutputParameterAvailable(DbpropOutputParameterAvailable)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropOutputParameterAvailable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropOutputParameterAvailable'"
	 * @generated
	 */
	DbpropOutputParameterAvailable getDbpropOutputParameterAvailable();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropOutputParameterAvailable <em>Dbprop Output Parameter Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Output Parameter Available</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailable
	 * @see #isSetDbpropOutputParameterAvailable()
	 * @see #unsetDbpropOutputParameterAvailable()
	 * @see #getDbpropOutputParameterAvailable()
	 * @generated
	 */
	void setDbpropOutputParameterAvailable(DbpropOutputParameterAvailable value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropOutputParameterAvailable <em>Dbprop Output Parameter Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropOutputParameterAvailable()
	 * @see #getDbpropOutputParameterAvailable()
	 * @see #setDbpropOutputParameterAvailable(DbpropOutputParameterAvailable)
	 * @generated
	 */
	void unsetDbpropOutputParameterAvailable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropOutputParameterAvailable <em>Dbprop Output Parameter Available</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Output Parameter Available</em>' attribute is set.
	 * @see #unsetDbpropOutputParameterAvailable()
	 * @see #getDbpropOutputParameterAvailable()
	 * @see #setDbpropOutputParameterAvailable(DbpropOutputParameterAvailable)
	 * @generated
	 */
	boolean isSetDbpropOutputParameterAvailable();

	/**
	 * Returns the value of the '<em><b>Dbprop Persistent Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Persistent Id Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdType
	 * @see #isSetDbpropPersistentIdType()
	 * @see #unsetDbpropPersistentIdType()
	 * @see #setDbpropPersistentIdType(DbpropPersistentIdType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropPersistentIdType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropPersistentIdType'"
	 * @generated
	 */
	DbpropPersistentIdType getDbpropPersistentIdType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPersistentIdType <em>Dbprop Persistent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Persistent Id Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdType
	 * @see #isSetDbpropPersistentIdType()
	 * @see #unsetDbpropPersistentIdType()
	 * @see #getDbpropPersistentIdType()
	 * @generated
	 */
	void setDbpropPersistentIdType(DbpropPersistentIdType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPersistentIdType <em>Dbprop Persistent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropPersistentIdType()
	 * @see #getDbpropPersistentIdType()
	 * @see #setDbpropPersistentIdType(DbpropPersistentIdType)
	 * @generated
	 */
	void unsetDbpropPersistentIdType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPersistentIdType <em>Dbprop Persistent Id Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Persistent Id Type</em>' attribute is set.
	 * @see #unsetDbpropPersistentIdType()
	 * @see #getDbpropPersistentIdType()
	 * @see #setDbpropPersistentIdType(DbpropPersistentIdType)
	 * @generated
	 */
	boolean isSetDbpropPersistentIdType();

	/**
	 * Returns the value of the '<em><b>Dbprop Prepare Abort Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Prepare Abort Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehavior
	 * @see #isSetDbpropPrepareAbortBehavior()
	 * @see #unsetDbpropPrepareAbortBehavior()
	 * @see #setDbpropPrepareAbortBehavior(DbpropPrepareAbortBehavior)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropPrepareAbortBehavior()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropPrepareAbortBehavior'"
	 * @generated
	 */
	DbpropPrepareAbortBehavior getDbpropPrepareAbortBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareAbortBehavior <em>Dbprop Prepare Abort Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Prepare Abort Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehavior
	 * @see #isSetDbpropPrepareAbortBehavior()
	 * @see #unsetDbpropPrepareAbortBehavior()
	 * @see #getDbpropPrepareAbortBehavior()
	 * @generated
	 */
	void setDbpropPrepareAbortBehavior(DbpropPrepareAbortBehavior value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareAbortBehavior <em>Dbprop Prepare Abort Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropPrepareAbortBehavior()
	 * @see #getDbpropPrepareAbortBehavior()
	 * @see #setDbpropPrepareAbortBehavior(DbpropPrepareAbortBehavior)
	 * @generated
	 */
	void unsetDbpropPrepareAbortBehavior();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareAbortBehavior <em>Dbprop Prepare Abort Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Prepare Abort Behavior</em>' attribute is set.
	 * @see #unsetDbpropPrepareAbortBehavior()
	 * @see #getDbpropPrepareAbortBehavior()
	 * @see #setDbpropPrepareAbortBehavior(DbpropPrepareAbortBehavior)
	 * @generated
	 */
	boolean isSetDbpropPrepareAbortBehavior();

	/**
	 * Returns the value of the '<em><b>Dbprop Prepare Commit Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Prepare Commit Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehavior
	 * @see #isSetDbpropPrepareCommitBehavior()
	 * @see #unsetDbpropPrepareCommitBehavior()
	 * @see #setDbpropPrepareCommitBehavior(DbpropPrepareCommitBehavior)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropPrepareCommitBehavior()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropPrepareCommitBehavior'"
	 * @generated
	 */
	DbpropPrepareCommitBehavior getDbpropPrepareCommitBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareCommitBehavior <em>Dbprop Prepare Commit Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Prepare Commit Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehavior
	 * @see #isSetDbpropPrepareCommitBehavior()
	 * @see #unsetDbpropPrepareCommitBehavior()
	 * @see #getDbpropPrepareCommitBehavior()
	 * @generated
	 */
	void setDbpropPrepareCommitBehavior(DbpropPrepareCommitBehavior value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareCommitBehavior <em>Dbprop Prepare Commit Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropPrepareCommitBehavior()
	 * @see #getDbpropPrepareCommitBehavior()
	 * @see #setDbpropPrepareCommitBehavior(DbpropPrepareCommitBehavior)
	 * @generated
	 */
	void unsetDbpropPrepareCommitBehavior();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropPrepareCommitBehavior <em>Dbprop Prepare Commit Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Prepare Commit Behavior</em>' attribute is set.
	 * @see #unsetDbpropPrepareCommitBehavior()
	 * @see #getDbpropPrepareCommitBehavior()
	 * @see #setDbpropPrepareCommitBehavior(DbpropPrepareCommitBehavior)
	 * @generated
	 */
	boolean isSetDbpropPrepareCommitBehavior();

	/**
	 * Returns the value of the '<em><b>Dbprop Procedure Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Procedure Term</em>' attribute.
	 * @see #setDbpropProcedureTerm(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropProcedureTerm()
	 * @model extendedMetaData="kind='element' name='DbpropProcedureTerm'"
	 * @generated
	 */
	String getDbpropProcedureTerm();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropProcedureTerm <em>Dbprop Procedure Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Procedure Term</em>' attribute.
	 * @see #getDbpropProcedureTerm()
	 * @generated
	 */
	void setDbpropProcedureTerm(String value);

	/**
	 * Returns the value of the '<em><b>Dbprop Quoted Identifier Case</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Quoted Identifier Case</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCase
	 * @see #isSetDbpropQuotedIdentifierCase()
	 * @see #unsetDbpropQuotedIdentifierCase()
	 * @see #setDbpropQuotedIdentifierCase(DbpropQuotedIdentifierCase)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropQuotedIdentifierCase()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropQuotedIdentifierCase'"
	 * @generated
	 */
	DbpropQuotedIdentifierCase getDbpropQuotedIdentifierCase();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropQuotedIdentifierCase <em>Dbprop Quoted Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Quoted Identifier Case</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCase
	 * @see #isSetDbpropQuotedIdentifierCase()
	 * @see #unsetDbpropQuotedIdentifierCase()
	 * @see #getDbpropQuotedIdentifierCase()
	 * @generated
	 */
	void setDbpropQuotedIdentifierCase(DbpropQuotedIdentifierCase value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropQuotedIdentifierCase <em>Dbprop Quoted Identifier Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropQuotedIdentifierCase()
	 * @see #getDbpropQuotedIdentifierCase()
	 * @see #setDbpropQuotedIdentifierCase(DbpropQuotedIdentifierCase)
	 * @generated
	 */
	void unsetDbpropQuotedIdentifierCase();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropQuotedIdentifierCase <em>Dbprop Quoted Identifier Case</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Quoted Identifier Case</em>' attribute is set.
	 * @see #unsetDbpropQuotedIdentifierCase()
	 * @see #getDbpropQuotedIdentifierCase()
	 * @see #setDbpropQuotedIdentifierCase(DbpropQuotedIdentifierCase)
	 * @generated
	 */
	boolean isSetDbpropQuotedIdentifierCase();

	/**
	 * Returns the value of the '<em><b>Dbprop Schema Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Schema Usage</em>' attribute.
	 * @see #setDbpropSchemaUsage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropSchemaUsage()
	 * @model extendedMetaData="kind='element' name='DbpropSchemaUsage'"
	 * @generated
	 */
	BigInteger getDbpropSchemaUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSchemaUsage <em>Dbprop Schema Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Schema Usage</em>' attribute.
	 * @see #getDbpropSchemaUsage()
	 * @generated
	 */
	void setDbpropSchemaUsage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Sql Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Sql Support</em>' attribute.
	 * @see #setDbpropSqlSupport(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropSqlSupport()
	 * @model extendedMetaData="kind='element' name='DbpropSqlSupport'"
	 * @generated
	 */
	BigInteger getDbpropSqlSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSqlSupport <em>Dbprop Sql Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Sql Support</em>' attribute.
	 * @see #getDbpropSqlSupport()
	 * @generated
	 */
	void setDbpropSqlSupport(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Subqueries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Subqueries</em>' attribute.
	 * @see #setDbpropSubqueries(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropSubqueries()
	 * @model extendedMetaData="kind='element' name='DbpropSubqueries'"
	 * @generated
	 */
	BigInteger getDbpropSubqueries();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSubqueries <em>Dbprop Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Subqueries</em>' attribute.
	 * @see #getDbpropSubqueries()
	 * @generated
	 */
	void setDbpropSubqueries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Supported Txn Ddl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Supported Txn Ddl</em>' attribute.
	 * @see #setDbpropSupportedTxnDdl(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropSupportedTxnDdl()
	 * @model extendedMetaData="kind='element' name='DbpropSupportedTxnDdl'"
	 * @generated
	 */
	BigInteger getDbpropSupportedTxnDdl();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnDdl <em>Dbprop Supported Txn Ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Supported Txn Ddl</em>' attribute.
	 * @see #getDbpropSupportedTxnDdl()
	 * @generated
	 */
	void setDbpropSupportedTxnDdl(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Subqueries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Subqueries</em>' attribute.
	 * @see #setMdpropMdxSubqueries(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxSubqueries()
	 * @model extendedMetaData="kind='element' name='MdpropMdxSubqueries'"
	 * @generated
	 */
	BigInteger getMdpropMdxSubqueries();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSubqueries <em>Mdprop Mdx Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Subqueries</em>' attribute.
	 * @see #getMdpropMdxSubqueries()
	 * @generated
	 */
	void setMdpropMdxSubqueries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Supported Txn Iso Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Supported Txn Iso Levels</em>' attribute.
	 * @see #setDbpropSupportedTxnIsoLevels(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropSupportedTxnIsoLevels()
	 * @model extendedMetaData="kind='element' name='DbpropSupportedTxnIsoLevels'"
	 * @generated
	 */
	BigInteger getDbpropSupportedTxnIsoLevels();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoLevels <em>Dbprop Supported Txn Iso Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Supported Txn Iso Levels</em>' attribute.
	 * @see #getDbpropSupportedTxnIsoLevels()
	 * @generated
	 */
	void setDbpropSupportedTxnIsoLevels(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Supported Txn Iso Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Supported Txn Iso Retain</em>' attribute.
	 * @see #setDbpropSupportedTxnIsoRetain(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropSupportedTxnIsoRetain()
	 * @model extendedMetaData="kind='element' name='DbpropSupportedTxnIsoRetain'"
	 * @generated
	 */
	BigInteger getDbpropSupportedTxnIsoRetain();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropSupportedTxnIsoRetain <em>Dbprop Supported Txn Iso Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Supported Txn Iso Retain</em>' attribute.
	 * @see #getDbpropSupportedTxnIsoRetain()
	 * @generated
	 */
	void setDbpropSupportedTxnIsoRetain(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Table Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Table Term</em>' attribute.
	 * @see #setDbpropTableTerm(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropTableTerm()
	 * @model extendedMetaData="kind='element' name='DbpropTableTerm'"
	 * @generated
	 */
	String getDbpropTableTerm();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropTableTerm <em>Dbprop Table Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Table Term</em>' attribute.
	 * @see #getDbpropTableTerm()
	 * @generated
	 */
	void setDbpropTableTerm(String value);

	/**
	 * Returns the value of the '<em><b>Mdprop Aggregate Cell Update</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Aggregate Cell Update</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdate
	 * @see #isSetMdpropAggregateCellUpdate()
	 * @see #unsetMdpropAggregateCellUpdate()
	 * @see #setMdpropAggregateCellUpdate(MdpropAggregateCellUpdate)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropAggregateCellUpdate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdpropAggregateCellUpdate'"
	 * @generated
	 */
	MdpropAggregateCellUpdate getMdpropAggregateCellUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAggregateCellUpdate <em>Mdprop Aggregate Cell Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Aggregate Cell Update</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdate
	 * @see #isSetMdpropAggregateCellUpdate()
	 * @see #unsetMdpropAggregateCellUpdate()
	 * @see #getMdpropAggregateCellUpdate()
	 * @generated
	 */
	void setMdpropAggregateCellUpdate(MdpropAggregateCellUpdate value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAggregateCellUpdate <em>Mdprop Aggregate Cell Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdpropAggregateCellUpdate()
	 * @see #getMdpropAggregateCellUpdate()
	 * @see #setMdpropAggregateCellUpdate(MdpropAggregateCellUpdate)
	 * @generated
	 */
	void unsetMdpropAggregateCellUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAggregateCellUpdate <em>Mdprop Aggregate Cell Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdprop Aggregate Cell Update</em>' attribute is set.
	 * @see #unsetMdpropAggregateCellUpdate()
	 * @see #getMdpropAggregateCellUpdate()
	 * @see #setMdpropAggregateCellUpdate(MdpropAggregateCellUpdate)
	 * @generated
	 */
	boolean isSetMdpropAggregateCellUpdate();

	/**
	 * Returns the value of the '<em><b>Mdprop Axes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Axes</em>' attribute.
	 * @see #setMdpropAxes(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropAxes()
	 * @model extendedMetaData="kind='element' name='MdpropAxes'"
	 * @generated
	 */
	BigInteger getMdpropAxes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropAxes <em>Mdprop Axes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Axes</em>' attribute.
	 * @see #getMdpropAxes()
	 * @generated
	 */
	void setMdpropAxes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Flattening Support</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Flattening Support</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupport
	 * @see #isSetMdpropFlatteningSupport()
	 * @see #unsetMdpropFlatteningSupport()
	 * @see #setMdpropFlatteningSupport(MdpropFlatteningSupport)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropFlatteningSupport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdpropFlatteningSupport'"
	 * @generated
	 */
	MdpropFlatteningSupport getMdpropFlatteningSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropFlatteningSupport <em>Mdprop Flattening Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Flattening Support</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupport
	 * @see #isSetMdpropFlatteningSupport()
	 * @see #unsetMdpropFlatteningSupport()
	 * @see #getMdpropFlatteningSupport()
	 * @generated
	 */
	void setMdpropFlatteningSupport(MdpropFlatteningSupport value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropFlatteningSupport <em>Mdprop Flattening Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdpropFlatteningSupport()
	 * @see #getMdpropFlatteningSupport()
	 * @see #setMdpropFlatteningSupport(MdpropFlatteningSupport)
	 * @generated
	 */
	void unsetMdpropFlatteningSupport();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropFlatteningSupport <em>Mdprop Flattening Support</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdprop Flattening Support</em>' attribute is set.
	 * @see #unsetMdpropFlatteningSupport()
	 * @see #getMdpropFlatteningSupport()
	 * @see #setMdpropFlatteningSupport(MdpropFlatteningSupport)
	 * @generated
	 */
	boolean isSetMdpropFlatteningSupport();

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Case Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Case Support</em>' attribute.
	 * @see #setMdpropMdxCaseSupport(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxCaseSupport()
	 * @model extendedMetaData="kind='element' name='MdpropMdxCaseSupport'"
	 * @generated
	 */
	BigInteger getMdpropMdxCaseSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxCaseSupport <em>Mdprop Mdx Case Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Case Support</em>' attribute.
	 * @see #getMdpropMdxCaseSupport()
	 * @generated
	 */
	void setMdpropMdxCaseSupport(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Desc Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Desc Flags</em>' attribute.
	 * @see #setMdpropMdxDescFlags(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxDescFlags()
	 * @model extendedMetaData="kind='element' name='MdpropMdxDescFlags'"
	 * @generated
	 */
	BigInteger getMdpropMdxDescFlags();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDescFlags <em>Mdprop Mdx Desc Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Desc Flags</em>' attribute.
	 * @see #getMdpropMdxDescFlags()
	 * @generated
	 */
	void setMdpropMdxDescFlags(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Drill Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Drill Functions</em>' attribute.
	 * @see #setMdpropMdxDrillFunctions(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxDrillFunctions()
	 * @model extendedMetaData="kind='element' name='MdpropMdxDrillFunctions'"
	 * @generated
	 */
	BigInteger getMdpropMdxDrillFunctions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDrillFunctions <em>Mdprop Mdx Drill Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Drill Functions</em>' attribute.
	 * @see #getMdpropMdxDrillFunctions()
	 * @generated
	 */
	void setMdpropMdxDrillFunctions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Formulas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Formulas</em>' attribute.
	 * @see #setMdpropMdxFormulas(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxFormulas()
	 * @model extendedMetaData="kind='element' name='MdpropMdxFormulas'"
	 * @generated
	 */
	BigInteger getMdpropMdxFormulas();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxFormulas <em>Mdprop Mdx Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Formulas</em>' attribute.
	 * @see #getMdpropMdxFormulas()
	 * @generated
	 */
	void setMdpropMdxFormulas(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Join Cubes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Join Cubes</em>' attribute.
	 * @see #setMdpropMdxJoinCubes(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxJoinCubes()
	 * @model extendedMetaData="kind='element' name='MdpropMdxJoinCubes'"
	 * @generated
	 */
	BigInteger getMdpropMdxJoinCubes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxJoinCubes <em>Mdprop Mdx Join Cubes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Join Cubes</em>' attribute.
	 * @see #getMdpropMdxJoinCubes()
	 * @generated
	 */
	void setMdpropMdxJoinCubes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Member Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Member Functions</em>' attribute.
	 * @see #setMdpropMdxMemberFunctions(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxMemberFunctions()
	 * @model extendedMetaData="kind='element' name='MdpropMdxMemberFunctions'"
	 * @generated
	 */
	BigInteger getMdpropMdxMemberFunctions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxMemberFunctions <em>Mdprop Mdx Member Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Member Functions</em>' attribute.
	 * @see #getMdpropMdxMemberFunctions()
	 * @generated
	 */
	void setMdpropMdxMemberFunctions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Non Measure Expressions</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Non Measure Expressions</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressions
	 * @see #isSetMdpropMdxNonMeasureExpressions()
	 * @see #unsetMdpropMdxNonMeasureExpressions()
	 * @see #setMdpropMdxNonMeasureExpressions(MdpropMdxNonMeasureExpressions)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxNonMeasureExpressions()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdpropMdxNonMeasureExpressions'"
	 * @generated
	 */
	MdpropMdxNonMeasureExpressions getMdpropMdxNonMeasureExpressions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNonMeasureExpressions <em>Mdprop Mdx Non Measure Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Non Measure Expressions</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressions
	 * @see #isSetMdpropMdxNonMeasureExpressions()
	 * @see #unsetMdpropMdxNonMeasureExpressions()
	 * @see #getMdpropMdxNonMeasureExpressions()
	 * @generated
	 */
	void setMdpropMdxNonMeasureExpressions(MdpropMdxNonMeasureExpressions value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNonMeasureExpressions <em>Mdprop Mdx Non Measure Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdpropMdxNonMeasureExpressions()
	 * @see #getMdpropMdxNonMeasureExpressions()
	 * @see #setMdpropMdxNonMeasureExpressions(MdpropMdxNonMeasureExpressions)
	 * @generated
	 */
	void unsetMdpropMdxNonMeasureExpressions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNonMeasureExpressions <em>Mdprop Mdx Non Measure Expressions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdprop Mdx Non Measure Expressions</em>' attribute is set.
	 * @see #unsetMdpropMdxNonMeasureExpressions()
	 * @see #getMdpropMdxNonMeasureExpressions()
	 * @see #setMdpropMdxNonMeasureExpressions(MdpropMdxNonMeasureExpressions)
	 * @generated
	 */
	boolean isSetMdpropMdxNonMeasureExpressions();

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Numeric Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Numeric Functions</em>' attribute.
	 * @see #setMdpropMdxNumericFunctions(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxNumericFunctions()
	 * @model extendedMetaData="kind='element' name='MdpropMdxNumericFunctions'"
	 * @generated
	 */
	BigInteger getMdpropMdxNumericFunctions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNumericFunctions <em>Mdprop Mdx Numeric Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Numeric Functions</em>' attribute.
	 * @see #getMdpropMdxNumericFunctions()
	 * @generated
	 */
	void setMdpropMdxNumericFunctions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Obj Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Obj Qualification</em>' attribute.
	 * @see #setMdpropMdxObjQualification(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxObjQualification()
	 * @model extendedMetaData="kind='element' name='MdpropMdxObjQualification'"
	 * @generated
	 */
	BigInteger getMdpropMdxObjQualification();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxObjQualification <em>Mdprop Mdx Obj Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Obj Qualification</em>' attribute.
	 * @see #getMdpropMdxObjQualification()
	 * @generated
	 */
	void setMdpropMdxObjQualification(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Outer Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Outer Reference</em>' attribute.
	 * @see #setMdpropMdxOuterReference(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxOuterReference()
	 * @model extendedMetaData="kind='element' name='MdpropMdxOuterReference'"
	 * @generated
	 */
	BigInteger getMdpropMdxOuterReference();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxOuterReference <em>Mdprop Mdx Outer Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Outer Reference</em>' attribute.
	 * @see #getMdpropMdxOuterReference()
	 * @generated
	 */
	void setMdpropMdxOuterReference(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Query By Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Query By Property</em>' attribute.
	 * @see #isSetMdpropMdxQueryByProperty()
	 * @see #unsetMdpropMdxQueryByProperty()
	 * @see #setMdpropMdxQueryByProperty(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxQueryByProperty()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MdpropMdxQueryByProperty'"
	 * @generated
	 */
	boolean isMdpropMdxQueryByProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isMdpropMdxQueryByProperty <em>Mdprop Mdx Query By Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Query By Property</em>' attribute.
	 * @see #isSetMdpropMdxQueryByProperty()
	 * @see #unsetMdpropMdxQueryByProperty()
	 * @see #isMdpropMdxQueryByProperty()
	 * @generated
	 */
	void setMdpropMdxQueryByProperty(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isMdpropMdxQueryByProperty <em>Mdprop Mdx Query By Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdpropMdxQueryByProperty()
	 * @see #isMdpropMdxQueryByProperty()
	 * @see #setMdpropMdxQueryByProperty(boolean)
	 * @generated
	 */
	void unsetMdpropMdxQueryByProperty();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isMdpropMdxQueryByProperty <em>Mdprop Mdx Query By Property</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdprop Mdx Query By Property</em>' attribute is set.
	 * @see #unsetMdpropMdxQueryByProperty()
	 * @see #isMdpropMdxQueryByProperty()
	 * @see #setMdpropMdxQueryByProperty(boolean)
	 * @generated
	 */
	boolean isSetMdpropMdxQueryByProperty();

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Range Rowset</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Range Rowset</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowset
	 * @see #isSetMdpropMdxRangeRowset()
	 * @see #unsetMdpropMdxRangeRowset()
	 * @see #setMdpropMdxRangeRowset(MdpropMdxRangeRowset)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxRangeRowset()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdpropMdxRangeRowset'"
	 * @generated
	 */
	MdpropMdxRangeRowset getMdpropMdxRangeRowset();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxRangeRowset <em>Mdprop Mdx Range Rowset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Range Rowset</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowset
	 * @see #isSetMdpropMdxRangeRowset()
	 * @see #unsetMdpropMdxRangeRowset()
	 * @see #getMdpropMdxRangeRowset()
	 * @generated
	 */
	void setMdpropMdxRangeRowset(MdpropMdxRangeRowset value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxRangeRowset <em>Mdprop Mdx Range Rowset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdpropMdxRangeRowset()
	 * @see #getMdpropMdxRangeRowset()
	 * @see #setMdpropMdxRangeRowset(MdpropMdxRangeRowset)
	 * @generated
	 */
	void unsetMdpropMdxRangeRowset();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxRangeRowset <em>Mdprop Mdx Range Rowset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdprop Mdx Range Rowset</em>' attribute is set.
	 * @see #unsetMdpropMdxRangeRowset()
	 * @see #getMdpropMdxRangeRowset()
	 * @see #setMdpropMdxRangeRowset(MdpropMdxRangeRowset)
	 * @generated
	 */
	boolean isSetMdpropMdxRangeRowset();

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Set Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Set Functions</em>' attribute.
	 * @see #setMdpropMdxSetFunctions(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxSetFunctions()
	 * @model extendedMetaData="kind='element' name='MdpropMdxSetFunctions'"
	 * @generated
	 */
	BigInteger getMdpropMdxSetFunctions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSetFunctions <em>Mdprop Mdx Set Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Set Functions</em>' attribute.
	 * @see #getMdpropMdxSetFunctions()
	 * @generated
	 */
	void setMdpropMdxSetFunctions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Slicer</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Slicer</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicer
	 * @see #isSetMdpropMdxSlicer()
	 * @see #unsetMdpropMdxSlicer()
	 * @see #setMdpropMdxSlicer(MdpropMdxSlicer)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxSlicer()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdpropMdxSlicer'"
	 * @generated
	 */
	MdpropMdxSlicer getMdpropMdxSlicer();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSlicer <em>Mdprop Mdx Slicer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Slicer</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicer
	 * @see #isSetMdpropMdxSlicer()
	 * @see #unsetMdpropMdxSlicer()
	 * @see #getMdpropMdxSlicer()
	 * @generated
	 */
	void setMdpropMdxSlicer(MdpropMdxSlicer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSlicer <em>Mdprop Mdx Slicer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdpropMdxSlicer()
	 * @see #getMdpropMdxSlicer()
	 * @see #setMdpropMdxSlicer(MdpropMdxSlicer)
	 * @generated
	 */
	void unsetMdpropMdxSlicer();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxSlicer <em>Mdprop Mdx Slicer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdprop Mdx Slicer</em>' attribute is set.
	 * @see #unsetMdpropMdxSlicer()
	 * @see #getMdpropMdxSlicer()
	 * @see #setMdpropMdxSlicer(MdpropMdxSlicer)
	 * @generated
	 */
	boolean isSetMdpropMdxSlicer();

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx String Compop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx String Compop</em>' attribute.
	 * @see #setMdpropMdxStringCompop(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxStringCompop()
	 * @model extendedMetaData="kind='element' name='MdpropMdxStringCompop'"
	 * @generated
	 */
	BigInteger getMdpropMdxStringCompop();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxStringCompop <em>Mdprop Mdx String Compop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx String Compop</em>' attribute.
	 * @see #getMdpropMdxStringCompop()
	 * @generated
	 */
	void setMdpropMdxStringCompop(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Named Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Named Levels</em>' attribute.
	 * @see #setMdpropNamedLevels(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropNamedLevels()
	 * @model extendedMetaData="kind='element' name='MdpropNamedLevels'"
	 * @generated
	 */
	BigInteger getMdpropNamedLevels();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropNamedLevels <em>Mdprop Named Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Named Levels</em>' attribute.
	 * @see #getMdpropNamedLevels()
	 * @generated
	 */
	void setMdpropNamedLevels(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd MDX Compatibility</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibility
	 * @see #isSetDbpropMsmdMDXCompatibility()
	 * @see #unsetDbpropMsmdMDXCompatibility()
	 * @see #setDbpropMsmdMDXCompatibility(DbpropMsmdMDXCompatibility)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdMDXCompatibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropMsmdMDXCompatibility'"
	 * @generated
	 */
	DbpropMsmdMDXCompatibility getDbpropMsmdMDXCompatibility();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXCompatibility <em>Dbprop Msmd MDX Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd MDX Compatibility</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibility
	 * @see #isSetDbpropMsmdMDXCompatibility()
	 * @see #unsetDbpropMsmdMDXCompatibility()
	 * @see #getDbpropMsmdMDXCompatibility()
	 * @generated
	 */
	void setDbpropMsmdMDXCompatibility(DbpropMsmdMDXCompatibility value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXCompatibility <em>Dbprop Msmd MDX Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMsmdMDXCompatibility()
	 * @see #getDbpropMsmdMDXCompatibility()
	 * @see #setDbpropMsmdMDXCompatibility(DbpropMsmdMDXCompatibility)
	 * @generated
	 */
	void unsetDbpropMsmdMDXCompatibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXCompatibility <em>Dbprop Msmd MDX Compatibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Msmd MDX Compatibility</em>' attribute is set.
	 * @see #unsetDbpropMsmdMDXCompatibility()
	 * @see #getDbpropMsmdMDXCompatibility()
	 * @see #setDbpropMsmdMDXCompatibility(DbpropMsmdMDXCompatibility)
	 * @generated
	 */
	boolean isSetDbpropMsmdMDXCompatibility();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd SQL Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd SQL Compatibility</em>' attribute.
	 * @see #setDbpropMsmdSQLCompatibility(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdSQLCompatibility()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdSQLCompatibility'"
	 * @generated
	 */
	BigInteger getDbpropMsmdSQLCompatibility();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSQLCompatibility <em>Dbprop Msmd SQL Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd SQL Compatibility</em>' attribute.
	 * @see #getDbpropMsmdSQLCompatibility()
	 * @generated
	 */
	void setDbpropMsmdSQLCompatibility(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd MDX Unique Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd MDX Unique Name Style</em>' attribute.
	 * @see #setDbpropMsmdMDXUniqueNameStyle(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdMDXUniqueNameStyle()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdMDXUniqueNameStyle'"
	 * @generated
	 */
	BigInteger getDbpropMsmdMDXUniqueNameStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdMDXUniqueNameStyle <em>Dbprop Msmd MDX Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd MDX Unique Name Style</em>' attribute.
	 * @see #getDbpropMsmdMDXUniqueNameStyle()
	 * @generated
	 */
	void setDbpropMsmdMDXUniqueNameStyle(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Cache Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Cache Policy</em>' attribute.
	 * @see #setDbpropMsmdCachePolicy(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdCachePolicy()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdCachePolicy'"
	 * @generated
	 */
	BigInteger getDbpropMsmdCachePolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCachePolicy <em>Dbprop Msmd Cache Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Cache Policy</em>' attribute.
	 * @see #getDbpropMsmdCachePolicy()
	 * @generated
	 */
	void setDbpropMsmdCachePolicy(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Cache Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Cache Ratio</em>' attribute.
	 * @see #setDbpropMsmdCacheRatio(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdCacheRatio()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdCacheRatio'"
	 * @generated
	 */
	BigInteger getDbpropMsmdCacheRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio <em>Dbprop Msmd Cache Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Cache Ratio</em>' attribute.
	 * @see #getDbpropMsmdCacheRatio()
	 * @generated
	 */
	void setDbpropMsmdCacheRatio(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Cache Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Cache Mode</em>' attribute.
	 * @see #setDbpropMsmdCacheMode(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdCacheMode()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdCacheMode'"
	 * @generated
	 */
	BigInteger getDbpropMsmdCacheMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheMode <em>Dbprop Msmd Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Cache Mode</em>' attribute.
	 * @see #getDbpropMsmdCacheMode()
	 * @generated
	 */
	void setDbpropMsmdCacheMode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlags}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Compare Case Sensitive String Flags</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlags
	 * @see #isSetDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #unsetDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #setDbpropMsmdCompareCaseSensitiveStringFlags(DbpropMsmdCompareCaseSensitiveStringFlags)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropMsmdCompareCaseSensitiveStringFlags'"
	 * @generated
	 */
	DbpropMsmdCompareCaseSensitiveStringFlags getDbpropMsmdCompareCaseSensitiveStringFlags();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseSensitiveStringFlags <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Compare Case Sensitive String Flags</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlags
	 * @see #isSetDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #unsetDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #getDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @generated
	 */
	void setDbpropMsmdCompareCaseSensitiveStringFlags(DbpropMsmdCompareCaseSensitiveStringFlags value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseSensitiveStringFlags <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #getDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #setDbpropMsmdCompareCaseSensitiveStringFlags(DbpropMsmdCompareCaseSensitiveStringFlags)
	 * @generated
	 */
	void unsetDbpropMsmdCompareCaseSensitiveStringFlags();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseSensitiveStringFlags <em>Dbprop Msmd Compare Case Sensitive String Flags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Msmd Compare Case Sensitive String Flags</em>' attribute is set.
	 * @see #unsetDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #getDbpropMsmdCompareCaseSensitiveStringFlags()
	 * @see #setDbpropMsmdCompareCaseSensitiveStringFlags(DbpropMsmdCompareCaseSensitiveStringFlags)
	 * @generated
	 */
	boolean isSetDbpropMsmdCompareCaseSensitiveStringFlags();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Compare Case Not Sensitive String Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>' attribute.
	 * @see #setDbpropMsmdCompareCaseNotSensitiveStringFlags(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdCompareCaseNotSensitiveStringFlags'"
	 * @generated
	 */
	BigInteger getDbpropMsmdCompareCaseNotSensitiveStringFlags();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCompareCaseNotSensitiveStringFlags <em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Compare Case Not Sensitive String Flags</em>' attribute.
	 * @see #getDbpropMsmdCompareCaseNotSensitiveStringFlags()
	 * @generated
	 */
	void setDbpropMsmdCompareCaseNotSensitiveStringFlags(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Flattened2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Flattened2</em>' attribute.
	 * @see #isSetDbpropMsmdFlattened2()
	 * @see #unsetDbpropMsmdFlattened2()
	 * @see #setDbpropMsmdFlattened2(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdFlattened2()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DbpropMsmdFlattened2'"
	 * @generated
	 */
	boolean isDbpropMsmdFlattened2();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMsmdFlattened2 <em>Dbprop Msmd Flattened2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Flattened2</em>' attribute.
	 * @see #isSetDbpropMsmdFlattened2()
	 * @see #unsetDbpropMsmdFlattened2()
	 * @see #isDbpropMsmdFlattened2()
	 * @generated
	 */
	void setDbpropMsmdFlattened2(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMsmdFlattened2 <em>Dbprop Msmd Flattened2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMsmdFlattened2()
	 * @see #isDbpropMsmdFlattened2()
	 * @see #setDbpropMsmdFlattened2(boolean)
	 * @generated
	 */
	void unsetDbpropMsmdFlattened2();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDbpropMsmdFlattened2 <em>Dbprop Msmd Flattened2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Msmd Flattened2</em>' attribute is set.
	 * @see #unsetDbpropMsmdFlattened2()
	 * @see #isDbpropMsmdFlattened2()
	 * @see #setDbpropMsmdFlattened2(boolean)
	 * @generated
	 */
	boolean isSetDbpropMsmdFlattened2();

	/**
	 * Returns the value of the '<em><b>Dbprop Init Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Init Mode</em>' attribute.
	 * @see #setDbpropInitMode(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropInitMode()
	 * @model extendedMetaData="kind='element' name='DbpropInitMode'"
	 * @generated
	 */
	BigInteger getDbpropInitMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropInitMode <em>Dbprop Init Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Init Mode</em>' attribute.
	 * @see #getDbpropInitMode()
	 * @generated
	 */
	void setDbpropInitMode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ssprop Init App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssprop Init App Name</em>' attribute.
	 * @see #setSspropInitAppName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SspropInitAppName()
	 * @model extendedMetaData="kind='element' name='SspropInitAppName'"
	 * @generated
	 */
	String getSspropInitAppName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitAppName <em>Ssprop Init App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssprop Init App Name</em>' attribute.
	 * @see #getSspropInitAppName()
	 * @generated
	 */
	void setSspropInitAppName(String value);

	/**
	 * Returns the value of the '<em><b>Ssprop Init Wsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssprop Init Wsid</em>' attribute.
	 * @see #setSspropInitWsid(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SspropInitWsid()
	 * @model extendedMetaData="kind='element' name='SspropInitWsid'"
	 * @generated
	 */
	String getSspropInitWsid();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitWsid <em>Ssprop Init Wsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssprop Init Wsid</em>' attribute.
	 * @see #getSspropInitWsid()
	 * @generated
	 */
	void setSspropInitWsid(String value);

	/**
	 * Returns the value of the '<em><b>Ssprop Init Packetsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssprop Init Packetsize</em>' attribute.
	 * @see #setSspropInitPacketsize(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SspropInitPacketsize()
	 * @model extendedMetaData="kind='element' name='SspropInitPacketsize'"
	 * @generated
	 */
	BigInteger getSspropInitPacketsize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSspropInitPacketsize <em>Ssprop Init Packetsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssprop Init Packetsize</em>' attribute.
	 * @see #getSspropInitPacketsize()
	 * @generated
	 */
	void setSspropInitPacketsize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Read Only Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only Session</em>' attribute.
	 * @see #setReadOnlySession(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ReadOnlySession()
	 * @model extendedMetaData="kind='element' name='ReadOnlySession'"
	 * @generated
	 */
	BigInteger getReadOnlySession();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReadOnlySession <em>Read Only Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only Session</em>' attribute.
	 * @see #getReadOnlySession()
	 * @generated
	 */
	void setReadOnlySession(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Secured Cell Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secured Cell Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValue
	 * @see #isSetSecuredCellValue()
	 * @see #unsetSecuredCellValue()
	 * @see #setSecuredCellValue(SecuredCellValue)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SecuredCellValue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecuredCellValue'"
	 * @generated
	 */
	SecuredCellValue getSecuredCellValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSecuredCellValue <em>Secured Cell Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secured Cell Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValue
	 * @see #isSetSecuredCellValue()
	 * @see #unsetSecuredCellValue()
	 * @see #getSecuredCellValue()
	 * @generated
	 */
	void setSecuredCellValue(SecuredCellValue value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSecuredCellValue <em>Secured Cell Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecuredCellValue()
	 * @see #getSecuredCellValue()
	 * @see #setSecuredCellValue(SecuredCellValue)
	 * @generated
	 */
	void unsetSecuredCellValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSecuredCellValue <em>Secured Cell Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Secured Cell Value</em>' attribute is set.
	 * @see #unsetSecuredCellValue()
	 * @see #getSecuredCellValue()
	 * @see #setSecuredCellValue(SecuredCellValue)
	 * @generated
	 */
	boolean isSetSecuredCellValue();

	/**
	 * Returns the value of the '<em><b>Non Empty Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Empty Threshold</em>' attribute.
	 * @see #setNonEmptyThreshold(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_NonEmptyThreshold()
	 * @model extendedMetaData="kind='element' name='NonEmptyThreshold'"
	 * @generated
	 */
	BigInteger getNonEmptyThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getNonEmptyThreshold <em>Non Empty Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Empty Threshold</em>' attribute.
	 * @see #getNonEmptyThreshold()
	 * @generated
	 */
	void setNonEmptyThreshold(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Safety Options</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Options</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptions
	 * @see #isSetSafetyOptions()
	 * @see #unsetSafetyOptions()
	 * @see #setSafetyOptions(SafetyOptions)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SafetyOptions()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SafetyOptions'"
	 * @generated
	 */
	SafetyOptions getSafetyOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSafetyOptions <em>Safety Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Options</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptions
	 * @see #isSetSafetyOptions()
	 * @see #unsetSafetyOptions()
	 * @see #getSafetyOptions()
	 * @generated
	 */
	void setSafetyOptions(SafetyOptions value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSafetyOptions <em>Safety Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSafetyOptions()
	 * @see #getSafetyOptions()
	 * @see #setSafetyOptions(SafetyOptions)
	 * @generated
	 */
	void unsetSafetyOptions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSafetyOptions <em>Safety Options</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Safety Options</em>' attribute is set.
	 * @see #unsetSafetyOptions()
	 * @see #getSafetyOptions()
	 * @see #setSafetyOptions(SafetyOptions)
	 * @generated
	 */
	boolean isSetSafetyOptions();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Cache Ratio2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Cache Ratio2</em>' attribute.
	 * @see #isSetDbpropMsmdCacheRatio2()
	 * @see #unsetDbpropMsmdCacheRatio2()
	 * @see #setDbpropMsmdCacheRatio2(double)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdCacheRatio2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='DbpropMsmdCacheRatio2'"
	 * @generated
	 */
	double getDbpropMsmdCacheRatio2();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio2 <em>Dbprop Msmd Cache Ratio2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Cache Ratio2</em>' attribute.
	 * @see #isSetDbpropMsmdCacheRatio2()
	 * @see #unsetDbpropMsmdCacheRatio2()
	 * @see #getDbpropMsmdCacheRatio2()
	 * @generated
	 */
	void setDbpropMsmdCacheRatio2(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio2 <em>Dbprop Msmd Cache Ratio2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMsmdCacheRatio2()
	 * @see #getDbpropMsmdCacheRatio2()
	 * @see #setDbpropMsmdCacheRatio2(double)
	 * @generated
	 */
	void unsetDbpropMsmdCacheRatio2();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdCacheRatio2 <em>Dbprop Msmd Cache Ratio2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Msmd Cache Ratio2</em>' attribute is set.
	 * @see #unsetDbpropMsmdCacheRatio2()
	 * @see #getDbpropMsmdCacheRatio2()
	 * @see #setDbpropMsmdCacheRatio2(double)
	 * @generated
	 */
	boolean isSetDbpropMsmdCacheRatio2();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Use Formula Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Use Formula Cache</em>' attribute.
	 * @see #setDbpropMsmdUseFormulaCache(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdUseFormulaCache()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdUseFormulaCache'"
	 * @generated
	 */
	String getDbpropMsmdUseFormulaCache();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdUseFormulaCache <em>Dbprop Msmd Use Formula Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Use Formula Cache</em>' attribute.
	 * @see #getDbpropMsmdUseFormulaCache()
	 * @generated
	 */
	void setDbpropMsmdUseFormulaCache(String value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Dynamic Debug Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Dynamic Debug Limit</em>' attribute.
	 * @see #setDbpropMsmdDynamicDebugLimit(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdDynamicDebugLimit()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdDynamicDebugLimit'"
	 * @generated
	 */
	BigInteger getDbpropMsmdDynamicDebugLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDynamicDebugLimit <em>Dbprop Msmd Dynamic Debug Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Dynamic Debug Limit</em>' attribute.
	 * @see #getDbpropMsmdDynamicDebugLimit()
	 * @generated
	 */
	void setDbpropMsmdDynamicDebugLimit(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Debug Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Debug Mode</em>' attribute.
	 * @see #setDbpropMsmdDebugMode(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdDebugMode()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdDebugMode'"
	 * @generated
	 */
	String getDbpropMsmdDebugMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdDebugMode <em>Dbprop Msmd Debug Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Debug Mode</em>' attribute.
	 * @see #getDbpropMsmdDebugMode()
	 * @generated
	 */
	void setDbpropMsmdDebugMode(String value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.Dialect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Dialect
	 * @see #isSetDialect()
	 * @see #unsetDialect()
	 * @see #setDialect(Dialect)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Dialect()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Dialect'"
	 * @generated
	 */
	Dialect getDialect();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Dialect
	 * @see #isSetDialect()
	 * @see #unsetDialect()
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(Dialect value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDialect()
	 * @see #getDialect()
	 * @see #setDialect(Dialect)
	 * @generated
	 */
	void unsetDialect();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDialect <em>Dialect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dialect</em>' attribute is set.
	 * @see #unsetDialect()
	 * @see #getDialect()
	 * @see #setDialect(Dialect)
	 * @generated
	 */
	boolean isSetDialect();

	/**
	 * Returns the value of the '<em><b>Impact Analysis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Analysis</em>' attribute.
	 * @see #isSetImpactAnalysis()
	 * @see #unsetImpactAnalysis()
	 * @see #setImpactAnalysis(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ImpactAnalysis()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ImpactAnalysis'"
	 * @generated
	 */
	boolean isImpactAnalysis();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isImpactAnalysis <em>Impact Analysis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Analysis</em>' attribute.
	 * @see #isSetImpactAnalysis()
	 * @see #unsetImpactAnalysis()
	 * @see #isImpactAnalysis()
	 * @generated
	 */
	void setImpactAnalysis(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isImpactAnalysis <em>Impact Analysis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpactAnalysis()
	 * @see #isImpactAnalysis()
	 * @see #setImpactAnalysis(boolean)
	 * @generated
	 */
	void unsetImpactAnalysis();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isImpactAnalysis <em>Impact Analysis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impact Analysis</em>' attribute is set.
	 * @see #unsetImpactAnalysis()
	 * @see #isImpactAnalysis()
	 * @see #setImpactAnalysis(boolean)
	 * @generated
	 */
	boolean isSetImpactAnalysis();

	/**
	 * Returns the value of the '<em><b>SQL Query Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Query Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryMode
	 * @see #isSetSQLQueryMode()
	 * @see #unsetSQLQueryMode()
	 * @see #setSQLQueryMode(SQLQueryMode)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_SQLQueryMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SQLQueryMode'"
	 * @generated
	 */
	SQLQueryMode getSQLQueryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLQueryMode <em>SQL Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQL Query Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryMode
	 * @see #isSetSQLQueryMode()
	 * @see #unsetSQLQueryMode()
	 * @see #getSQLQueryMode()
	 * @generated
	 */
	void setSQLQueryMode(SQLQueryMode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLQueryMode <em>SQL Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSQLQueryMode()
	 * @see #getSQLQueryMode()
	 * @see #setSQLQueryMode(SQLQueryMode)
	 * @generated
	 */
	void unsetSQLQueryMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getSQLQueryMode <em>SQL Query Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SQL Query Mode</em>' attribute is set.
	 * @see #unsetSQLQueryMode()
	 * @see #getSQLQueryMode()
	 * @see #setSQLQueryMode(SQLQueryMode)
	 * @generated
	 */
	boolean isSetSQLQueryMode();

	/**
	 * Returns the value of the '<em><b>Client Process ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Process ID</em>' attribute.
	 * @see #setClientProcessID(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ClientProcessID()
	 * @model extendedMetaData="kind='element' name='ClientProcessID'"
	 * @generated
	 */
	BigInteger getClientProcessID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getClientProcessID <em>Client Process ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Process ID</em>' attribute.
	 * @see #getClientProcessID()
	 * @generated
	 */
	void setClientProcessID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' attribute.
	 * @see #setCube(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_Cube()
	 * @model extendedMetaData="kind='element' name='Cube'"
	 * @generated
	 */
	String getCube();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCube <em>Cube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' attribute.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(String value);

	/**
	 * Returns the value of the '<em><b>Return Cell Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Cell Properties</em>' attribute.
	 * @see #isSetReturnCellProperties()
	 * @see #unsetReturnCellProperties()
	 * @see #setReturnCellProperties(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ReturnCellProperties()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ReturnCellProperties'"
	 * @generated
	 */
	boolean isReturnCellProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isReturnCellProperties <em>Return Cell Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Cell Properties</em>' attribute.
	 * @see #isSetReturnCellProperties()
	 * @see #unsetReturnCellProperties()
	 * @see #isReturnCellProperties()
	 * @generated
	 */
	void setReturnCellProperties(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isReturnCellProperties <em>Return Cell Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnCellProperties()
	 * @see #isReturnCellProperties()
	 * @see #setReturnCellProperties(boolean)
	 * @generated
	 */
	void unsetReturnCellProperties();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isReturnCellProperties <em>Return Cell Properties</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Cell Properties</em>' attribute is set.
	 * @see #unsetReturnCellProperties()
	 * @see #isReturnCellProperties()
	 * @see #setReturnCellProperties(boolean)
	 * @generated
	 */
	boolean isSetReturnCellProperties();

	/**
	 * Returns the value of the '<em><b>Commit Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Timeout</em>' attribute.
	 * @see #setCommitTimeout(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_CommitTimeout()
	 * @model extendedMetaData="kind='element' name='CommitTimeout'"
	 * @generated
	 */
	BigInteger getCommitTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCommitTimeout <em>Commit Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Timeout</em>' attribute.
	 * @see #getCommitTimeout()
	 * @generated
	 */
	void setCommitTimeout(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Force Commit Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Commit Timeout</em>' attribute.
	 * @see #setForceCommitTimeout(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ForceCommitTimeout()
	 * @model extendedMetaData="kind='element' name='ForceCommitTimeout'"
	 * @generated
	 */
	BigInteger getForceCommitTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getForceCommitTimeout <em>Force Commit Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Commit Timeout</em>' attribute.
	 * @see #getForceCommitTimeout()
	 * @generated
	 */
	void setForceCommitTimeout(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Mode</em>' attribute.
	 * @see #setExecutionMode(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ExecutionMode()
	 * @model extendedMetaData="kind='element' name='ExecutionMode'"
	 * @generated
	 */
	String getExecutionMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getExecutionMode <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Mode</em>' attribute.
	 * @see #getExecutionMode()
	 * @generated
	 */
	void setExecutionMode(String value);

	/**
	 * Returns the value of the '<em><b>Real Time Olap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Time Olap</em>' attribute.
	 * @see #isSetRealTimeOlap()
	 * @see #unsetRealTimeOlap()
	 * @see #setRealTimeOlap(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_RealTimeOlap()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RealTimeOlap'"
	 * @generated
	 */
	boolean isRealTimeOlap();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isRealTimeOlap <em>Real Time Olap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Time Olap</em>' attribute.
	 * @see #isSetRealTimeOlap()
	 * @see #unsetRealTimeOlap()
	 * @see #isRealTimeOlap()
	 * @generated
	 */
	void setRealTimeOlap(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isRealTimeOlap <em>Real Time Olap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRealTimeOlap()
	 * @see #isRealTimeOlap()
	 * @see #setRealTimeOlap(boolean)
	 * @generated
	 */
	void unsetRealTimeOlap();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isRealTimeOlap <em>Real Time Olap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Real Time Olap</em>' attribute is set.
	 * @see #unsetRealTimeOlap()
	 * @see #isRealTimeOlap()
	 * @see #setRealTimeOlap(boolean)
	 * @generated
	 */
	boolean isSetRealTimeOlap();

	/**
	 * Returns the value of the '<em><b>Mdx Missing Member Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdx Missing Member Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberMode
	 * @see #isSetMdxMissingMemberMode()
	 * @see #unsetMdxMissingMemberMode()
	 * @see #setMdxMissingMemberMode(MdxMissingMemberMode)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdxMissingMemberMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdxMissingMemberMode'"
	 * @generated
	 */
	MdxMissingMemberMode getMdxMissingMemberMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdx Missing Member Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberMode
	 * @see #isSetMdxMissingMemberMode()
	 * @see #unsetMdxMissingMemberMode()
	 * @see #getMdxMissingMemberMode()
	 * @generated
	 */
	void setMdxMissingMemberMode(MdxMissingMemberMode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdxMissingMemberMode()
	 * @see #getMdxMissingMemberMode()
	 * @see #setMdxMissingMemberMode(MdxMissingMemberMode)
	 * @generated
	 */
	void unsetMdxMissingMemberMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdx Missing Member Mode</em>' attribute is set.
	 * @see #unsetMdxMissingMemberMode()
	 * @see #getMdxMissingMemberMode()
	 * @see #setMdxMissingMemberMode(MdxMissingMemberMode)
	 * @generated
	 */
	boolean isSetMdxMissingMemberMode();

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Named Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Named Sets</em>' attribute.
	 * @see #setMdpropMdxNamedSets(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxNamedSets()
	 * @model extendedMetaData="kind='element' name='MdpropMdxNamedSets'"
	 * @generated
	 */
	BigInteger getMdpropMdxNamedSets();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxNamedSets <em>Mdprop Mdx Named Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Named Sets</em>' attribute.
	 * @see #getMdpropMdxNamedSets()
	 * @generated
	 */
	void setMdpropMdxNamedSets(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Subqueries</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Subqueries</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueries
	 * @see #isSetDbpropMsmdSubqueries()
	 * @see #unsetDbpropMsmdSubqueries()
	 * @see #setDbpropMsmdSubqueries(DbpropMsmdSubqueries)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdSubqueries()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropMsmdSubqueries'"
	 * @generated
	 */
	DbpropMsmdSubqueries getDbpropMsmdSubqueries();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSubqueries <em>Dbprop Msmd Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Subqueries</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueries
	 * @see #isSetDbpropMsmdSubqueries()
	 * @see #unsetDbpropMsmdSubqueries()
	 * @see #getDbpropMsmdSubqueries()
	 * @generated
	 */
	void setDbpropMsmdSubqueries(DbpropMsmdSubqueries value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSubqueries <em>Dbprop Msmd Subqueries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMsmdSubqueries()
	 * @see #getDbpropMsmdSubqueries()
	 * @see #setDbpropMsmdSubqueries(DbpropMsmdSubqueries)
	 * @generated
	 */
	void unsetDbpropMsmdSubqueries();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdSubqueries <em>Dbprop Msmd Subqueries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Msmd Subqueries</em>' attribute is set.
	 * @see #unsetDbpropMsmdSubqueries()
	 * @see #getDbpropMsmdSubqueries()
	 * @see #setDbpropMsmdSubqueries(DbpropMsmdSubqueries)
	 * @generated
	 */
	boolean isSetDbpropMsmdSubqueries();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Auto Exists</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExists}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Auto Exists</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExists
	 * @see #isSetDbpropMsmdAutoExists()
	 * @see #unsetDbpropMsmdAutoExists()
	 * @see #setDbpropMsmdAutoExists(DbpropMsmdAutoExists)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdAutoExists()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DbpropMsmdAutoExists'"
	 * @generated
	 */
	DbpropMsmdAutoExists getDbpropMsmdAutoExists();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdAutoExists <em>Dbprop Msmd Auto Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Auto Exists</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExists
	 * @see #isSetDbpropMsmdAutoExists()
	 * @see #unsetDbpropMsmdAutoExists()
	 * @see #getDbpropMsmdAutoExists()
	 * @generated
	 */
	void setDbpropMsmdAutoExists(DbpropMsmdAutoExists value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdAutoExists <em>Dbprop Msmd Auto Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbpropMsmdAutoExists()
	 * @see #getDbpropMsmdAutoExists()
	 * @see #setDbpropMsmdAutoExists(DbpropMsmdAutoExists)
	 * @generated
	 */
	void unsetDbpropMsmdAutoExists();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdAutoExists <em>Dbprop Msmd Auto Exists</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbprop Msmd Auto Exists</em>' attribute is set.
	 * @see #unsetDbpropMsmdAutoExists()
	 * @see #getDbpropMsmdAutoExists()
	 * @see #setDbpropMsmdAutoExists(DbpropMsmdAutoExists)
	 * @generated
	 */
	boolean isSetDbpropMsmdAutoExists();

	/**
	 * Returns the value of the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Data</em>' attribute.
	 * @see #setCustomData(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_CustomData()
	 * @model extendedMetaData="kind='element' name='CustomData'"
	 * @generated
	 */
	String getCustomData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getCustomData <em>Custom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Data</em>' attribute.
	 * @see #getCustomData()
	 * @generated
	 */
	void setCustomData(String value);

	/**
	 * Returns the value of the '<em><b>Disable Prefetch Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Prefetch Facts</em>' attribute.
	 * @see #isSetDisablePrefetchFacts()
	 * @see #unsetDisablePrefetchFacts()
	 * @see #setDisablePrefetchFacts(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DisablePrefetchFacts()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DisablePrefetchFacts'"
	 * @generated
	 */
	boolean isDisablePrefetchFacts();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDisablePrefetchFacts <em>Disable Prefetch Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Prefetch Facts</em>' attribute.
	 * @see #isSetDisablePrefetchFacts()
	 * @see #unsetDisablePrefetchFacts()
	 * @see #isDisablePrefetchFacts()
	 * @generated
	 */
	void setDisablePrefetchFacts(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDisablePrefetchFacts <em>Disable Prefetch Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisablePrefetchFacts()
	 * @see #isDisablePrefetchFacts()
	 * @see #setDisablePrefetchFacts(boolean)
	 * @generated
	 */
	void unsetDisablePrefetchFacts();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#isDisablePrefetchFacts <em>Disable Prefetch Facts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disable Prefetch Facts</em>' attribute is set.
	 * @see #unsetDisablePrefetchFacts()
	 * @see #isDisablePrefetchFacts()
	 * @see #setDisablePrefetchFacts(boolean)
	 * @generated
	 */
	boolean isSetDisablePrefetchFacts();

	/**
	 * Returns the value of the '<em><b>Update Isolation Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Isolation Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevel
	 * @see #isSetUpdateIsolationLevel()
	 * @see #unsetUpdateIsolationLevel()
	 * @see #setUpdateIsolationLevel(UpdateIsolationLevel)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_UpdateIsolationLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateIsolationLevel'"
	 * @generated
	 */
	UpdateIsolationLevel getUpdateIsolationLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUpdateIsolationLevel <em>Update Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Isolation Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevel
	 * @see #isSetUpdateIsolationLevel()
	 * @see #unsetUpdateIsolationLevel()
	 * @see #getUpdateIsolationLevel()
	 * @generated
	 */
	void setUpdateIsolationLevel(UpdateIsolationLevel value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUpdateIsolationLevel <em>Update Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateIsolationLevel()
	 * @see #getUpdateIsolationLevel()
	 * @see #setUpdateIsolationLevel(UpdateIsolationLevel)
	 * @generated
	 */
	void unsetUpdateIsolationLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getUpdateIsolationLevel <em>Update Isolation Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Isolation Level</em>' attribute is set.
	 * @see #unsetUpdateIsolationLevel()
	 * @see #getUpdateIsolationLevel()
	 * @see #setUpdateIsolationLevel(UpdateIsolationLevel)
	 * @generated
	 */
	boolean isSetUpdateIsolationLevel();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Error Message Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Error Message Mode</em>' attribute.
	 * @see #setDbpropMsmdErrorMessageMode(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdErrorMessageMode()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdErrorMessageMode'"
	 * @generated
	 */
	BigInteger getDbpropMsmdErrorMessageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdErrorMessageMode <em>Dbprop Msmd Error Message Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Error Message Mode</em>' attribute.
	 * @see #getDbpropMsmdErrorMessageMode()
	 * @generated
	 */
	void setDbpropMsmdErrorMessageMode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mdprop Mdx Ddl Extensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdprop Mdx Ddl Extensions</em>' attribute.
	 * @see #setMdpropMdxDdlExtensions(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MdpropMdxDdlExtensions()
	 * @model extendedMetaData="kind='element' name='MdpropMdxDdlExtensions'"
	 * @generated
	 */
	BigInteger getMdpropMdxDdlExtensions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMdpropMdxDdlExtensions <em>Mdprop Mdx Ddl Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdprop Mdx Ddl Extensions</em>' attribute.
	 * @see #getMdpropMdxDdlExtensions()
	 * @generated
	 */
	void setMdpropMdxDdlExtensions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Response Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncoding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Encoding</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncoding
	 * @see #isSetResponseEncoding()
	 * @see #unsetResponseEncoding()
	 * @see #setResponseEncoding(ResponseEncoding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ResponseEncoding()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseEncoding'"
	 * @generated
	 */
	ResponseEncoding getResponseEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getResponseEncoding <em>Response Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Encoding</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncoding
	 * @see #isSetResponseEncoding()
	 * @see #unsetResponseEncoding()
	 * @see #getResponseEncoding()
	 * @generated
	 */
	void setResponseEncoding(ResponseEncoding value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getResponseEncoding <em>Response Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseEncoding()
	 * @see #getResponseEncoding()
	 * @see #setResponseEncoding(ResponseEncoding)
	 * @generated
	 */
	void unsetResponseEncoding();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getResponseEncoding <em>Response Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Encoding</em>' attribute is set.
	 * @see #unsetResponseEncoding()
	 * @see #getResponseEncoding()
	 * @see #setResponseEncoding(ResponseEncoding)
	 * @generated
	 */
	boolean isSetResponseEncoding();

	/**
	 * Returns the value of the '<em><b>Memory Locking Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Locking Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingMode
	 * @see #isSetMemoryLockingMode()
	 * @see #unsetMemoryLockingMode()
	 * @see #setMemoryLockingMode(MemoryLockingMode)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_MemoryLockingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MemoryLockingMode'"
	 * @generated
	 */
	MemoryLockingMode getMemoryLockingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMemoryLockingMode <em>Memory Locking Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Locking Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingMode
	 * @see #isSetMemoryLockingMode()
	 * @see #unsetMemoryLockingMode()
	 * @see #getMemoryLockingMode()
	 * @generated
	 */
	void setMemoryLockingMode(MemoryLockingMode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMemoryLockingMode <em>Memory Locking Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemoryLockingMode()
	 * @see #getMemoryLockingMode()
	 * @see #setMemoryLockingMode(MemoryLockingMode)
	 * @generated
	 */
	void unsetMemoryLockingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getMemoryLockingMode <em>Memory Locking Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Memory Locking Mode</em>' attribute is set.
	 * @see #unsetMemoryLockingMode()
	 * @see #getMemoryLockingMode()
	 * @see #setMemoryLockingMode(MemoryLockingMode)
	 * @generated
	 */
	boolean isSetMemoryLockingMode();

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Optimize Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Optimize Response</em>' attribute.
	 * @see #setDbpropMsmdOptimizeResponse(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdOptimizeResponse()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdOptimizeResponse'"
	 * @generated
	 */
	BigInteger getDbpropMsmdOptimizeResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdOptimizeResponse <em>Dbprop Msmd Optimize Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Optimize Response</em>' attribute.
	 * @see #getDbpropMsmdOptimizeResponse()
	 * @generated
	 */
	void setDbpropMsmdOptimizeResponse(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Activity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Activity ID</em>' attribute.
	 * @see #setDbpropMsmdActivityID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdActivityID()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdActivityID'"
	 * @generated
	 */
	String getDbpropMsmdActivityID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdActivityID <em>Dbprop Msmd Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Activity ID</em>' attribute.
	 * @see #getDbpropMsmdActivityID()
	 * @generated
	 */
	void setDbpropMsmdActivityID(String value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Request ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Request ID</em>' attribute.
	 * @see #setDbpropMsmdRequestID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdRequestID()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdRequestID'"
	 * @generated
	 */
	String getDbpropMsmdRequestID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestID <em>Dbprop Msmd Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Request ID</em>' attribute.
	 * @see #getDbpropMsmdRequestID()
	 * @generated
	 */
	void setDbpropMsmdRequestID(String value);

	/**
	 * Returns the value of the '<em><b>Return Affected Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Affected Objects</em>' attribute.
	 * @see #setReturnAffectedObjects(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ReturnAffectedObjects()
	 * @model extendedMetaData="kind='element' name='ReturnAffectedObjects'"
	 * @generated
	 */
	BigInteger getReturnAffectedObjects();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getReturnAffectedObjects <em>Return Affected Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Affected Objects</em>' attribute.
	 * @see #getReturnAffectedObjects()
	 * @generated
	 */
	void setReturnAffectedObjects(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dbprop Msmd Request Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbprop Msmd Request Memory Limit</em>' attribute.
	 * @see #setDbpropMsmdRequestMemoryLimit(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_DbpropMsmdRequestMemoryLimit()
	 * @model extendedMetaData="kind='element' name='DbpropMsmdRequestMemoryLimit'"
	 * @generated
	 */
	BigInteger getDbpropMsmdRequestMemoryLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getDbpropMsmdRequestMemoryLimit <em>Dbprop Msmd Request Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbprop Msmd Request Memory Limit</em>' attribute.
	 * @see #getDbpropMsmdRequestMemoryLimit()
	 * @generated
	 */
	void setDbpropMsmdRequestMemoryLimit(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Application Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Context</em>' attribute.
	 * @see #setApplicationContext(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPropertyList_ApplicationContext()
	 * @model extendedMetaData="kind='element' name='ApplicationContext'"
	 * @generated
	 */
	String getApplicationContext();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList#getApplicationContext <em>Application Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Context</em>' attribute.
	 * @see #getApplicationContext()
	 * @generated
	 */
	void setApplicationContext(String value);

} // PropertyList
