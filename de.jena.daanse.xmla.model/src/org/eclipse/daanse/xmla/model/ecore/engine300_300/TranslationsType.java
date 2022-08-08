/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getTranslationsType()
 * @model extendedMetaData="name='Translations_._type' kind='elementOnly'"
 * @generated
 */
public interface TranslationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getTranslationsType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translation'"
	 * @generated
	 */
	EList<RelationshipEndTranslation> getTranslation();

} // TranslationsType
