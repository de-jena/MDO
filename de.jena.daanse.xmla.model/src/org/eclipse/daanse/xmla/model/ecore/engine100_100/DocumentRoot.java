/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine100_100;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutActualSize <em>Holdout Actual Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutMaxCases <em>Holdout Max Cases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutMaxPercent <em>Holdout Max Percent</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutSeed <em>Holdout Seed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Storage Location</em>' attribute.
	 * @see #setDbStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_DbStorageLocation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DbStorageLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDbStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getDbStorageLocation <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Storage Location</em>' attribute.
	 * @see #getDbStorageLocation()
	 * @generated
	 */
	void setDbStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Holdout Actual Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Actual Size</em>' attribute.
	 * @see #setHoldoutActualSize(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_HoldoutActualSize()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HoldoutActualSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getHoldoutActualSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutActualSize <em>Holdout Actual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Actual Size</em>' attribute.
	 * @see #getHoldoutActualSize()
	 * @generated
	 */
	void setHoldoutActualSize(int value);

	/**
	 * Returns the value of the '<em><b>Holdout Max Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Max Cases</em>' attribute.
	 * @see #setHoldoutMaxCases(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_HoldoutMaxCases()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HoldoutMaxCases' namespace='##targetNamespace'"
	 * @generated
	 */
	int getHoldoutMaxCases();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutMaxCases <em>Holdout Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Max Cases</em>' attribute.
	 * @see #getHoldoutMaxCases()
	 * @generated
	 */
	void setHoldoutMaxCases(int value);

	/**
	 * Returns the value of the '<em><b>Holdout Max Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Max Percent</em>' attribute.
	 * @see #setHoldoutMaxPercent(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_HoldoutMaxPercent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HoldoutMaxPercent' namespace='##targetNamespace'"
	 * @generated
	 */
	int getHoldoutMaxPercent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutMaxPercent <em>Holdout Max Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Max Percent</em>' attribute.
	 * @see #getHoldoutMaxPercent()
	 * @generated
	 */
	void setHoldoutMaxPercent(int value);

	/**
	 * Returns the value of the '<em><b>Holdout Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Seed</em>' attribute.
	 * @see #setHoldoutSeed(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package#getDocumentRoot_HoldoutSeed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HoldoutSeed' namespace='##targetNamespace'"
	 * @generated
	 */
	int getHoldoutSeed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot#getHoldoutSeed <em>Holdout Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Seed</em>' attribute.
	 * @see #getHoldoutSeed()
	 * @generated
	 */
	void setHoldoutSeed(int value);

} // DocumentRoot
