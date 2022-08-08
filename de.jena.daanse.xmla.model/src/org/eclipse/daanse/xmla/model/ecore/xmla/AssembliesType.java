/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assemblies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType#getAssembly <em>Assembly</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAssembliesType()
 * @model extendedMetaData="name='Assemblies_._type' kind='elementOnly'"
 * @generated
 */
public interface AssembliesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Assembly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAssembliesType_Assembly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assembly'"
	 * @generated
	 */
	EList<Assembly> getAssembly();

} // AssembliesType
