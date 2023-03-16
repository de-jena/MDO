/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Announcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for decscribing the informations for an regular announcement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementRef <em>Announcement Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementText <em>Announcement Text</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementTTSText <em>Announcement TTS Text</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAnnouncement()
 * @model extendedMetaData="name='AnnouncementStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Announcement extends EObject {
	/**
	 * Returns the value of the '<em><b>Announcement Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the Announcement in the schedule data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Announcement Ref</em>' containment reference.
	 * @see #setAnnouncementRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAnnouncement_AnnouncementRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AnnouncementRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getAnnouncementRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementRef <em>Announcement Ref</em>}' containment reference.
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
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAnnouncement_AnnouncementText()
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
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getAnnouncement_AnnouncementTTSText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnouncementTTSText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getAnnouncementTTSText();

} // Announcement
