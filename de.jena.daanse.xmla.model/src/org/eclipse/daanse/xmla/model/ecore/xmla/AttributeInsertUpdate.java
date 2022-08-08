/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Insert Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getCUSTOMROLLUP <em>CUSTOMROLLUP</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getCUSTOMROLLUPPROPERTIES <em>CUSTOMROLLUPPROPERTIES</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getUNARYOPERATOR <em>UNARYOPERATOR</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getSKIPPEDLEVELS <em>SKIPPEDLEVELS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate()
 * @model extendedMetaData="name='Attribute_InsertUpdate' kind='elementOnly'"
 * @generated
 */
public interface AttributeInsertUpdate extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_AttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeName'"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference.
	 * @see #setKeys(KeysType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_Keys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Keys'"
	 * @generated
	 */
	KeysType1 getKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getKeys <em>Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys</em>' containment reference.
	 * @see #getKeys()
	 * @generated
	 */
	void setKeys(KeysType1 value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType9)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType9 getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType9 value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>CUSTOMROLLUP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CUSTOMROLLUP</em>' attribute.
	 * @see #setCUSTOMROLLUP(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_CUSTOMROLLUP()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CUSTOM_ROLLUP'"
	 * @generated
	 */
	String getCUSTOMROLLUP();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getCUSTOMROLLUP <em>CUSTOMROLLUP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CUSTOMROLLUP</em>' attribute.
	 * @see #getCUSTOMROLLUP()
	 * @generated
	 */
	void setCUSTOMROLLUP(String value);

	/**
	 * Returns the value of the '<em><b>CUSTOMROLLUPPROPERTIES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CUSTOMROLLUPPROPERTIES</em>' attribute.
	 * @see #setCUSTOMROLLUPPROPERTIES(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_CUSTOMROLLUPPROPERTIES()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CUSTOM_ROLLUP_PROPERTIES'"
	 * @generated
	 */
	String getCUSTOMROLLUPPROPERTIES();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getCUSTOMROLLUPPROPERTIES <em>CUSTOMROLLUPPROPERTIES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CUSTOMROLLUPPROPERTIES</em>' attribute.
	 * @see #getCUSTOMROLLUPPROPERTIES()
	 * @generated
	 */
	void setCUSTOMROLLUPPROPERTIES(String value);

	/**
	 * Returns the value of the '<em><b>UNARYOPERATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UNARYOPERATOR</em>' attribute.
	 * @see #setUNARYOPERATOR(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_UNARYOPERATOR()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='UNARY_OPERATOR'"
	 * @generated
	 */
	String getUNARYOPERATOR();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getUNARYOPERATOR <em>UNARYOPERATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UNARYOPERATOR</em>' attribute.
	 * @see #getUNARYOPERATOR()
	 * @generated
	 */
	void setUNARYOPERATOR(String value);

	/**
	 * Returns the value of the '<em><b>SKIPPEDLEVELS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SKIPPEDLEVELS</em>' attribute.
	 * @see #setSKIPPEDLEVELS(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeInsertUpdate_SKIPPEDLEVELS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SKIPPED_LEVELS'"
	 * @generated
	 */
	BigInteger getSKIPPEDLEVELS();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate#getSKIPPEDLEVELS <em>SKIPPEDLEVELS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKIPPEDLEVELS</em>' attribute.
	 * @see #getSKIPPEDLEVELS()
	 * @generated
	 */
	void setSKIPPEDLEVELS(BigInteger value);

} // AttributeInsertUpdate
