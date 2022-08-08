/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assemblies Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType1#getAssembly <em>Assembly</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAssembliesType1()
 * @model extendedMetaData="name='Assemblies_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface AssembliesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Assembly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAssembliesType1_Assembly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assembly'"
	 * @generated
	 */
	EList<Assembly> getAssembly();

} // AssembliesType1
