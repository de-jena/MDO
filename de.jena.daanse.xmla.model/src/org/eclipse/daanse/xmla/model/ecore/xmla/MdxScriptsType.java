/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mdx Scripts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType#getMdxScript <em>Mdx Script</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMdxScriptsType()
 * @model extendedMetaData="name='MdxScripts_._type' kind='elementOnly'"
 * @generated
 */
public interface MdxScriptsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mdx Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdx Script</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMdxScriptsType_MdxScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MdxScript'"
	 * @generated
	 */
	EList<MdxScript> getMdxScript();

} // MdxScriptsType
