/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.DoorCountingObjectClassEnumeration;
import de.jena.mdo.ibis.enumerations.DoorCountingQualityEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Counting Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DoorCountingStructure#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DoorCountingStructure#getIn <em>In</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DoorCountingStructure#getOut <em>Out</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DoorCountingStructure#getCountQuality <em>Count Quality</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingStructure()
 * @model extendedMetaData="name='DoorCountingStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DoorCountingStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.DoorCountingObjectClassEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DoorCountingObjectClassEnumeration
	 * @see #isSetObjectClass()
	 * @see #unsetObjectClass()
	 * @see #setObjectClass(DoorCountingObjectClassEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingStructure_ObjectClass()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectClass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorCountingObjectClassEnumeration getObjectClass();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DoorCountingObjectClassEnumeration
	 * @see #isSetObjectClass()
	 * @see #unsetObjectClass()
	 * @see #getObjectClass()
	 * @generated
	 */
	void setObjectClass(DoorCountingObjectClassEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectClass()
	 * @see #getObjectClass()
	 * @see #setObjectClass(DoorCountingObjectClassEnumeration)
	 * @generated
	 */
	void unsetObjectClass();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getObjectClass <em>Object Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Class</em>' attribute is set.
	 * @see #unsetObjectClass()
	 * @see #getObjectClass()
	 * @see #setObjectClass(DoorCountingObjectClassEnumeration)
	 * @generated
	 */
	boolean isSetObjectClass();

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingStructure_In()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='In' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getIn();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference.
	 * @see #setOut(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingStructure_Out()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Out' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getOut();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getOut <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' containment reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Count Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.DoorCountingQualityEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Quality</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DoorCountingQualityEnumeration
	 * @see #isSetCountQuality()
	 * @see #unsetCountQuality()
	 * @see #setCountQuality(DoorCountingQualityEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingStructure_CountQuality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CountQuality' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorCountingQualityEnumeration getCountQuality();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getCountQuality <em>Count Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Quality</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DoorCountingQualityEnumeration
	 * @see #isSetCountQuality()
	 * @see #unsetCountQuality()
	 * @see #getCountQuality()
	 * @generated
	 */
	void setCountQuality(DoorCountingQualityEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getCountQuality <em>Count Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountQuality()
	 * @see #getCountQuality()
	 * @see #setCountQuality(DoorCountingQualityEnumeration)
	 * @generated
	 */
	void unsetCountQuality();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getCountQuality <em>Count Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count Quality</em>' attribute is set.
	 * @see #unsetCountQuality()
	 * @see #getCountQuality()
	 * @see #setCountQuality(DoorCountingQualityEnumeration)
	 * @generated
	 */
	boolean isSetCountQuality();

} // DoorCountingStructure
