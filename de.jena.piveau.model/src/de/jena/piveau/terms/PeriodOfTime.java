/*
 */
package de.jena.piveau.terms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period Of Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.terms.PeriodOfTime#getPeriodOfTime <em>Period Of Time</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.terms.TermsPackage#getPeriodOfTime()
 * @model extendedMetaData="name='PeriodOfTime' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PeriodOfTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Period Of Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Of Time</em>' containment reference.
	 * @see #setPeriodOfTime(PeriodOfTimeType)
	 * @see de.jena.piveau.terms.TermsPackage#getPeriodOfTime_PeriodOfTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PeriodOfTime' namespace='##targetNamespace'"
	 * @generated
	 */
	PeriodOfTimeType getPeriodOfTime();

	/**
	 * Sets the value of the '{@link de.jena.piveau.terms.PeriodOfTime#getPeriodOfTime <em>Period Of Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Of Time</em>' containment reference.
	 * @see #getPeriodOfTime()
	 * @generated
	 */
	void setPeriodOfTime(PeriodOfTimeType value);

} // PeriodOfTime
