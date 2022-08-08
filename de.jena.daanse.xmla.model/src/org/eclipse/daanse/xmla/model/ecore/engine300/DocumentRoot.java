/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getDataEmbeddingStyle <em>Data Embedding Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryHints <em>Query Hints</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryImpersonationInfo <em>Query Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getServerMode <em>Server Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStructureType <em>Structure Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Current String Stores Compatibility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_CurrentStringStoresCompatibilityLevel()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrentStringStoresCompatibilityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentStringStoresCompatibilityLevelType getCurrentStringStoresCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @generated
	 */
	void setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType value);

	/**
	 * Returns the value of the '<em><b>Data Embedding Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Embedding Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @see #setDataEmbeddingStyle(DataEmbeddingStyleType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_DataEmbeddingStyle()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataEmbeddingStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	DataEmbeddingStyleType getDataEmbeddingStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getDataEmbeddingStyle <em>Data Embedding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Embedding Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @see #getDataEmbeddingStyle()
	 * @generated
	 */
	void setDataEmbeddingStyle(DataEmbeddingStyleType value);

	/**
	 * Returns the value of the '<em><b>Processing State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @see #setProcessingState(ProcessingStateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_ProcessingState()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessingState' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessingStateType getProcessingState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @see #getProcessingState()
	 * @generated
	 */
	void setProcessingState(ProcessingStateType value);

	/**
	 * Returns the value of the '<em><b>Query Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Hints</em>' attribute.
	 * @see #setQueryHints(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_QueryHints()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryHints' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQueryHints();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryHints <em>Query Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Hints</em>' attribute.
	 * @see #getQueryHints()
	 * @generated
	 */
	void setQueryHints(String value);

	/**
	 * Returns the value of the '<em><b>Query Impersonation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Impersonation Info</em>' containment reference.
	 * @see #setQueryImpersonationInfo(ImpersonationInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_QueryImpersonationInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryImpersonationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpersonationInfo getQueryImpersonationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getQueryImpersonationInfo <em>Query Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Impersonation Info</em>' containment reference.
	 * @see #getQueryImpersonationInfo()
	 * @generated
	 */
	void setQueryImpersonationInfo(ImpersonationInfo value);

	/**
	 * Returns the value of the '<em><b>Server Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @see #setServerMode(ServerModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_ServerMode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServerMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerModeType getServerMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getServerMode <em>Server Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @see #getServerMode()
	 * @generated
	 */
	void setServerMode(ServerModeType value);

	/**
	 * Returns the value of the '<em><b>String Stores Compatibility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_StringStoresCompatibilityLevel()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StringStoresCompatibilityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	StringStoresCompatibilityLevelType getStringStoresCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see #getStringStoresCompatibilityLevel()
	 * @generated
	 */
	void setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType value);

	/**
	 * Returns the value of the '<em><b>Structure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @see #setStructureType(StructureTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDocumentRoot_StructureType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureType' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureTypeType getStructureType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureTypeType value);

} // DocumentRoot
