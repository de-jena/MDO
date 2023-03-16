/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineRef <em>Line Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineName <em>Line Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineShortName <em>Line Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineCode <em>Line Code</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLineInformation()
 * @model extendedMetaData="name='LineInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Ref</em>' containment reference.
	 * @see #setLineRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLineInformation_LineRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LineRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getLineRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineRef <em>Line Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Ref</em>' containment reference.
	 * @see #getLineRef()
	 * @generated
	 */
	void setLineRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Line Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLineInformation_LineName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getLineName();

	/**
	 * Returns the value of the '<em><b>Line Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Short Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLineInformation_LineShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getLineShortName();

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' containment reference.
	 * @see #setLineNumber(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLineInformation_LineNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getLineNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineNumber <em>Line Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' containment reference.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifier of a symbol number , which is used by displays see LINIEN_CODE in VDV 452 chapter 9.7.2 REC_LID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Code</em>' containment reference.
	 * @see #setLineCode(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getLineInformation_LineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getLineCode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineCode <em>Line Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Code</em>' containment reference.
	 * @see #getLineCode()
	 * @generated
	 */
	void setLineCode(IBISIPInt value);

} // LineInformation
