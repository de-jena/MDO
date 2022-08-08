/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package
 * @generated
 */
public interface Engine300_300Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine300_300Factory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotations Type</em>'.
	 * @generated
	 */
	AnnotationsType createAnnotationsType();

	/**
	 * Returns a new object of class '<em>Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes Type</em>'.
	 * @generated
	 */
	AttributesType createAttributesType();

	/**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
	AttributeType createAttributeType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Relationship End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship End</em>'.
	 * @generated
	 */
	RelationshipEnd createRelationshipEnd();

	/**
	 * Returns a new object of class '<em>Relationship End Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship End Translation</em>'.
	 * @generated
	 */
	RelationshipEndTranslation createRelationshipEndTranslation();

	/**
	 * Returns a new object of class '<em>Relationships</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationships</em>'.
	 * @generated
	 */
	Relationships createRelationships();

	/**
	 * Returns a new object of class '<em>Translations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translations Type</em>'.
	 * @generated
	 */
	TranslationsType createTranslationsType();

	/**
	 * Returns a new object of class '<em>XEvent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XEvent Type</em>'.
	 * @generated
	 */
	XEventType createXEventType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Engine300_300Package getEngine300_300Package();

} //Engine300_300Factory
