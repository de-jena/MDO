/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getManagedProvider <em>Managed Provider</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getConnectionStringSecurity <em>Connection String Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getImpersonationInfo <em>Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getMaxActiveConnections <em>Max Active Connections</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getDataSourcePermissions <em>Data Source Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getQueryImpersonationInfo <em>Query Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getQueryHints <em>Query Hints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource()
 * @model abstract="true"
 *        extendedMetaData="name='DataSource' kind='elementOnly'"
 * @generated
 */
public interface DataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Created Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Timestamp</em>' attribute.
	 * @see #setCreatedTimestamp(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Timestamp</em>' attribute.
	 * @see #getCreatedTimestamp()
	 * @generated
	 */
	void setCreatedTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Schema Update</em>' attribute.
	 * @see #setLastSchemaUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Schema Update</em>' attribute.
	 * @see #getLastSchemaUpdate()
	 * @generated
	 */
	void setLastSchemaUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Managed Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Provider</em>' attribute.
	 * @see #setManagedProvider(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_ManagedProvider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ManagedProvider'"
	 * @generated
	 */
	String getManagedProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getManagedProvider <em>Managed Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Provider</em>' attribute.
	 * @see #getManagedProvider()
	 * @generated
	 */
	void setManagedProvider(String value);

	/**
	 * Returns the value of the '<em><b>Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection String</em>' attribute.
	 * @see #setConnectionString(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_ConnectionString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ConnectionString'"
	 * @generated
	 */
	String getConnectionString();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getConnectionString <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection String</em>' attribute.
	 * @see #getConnectionString()
	 * @generated
	 */
	void setConnectionString(String value);

	/**
	 * Returns the value of the '<em><b>Connection String Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ConnectionStringSecurityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection String Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ConnectionStringSecurityType
	 * @see #isSetConnectionStringSecurity()
	 * @see #unsetConnectionStringSecurity()
	 * @see #setConnectionStringSecurity(ConnectionStringSecurityType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_ConnectionStringSecurity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConnectionStringSecurity'"
	 * @generated
	 */
	ConnectionStringSecurityType getConnectionStringSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getConnectionStringSecurity <em>Connection String Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection String Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ConnectionStringSecurityType
	 * @see #isSetConnectionStringSecurity()
	 * @see #unsetConnectionStringSecurity()
	 * @see #getConnectionStringSecurity()
	 * @generated
	 */
	void setConnectionStringSecurity(ConnectionStringSecurityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getConnectionStringSecurity <em>Connection String Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionStringSecurity()
	 * @see #getConnectionStringSecurity()
	 * @see #setConnectionStringSecurity(ConnectionStringSecurityType)
	 * @generated
	 */
	void unsetConnectionStringSecurity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getConnectionStringSecurity <em>Connection String Security</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection String Security</em>' attribute is set.
	 * @see #unsetConnectionStringSecurity()
	 * @see #getConnectionStringSecurity()
	 * @see #setConnectionStringSecurity(ConnectionStringSecurityType)
	 * @generated
	 */
	boolean isSetConnectionStringSecurity();

	/**
	 * Returns the value of the '<em><b>Impersonation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impersonation Info</em>' containment reference.
	 * @see #setImpersonationInfo(ImpersonationInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_ImpersonationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImpersonationInfo'"
	 * @generated
	 */
	ImpersonationInfo getImpersonationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getImpersonationInfo <em>Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impersonation Info</em>' containment reference.
	 * @see #getImpersonationInfo()
	 * @generated
	 */
	void setImpersonationInfo(ImpersonationInfo value);

	/**
	 * Returns the value of the '<em><b>Isolation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.IsolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.IsolationType
	 * @see #isSetIsolation()
	 * @see #unsetIsolation()
	 * @see #setIsolation(IsolationType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_Isolation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Isolation'"
	 * @generated
	 */
	IsolationType getIsolation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getIsolation <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.IsolationType
	 * @see #isSetIsolation()
	 * @see #unsetIsolation()
	 * @see #getIsolation()
	 * @generated
	 */
	void setIsolation(IsolationType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getIsolation <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsolation()
	 * @see #getIsolation()
	 * @see #setIsolation(IsolationType)
	 * @generated
	 */
	void unsetIsolation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getIsolation <em>Isolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isolation</em>' attribute is set.
	 * @see #unsetIsolation()
	 * @see #getIsolation()
	 * @see #setIsolation(IsolationType)
	 * @generated
	 */
	boolean isSetIsolation();

	/**
	 * Returns the value of the '<em><b>Max Active Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Active Connections</em>' attribute.
	 * @see #setMaxActiveConnections(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_MaxActiveConnections()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaxActiveConnections'"
	 * @generated
	 */
	BigInteger getMaxActiveConnections();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getMaxActiveConnections <em>Max Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Active Connections</em>' attribute.
	 * @see #getMaxActiveConnections()
	 * @generated
	 */
	void setMaxActiveConnections(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Timeout'"
	 * @generated
	 */
	Duration getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(Duration value);

	/**
	 * Returns the value of the '<em><b>Data Source Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Permissions</em>' containment reference.
	 * @see #setDataSourcePermissions(DataSourcePermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_DataSourcePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourcePermissions'"
	 * @generated
	 */
	DataSourcePermissionsType getDataSourcePermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getDataSourcePermissions <em>Data Source Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Permissions</em>' containment reference.
	 * @see #getDataSourcePermissions()
	 * @generated
	 */
	void setDataSourcePermissions(DataSourcePermissionsType value);

	/**
	 * Returns the value of the '<em><b>Query Impersonation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Impersonation Info</em>' containment reference.
	 * @see #setQueryImpersonationInfo(ImpersonationInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_QueryImpersonationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryImpersonationInfo' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	ImpersonationInfo getQueryImpersonationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getQueryImpersonationInfo <em>Query Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Impersonation Info</em>' containment reference.
	 * @see #getQueryImpersonationInfo()
	 * @generated
	 */
	void setQueryImpersonationInfo(ImpersonationInfo value);

	/**
	 * Returns the value of the '<em><b>Query Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Hints</em>' attribute.
	 * @see #setQueryHints(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSource_QueryHints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='QueryHints' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	String getQueryHints();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource#getQueryHints <em>Query Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Hints</em>' attribute.
	 * @see #getQueryHints()
	 * @generated
	 */
	void setQueryHints(String value);

} // DataSource
