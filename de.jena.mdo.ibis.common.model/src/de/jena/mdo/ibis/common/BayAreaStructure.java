/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bay Area Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing an area at the stop point for detecting the right stop position
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.BayAreaStructure#getBeforeBay <em>Before Bay</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.BayAreaStructure#getBehindBay <em>Behind Bay</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getBayAreaStructure()
 * @model extendedMetaData="name='BayAreaStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BayAreaStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Before Bay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance before the defined Stoppoint, where the detection area begins, value in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before Bay</em>' containment reference.
	 * @see #setBeforeBay(IBISIPDouble)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getBayAreaStructure_BeforeBay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BeforeBay' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getBeforeBay();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.BayAreaStructure#getBeforeBay <em>Before Bay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Bay</em>' containment reference.
	 * @see #getBeforeBay()
	 * @generated
	 */
	void setBeforeBay(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Behind Bay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance behind the defined Stoppoint, where the detection area begins, value in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behind Bay</em>' containment reference.
	 * @see #setBehindBay(IBISIPDouble)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getBayAreaStructure_BehindBay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BehindBay' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getBehindBay();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.BayAreaStructure#getBehindBay <em>Behind Bay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behind Bay</em>' containment reference.
	 * @see #getBehindBay()
	 * @generated
	 */
	void setBehindBay(IBISIPDouble value);

} // BayAreaStructure
