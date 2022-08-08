/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Member Translations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberTranslationsType#getAllMemberTranslation <em>All Member Translation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAllMemberTranslationsType()
 * @model extendedMetaData="name='AllMemberTranslations_._type' kind='elementOnly'"
 * @generated
 */
public interface AllMemberTranslationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>All Member Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Translation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Member Translation</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAllMemberTranslationsType_AllMemberTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllMemberTranslation'"
	 * @generated
	 */
	EList<Translation> getAllMemberTranslation();

} // AllMemberTranslationsType
