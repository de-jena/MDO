/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSP Point Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.TSPPointStructure#getTSPPointRef <em>TSP Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TSPPointStructure#getTSPCode <em>TSP Code</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TSPPointStructure#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.TSPPointStructure#getDesciption <em>Desciption</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTSPPointStructure()
 * @model extendedMetaData="name='TSPPointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TSPPointStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>TSP Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSP Point Ref</em>' containment reference.
	 * @see #setTSPPointRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTSPPointStructure_TSPPointRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TSPPointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getTSPPointRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TSPPointStructure#getTSPPointRef <em>TSP Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSP Point Ref</em>' containment reference.
	 * @see #getTSPPointRef()
	 * @generated
	 */
	void setTSPPointRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>TSP Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSP Code</em>' containment reference.
	 * @see #setTSPCode(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTSPPointStructure_TSPCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TSPCode' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getTSPCode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.TSPPointStructure#getTSPCode <em>TSP Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSP Code</em>' containment reference.
	 * @see #getTSPCode()
	 * @generated
	 */
	void setTSPCode(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTSPPointStructure_ShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getShortName();

	/**
	 * Returns the value of the '<em><b>Desciption</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desciption</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getTSPPointStructure_Desciption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Desciption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getDesciption();

} // TSPPointStructure
