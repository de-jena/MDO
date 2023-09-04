/*
 */
package de.jena.mdo.model.system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.model.system.Container#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.model.system.SystemPackage#getContainer()
 * @model
 * @generated
 */
@ProviderType
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.jena.mdo.model.system.SystemPackage#getContainer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getElements();

} // Container
