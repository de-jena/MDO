/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCacheMode <em>Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxPercent <em>Holdout Max Percent</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxCases <em>Holdout Max Cases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutSeed <em>Holdout Seed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutActualSize <em>Holdout Actual Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getMiningStructurePermissions <em>Mining Structure Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getMiningModels <em>Mining Models</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure()
 * @model extendedMetaData="name='MiningStructure' kind='elementOnly'"
 * @generated
 */
public interface MiningStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getDescription <em>Description</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Binding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Binding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Binding value);

	/**
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Language'"
	 * @generated
	 */
	BigInteger getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

	/**
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Cache Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.CacheModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CacheModeType
	 * @see #isSetCacheMode()
	 * @see #unsetCacheMode()
	 * @see #setCacheMode(CacheModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_CacheMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CacheMode'"
	 * @generated
	 */
	CacheModeType getCacheMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCacheMode <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CacheModeType
	 * @see #isSetCacheMode()
	 * @see #unsetCacheMode()
	 * @see #getCacheMode()
	 * @generated
	 */
	void setCacheMode(CacheModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCacheMode <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheMode()
	 * @see #getCacheMode()
	 * @see #setCacheMode(CacheModeType)
	 * @generated
	 */
	void unsetCacheMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getCacheMode <em>Cache Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Mode</em>' attribute is set.
	 * @see #unsetCacheMode()
	 * @see #getCacheMode()
	 * @see #setCacheMode(CacheModeType)
	 * @generated
	 */
	boolean isSetCacheMode();

	/**
	 * Returns the value of the '<em><b>Holdout Max Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Max Percent</em>' attribute.
	 * @see #isSetHoldoutMaxPercent()
	 * @see #unsetHoldoutMaxPercent()
	 * @see #setHoldoutMaxPercent(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_HoldoutMaxPercent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='HoldoutMaxPercent' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	int getHoldoutMaxPercent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxPercent <em>Holdout Max Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Max Percent</em>' attribute.
	 * @see #isSetHoldoutMaxPercent()
	 * @see #unsetHoldoutMaxPercent()
	 * @see #getHoldoutMaxPercent()
	 * @generated
	 */
	void setHoldoutMaxPercent(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxPercent <em>Holdout Max Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoldoutMaxPercent()
	 * @see #getHoldoutMaxPercent()
	 * @see #setHoldoutMaxPercent(int)
	 * @generated
	 */
	void unsetHoldoutMaxPercent();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxPercent <em>Holdout Max Percent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Holdout Max Percent</em>' attribute is set.
	 * @see #unsetHoldoutMaxPercent()
	 * @see #getHoldoutMaxPercent()
	 * @see #setHoldoutMaxPercent(int)
	 * @generated
	 */
	boolean isSetHoldoutMaxPercent();

	/**
	 * Returns the value of the '<em><b>Holdout Max Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Max Cases</em>' attribute.
	 * @see #isSetHoldoutMaxCases()
	 * @see #unsetHoldoutMaxCases()
	 * @see #setHoldoutMaxCases(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_HoldoutMaxCases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='HoldoutMaxCases' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	int getHoldoutMaxCases();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxCases <em>Holdout Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Max Cases</em>' attribute.
	 * @see #isSetHoldoutMaxCases()
	 * @see #unsetHoldoutMaxCases()
	 * @see #getHoldoutMaxCases()
	 * @generated
	 */
	void setHoldoutMaxCases(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxCases <em>Holdout Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoldoutMaxCases()
	 * @see #getHoldoutMaxCases()
	 * @see #setHoldoutMaxCases(int)
	 * @generated
	 */
	void unsetHoldoutMaxCases();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutMaxCases <em>Holdout Max Cases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Holdout Max Cases</em>' attribute is set.
	 * @see #unsetHoldoutMaxCases()
	 * @see #getHoldoutMaxCases()
	 * @see #setHoldoutMaxCases(int)
	 * @generated
	 */
	boolean isSetHoldoutMaxCases();

	/**
	 * Returns the value of the '<em><b>Holdout Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Seed</em>' attribute.
	 * @see #isSetHoldoutSeed()
	 * @see #unsetHoldoutSeed()
	 * @see #setHoldoutSeed(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_HoldoutSeed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='HoldoutSeed' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	int getHoldoutSeed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutSeed <em>Holdout Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Seed</em>' attribute.
	 * @see #isSetHoldoutSeed()
	 * @see #unsetHoldoutSeed()
	 * @see #getHoldoutSeed()
	 * @generated
	 */
	void setHoldoutSeed(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutSeed <em>Holdout Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoldoutSeed()
	 * @see #getHoldoutSeed()
	 * @see #setHoldoutSeed(int)
	 * @generated
	 */
	void unsetHoldoutSeed();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutSeed <em>Holdout Seed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Holdout Seed</em>' attribute is set.
	 * @see #unsetHoldoutSeed()
	 * @see #getHoldoutSeed()
	 * @see #setHoldoutSeed(int)
	 * @generated
	 */
	boolean isSetHoldoutSeed();

	/**
	 * Returns the value of the '<em><b>Holdout Actual Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holdout Actual Size</em>' attribute.
	 * @see #isSetHoldoutActualSize()
	 * @see #unsetHoldoutActualSize()
	 * @see #setHoldoutActualSize(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_HoldoutActualSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='HoldoutActualSize' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	int getHoldoutActualSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutActualSize <em>Holdout Actual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holdout Actual Size</em>' attribute.
	 * @see #isSetHoldoutActualSize()
	 * @see #unsetHoldoutActualSize()
	 * @see #getHoldoutActualSize()
	 * @generated
	 */
	void setHoldoutActualSize(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutActualSize <em>Holdout Actual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoldoutActualSize()
	 * @see #getHoldoutActualSize()
	 * @see #setHoldoutActualSize(int)
	 * @generated
	 */
	void unsetHoldoutActualSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getHoldoutActualSize <em>Holdout Actual Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Holdout Actual Size</em>' attribute is set.
	 * @see #unsetHoldoutActualSize()
	 * @see #getHoldoutActualSize()
	 * @see #setHoldoutActualSize(int)
	 * @generated
	 */
	boolean isSetHoldoutActualSize();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(ColumnsType4)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_Columns()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Columns'"
	 * @generated
	 */
	ColumnsType4 getColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(ColumnsType4 value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType5
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType5)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType5 getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType5
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType5 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType5)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType5)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Mining Structure Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structure Permissions</em>' containment reference.
	 * @see #setMiningStructurePermissions(MiningStructurePermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_MiningStructurePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningStructurePermissions'"
	 * @generated
	 */
	MiningStructurePermissionsType getMiningStructurePermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getMiningStructurePermissions <em>Mining Structure Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Structure Permissions</em>' containment reference.
	 * @see #getMiningStructurePermissions()
	 * @generated
	 */
	void setMiningStructurePermissions(MiningStructurePermissionsType value);

	/**
	 * Returns the value of the '<em><b>Mining Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Models</em>' containment reference.
	 * @see #setMiningModels(MiningModelsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructure_MiningModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningModels'"
	 * @generated
	 */
	MiningModelsType getMiningModels();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure#getMiningModels <em>Mining Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Models</em>' containment reference.
	 * @see #getMiningModels()
	 * @generated
	 */
	void setMiningModels(MiningModelsType value);

} // MiningStructure
