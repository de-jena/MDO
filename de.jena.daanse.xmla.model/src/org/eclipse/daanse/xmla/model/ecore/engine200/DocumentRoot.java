/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200;

import java.math.BigInteger;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCalculationError <em>Calculation Error</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCompatibilityLevel <em>Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningColumn <em>Warning Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningMeasure <em>Warning Measure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Calculation Error</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Error</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @see #setCalculationError(CalculationErrorType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_CalculationError()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CalculationError' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculationErrorType getCalculationError();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCalculationError <em>Calculation Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Error</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @see #getCalculationError()
	 * @generated
	 */
	void setCalculationError(CalculationErrorType value);

	/**
	 * Returns the value of the '<em><b>Compatibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibility Level</em>' attribute.
	 * @see #setCompatibilityLevel(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_CompatibilityLevel()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompatibilityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getCompatibilityLevel <em>Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatibility Level</em>' attribute.
	 * @see #getCompatibilityLevel()
	 * @generated
	 */
	void setCompatibilityLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Warning Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Column</em>' containment reference.
	 * @see #setWarningColumn(WarningColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_WarningColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WarningColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	WarningColumnType getWarningColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningColumn <em>Warning Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Column</em>' containment reference.
	 * @see #getWarningColumn()
	 * @generated
	 */
	void setWarningColumn(WarningColumnType value);

	/**
	 * Returns the value of the '<em><b>Warning Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Measure</em>' containment reference.
	 * @see #setWarningMeasure(WarningMeasureType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package#getDocumentRoot_WarningMeasure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WarningMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	WarningMeasureType getWarningMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot#getWarningMeasure <em>Warning Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Measure</em>' containment reference.
	 * @see #getWarningMeasure()
	 * @generated
	 */
	void setWarningMeasure(WarningMeasureType value);

} // DocumentRoot
