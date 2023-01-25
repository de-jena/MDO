/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.common.IbisCommonFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
@ProviderType
public interface IbisCommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/ibis-common/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisCommonPackage eINSTANCE = de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.AdditionalAnnouncementStructureImpl <em>Additional Announcement Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.AdditionalAnnouncementStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getAdditionalAnnouncementStructure()
	 * @generated
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Announcement Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Announcement Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Announcement TTS Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Immediate Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE__IMMEDIATE_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Periodical Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE__PERIODICAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Specific Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE__SPECIFIC_POINT = 5;

	/**
	 * The number of structural features of the '<em>Additional Announcement Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Additional Announcement Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl <em>Announcement Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getAnnouncementStructure()
	 * @generated
	 */
	int ANNOUNCEMENT_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Announcement Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Announcement Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Announcement TTS Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT = 2;

	/**
	 * The number of structural features of the '<em>Announcement Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Announcement Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.BayAreaStructureImpl <em>Bay Area Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.BayAreaStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getBayAreaStructure()
	 * @generated
	 */
	int BAY_AREA_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Before Bay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA_STRUCTURE__BEFORE_BAY = 0;

	/**
	 * The feature id for the '<em><b>Behind Bay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA_STRUCTURE__BEHIND_BAY = 1;

	/**
	 * The number of structural features of the '<em>Bay Area Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bay Area Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl <em>Beacon Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getBeaconPointStructure()
	 * @generated
	 */
	int BEACON_POINT_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_STRUCTURE__POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Beacon Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_STRUCTURE__BEACON_CODE = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_STRUCTURE__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Desciption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_STRUCTURE__DESCIPTION = 3;

	/**
	 * The number of structural features of the '<em>Beacon Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Beacon Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.CardApplInformationsImpl <em>Card Appl Informations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.CardApplInformationsImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getCardApplInformations()
	 * @generated
	 */
	int CARD_APPL_INFORMATIONS = 4;

	/**
	 * The feature id for the '<em><b>Card Appl Information Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Card Appl Information Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA = 1;

	/**
	 * The number of structural features of the '<em>Card Appl Informations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_APPL_INFORMATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Card Appl Informations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_APPL_INFORMATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.CardTicketDataImpl <em>Card Ticket Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.CardTicketDataImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getCardTicketData()
	 * @generated
	 */
	int CARD_TICKET_DATA = 5;

	/**
	 * The feature id for the '<em><b>Card Ticket Data ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TICKET_DATA__CARD_TICKET_DATA_ID = 0;

	/**
	 * The feature id for the '<em><b>Card Ticket Data Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Card Ticket Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TICKET_DATA__CARD_TICKET_DATA = 2;

	/**
	 * The number of structural features of the '<em>Card Ticket Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TICKET_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Card Ticket Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TICKET_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.CardTypeImpl <em>Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.CardTypeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getCardType()
	 * @generated
	 */
	int CARD_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Card Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__CARD_SERIAL_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Card Type ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__CARD_TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Card Type Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__CARD_TYPE_TEXT = 2;

	/**
	 * The number of structural features of the '<em>Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ConnectionStructureImpl <em>Connection Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ConnectionStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getConnectionStructure()
	 * @generated
	 */
	int CONNECTION_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__STOP_REF = 0;

	/**
	 * The feature id for the '<em><b>Connection Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__CONNECTION_REF = 1;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__CONNECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__DISPLAY_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__CONNECTION_STATE = 5;

	/**
	 * The feature id for the '<em><b>Transport Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__TRANSPORT_MODE = 6;

	/**
	 * The feature id for the '<em><b>Connection Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__CONNECTION_MODE = 7;

	/**
	 * The feature id for the '<em><b>Expected Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__EXPECTED_DEPARTURE_TIME = 8;

	/**
	 * The feature id for the '<em><b>Scheduled Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE__SCHEDULED_DEPARTURE_TIME = 9;

	/**
	 * The number of structural features of the '<em>Connection Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Connection Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DataAcceptedResponseDataStructureImpl <em>Data Accepted Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DataAcceptedResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataAcceptedResponseDataStructure()
	 * @generated
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Data Accepted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__DATA_ACCEPTED = 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__ERROR_CODE = 2;

	/**
	 * The feature id for the '<em><b>Error Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__ERROR_INFORMATION = 3;

	/**
	 * The number of structural features of the '<em>Data Accepted Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Accepted Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DataAcceptedResponseStructureImpl <em>Data Accepted Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DataAcceptedResponseStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataAcceptedResponseStructure()
	 * @generated
	 */
	int DATA_ACCEPTED_RESPONSE_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Data Accepted Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Data Accepted Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Accepted Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DataVersionListStructureImpl <em>Data Version List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DataVersionListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataVersionListStructure()
	 * @generated
	 */
	int DATA_VERSION_LIST_STRUCTURE = 10;

	/**
	 * The feature id for the '<em><b>Data Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_LIST_STRUCTURE__DATA_VERSION = 0;

	/**
	 * The number of structural features of the '<em>Data Version List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Version List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DataVersionStructureImpl <em>Data Version Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DataVersionStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataVersionStructure()
	 * @generated
	 */
	int DATA_VERSION_STRUCTURE = 11;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_STRUCTURE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Version Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_STRUCTURE__VERSION_REF = 1;

	/**
	 * The number of structural features of the '<em>Data Version Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Version Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DegreeTypeImpl <em>Degree Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DegreeTypeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDegreeType()
	 * @generated
	 */
	int DEGREE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_TYPE__DEGREE = 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_TYPE__ORIENTATION = 1;

	/**
	 * The number of structural features of the '<em>Degree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Degree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DestinationStructureImpl <em>Destination Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DestinationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDestinationStructure()
	 * @generated
	 */
	int DESTINATION_STRUCTURE = 13;

	/**
	 * The feature id for the '<em><b>Destination Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STRUCTURE__DESTINATION_REF = 0;

	/**
	 * The feature id for the '<em><b>Destination Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STRUCTURE__DESTINATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Destination Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Destination Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Destination Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DeviceInformationStructureImpl <em>Device Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DeviceInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceInformationStructure()
	 * @generated
	 */
	int DEVICE_INFORMATION_STRUCTURE = 14;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE__DEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE__MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE__SERIAL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Device Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE__DEVICE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Data Version List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE__DATA_VERSION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Web Interface Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE__WEB_INTERFACE_ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Device Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Device Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationListStructureImpl <em>Device Specification List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationListStructure()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_LIST_STRUCTURE = 15;

	/**
	 * The feature id for the '<em><b>Device Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Device Specification List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Specification List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationStructureImpl <em>Device Specification Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationStructure()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_STRUCTURE = 16;

	/**
	 * The feature id for the '<em><b>Device Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID = 1;

	/**
	 * The number of structural features of the '<em>Device Specification Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Specification Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateListStructureImpl <em>Device Specification With State List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithStateListStructure()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE = 17;

	/**
	 * The feature id for the '<em><b>Device Specification With State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__DEVICE_SPECIFICATION_WITH_STATE = 0;

	/**
	 * The number of structural features of the '<em>Device Specification With State List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Specification With State List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateStructureImpl <em>Device Specification With State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithStateStructure()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE = 18;

	/**
	 * The feature id for the '<em><b>Device Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE__DEVICE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE__DEVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Device Specification With State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Specification With State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl <em>Display Content Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDisplayContentStructure()
	 * @generated
	 */
	int DISPLAY_CONTENT_STRUCTURE = 19;

	/**
	 * The feature id for the '<em><b>Display Content Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Line Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Via Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__VIA_POINT = 3;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Additional Information1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1 = 5;

	/**
	 * The feature id for the '<em><b>Additional Information2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2 = 6;

	/**
	 * The feature id for the '<em><b>Additional Information3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3 = 7;

	/**
	 * The feature id for the '<em><b>Additional Information4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4 = 8;

	/**
	 * The feature id for the '<em><b>Additional Information5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5 = 9;

	/**
	 * The feature id for the '<em><b>Additional Information6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6 = 10;

	/**
	 * The feature id for the '<em><b>Additional Information7</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7 = 11;

	/**
	 * The feature id for the '<em><b>Additional Information8</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8 = 12;

	/**
	 * The feature id for the '<em><b>Additional Information9</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9 = 13;

	/**
	 * The feature id for the '<em><b>Run Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__PRIORITY = 15;

	/**
	 * The feature id for the '<em><b>Period Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION = 16;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE__DURATION = 17;

	/**
	 * The number of structural features of the '<em>Display Content Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Display Content Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DocumentRootImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Air Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AIR_SUBMODE = 3;

	/**
	 * The feature id for the '<em><b>Bus Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUS_SUBMODE = 4;

	/**
	 * The feature id for the '<em><b>Coach Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COACH_SUBMODE = 5;

	/**
	 * The feature id for the '<em><b>Data Accepted Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Funicular Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FUNICULAR_SUBMODE = 7;

	/**
	 * The feature id for the '<em><b>Metro Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METRO_SUBMODE = 8;

	/**
	 * The feature id for the '<em><b>Rail Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RAIL_SUBMODE = 9;

	/**
	 * The feature id for the '<em><b>Self Drive Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELF_DRIVE_SUBMODE = 10;

	/**
	 * The feature id for the '<em><b>Subscribe Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSCRIBE_REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Subscribe Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSCRIBE_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Taxi Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAXI_SUBMODE = 13;

	/**
	 * The feature id for the '<em><b>Telecabin Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELECABIN_SUBMODE = 14;

	/**
	 * The feature id for the '<em><b>Tram Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRAM_SUBMODE = 15;

	/**
	 * The feature id for the '<em><b>Unsubscribe Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST = 16;

	/**
	 * The feature id for the '<em><b>Unsubscribe Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE = 17;

	/**
	 * The feature id for the '<em><b>Water Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_SUBMODE = 18;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DoorCountingListStructureImpl <em>Door Counting List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DoorCountingListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorCountingListStructure()
	 * @generated
	 */
	int DOOR_COUNTING_LIST_STRUCTURE = 21;

	/**
	 * The feature id for the '<em><b>Door ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST_STRUCTURE__DOOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Count Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST_STRUCTURE__COUNT_SET = 1;

	/**
	 * The number of structural features of the '<em>Door Counting List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door Counting List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl <em>Door Counting Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorCountingStructure()
	 * @generated
	 */
	int DOOR_COUNTING_STRUCTURE = 22;

	/**
	 * The feature id for the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_STRUCTURE__OBJECT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_STRUCTURE__IN = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_STRUCTURE__OUT = 2;

	/**
	 * The feature id for the '<em><b>Count Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_STRUCTURE__COUNT_QUALITY = 3;

	/**
	 * The number of structural features of the '<em>Door Counting Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Door Counting Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DoorInformationStructureImpl <em>Door Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DoorInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorInformationStructure()
	 * @generated
	 */
	int DOOR_INFORMATION_STRUCTURE = 23;

	/**
	 * The feature id for the '<em><b>Door ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_STRUCTURE__DOOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_STRUCTURE__COUNT = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_STRUCTURE__STATE = 2;

	/**
	 * The number of structural features of the '<em>Door Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Door Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DoorOpenStateStructureImpl <em>Door Open State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DoorOpenStateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorOpenStateStructure()
	 * @generated
	 */
	int DOOR_OPEN_STATE_STRUCTURE = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE_STRUCTURE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE_STRUCTURE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>Door Open State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door Open State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DoorOperationStateStructureImpl <em>Door Operation State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DoorOperationStateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorOperationStateStructure()
	 * @generated
	 */
	int DOOR_OPERATION_STATE_STRUCTURE = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE_STRUCTURE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE_STRUCTURE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>Door Operation State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door Operation State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.DoorStateStructureImpl <em>Door State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.DoorStateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorStateStructure()
	 * @generated
	 */
	int DOOR_STATE_STRUCTURE = 26;

	/**
	 * The feature id for the '<em><b>Open State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE_STRUCTURE__OPEN_STATE = 0;

	/**
	 * The feature id for the '<em><b>Operation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE_STRUCTURE__OPERATION_STATE = 1;

	/**
	 * The number of structural features of the '<em>Door State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl <em>Fare Zone Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getFareZoneInformationStructure()
	 * @generated
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE = 27;

	/**
	 * The feature id for the '<em><b>Fare Zone ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Fare Zone Long Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Fare Zone Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME = 3;

	/**
	 * The number of structural features of the '<em>Fare Zone Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fare Zone Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.GlobalCardStatusImpl <em>Global Card Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.GlobalCardStatusImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getGlobalCardStatus()
	 * @generated
	 */
	int GLOBAL_CARD_STATUS = 28;

	/**
	 * The feature id for the '<em><b>Global Card Staus ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID = 0;

	/**
	 * The feature id for the '<em><b>Global Card Status Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Global Card Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CARD_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Global Card Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CARD_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.GNSSCoordinateStructureImpl <em>GNSS Coordinate Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.GNSSCoordinateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getGNSSCoordinateStructure()
	 * @generated
	 */
	int GNSS_COORDINATE_STRUCTURE = 29;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE_STRUCTURE__DEGREE = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE_STRUCTURE__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>GNSS Coordinate Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GNSS Coordinate Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl <em>GNSS Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getGNSSPointStructure()
	 * @generated
	 */
	int GNSS_POINT_STRUCTURE = 30;

	/**
	 * The feature id for the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_STRUCTURE__POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_STRUCTURE__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_STRUCTURE__LATITUDE = 2;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_STRUCTURE__ALTITUDE = 3;

	/**
	 * The number of structural features of the '<em>GNSS Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GNSS Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPAnyURIImpl <em>IBISIP Any URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPAnyURIImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPAnyURI()
	 * @generated
	 */
	int IBISIP_ANY_URI = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_ANY_URI__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_ANY_URI__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Any URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_ANY_URI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Any URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_ANY_URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPBooleanImpl <em>IBISIP Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPBooleanImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPBoolean()
	 * @generated
	 */
	int IBISIP_BOOLEAN = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BOOLEAN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BOOLEAN__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BOOLEAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BOOLEAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPByteImpl <em>IBISIP Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPByteImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPByte()
	 * @generated
	 */
	int IBISIP_BYTE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BYTE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BYTE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BYTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_BYTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDateImpl <em>IBISIP Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPDateImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDate()
	 * @generated
	 */
	int IBISIP_DATE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDateTimeImpl <em>IBISIP Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPDateTimeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDateTime()
	 * @generated
	 */
	int IBISIP_DATE_TIME = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE_TIME__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DATE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDoubleImpl <em>IBISIP Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPDoubleImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDouble()
	 * @generated
	 */
	int IBISIP_DOUBLE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DOUBLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DOUBLE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DOUBLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DOUBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDurationImpl <em>IBISIP Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPDurationImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDuration()
	 * @generated
	 */
	int IBISIP_DURATION = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DURATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DURATION__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPIntImpl <em>IBISIP Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPIntImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPInt()
	 * @generated
	 */
	int IBISIP_INT = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_INT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_INT__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_INT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_INT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPLanguageImpl <em>IBISIP Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPLanguageImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPLanguage()
	 * @generated
	 */
	int IBISIP_LANGUAGE = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_LANGUAGE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_LANGUAGE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPNMTOKENImpl <em>IBISIPNMTOKEN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPNMTOKENImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPNMTOKEN()
	 * @generated
	 */
	int IBISIPNMTOKEN = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIPNMTOKEN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIPNMTOKEN__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIPNMTOKEN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIPNMTOKEN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIPNMTOKEN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIPNMTOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPNonNegativeIntegerImpl <em>IBISIP Non Negative Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPNonNegativeIntegerImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPNonNegativeInteger()
	 * @generated
	 */
	int IBISIP_NON_NEGATIVE_INTEGER = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NON_NEGATIVE_INTEGER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Non Negative Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NON_NEGATIVE_INTEGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Non Negative Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NON_NEGATIVE_INTEGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPNormalizedStringImpl <em>IBISIP Normalized String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPNormalizedStringImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPNormalizedString()
	 * @generated
	 */
	int IBISIP_NORMALIZED_STRING = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NORMALIZED_STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NORMALIZED_STRING__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Normalized String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NORMALIZED_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Normalized String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_NORMALIZED_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPStringImpl <em>IBISIP String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPStringImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPString()
	 * @generated
	 */
	int IBISIP_STRING = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_STRING__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPTimeImpl <em>IBISIP Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPTimeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPTime()
	 * @generated
	 */
	int IBISIP_TIME = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_TIME__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPUnsignedIntImpl <em>IBISIP Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPUnsignedIntImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPUnsignedInt()
	 * @generated
	 */
	int IBISIP_UNSIGNED_INT = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_INT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_INT__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_INT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_INT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.IBISIPUnsignedLongImpl <em>IBISIP Unsigned Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.IBISIPUnsignedLongImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPUnsignedLong()
	 * @generated
	 */
	int IBISIP_UNSIGNED_LONG = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_LONG__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_LONG__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>IBISIP Unsigned Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_LONG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IBISIP Unsigned Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBISIP_UNSIGNED_LONG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.InternationalTextTypeImpl <em>International Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.InternationalTextTypeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getInternationalTextType()
	 * @generated
	 */
	int INTERNATIONAL_TEXT_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE__ERROR_CODE = 2;

	/**
	 * The number of structural features of the '<em>International Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>International Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl <em>Journey Stop Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getJourneyStopInformationStructure()
	 * @generated
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE = 48;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF = 0;

	/**
	 * The feature id for the '<em><b>Stop Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Stop Alternative Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM = 3;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT = 5;

	/**
	 * The feature id for the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED = 6;

	/**
	 * The feature id for the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED = 7;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Bay Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA = 9;

	/**
	 * The feature id for the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT = 10;

	/**
	 * The feature id for the '<em><b>Fare Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE = 11;

	/**
	 * The number of structural features of the '<em>Journey Stop Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Journey Stop Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl <em>Line Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.LineInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getLineInformationStructure()
	 * @generated
	 */
	int LINE_INFORMATION_STRUCTURE = 49;

	/**
	 * The feature id for the '<em><b>Line Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE__LINE_REF = 0;

	/**
	 * The feature id for the '<em><b>Line Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE__LINE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Line Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE__LINE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE__LINE_CODE = 4;

	/**
	 * The number of structural features of the '<em>Line Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Line Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.LogMessageStructureImpl <em>Log Message Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.LogMessageStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getLogMessageStructure()
	 * @generated
	 */
	int LOG_MESSAGE_STRUCTURE = 50;

	/**
	 * The feature id for the '<em><b>Message Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STRUCTURE__MESSAGE_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STRUCTURE__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Log Message Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Log Message Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.MessageStructureImpl <em>Message Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.MessageStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getMessageStructure()
	 * @generated
	 */
	int MESSAGE_STRUCTURE = 51;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_STRUCTURE__MESSAGE_ID = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_STRUCTURE__TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_STRUCTURE__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Message Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_STRUCTURE__MESSAGE_TEXT = 3;

	/**
	 * The number of structural features of the '<em>Message Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.NetexModeImpl <em>Netex Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.NetexModeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getNetexMode()
	 * @generated
	 */
	int NETEX_MODE = 52;

	/**
	 * The feature id for the '<em><b>Pt Main Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__PT_MAIN_MODE = 0;

	/**
	 * The feature id for the '<em><b>Private Main Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__PRIVATE_MAIN_MODE = 1;

	/**
	 * The feature id for the '<em><b>Air Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__AIR_SUBMODE = 2;

	/**
	 * The feature id for the '<em><b>Bus Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__BUS_SUBMODE = 3;

	/**
	 * The feature id for the '<em><b>Coach Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__COACH_SUBMODE = 4;

	/**
	 * The feature id for the '<em><b>Funicular Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__FUNICULAR_SUBMODE = 5;

	/**
	 * The feature id for the '<em><b>Metro Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__METRO_SUBMODE = 6;

	/**
	 * The feature id for the '<em><b>Tram Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__TRAM_SUBMODE = 7;

	/**
	 * The feature id for the '<em><b>Telecabin Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__TELECABIN_SUBMODE = 8;

	/**
	 * The feature id for the '<em><b>Rail Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__RAIL_SUBMODE = 9;

	/**
	 * The feature id for the '<em><b>Water Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__WATER_SUBMODE = 10;

	/**
	 * The feature id for the '<em><b>Taxi Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__TAXI_SUBMODE = 11;

	/**
	 * The feature id for the '<em><b>Self Drive Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE__SELF_DRIVE_SUBMODE = 12;

	/**
	 * The number of structural features of the '<em>Netex Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Netex Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETEX_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.PointSequenceStructureImpl <em>Point Sequence Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.PointSequenceStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getPointSequenceStructure()
	 * @generated
	 */
	int POINT_SEQUENCE_STRUCTURE = 53;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_SEQUENCE_STRUCTURE__POINT = 0;

	/**
	 * The number of structural features of the '<em>Point Sequence Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_SEQUENCE_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Point Sequence Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_SEQUENCE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.PointStructureImpl <em>Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.PointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getPointStructure()
	 * @generated
	 */
	int POINT_STRUCTURE = 54;

	/**
	 * The feature id for the '<em><b>Point Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_STRUCTURE__POINT_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Point Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_STRUCTURE__POINT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Distance To Previous Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT = 2;

	/**
	 * The number of structural features of the '<em>Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl <em>Point Type Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.PointTypeStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getPointTypeStructure()
	 * @generated
	 */
	int POINT_TYPE_STRUCTURE = 55;

	/**
	 * The feature id for the '<em><b>Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE__STOP_POINT = 0;

	/**
	 * The feature id for the '<em><b>Beacon Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE__BEACON_POINT = 1;

	/**
	 * The feature id for the '<em><b>GNSS Location Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT = 2;

	/**
	 * The feature id for the '<em><b>Timing Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE__TIMING_POINT = 3;

	/**
	 * The feature id for the '<em><b>TSP Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE__TSP_POINT = 4;

	/**
	 * The number of structural features of the '<em>Point Type Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Point Type Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationStructureImpl <em>Service Identification Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceIdentificationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceIdentificationStructure()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_STRUCTURE = 56;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_STRUCTURE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_STRUCTURE__DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Service Identification Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Identification Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateListStructureImpl <em>Service Identification With State List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceIdentificationWithStateListStructure()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE = 57;

	/**
	 * The feature id for the '<em><b>Service Identification With State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_IDENTIFICATION_WITH_STATE = 0;

	/**
	 * The number of structural features of the '<em>Service Identification With State List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Identification With State List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateStructureImpl <em>Service Identification With State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceIdentificationWithStateStructure()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE = 58;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Service Identification With State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Identification With State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceInformationListStructureImpl <em>Service Information List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceInformationListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceInformationListStructure()
	 * @generated
	 */
	int SERVICE_INFORMATION_LIST_STRUCTURE = 59;

	/**
	 * The feature id for the '<em><b>Service Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Service Information List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Information List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceInformationStructureImpl <em>Service Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceInformationStructure()
	 * @generated
	 */
	int SERVICE_INFORMATION_STRUCTURE = 60;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_STRUCTURE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_STRUCTURE__AUTOSTART = 1;

	/**
	 * The number of structural features of the '<em>Service Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationStructureImpl <em>Service Specification Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceSpecificationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceSpecificationStructure()
	 * @generated
	 */
	int SERVICE_SPECIFICATION_STRUCTURE = 61;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>IBISIP Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Service Specification Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Specification Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateListStructureImpl <em>Service Specification With State List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceSpecificationWithStateListStructure()
	 * @generated
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE = 62;

	/**
	 * The feature id for the '<em><b>Service Specification With State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE = 0;

	/**
	 * The number of structural features of the '<em>Service Specification With State List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Specification With State List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateStructureImpl <em>Service Specification With State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceSpecificationWithStateStructure()
	 * @generated
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE = 63;

	/**
	 * The feature id for the '<em><b>Service Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Service Specification With State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Specification With State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceStartListStructureImpl <em>Service Start List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceStartListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceStartListStructure()
	 * @generated
	 */
	int SERVICE_START_LIST_STRUCTURE = 64;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_LIST_STRUCTURE__SERVICE_IDENTIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Service Start List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Start List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ServiceStartStructureImpl <em>Service Start Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ServiceStartStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceStartStructure()
	 * @generated
	 */
	int SERVICE_START_STRUCTURE = 65;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_STRUCTURE__SERVICE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_STRUCTURE__AUTOSTART = 1;

	/**
	 * The number of structural features of the '<em>Service Start Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Start Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ShortTripStopListStructureImpl <em>Short Trip Stop List Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ShortTripStopListStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getShortTripStopListStructure()
	 * @generated
	 */
	int SHORT_TRIP_STOP_LIST_STRUCTURE = 66;

	/**
	 * The feature id for the '<em><b>Short Trip Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP = 0;

	/**
	 * The number of structural features of the '<em>Short Trip Stop List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_LIST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Short Trip Stop List Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_LIST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ShortTripStopStructureImpl <em>Short Trip Stop Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ShortTripStopStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getShortTripStopStructure()
	 * @generated
	 */
	int SHORT_TRIP_STOP_STRUCTURE = 67;

	/**
	 * The feature id for the '<em><b>Journey Stop Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_STRUCTURE__JOURNEY_STOP_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_STRUCTURE__FARE_ZONE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Short Trip Stop Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Short Trip Stop Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.SpecificPointStructureImpl <em>Specific Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.SpecificPointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getSpecificPointStructure()
	 * @generated
	 */
	int SPECIFIC_POINT_STRUCTURE = 68;

	/**
	 * The feature id for the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT_STRUCTURE__POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Distance To Previous Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT = 1;

	/**
	 * The number of structural features of the '<em>Specific Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specific Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.StopInformationRequestStructureImpl <em>Stop Information Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.StopInformationRequestStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopInformationRequestStructure()
	 * @generated
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE = 69;

	/**
	 * The feature id for the '<em><b>Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__STOP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__STOP_REF = 1;

	/**
	 * The feature id for the '<em><b>Stop Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__STOP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__DISPLAY_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Stop Announcement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__STOP_ANNOUNCEMENT = 4;

	/**
	 * The feature id for the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__ARRIVAL_SCHEDULED = 5;

	/**
	 * The feature id for the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__DEPARTURE_SCHEDULED = 6;

	/**
	 * The feature id for the '<em><b>Recorded Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__RECORDED_ARRIVAL_TIME = 7;

	/**
	 * The feature id for the '<em><b>Distance To Next Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__DISTANCE_TO_NEXT_STOP = 8;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Fare Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE__FARE_ZONE = 10;

	/**
	 * The number of structural features of the '<em>Stop Information Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Stop Information Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl <em>Stop Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.StopInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopInformationStructure()
	 * @generated
	 */
	int STOP_INFORMATION_STRUCTURE = 70;

	/**
	 * The feature id for the '<em><b>Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__STOP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__STOP_REF = 1;

	/**
	 * The feature id for the '<em><b>Stop Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__STOP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Stop Alternative Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Stop Announcement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT = 6;

	/**
	 * The feature id for the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED = 7;

	/**
	 * The feature id for the '<em><b>Arrival Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED = 8;

	/**
	 * The feature id for the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED = 9;

	/**
	 * The feature id for the '<em><b>Departure Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED = 10;

	/**
	 * The feature id for the '<em><b>Recorded Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME = 11;

	/**
	 * The feature id for the '<em><b>Distance To Next Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP = 12;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Fare Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE__FARE_ZONE = 14;

	/**
	 * The number of structural features of the '<em>Stop Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Stop Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.StopPointTariffInformationStructureImpl <em>Stop Point Tariff Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.StopPointTariffInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopPointTariffInformationStructure()
	 * @generated
	 */
	int STOP_POINT_TARIFF_INFORMATION_STRUCTURE = 71;

	/**
	 * The feature id for the '<em><b>Journey Stop Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Stop Point Tariff Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stop Point Tariff Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.StopSequenceStructureImpl <em>Stop Sequence Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.StopSequenceStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopSequenceStructure()
	 * @generated
	 */
	int STOP_SEQUENCE_STRUCTURE = 72;

	/**
	 * The feature id for the '<em><b>Stop Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SEQUENCE_STRUCTURE__STOP_POINT = 0;

	/**
	 * The number of structural features of the '<em>Stop Sequence Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SEQUENCE_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop Sequence Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SEQUENCE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.SubscribeRequestStructureImpl <em>Subscribe Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.SubscribeRequestStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getSubscribeRequestStructure()
	 * @generated
	 */
	int SUBSCRIBE_REQUEST_STRUCTURE = 73;

	/**
	 * The feature id for the '<em><b>Client IP Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_STRUCTURE__CLIENT_IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reply Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_STRUCTURE__REPLY_PORT = 1;

	/**
	 * The feature id for the '<em><b>Reply Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_STRUCTURE__REPLY_PATH = 2;

	/**
	 * The number of structural features of the '<em>Subscribe Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subscribe Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl <em>Subscribe Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getSubscribeResponseStructure()
	 * @generated
	 */
	int SUBSCRIBE_RESPONSE_STRUCTURE = 74;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Heartbeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT = 1;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Subscribe Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subscribe Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.TimingPointStructureImpl <em>Timing Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.TimingPointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTimingPointStructure()
	 * @generated
	 */
	int TIMING_POINT_STRUCTURE = 75;

	/**
	 * The feature id for the '<em><b>Timing Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_STRUCTURE__TIMING_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Schedule Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_STRUCTURE__SCHEDULE_TIME = 1;

	/**
	 * The feature id for the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_STRUCTURE__GNSS_POINT = 2;

	/**
	 * The number of structural features of the '<em>Timing Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Timing Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl <em>Trip Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.TripInformationStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTripInformationStructure()
	 * @generated
	 */
	int TRIP_INFORMATION_STRUCTURE = 76;

	/**
	 * The feature id for the '<em><b>Trip Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__TRIP_REF = 0;

	/**
	 * The feature id for the '<em><b>Stop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Location State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__LOCATION_STATE = 2;

	/**
	 * The feature id for the '<em><b>Timetable Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY = 3;

	/**
	 * The feature id for the '<em><b>Additional Text Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Additional Text Message1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1 = 5;

	/**
	 * The feature id for the '<em><b>Additional Text Message2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2 = 6;

	/**
	 * The feature id for the '<em><b>Additional Text Message3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3 = 7;

	/**
	 * The feature id for the '<em><b>Additional Text Message4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4 = 8;

	/**
	 * The feature id for the '<em><b>Additional Text Message5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5 = 9;

	/**
	 * The feature id for the '<em><b>Additional Text Message6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6 = 10;

	/**
	 * The feature id for the '<em><b>Additional Text Message7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7 = 11;

	/**
	 * The feature id for the '<em><b>Additional Text Message8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8 = 12;

	/**
	 * The feature id for the '<em><b>Additional Text Message9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9 = 13;

	/**
	 * The feature id for the '<em><b>Additional Announcement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT = 14;

	/**
	 * The feature id for the '<em><b>Route Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION = 15;

	/**
	 * The feature id for the '<em><b>Run Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__RUN_NUMBER = 16;

	/**
	 * The feature id for the '<em><b>Pattern Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Path Destination Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER = 18;

	/**
	 * The number of structural features of the '<em>Trip Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Trip Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl <em>Trip Sequence Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTripSequenceStructure()
	 * @generated
	 */
	int TRIP_SEQUENCE_STRUCTURE = 77;

	/**
	 * The feature id for the '<em><b>Trip Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE__TRIP_REF = 0;

	/**
	 * The feature id for the '<em><b>Trip Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Trip Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE__TRIP_START = 2;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Journey Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE = 4;

	/**
	 * The feature id for the '<em><b>Point Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE = 5;

	/**
	 * The number of structural features of the '<em>Trip Sequence Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Trip Sequence Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.TSPPointStructureImpl <em>TSP Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.TSPPointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTSPPointStructure()
	 * @generated
	 */
	int TSP_POINT_STRUCTURE = 78;

	/**
	 * The feature id for the '<em><b>TSP Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_STRUCTURE__TSP_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>TSP Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_STRUCTURE__TSP_CODE = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_STRUCTURE__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Desciption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_STRUCTURE__DESCIPTION = 3;

	/**
	 * The number of structural features of the '<em>TSP Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TSP Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.UnsubscribeRequestStructureImpl <em>Unsubscribe Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.UnsubscribeRequestStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getUnsubscribeRequestStructure()
	 * @generated
	 */
	int UNSUBSCRIBE_REQUEST_STRUCTURE = 79;

	/**
	 * The feature id for the '<em><b>Client IP Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_STRUCTURE__CLIENT_IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reply Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_STRUCTURE__REPLY_PORT = 1;

	/**
	 * The feature id for the '<em><b>Reply Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_STRUCTURE__REPLY_PATH = 2;

	/**
	 * The number of structural features of the '<em>Unsubscribe Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unsubscribe Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.UnsubscribeResponseStructureImpl <em>Unsubscribe Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.UnsubscribeResponseStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getUnsubscribeResponseStructure()
	 * @generated
	 */
	int UNSUBSCRIBE_RESPONSE_STRUCTURE = 80;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Unsubscribe Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unsubscribe Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.VehicleStructureImpl <em>Vehicle Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.VehicleStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getVehicleStructure()
	 * @generated
	 */
	int VEHICLE_STRUCTURE = 81;

	/**
	 * The feature id for the '<em><b>Vehicle Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_STRUCTURE__VEHICLE_TYPE_REF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_STRUCTURE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Vehicle Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vehicle Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl <em>Via Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ViaPointStructureImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getViaPointStructure()
	 * @generated
	 */
	int VIA_POINT_STRUCTURE = 82;

	/**
	 * The feature id for the '<em><b>Via Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE__VIA_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Place Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE__PLACE_REF = 1;

	/**
	 * The feature id for the '<em><b>Place Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE__PLACE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Place Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE__PLACE_SHORT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Via Point Display Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY = 4;

	/**
	 * The number of structural features of the '<em>Via Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Via Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.common.impl.ZoneTypeImpl <em>Zone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.common.impl.ZoneTypeImpl
	 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getZoneType()
	 * @generated
	 */
	int ZONE_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Farezone Type ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_TYPE__FAREZONE_TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Type Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_TYPE__FARE_ZONE_TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Zone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure <em>Additional Announcement Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Announcement Structure</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure
	 * @generated
	 */
	EClass getAdditionalAnnouncementStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getAnnouncementRef <em>Announcement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Announcement Ref</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getAnnouncementRef()
	 * @see #getAdditionalAnnouncementStructure()
	 * @generated
	 */
	EReference getAdditionalAnnouncementStructure_AnnouncementRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getAnnouncementText <em>Announcement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement Text</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getAnnouncementText()
	 * @see #getAdditionalAnnouncementStructure()
	 * @generated
	 */
	EReference getAdditionalAnnouncementStructure_AnnouncementText();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getAnnouncementTTSText <em>Announcement TTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement TTS Text</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getAnnouncementTTSText()
	 * @see #getAdditionalAnnouncementStructure()
	 * @generated
	 */
	EReference getAdditionalAnnouncementStructure_AnnouncementTTSText();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getImmediateInformation <em>Immediate Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Immediate Information</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getImmediateInformation()
	 * @see #getAdditionalAnnouncementStructure()
	 * @generated
	 */
	EReference getAdditionalAnnouncementStructure_ImmediateInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getPeriodicalInformation <em>Periodical Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodical Information</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getPeriodicalInformation()
	 * @see #getAdditionalAnnouncementStructure()
	 * @generated
	 */
	EReference getAdditionalAnnouncementStructure_PeriodicalInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getSpecificPoint <em>Specific Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specific Point</em>'.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure#getSpecificPoint()
	 * @see #getAdditionalAnnouncementStructure()
	 * @generated
	 */
	EReference getAdditionalAnnouncementStructure_SpecificPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.AnnouncementStructure <em>Announcement Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Announcement Structure</em>'.
	 * @see de.jena.mdo.ibis.common.AnnouncementStructure
	 * @generated
	 */
	EClass getAnnouncementStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.AnnouncementStructure#getAnnouncementRef <em>Announcement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Announcement Ref</em>'.
	 * @see de.jena.mdo.ibis.common.AnnouncementStructure#getAnnouncementRef()
	 * @see #getAnnouncementStructure()
	 * @generated
	 */
	EReference getAnnouncementStructure_AnnouncementRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.AnnouncementStructure#getAnnouncementText <em>Announcement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement Text</em>'.
	 * @see de.jena.mdo.ibis.common.AnnouncementStructure#getAnnouncementText()
	 * @see #getAnnouncementStructure()
	 * @generated
	 */
	EReference getAnnouncementStructure_AnnouncementText();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.AnnouncementStructure#getAnnouncementTTSText <em>Announcement TTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement TTS Text</em>'.
	 * @see de.jena.mdo.ibis.common.AnnouncementStructure#getAnnouncementTTSText()
	 * @see #getAnnouncementStructure()
	 * @generated
	 */
	EReference getAnnouncementStructure_AnnouncementTTSText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.BayAreaStructure <em>Bay Area Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bay Area Structure</em>'.
	 * @see de.jena.mdo.ibis.common.BayAreaStructure
	 * @generated
	 */
	EClass getBayAreaStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.BayAreaStructure#getBeforeBay <em>Before Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before Bay</em>'.
	 * @see de.jena.mdo.ibis.common.BayAreaStructure#getBeforeBay()
	 * @see #getBayAreaStructure()
	 * @generated
	 */
	EReference getBayAreaStructure_BeforeBay();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.BayAreaStructure#getBehindBay <em>Behind Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behind Bay</em>'.
	 * @see de.jena.mdo.ibis.common.BayAreaStructure#getBehindBay()
	 * @see #getBayAreaStructure()
	 * @generated
	 */
	EReference getBayAreaStructure_BehindBay();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.BeaconPointStructure <em>Beacon Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beacon Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.BeaconPointStructure
	 * @generated
	 */
	EClass getBeaconPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.BeaconPointStructure#getPointRef <em>Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Ref</em>'.
	 * @see de.jena.mdo.ibis.common.BeaconPointStructure#getPointRef()
	 * @see #getBeaconPointStructure()
	 * @generated
	 */
	EReference getBeaconPointStructure_PointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.BeaconPointStructure#getBeaconCode <em>Beacon Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beacon Code</em>'.
	 * @see de.jena.mdo.ibis.common.BeaconPointStructure#getBeaconCode()
	 * @see #getBeaconPointStructure()
	 * @generated
	 */
	EReference getBeaconPointStructure_BeaconCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.BeaconPointStructure#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Name</em>'.
	 * @see de.jena.mdo.ibis.common.BeaconPointStructure#getShortName()
	 * @see #getBeaconPointStructure()
	 * @generated
	 */
	EReference getBeaconPointStructure_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.BeaconPointStructure#getDesciption <em>Desciption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Desciption</em>'.
	 * @see de.jena.mdo.ibis.common.BeaconPointStructure#getDesciption()
	 * @see #getBeaconPointStructure()
	 * @generated
	 */
	EReference getBeaconPointStructure_Desciption();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.CardApplInformations <em>Card Appl Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Appl Informations</em>'.
	 * @see de.jena.mdo.ibis.common.CardApplInformations
	 * @generated
	 */
	EClass getCardApplInformations();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.CardApplInformations#getCardApplInformationLength <em>Card Appl Information Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Appl Information Length</em>'.
	 * @see de.jena.mdo.ibis.common.CardApplInformations#getCardApplInformationLength()
	 * @see #getCardApplInformations()
	 * @generated
	 */
	EReference getCardApplInformations_CardApplInformationLength();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.CardApplInformations#getCardApplInformationData <em>Card Appl Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Appl Information Data</em>'.
	 * @see de.jena.mdo.ibis.common.CardApplInformations#getCardApplInformationData()
	 * @see #getCardApplInformations()
	 * @generated
	 */
	EReference getCardApplInformations_CardApplInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.CardTicketData <em>Card Ticket Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Ticket Data</em>'.
	 * @see de.jena.mdo.ibis.common.CardTicketData
	 * @generated
	 */
	EClass getCardTicketData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.CardTicketData#getCardTicketDataID <em>Card Ticket Data ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Ticket Data ID</em>'.
	 * @see de.jena.mdo.ibis.common.CardTicketData#getCardTicketDataID()
	 * @see #getCardTicketData()
	 * @generated
	 */
	EReference getCardTicketData_CardTicketDataID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.CardTicketData#getCardTicketDataLength <em>Card Ticket Data Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Ticket Data Length</em>'.
	 * @see de.jena.mdo.ibis.common.CardTicketData#getCardTicketDataLength()
	 * @see #getCardTicketData()
	 * @generated
	 */
	EReference getCardTicketData_CardTicketDataLength();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.CardTicketData#getCardTicketData <em>Card Ticket Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Ticket Data</em>'.
	 * @see de.jena.mdo.ibis.common.CardTicketData#getCardTicketData()
	 * @see #getCardTicketData()
	 * @generated
	 */
	EReference getCardTicketData_CardTicketData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Type</em>'.
	 * @see de.jena.mdo.ibis.common.CardType
	 * @generated
	 */
	EClass getCardType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.CardType#getCardSerialNumber <em>Card Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Serial Number</em>'.
	 * @see de.jena.mdo.ibis.common.CardType#getCardSerialNumber()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_CardSerialNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.CardType#getCardTypeID <em>Card Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Type ID</em>'.
	 * @see de.jena.mdo.ibis.common.CardType#getCardTypeID()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_CardTypeID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.CardType#getCardTypeText <em>Card Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Type Text</em>'.
	 * @see de.jena.mdo.ibis.common.CardType#getCardTypeText()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_CardTypeText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ConnectionStructure <em>Connection Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure
	 * @generated
	 */
	EClass getConnectionStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getStopRef()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_StopRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionRef <em>Connection Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Ref</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getConnectionRef()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_ConnectionRef();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getConnectionType()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EAttribute getConnectionStructure_ConnectionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getDisplayContent()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_DisplayContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getPlatform()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_Platform();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionState <em>Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection State</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getConnectionState()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EAttribute getConnectionStructure_ConnectionState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getTransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Mode</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getTransportMode()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_TransportMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getConnectionMode <em>Connection Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Mode</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getConnectionMode()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_ConnectionMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getExpectedDepartureTime <em>Expected Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Departure Time</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getExpectedDepartureTime()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_ExpectedDepartureTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ConnectionStructure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduled Departure Time</em>'.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure#getScheduledDepartureTime()
	 * @see #getConnectionStructure()
	 * @generated
	 */
	EReference getConnectionStructure_ScheduledDepartureTime();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure <em>Data Accepted Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Accepted Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure
	 * @generated
	 */
	EClass getDataAcceptedResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getTimeStamp()
	 * @see #getDataAcceptedResponseDataStructure()
	 * @generated
	 */
	EReference getDataAcceptedResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getDataAccepted <em>Data Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Accepted</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getDataAccepted()
	 * @see #getDataAcceptedResponseDataStructure()
	 * @generated
	 */
	EReference getDataAcceptedResponseDataStructure_DataAccepted();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorCode()
	 * @see #getDataAcceptedResponseDataStructure()
	 * @generated
	 */
	EAttribute getDataAcceptedResponseDataStructure_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorInformation <em>Error Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Information</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure#getErrorInformation()
	 * @see #getDataAcceptedResponseDataStructure()
	 * @generated
	 */
	EReference getDataAcceptedResponseDataStructure_ErrorInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure <em>Data Accepted Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Accepted Response Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseStructure
	 * @generated
	 */
	EClass getDataAcceptedResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Accepted Response Data</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getDataAcceptedResponseData()
	 * @see #getDataAcceptedResponseStructure()
	 * @generated
	 */
	EReference getDataAcceptedResponseStructure_DataAcceptedResponseData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseStructure#getOperationErrorMessage()
	 * @see #getDataAcceptedResponseStructure()
	 * @generated
	 */
	EReference getDataAcceptedResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DataVersionListStructure <em>Data Version List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Version List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DataVersionListStructure
	 * @generated
	 */
	EClass getDataVersionListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DataVersionListStructure#getDataVersion <em>Data Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Version</em>'.
	 * @see de.jena.mdo.ibis.common.DataVersionListStructure#getDataVersion()
	 * @see #getDataVersionListStructure()
	 * @generated
	 */
	EReference getDataVersionListStructure_DataVersion();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DataVersionStructure <em>Data Version Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Version Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DataVersionStructure
	 * @generated
	 */
	EClass getDataVersionStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataVersionStructure#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see de.jena.mdo.ibis.common.DataVersionStructure#getDataType()
	 * @see #getDataVersionStructure()
	 * @generated
	 */
	EReference getDataVersionStructure_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DataVersionStructure#getVersionRef <em>Version Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Ref</em>'.
	 * @see de.jena.mdo.ibis.common.DataVersionStructure#getVersionRef()
	 * @see #getDataVersionStructure()
	 * @generated
	 */
	EReference getDataVersionStructure_VersionRef();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DegreeType <em>Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Type</em>'.
	 * @see de.jena.mdo.ibis.common.DegreeType
	 * @generated
	 */
	EClass getDegreeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DegreeType#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degree</em>'.
	 * @see de.jena.mdo.ibis.common.DegreeType#getDegree()
	 * @see #getDegreeType()
	 * @generated
	 */
	EReference getDegreeType_Degree();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DegreeType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see de.jena.mdo.ibis.common.DegreeType#getOrientation()
	 * @see #getDegreeType()
	 * @generated
	 */
	EReference getDegreeType_Orientation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DestinationStructure <em>Destination Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DestinationStructure
	 * @generated
	 */
	EClass getDestinationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DestinationStructure#getDestinationRef <em>Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Ref</em>'.
	 * @see de.jena.mdo.ibis.common.DestinationStructure#getDestinationRef()
	 * @see #getDestinationStructure()
	 * @generated
	 */
	EReference getDestinationStructure_DestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DestinationStructure#getDestinationName <em>Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destination Name</em>'.
	 * @see de.jena.mdo.ibis.common.DestinationStructure#getDestinationName()
	 * @see #getDestinationStructure()
	 * @generated
	 */
	EReference getDestinationStructure_DestinationName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DestinationStructure#getDestinationShortName <em>Destination Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destination Short Name</em>'.
	 * @see de.jena.mdo.ibis.common.DestinationStructure#getDestinationShortName()
	 * @see #getDestinationStructure()
	 * @generated
	 */
	EReference getDestinationStructure_DestinationShortName();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DeviceInformationStructure <em>Device Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure
	 * @generated
	 */
	EClass getDeviceInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Name</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceName()
	 * @see #getDeviceInformationStructure()
	 * @generated
	 */
	EReference getDeviceInformationStructure_DeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure#getManufacturer()
	 * @see #getDeviceInformationStructure()
	 * @generated
	 */
	EReference getDeviceInformationStructure_Manufacturer();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serial Number</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure#getSerialNumber()
	 * @see #getDeviceInformationStructure()
	 * @generated
	 */
	EReference getDeviceInformationStructure_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Class</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceClass()
	 * @see #getDeviceInformationStructure()
	 * @generated
	 */
	EAttribute getDeviceInformationStructure_DeviceClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDataVersionList <em>Data Version List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Version List</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure#getDataVersionList()
	 * @see #getDeviceInformationStructure()
	 * @generated
	 */
	EReference getDeviceInformationStructure_DataVersionList();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getWebInterfaceAddress <em>Web Interface Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Interface Address</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure#getWebInterfaceAddress()
	 * @see #getDeviceInformationStructure()
	 * @generated
	 */
	EReference getDeviceInformationStructure_WebInterfaceAddress();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DeviceSpecificationListStructure <em>Device Specification List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationListStructure
	 * @generated
	 */
	EClass getDeviceSpecificationListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DeviceSpecificationListStructure#getDeviceSpecification <em>Device Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Specification</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationListStructure#getDeviceSpecification()
	 * @see #getDeviceSpecificationListStructure()
	 * @generated
	 */
	EReference getDeviceSpecificationListStructure_DeviceSpecification();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure <em>Device Specification Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationStructure
	 * @generated
	 */
	EClass getDeviceSpecificationStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Class</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceClass()
	 * @see #getDeviceSpecificationStructure()
	 * @generated
	 */
	EAttribute getDeviceSpecificationStructure_DeviceClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device ID</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceID()
	 * @see #getDeviceSpecificationStructure()
	 * @generated
	 */
	EReference getDeviceSpecificationStructure_DeviceID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure <em>Device Specification With State List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification With State List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure
	 * @generated
	 */
	EClass getDeviceSpecificationWithStateListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure#getDeviceSpecificationWithState <em>Device Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Specification With State</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure#getDeviceSpecificationWithState()
	 * @see #getDeviceSpecificationWithStateListStructure()
	 * @generated
	 */
	EReference getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure <em>Device Specification With State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification With State Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure
	 * @generated
	 */
	EClass getDeviceSpecificationWithStateStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure#getDeviceSpecification <em>Device Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Specification</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure#getDeviceSpecification()
	 * @see #getDeviceSpecificationWithStateStructure()
	 * @generated
	 */
	EReference getDeviceSpecificationWithStateStructure_DeviceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device State</em>'.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure#getDeviceState()
	 * @see #getDeviceSpecificationWithStateStructure()
	 * @generated
	 */
	EAttribute getDeviceSpecificationWithStateStructure_DeviceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DisplayContentStructure <em>Display Content Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Content Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure
	 * @generated
	 */
	EClass getDisplayContentStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getDisplayContentRef <em>Display Content Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Content Ref</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getDisplayContentRef()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_DisplayContentRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getLineInformation <em>Line Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Information</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getLineInformation()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_LineInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getDestination()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_Destination();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getViaPoint <em>Via Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Via Point</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getViaPoint()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_ViaPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation1 <em>Additional Information1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information1</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation1()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation2 <em>Additional Information2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information2</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation2()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation3 <em>Additional Information3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information3</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation3()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation3();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation4 <em>Additional Information4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information4</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation4()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation4();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation5 <em>Additional Information5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information5</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation5()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation5();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation6 <em>Additional Information6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information6</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation6()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation6();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation7 <em>Additional Information7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information7</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation7()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation7();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation8 <em>Additional Information8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information8</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation8()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation8();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation9 <em>Additional Information9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information9</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getAdditionalInformation9()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_AdditionalInformation9();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getRunNumber <em>Run Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Number</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getRunNumber()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_RunNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getPriority()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getPeriodDuration <em>Period Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Duration</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getPeriodDuration()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_PeriodDuration();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DisplayContentStructure#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure#getDuration()
	 * @see #getDisplayContentStructure()
	 * @generated
	 */
	EReference getDisplayContentStructure_Duration();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.ibis.common.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.ibis.common.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.ibis.common.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getAirSubmode <em>Air Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getAirSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AirSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getBusSubmode <em>Bus Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getBusSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BusSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getCoachSubmode <em>Coach Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getCoachSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CoachSubmode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DocumentRoot#getDataAcceptedResponse <em>Data Accepted Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Accepted Response</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getDataAcceptedResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataAcceptedResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getFunicularSubmode <em>Funicular Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funicular Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getFunicularSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FunicularSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getMetroSubmode <em>Metro Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metro Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getMetroSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MetroSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getRailSubmode <em>Rail Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rail Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getRailSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RailSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getSelfDriveSubmode <em>Self Drive Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Drive Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getSelfDriveSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelfDriveSubmode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DocumentRoot#getSubscribeRequest <em>Subscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe Request</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getSubscribeRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubscribeRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DocumentRoot#getSubscribeResponse <em>Subscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe Response</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getSubscribeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubscribeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getTaxiSubmode <em>Taxi Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxi Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getTaxiSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxiSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getTelecabinSubmode <em>Telecabin Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecabin Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getTelecabinSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TelecabinSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getTramSubmode <em>Tram Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tram Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getTramSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TramSubmode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeRequest <em>Unsubscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsubscribe Request</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnsubscribeRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeResponse <em>Unsubscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsubscribe Response</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnsubscribeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DocumentRoot#getWaterSubmode <em>Water Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Submode</em>'.
	 * @see de.jena.mdo.ibis.common.DocumentRoot#getWaterSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WaterSubmode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DoorCountingListStructure <em>Door Counting List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Counting List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingListStructure
	 * @generated
	 */
	EClass getDoorCountingListStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorCountingListStructure#getDoorID <em>Door ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Door ID</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingListStructure#getDoorID()
	 * @see #getDoorCountingListStructure()
	 * @generated
	 */
	EReference getDoorCountingListStructure_DoorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DoorCountingListStructure#getCountSet <em>Count Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count Set</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingListStructure#getCountSet()
	 * @see #getDoorCountingListStructure()
	 * @generated
	 */
	EReference getDoorCountingListStructure_CountSet();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DoorCountingStructure <em>Door Counting Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Counting Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingStructure
	 * @generated
	 */
	EClass getDoorCountingStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Class</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingStructure#getObjectClass()
	 * @see #getDoorCountingStructure()
	 * @generated
	 */
	EAttribute getDoorCountingStructure_ObjectClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingStructure#getIn()
	 * @see #getDoorCountingStructure()
	 * @generated
	 */
	EReference getDoorCountingStructure_In();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingStructure#getOut()
	 * @see #getDoorCountingStructure()
	 * @generated
	 */
	EReference getDoorCountingStructure_Out();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DoorCountingStructure#getCountQuality <em>Count Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Quality</em>'.
	 * @see de.jena.mdo.ibis.common.DoorCountingStructure#getCountQuality()
	 * @see #getDoorCountingStructure()
	 * @generated
	 */
	EAttribute getDoorCountingStructure_CountQuality();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DoorInformationStructure <em>Door Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DoorInformationStructure
	 * @generated
	 */
	EClass getDoorInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorInformationStructure#getDoorID <em>Door ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Door ID</em>'.
	 * @see de.jena.mdo.ibis.common.DoorInformationStructure#getDoorID()
	 * @see #getDoorInformationStructure()
	 * @generated
	 */
	EReference getDoorInformationStructure_DoorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.DoorInformationStructure#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count</em>'.
	 * @see de.jena.mdo.ibis.common.DoorInformationStructure#getCount()
	 * @see #getDoorInformationStructure()
	 * @generated
	 */
	EReference getDoorInformationStructure_Count();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorInformationStructure#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see de.jena.mdo.ibis.common.DoorInformationStructure#getState()
	 * @see #getDoorInformationStructure()
	 * @generated
	 */
	EReference getDoorInformationStructure_State();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DoorOpenStateStructure <em>Door Open State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Open State Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DoorOpenStateStructure
	 * @generated
	 */
	EClass getDoorOpenStateStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DoorOpenStateStructure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.DoorOpenStateStructure#getValue()
	 * @see #getDoorOpenStateStructure()
	 * @generated
	 */
	EAttribute getDoorOpenStateStructure_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DoorOpenStateStructure#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.DoorOpenStateStructure#getErrorCode()
	 * @see #getDoorOpenStateStructure()
	 * @generated
	 */
	EAttribute getDoorOpenStateStructure_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DoorOperationStateStructure <em>Door Operation State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Operation State Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DoorOperationStateStructure
	 * @generated
	 */
	EClass getDoorOperationStateStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DoorOperationStateStructure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.DoorOperationStateStructure#getValue()
	 * @see #getDoorOperationStateStructure()
	 * @generated
	 */
	EAttribute getDoorOperationStateStructure_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.DoorOperationStateStructure#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.DoorOperationStateStructure#getErrorCode()
	 * @see #getDoorOperationStateStructure()
	 * @generated
	 */
	EAttribute getDoorOperationStateStructure_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.DoorStateStructure <em>Door State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door State Structure</em>'.
	 * @see de.jena.mdo.ibis.common.DoorStateStructure
	 * @generated
	 */
	EClass getDoorStateStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorStateStructure#getOpenState <em>Open State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open State</em>'.
	 * @see de.jena.mdo.ibis.common.DoorStateStructure#getOpenState()
	 * @see #getDoorStateStructure()
	 * @generated
	 */
	EReference getDoorStateStructure_OpenState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.DoorStateStructure#getOperationState <em>Operation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation State</em>'.
	 * @see de.jena.mdo.ibis.common.DoorStateStructure#getOperationState()
	 * @see #getDoorStateStructure()
	 * @generated
	 */
	EReference getDoorStateStructure_OperationState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure <em>Fare Zone Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Zone Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.FareZoneInformationStructure
	 * @generated
	 */
	EClass getFareZoneInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneID <em>Fare Zone ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone ID</em>'.
	 * @see de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneID()
	 * @see #getFareZoneInformationStructure()
	 * @generated
	 */
	EReference getFareZoneInformationStructure_FareZoneID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneType <em>Fare Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone Type</em>'.
	 * @see de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneType()
	 * @see #getFareZoneInformationStructure()
	 * @generated
	 */
	EReference getFareZoneInformationStructure_FareZoneType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneLongName <em>Fare Zone Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone Long Name</em>'.
	 * @see de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneLongName()
	 * @see #getFareZoneInformationStructure()
	 * @generated
	 */
	EReference getFareZoneInformationStructure_FareZoneLongName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneShortName <em>Fare Zone Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone Short Name</em>'.
	 * @see de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneShortName()
	 * @see #getFareZoneInformationStructure()
	 * @generated
	 */
	EReference getFareZoneInformationStructure_FareZoneShortName();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.GlobalCardStatus <em>Global Card Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Card Status</em>'.
	 * @see de.jena.mdo.ibis.common.GlobalCardStatus
	 * @generated
	 */
	EClass getGlobalCardStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GlobalCardStatus#getGlobalCardStausID <em>Global Card Staus ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Card Staus ID</em>'.
	 * @see de.jena.mdo.ibis.common.GlobalCardStatus#getGlobalCardStausID()
	 * @see #getGlobalCardStatus()
	 * @generated
	 */
	EReference getGlobalCardStatus_GlobalCardStausID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.GlobalCardStatus#getGlobalCardStatusText <em>Global Card Status Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Card Status Text</em>'.
	 * @see de.jena.mdo.ibis.common.GlobalCardStatus#getGlobalCardStatusText()
	 * @see #getGlobalCardStatus()
	 * @generated
	 */
	EReference getGlobalCardStatus_GlobalCardStatusText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure <em>GNSS Coordinate Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS Coordinate Structure</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSCoordinateStructure
	 * @generated
	 */
	EClass getGNSSCoordinateStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degree</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDegree()
	 * @see #getGNSSCoordinateStructure()
	 * @generated
	 */
	EReference getGNSSCoordinateStructure_Degree();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDirection()
	 * @see #getGNSSCoordinateStructure()
	 * @generated
	 */
	EReference getGNSSCoordinateStructure_Direction();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.GNSSPointStructure <em>GNSS Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSPointStructure
	 * @generated
	 */
	EClass getGNSSPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getPointRef <em>Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Ref</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSPointStructure#getPointRef()
	 * @see #getGNSSPointStructure()
	 * @generated
	 */
	EReference getGNSSPointStructure_PointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longitude</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSPointStructure#getLongitude()
	 * @see #getGNSSPointStructure()
	 * @generated
	 */
	EReference getGNSSPointStructure_Longitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latitude</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSPointStructure#getLatitude()
	 * @see #getGNSSPointStructure()
	 * @generated
	 */
	EReference getGNSSPointStructure_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude</em>'.
	 * @see de.jena.mdo.ibis.common.GNSSPointStructure#getAltitude()
	 * @see #getGNSSPointStructure()
	 * @generated
	 */
	EReference getGNSSPointStructure_Altitude();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPAnyURI <em>IBISIP Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Any URI</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPAnyURI
	 * @generated
	 */
	EClass getIBISIPAnyURI();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPAnyURI#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPAnyURI#getValue()
	 * @see #getIBISIPAnyURI()
	 * @generated
	 */
	EAttribute getIBISIPAnyURI_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPAnyURI#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPAnyURI#getErrorCode()
	 * @see #getIBISIPAnyURI()
	 * @generated
	 */
	EAttribute getIBISIPAnyURI_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPBoolean <em>IBISIP Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Boolean</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPBoolean
	 * @generated
	 */
	EClass getIBISIPBoolean();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPBoolean#isValue()
	 * @see #getIBISIPBoolean()
	 * @generated
	 */
	EAttribute getIBISIPBoolean_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPBoolean#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPBoolean#getErrorCode()
	 * @see #getIBISIPBoolean()
	 * @generated
	 */
	EAttribute getIBISIPBoolean_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPByte <em>IBISIP Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Byte</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPByte
	 * @generated
	 */
	EClass getIBISIPByte();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPByte#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPByte#getValue()
	 * @see #getIBISIPByte()
	 * @generated
	 */
	EAttribute getIBISIPByte_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPByte#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPByte#getErrorCode()
	 * @see #getIBISIPByte()
	 * @generated
	 */
	EAttribute getIBISIPByte_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPDate <em>IBISIP Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Date</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDate
	 * @generated
	 */
	EClass getIBISIPDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDate#getValue()
	 * @see #getIBISIPDate()
	 * @generated
	 */
	EAttribute getIBISIPDate_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDate#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDate#getErrorCode()
	 * @see #getIBISIPDate()
	 * @generated
	 */
	EAttribute getIBISIPDate_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPDateTime <em>IBISIP Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Date Time</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDateTime
	 * @generated
	 */
	EClass getIBISIPDateTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDateTime#getValue()
	 * @see #getIBISIPDateTime()
	 * @generated
	 */
	EAttribute getIBISIPDateTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDateTime#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDateTime#getErrorCode()
	 * @see #getIBISIPDateTime()
	 * @generated
	 */
	EAttribute getIBISIPDateTime_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPDouble <em>IBISIP Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Double</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDouble
	 * @generated
	 */
	EClass getIBISIPDouble();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDouble#getValue()
	 * @see #getIBISIPDouble()
	 * @generated
	 */
	EAttribute getIBISIPDouble_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDouble#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDouble#getErrorCode()
	 * @see #getIBISIPDouble()
	 * @generated
	 */
	EAttribute getIBISIPDouble_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPDuration <em>IBISIP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Duration</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDuration
	 * @generated
	 */
	EClass getIBISIPDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDuration#getValue()
	 * @see #getIBISIPDuration()
	 * @generated
	 */
	EAttribute getIBISIPDuration_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPDuration#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPDuration#getErrorCode()
	 * @see #getIBISIPDuration()
	 * @generated
	 */
	EAttribute getIBISIPDuration_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPInt <em>IBISIP Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Int</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPInt
	 * @generated
	 */
	EClass getIBISIPInt();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPInt#getValue()
	 * @see #getIBISIPInt()
	 * @generated
	 */
	EAttribute getIBISIPInt_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPInt#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPInt#getErrorCode()
	 * @see #getIBISIPInt()
	 * @generated
	 */
	EAttribute getIBISIPInt_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPLanguage <em>IBISIP Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Language</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPLanguage
	 * @generated
	 */
	EClass getIBISIPLanguage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPLanguage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPLanguage#getValue()
	 * @see #getIBISIPLanguage()
	 * @generated
	 */
	EAttribute getIBISIPLanguage_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPLanguage#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPLanguage#getErrorCode()
	 * @see #getIBISIPLanguage()
	 * @generated
	 */
	EAttribute getIBISIPLanguage_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPNMTOKEN <em>IBISIPNMTOKEN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIPNMTOKEN</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNMTOKEN
	 * @generated
	 */
	EClass getIBISIPNMTOKEN();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPNMTOKEN#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNMTOKEN#getValue()
	 * @see #getIBISIPNMTOKEN()
	 * @generated
	 */
	EAttribute getIBISIPNMTOKEN_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPNMTOKEN#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNMTOKEN#getErrorCode()
	 * @see #getIBISIPNMTOKEN()
	 * @generated
	 */
	EAttribute getIBISIPNMTOKEN_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPNonNegativeInteger <em>IBISIP Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Non Negative Integer</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNonNegativeInteger
	 * @generated
	 */
	EClass getIBISIPNonNegativeInteger();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPNonNegativeInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNonNegativeInteger#getValue()
	 * @see #getIBISIPNonNegativeInteger()
	 * @generated
	 */
	EAttribute getIBISIPNonNegativeInteger_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPNonNegativeInteger#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNonNegativeInteger#getErrorCode()
	 * @see #getIBISIPNonNegativeInteger()
	 * @generated
	 */
	EAttribute getIBISIPNonNegativeInteger_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPNormalizedString <em>IBISIP Normalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Normalized String</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNormalizedString
	 * @generated
	 */
	EClass getIBISIPNormalizedString();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPNormalizedString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNormalizedString#getValue()
	 * @see #getIBISIPNormalizedString()
	 * @generated
	 */
	EAttribute getIBISIPNormalizedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPNormalizedString#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPNormalizedString#getErrorCode()
	 * @see #getIBISIPNormalizedString()
	 * @generated
	 */
	EAttribute getIBISIPNormalizedString_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPString <em>IBISIP String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP String</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPString
	 * @generated
	 */
	EClass getIBISIPString();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPString#getValue()
	 * @see #getIBISIPString()
	 * @generated
	 */
	EAttribute getIBISIPString_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPString#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPString#getErrorCode()
	 * @see #getIBISIPString()
	 * @generated
	 */
	EAttribute getIBISIPString_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPTime <em>IBISIP Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Time</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPTime
	 * @generated
	 */
	EClass getIBISIPTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPTime#getValue()
	 * @see #getIBISIPTime()
	 * @generated
	 */
	EAttribute getIBISIPTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPTime#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPTime#getErrorCode()
	 * @see #getIBISIPTime()
	 * @generated
	 */
	EAttribute getIBISIPTime_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPUnsignedInt <em>IBISIP Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Unsigned Int</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedInt
	 * @generated
	 */
	EClass getIBISIPUnsignedInt();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPUnsignedInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedInt#getValue()
	 * @see #getIBISIPUnsignedInt()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedInt_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPUnsignedInt#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedInt#getErrorCode()
	 * @see #getIBISIPUnsignedInt()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedInt_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.IBISIPUnsignedLong <em>IBISIP Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Unsigned Long</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedLong
	 * @generated
	 */
	EClass getIBISIPUnsignedLong();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPUnsignedLong#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedLong#getValue()
	 * @see #getIBISIPUnsignedLong()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedLong_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.IBISIPUnsignedLong#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedLong#getErrorCode()
	 * @see #getIBISIPUnsignedLong()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedLong_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.InternationalTextType <em>International Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International Text Type</em>'.
	 * @see de.jena.mdo.ibis.common.InternationalTextType
	 * @generated
	 */
	EClass getInternationalTextType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.InternationalTextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.common.InternationalTextType#getValue()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EAttribute getInternationalTextType_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.InternationalTextType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.jena.mdo.ibis.common.InternationalTextType#getLanguage()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EAttribute getInternationalTextType_Language();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.InternationalTextType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.common.InternationalTextType#getErrorCode()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EAttribute getInternationalTextType_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure <em>Journey Stop Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Stop Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure
	 * @generated
	 */
	EClass getJourneyStopInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopRef()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_StopRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopName <em>Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Name</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopName()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_StopName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopAlternativeName <em>Stop Alternative Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Alternative Name</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getStopAlternativeName()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_StopAlternativeName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getPlatform()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDisplayContent()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_DisplayContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getAnnouncement <em>Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Announcement</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getAnnouncement()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_Announcement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getArrivalScheduled <em>Arrival Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Scheduled</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getArrivalScheduled()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_ArrivalScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDepartureScheduled <em>Departure Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Scheduled</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getDepartureScheduled()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_DepartureScheduled();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getConnection()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getBayArea <em>Bay Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bay Area</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getBayArea()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_BayArea();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getGNSSPoint <em>GNSS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GNSS Point</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getGNSSPoint()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_GNSSPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure#getFareZone <em>Fare Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone</em>'.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure#getFareZone()
	 * @see #getJourneyStopInformationStructure()
	 * @generated
	 */
	EReference getJourneyStopInformationStructure_FareZone();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.LineInformationStructure <em>Line Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure
	 * @generated
	 */
	EClass getLineInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.LineInformationStructure#getLineRef <em>Line Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Ref</em>'.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure#getLineRef()
	 * @see #getLineInformationStructure()
	 * @generated
	 */
	EReference getLineInformationStructure_LineRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.LineInformationStructure#getLineName <em>Line Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Name</em>'.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure#getLineName()
	 * @see #getLineInformationStructure()
	 * @generated
	 */
	EReference getLineInformationStructure_LineName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.LineInformationStructure#getLineShortName <em>Line Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Short Name</em>'.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure#getLineShortName()
	 * @see #getLineInformationStructure()
	 * @generated
	 */
	EReference getLineInformationStructure_LineShortName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.LineInformationStructure#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Number</em>'.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure#getLineNumber()
	 * @see #getLineInformationStructure()
	 * @generated
	 */
	EReference getLineInformationStructure_LineNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.LineInformationStructure#getLineCode <em>Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Code</em>'.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure#getLineCode()
	 * @see #getLineInformationStructure()
	 * @generated
	 */
	EReference getLineInformationStructure_LineCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.LogMessageStructure <em>Log Message Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message Structure</em>'.
	 * @see de.jena.mdo.ibis.common.LogMessageStructure
	 * @generated
	 */
	EClass getLogMessageStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.LogMessageStructure#getMessageProvider <em>Message Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Provider</em>'.
	 * @see de.jena.mdo.ibis.common.LogMessageStructure#getMessageProvider()
	 * @see #getLogMessageStructure()
	 * @generated
	 */
	EReference getLogMessageStructure_MessageProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.LogMessageStructure#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.jena.mdo.ibis.common.LogMessageStructure#getMessage()
	 * @see #getLogMessageStructure()
	 * @generated
	 */
	EReference getLogMessageStructure_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.MessageStructure <em>Message Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Structure</em>'.
	 * @see de.jena.mdo.ibis.common.MessageStructure
	 * @generated
	 */
	EClass getMessageStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.MessageStructure#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message ID</em>'.
	 * @see de.jena.mdo.ibis.common.MessageStructure#getMessageID()
	 * @see #getMessageStructure()
	 * @generated
	 */
	EReference getMessageStructure_MessageID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.MessageStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.common.MessageStructure#getTimeStamp()
	 * @see #getMessageStructure()
	 * @generated
	 */
	EReference getMessageStructure_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.MessageStructure#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see de.jena.mdo.ibis.common.MessageStructure#getMessageType()
	 * @see #getMessageStructure()
	 * @generated
	 */
	EAttribute getMessageStructure_MessageType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.MessageStructure#getMessageText <em>Message Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Text</em>'.
	 * @see de.jena.mdo.ibis.common.MessageStructure#getMessageText()
	 * @see #getMessageStructure()
	 * @generated
	 */
	EReference getMessageStructure_MessageText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.NetexMode <em>Netex Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netex Mode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode
	 * @generated
	 */
	EClass getNetexMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getPtMainMode <em>Pt Main Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Main Mode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getPtMainMode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_PtMainMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getPrivateMainMode <em>Private Main Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Main Mode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getPrivateMainMode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_PrivateMainMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getAirSubmode <em>Air Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getAirSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_AirSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getBusSubmode <em>Bus Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getBusSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_BusSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getCoachSubmode <em>Coach Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getCoachSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_CoachSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getFunicularSubmode <em>Funicular Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funicular Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getFunicularSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_FunicularSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getMetroSubmode <em>Metro Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metro Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getMetroSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_MetroSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getTramSubmode <em>Tram Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tram Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getTramSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_TramSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getTelecabinSubmode <em>Telecabin Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecabin Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getTelecabinSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_TelecabinSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getRailSubmode <em>Rail Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rail Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getRailSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_RailSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getWaterSubmode <em>Water Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getWaterSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_WaterSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getTaxiSubmode <em>Taxi Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxi Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getTaxiSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_TaxiSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.NetexMode#getSelfDriveSubmode <em>Self Drive Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Drive Submode</em>'.
	 * @see de.jena.mdo.ibis.common.NetexMode#getSelfDriveSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_SelfDriveSubmode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.PointSequenceStructure <em>Point Sequence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Sequence Structure</em>'.
	 * @see de.jena.mdo.ibis.common.PointSequenceStructure
	 * @generated
	 */
	EClass getPointSequenceStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.PointSequenceStructure#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointSequenceStructure#getPoint()
	 * @see #getPointSequenceStructure()
	 * @generated
	 */
	EReference getPointSequenceStructure_Point();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.PointStructure <em>Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.PointStructure
	 * @generated
	 */
	EClass getPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointStructure#getPointIndex <em>Point Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Index</em>'.
	 * @see de.jena.mdo.ibis.common.PointStructure#getPointIndex()
	 * @see #getPointStructure()
	 * @generated
	 */
	EReference getPointStructure_PointIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointStructure#getPointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Type</em>'.
	 * @see de.jena.mdo.ibis.common.PointStructure#getPointType()
	 * @see #getPointStructure()
	 * @generated
	 */
	EReference getPointStructure_PointType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointStructure#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Previous Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointStructure#getDistanceToPreviousPoint()
	 * @see #getPointStructure()
	 * @generated
	 */
	EReference getPointStructure_DistanceToPreviousPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.PointTypeStructure <em>Point Type Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type Structure</em>'.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure
	 * @generated
	 */
	EClass getPointTypeStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointTypeStructure#getStopPoint <em>Stop Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure#getStopPoint()
	 * @see #getPointTypeStructure()
	 * @generated
	 */
	EReference getPointTypeStructure_StopPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointTypeStructure#getBeaconPoint <em>Beacon Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beacon Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure#getBeaconPoint()
	 * @see #getPointTypeStructure()
	 * @generated
	 */
	EReference getPointTypeStructure_BeaconPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointTypeStructure#getGNSSLocationPoint <em>GNSS Location Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GNSS Location Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure#getGNSSLocationPoint()
	 * @see #getPointTypeStructure()
	 * @generated
	 */
	EReference getPointTypeStructure_GNSSLocationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointTypeStructure#getTimingPoint <em>Timing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure#getTimingPoint()
	 * @see #getPointTypeStructure()
	 * @generated
	 */
	EReference getPointTypeStructure_TimingPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.PointTypeStructure#getTSPPoint <em>TSP Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TSP Point</em>'.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure#getTSPPoint()
	 * @see #getPointTypeStructure()
	 * @generated
	 */
	EReference getPointTypeStructure_TSPPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceIdentificationStructure <em>Service Identification Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationStructure
	 * @generated
	 */
	EClass getServiceIdentificationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceIdentificationStructure#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationStructure#getService()
	 * @see #getServiceIdentificationStructure()
	 * @generated
	 */
	EReference getServiceIdentificationStructure_Service();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceIdentificationStructure#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationStructure#getDevice()
	 * @see #getServiceIdentificationStructure()
	 * @generated
	 */
	EReference getServiceIdentificationStructure_Device();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure <em>Service Identification With State List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification With State List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure
	 * @generated
	 */
	EClass getServiceIdentificationWithStateListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure#getServiceIdentificationWithState <em>Service Identification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Identification With State</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure#getServiceIdentificationWithState()
	 * @see #getServiceIdentificationWithStateListStructure()
	 * @generated
	 */
	EReference getServiceIdentificationWithStateListStructure_ServiceIdentificationWithState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure <em>Service Identification With State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification With State Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure
	 * @generated
	 */
	EClass getServiceIdentificationWithStateStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceIdentification()
	 * @see #getServiceIdentificationWithStateStructure()
	 * @generated
	 */
	EReference getServiceIdentificationWithStateStructure_ServiceIdentification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceState <em>Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service State</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceState()
	 * @see #getServiceIdentificationWithStateStructure()
	 * @generated
	 */
	EAttribute getServiceIdentificationWithStateStructure_ServiceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceInformationListStructure <em>Service Information List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Information List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceInformationListStructure
	 * @generated
	 */
	EClass getServiceInformationListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ServiceInformationListStructure#getServiceInformation <em>Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Information</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceInformationListStructure#getServiceInformation()
	 * @see #getServiceInformationListStructure()
	 * @generated
	 */
	EReference getServiceInformationListStructure_ServiceInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceInformationStructure <em>Service Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceInformationStructure
	 * @generated
	 */
	EClass getServiceInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceInformationStructure#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceInformationStructure#getService()
	 * @see #getServiceInformationStructure()
	 * @generated
	 */
	EReference getServiceInformationStructure_Service();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceInformationStructure#getAutostart <em>Autostart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autostart</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceInformationStructure#getAutostart()
	 * @see #getServiceInformationStructure()
	 * @generated
	 */
	EReference getServiceInformationStructure_Autostart();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure <em>Service Specification Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationStructure
	 * @generated
	 */
	EClass getServiceSpecificationStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationStructure#getServiceName()
	 * @see #getServiceSpecificationStructure()
	 * @generated
	 */
	EAttribute getServiceSpecificationStructure_ServiceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getIBISIPVersion <em>IBISIP Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IBISIP Version</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationStructure#getIBISIPVersion()
	 * @see #getServiceSpecificationStructure()
	 * @generated
	 */
	EReference getServiceSpecificationStructure_IBISIPVersion();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure <em>Service Specification With State List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification With State List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure
	 * @generated
	 */
	EClass getServiceSpecificationWithStateListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure#getServiceSpecificationWithState <em>Service Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Specification With State</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure#getServiceSpecificationWithState()
	 * @see #getServiceSpecificationWithStateListStructure()
	 * @generated
	 */
	EReference getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure <em>Service Specification With State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification With State Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure
	 * @generated
	 */
	EClass getServiceSpecificationWithStateStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceSpecification <em>Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Specification</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceSpecification()
	 * @see #getServiceSpecificationWithStateStructure()
	 * @generated
	 */
	EReference getServiceSpecificationWithStateStructure_ServiceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceState <em>Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service State</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceState()
	 * @see #getServiceSpecificationWithStateStructure()
	 * @generated
	 */
	EAttribute getServiceSpecificationWithStateStructure_ServiceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceStartListStructure <em>Service Start List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Start List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceStartListStructure
	 * @generated
	 */
	EClass getServiceStartListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ServiceStartListStructure#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceStartListStructure#getServiceIdentification()
	 * @see #getServiceStartListStructure()
	 * @generated
	 */
	EReference getServiceStartListStructure_ServiceIdentification();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ServiceStartStructure <em>Service Start Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Start Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceStartStructure
	 * @generated
	 */
	EClass getServiceStartStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceStartStructure#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceStartStructure#getServiceIdentification()
	 * @see #getServiceStartStructure()
	 * @generated
	 */
	EReference getServiceStartStructure_ServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ServiceStartStructure#getAutostart <em>Autostart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autostart</em>'.
	 * @see de.jena.mdo.ibis.common.ServiceStartStructure#getAutostart()
	 * @see #getServiceStartStructure()
	 * @generated
	 */
	EReference getServiceStartStructure_Autostart();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ShortTripStopListStructure <em>Short Trip Stop List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Trip Stop List Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ShortTripStopListStructure
	 * @generated
	 */
	EClass getShortTripStopListStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ShortTripStopListStructure#getShortTripStop <em>Short Trip Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Trip Stop</em>'.
	 * @see de.jena.mdo.ibis.common.ShortTripStopListStructure#getShortTripStop()
	 * @see #getShortTripStopListStructure()
	 * @generated
	 */
	EReference getShortTripStopListStructure_ShortTripStop();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ShortTripStopStructure <em>Short Trip Stop Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Trip Stop Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ShortTripStopStructure
	 * @generated
	 */
	EClass getShortTripStopStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ShortTripStopStructure#getJourneyStopInformation <em>Journey Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journey Stop Information</em>'.
	 * @see de.jena.mdo.ibis.common.ShortTripStopStructure#getJourneyStopInformation()
	 * @see #getShortTripStopStructure()
	 * @generated
	 */
	EReference getShortTripStopStructure_JourneyStopInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ShortTripStopStructure#getFareZoneInformation <em>Fare Zone Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone Information</em>'.
	 * @see de.jena.mdo.ibis.common.ShortTripStopStructure#getFareZoneInformation()
	 * @see #getShortTripStopStructure()
	 * @generated
	 */
	EReference getShortTripStopStructure_FareZoneInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.SpecificPointStructure <em>Specific Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.SpecificPointStructure
	 * @generated
	 */
	EClass getSpecificPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SpecificPointStructure#getPointRef <em>Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Ref</em>'.
	 * @see de.jena.mdo.ibis.common.SpecificPointStructure#getPointRef()
	 * @see #getSpecificPointStructure()
	 * @generated
	 */
	EReference getSpecificPointStructure_PointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SpecificPointStructure#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Previous Point</em>'.
	 * @see de.jena.mdo.ibis.common.SpecificPointStructure#getDistanceToPreviousPoint()
	 * @see #getSpecificPointStructure()
	 * @generated
	 */
	EReference getSpecificPointStructure_DistanceToPreviousPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure <em>Stop Information Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Information Request Structure</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure
	 * @generated
	 */
	EClass getStopInformationRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopIndex <em>Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Index</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopIndex()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_StopIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopRef()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_StopRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopName <em>Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Name</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopName()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_StopName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getDisplayContent()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_DisplayContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopAnnouncement <em>Stop Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Announcement</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getStopAnnouncement()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_StopAnnouncement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getArrivalScheduled <em>Arrival Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Scheduled</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getArrivalScheduled()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_ArrivalScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getDepartureScheduled <em>Departure Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Scheduled</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getDepartureScheduled()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_DepartureScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getRecordedArrivalTime <em>Recorded Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorded Arrival Time</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getRecordedArrivalTime()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_RecordedArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getDistanceToNextStop <em>Distance To Next Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Next Stop</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getDistanceToNextStop()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_DistanceToNextStop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getConnection()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure#getFareZone <em>Fare Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure#getFareZone()
	 * @see #getStopInformationRequestStructure()
	 * @generated
	 */
	EReference getStopInformationRequestStructure_FareZone();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.StopInformationStructure <em>Stop Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure
	 * @generated
	 */
	EClass getStopInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopIndex <em>Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Index</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getStopIndex()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_StopIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getStopRef()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_StopRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopName <em>Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Name</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getStopName()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_StopName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopAlternativeName <em>Stop Alternative Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Alternative Name</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getStopAlternativeName()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_StopAlternativeName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getPlatform()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getDisplayContent()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_DisplayContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationStructure#getStopAnnouncement <em>Stop Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Announcement</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getStopAnnouncement()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_StopAnnouncement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getArrivalScheduled <em>Arrival Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Scheduled</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getArrivalScheduled()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_ArrivalScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getArrivalExpected <em>Arrival Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Expected</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getArrivalExpected()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_ArrivalExpected();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDepartureScheduled <em>Departure Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Scheduled</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getDepartureScheduled()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_DepartureScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDepartureExpected <em>Departure Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Expected</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getDepartureExpected()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_DepartureExpected();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getRecordedArrivalTime <em>Recorded Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorded Arrival Time</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getRecordedArrivalTime()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_RecordedArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopInformationStructure#getDistanceToNextStop <em>Distance To Next Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Next Stop</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getDistanceToNextStop()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_DistanceToNextStop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationStructure#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getConnection()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopInformationStructure#getFareZone <em>Fare Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone</em>'.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure#getFareZone()
	 * @see #getStopInformationStructure()
	 * @generated
	 */
	EReference getStopInformationStructure_FareZone();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.StopPointTariffInformationStructure <em>Stop Point Tariff Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Point Tariff Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.StopPointTariffInformationStructure
	 * @generated
	 */
	EClass getStopPointTariffInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopPointTariffInformationStructure#getJourneyStopInformation <em>Journey Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journey Stop Information</em>'.
	 * @see de.jena.mdo.ibis.common.StopPointTariffInformationStructure#getJourneyStopInformation()
	 * @see #getStopPointTariffInformationStructure()
	 * @generated
	 */
	EReference getStopPointTariffInformationStructure_JourneyStopInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.StopPointTariffInformationStructure#getFareZoneInformation <em>Fare Zone Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone Information</em>'.
	 * @see de.jena.mdo.ibis.common.StopPointTariffInformationStructure#getFareZoneInformation()
	 * @see #getStopPointTariffInformationStructure()
	 * @generated
	 */
	EReference getStopPointTariffInformationStructure_FareZoneInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.StopSequenceStructure <em>Stop Sequence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Sequence Structure</em>'.
	 * @see de.jena.mdo.ibis.common.StopSequenceStructure
	 * @generated
	 */
	EClass getStopSequenceStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.StopSequenceStructure#getStopPoint <em>Stop Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Point</em>'.
	 * @see de.jena.mdo.ibis.common.StopSequenceStructure#getStopPoint()
	 * @see #getStopSequenceStructure()
	 * @generated
	 */
	EReference getStopSequenceStructure_StopPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.SubscribeRequestStructure <em>Subscribe Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe Request Structure</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeRequestStructure
	 * @generated
	 */
	EClass getSubscribeRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SubscribeRequestStructure#getClientIPAddress <em>Client IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client IP Address</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeRequestStructure#getClientIPAddress()
	 * @see #getSubscribeRequestStructure()
	 * @generated
	 */
	EReference getSubscribeRequestStructure_ClientIPAddress();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SubscribeRequestStructure#getReplyPort <em>Reply Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Port</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeRequestStructure#getReplyPort()
	 * @see #getSubscribeRequestStructure()
	 * @generated
	 */
	EReference getSubscribeRequestStructure_ReplyPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SubscribeRequestStructure#getReplyPath <em>Reply Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Path</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeRequestStructure#getReplyPath()
	 * @see #getSubscribeRequestStructure()
	 * @generated
	 */
	EReference getSubscribeRequestStructure_ReplyPath();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.SubscribeResponseStructure <em>Subscribe Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe Response Structure</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeResponseStructure
	 * @generated
	 */
	EClass getSubscribeResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SubscribeResponseStructure#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeResponseStructure#getActive()
	 * @see #getSubscribeResponseStructure()
	 * @generated
	 */
	EReference getSubscribeResponseStructure_Active();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SubscribeResponseStructure#getHeartbeat <em>Heartbeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heartbeat</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeResponseStructure#getHeartbeat()
	 * @see #getSubscribeResponseStructure()
	 * @generated
	 */
	EReference getSubscribeResponseStructure_Heartbeat();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.SubscribeResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.common.SubscribeResponseStructure#getOperationErrorMessage()
	 * @see #getSubscribeResponseStructure()
	 * @generated
	 */
	EReference getSubscribeResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.TimingPointStructure <em>Timing Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.TimingPointStructure
	 * @generated
	 */
	EClass getTimingPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TimingPointStructure#getTimingPointRef <em>Timing Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Point Ref</em>'.
	 * @see de.jena.mdo.ibis.common.TimingPointStructure#getTimingPointRef()
	 * @see #getTimingPointStructure()
	 * @generated
	 */
	EReference getTimingPointStructure_TimingPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TimingPointStructure#getScheduleTime <em>Schedule Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule Time</em>'.
	 * @see de.jena.mdo.ibis.common.TimingPointStructure#getScheduleTime()
	 * @see #getTimingPointStructure()
	 * @generated
	 */
	EReference getTimingPointStructure_ScheduleTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TimingPointStructure#getGNSSPoint <em>GNSS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GNSS Point</em>'.
	 * @see de.jena.mdo.ibis.common.TimingPointStructure#getGNSSPoint()
	 * @see #getTimingPointStructure()
	 * @generated
	 */
	EReference getTimingPointStructure_GNSSPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.TripInformationStructure <em>Trip Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Information Structure</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure
	 * @generated
	 */
	EClass getTripInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getTripRef <em>Trip Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Ref</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getTripRef()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_TripRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getStopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Sequence</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getStopSequence()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_StopSequence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.TripInformationStructure#getLocationState <em>Location State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location State</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getLocationState()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EAttribute getTripInformationStructure_LocationState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getTimetableDelay <em>Timetable Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timetable Delay</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getTimetableDelay()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_TimetableDelay();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage <em>Additional Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage1 <em>Additional Text Message1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message1</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage1()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage1();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage2 <em>Additional Text Message2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message2</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage2()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage2();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage3 <em>Additional Text Message3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message3</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage3()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage4 <em>Additional Text Message4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message4</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage4()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage4();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage5 <em>Additional Text Message5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message5</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage5()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage5();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage6 <em>Additional Text Message6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message6</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage6()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage6();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage7 <em>Additional Text Message7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message7</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage7()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage7();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage8 <em>Additional Text Message8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message8</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage8()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage8();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage9 <em>Additional Text Message9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message9</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalTextMessage9()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalTextMessage9();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalAnnouncement <em>Additional Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Announcement</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getAdditionalAnnouncement()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_AdditionalAnnouncement();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.TripInformationStructure#getRouteDirection <em>Route Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Direction</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getRouteDirection()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EAttribute getTripInformationStructure_RouteDirection();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getRunNumber <em>Run Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Number</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getRunNumber()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_RunNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getPatternNumber <em>Pattern Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern Number</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getPatternNumber()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_PatternNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripInformationStructure#getPathDestinationNumber <em>Path Destination Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Destination Number</em>'.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure#getPathDestinationNumber()
	 * @see #getTripInformationStructure()
	 * @generated
	 */
	EReference getTripInformationStructure_PathDestinationNumber();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.TripSequenceStructure <em>Trip Sequence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Sequence Structure</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure
	 * @generated
	 */
	EClass getTripSequenceStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripRef <em>Trip Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Ref</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure#getTripRef()
	 * @see #getTripSequenceStructure()
	 * @generated
	 */
	EReference getTripSequenceStructure_TripRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripIndex <em>Trip Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Index</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure#getTripIndex()
	 * @see #getTripSequenceStructure()
	 * @generated
	 */
	EReference getTripSequenceStructure_TripIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getTripStart <em>Trip Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Start</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure#getTripStart()
	 * @see #getTripSequenceStructure()
	 * @generated
	 */
	EReference getTripSequenceStructure_TripStart();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure#getCurrentStopIndex()
	 * @see #getTripSequenceStructure()
	 * @generated
	 */
	EReference getTripSequenceStructure_CurrentStopIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getJourneyMode <em>Journey Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Mode</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure#getJourneyMode()
	 * @see #getTripSequenceStructure()
	 * @generated
	 */
	EAttribute getTripSequenceStructure_JourneyMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TripSequenceStructure#getPointSequence <em>Point Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Sequence</em>'.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure#getPointSequence()
	 * @see #getTripSequenceStructure()
	 * @generated
	 */
	EReference getTripSequenceStructure_PointSequence();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.TSPPointStructure <em>TSP Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSP Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.TSPPointStructure
	 * @generated
	 */
	EClass getTSPPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TSPPointStructure#getTSPPointRef <em>TSP Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TSP Point Ref</em>'.
	 * @see de.jena.mdo.ibis.common.TSPPointStructure#getTSPPointRef()
	 * @see #getTSPPointStructure()
	 * @generated
	 */
	EReference getTSPPointStructure_TSPPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.TSPPointStructure#getTSPCode <em>TSP Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TSP Code</em>'.
	 * @see de.jena.mdo.ibis.common.TSPPointStructure#getTSPCode()
	 * @see #getTSPPointStructure()
	 * @generated
	 */
	EReference getTSPPointStructure_TSPCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.TSPPointStructure#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Name</em>'.
	 * @see de.jena.mdo.ibis.common.TSPPointStructure#getShortName()
	 * @see #getTSPPointStructure()
	 * @generated
	 */
	EReference getTSPPointStructure_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.TSPPointStructure#getDesciption <em>Desciption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Desciption</em>'.
	 * @see de.jena.mdo.ibis.common.TSPPointStructure#getDesciption()
	 * @see #getTSPPointStructure()
	 * @generated
	 */
	EReference getTSPPointStructure_Desciption();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.UnsubscribeRequestStructure <em>Unsubscribe Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsubscribe Request Structure</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeRequestStructure
	 * @generated
	 */
	EClass getUnsubscribeRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.UnsubscribeRequestStructure#getClientIPAddress <em>Client IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client IP Address</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeRequestStructure#getClientIPAddress()
	 * @see #getUnsubscribeRequestStructure()
	 * @generated
	 */
	EReference getUnsubscribeRequestStructure_ClientIPAddress();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.UnsubscribeRequestStructure#getReplyPort <em>Reply Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Port</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeRequestStructure#getReplyPort()
	 * @see #getUnsubscribeRequestStructure()
	 * @generated
	 */
	EReference getUnsubscribeRequestStructure_ReplyPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.UnsubscribeRequestStructure#getReplyPath <em>Reply Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Path</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeRequestStructure#getReplyPath()
	 * @see #getUnsubscribeRequestStructure()
	 * @generated
	 */
	EReference getUnsubscribeRequestStructure_ReplyPath();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure <em>Unsubscribe Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsubscribe Response Structure</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeResponseStructure
	 * @generated
	 */
	EClass getUnsubscribeResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getActive()
	 * @see #getUnsubscribeResponseStructure()
	 * @generated
	 */
	EReference getUnsubscribeResponseStructure_Active();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.common.UnsubscribeResponseStructure#getOperationErrorMessage()
	 * @see #getUnsubscribeResponseStructure()
	 * @generated
	 */
	EReference getUnsubscribeResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.VehicleStructure <em>Vehicle Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Structure</em>'.
	 * @see de.jena.mdo.ibis.common.VehicleStructure
	 * @generated
	 */
	EClass getVehicleStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.VehicleStructure#getVehicleTypeRef <em>Vehicle Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Type Ref</em>'.
	 * @see de.jena.mdo.ibis.common.VehicleStructure#getVehicleTypeRef()
	 * @see #getVehicleStructure()
	 * @generated
	 */
	EReference getVehicleStructure_VehicleTypeRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.VehicleStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see de.jena.mdo.ibis.common.VehicleStructure#getName()
	 * @see #getVehicleStructure()
	 * @generated
	 */
	EReference getVehicleStructure_Name();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ViaPointStructure <em>Via Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Via Point Structure</em>'.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure
	 * @generated
	 */
	EClass getViaPointStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ViaPointStructure#getViaPointRef <em>Via Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Point Ref</em>'.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure#getViaPointRef()
	 * @see #getViaPointStructure()
	 * @generated
	 */
	EReference getViaPointStructure_ViaPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ViaPointStructure#getPlaceRef <em>Place Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place Ref</em>'.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure#getPlaceRef()
	 * @see #getViaPointStructure()
	 * @generated
	 */
	EReference getViaPointStructure_PlaceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ViaPointStructure#getPlaceName <em>Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place Name</em>'.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure#getPlaceName()
	 * @see #getViaPointStructure()
	 * @generated
	 */
	EReference getViaPointStructure_PlaceName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ViaPointStructure#getPlaceShortName <em>Place Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place Short Name</em>'.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure#getPlaceShortName()
	 * @see #getViaPointStructure()
	 * @generated
	 */
	EReference getViaPointStructure_PlaceShortName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ViaPointStructure#getViaPointDisplayPriority <em>Via Point Display Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Point Display Priority</em>'.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure#getViaPointDisplayPriority()
	 * @see #getViaPointStructure()
	 * @generated
	 */
	EReference getViaPointStructure_ViaPointDisplayPriority();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.common.ZoneType <em>Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Type</em>'.
	 * @see de.jena.mdo.ibis.common.ZoneType
	 * @generated
	 */
	EClass getZoneType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.common.ZoneType#getFarezoneTypeID <em>Farezone Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Farezone Type ID</em>'.
	 * @see de.jena.mdo.ibis.common.ZoneType#getFarezoneTypeID()
	 * @see #getZoneType()
	 * @generated
	 */
	EReference getZoneType_FarezoneTypeID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.common.ZoneType#getFareZoneTypeName <em>Fare Zone Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone Type Name</em>'.
	 * @see de.jena.mdo.ibis.common.ZoneType#getFareZoneTypeName()
	 * @see #getZoneType()
	 * @generated
	 */
	EReference getZoneType_FareZoneTypeName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IbisCommonFactory getIbisCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.AdditionalAnnouncementStructureImpl <em>Additional Announcement Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.AdditionalAnnouncementStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getAdditionalAnnouncementStructure()
		 * @generated
		 */
		EClass ADDITIONAL_ANNOUNCEMENT_STRUCTURE = eINSTANCE.getAdditionalAnnouncementStructure();

		/**
		 * The meta object literal for the '<em><b>Announcement Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF = eINSTANCE.getAdditionalAnnouncementStructure_AnnouncementRef();

		/**
		 * The meta object literal for the '<em><b>Announcement Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT = eINSTANCE.getAdditionalAnnouncementStructure_AnnouncementText();

		/**
		 * The meta object literal for the '<em><b>Announcement TTS Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT = eINSTANCE.getAdditionalAnnouncementStructure_AnnouncementTTSText();

		/**
		 * The meta object literal for the '<em><b>Immediate Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT_STRUCTURE__IMMEDIATE_INFORMATION = eINSTANCE.getAdditionalAnnouncementStructure_ImmediateInformation();

		/**
		 * The meta object literal for the '<em><b>Periodical Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT_STRUCTURE__PERIODICAL_INFORMATION = eINSTANCE.getAdditionalAnnouncementStructure_PeriodicalInformation();

		/**
		 * The meta object literal for the '<em><b>Specific Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT_STRUCTURE__SPECIFIC_POINT = eINSTANCE.getAdditionalAnnouncementStructure_SpecificPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl <em>Announcement Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getAnnouncementStructure()
		 * @generated
		 */
		EClass ANNOUNCEMENT_STRUCTURE = eINSTANCE.getAnnouncementStructure();

		/**
		 * The meta object literal for the '<em><b>Announcement Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF = eINSTANCE.getAnnouncementStructure_AnnouncementRef();

		/**
		 * The meta object literal for the '<em><b>Announcement Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT = eINSTANCE.getAnnouncementStructure_AnnouncementText();

		/**
		 * The meta object literal for the '<em><b>Announcement TTS Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT = eINSTANCE.getAnnouncementStructure_AnnouncementTTSText();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.BayAreaStructureImpl <em>Bay Area Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.BayAreaStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getBayAreaStructure()
		 * @generated
		 */
		EClass BAY_AREA_STRUCTURE = eINSTANCE.getBayAreaStructure();

		/**
		 * The meta object literal for the '<em><b>Before Bay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY_AREA_STRUCTURE__BEFORE_BAY = eINSTANCE.getBayAreaStructure_BeforeBay();

		/**
		 * The meta object literal for the '<em><b>Behind Bay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY_AREA_STRUCTURE__BEHIND_BAY = eINSTANCE.getBayAreaStructure_BehindBay();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl <em>Beacon Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getBeaconPointStructure()
		 * @generated
		 */
		EClass BEACON_POINT_STRUCTURE = eINSTANCE.getBeaconPointStructure();

		/**
		 * The meta object literal for the '<em><b>Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT_STRUCTURE__POINT_REF = eINSTANCE.getBeaconPointStructure_PointRef();

		/**
		 * The meta object literal for the '<em><b>Beacon Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT_STRUCTURE__BEACON_CODE = eINSTANCE.getBeaconPointStructure_BeaconCode();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT_STRUCTURE__SHORT_NAME = eINSTANCE.getBeaconPointStructure_ShortName();

		/**
		 * The meta object literal for the '<em><b>Desciption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT_STRUCTURE__DESCIPTION = eINSTANCE.getBeaconPointStructure_Desciption();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.CardApplInformationsImpl <em>Card Appl Informations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.CardApplInformationsImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getCardApplInformations()
		 * @generated
		 */
		EClass CARD_APPL_INFORMATIONS = eINSTANCE.getCardApplInformations();

		/**
		 * The meta object literal for the '<em><b>Card Appl Information Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH = eINSTANCE.getCardApplInformations_CardApplInformationLength();

		/**
		 * The meta object literal for the '<em><b>Card Appl Information Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA = eINSTANCE.getCardApplInformations_CardApplInformationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.CardTicketDataImpl <em>Card Ticket Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.CardTicketDataImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getCardTicketData()
		 * @generated
		 */
		EClass CARD_TICKET_DATA = eINSTANCE.getCardTicketData();

		/**
		 * The meta object literal for the '<em><b>Card Ticket Data ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TICKET_DATA__CARD_TICKET_DATA_ID = eINSTANCE.getCardTicketData_CardTicketDataID();

		/**
		 * The meta object literal for the '<em><b>Card Ticket Data Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH = eINSTANCE.getCardTicketData_CardTicketDataLength();

		/**
		 * The meta object literal for the '<em><b>Card Ticket Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TICKET_DATA__CARD_TICKET_DATA = eINSTANCE.getCardTicketData_CardTicketData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.CardTypeImpl <em>Card Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.CardTypeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getCardType()
		 * @generated
		 */
		EClass CARD_TYPE = eINSTANCE.getCardType();

		/**
		 * The meta object literal for the '<em><b>Card Serial Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TYPE__CARD_SERIAL_NUMBER = eINSTANCE.getCardType_CardSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Card Type ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TYPE__CARD_TYPE_ID = eINSTANCE.getCardType_CardTypeID();

		/**
		 * The meta object literal for the '<em><b>Card Type Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TYPE__CARD_TYPE_TEXT = eINSTANCE.getCardType_CardTypeText();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ConnectionStructureImpl <em>Connection Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ConnectionStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getConnectionStructure()
		 * @generated
		 */
		EClass CONNECTION_STRUCTURE = eINSTANCE.getConnectionStructure();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__STOP_REF = eINSTANCE.getConnectionStructure_StopRef();

		/**
		 * The meta object literal for the '<em><b>Connection Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__CONNECTION_REF = eINSTANCE.getConnectionStructure_ConnectionRef();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_STRUCTURE__CONNECTION_TYPE = eINSTANCE.getConnectionStructure_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__DISPLAY_CONTENT = eINSTANCE.getConnectionStructure_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__PLATFORM = eINSTANCE.getConnectionStructure_Platform();

		/**
		 * The meta object literal for the '<em><b>Connection State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_STRUCTURE__CONNECTION_STATE = eINSTANCE.getConnectionStructure_ConnectionState();

		/**
		 * The meta object literal for the '<em><b>Transport Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__TRANSPORT_MODE = eINSTANCE.getConnectionStructure_TransportMode();

		/**
		 * The meta object literal for the '<em><b>Connection Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__CONNECTION_MODE = eINSTANCE.getConnectionStructure_ConnectionMode();

		/**
		 * The meta object literal for the '<em><b>Expected Departure Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__EXPECTED_DEPARTURE_TIME = eINSTANCE.getConnectionStructure_ExpectedDepartureTime();

		/**
		 * The meta object literal for the '<em><b>Scheduled Departure Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_STRUCTURE__SCHEDULED_DEPARTURE_TIME = eINSTANCE.getConnectionStructure_ScheduledDepartureTime();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DataAcceptedResponseDataStructureImpl <em>Data Accepted Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DataAcceptedResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataAcceptedResponseDataStructure()
		 * @generated
		 */
		EClass DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDataAcceptedResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDataAcceptedResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Data Accepted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__DATA_ACCEPTED = eINSTANCE.getDataAcceptedResponseDataStructure_DataAccepted();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__ERROR_CODE = eINSTANCE.getDataAcceptedResponseDataStructure_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Error Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__ERROR_INFORMATION = eINSTANCE.getDataAcceptedResponseDataStructure_ErrorInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DataAcceptedResponseStructureImpl <em>Data Accepted Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DataAcceptedResponseStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataAcceptedResponseStructure()
		 * @generated
		 */
		EClass DATA_ACCEPTED_RESPONSE_STRUCTURE = eINSTANCE.getDataAcceptedResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Data Accepted Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA = eINSTANCE.getDataAcceptedResponseStructure_DataAcceptedResponseData();

		/**
		 * The meta object literal for the '<em><b>Operation Error Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = eINSTANCE.getDataAcceptedResponseStructure_OperationErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DataVersionListStructureImpl <em>Data Version List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DataVersionListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataVersionListStructure()
		 * @generated
		 */
		EClass DATA_VERSION_LIST_STRUCTURE = eINSTANCE.getDataVersionListStructure();

		/**
		 * The meta object literal for the '<em><b>Data Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VERSION_LIST_STRUCTURE__DATA_VERSION = eINSTANCE.getDataVersionListStructure_DataVersion();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DataVersionStructureImpl <em>Data Version Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DataVersionStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDataVersionStructure()
		 * @generated
		 */
		EClass DATA_VERSION_STRUCTURE = eINSTANCE.getDataVersionStructure();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VERSION_STRUCTURE__DATA_TYPE = eINSTANCE.getDataVersionStructure_DataType();

		/**
		 * The meta object literal for the '<em><b>Version Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VERSION_STRUCTURE__VERSION_REF = eINSTANCE.getDataVersionStructure_VersionRef();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DegreeTypeImpl <em>Degree Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DegreeTypeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDegreeType()
		 * @generated
		 */
		EClass DEGREE_TYPE = eINSTANCE.getDegreeType();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_TYPE__DEGREE = eINSTANCE.getDegreeType_Degree();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_TYPE__ORIENTATION = eINSTANCE.getDegreeType_Orientation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DestinationStructureImpl <em>Destination Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DestinationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDestinationStructure()
		 * @generated
		 */
		EClass DESTINATION_STRUCTURE = eINSTANCE.getDestinationStructure();

		/**
		 * The meta object literal for the '<em><b>Destination Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION_STRUCTURE__DESTINATION_REF = eINSTANCE.getDestinationStructure_DestinationRef();

		/**
		 * The meta object literal for the '<em><b>Destination Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION_STRUCTURE__DESTINATION_NAME = eINSTANCE.getDestinationStructure_DestinationName();

		/**
		 * The meta object literal for the '<em><b>Destination Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME = eINSTANCE.getDestinationStructure_DestinationShortName();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DeviceInformationStructureImpl <em>Device Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DeviceInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceInformationStructure()
		 * @generated
		 */
		EClass DEVICE_INFORMATION_STRUCTURE = eINSTANCE.getDeviceInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_STRUCTURE__DEVICE_NAME = eINSTANCE.getDeviceInformationStructure_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_STRUCTURE__MANUFACTURER = eINSTANCE.getDeviceInformationStructure_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_STRUCTURE__SERIAL_NUMBER = eINSTANCE.getDeviceInformationStructure_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Device Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INFORMATION_STRUCTURE__DEVICE_CLASS = eINSTANCE.getDeviceInformationStructure_DeviceClass();

		/**
		 * The meta object literal for the '<em><b>Data Version List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_STRUCTURE__DATA_VERSION_LIST = eINSTANCE.getDeviceInformationStructure_DataVersionList();

		/**
		 * The meta object literal for the '<em><b>Web Interface Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_STRUCTURE__WEB_INTERFACE_ADDRESS = eINSTANCE.getDeviceInformationStructure_WebInterfaceAddress();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationListStructureImpl <em>Device Specification List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationListStructure()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_LIST_STRUCTURE = eINSTANCE.getDeviceSpecificationListStructure();

		/**
		 * The meta object literal for the '<em><b>Device Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION = eINSTANCE.getDeviceSpecificationListStructure_DeviceSpecification();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationStructureImpl <em>Device Specification Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationStructure()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_STRUCTURE = eINSTANCE.getDeviceSpecificationStructure();

		/**
		 * The meta object literal for the '<em><b>Device Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS = eINSTANCE.getDeviceSpecificationStructure_DeviceClass();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID = eINSTANCE.getDeviceSpecificationStructure_DeviceID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateListStructureImpl <em>Device Specification With State List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithStateListStructure()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE = eINSTANCE.getDeviceSpecificationWithStateListStructure();

		/**
		 * The meta object literal for the '<em><b>Device Specification With State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__DEVICE_SPECIFICATION_WITH_STATE = eINSTANCE.getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateStructureImpl <em>Device Specification With State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DeviceSpecificationWithStateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithStateStructure()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE = eINSTANCE.getDeviceSpecificationWithStateStructure();

		/**
		 * The meta object literal for the '<em><b>Device Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE__DEVICE_SPECIFICATION = eINSTANCE.getDeviceSpecificationWithStateStructure_DeviceSpecification();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE__DEVICE_STATE = eINSTANCE.getDeviceSpecificationWithStateStructure_DeviceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl <em>Display Content Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDisplayContentStructure()
		 * @generated
		 */
		EClass DISPLAY_CONTENT_STRUCTURE = eINSTANCE.getDisplayContentStructure();

		/**
		 * The meta object literal for the '<em><b>Display Content Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF = eINSTANCE.getDisplayContentStructure_DisplayContentRef();

		/**
		 * The meta object literal for the '<em><b>Line Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION = eINSTANCE.getDisplayContentStructure_LineInformation();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__DESTINATION = eINSTANCE.getDisplayContentStructure_Destination();

		/**
		 * The meta object literal for the '<em><b>Via Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__VIA_POINT = eINSTANCE.getDisplayContentStructure_ViaPoint();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION = eINSTANCE.getDisplayContentStructure_AdditionalInformation();

		/**
		 * The meta object literal for the '<em><b>Additional Information1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1 = eINSTANCE.getDisplayContentStructure_AdditionalInformation1();

		/**
		 * The meta object literal for the '<em><b>Additional Information2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2 = eINSTANCE.getDisplayContentStructure_AdditionalInformation2();

		/**
		 * The meta object literal for the '<em><b>Additional Information3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3 = eINSTANCE.getDisplayContentStructure_AdditionalInformation3();

		/**
		 * The meta object literal for the '<em><b>Additional Information4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4 = eINSTANCE.getDisplayContentStructure_AdditionalInformation4();

		/**
		 * The meta object literal for the '<em><b>Additional Information5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5 = eINSTANCE.getDisplayContentStructure_AdditionalInformation5();

		/**
		 * The meta object literal for the '<em><b>Additional Information6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6 = eINSTANCE.getDisplayContentStructure_AdditionalInformation6();

		/**
		 * The meta object literal for the '<em><b>Additional Information7</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7 = eINSTANCE.getDisplayContentStructure_AdditionalInformation7();

		/**
		 * The meta object literal for the '<em><b>Additional Information8</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8 = eINSTANCE.getDisplayContentStructure_AdditionalInformation8();

		/**
		 * The meta object literal for the '<em><b>Additional Information9</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9 = eINSTANCE.getDisplayContentStructure_AdditionalInformation9();

		/**
		 * The meta object literal for the '<em><b>Run Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER = eINSTANCE.getDisplayContentStructure_RunNumber();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__PRIORITY = eINSTANCE.getDisplayContentStructure_Priority();

		/**
		 * The meta object literal for the '<em><b>Period Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION = eINSTANCE.getDisplayContentStructure_PeriodDuration();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT_STRUCTURE__DURATION = eINSTANCE.getDisplayContentStructure_Duration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DocumentRootImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Air Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AIR_SUBMODE = eINSTANCE.getDocumentRoot_AirSubmode();

		/**
		 * The meta object literal for the '<em><b>Bus Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BUS_SUBMODE = eINSTANCE.getDocumentRoot_BusSubmode();

		/**
		 * The meta object literal for the '<em><b>Coach Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COACH_SUBMODE = eINSTANCE.getDocumentRoot_CoachSubmode();

		/**
		 * The meta object literal for the '<em><b>Data Accepted Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE = eINSTANCE.getDocumentRoot_DataAcceptedResponse();

		/**
		 * The meta object literal for the '<em><b>Funicular Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FUNICULAR_SUBMODE = eINSTANCE.getDocumentRoot_FunicularSubmode();

		/**
		 * The meta object literal for the '<em><b>Metro Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__METRO_SUBMODE = eINSTANCE.getDocumentRoot_MetroSubmode();

		/**
		 * The meta object literal for the '<em><b>Rail Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RAIL_SUBMODE = eINSTANCE.getDocumentRoot_RailSubmode();

		/**
		 * The meta object literal for the '<em><b>Self Drive Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SELF_DRIVE_SUBMODE = eINSTANCE.getDocumentRoot_SelfDriveSubmode();

		/**
		 * The meta object literal for the '<em><b>Subscribe Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSCRIBE_REQUEST = eINSTANCE.getDocumentRoot_SubscribeRequest();

		/**
		 * The meta object literal for the '<em><b>Subscribe Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSCRIBE_RESPONSE = eINSTANCE.getDocumentRoot_SubscribeResponse();

		/**
		 * The meta object literal for the '<em><b>Taxi Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAXI_SUBMODE = eINSTANCE.getDocumentRoot_TaxiSubmode();

		/**
		 * The meta object literal for the '<em><b>Telecabin Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TELECABIN_SUBMODE = eINSTANCE.getDocumentRoot_TelecabinSubmode();

		/**
		 * The meta object literal for the '<em><b>Tram Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRAM_SUBMODE = eINSTANCE.getDocumentRoot_TramSubmode();

		/**
		 * The meta object literal for the '<em><b>Unsubscribe Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST = eINSTANCE.getDocumentRoot_UnsubscribeRequest();

		/**
		 * The meta object literal for the '<em><b>Unsubscribe Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE = eINSTANCE.getDocumentRoot_UnsubscribeResponse();

		/**
		 * The meta object literal for the '<em><b>Water Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WATER_SUBMODE = eINSTANCE.getDocumentRoot_WaterSubmode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DoorCountingListStructureImpl <em>Door Counting List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DoorCountingListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorCountingListStructure()
		 * @generated
		 */
		EClass DOOR_COUNTING_LIST_STRUCTURE = eINSTANCE.getDoorCountingListStructure();

		/**
		 * The meta object literal for the '<em><b>Door ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING_LIST_STRUCTURE__DOOR_ID = eINSTANCE.getDoorCountingListStructure_DoorID();

		/**
		 * The meta object literal for the '<em><b>Count Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING_LIST_STRUCTURE__COUNT_SET = eINSTANCE.getDoorCountingListStructure_CountSet();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl <em>Door Counting Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorCountingStructure()
		 * @generated
		 */
		EClass DOOR_COUNTING_STRUCTURE = eINSTANCE.getDoorCountingStructure();

		/**
		 * The meta object literal for the '<em><b>Object Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_COUNTING_STRUCTURE__OBJECT_CLASS = eINSTANCE.getDoorCountingStructure_ObjectClass();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING_STRUCTURE__IN = eINSTANCE.getDoorCountingStructure_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING_STRUCTURE__OUT = eINSTANCE.getDoorCountingStructure_Out();

		/**
		 * The meta object literal for the '<em><b>Count Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_COUNTING_STRUCTURE__COUNT_QUALITY = eINSTANCE.getDoorCountingStructure_CountQuality();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DoorInformationStructureImpl <em>Door Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DoorInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorInformationStructure()
		 * @generated
		 */
		EClass DOOR_INFORMATION_STRUCTURE = eINSTANCE.getDoorInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Door ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_INFORMATION_STRUCTURE__DOOR_ID = eINSTANCE.getDoorInformationStructure_DoorID();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_INFORMATION_STRUCTURE__COUNT = eINSTANCE.getDoorInformationStructure_Count();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_INFORMATION_STRUCTURE__STATE = eINSTANCE.getDoorInformationStructure_State();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DoorOpenStateStructureImpl <em>Door Open State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DoorOpenStateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorOpenStateStructure()
		 * @generated
		 */
		EClass DOOR_OPEN_STATE_STRUCTURE = eINSTANCE.getDoorOpenStateStructure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPEN_STATE_STRUCTURE__VALUE = eINSTANCE.getDoorOpenStateStructure_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPEN_STATE_STRUCTURE__ERROR_CODE = eINSTANCE.getDoorOpenStateStructure_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DoorOperationStateStructureImpl <em>Door Operation State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DoorOperationStateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorOperationStateStructure()
		 * @generated
		 */
		EClass DOOR_OPERATION_STATE_STRUCTURE = eINSTANCE.getDoorOperationStateStructure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPERATION_STATE_STRUCTURE__VALUE = eINSTANCE.getDoorOperationStateStructure_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPERATION_STATE_STRUCTURE__ERROR_CODE = eINSTANCE.getDoorOperationStateStructure_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.DoorStateStructureImpl <em>Door State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.DoorStateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getDoorStateStructure()
		 * @generated
		 */
		EClass DOOR_STATE_STRUCTURE = eINSTANCE.getDoorStateStructure();

		/**
		 * The meta object literal for the '<em><b>Open State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_STATE_STRUCTURE__OPEN_STATE = eINSTANCE.getDoorStateStructure_OpenState();

		/**
		 * The meta object literal for the '<em><b>Operation State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_STATE_STRUCTURE__OPERATION_STATE = eINSTANCE.getDoorStateStructure_OperationState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl <em>Fare Zone Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getFareZoneInformationStructure()
		 * @generated
		 */
		EClass FARE_ZONE_INFORMATION_STRUCTURE = eINSTANCE.getFareZoneInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Fare Zone ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID = eINSTANCE.getFareZoneInformationStructure_FareZoneID();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE = eINSTANCE.getFareZoneInformationStructure_FareZoneType();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Long Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME = eINSTANCE.getFareZoneInformationStructure_FareZoneLongName();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME = eINSTANCE.getFareZoneInformationStructure_FareZoneShortName();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.GlobalCardStatusImpl <em>Global Card Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.GlobalCardStatusImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getGlobalCardStatus()
		 * @generated
		 */
		EClass GLOBAL_CARD_STATUS = eINSTANCE.getGlobalCardStatus();

		/**
		 * The meta object literal for the '<em><b>Global Card Staus ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID = eINSTANCE.getGlobalCardStatus_GlobalCardStausID();

		/**
		 * The meta object literal for the '<em><b>Global Card Status Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT = eINSTANCE.getGlobalCardStatus_GlobalCardStatusText();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.GNSSCoordinateStructureImpl <em>GNSS Coordinate Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.GNSSCoordinateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getGNSSCoordinateStructure()
		 * @generated
		 */
		EClass GNSS_COORDINATE_STRUCTURE = eINSTANCE.getGNSSCoordinateStructure();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_COORDINATE_STRUCTURE__DEGREE = eINSTANCE.getGNSSCoordinateStructure_Degree();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_COORDINATE_STRUCTURE__DIRECTION = eINSTANCE.getGNSSCoordinateStructure_Direction();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl <em>GNSS Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getGNSSPointStructure()
		 * @generated
		 */
		EClass GNSS_POINT_STRUCTURE = eINSTANCE.getGNSSPointStructure();

		/**
		 * The meta object literal for the '<em><b>Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT_STRUCTURE__POINT_REF = eINSTANCE.getGNSSPointStructure_PointRef();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT_STRUCTURE__LONGITUDE = eINSTANCE.getGNSSPointStructure_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT_STRUCTURE__LATITUDE = eINSTANCE.getGNSSPointStructure_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT_STRUCTURE__ALTITUDE = eINSTANCE.getGNSSPointStructure_Altitude();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPAnyURIImpl <em>IBISIP Any URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPAnyURIImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPAnyURI()
		 * @generated
		 */
		EClass IBISIP_ANY_URI = eINSTANCE.getIBISIPAnyURI();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_ANY_URI__VALUE = eINSTANCE.getIBISIPAnyURI_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_ANY_URI__ERROR_CODE = eINSTANCE.getIBISIPAnyURI_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPBooleanImpl <em>IBISIP Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPBooleanImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPBoolean()
		 * @generated
		 */
		EClass IBISIP_BOOLEAN = eINSTANCE.getIBISIPBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_BOOLEAN__VALUE = eINSTANCE.getIBISIPBoolean_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_BOOLEAN__ERROR_CODE = eINSTANCE.getIBISIPBoolean_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPByteImpl <em>IBISIP Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPByteImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPByte()
		 * @generated
		 */
		EClass IBISIP_BYTE = eINSTANCE.getIBISIPByte();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_BYTE__VALUE = eINSTANCE.getIBISIPByte_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_BYTE__ERROR_CODE = eINSTANCE.getIBISIPByte_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDateImpl <em>IBISIP Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPDateImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDate()
		 * @generated
		 */
		EClass IBISIP_DATE = eINSTANCE.getIBISIPDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DATE__VALUE = eINSTANCE.getIBISIPDate_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DATE__ERROR_CODE = eINSTANCE.getIBISIPDate_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDateTimeImpl <em>IBISIP Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPDateTimeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDateTime()
		 * @generated
		 */
		EClass IBISIP_DATE_TIME = eINSTANCE.getIBISIPDateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DATE_TIME__VALUE = eINSTANCE.getIBISIPDateTime_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DATE_TIME__ERROR_CODE = eINSTANCE.getIBISIPDateTime_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDoubleImpl <em>IBISIP Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPDoubleImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDouble()
		 * @generated
		 */
		EClass IBISIP_DOUBLE = eINSTANCE.getIBISIPDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DOUBLE__VALUE = eINSTANCE.getIBISIPDouble_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DOUBLE__ERROR_CODE = eINSTANCE.getIBISIPDouble_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPDurationImpl <em>IBISIP Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPDurationImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPDuration()
		 * @generated
		 */
		EClass IBISIP_DURATION = eINSTANCE.getIBISIPDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DURATION__VALUE = eINSTANCE.getIBISIPDuration_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_DURATION__ERROR_CODE = eINSTANCE.getIBISIPDuration_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPIntImpl <em>IBISIP Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPIntImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPInt()
		 * @generated
		 */
		EClass IBISIP_INT = eINSTANCE.getIBISIPInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_INT__VALUE = eINSTANCE.getIBISIPInt_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_INT__ERROR_CODE = eINSTANCE.getIBISIPInt_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPLanguageImpl <em>IBISIP Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPLanguageImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPLanguage()
		 * @generated
		 */
		EClass IBISIP_LANGUAGE = eINSTANCE.getIBISIPLanguage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_LANGUAGE__VALUE = eINSTANCE.getIBISIPLanguage_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_LANGUAGE__ERROR_CODE = eINSTANCE.getIBISIPLanguage_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPNMTOKENImpl <em>IBISIPNMTOKEN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPNMTOKENImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPNMTOKEN()
		 * @generated
		 */
		EClass IBISIPNMTOKEN = eINSTANCE.getIBISIPNMTOKEN();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIPNMTOKEN__VALUE = eINSTANCE.getIBISIPNMTOKEN_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIPNMTOKEN__ERROR_CODE = eINSTANCE.getIBISIPNMTOKEN_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPNonNegativeIntegerImpl <em>IBISIP Non Negative Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPNonNegativeIntegerImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPNonNegativeInteger()
		 * @generated
		 */
		EClass IBISIP_NON_NEGATIVE_INTEGER = eINSTANCE.getIBISIPNonNegativeInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_NON_NEGATIVE_INTEGER__VALUE = eINSTANCE.getIBISIPNonNegativeInteger_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE = eINSTANCE.getIBISIPNonNegativeInteger_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPNormalizedStringImpl <em>IBISIP Normalized String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPNormalizedStringImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPNormalizedString()
		 * @generated
		 */
		EClass IBISIP_NORMALIZED_STRING = eINSTANCE.getIBISIPNormalizedString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_NORMALIZED_STRING__VALUE = eINSTANCE.getIBISIPNormalizedString_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_NORMALIZED_STRING__ERROR_CODE = eINSTANCE.getIBISIPNormalizedString_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPStringImpl <em>IBISIP String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPStringImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPString()
		 * @generated
		 */
		EClass IBISIP_STRING = eINSTANCE.getIBISIPString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_STRING__VALUE = eINSTANCE.getIBISIPString_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_STRING__ERROR_CODE = eINSTANCE.getIBISIPString_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPTimeImpl <em>IBISIP Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPTimeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPTime()
		 * @generated
		 */
		EClass IBISIP_TIME = eINSTANCE.getIBISIPTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_TIME__VALUE = eINSTANCE.getIBISIPTime_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_TIME__ERROR_CODE = eINSTANCE.getIBISIPTime_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPUnsignedIntImpl <em>IBISIP Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPUnsignedIntImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPUnsignedInt()
		 * @generated
		 */
		EClass IBISIP_UNSIGNED_INT = eINSTANCE.getIBISIPUnsignedInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_UNSIGNED_INT__VALUE = eINSTANCE.getIBISIPUnsignedInt_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_UNSIGNED_INT__ERROR_CODE = eINSTANCE.getIBISIPUnsignedInt_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.IBISIPUnsignedLongImpl <em>IBISIP Unsigned Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.IBISIPUnsignedLongImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getIBISIPUnsignedLong()
		 * @generated
		 */
		EClass IBISIP_UNSIGNED_LONG = eINSTANCE.getIBISIPUnsignedLong();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_UNSIGNED_LONG__VALUE = eINSTANCE.getIBISIPUnsignedLong_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBISIP_UNSIGNED_LONG__ERROR_CODE = eINSTANCE.getIBISIPUnsignedLong_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.InternationalTextTypeImpl <em>International Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.InternationalTextTypeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getInternationalTextType()
		 * @generated
		 */
		EClass INTERNATIONAL_TEXT_TYPE = eINSTANCE.getInternationalTextType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONAL_TEXT_TYPE__VALUE = eINSTANCE.getInternationalTextType_Value();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONAL_TEXT_TYPE__LANGUAGE = eINSTANCE.getInternationalTextType_Language();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONAL_TEXT_TYPE__ERROR_CODE = eINSTANCE.getInternationalTextType_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl <em>Journey Stop Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getJourneyStopInformationStructure()
		 * @generated
		 */
		EClass JOURNEY_STOP_INFORMATION_STRUCTURE = eINSTANCE.getJourneyStopInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF = eINSTANCE.getJourneyStopInformationStructure_StopRef();

		/**
		 * The meta object literal for the '<em><b>Stop Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME = eINSTANCE.getJourneyStopInformationStructure_StopName();

		/**
		 * The meta object literal for the '<em><b>Stop Alternative Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME = eINSTANCE.getJourneyStopInformationStructure_StopAlternativeName();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM = eINSTANCE.getJourneyStopInformationStructure_Platform();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT = eINSTANCE.getJourneyStopInformationStructure_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Announcement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT = eINSTANCE.getJourneyStopInformationStructure_Announcement();

		/**
		 * The meta object literal for the '<em><b>Arrival Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED = eINSTANCE.getJourneyStopInformationStructure_ArrivalScheduled();

		/**
		 * The meta object literal for the '<em><b>Departure Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED = eINSTANCE.getJourneyStopInformationStructure_DepartureScheduled();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION = eINSTANCE.getJourneyStopInformationStructure_Connection();

		/**
		 * The meta object literal for the '<em><b>Bay Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA = eINSTANCE.getJourneyStopInformationStructure_BayArea();

		/**
		 * The meta object literal for the '<em><b>GNSS Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT = eINSTANCE.getJourneyStopInformationStructure_GNSSPoint();

		/**
		 * The meta object literal for the '<em><b>Fare Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE = eINSTANCE.getJourneyStopInformationStructure_FareZone();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl <em>Line Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.LineInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getLineInformationStructure()
		 * @generated
		 */
		EClass LINE_INFORMATION_STRUCTURE = eINSTANCE.getLineInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Line Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION_STRUCTURE__LINE_REF = eINSTANCE.getLineInformationStructure_LineRef();

		/**
		 * The meta object literal for the '<em><b>Line Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION_STRUCTURE__LINE_NAME = eINSTANCE.getLineInformationStructure_LineName();

		/**
		 * The meta object literal for the '<em><b>Line Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME = eINSTANCE.getLineInformationStructure_LineShortName();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION_STRUCTURE__LINE_NUMBER = eINSTANCE.getLineInformationStructure_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Line Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION_STRUCTURE__LINE_CODE = eINSTANCE.getLineInformationStructure_LineCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.LogMessageStructureImpl <em>Log Message Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.LogMessageStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getLogMessageStructure()
		 * @generated
		 */
		EClass LOG_MESSAGE_STRUCTURE = eINSTANCE.getLogMessageStructure();

		/**
		 * The meta object literal for the '<em><b>Message Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_STRUCTURE__MESSAGE_PROVIDER = eINSTANCE.getLogMessageStructure_MessageProvider();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_STRUCTURE__MESSAGE = eINSTANCE.getLogMessageStructure_Message();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.MessageStructureImpl <em>Message Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.MessageStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getMessageStructure()
		 * @generated
		 */
		EClass MESSAGE_STRUCTURE = eINSTANCE.getMessageStructure();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_STRUCTURE__MESSAGE_ID = eINSTANCE.getMessageStructure_MessageID();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_STRUCTURE__TIME_STAMP = eINSTANCE.getMessageStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_STRUCTURE__MESSAGE_TYPE = eINSTANCE.getMessageStructure_MessageType();

		/**
		 * The meta object literal for the '<em><b>Message Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_STRUCTURE__MESSAGE_TEXT = eINSTANCE.getMessageStructure_MessageText();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.NetexModeImpl <em>Netex Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.NetexModeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getNetexMode()
		 * @generated
		 */
		EClass NETEX_MODE = eINSTANCE.getNetexMode();

		/**
		 * The meta object literal for the '<em><b>Pt Main Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__PT_MAIN_MODE = eINSTANCE.getNetexMode_PtMainMode();

		/**
		 * The meta object literal for the '<em><b>Private Main Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__PRIVATE_MAIN_MODE = eINSTANCE.getNetexMode_PrivateMainMode();

		/**
		 * The meta object literal for the '<em><b>Air Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__AIR_SUBMODE = eINSTANCE.getNetexMode_AirSubmode();

		/**
		 * The meta object literal for the '<em><b>Bus Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__BUS_SUBMODE = eINSTANCE.getNetexMode_BusSubmode();

		/**
		 * The meta object literal for the '<em><b>Coach Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__COACH_SUBMODE = eINSTANCE.getNetexMode_CoachSubmode();

		/**
		 * The meta object literal for the '<em><b>Funicular Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__FUNICULAR_SUBMODE = eINSTANCE.getNetexMode_FunicularSubmode();

		/**
		 * The meta object literal for the '<em><b>Metro Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__METRO_SUBMODE = eINSTANCE.getNetexMode_MetroSubmode();

		/**
		 * The meta object literal for the '<em><b>Tram Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__TRAM_SUBMODE = eINSTANCE.getNetexMode_TramSubmode();

		/**
		 * The meta object literal for the '<em><b>Telecabin Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__TELECABIN_SUBMODE = eINSTANCE.getNetexMode_TelecabinSubmode();

		/**
		 * The meta object literal for the '<em><b>Rail Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__RAIL_SUBMODE = eINSTANCE.getNetexMode_RailSubmode();

		/**
		 * The meta object literal for the '<em><b>Water Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__WATER_SUBMODE = eINSTANCE.getNetexMode_WaterSubmode();

		/**
		 * The meta object literal for the '<em><b>Taxi Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__TAXI_SUBMODE = eINSTANCE.getNetexMode_TaxiSubmode();

		/**
		 * The meta object literal for the '<em><b>Self Drive Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETEX_MODE__SELF_DRIVE_SUBMODE = eINSTANCE.getNetexMode_SelfDriveSubmode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.PointSequenceStructureImpl <em>Point Sequence Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.PointSequenceStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getPointSequenceStructure()
		 * @generated
		 */
		EClass POINT_SEQUENCE_STRUCTURE = eINSTANCE.getPointSequenceStructure();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_SEQUENCE_STRUCTURE__POINT = eINSTANCE.getPointSequenceStructure_Point();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.PointStructureImpl <em>Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.PointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getPointStructure()
		 * @generated
		 */
		EClass POINT_STRUCTURE = eINSTANCE.getPointStructure();

		/**
		 * The meta object literal for the '<em><b>Point Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_STRUCTURE__POINT_INDEX = eINSTANCE.getPointStructure_PointIndex();

		/**
		 * The meta object literal for the '<em><b>Point Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_STRUCTURE__POINT_TYPE = eINSTANCE.getPointStructure_PointType();

		/**
		 * The meta object literal for the '<em><b>Distance To Previous Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT = eINSTANCE.getPointStructure_DistanceToPreviousPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl <em>Point Type Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.PointTypeStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getPointTypeStructure()
		 * @generated
		 */
		EClass POINT_TYPE_STRUCTURE = eINSTANCE.getPointTypeStructure();

		/**
		 * The meta object literal for the '<em><b>Stop Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE_STRUCTURE__STOP_POINT = eINSTANCE.getPointTypeStructure_StopPoint();

		/**
		 * The meta object literal for the '<em><b>Beacon Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE_STRUCTURE__BEACON_POINT = eINSTANCE.getPointTypeStructure_BeaconPoint();

		/**
		 * The meta object literal for the '<em><b>GNSS Location Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT = eINSTANCE.getPointTypeStructure_GNSSLocationPoint();

		/**
		 * The meta object literal for the '<em><b>Timing Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE_STRUCTURE__TIMING_POINT = eINSTANCE.getPointTypeStructure_TimingPoint();

		/**
		 * The meta object literal for the '<em><b>TSP Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE_STRUCTURE__TSP_POINT = eINSTANCE.getPointTypeStructure_TSPPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationStructureImpl <em>Service Identification Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceIdentificationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceIdentificationStructure()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_STRUCTURE = eINSTANCE.getServiceIdentificationStructure();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_STRUCTURE__SERVICE = eINSTANCE.getServiceIdentificationStructure_Service();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_STRUCTURE__DEVICE = eINSTANCE.getServiceIdentificationStructure_Device();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateListStructureImpl <em>Service Identification With State List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceIdentificationWithStateListStructure()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE = eINSTANCE.getServiceIdentificationWithStateListStructure();

		/**
		 * The meta object literal for the '<em><b>Service Identification With State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_IDENTIFICATION_WITH_STATE = eINSTANCE.getServiceIdentificationWithStateListStructure_ServiceIdentificationWithState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateStructureImpl <em>Service Identification With State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceIdentificationWithStateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceIdentificationWithStateStructure()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE = eINSTANCE.getServiceIdentificationWithStateStructure();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION = eINSTANCE.getServiceIdentificationWithStateStructure_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE = eINSTANCE.getServiceIdentificationWithStateStructure_ServiceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceInformationListStructureImpl <em>Service Information List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceInformationListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceInformationListStructure()
		 * @generated
		 */
		EClass SERVICE_INFORMATION_LIST_STRUCTURE = eINSTANCE.getServiceInformationListStructure();

		/**
		 * The meta object literal for the '<em><b>Service Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION = eINSTANCE.getServiceInformationListStructure_ServiceInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceInformationStructureImpl <em>Service Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceInformationStructure()
		 * @generated
		 */
		EClass SERVICE_INFORMATION_STRUCTURE = eINSTANCE.getServiceInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_STRUCTURE__SERVICE = eINSTANCE.getServiceInformationStructure_Service();

		/**
		 * The meta object literal for the '<em><b>Autostart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_STRUCTURE__AUTOSTART = eINSTANCE.getServiceInformationStructure_Autostart();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationStructureImpl <em>Service Specification Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceSpecificationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceSpecificationStructure()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION_STRUCTURE = eINSTANCE.getServiceSpecificationStructure();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME = eINSTANCE.getServiceSpecificationStructure_ServiceName();

		/**
		 * The meta object literal for the '<em><b>IBISIP Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION = eINSTANCE.getServiceSpecificationStructure_IBISIPVersion();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateListStructureImpl <em>Service Specification With State List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceSpecificationWithStateListStructure()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE = eINSTANCE.getServiceSpecificationWithStateListStructure();

		/**
		 * The meta object literal for the '<em><b>Service Specification With State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE = eINSTANCE.getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateStructureImpl <em>Service Specification With State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceSpecificationWithStateStructure()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE = eINSTANCE.getServiceSpecificationWithStateStructure();

		/**
		 * The meta object literal for the '<em><b>Service Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION = eINSTANCE.getServiceSpecificationWithStateStructure_ServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Service State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE = eINSTANCE.getServiceSpecificationWithStateStructure_ServiceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceStartListStructureImpl <em>Service Start List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceStartListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceStartListStructure()
		 * @generated
		 */
		EClass SERVICE_START_LIST_STRUCTURE = eINSTANCE.getServiceStartListStructure();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_START_LIST_STRUCTURE__SERVICE_IDENTIFICATION = eINSTANCE.getServiceStartListStructure_ServiceIdentification();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ServiceStartStructureImpl <em>Service Start Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ServiceStartStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getServiceStartStructure()
		 * @generated
		 */
		EClass SERVICE_START_STRUCTURE = eINSTANCE.getServiceStartStructure();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_START_STRUCTURE__SERVICE_IDENTIFICATION = eINSTANCE.getServiceStartStructure_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Autostart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_START_STRUCTURE__AUTOSTART = eINSTANCE.getServiceStartStructure_Autostart();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ShortTripStopListStructureImpl <em>Short Trip Stop List Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ShortTripStopListStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getShortTripStopListStructure()
		 * @generated
		 */
		EClass SHORT_TRIP_STOP_LIST_STRUCTURE = eINSTANCE.getShortTripStopListStructure();

		/**
		 * The meta object literal for the '<em><b>Short Trip Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP = eINSTANCE.getShortTripStopListStructure_ShortTripStop();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ShortTripStopStructureImpl <em>Short Trip Stop Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ShortTripStopStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getShortTripStopStructure()
		 * @generated
		 */
		EClass SHORT_TRIP_STOP_STRUCTURE = eINSTANCE.getShortTripStopStructure();

		/**
		 * The meta object literal for the '<em><b>Journey Stop Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_TRIP_STOP_STRUCTURE__JOURNEY_STOP_INFORMATION = eINSTANCE.getShortTripStopStructure_JourneyStopInformation();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_TRIP_STOP_STRUCTURE__FARE_ZONE_INFORMATION = eINSTANCE.getShortTripStopStructure_FareZoneInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.SpecificPointStructureImpl <em>Specific Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.SpecificPointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getSpecificPointStructure()
		 * @generated
		 */
		EClass SPECIFIC_POINT_STRUCTURE = eINSTANCE.getSpecificPointStructure();

		/**
		 * The meta object literal for the '<em><b>Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_POINT_STRUCTURE__POINT_REF = eINSTANCE.getSpecificPointStructure_PointRef();

		/**
		 * The meta object literal for the '<em><b>Distance To Previous Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT = eINSTANCE.getSpecificPointStructure_DistanceToPreviousPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.StopInformationRequestStructureImpl <em>Stop Information Request Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.StopInformationRequestStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopInformationRequestStructure()
		 * @generated
		 */
		EClass STOP_INFORMATION_REQUEST_STRUCTURE = eINSTANCE.getStopInformationRequestStructure();

		/**
		 * The meta object literal for the '<em><b>Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__STOP_INDEX = eINSTANCE.getStopInformationRequestStructure_StopIndex();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__STOP_REF = eINSTANCE.getStopInformationRequestStructure_StopRef();

		/**
		 * The meta object literal for the '<em><b>Stop Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__STOP_NAME = eINSTANCE.getStopInformationRequestStructure_StopName();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__DISPLAY_CONTENT = eINSTANCE.getStopInformationRequestStructure_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Stop Announcement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__STOP_ANNOUNCEMENT = eINSTANCE.getStopInformationRequestStructure_StopAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Arrival Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__ARRIVAL_SCHEDULED = eINSTANCE.getStopInformationRequestStructure_ArrivalScheduled();

		/**
		 * The meta object literal for the '<em><b>Departure Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__DEPARTURE_SCHEDULED = eINSTANCE.getStopInformationRequestStructure_DepartureScheduled();

		/**
		 * The meta object literal for the '<em><b>Recorded Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__RECORDED_ARRIVAL_TIME = eINSTANCE.getStopInformationRequestStructure_RecordedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Distance To Next Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__DISTANCE_TO_NEXT_STOP = eINSTANCE.getStopInformationRequestStructure_DistanceToNextStop();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__CONNECTION = eINSTANCE.getStopInformationRequestStructure_Connection();

		/**
		 * The meta object literal for the '<em><b>Fare Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST_STRUCTURE__FARE_ZONE = eINSTANCE.getStopInformationRequestStructure_FareZone();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl <em>Stop Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.StopInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopInformationStructure()
		 * @generated
		 */
		EClass STOP_INFORMATION_STRUCTURE = eINSTANCE.getStopInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__STOP_INDEX = eINSTANCE.getStopInformationStructure_StopIndex();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__STOP_REF = eINSTANCE.getStopInformationStructure_StopRef();

		/**
		 * The meta object literal for the '<em><b>Stop Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__STOP_NAME = eINSTANCE.getStopInformationStructure_StopName();

		/**
		 * The meta object literal for the '<em><b>Stop Alternative Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME = eINSTANCE.getStopInformationStructure_StopAlternativeName();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__PLATFORM = eINSTANCE.getStopInformationStructure_Platform();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT = eINSTANCE.getStopInformationStructure_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Stop Announcement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT = eINSTANCE.getStopInformationStructure_StopAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Arrival Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED = eINSTANCE.getStopInformationStructure_ArrivalScheduled();

		/**
		 * The meta object literal for the '<em><b>Arrival Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED = eINSTANCE.getStopInformationStructure_ArrivalExpected();

		/**
		 * The meta object literal for the '<em><b>Departure Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED = eINSTANCE.getStopInformationStructure_DepartureScheduled();

		/**
		 * The meta object literal for the '<em><b>Departure Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED = eINSTANCE.getStopInformationStructure_DepartureExpected();

		/**
		 * The meta object literal for the '<em><b>Recorded Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME = eINSTANCE.getStopInformationStructure_RecordedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Distance To Next Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP = eINSTANCE.getStopInformationStructure_DistanceToNextStop();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__CONNECTION = eINSTANCE.getStopInformationStructure_Connection();

		/**
		 * The meta object literal for the '<em><b>Fare Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_STRUCTURE__FARE_ZONE = eINSTANCE.getStopInformationStructure_FareZone();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.StopPointTariffInformationStructureImpl <em>Stop Point Tariff Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.StopPointTariffInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopPointTariffInformationStructure()
		 * @generated
		 */
		EClass STOP_POINT_TARIFF_INFORMATION_STRUCTURE = eINSTANCE.getStopPointTariffInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Journey Stop Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION = eINSTANCE.getStopPointTariffInformationStructure_JourneyStopInformation();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION = eINSTANCE.getStopPointTariffInformationStructure_FareZoneInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.StopSequenceStructureImpl <em>Stop Sequence Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.StopSequenceStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getStopSequenceStructure()
		 * @generated
		 */
		EClass STOP_SEQUENCE_STRUCTURE = eINSTANCE.getStopSequenceStructure();

		/**
		 * The meta object literal for the '<em><b>Stop Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_SEQUENCE_STRUCTURE__STOP_POINT = eINSTANCE.getStopSequenceStructure_StopPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.SubscribeRequestStructureImpl <em>Subscribe Request Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.SubscribeRequestStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getSubscribeRequestStructure()
		 * @generated
		 */
		EClass SUBSCRIBE_REQUEST_STRUCTURE = eINSTANCE.getSubscribeRequestStructure();

		/**
		 * The meta object literal for the '<em><b>Client IP Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_REQUEST_STRUCTURE__CLIENT_IP_ADDRESS = eINSTANCE.getSubscribeRequestStructure_ClientIPAddress();

		/**
		 * The meta object literal for the '<em><b>Reply Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_REQUEST_STRUCTURE__REPLY_PORT = eINSTANCE.getSubscribeRequestStructure_ReplyPort();

		/**
		 * The meta object literal for the '<em><b>Reply Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_REQUEST_STRUCTURE__REPLY_PATH = eINSTANCE.getSubscribeRequestStructure_ReplyPath();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl <em>Subscribe Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getSubscribeResponseStructure()
		 * @generated
		 */
		EClass SUBSCRIBE_RESPONSE_STRUCTURE = eINSTANCE.getSubscribeResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE = eINSTANCE.getSubscribeResponseStructure_Active();

		/**
		 * The meta object literal for the '<em><b>Heartbeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT = eINSTANCE.getSubscribeResponseStructure_Heartbeat();

		/**
		 * The meta object literal for the '<em><b>Operation Error Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = eINSTANCE.getSubscribeResponseStructure_OperationErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.TimingPointStructureImpl <em>Timing Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.TimingPointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTimingPointStructure()
		 * @generated
		 */
		EClass TIMING_POINT_STRUCTURE = eINSTANCE.getTimingPointStructure();

		/**
		 * The meta object literal for the '<em><b>Timing Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_POINT_STRUCTURE__TIMING_POINT_REF = eINSTANCE.getTimingPointStructure_TimingPointRef();

		/**
		 * The meta object literal for the '<em><b>Schedule Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_POINT_STRUCTURE__SCHEDULE_TIME = eINSTANCE.getTimingPointStructure_ScheduleTime();

		/**
		 * The meta object literal for the '<em><b>GNSS Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_POINT_STRUCTURE__GNSS_POINT = eINSTANCE.getTimingPointStructure_GNSSPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl <em>Trip Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.TripInformationStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTripInformationStructure()
		 * @generated
		 */
		EClass TRIP_INFORMATION_STRUCTURE = eINSTANCE.getTripInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Trip Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__TRIP_REF = eINSTANCE.getTripInformationStructure_TripRef();

		/**
		 * The meta object literal for the '<em><b>Stop Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE = eINSTANCE.getTripInformationStructure_StopSequence();

		/**
		 * The meta object literal for the '<em><b>Location State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INFORMATION_STRUCTURE__LOCATION_STATE = eINSTANCE.getTripInformationStructure_LocationState();

		/**
		 * The meta object literal for the '<em><b>Timetable Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY = eINSTANCE.getTripInformationStructure_TimetableDelay();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE = eINSTANCE.getTripInformationStructure_AdditionalTextMessage();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage1();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage2();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage3();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage4();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage5();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage6();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message7</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage7();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message8</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage8();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message9</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9 = eINSTANCE.getTripInformationStructure_AdditionalTextMessage9();

		/**
		 * The meta object literal for the '<em><b>Additional Announcement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT = eINSTANCE.getTripInformationStructure_AdditionalAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Route Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION = eINSTANCE.getTripInformationStructure_RouteDirection();

		/**
		 * The meta object literal for the '<em><b>Run Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__RUN_NUMBER = eINSTANCE.getTripInformationStructure_RunNumber();

		/**
		 * The meta object literal for the '<em><b>Pattern Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER = eINSTANCE.getTripInformationStructure_PatternNumber();

		/**
		 * The meta object literal for the '<em><b>Path Destination Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER = eINSTANCE.getTripInformationStructure_PathDestinationNumber();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl <em>Trip Sequence Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTripSequenceStructure()
		 * @generated
		 */
		EClass TRIP_SEQUENCE_STRUCTURE = eINSTANCE.getTripSequenceStructure();

		/**
		 * The meta object literal for the '<em><b>Trip Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE_STRUCTURE__TRIP_REF = eINSTANCE.getTripSequenceStructure_TripRef();

		/**
		 * The meta object literal for the '<em><b>Trip Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX = eINSTANCE.getTripSequenceStructure_TripIndex();

		/**
		 * The meta object literal for the '<em><b>Trip Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE_STRUCTURE__TRIP_START = eINSTANCE.getTripSequenceStructure_TripStart();

		/**
		 * The meta object literal for the '<em><b>Current Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX = eINSTANCE.getTripSequenceStructure_CurrentStopIndex();

		/**
		 * The meta object literal for the '<em><b>Journey Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE = eINSTANCE.getTripSequenceStructure_JourneyMode();

		/**
		 * The meta object literal for the '<em><b>Point Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE = eINSTANCE.getTripSequenceStructure_PointSequence();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.TSPPointStructureImpl <em>TSP Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.TSPPointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getTSPPointStructure()
		 * @generated
		 */
		EClass TSP_POINT_STRUCTURE = eINSTANCE.getTSPPointStructure();

		/**
		 * The meta object literal for the '<em><b>TSP Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT_STRUCTURE__TSP_POINT_REF = eINSTANCE.getTSPPointStructure_TSPPointRef();

		/**
		 * The meta object literal for the '<em><b>TSP Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT_STRUCTURE__TSP_CODE = eINSTANCE.getTSPPointStructure_TSPCode();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT_STRUCTURE__SHORT_NAME = eINSTANCE.getTSPPointStructure_ShortName();

		/**
		 * The meta object literal for the '<em><b>Desciption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT_STRUCTURE__DESCIPTION = eINSTANCE.getTSPPointStructure_Desciption();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.UnsubscribeRequestStructureImpl <em>Unsubscribe Request Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.UnsubscribeRequestStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getUnsubscribeRequestStructure()
		 * @generated
		 */
		EClass UNSUBSCRIBE_REQUEST_STRUCTURE = eINSTANCE.getUnsubscribeRequestStructure();

		/**
		 * The meta object literal for the '<em><b>Client IP Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_REQUEST_STRUCTURE__CLIENT_IP_ADDRESS = eINSTANCE.getUnsubscribeRequestStructure_ClientIPAddress();

		/**
		 * The meta object literal for the '<em><b>Reply Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_REQUEST_STRUCTURE__REPLY_PORT = eINSTANCE.getUnsubscribeRequestStructure_ReplyPort();

		/**
		 * The meta object literal for the '<em><b>Reply Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_REQUEST_STRUCTURE__REPLY_PATH = eINSTANCE.getUnsubscribeRequestStructure_ReplyPath();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.UnsubscribeResponseStructureImpl <em>Unsubscribe Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.UnsubscribeResponseStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getUnsubscribeResponseStructure()
		 * @generated
		 */
		EClass UNSUBSCRIBE_RESPONSE_STRUCTURE = eINSTANCE.getUnsubscribeResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE = eINSTANCE.getUnsubscribeResponseStructure_Active();

		/**
		 * The meta object literal for the '<em><b>Operation Error Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = eINSTANCE.getUnsubscribeResponseStructure_OperationErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.VehicleStructureImpl <em>Vehicle Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.VehicleStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getVehicleStructure()
		 * @generated
		 */
		EClass VEHICLE_STRUCTURE = eINSTANCE.getVehicleStructure();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_STRUCTURE__VEHICLE_TYPE_REF = eINSTANCE.getVehicleStructure_VehicleTypeRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_STRUCTURE__NAME = eINSTANCE.getVehicleStructure_Name();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl <em>Via Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ViaPointStructureImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getViaPointStructure()
		 * @generated
		 */
		EClass VIA_POINT_STRUCTURE = eINSTANCE.getViaPointStructure();

		/**
		 * The meta object literal for the '<em><b>Via Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT_STRUCTURE__VIA_POINT_REF = eINSTANCE.getViaPointStructure_ViaPointRef();

		/**
		 * The meta object literal for the '<em><b>Place Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT_STRUCTURE__PLACE_REF = eINSTANCE.getViaPointStructure_PlaceRef();

		/**
		 * The meta object literal for the '<em><b>Place Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT_STRUCTURE__PLACE_NAME = eINSTANCE.getViaPointStructure_PlaceName();

		/**
		 * The meta object literal for the '<em><b>Place Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT_STRUCTURE__PLACE_SHORT_NAME = eINSTANCE.getViaPointStructure_PlaceShortName();

		/**
		 * The meta object literal for the '<em><b>Via Point Display Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY = eINSTANCE.getViaPointStructure_ViaPointDisplayPriority();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.common.impl.ZoneTypeImpl <em>Zone Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.common.impl.ZoneTypeImpl
		 * @see de.jena.mdo.ibis.common.impl.IbisCommonPackageImpl#getZoneType()
		 * @generated
		 */
		EClass ZONE_TYPE = eINSTANCE.getZoneType();

		/**
		 * The meta object literal for the '<em><b>Farezone Type ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_TYPE__FAREZONE_TYPE_ID = eINSTANCE.getZoneType_FarezoneTypeID();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Type Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_TYPE__FARE_ZONE_TYPE_NAME = eINSTANCE.getZoneType_FareZoneTypeName();

	}

} //IbisCommonPackage
