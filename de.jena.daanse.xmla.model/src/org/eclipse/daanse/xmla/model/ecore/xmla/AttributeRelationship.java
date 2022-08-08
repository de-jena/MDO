/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOptionality <em>Optionality</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOverrideBehavior <em>Override Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship()
 * @model extendedMetaData="name='AttributeRelationship' kind='elementOnly'"
 * @generated
 */
public interface AttributeRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.RelationshipTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RelationshipTypeType
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(RelationshipTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_RelationshipType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RelationshipType'"
	 * @generated
	 */
	RelationshipTypeType getRelationshipType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RelationshipTypeType
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(RelationshipTypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(RelationshipTypeType)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(RelationshipTypeType)
	 * @generated
	 */
	boolean isSetRelationshipType();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType1
	 * @see #isSetCardinality()
	 * @see #unsetCardinality()
	 * @see #setCardinality(CardinalityType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_Cardinality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Cardinality'"
	 * @generated
	 */
	CardinalityType1 getCardinality();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType1
	 * @see #isSetCardinality()
	 * @see #unsetCardinality()
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCardinality()
	 * @see #getCardinality()
	 * @see #setCardinality(CardinalityType1)
	 * @generated
	 */
	void unsetCardinality();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getCardinality <em>Cardinality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cardinality</em>' attribute is set.
	 * @see #unsetCardinality()
	 * @see #getCardinality()
	 * @see #setCardinality(CardinalityType1)
	 * @generated
	 */
	boolean isSetCardinality();

	/**
	 * Returns the value of the '<em><b>Optionality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.OptionalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionality</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OptionalityType
	 * @see #isSetOptionality()
	 * @see #unsetOptionality()
	 * @see #setOptionality(OptionalityType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_Optionality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Optionality'"
	 * @generated
	 */
	OptionalityType getOptionality();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOptionality <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionality</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OptionalityType
	 * @see #isSetOptionality()
	 * @see #unsetOptionality()
	 * @see #getOptionality()
	 * @generated
	 */
	void setOptionality(OptionalityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOptionality <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptionality()
	 * @see #getOptionality()
	 * @see #setOptionality(OptionalityType)
	 * @generated
	 */
	void unsetOptionality();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOptionality <em>Optionality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optionality</em>' attribute is set.
	 * @see #unsetOptionality()
	 * @see #getOptionality()
	 * @see #setOptionality(OptionalityType)
	 * @generated
	 */
	boolean isSetOptionality();

	/**
	 * Returns the value of the '<em><b>Override Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.OverrideBehaviorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OverrideBehaviorType
	 * @see #isSetOverrideBehavior()
	 * @see #unsetOverrideBehavior()
	 * @see #setOverrideBehavior(OverrideBehaviorType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_OverrideBehavior()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OverrideBehavior'"
	 * @generated
	 */
	OverrideBehaviorType getOverrideBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOverrideBehavior <em>Override Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OverrideBehaviorType
	 * @see #isSetOverrideBehavior()
	 * @see #unsetOverrideBehavior()
	 * @see #getOverrideBehavior()
	 * @generated
	 */
	void setOverrideBehavior(OverrideBehaviorType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOverrideBehavior <em>Override Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverrideBehavior()
	 * @see #getOverrideBehavior()
	 * @see #setOverrideBehavior(OverrideBehaviorType)
	 * @generated
	 */
	void unsetOverrideBehavior();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getOverrideBehavior <em>Override Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Override Behavior</em>' attribute is set.
	 * @see #unsetOverrideBehavior()
	 * @see #getOverrideBehavior()
	 * @see #setOverrideBehavior(OverrideBehaviorType)
	 * @generated
	 */
	boolean isSetOverrideBehavior();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType15)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType15 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType15 value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType16)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationship_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType16 getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType16 value);

} // AttributeRelationship
