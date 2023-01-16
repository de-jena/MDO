/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Sequence Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.StopSequenceStructure#getStopPoint <em>Stop Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopSequenceStructure()
 * @model extendedMetaData="name='StopSequenceStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StopSequenceStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Point</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.StopInformationStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Point</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getStopSequenceStructure_StopPoint()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='StopPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StopInformationStructure> getStopPoint();

} // StopSequenceStructure
