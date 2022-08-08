/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Member Translations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType#getUnknownMemberTranslation <em>Unknown Member Translation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnknownMemberTranslationsType()
 * @model extendedMetaData="name='UnknownMemberTranslations_._type' kind='elementOnly'"
 * @generated
 */
public interface UnknownMemberTranslationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unknown Member Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Translation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Member Translation</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnknownMemberTranslationsType_UnknownMemberTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnknownMemberTranslation'"
	 * @generated
	 */
	EList<Translation> getUnknownMemberTranslation();

} // UnknownMemberTranslationsType
