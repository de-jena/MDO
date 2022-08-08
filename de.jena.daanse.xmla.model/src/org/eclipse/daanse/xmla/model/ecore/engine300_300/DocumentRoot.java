/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getAllowedRowsExpression <em>Allowed Rows Expression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryMode <em>Direct Query Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryUsage <em>Direct Query Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXEvent <em>XEvent</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Allowed Rows Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Rows Expression</em>' attribute.
	 * @see #setAllowedRowsExpression(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_AllowedRowsExpression()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AllowedRowsExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAllowedRowsExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getAllowedRowsExpression <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Rows Expression</em>' attribute.
	 * @see #getAllowedRowsExpression()
	 * @generated
	 */
	void setAllowedRowsExpression(String value);

	/**
	 * Returns the value of the '<em><b>Direct Query Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Query Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @see #setDirectQueryMode(DirectQueryModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_DirectQueryMode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectQueryMode' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectQueryModeType getDirectQueryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryMode <em>Direct Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Query Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @see #getDirectQueryMode()
	 * @generated
	 */
	void setDirectQueryMode(DirectQueryModeType value);

	/**
	 * Returns the value of the '<em><b>Direct Query Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Query Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @see #setDirectQueryUsage(DirectQueryUsageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_DirectQueryUsage()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectQueryUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectQueryUsageType getDirectQueryUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryUsage <em>Direct Query Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Query Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @see #getDirectQueryUsage()
	 * @generated
	 */
	void setDirectQueryUsage(DirectQueryUsageType value);

	/**
	 * Returns the value of the '<em><b>XEvent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XEvent</em>' containment reference.
	 * @see #setXEvent(XEventType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDocumentRoot_XEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	XEventType getXEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXEvent <em>XEvent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XEvent</em>' containment reference.
	 * @see #getXEvent()
	 * @generated
	 */
	void setXEvent(XEventType value);

} // DocumentRoot
