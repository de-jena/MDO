/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Announcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for decscribing the informations for an additional announcement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementRef <em>Announcement Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementText <em>Announcement Text</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementTTSText <em>Announcement TTS Text</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getImmediateInformation <em>Immediate Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getPeriodicalInformation <em>Periodical Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getSpecificPoint <em>Specific Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement()
 * @model extendedMetaData="name='AdditionalAnnouncementStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalAnnouncement extends EObject {
	/**
	 * Returns the value of the '<em><b>Announcement Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the Announcement in the schedule data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Announcement Ref</em>' containment reference.
	 * @see #setAnnouncementRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement_AnnouncementRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AnnouncementRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getAnnouncementRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementRef <em>Announcement Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Announcement Ref</em>' containment reference.
	 * @see #getAnnouncementRef()
	 * @generated
	 */
	void setAnnouncementRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Announcement Text</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text of the Announcement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Announcement Text</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement_AnnouncementText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnouncementText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAnnouncementText();

	/**
	 * Returns the value of the '<em><b>Announcement TTS Text</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text of the Announcement for a text-to-speech-system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Announcement TTS Text</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement_AnnouncementTTSText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnouncementTTSText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAnnouncementTTSText();

	/**
	 * Returns the value of the '<em><b>Immediate Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true, if the additional annoucement should be pronounced immiditaley
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immediate Information</em>' containment reference.
	 * @see #setImmediateInformation(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement_ImmediateInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImmediateInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getImmediateInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getImmediateInformation <em>Immediate Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Information</em>' containment reference.
	 * @see #getImmediateInformation()
	 * @generated
	 */
	void setImmediateInformation(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Periodical Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * period in which the addional announcement should be played 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Periodical Information</em>' containment reference.
	 * @see #setPeriodicalInformation(IBISIPDuration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement_PeriodicalInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PeriodicalInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDuration getPeriodicalInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getPeriodicalInformation <em>Periodical Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodical Information</em>' containment reference.
	 * @see #getPeriodicalInformation()
	 * @generated
	 */
	void setPeriodicalInformation(IBISIPDuration value);

	/**
	 * Returns the value of the '<em><b>Specific Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describes a specific point, where the addional announcement should be played
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Point</em>' containment reference.
	 * @see #setSpecificPoint(SpecificPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAdditionalAnnouncement_SpecificPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpecificPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificPoint getSpecificPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getSpecificPoint <em>Specific Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Point</em>' containment reference.
	 * @see #getSpecificPoint()
	 * @generated
	 */
	void setSpecificPoint(SpecificPoint value);

} // AdditionalAnnouncement
