/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.PointSequence#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointSequence()
 * @model extendedMetaData="name='PointSequenceStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointSequence_Point()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Point> getPoint();

} // PointSequence
