/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming Template Translations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType#getNamingTemplateTranslation <em>Naming Template Translation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNamingTemplateTranslationsType()
 * @model extendedMetaData="name='NamingTemplateTranslations_._type' kind='elementOnly'"
 * @generated
 */
public interface NamingTemplateTranslationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Naming Template Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Translation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming Template Translation</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNamingTemplateTranslationsType_NamingTemplateTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamingTemplateTranslation'"
	 * @generated
	 */
	EList<Translation> getNamingTemplateTranslation();

} // NamingTemplateTranslationsType
