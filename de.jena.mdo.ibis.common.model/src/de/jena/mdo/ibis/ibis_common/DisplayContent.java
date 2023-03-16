/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing the information for a headsign or a sidesign
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDisplayContentRef <em>Display Content Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getLineInformation <em>Line Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getViaPoint <em>Via Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation1 <em>Additional Information1</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation2 <em>Additional Information2</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation3 <em>Additional Information3</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation4 <em>Additional Information4</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation5 <em>Additional Information5</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation6 <em>Additional Information6</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation7 <em>Additional Information7</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation8 <em>Additional Information8</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation9 <em>Additional Information9</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getPeriodDuration <em>Period Duration</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent()
 * @model extendedMetaData="name='DisplayContentStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DisplayContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Content Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the display content information in the schedule data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Content Ref</em>' containment reference.
	 * @see #setDisplayContentRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_DisplayContentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisplayContentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getDisplayContentRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDisplayContentRef <em>Display Content Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Content Ref</em>' containment reference.
	 * @see #getDisplayContentRef()
	 * @generated
	 */
	void setDisplayContentRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Line Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the line, which should be displayed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Information</em>' containment reference.
	 * @see #setLineInformation(LineInformation)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_LineInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LineInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	LineInformation getLineInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getLineInformation <em>Line Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Information</em>' containment reference.
	 * @see #getLineInformation()
	 * @generated
	 */
	void setLineInformation(LineInformation value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the destination, which should be displayed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Destination)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_Destination()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Destination getDestination();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Destination value);

	/**
	 * Returns the value of the '<em><b>Via Point</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.ViaPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the via points which should be displayed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Via Point</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_ViaPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ViaPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ViaPoint> getViaPoint();

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which could be displayed, e.g. "Extra Ride", "Express", ... 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation();

	/**
	 * Returns the value of the '<em><b>Additional Information1</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information1</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation1();

	/**
	 * Returns the value of the '<em><b>Additional Information2</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information2</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation2();

	/**
	 * Returns the value of the '<em><b>Additional Information3</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information3</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation3();

	/**
	 * Returns the value of the '<em><b>Additional Information4</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information4</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation4();

	/**
	 * Returns the value of the '<em><b>Additional Information5</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information5</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation5();

	/**
	 * Returns the value of the '<em><b>Additional Information6</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information6</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation6();

	/**
	 * Returns the value of the '<em><b>Additional Information7</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information7</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation7();

	/**
	 * Returns the value of the '<em><b>Additional Information8</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information8</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation8();

	/**
	 * Returns the value of the '<em><b>Additional Information9</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information Text, which is assigned project-specific
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information9</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_AdditionalInformation9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation9' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAdditionalInformation9();

	/**
	 * Returns the value of the '<em><b>Run Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The run number (Kurs-Nummer) the trip is operated 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Number</em>' containment reference.
	 * @see #setRunNumber(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_RunNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RunNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getRunNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getRunNumber <em>Run Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Number</em>' containment reference.
	 * @see #getRunNumber()
	 * @generated
	 */
	void setRunNumber(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value, which allows to decide which Information is shown, if there is not enough time to show all
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(IBISIPNonNegativeInteger)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNonNegativeInteger getPriority();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(IBISIPNonNegativeInteger value);

	/**
	 * Returns the value of the '<em><b>Period Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If more than one Sign-Information is given, you need to know
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Duration</em>' containment reference.
	 * @see #setPeriodDuration(IBISIPDuration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_PeriodDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PeriodDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDuration getPeriodDuration();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getPeriodDuration <em>Period Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Duration</em>' containment reference.
	 * @see #getPeriodDuration()
	 * @generated
	 */
	void setPeriodDuration(IBISIPDuration value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time-Value, which defines the part of the Periodtime in which this Sign-Information should be shown
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(IBISIPDuration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDisplayContent_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDuration getDuration();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(IBISIPDuration value);

} // DisplayContent
