/*
 */
package de.jena.mdo.ibis.ibis_common;

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
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonFactory
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
	String eNAME = "ibis_common";

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
	String eNS_PREFIX = "ibis_common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisCommonPackage eINSTANCE = de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl <em>Additional Announcement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getAdditionalAnnouncement()
	 * @generated
	 */
	int ADDITIONAL_ANNOUNCEMENT = 0;

	/**
	 * The feature id for the '<em><b>Announcement Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Announcement Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Announcement TTS Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Immediate Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Periodical Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Specific Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT = 5;

	/**
	 * The number of structural features of the '<em>Additional Announcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Additional Announcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ANNOUNCEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.AnnouncementImpl <em>Announcement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.AnnouncementImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getAnnouncement()
	 * @generated
	 */
	int ANNOUNCEMENT = 1;

	/**
	 * The feature id for the '<em><b>Announcement Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT__ANNOUNCEMENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Announcement Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT__ANNOUNCEMENT_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Announcement TTS Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT = 2;

	/**
	 * The number of structural features of the '<em>Announcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Announcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOUNCEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.BayAreaImpl <em>Bay Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.BayAreaImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getBayArea()
	 * @generated
	 */
	int BAY_AREA = 2;

	/**
	 * The feature id for the '<em><b>Before Bay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA__BEFORE_BAY = 0;

	/**
	 * The feature id for the '<em><b>Behind Bay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA__BEHIND_BAY = 1;

	/**
	 * The number of structural features of the '<em>Bay Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bay Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.BeaconPointImpl <em>Beacon Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.BeaconPointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getBeaconPoint()
	 * @generated
	 */
	int BEACON_POINT = 3;

	/**
	 * The feature id for the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT__POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Beacon Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT__BEACON_CODE = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Desciption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT__DESCIPTION = 3;

	/**
	 * The number of structural features of the '<em>Beacon Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Beacon Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEACON_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.CardApplInformationsImpl <em>Card Appl Informations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.CardApplInformationsImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getCardApplInformations()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.CardTicketDataImpl <em>Card Ticket Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.CardTicketDataImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getCardTicketData()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl <em>Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getCardType()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STOP_REF = 0;

	/**
	 * The feature id for the '<em><b>Connection Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_REF = 1;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DISPLAY_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_STATE = 5;

	/**
	 * The feature id for the '<em><b>Transport Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TRANSPORT_MODE = 6;

	/**
	 * The feature id for the '<em><b>Connection Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_MODE = 7;

	/**
	 * The feature id for the '<em><b>Expected Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__EXPECTED_DEPARTURE_TIME = 8;

	/**
	 * The feature id for the '<em><b>Scheduled Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SCHEDULED_DEPARTURE_TIME = 9;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl <em>Data Accepted Response Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataAcceptedResponseData()
	 * @generated
	 */
	int DATA_ACCEPTED_RESPONSE_DATA = 8;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Data Accepted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED = 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE = 2;

	/**
	 * The feature id for the '<em><b>Error Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION = 3;

	/**
	 * The number of structural features of the '<em>Data Accepted Response Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Accepted Response Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl <em>General Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGeneralResponse()
	 * @generated
	 */
	int GENERAL_RESPONSE = 84;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>General Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>General Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseImpl <em>Data Accepted Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataAcceptedResponse()
	 * @generated
	 */
	int DATA_ACCEPTED_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE__OPERATION_ERROR_MESSAGE = GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Data Accepted Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA = GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Accepted Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_FEATURE_COUNT = GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Accepted Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCEPTED_RESPONSE_OPERATION_COUNT = GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataVersionListImpl <em>Data Version List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DataVersionListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataVersionList()
	 * @generated
	 */
	int DATA_VERSION_LIST = 10;

	/**
	 * The feature id for the '<em><b>Data Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_LIST__DATA_VERSION = 0;

	/**
	 * The number of structural features of the '<em>Data Version List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Version List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataVersionImpl <em>Data Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DataVersionImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataVersion()
	 * @generated
	 */
	int DATA_VERSION = 11;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Version Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION__VERSION_REF = 1;

	/**
	 * The number of structural features of the '<em>Data Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DegreeTypeImpl <em>Degree Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DegreeTypeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDegreeType()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DestinationImpl <em>Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DestinationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDestination()
	 * @generated
	 */
	int DESTINATION = 13;

	/**
	 * The feature id for the '<em><b>Destination Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__DESTINATION_REF = 0;

	/**
	 * The feature id for the '<em><b>Destination Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__DESTINATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Destination Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__DESTINATION_SHORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl <em>Device Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceInformation()
	 * @generated
	 */
	int DEVICE_INFORMATION = 14;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION__DEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION__MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION__SERIAL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Device Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION__DEVICE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Data Version List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION__DATA_VERSION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Web Interface Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Device Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Device Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationListImpl <em>Device Specification List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecificationList()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_LIST = 15;

	/**
	 * The feature id for the '<em><b>Device Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Device Specification List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Specification List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationImpl <em>Device Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecification()
	 * @generated
	 */
	int DEVICE_SPECIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Device Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION__DEVICE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION__DEVICE_ID = 1;

	/**
	 * The number of structural features of the '<em>Device Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateListImpl <em>Device Specification With State List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithStateList()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST = 17;

	/**
	 * The feature id for the '<em><b>Device Specification With State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE = 0;

	/**
	 * The number of structural features of the '<em>Device Specification With State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Specification With State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateImpl <em>Device Specification With State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithState()
	 * @generated
	 */
	int DEVICE_SPECIFICATION_WITH_STATE = 18;

	/**
	 * The feature id for the '<em><b>Device Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Device Specification With State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Specification With State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SPECIFICATION_WITH_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DisplayContentImpl <em>Display Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DisplayContentImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDisplayContent()
	 * @generated
	 */
	int DISPLAY_CONTENT = 19;

	/**
	 * The feature id for the '<em><b>Display Content Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__DISPLAY_CONTENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Line Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__LINE_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Via Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__VIA_POINT = 3;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Additional Information1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION1 = 5;

	/**
	 * The feature id for the '<em><b>Additional Information2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION2 = 6;

	/**
	 * The feature id for the '<em><b>Additional Information3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION3 = 7;

	/**
	 * The feature id for the '<em><b>Additional Information4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION4 = 8;

	/**
	 * The feature id for the '<em><b>Additional Information5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION5 = 9;

	/**
	 * The feature id for the '<em><b>Additional Information6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION6 = 10;

	/**
	 * The feature id for the '<em><b>Additional Information7</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION7 = 11;

	/**
	 * The feature id for the '<em><b>Additional Information8</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION8 = 12;

	/**
	 * The feature id for the '<em><b>Additional Information9</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__ADDITIONAL_INFORMATION9 = 13;

	/**
	 * The feature id for the '<em><b>Run Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__RUN_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__PRIORITY = 15;

	/**
	 * The feature id for the '<em><b>Period Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__PERIOD_DURATION = 16;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT__DURATION = 17;

	/**
	 * The number of structural features of the '<em>Display Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Display Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DocumentRootImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorCountingListImpl <em>Door Counting List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DoorCountingListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorCountingList()
	 * @generated
	 */
	int DOOR_COUNTING_LIST = 21;

	/**
	 * The feature id for the '<em><b>Door ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST__DOOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Count Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST__COUNT_SET = 1;

	/**
	 * The number of structural features of the '<em>Door Counting List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door Counting List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorCountingImpl <em>Door Counting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DoorCountingImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorCounting()
	 * @generated
	 */
	int DOOR_COUNTING = 22;

	/**
	 * The feature id for the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING__OBJECT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING__IN = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING__OUT = 2;

	/**
	 * The feature id for the '<em><b>Count Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING__COUNT_QUALITY = 3;

	/**
	 * The number of structural features of the '<em>Door Counting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Door Counting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_COUNTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl <em>Door Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorInformation()
	 * @generated
	 */
	int DOOR_INFORMATION = 23;

	/**
	 * The feature id for the '<em><b>Door ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION__DOOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION__COUNT = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION__STATE = 2;

	/**
	 * The number of structural features of the '<em>Door Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Door Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorOpenStateImpl <em>Door Open State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DoorOpenStateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorOpenState()
	 * @generated
	 */
	int DOOR_OPEN_STATE = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>Door Open State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door Open State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPEN_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorOperationStateImpl <em>Door Operation State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DoorOperationStateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorOperationState()
	 * @generated
	 */
	int DOOR_OPERATION_STATE = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>Door Operation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door Operation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorStateImpl <em>Door State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.DoorStateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorState()
	 * @generated
	 */
	int DOOR_STATE = 26;

	/**
	 * The feature id for the '<em><b>Open State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE__OPEN_STATE = 0;

	/**
	 * The feature id for the '<em><b>Operation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE__OPERATION_STATE = 1;

	/**
	 * The number of structural features of the '<em>Door State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Door State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.FareZoneInformationImpl <em>Fare Zone Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.FareZoneInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getFareZoneInformation()
	 * @generated
	 */
	int FARE_ZONE_INFORMATION = 27;

	/**
	 * The feature id for the '<em><b>Fare Zone ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION__FARE_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION__FARE_ZONE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Fare Zone Long Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION__FARE_ZONE_LONG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Fare Zone Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION__FARE_ZONE_SHORT_NAME = 3;

	/**
	 * The number of structural features of the '<em>Fare Zone Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fare Zone Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ZONE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.GlobalCardStatusImpl <em>Global Card Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.GlobalCardStatusImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGlobalCardStatus()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.GNSSCoordinateImpl <em>GNSS Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.GNSSCoordinateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGNSSCoordinate()
	 * @generated
	 */
	int GNSS_COORDINATE = 29;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE__DEGREE = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>GNSS Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GNSS Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_COORDINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.GNSSPointImpl <em>GNSS Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.GNSSPointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGNSSPoint()
	 * @generated
	 */
	int GNSS_POINT = 30;

	/**
	 * The feature id for the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT__POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT__LATITUDE = 2;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT__ALTITUDE = 3;

	/**
	 * The number of structural features of the '<em>GNSS Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GNSS Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPAnyURIImpl <em>IBISIP Any URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPAnyURIImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPAnyURI()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPBooleanImpl <em>IBISIP Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPBooleanImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPBoolean()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPByteImpl <em>IBISIP Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPByteImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPByte()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDateImpl <em>IBISIP Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDate()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDateTimeImpl <em>IBISIP Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDateTimeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDateTime()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDoubleImpl <em>IBISIP Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDoubleImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDouble()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDurationImpl <em>IBISIP Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDurationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDuration()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPIntImpl <em>IBISIP Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPIntImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPInt()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPLanguageImpl <em>IBISIP Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPLanguageImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPLanguage()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPNMTOKENImpl <em>IBISIPNMTOKEN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPNMTOKENImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPNMTOKEN()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPNonNegativeIntegerImpl <em>IBISIP Non Negative Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPNonNegativeIntegerImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPNonNegativeInteger()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPNormalizedStringImpl <em>IBISIP Normalized String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPNormalizedStringImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPNormalizedString()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPStringImpl <em>IBISIP String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPStringImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPString()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPTimeImpl <em>IBISIP Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPTimeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPTime()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedIntImpl <em>IBISIP Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedIntImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPUnsignedInt()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedLongImpl <em>IBISIP Unsigned Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedLongImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPUnsignedLong()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl <em>International Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getInternationalTextType()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl <em>Journey Stop Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getJourneyStopInformation()
	 * @generated
	 */
	int JOURNEY_STOP_INFORMATION = 48;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__STOP_REF = 0;

	/**
	 * The feature id for the '<em><b>Stop Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__STOP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Stop Alternative Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__PLATFORM = 3;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__ANNOUNCEMENT = 5;

	/**
	 * The feature id for the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED = 6;

	/**
	 * The feature id for the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED = 7;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Bay Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__BAY_AREA = 9;

	/**
	 * The feature id for the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__GNSS_POINT = 10;

	/**
	 * The feature id for the '<em><b>Fare Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION__FARE_ZONE = 11;

	/**
	 * The number of structural features of the '<em>Journey Stop Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Journey Stop Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_STOP_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.LineInformationImpl <em>Line Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.LineInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getLineInformation()
	 * @generated
	 */
	int LINE_INFORMATION = 49;

	/**
	 * The feature id for the '<em><b>Line Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION__LINE_REF = 0;

	/**
	 * The feature id for the '<em><b>Line Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION__LINE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Line Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION__LINE_SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION__LINE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION__LINE_CODE = 4;

	/**
	 * The number of structural features of the '<em>Line Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Line Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.LogMessageImpl <em>Log Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.LogMessageImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getLogMessage()
	 * @generated
	 */
	int LOG_MESSAGE = 50;

	/**
	 * The feature id for the '<em><b>Message Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__MESSAGE_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Log Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Log Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.MessageImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 51;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_ID = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Message Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_TEXT = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl <em>Netex Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getNetexMode()
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
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.PointSequenceImpl <em>Point Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.PointSequenceImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getPointSequence()
	 * @generated
	 */
	int POINT_SEQUENCE = 53;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_SEQUENCE__POINT = 0;

	/**
	 * The number of structural features of the '<em>Point Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Point Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.PointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 54;

	/**
	 * The feature id for the '<em><b>Point Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__POINT_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Point Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__POINT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Distance To Previous Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__DISTANCE_TO_PREVIOUS_POINT = 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__STOP_POINT = 0;

	/**
	 * The feature id for the '<em><b>Beacon Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__BEACON_POINT = 1;

	/**
	 * The feature id for the '<em><b>GNSS Location Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__GNSS_LOCATION_POINT = 2;

	/**
	 * The feature id for the '<em><b>Timing Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TIMING_POINT = 3;

	/**
	 * The feature id for the '<em><b>TSP Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TSP_POINT = 4;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationImpl <em>Service Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceIdentification()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION = 56;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Service Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateListImpl <em>Service Identification With State List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceIdentificationWithStateList()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST = 57;

	/**
	 * The feature id for the '<em><b>Service Identification With State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE = 0;

	/**
	 * The number of structural features of the '<em>Service Identification With State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Identification With State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateImpl <em>Service Identification With State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceIdentificationWithState()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE = 58;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE__SERVICE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE__SERVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Service Identification With State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Identification With State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_WITH_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceInformationListImpl <em>Service Information List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceInformationListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceInformationList()
	 * @generated
	 */
	int SERVICE_INFORMATION_LIST = 59;

	/**
	 * The feature id for the '<em><b>Service Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_LIST__SERVICE_INFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Service Information List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Information List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceInformationImpl <em>Service Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceInformation()
	 * @generated
	 */
	int SERVICE_INFORMATION = 60;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION__AUTOSTART = 1;

	/**
	 * The number of structural features of the '<em>Service Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationImpl <em>Service Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceSpecification()
	 * @generated
	 */
	int SERVICE_SPECIFICATION = 61;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__SERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>IBISIP Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__IBISIP_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Service Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateListImpl <em>Service Specification With State List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceSpecificationWithStateList()
	 * @generated
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST = 62;

	/**
	 * The feature id for the '<em><b>Service Specification With State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE = 0;

	/**
	 * The number of structural features of the '<em>Service Specification With State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Specification With State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateImpl <em>Service Specification With State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceSpecificationWithState()
	 * @generated
	 */
	int SERVICE_SPECIFICATION_WITH_STATE = 63;

	/**
	 * The feature id for the '<em><b>Service Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE__SERVICE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE__SERVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Service Specification With State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Specification With State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_WITH_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartListImpl <em>Service Start List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceStartListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceStartList()
	 * @generated
	 */
	int SERVICE_START_LIST = 64;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_LIST__SERVICE_IDENTIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Service Start List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Start List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartImpl <em>Service Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceStartImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceStart()
	 * @generated
	 */
	int SERVICE_START = 65;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START__SERVICE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START__AUTOSTART = 1;

	/**
	 * The number of structural features of the '<em>Service Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ShortTripStopListImpl <em>Short Trip Stop List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ShortTripStopListImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getShortTripStopList()
	 * @generated
	 */
	int SHORT_TRIP_STOP_LIST = 66;

	/**
	 * The feature id for the '<em><b>Short Trip Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_LIST__SHORT_TRIP_STOP = 0;

	/**
	 * The number of structural features of the '<em>Short Trip Stop List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Short Trip Stop List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ShortTripStopImpl <em>Short Trip Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ShortTripStopImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getShortTripStop()
	 * @generated
	 */
	int SHORT_TRIP_STOP = 67;

	/**
	 * The feature id for the '<em><b>Journey Stop Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP__FARE_ZONE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Short Trip Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Short Trip Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TRIP_STOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.SpecificPointImpl <em>Specific Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.SpecificPointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getSpecificPoint()
	 * @generated
	 */
	int SPECIFIC_POINT = 68;

	/**
	 * The feature id for the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT__POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Distance To Previous Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT__DISTANCE_TO_PREVIOUS_POINT = 1;

	/**
	 * The number of structural features of the '<em>Specific Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specific Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopInformationRequestImpl <em>Stop Information Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.StopInformationRequestImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopInformationRequest()
	 * @generated
	 */
	int STOP_INFORMATION_REQUEST = 69;

	/**
	 * The feature id for the '<em><b>Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__STOP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__STOP_REF = 1;

	/**
	 * The feature id for the '<em><b>Stop Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__STOP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__DISPLAY_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Stop Announcement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__STOP_ANNOUNCEMENT = 4;

	/**
	 * The feature id for the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__ARRIVAL_SCHEDULED = 5;

	/**
	 * The feature id for the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__DEPARTURE_SCHEDULED = 6;

	/**
	 * The feature id for the '<em><b>Recorded Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__RECORDED_ARRIVAL_TIME = 7;

	/**
	 * The feature id for the '<em><b>Distance To Next Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__DISTANCE_TO_NEXT_STOP = 8;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Fare Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST__FARE_ZONE = 10;

	/**
	 * The number of structural features of the '<em>Stop Information Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Stop Information Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopInformationImpl <em>Stop Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.StopInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopInformation()
	 * @generated
	 */
	int STOP_INFORMATION = 70;

	/**
	 * The feature id for the '<em><b>Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__STOP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Stop Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__STOP_REF = 1;

	/**
	 * The feature id for the '<em><b>Stop Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__STOP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Stop Alternative Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__STOP_ALTERNATIVE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__DISPLAY_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Stop Announcement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__STOP_ANNOUNCEMENT = 6;

	/**
	 * The feature id for the '<em><b>Arrival Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__ARRIVAL_SCHEDULED = 7;

	/**
	 * The feature id for the '<em><b>Arrival Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__ARRIVAL_EXPECTED = 8;

	/**
	 * The feature id for the '<em><b>Departure Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__DEPARTURE_SCHEDULED = 9;

	/**
	 * The feature id for the '<em><b>Departure Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__DEPARTURE_EXPECTED = 10;

	/**
	 * The feature id for the '<em><b>Recorded Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__RECORDED_ARRIVAL_TIME = 11;

	/**
	 * The feature id for the '<em><b>Distance To Next Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__DISTANCE_TO_NEXT_STOP = 12;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Fare Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION__FARE_ZONE = 14;

	/**
	 * The number of structural features of the '<em>Stop Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Stop Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopPointTariffInformationImpl <em>Stop Point Tariff Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.StopPointTariffInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopPointTariffInformation()
	 * @generated
	 */
	int STOP_POINT_TARIFF_INFORMATION = 71;

	/**
	 * The feature id for the '<em><b>Journey Stop Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION__JOURNEY_STOP_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Fare Zone Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION__FARE_ZONE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Stop Point Tariff Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stop Point Tariff Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_POINT_TARIFF_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopSequenceImpl <em>Stop Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.StopSequenceImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopSequence()
	 * @generated
	 */
	int STOP_SEQUENCE = 72;

	/**
	 * The feature id for the '<em><b>Stop Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SEQUENCE__STOP_POINT = 0;

	/**
	 * The number of structural features of the '<em>Stop Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.SubscribeRequestImpl <em>Subscribe Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.SubscribeRequestImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getSubscribeRequest()
	 * @generated
	 */
	int SUBSCRIBE_REQUEST = 73;

	/**
	 * The feature id for the '<em><b>Client IP Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reply Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST__REPLY_PORT = 1;

	/**
	 * The feature id for the '<em><b>Reply Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST__REPLY_PATH = 2;

	/**
	 * The number of structural features of the '<em>Subscribe Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subscribe Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.SubscribeResponseImpl <em>Subscribe Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.SubscribeResponseImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getSubscribeResponse()
	 * @generated
	 */
	int SUBSCRIBE_RESPONSE = 74;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE__OPERATION_ERROR_MESSAGE = GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE__ACTIVE = GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heartbeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE__HEARTBEAT = GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subscribe Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_FEATURE_COUNT = GENERAL_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subscribe Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_RESPONSE_OPERATION_COUNT = GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.TimingPointImpl <em>Timing Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.TimingPointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTimingPoint()
	 * @generated
	 */
	int TIMING_POINT = 75;

	/**
	 * The feature id for the '<em><b>Timing Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT__TIMING_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Schedule Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT__SCHEDULE_TIME = 1;

	/**
	 * The feature id for the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT__GNSS_POINT = 2;

	/**
	 * The number of structural features of the '<em>Timing Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Timing Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.TripInformationImpl <em>Trip Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.TripInformationImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTripInformation()
	 * @generated
	 */
	int TRIP_INFORMATION = 76;

	/**
	 * The feature id for the '<em><b>Trip Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__TRIP_REF = 0;

	/**
	 * The feature id for the '<em><b>Stop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__STOP_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Location State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__LOCATION_STATE = 2;

	/**
	 * The feature id for the '<em><b>Timetable Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__TIMETABLE_DELAY = 3;

	/**
	 * The feature id for the '<em><b>Additional Text Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Additional Text Message1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE1 = 5;

	/**
	 * The feature id for the '<em><b>Additional Text Message2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE2 = 6;

	/**
	 * The feature id for the '<em><b>Additional Text Message3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE3 = 7;

	/**
	 * The feature id for the '<em><b>Additional Text Message4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE4 = 8;

	/**
	 * The feature id for the '<em><b>Additional Text Message5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE5 = 9;

	/**
	 * The feature id for the '<em><b>Additional Text Message6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE6 = 10;

	/**
	 * The feature id for the '<em><b>Additional Text Message7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE7 = 11;

	/**
	 * The feature id for the '<em><b>Additional Text Message8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE8 = 12;

	/**
	 * The feature id for the '<em><b>Additional Text Message9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE9 = 13;

	/**
	 * The feature id for the '<em><b>Additional Announcement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ADDITIONAL_ANNOUNCEMENT = 14;

	/**
	 * The feature id for the '<em><b>Route Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__ROUTE_DIRECTION = 15;

	/**
	 * The feature id for the '<em><b>Run Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__RUN_NUMBER = 16;

	/**
	 * The feature id for the '<em><b>Pattern Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__PATTERN_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Path Destination Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION__PATH_DESTINATION_NUMBER = 18;

	/**
	 * The number of structural features of the '<em>Trip Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Trip Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.TripSequenceImpl <em>Trip Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.TripSequenceImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTripSequence()
	 * @generated
	 */
	int TRIP_SEQUENCE = 77;

	/**
	 * The feature id for the '<em><b>Trip Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE__TRIP_REF = 0;

	/**
	 * The feature id for the '<em><b>Trip Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE__TRIP_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Trip Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE__TRIP_START = 2;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE__CURRENT_STOP_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Journey Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE__JOURNEY_MODE = 4;

	/**
	 * The feature id for the '<em><b>Point Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE__POINT_SEQUENCE = 5;

	/**
	 * The number of structural features of the '<em>Trip Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Trip Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl <em>TSP Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTSPPoint()
	 * @generated
	 */
	int TSP_POINT = 78;

	/**
	 * The feature id for the '<em><b>TSP Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT__TSP_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>TSP Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT__TSP_CODE = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Desciption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT__DESCIPTION = 3;

	/**
	 * The number of structural features of the '<em>TSP Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TSP Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl <em>Unsubscribe Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getUnsubscribeRequest()
	 * @generated
	 */
	int UNSUBSCRIBE_REQUEST = 79;

	/**
	 * The feature id for the '<em><b>Client IP Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reply Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST__REPLY_PORT = 1;

	/**
	 * The feature id for the '<em><b>Reply Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST__REPLY_PATH = 2;

	/**
	 * The number of structural features of the '<em>Unsubscribe Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unsubscribe Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeResponseImpl <em>Unsubscribe Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.UnsubscribeResponseImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getUnsubscribeResponse()
	 * @generated
	 */
	int UNSUBSCRIBE_RESPONSE = 80;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE__OPERATION_ERROR_MESSAGE = GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE__ACTIVE = GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unsubscribe Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE_FEATURE_COUNT = GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unsubscribe Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUBSCRIBE_RESPONSE_OPERATION_COUNT = GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.VehicleImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 81;

	/**
	 * The feature id for the '<em><b>Vehicle Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLE_TYPE_REF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ViaPointImpl <em>Via Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ViaPointImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getViaPoint()
	 * @generated
	 */
	int VIA_POINT = 82;

	/**
	 * The feature id for the '<em><b>Via Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT__VIA_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Place Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT__PLACE_REF = 1;

	/**
	 * The feature id for the '<em><b>Place Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT__PLACE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Place Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT__PLACE_SHORT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Via Point Display Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT__VIA_POINT_DISPLAY_PRIORITY = 4;

	/**
	 * The number of structural features of the '<em>Via Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Via Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_common.impl.ZoneTypeImpl <em>Zone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_common.impl.ZoneTypeImpl
	 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getZoneType()
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
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement <em>Additional Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement
	 * @generated
	 */
	EClass getAdditionalAnnouncement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementRef <em>Announcement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Announcement Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementRef()
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 */
	EReference getAdditionalAnnouncement_AnnouncementRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementText <em>Announcement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementText()
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 */
	EReference getAdditionalAnnouncement_AnnouncementText();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementTTSText <em>Announcement TTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement TTS Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getAnnouncementTTSText()
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 */
	EReference getAdditionalAnnouncement_AnnouncementTTSText();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getImmediateInformation <em>Immediate Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Immediate Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getImmediateInformation()
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 */
	EReference getAdditionalAnnouncement_ImmediateInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getPeriodicalInformation <em>Periodical Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodical Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getPeriodicalInformation()
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 */
	EReference getAdditionalAnnouncement_PeriodicalInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getSpecificPoint <em>Specific Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specific Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement#getSpecificPoint()
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 */
	EReference getAdditionalAnnouncement_SpecificPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.Announcement <em>Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Announcement
	 * @generated
	 */
	EClass getAnnouncement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementRef <em>Announcement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Announcement Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementRef()
	 * @see #getAnnouncement()
	 * @generated
	 */
	EReference getAnnouncement_AnnouncementRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementText <em>Announcement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementText()
	 * @see #getAnnouncement()
	 * @generated
	 */
	EReference getAnnouncement_AnnouncementText();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementTTSText <em>Announcement TTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Announcement TTS Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Announcement#getAnnouncementTTSText()
	 * @see #getAnnouncement()
	 * @generated
	 */
	EReference getAnnouncement_AnnouncementTTSText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.BayArea <em>Bay Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bay Area</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BayArea
	 * @generated
	 */
	EClass getBayArea();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.BayArea#getBeforeBay <em>Before Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before Bay</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BayArea#getBeforeBay()
	 * @see #getBayArea()
	 * @generated
	 */
	EReference getBayArea_BeforeBay();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.BayArea#getBehindBay <em>Behind Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behind Bay</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BayArea#getBehindBay()
	 * @see #getBayArea()
	 * @generated
	 */
	EReference getBayArea_BehindBay();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint <em>Beacon Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beacon Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BeaconPoint
	 * @generated
	 */
	EClass getBeaconPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getPointRef <em>Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BeaconPoint#getPointRef()
	 * @see #getBeaconPoint()
	 * @generated
	 */
	EReference getBeaconPoint_PointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getBeaconCode <em>Beacon Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beacon Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BeaconPoint#getBeaconCode()
	 * @see #getBeaconPoint()
	 * @generated
	 */
	EReference getBeaconPoint_BeaconCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BeaconPoint#getShortName()
	 * @see #getBeaconPoint()
	 * @generated
	 */
	EReference getBeaconPoint_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getDesciption <em>Desciption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Desciption</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.BeaconPoint#getDesciption()
	 * @see #getBeaconPoint()
	 * @generated
	 */
	EReference getBeaconPoint_Desciption();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.CardApplInformations <em>Card Appl Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Appl Informations</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardApplInformations
	 * @generated
	 */
	EClass getCardApplInformations();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationLength <em>Card Appl Information Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Appl Information Length</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationLength()
	 * @see #getCardApplInformations()
	 * @generated
	 */
	EReference getCardApplInformations_CardApplInformationLength();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationData <em>Card Appl Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Appl Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationData()
	 * @see #getCardApplInformations()
	 * @generated
	 */
	EReference getCardApplInformations_CardApplInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.CardTicketData <em>Card Ticket Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Ticket Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardTicketData
	 * @generated
	 */
	EClass getCardTicketData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataID <em>Card Ticket Data ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Ticket Data ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataID()
	 * @see #getCardTicketData()
	 * @generated
	 */
	EReference getCardTicketData_CardTicketDataID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataLength <em>Card Ticket Data Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Ticket Data Length</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataLength()
	 * @see #getCardTicketData()
	 * @generated
	 */
	EReference getCardTicketData_CardTicketDataLength();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketData <em>Card Ticket Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Ticket Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketData()
	 * @see #getCardTicketData()
	 * @generated
	 */
	EReference getCardTicketData_CardTicketData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardType
	 * @generated
	 */
	EClass getCardType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.CardType#getCardSerialNumber <em>Card Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Serial Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardType#getCardSerialNumber()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_CardSerialNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.CardType#getCardTypeID <em>Card Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Type ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardType#getCardTypeID()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_CardTypeID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.CardType#getCardTypeText <em>Card Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Type Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.CardType#getCardTypeText()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_CardTypeText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getStopRef()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_StopRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getConnectionRef <em>Connection Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getConnectionRef()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionRef();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.Connection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getConnectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getDisplayContent()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_DisplayContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getPlatform()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Platform();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.Connection#getConnectionState <em>Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getConnectionState()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getTransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getTransportMode()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TransportMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getConnectionMode <em>Connection Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getConnectionMode()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getExpectedDepartureTime <em>Expected Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Departure Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getExpectedDepartureTime()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ExpectedDepartureTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Connection#getScheduledDepartureTime <em>Scheduled Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduled Departure Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Connection#getScheduledDepartureTime()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ScheduledDepartureTime();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData <em>Data Accepted Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Accepted Response Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData
	 * @generated
	 */
	EClass getDataAcceptedResponseData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getTimeStamp()
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 */
	EReference getDataAcceptedResponseData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getDataAccepted <em>Data Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Accepted</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getDataAccepted()
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 */
	EReference getDataAcceptedResponseData_DataAccepted();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getErrorCode()
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 */
	EAttribute getDataAcceptedResponseData_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getErrorInformation <em>Error Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData#getErrorInformation()
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 */
	EReference getDataAcceptedResponseData_ErrorInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponse <em>Data Accepted Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Accepted Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponse
	 * @generated
	 */
	EClass getDataAcceptedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponse#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Accepted Response Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponse#getDataAcceptedResponseData()
	 * @see #getDataAcceptedResponse()
	 * @generated
	 */
	EReference getDataAcceptedResponse_DataAcceptedResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DataVersionList <em>Data Version List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Version List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersionList
	 * @generated
	 */
	EClass getDataVersionList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DataVersionList#getDataVersion <em>Data Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Version</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersionList#getDataVersion()
	 * @see #getDataVersionList()
	 * @generated
	 */
	EReference getDataVersionList_DataVersion();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DataVersion <em>Data Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Version</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersion
	 * @generated
	 */
	EClass getDataVersion();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DataVersion#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersion#getDataType()
	 * @see #getDataVersion()
	 * @generated
	 */
	EReference getDataVersion_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DataVersion#getVersionRef <em>Version Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersion#getVersionRef()
	 * @see #getDataVersion()
	 * @generated
	 */
	EReference getDataVersion_VersionRef();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DegreeType <em>Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DegreeType
	 * @generated
	 */
	EClass getDegreeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DegreeType#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degree</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DegreeType#getDegree()
	 * @see #getDegreeType()
	 * @generated
	 */
	EReference getDegreeType_Degree();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DegreeType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DegreeType#getOrientation()
	 * @see #getDegreeType()
	 * @generated
	 */
	EReference getDegreeType_Orientation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Destination
	 * @generated
	 */
	EClass getDestination();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationRef <em>Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Destination#getDestinationRef()
	 * @see #getDestination()
	 * @generated
	 */
	EReference getDestination_DestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationName <em>Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destination Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Destination#getDestinationName()
	 * @see #getDestination()
	 * @generated
	 */
	EReference getDestination_DestinationName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationShortName <em>Destination Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destination Short Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Destination#getDestinationShortName()
	 * @see #getDestination()
	 * @generated
	 */
	EReference getDestination_DestinationShortName();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation
	 * @generated
	 */
	EClass getDeviceInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation#getDeviceName()
	 * @see #getDeviceInformation()
	 * @generated
	 */
	EReference getDeviceInformation_DeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation#getManufacturer()
	 * @see #getDeviceInformation()
	 * @generated
	 */
	EReference getDeviceInformation_Manufacturer();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serial Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation#getSerialNumber()
	 * @see #getDeviceInformation()
	 * @generated
	 */
	EReference getDeviceInformation_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation#getDeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Class</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation#getDeviceClass()
	 * @see #getDeviceInformation()
	 * @generated
	 */
	EAttribute getDeviceInformation_DeviceClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation#getDataVersionList <em>Data Version List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Version List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation#getDataVersionList()
	 * @see #getDeviceInformation()
	 * @generated
	 */
	EReference getDeviceInformation_DataVersionList();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation#getWebInterfaceAddress <em>Web Interface Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Interface Address</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation#getWebInterfaceAddress()
	 * @see #getDeviceInformation()
	 * @generated
	 */
	EReference getDeviceInformation_WebInterfaceAddress();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationList <em>Device Specification List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationList
	 * @generated
	 */
	EClass getDeviceSpecificationList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationList#getDeviceSpecification <em>Device Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Specification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationList#getDeviceSpecification()
	 * @see #getDeviceSpecificationList()
	 * @generated
	 */
	EReference getDeviceSpecificationList_DeviceSpecification();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecification <em>Device Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecification
	 * @generated
	 */
	EClass getDeviceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecification#getDeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Class</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecification#getDeviceClass()
	 * @see #getDeviceSpecification()
	 * @generated
	 */
	EAttribute getDeviceSpecification_DeviceClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecification#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecification#getDeviceID()
	 * @see #getDeviceSpecification()
	 * @generated
	 */
	EReference getDeviceSpecification_DeviceID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList <em>Device Specification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification With State List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList
	 * @generated
	 */
	EClass getDeviceSpecificationWithStateList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList#getDeviceSpecificationWithState <em>Device Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Specification With State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList#getDeviceSpecificationWithState()
	 * @see #getDeviceSpecificationWithStateList()
	 * @generated
	 */
	EReference getDeviceSpecificationWithStateList_DeviceSpecificationWithState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState <em>Device Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Specification With State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState
	 * @generated
	 */
	EClass getDeviceSpecificationWithState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceSpecification <em>Device Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Specification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceSpecification()
	 * @see #getDeviceSpecificationWithState()
	 * @generated
	 */
	EReference getDeviceSpecificationWithState_DeviceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceState()
	 * @see #getDeviceSpecificationWithState()
	 * @generated
	 */
	EAttribute getDeviceSpecificationWithState_DeviceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent
	 * @generated
	 */
	EClass getDisplayContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDisplayContentRef <em>Display Content Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Content Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getDisplayContentRef()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_DisplayContentRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getLineInformation <em>Line Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getLineInformation()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_LineInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getDestination()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_Destination();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getViaPoint <em>Via Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Via Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getViaPoint()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_ViaPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation1 <em>Additional Information1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information1</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation1()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation2 <em>Additional Information2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information2</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation2()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation3 <em>Additional Information3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information3</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation3()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation3();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation4 <em>Additional Information4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information4</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation4()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation4();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation5 <em>Additional Information5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information5</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation5()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation5();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation6 <em>Additional Information6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information6</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation6()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation6();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation7 <em>Additional Information7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information7</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation7()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation7();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation8 <em>Additional Information8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information8</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation8()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation8();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation9 <em>Additional Information9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information9</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getAdditionalInformation9()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_AdditionalInformation9();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getRunNumber <em>Run Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getRunNumber()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_RunNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getPriority()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getPeriodDuration <em>Period Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Duration</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getPeriodDuration()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_PeriodDuration();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DisplayContent#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent#getDuration()
	 * @see #getDisplayContent()
	 * @generated
	 */
	EReference getDisplayContent_Duration();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getAirSubmode <em>Air Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getAirSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AirSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getBusSubmode <em>Bus Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getBusSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BusSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getCoachSubmode <em>Coach Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getCoachSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CoachSubmode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getDataAcceptedResponse <em>Data Accepted Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Accepted Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getDataAcceptedResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataAcceptedResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getFunicularSubmode <em>Funicular Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funicular Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getFunicularSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FunicularSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getMetroSubmode <em>Metro Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metro Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getMetroSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MetroSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getRailSubmode <em>Rail Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rail Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getRailSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RailSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getSelfDriveSubmode <em>Self Drive Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Drive Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getSelfDriveSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelfDriveSubmode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getSubscribeRequest <em>Subscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getSubscribeRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubscribeRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getSubscribeResponse <em>Subscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getSubscribeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubscribeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getTaxiSubmode <em>Taxi Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxi Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getTaxiSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxiSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getTelecabinSubmode <em>Telecabin Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecabin Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getTelecabinSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TelecabinSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getTramSubmode <em>Tram Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tram Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getTramSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TramSubmode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getUnsubscribeRequest <em>Unsubscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsubscribe Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getUnsubscribeRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnsubscribeRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getUnsubscribeResponse <em>Unsubscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsubscribe Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getUnsubscribeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnsubscribeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot#getWaterSubmode <em>Water Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot#getWaterSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WaterSubmode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DoorCountingList <em>Door Counting List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Counting List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCountingList
	 * @generated
	 */
	EClass getDoorCountingList();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorCountingList#getDoorID <em>Door ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Door ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCountingList#getDoorID()
	 * @see #getDoorCountingList()
	 * @generated
	 */
	EReference getDoorCountingList_DoorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DoorCountingList#getCountSet <em>Count Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count Set</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCountingList#getCountSet()
	 * @see #getDoorCountingList()
	 * @generated
	 */
	EReference getDoorCountingList_CountSet();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DoorCounting <em>Door Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Counting</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCounting
	 * @generated
	 */
	EClass getDoorCounting();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DoorCounting#getObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Class</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCounting#getObjectClass()
	 * @see #getDoorCounting()
	 * @generated
	 */
	EAttribute getDoorCounting_ObjectClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorCounting#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCounting#getIn()
	 * @see #getDoorCounting()
	 * @generated
	 */
	EReference getDoorCounting_In();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorCounting#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCounting#getOut()
	 * @see #getDoorCounting()
	 * @generated
	 */
	EReference getDoorCounting_Out();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DoorCounting#getCountQuality <em>Count Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Quality</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCounting#getCountQuality()
	 * @see #getDoorCounting()
	 * @generated
	 */
	EAttribute getDoorCounting_CountQuality();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DoorInformation <em>Door Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorInformation
	 * @generated
	 */
	EClass getDoorInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorInformation#getDoorID <em>Door ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Door ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorInformation#getDoorID()
	 * @see #getDoorInformation()
	 * @generated
	 */
	EReference getDoorInformation_DoorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.DoorInformation#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Count</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorInformation#getCount()
	 * @see #getDoorInformation()
	 * @generated
	 */
	EReference getDoorInformation_Count();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorInformation#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorInformation#getState()
	 * @see #getDoorInformation()
	 * @generated
	 */
	EReference getDoorInformation_State();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DoorOpenState <em>Door Open State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Open State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOpenState
	 * @generated
	 */
	EClass getDoorOpenState();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DoorOpenState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOpenState#getValue()
	 * @see #getDoorOpenState()
	 * @generated
	 */
	EAttribute getDoorOpenState_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DoorOpenState#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOpenState#getErrorCode()
	 * @see #getDoorOpenState()
	 * @generated
	 */
	EAttribute getDoorOpenState_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState <em>Door Operation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Operation State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOperationState
	 * @generated
	 */
	EClass getDoorOperationState();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOperationState#getValue()
	 * @see #getDoorOperationState()
	 * @generated
	 */
	EAttribute getDoorOperationState_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOperationState#getErrorCode()
	 * @see #getDoorOperationState()
	 * @generated
	 */
	EAttribute getDoorOperationState_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.DoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorState
	 * @generated
	 */
	EClass getDoorState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorState#getOpenState <em>Open State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorState#getOpenState()
	 * @see #getDoorState()
	 * @generated
	 */
	EReference getDoorState_OpenState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.DoorState#getOperationState <em>Operation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.DoorState#getOperationState()
	 * @see #getDoorState()
	 * @generated
	 */
	EReference getDoorState_OperationState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.FareZoneInformation <em>Fare Zone Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Zone Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.FareZoneInformation
	 * @generated
	 */
	EClass getFareZoneInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneID <em>Fare Zone ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneID()
	 * @see #getFareZoneInformation()
	 * @generated
	 */
	EReference getFareZoneInformation_FareZoneID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneType <em>Fare Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneType()
	 * @see #getFareZoneInformation()
	 * @generated
	 */
	EReference getFareZoneInformation_FareZoneType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneLongName <em>Fare Zone Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone Long Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneLongName()
	 * @see #getFareZoneInformation()
	 * @generated
	 */
	EReference getFareZoneInformation_FareZoneLongName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneShortName <em>Fare Zone Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone Short Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.FareZoneInformation#getFareZoneShortName()
	 * @see #getFareZoneInformation()
	 * @generated
	 */
	EReference getFareZoneInformation_FareZoneShortName();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus <em>Global Card Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Card Status</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GlobalCardStatus
	 * @generated
	 */
	EClass getGlobalCardStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStausID <em>Global Card Staus ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Card Staus ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStausID()
	 * @see #getGlobalCardStatus()
	 * @generated
	 */
	EReference getGlobalCardStatus_GlobalCardStausID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStatusText <em>Global Card Status Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Card Status Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GlobalCardStatus#getGlobalCardStatusText()
	 * @see #getGlobalCardStatus()
	 * @generated
	 */
	EReference getGlobalCardStatus_GlobalCardStatusText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.GNSSCoordinate <em>GNSS Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS Coordinate</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSCoordinate
	 * @generated
	 */
	EClass getGNSSCoordinate();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GNSSCoordinate#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degree</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSCoordinate#getDegree()
	 * @see #getGNSSCoordinate()
	 * @generated
	 */
	EReference getGNSSCoordinate_Degree();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GNSSCoordinate#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSCoordinate#getDirection()
	 * @see #getGNSSCoordinate()
	 * @generated
	 */
	EReference getGNSSCoordinate_Direction();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.GNSSPoint <em>GNSS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSPoint
	 * @generated
	 */
	EClass getGNSSPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GNSSPoint#getPointRef <em>Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSPoint#getPointRef()
	 * @see #getGNSSPoint()
	 * @generated
	 */
	EReference getGNSSPoint_PointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GNSSPoint#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longitude</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSPoint#getLongitude()
	 * @see #getGNSSPoint()
	 * @generated
	 */
	EReference getGNSSPoint_Longitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GNSSPoint#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latitude</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSPoint#getLatitude()
	 * @see #getGNSSPoint()
	 * @generated
	 */
	EReference getGNSSPoint_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GNSSPoint#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSPoint#getAltitude()
	 * @see #getGNSSPoint()
	 * @generated
	 */
	EReference getGNSSPoint_Altitude();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPAnyURI <em>IBISIP Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Any URI</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPAnyURI
	 * @generated
	 */
	EClass getIBISIPAnyURI();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPAnyURI#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPAnyURI#getValue()
	 * @see #getIBISIPAnyURI()
	 * @generated
	 */
	EAttribute getIBISIPAnyURI_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPAnyURI#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPAnyURI#getErrorCode()
	 * @see #getIBISIPAnyURI()
	 * @generated
	 */
	EAttribute getIBISIPAnyURI_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPBoolean <em>IBISIP Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Boolean</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPBoolean
	 * @generated
	 */
	EClass getIBISIPBoolean();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPBoolean#isValue()
	 * @see #getIBISIPBoolean()
	 * @generated
	 */
	EAttribute getIBISIPBoolean_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPBoolean#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPBoolean#getErrorCode()
	 * @see #getIBISIPBoolean()
	 * @generated
	 */
	EAttribute getIBISIPBoolean_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPByte <em>IBISIP Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Byte</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPByte
	 * @generated
	 */
	EClass getIBISIPByte();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPByte#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPByte#getValue()
	 * @see #getIBISIPByte()
	 * @generated
	 */
	EAttribute getIBISIPByte_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPByte#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPByte#getErrorCode()
	 * @see #getIBISIPByte()
	 * @generated
	 */
	EAttribute getIBISIPByte_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDate <em>IBISIP Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Date</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDate
	 * @generated
	 */
	EClass getIBISIPDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDate#getValue()
	 * @see #getIBISIPDate()
	 * @generated
	 */
	EAttribute getIBISIPDate_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDate#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDate#getErrorCode()
	 * @see #getIBISIPDate()
	 * @generated
	 */
	EAttribute getIBISIPDate_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDateTime <em>IBISIP Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Date Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDateTime
	 * @generated
	 */
	EClass getIBISIPDateTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDateTime#getValue()
	 * @see #getIBISIPDateTime()
	 * @generated
	 */
	EAttribute getIBISIPDateTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDateTime#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDateTime#getErrorCode()
	 * @see #getIBISIPDateTime()
	 * @generated
	 */
	EAttribute getIBISIPDateTime_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDouble <em>IBISIP Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Double</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDouble
	 * @generated
	 */
	EClass getIBISIPDouble();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDouble#getValue()
	 * @see #getIBISIPDouble()
	 * @generated
	 */
	EAttribute getIBISIPDouble_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDouble#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDouble#getErrorCode()
	 * @see #getIBISIPDouble()
	 * @generated
	 */
	EAttribute getIBISIPDouble_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDuration <em>IBISIP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Duration</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDuration
	 * @generated
	 */
	EClass getIBISIPDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDuration#getValue()
	 * @see #getIBISIPDuration()
	 * @generated
	 */
	EAttribute getIBISIPDuration_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPDuration#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDuration#getErrorCode()
	 * @see #getIBISIPDuration()
	 * @generated
	 */
	EAttribute getIBISIPDuration_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPInt <em>IBISIP Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Int</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPInt
	 * @generated
	 */
	EClass getIBISIPInt();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPInt#getValue()
	 * @see #getIBISIPInt()
	 * @generated
	 */
	EAttribute getIBISIPInt_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPInt#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPInt#getErrorCode()
	 * @see #getIBISIPInt()
	 * @generated
	 */
	EAttribute getIBISIPInt_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPLanguage <em>IBISIP Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Language</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPLanguage
	 * @generated
	 */
	EClass getIBISIPLanguage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPLanguage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPLanguage#getValue()
	 * @see #getIBISIPLanguage()
	 * @generated
	 */
	EAttribute getIBISIPLanguage_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPLanguage#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPLanguage#getErrorCode()
	 * @see #getIBISIPLanguage()
	 * @generated
	 */
	EAttribute getIBISIPLanguage_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN <em>IBISIPNMTOKEN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIPNMTOKEN</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN
	 * @generated
	 */
	EClass getIBISIPNMTOKEN();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN#getValue()
	 * @see #getIBISIPNMTOKEN()
	 * @generated
	 */
	EAttribute getIBISIPNMTOKEN_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN#getErrorCode()
	 * @see #getIBISIPNMTOKEN()
	 * @generated
	 */
	EAttribute getIBISIPNMTOKEN_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger <em>IBISIP Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Non Negative Integer</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger
	 * @generated
	 */
	EClass getIBISIPNonNegativeInteger();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger#getValue()
	 * @see #getIBISIPNonNegativeInteger()
	 * @generated
	 */
	EAttribute getIBISIPNonNegativeInteger_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger#getErrorCode()
	 * @see #getIBISIPNonNegativeInteger()
	 * @generated
	 */
	EAttribute getIBISIPNonNegativeInteger_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString <em>IBISIP Normalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Normalized String</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString
	 * @generated
	 */
	EClass getIBISIPNormalizedString();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString#getValue()
	 * @see #getIBISIPNormalizedString()
	 * @generated
	 */
	EAttribute getIBISIPNormalizedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString#getErrorCode()
	 * @see #getIBISIPNormalizedString()
	 * @generated
	 */
	EAttribute getIBISIPNormalizedString_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPString <em>IBISIP String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP String</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPString
	 * @generated
	 */
	EClass getIBISIPString();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPString#getValue()
	 * @see #getIBISIPString()
	 * @generated
	 */
	EAttribute getIBISIPString_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPString#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPString#getErrorCode()
	 * @see #getIBISIPString()
	 * @generated
	 */
	EAttribute getIBISIPString_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPTime <em>IBISIP Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPTime
	 * @generated
	 */
	EClass getIBISIPTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPTime#getValue()
	 * @see #getIBISIPTime()
	 * @generated
	 */
	EAttribute getIBISIPTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPTime#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPTime#getErrorCode()
	 * @see #getIBISIPTime()
	 * @generated
	 */
	EAttribute getIBISIPTime_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt <em>IBISIP Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Unsigned Int</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt
	 * @generated
	 */
	EClass getIBISIPUnsignedInt();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt#getValue()
	 * @see #getIBISIPUnsignedInt()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedInt_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt#getErrorCode()
	 * @see #getIBISIPUnsignedInt()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedInt_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong <em>IBISIP Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBISIP Unsigned Long</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong
	 * @generated
	 */
	EClass getIBISIPUnsignedLong();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong#getValue()
	 * @see #getIBISIPUnsignedLong()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedLong_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong#getErrorCode()
	 * @see #getIBISIPUnsignedLong()
	 * @generated
	 */
	EAttribute getIBISIPUnsignedLong_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.InternationalTextType <em>International Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International Text Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.InternationalTextType
	 * @generated
	 */
	EClass getInternationalTextType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.InternationalTextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.InternationalTextType#getValue()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EAttribute getInternationalTextType_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.InternationalTextType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.InternationalTextType#getLanguage()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EAttribute getInternationalTextType_Language();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.InternationalTextType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.InternationalTextType#getErrorCode()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EAttribute getInternationalTextType_ErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation <em>Journey Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Stop Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation
	 * @generated
	 */
	EClass getJourneyStopInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopRef()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_StopRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopName <em>Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopName()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_StopName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopAlternativeName <em>Stop Alternative Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Alternative Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getStopAlternativeName()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_StopAlternativeName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getPlatform()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDisplayContent()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_DisplayContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getAnnouncement <em>Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getAnnouncement()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_Announcement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getArrivalScheduled <em>Arrival Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Scheduled</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getArrivalScheduled()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_ArrivalScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDepartureScheduled <em>Departure Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Scheduled</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getDepartureScheduled()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_DepartureScheduled();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getConnection()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getBayArea <em>Bay Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bay Area</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getBayArea()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_BayArea();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getGNSSPoint <em>GNSS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GNSS Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getGNSSPoint()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_GNSSPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getFareZone <em>Fare Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation#getFareZone()
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	EReference getJourneyStopInformation_FareZone();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.LineInformation <em>Line Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation
	 * @generated
	 */
	EClass getLineInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineRef <em>Line Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation#getLineRef()
	 * @see #getLineInformation()
	 * @generated
	 */
	EReference getLineInformation_LineRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineName <em>Line Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation#getLineName()
	 * @see #getLineInformation()
	 * @generated
	 */
	EReference getLineInformation_LineName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineShortName <em>Line Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Short Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation#getLineShortName()
	 * @see #getLineInformation()
	 * @generated
	 */
	EReference getLineInformation_LineShortName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation#getLineNumber()
	 * @see #getLineInformation()
	 * @generated
	 */
	EReference getLineInformation_LineNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.LineInformation#getLineCode <em>Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation#getLineCode()
	 * @see #getLineInformation()
	 * @generated
	 */
	EReference getLineInformation_LineCode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.LogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LogMessage
	 * @generated
	 */
	EClass getLogMessage();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.LogMessage#getMessageProvider <em>Message Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Provider</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LogMessage#getMessageProvider()
	 * @see #getLogMessage()
	 * @generated
	 */
	EReference getLogMessage_MessageProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.LogMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.LogMessage#getMessage()
	 * @see #getLogMessage()
	 * @generated
	 */
	EReference getLogMessage_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Message#getMessageID()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_MessageID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Message#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Message#getTimeStamp()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Message#getMessageType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Message#getMessageText <em>Message Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Text</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Message#getMessageText()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_MessageText();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.NetexMode <em>Netex Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netex Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode
	 * @generated
	 */
	EClass getNetexMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPtMainMode <em>Pt Main Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Main Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getPtMainMode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_PtMainMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPrivateMainMode <em>Private Main Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Main Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getPrivateMainMode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_PrivateMainMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getAirSubmode <em>Air Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getAirSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_AirSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getBusSubmode <em>Bus Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getBusSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_BusSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getCoachSubmode <em>Coach Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getCoachSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_CoachSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getFunicularSubmode <em>Funicular Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funicular Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getFunicularSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_FunicularSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getMetroSubmode <em>Metro Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metro Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getMetroSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_MetroSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTramSubmode <em>Tram Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tram Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getTramSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_TramSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTelecabinSubmode <em>Telecabin Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecabin Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getTelecabinSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_TelecabinSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getRailSubmode <em>Rail Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rail Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getRailSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_RailSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getWaterSubmode <em>Water Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getWaterSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_WaterSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTaxiSubmode <em>Taxi Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxi Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getTaxiSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_TaxiSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getSelfDriveSubmode <em>Self Drive Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Drive Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode#getSelfDriveSubmode()
	 * @see #getNetexMode()
	 * @generated
	 */
	EAttribute getNetexMode_SelfDriveSubmode();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.PointSequence <em>Point Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Sequence</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointSequence
	 * @generated
	 */
	EClass getPointSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.PointSequence#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointSequence#getPoint()
	 * @see #getPointSequence()
	 * @generated
	 */
	EReference getPointSequence_Point();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Point#getPointIndex <em>Point Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Point#getPointIndex()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_PointIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Point#getPointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Point#getPointType()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_PointType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Point#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Previous Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Point#getDistanceToPreviousPoint()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_DistanceToPreviousPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.PointType#getStopPoint <em>Stop Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointType#getStopPoint()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_StopPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.PointType#getBeaconPoint <em>Beacon Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beacon Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointType#getBeaconPoint()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_BeaconPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.PointType#getGNSSLocationPoint <em>GNSS Location Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GNSS Location Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointType#getGNSSLocationPoint()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_GNSSLocationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.PointType#getTimingPoint <em>Timing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointType#getTimingPoint()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_TimingPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.PointType#getTSPPoint <em>TSP Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TSP Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.PointType#getTSPPoint()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_TSPPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentification
	 * @generated
	 */
	EClass getServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentification#getService()
	 * @see #getServiceIdentification()
	 * @generated
	 */
	EReference getServiceIdentification_Service();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentification#getDevice()
	 * @see #getServiceIdentification()
	 * @generated
	 */
	EReference getServiceIdentification_Device();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList <em>Service Identification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification With State List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList
	 * @generated
	 */
	EClass getServiceIdentificationWithStateList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList#getServiceIdentificationWithState <em>Service Identification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Identification With State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList#getServiceIdentificationWithState()
	 * @see #getServiceIdentificationWithStateList()
	 * @generated
	 */
	EReference getServiceIdentificationWithStateList_ServiceIdentificationWithState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState <em>Service Identification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification With State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState
	 * @generated
	 */
	EClass getServiceIdentificationWithState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceIdentification()
	 * @see #getServiceIdentificationWithState()
	 * @generated
	 */
	EReference getServiceIdentificationWithState_ServiceIdentification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceState <em>Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceState()
	 * @see #getServiceIdentificationWithState()
	 * @generated
	 */
	EAttribute getServiceIdentificationWithState_ServiceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceInformationList <em>Service Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Information List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformationList
	 * @generated
	 */
	EClass getServiceInformationList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ServiceInformationList#getServiceInformation <em>Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformationList#getServiceInformation()
	 * @see #getServiceInformationList()
	 * @generated
	 */
	EReference getServiceInformationList_ServiceInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceInformation <em>Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformation
	 * @generated
	 */
	EClass getServiceInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceInformation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformation#getService()
	 * @see #getServiceInformation()
	 * @generated
	 */
	EReference getServiceInformation_Service();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceInformation#getAutostart <em>Autostart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autostart</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformation#getAutostart()
	 * @see #getServiceInformation()
	 * @generated
	 */
	EReference getServiceInformation_Autostart();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecification <em>Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecification
	 * @generated
	 */
	EClass getServiceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecification#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecification#getServiceName()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EAttribute getServiceSpecification_ServiceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecification#getIBISIPVersion <em>IBISIP Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IBISIP Version</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecification#getIBISIPVersion()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EReference getServiceSpecification_IBISIPVersion();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList <em>Service Specification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification With State List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList
	 * @generated
	 */
	EClass getServiceSpecificationWithStateList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList#getServiceSpecificationWithState <em>Service Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Specification With State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList#getServiceSpecificationWithState()
	 * @see #getServiceSpecificationWithStateList()
	 * @generated
	 */
	EReference getServiceSpecificationWithStateList_ServiceSpecificationWithState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState <em>Service Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification With State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState
	 * @generated
	 */
	EClass getServiceSpecificationWithState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState#getServiceSpecification <em>Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Specification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState#getServiceSpecification()
	 * @see #getServiceSpecificationWithState()
	 * @generated
	 */
	EReference getServiceSpecificationWithState_ServiceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState#getServiceState <em>Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState#getServiceState()
	 * @see #getServiceSpecificationWithState()
	 * @generated
	 */
	EAttribute getServiceSpecificationWithState_ServiceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceStartList <em>Service Start List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Start List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStartList
	 * @generated
	 */
	EClass getServiceStartList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ServiceStartList#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStartList#getServiceIdentification()
	 * @see #getServiceStartList()
	 * @generated
	 */
	EReference getServiceStartList_ServiceIdentification();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ServiceStart <em>Service Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Start</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStart
	 * @generated
	 */
	EClass getServiceStart();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceStart#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStart#getServiceIdentification()
	 * @see #getServiceStart()
	 * @generated
	 */
	EReference getServiceStart_ServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ServiceStart#getAutostart <em>Autostart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autostart</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStart#getAutostart()
	 * @see #getServiceStart()
	 * @generated
	 */
	EReference getServiceStart_Autostart();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ShortTripStopList <em>Short Trip Stop List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Trip Stop List</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStopList
	 * @generated
	 */
	EClass getShortTripStopList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ShortTripStopList#getShortTripStop <em>Short Trip Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Trip Stop</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStopList#getShortTripStop()
	 * @see #getShortTripStopList()
	 * @generated
	 */
	EReference getShortTripStopList_ShortTripStop();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ShortTripStop <em>Short Trip Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Trip Stop</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStop
	 * @generated
	 */
	EClass getShortTripStop();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ShortTripStop#getJourneyStopInformation <em>Journey Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journey Stop Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStop#getJourneyStopInformation()
	 * @see #getShortTripStop()
	 * @generated
	 */
	EReference getShortTripStop_JourneyStopInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ShortTripStop#getFareZoneInformation <em>Fare Zone Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStop#getFareZoneInformation()
	 * @see #getShortTripStop()
	 * @generated
	 */
	EReference getShortTripStop_FareZoneInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.SpecificPoint <em>Specific Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SpecificPoint
	 * @generated
	 */
	EClass getSpecificPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SpecificPoint#getPointRef <em>Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SpecificPoint#getPointRef()
	 * @see #getSpecificPoint()
	 * @generated
	 */
	EReference getSpecificPoint_PointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SpecificPoint#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Previous Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SpecificPoint#getDistanceToPreviousPoint()
	 * @see #getSpecificPoint()
	 * @generated
	 */
	EReference getSpecificPoint_DistanceToPreviousPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest <em>Stop Information Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Information Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest
	 * @generated
	 */
	EClass getStopInformationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopIndex <em>Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopIndex()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_StopIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopRef()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_StopRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopName <em>Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopName()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_StopName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDisplayContent()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_DisplayContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopAnnouncement <em>Stop Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getStopAnnouncement()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_StopAnnouncement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getArrivalScheduled <em>Arrival Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Scheduled</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getArrivalScheduled()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_ArrivalScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDepartureScheduled <em>Departure Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Scheduled</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDepartureScheduled()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_DepartureScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getRecordedArrivalTime <em>Recorded Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorded Arrival Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getRecordedArrivalTime()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_RecordedArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDistanceToNextStop <em>Distance To Next Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Next Stop</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getDistanceToNextStop()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_DistanceToNextStop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getConnection()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest#getFareZone <em>Fare Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest#getFareZone()
	 * @see #getStopInformationRequest()
	 * @generated
	 */
	EReference getStopInformationRequest_FareZone();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.StopInformation <em>Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation
	 * @generated
	 */
	EClass getStopInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getStopIndex <em>Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getStopIndex()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_StopIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getStopRef <em>Stop Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getStopRef()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_StopRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getStopName <em>Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getStopName()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_StopName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getStopAlternativeName <em>Stop Alternative Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Alternative Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getStopAlternativeName()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_StopAlternativeName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getPlatform()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getDisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getDisplayContent()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_DisplayContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getStopAnnouncement <em>Stop Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getStopAnnouncement()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_StopAnnouncement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getArrivalScheduled <em>Arrival Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Scheduled</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getArrivalScheduled()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_ArrivalScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getArrivalExpected <em>Arrival Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Expected</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getArrivalExpected()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_ArrivalExpected();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getDepartureScheduled <em>Departure Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Scheduled</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getDepartureScheduled()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_DepartureScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getDepartureExpected <em>Departure Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Expected</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getDepartureExpected()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_DepartureExpected();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getRecordedArrivalTime <em>Recorded Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorded Arrival Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getRecordedArrivalTime()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_RecordedArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getDistanceToNextStop <em>Distance To Next Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance To Next Stop</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getDistanceToNextStop()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_DistanceToNextStop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getConnection()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopInformation#getFareZone <em>Fare Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation#getFareZone()
	 * @see #getStopInformation()
	 * @generated
	 */
	EReference getStopInformation_FareZone();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation <em>Stop Point Tariff Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Point Tariff Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopPointTariffInformation
	 * @generated
	 */
	EClass getStopPointTariffInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getJourneyStopInformation <em>Journey Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journey Stop Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getJourneyStopInformation()
	 * @see #getStopPointTariffInformation()
	 * @generated
	 */
	EReference getStopPointTariffInformation_JourneyStopInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getFareZoneInformation <em>Fare Zone Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Zone Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getFareZoneInformation()
	 * @see #getStopPointTariffInformation()
	 * @generated
	 */
	EReference getStopPointTariffInformation_FareZoneInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.StopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Sequence</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopSequence
	 * @generated
	 */
	EClass getStopSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.StopSequence#getStopPoint <em>Stop Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.StopSequence#getStopPoint()
	 * @see #getStopSequence()
	 * @generated
	 */
	EReference getStopSequence_StopPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.SubscribeRequest <em>Subscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeRequest
	 * @generated
	 */
	EClass getSubscribeRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SubscribeRequest#getClientIPAddress <em>Client IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client IP Address</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeRequest#getClientIPAddress()
	 * @see #getSubscribeRequest()
	 * @generated
	 */
	EReference getSubscribeRequest_ClientIPAddress();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SubscribeRequest#getReplyPort <em>Reply Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Port</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeRequest#getReplyPort()
	 * @see #getSubscribeRequest()
	 * @generated
	 */
	EReference getSubscribeRequest_ReplyPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SubscribeRequest#getReplyPath <em>Reply Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Path</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeRequest#getReplyPath()
	 * @see #getSubscribeRequest()
	 * @generated
	 */
	EReference getSubscribeRequest_ReplyPath();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse <em>Subscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeResponse
	 * @generated
	 */
	EClass getSubscribeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeResponse#getActive()
	 * @see #getSubscribeResponse()
	 * @generated
	 */
	EReference getSubscribeResponse_Active();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse#getHeartbeat <em>Heartbeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heartbeat</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeResponse#getHeartbeat()
	 * @see #getSubscribeResponse()
	 * @generated
	 */
	EReference getSubscribeResponse_Heartbeat();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.TimingPoint <em>Timing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TimingPoint
	 * @generated
	 */
	EClass getTimingPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getTimingPointRef <em>Timing Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Point Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TimingPoint#getTimingPointRef()
	 * @see #getTimingPoint()
	 * @generated
	 */
	EReference getTimingPoint_TimingPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getScheduleTime <em>Schedule Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TimingPoint#getScheduleTime()
	 * @see #getTimingPoint()
	 * @generated
	 */
	EReference getTimingPoint_ScheduleTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getGNSSPoint <em>GNSS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GNSS Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TimingPoint#getGNSSPoint()
	 * @see #getTimingPoint()
	 * @generated
	 */
	EReference getTimingPoint_GNSSPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.TripInformation <em>Trip Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation
	 * @generated
	 */
	EClass getTripInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getTripRef <em>Trip Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getTripRef()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_TripRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getStopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Sequence</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getStopSequence()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_StopSequence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getLocationState <em>Location State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location State</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getLocationState()
	 * @see #getTripInformation()
	 * @generated
	 */
	EAttribute getTripInformation_LocationState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getTimetableDelay <em>Timetable Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timetable Delay</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getTimetableDelay()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_TimetableDelay();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage <em>Additional Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage1 <em>Additional Text Message1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message1</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage1()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage1();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage2 <em>Additional Text Message2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message2</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage2()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage2();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage3 <em>Additional Text Message3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message3</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage3()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage4 <em>Additional Text Message4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message4</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage4()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage4();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage5 <em>Additional Text Message5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message5</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage5()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage5();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage6 <em>Additional Text Message6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message6</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage6()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage6();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage7 <em>Additional Text Message7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message7</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage7()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage7();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage8 <em>Additional Text Message8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message8</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage8()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage8();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage9 <em>Additional Text Message9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Text Message9</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalTextMessage9()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalTextMessage9();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalAnnouncement <em>Additional Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getAdditionalAnnouncement()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_AdditionalAnnouncement();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getRouteDirection <em>Route Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Direction</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getRouteDirection()
	 * @see #getTripInformation()
	 * @generated
	 */
	EAttribute getTripInformation_RouteDirection();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getRunNumber <em>Run Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getRunNumber()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_RunNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getPatternNumber <em>Pattern Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getPatternNumber()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_PatternNumber();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripInformation#getPathDestinationNumber <em>Path Destination Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Destination Number</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation#getPathDestinationNumber()
	 * @see #getTripInformation()
	 * @generated
	 */
	EReference getTripInformation_PathDestinationNumber();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.TripSequence <em>Trip Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Sequence</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence
	 * @generated
	 */
	EClass getTripSequence();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripSequence#getTripRef <em>Trip Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence#getTripRef()
	 * @see #getTripSequence()
	 * @generated
	 */
	EReference getTripSequence_TripRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripSequence#getTripIndex <em>Trip Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence#getTripIndex()
	 * @see #getTripSequence()
	 * @generated
	 */
	EReference getTripSequence_TripIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripSequence#getTripStart <em>Trip Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Start</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence#getTripStart()
	 * @see #getTripSequence()
	 * @generated
	 */
	EReference getTripSequence_TripStart();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripSequence#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence#getCurrentStopIndex()
	 * @see #getTripSequence()
	 * @generated
	 */
	EReference getTripSequence_CurrentStopIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_common.TripSequence#getJourneyMode <em>Journey Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence#getJourneyMode()
	 * @see #getTripSequence()
	 * @generated
	 */
	EAttribute getTripSequence_JourneyMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TripSequence#getPointSequence <em>Point Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Sequence</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence#getPointSequence()
	 * @see #getTripSequence()
	 * @generated
	 */
	EReference getTripSequence_PointSequence();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.TSPPoint <em>TSP Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSP Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TSPPoint
	 * @generated
	 */
	EClass getTSPPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TSPPoint#getTSPPointRef <em>TSP Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TSP Point Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TSPPoint#getTSPPointRef()
	 * @see #getTSPPoint()
	 * @generated
	 */
	EReference getTSPPoint_TSPPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.TSPPoint#getTSPCode <em>TSP Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TSP Code</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TSPPoint#getTSPCode()
	 * @see #getTSPPoint()
	 * @generated
	 */
	EReference getTSPPoint_TSPCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.TSPPoint#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TSPPoint#getShortName()
	 * @see #getTSPPoint()
	 * @generated
	 */
	EReference getTSPPoint_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.TSPPoint#getDesciption <em>Desciption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Desciption</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.TSPPoint#getDesciption()
	 * @see #getTSPPoint()
	 * @generated
	 */
	EReference getTSPPoint_Desciption();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest <em>Unsubscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsubscribe Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeRequest
	 * @generated
	 */
	EClass getUnsubscribeRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getClientIPAddress <em>Client IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client IP Address</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getClientIPAddress()
	 * @see #getUnsubscribeRequest()
	 * @generated
	 */
	EReference getUnsubscribeRequest_ClientIPAddress();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPort <em>Reply Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Port</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPort()
	 * @see #getUnsubscribeRequest()
	 * @generated
	 */
	EReference getUnsubscribeRequest_ReplyPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPath <em>Reply Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Path</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeRequest#getReplyPath()
	 * @see #getUnsubscribeRequest()
	 * @generated
	 */
	EReference getUnsubscribeRequest_ReplyPath();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeResponse <em>Unsubscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsubscribe Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeResponse
	 * @generated
	 */
	EClass getUnsubscribeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeResponse#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeResponse#getActive()
	 * @see #getUnsubscribeResponse()
	 * @generated
	 */
	EReference getUnsubscribeResponse_Active();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.Vehicle#getVehicleTypeRef <em>Vehicle Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Type Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Vehicle#getVehicleTypeRef()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_VehicleTypeRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Name();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ViaPoint <em>Via Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Via Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint
	 * @generated
	 */
	EClass getViaPoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointRef <em>Via Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Point Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointRef()
	 * @see #getViaPoint()
	 * @generated
	 */
	EReference getViaPoint_ViaPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceRef <em>Place Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceRef()
	 * @see #getViaPoint()
	 * @generated
	 */
	EReference getViaPoint_PlaceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceName <em>Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceName()
	 * @see #getViaPoint()
	 * @generated
	 */
	EReference getViaPoint_PlaceName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceShortName <em>Place Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place Short Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceShortName()
	 * @see #getViaPoint()
	 * @generated
	 */
	EReference getViaPoint_PlaceShortName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointDisplayPriority <em>Via Point Display Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Point Display Priority</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointDisplayPriority()
	 * @see #getViaPoint()
	 * @generated
	 */
	EReference getViaPoint_ViaPointDisplayPriority();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.ZoneType <em>Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ZoneType
	 * @generated
	 */
	EClass getZoneType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.ZoneType#getFarezoneTypeID <em>Farezone Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Farezone Type ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ZoneType#getFarezoneTypeID()
	 * @see #getZoneType()
	 * @generated
	 */
	EReference getZoneType_FarezoneTypeID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_common.ZoneType#getFareZoneTypeName <em>Fare Zone Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Zone Type Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.ZoneType#getFareZoneTypeName()
	 * @see #getZoneType()
	 * @generated
	 */
	EReference getZoneType_FareZoneTypeName();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_common.GeneralResponse <em>General Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GeneralResponse
	 * @generated
	 */
	EClass getGeneralResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_common.GeneralResponse#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_common.GeneralResponse#getOperationErrorMessage()
	 * @see #getGeneralResponse()
	 * @generated
	 */
	EReference getGeneralResponse_OperationErrorMessage();

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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl <em>Additional Announcement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getAdditionalAnnouncement()
		 * @generated
		 */
		EClass ADDITIONAL_ANNOUNCEMENT = eINSTANCE.getAdditionalAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Announcement Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF = eINSTANCE.getAdditionalAnnouncement_AnnouncementRef();

		/**
		 * The meta object literal for the '<em><b>Announcement Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT = eINSTANCE.getAdditionalAnnouncement_AnnouncementText();

		/**
		 * The meta object literal for the '<em><b>Announcement TTS Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT = eINSTANCE.getAdditionalAnnouncement_AnnouncementTTSText();

		/**
		 * The meta object literal for the '<em><b>Immediate Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION = eINSTANCE.getAdditionalAnnouncement_ImmediateInformation();

		/**
		 * The meta object literal for the '<em><b>Periodical Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION = eINSTANCE.getAdditionalAnnouncement_PeriodicalInformation();

		/**
		 * The meta object literal for the '<em><b>Specific Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT = eINSTANCE.getAdditionalAnnouncement_SpecificPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.AnnouncementImpl <em>Announcement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.AnnouncementImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getAnnouncement()
		 * @generated
		 */
		EClass ANNOUNCEMENT = eINSTANCE.getAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Announcement Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOUNCEMENT__ANNOUNCEMENT_REF = eINSTANCE.getAnnouncement_AnnouncementRef();

		/**
		 * The meta object literal for the '<em><b>Announcement Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOUNCEMENT__ANNOUNCEMENT_TEXT = eINSTANCE.getAnnouncement_AnnouncementText();

		/**
		 * The meta object literal for the '<em><b>Announcement TTS Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT = eINSTANCE.getAnnouncement_AnnouncementTTSText();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.BayAreaImpl <em>Bay Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.BayAreaImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getBayArea()
		 * @generated
		 */
		EClass BAY_AREA = eINSTANCE.getBayArea();

		/**
		 * The meta object literal for the '<em><b>Before Bay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY_AREA__BEFORE_BAY = eINSTANCE.getBayArea_BeforeBay();

		/**
		 * The meta object literal for the '<em><b>Behind Bay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY_AREA__BEHIND_BAY = eINSTANCE.getBayArea_BehindBay();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.BeaconPointImpl <em>Beacon Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.BeaconPointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getBeaconPoint()
		 * @generated
		 */
		EClass BEACON_POINT = eINSTANCE.getBeaconPoint();

		/**
		 * The meta object literal for the '<em><b>Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT__POINT_REF = eINSTANCE.getBeaconPoint_PointRef();

		/**
		 * The meta object literal for the '<em><b>Beacon Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT__BEACON_CODE = eINSTANCE.getBeaconPoint_BeaconCode();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT__SHORT_NAME = eINSTANCE.getBeaconPoint_ShortName();

		/**
		 * The meta object literal for the '<em><b>Desciption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEACON_POINT__DESCIPTION = eINSTANCE.getBeaconPoint_Desciption();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.CardApplInformationsImpl <em>Card Appl Informations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.CardApplInformationsImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getCardApplInformations()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.CardTicketDataImpl <em>Card Ticket Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.CardTicketDataImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getCardTicketData()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl <em>Card Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getCardType()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__STOP_REF = eINSTANCE.getConnection_StopRef();

		/**
		 * The meta object literal for the '<em><b>Connection Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_REF = eINSTANCE.getConnection_ConnectionRef();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_TYPE = eINSTANCE.getConnection_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DISPLAY_CONTENT = eINSTANCE.getConnection_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PLATFORM = eINSTANCE.getConnection_Platform();

		/**
		 * The meta object literal for the '<em><b>Connection State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_STATE = eINSTANCE.getConnection_ConnectionState();

		/**
		 * The meta object literal for the '<em><b>Transport Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TRANSPORT_MODE = eINSTANCE.getConnection_TransportMode();

		/**
		 * The meta object literal for the '<em><b>Connection Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_MODE = eINSTANCE.getConnection_ConnectionMode();

		/**
		 * The meta object literal for the '<em><b>Expected Departure Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__EXPECTED_DEPARTURE_TIME = eINSTANCE.getConnection_ExpectedDepartureTime();

		/**
		 * The meta object literal for the '<em><b>Scheduled Departure Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SCHEDULED_DEPARTURE_TIME = eINSTANCE.getConnection_ScheduledDepartureTime();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl <em>Data Accepted Response Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataAcceptedResponseData()
		 * @generated
		 */
		EClass DATA_ACCEPTED_RESPONSE_DATA = eINSTANCE.getDataAcceptedResponseData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP = eINSTANCE.getDataAcceptedResponseData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Data Accepted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED = eINSTANCE.getDataAcceptedResponseData_DataAccepted();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE = eINSTANCE.getDataAcceptedResponseData_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Error Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION = eINSTANCE.getDataAcceptedResponseData_ErrorInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseImpl <em>Data Accepted Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataAcceptedResponse()
		 * @generated
		 */
		EClass DATA_ACCEPTED_RESPONSE = eINSTANCE.getDataAcceptedResponse();

		/**
		 * The meta object literal for the '<em><b>Data Accepted Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA = eINSTANCE.getDataAcceptedResponse_DataAcceptedResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataVersionListImpl <em>Data Version List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DataVersionListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataVersionList()
		 * @generated
		 */
		EClass DATA_VERSION_LIST = eINSTANCE.getDataVersionList();

		/**
		 * The meta object literal for the '<em><b>Data Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VERSION_LIST__DATA_VERSION = eINSTANCE.getDataVersionList_DataVersion();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DataVersionImpl <em>Data Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DataVersionImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDataVersion()
		 * @generated
		 */
		EClass DATA_VERSION = eINSTANCE.getDataVersion();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VERSION__DATA_TYPE = eINSTANCE.getDataVersion_DataType();

		/**
		 * The meta object literal for the '<em><b>Version Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VERSION__VERSION_REF = eINSTANCE.getDataVersion_VersionRef();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DegreeTypeImpl <em>Degree Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DegreeTypeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDegreeType()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DestinationImpl <em>Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DestinationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDestination()
		 * @generated
		 */
		EClass DESTINATION = eINSTANCE.getDestination();

		/**
		 * The meta object literal for the '<em><b>Destination Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION__DESTINATION_REF = eINSTANCE.getDestination_DestinationRef();

		/**
		 * The meta object literal for the '<em><b>Destination Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION__DESTINATION_NAME = eINSTANCE.getDestination_DestinationName();

		/**
		 * The meta object literal for the '<em><b>Destination Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION__DESTINATION_SHORT_NAME = eINSTANCE.getDestination_DestinationShortName();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl <em>Device Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceInformation()
		 * @generated
		 */
		EClass DEVICE_INFORMATION = eINSTANCE.getDeviceInformation();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION__DEVICE_NAME = eINSTANCE.getDeviceInformation_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION__MANUFACTURER = eINSTANCE.getDeviceInformation_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION__SERIAL_NUMBER = eINSTANCE.getDeviceInformation_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Device Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INFORMATION__DEVICE_CLASS = eINSTANCE.getDeviceInformation_DeviceClass();

		/**
		 * The meta object literal for the '<em><b>Data Version List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION__DATA_VERSION_LIST = eINSTANCE.getDeviceInformation_DataVersionList();

		/**
		 * The meta object literal for the '<em><b>Web Interface Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS = eINSTANCE.getDeviceInformation_WebInterfaceAddress();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationListImpl <em>Device Specification List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecificationList()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_LIST = eINSTANCE.getDeviceSpecificationList();

		/**
		 * The meta object literal for the '<em><b>Device Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION = eINSTANCE.getDeviceSpecificationList_DeviceSpecification();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationImpl <em>Device Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecification()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION = eINSTANCE.getDeviceSpecification();

		/**
		 * The meta object literal for the '<em><b>Device Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_SPECIFICATION__DEVICE_CLASS = eINSTANCE.getDeviceSpecification_DeviceClass();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION__DEVICE_ID = eINSTANCE.getDeviceSpecification_DeviceID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateListImpl <em>Device Specification With State List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithStateList()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_WITH_STATE_LIST = eINSTANCE.getDeviceSpecificationWithStateList();

		/**
		 * The meta object literal for the '<em><b>Device Specification With State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE = eINSTANCE.getDeviceSpecificationWithStateList_DeviceSpecificationWithState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateImpl <em>Device Specification With State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDeviceSpecificationWithState()
		 * @generated
		 */
		EClass DEVICE_SPECIFICATION_WITH_STATE = eINSTANCE.getDeviceSpecificationWithState();

		/**
		 * The meta object literal for the '<em><b>Device Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION = eINSTANCE.getDeviceSpecificationWithState_DeviceSpecification();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE = eINSTANCE.getDeviceSpecificationWithState_DeviceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DisplayContentImpl <em>Display Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DisplayContentImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDisplayContent()
		 * @generated
		 */
		EClass DISPLAY_CONTENT = eINSTANCE.getDisplayContent();

		/**
		 * The meta object literal for the '<em><b>Display Content Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__DISPLAY_CONTENT_REF = eINSTANCE.getDisplayContent_DisplayContentRef();

		/**
		 * The meta object literal for the '<em><b>Line Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__LINE_INFORMATION = eINSTANCE.getDisplayContent_LineInformation();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__DESTINATION = eINSTANCE.getDisplayContent_Destination();

		/**
		 * The meta object literal for the '<em><b>Via Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__VIA_POINT = eINSTANCE.getDisplayContent_ViaPoint();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION = eINSTANCE.getDisplayContent_AdditionalInformation();

		/**
		 * The meta object literal for the '<em><b>Additional Information1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION1 = eINSTANCE.getDisplayContent_AdditionalInformation1();

		/**
		 * The meta object literal for the '<em><b>Additional Information2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION2 = eINSTANCE.getDisplayContent_AdditionalInformation2();

		/**
		 * The meta object literal for the '<em><b>Additional Information3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION3 = eINSTANCE.getDisplayContent_AdditionalInformation3();

		/**
		 * The meta object literal for the '<em><b>Additional Information4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION4 = eINSTANCE.getDisplayContent_AdditionalInformation4();

		/**
		 * The meta object literal for the '<em><b>Additional Information5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION5 = eINSTANCE.getDisplayContent_AdditionalInformation5();

		/**
		 * The meta object literal for the '<em><b>Additional Information6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION6 = eINSTANCE.getDisplayContent_AdditionalInformation6();

		/**
		 * The meta object literal for the '<em><b>Additional Information7</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION7 = eINSTANCE.getDisplayContent_AdditionalInformation7();

		/**
		 * The meta object literal for the '<em><b>Additional Information8</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION8 = eINSTANCE.getDisplayContent_AdditionalInformation8();

		/**
		 * The meta object literal for the '<em><b>Additional Information9</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__ADDITIONAL_INFORMATION9 = eINSTANCE.getDisplayContent_AdditionalInformation9();

		/**
		 * The meta object literal for the '<em><b>Run Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__RUN_NUMBER = eINSTANCE.getDisplayContent_RunNumber();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__PRIORITY = eINSTANCE.getDisplayContent_Priority();

		/**
		 * The meta object literal for the '<em><b>Period Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__PERIOD_DURATION = eINSTANCE.getDisplayContent_PeriodDuration();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_CONTENT__DURATION = eINSTANCE.getDisplayContent_Duration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DocumentRootImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorCountingListImpl <em>Door Counting List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DoorCountingListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorCountingList()
		 * @generated
		 */
		EClass DOOR_COUNTING_LIST = eINSTANCE.getDoorCountingList();

		/**
		 * The meta object literal for the '<em><b>Door ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING_LIST__DOOR_ID = eINSTANCE.getDoorCountingList_DoorID();

		/**
		 * The meta object literal for the '<em><b>Count Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING_LIST__COUNT_SET = eINSTANCE.getDoorCountingList_CountSet();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorCountingImpl <em>Door Counting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DoorCountingImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorCounting()
		 * @generated
		 */
		EClass DOOR_COUNTING = eINSTANCE.getDoorCounting();

		/**
		 * The meta object literal for the '<em><b>Object Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_COUNTING__OBJECT_CLASS = eINSTANCE.getDoorCounting_ObjectClass();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING__IN = eINSTANCE.getDoorCounting_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_COUNTING__OUT = eINSTANCE.getDoorCounting_Out();

		/**
		 * The meta object literal for the '<em><b>Count Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_COUNTING__COUNT_QUALITY = eINSTANCE.getDoorCounting_CountQuality();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl <em>Door Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorInformation()
		 * @generated
		 */
		EClass DOOR_INFORMATION = eINSTANCE.getDoorInformation();

		/**
		 * The meta object literal for the '<em><b>Door ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_INFORMATION__DOOR_ID = eINSTANCE.getDoorInformation_DoorID();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_INFORMATION__COUNT = eINSTANCE.getDoorInformation_Count();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_INFORMATION__STATE = eINSTANCE.getDoorInformation_State();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorOpenStateImpl <em>Door Open State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DoorOpenStateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorOpenState()
		 * @generated
		 */
		EClass DOOR_OPEN_STATE = eINSTANCE.getDoorOpenState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPEN_STATE__VALUE = eINSTANCE.getDoorOpenState_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPEN_STATE__ERROR_CODE = eINSTANCE.getDoorOpenState_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorOperationStateImpl <em>Door Operation State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DoorOperationStateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorOperationState()
		 * @generated
		 */
		EClass DOOR_OPERATION_STATE = eINSTANCE.getDoorOperationState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPERATION_STATE__VALUE = eINSTANCE.getDoorOperationState_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_OPERATION_STATE__ERROR_CODE = eINSTANCE.getDoorOperationState_ErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.DoorStateImpl <em>Door State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.DoorStateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getDoorState()
		 * @generated
		 */
		EClass DOOR_STATE = eINSTANCE.getDoorState();

		/**
		 * The meta object literal for the '<em><b>Open State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_STATE__OPEN_STATE = eINSTANCE.getDoorState_OpenState();

		/**
		 * The meta object literal for the '<em><b>Operation State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_STATE__OPERATION_STATE = eINSTANCE.getDoorState_OperationState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.FareZoneInformationImpl <em>Fare Zone Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.FareZoneInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getFareZoneInformation()
		 * @generated
		 */
		EClass FARE_ZONE_INFORMATION = eINSTANCE.getFareZoneInformation();

		/**
		 * The meta object literal for the '<em><b>Fare Zone ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION__FARE_ZONE_ID = eINSTANCE.getFareZoneInformation_FareZoneID();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION__FARE_ZONE_TYPE = eINSTANCE.getFareZoneInformation_FareZoneType();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Long Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION__FARE_ZONE_LONG_NAME = eINSTANCE.getFareZoneInformation_FareZoneLongName();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ZONE_INFORMATION__FARE_ZONE_SHORT_NAME = eINSTANCE.getFareZoneInformation_FareZoneShortName();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.GlobalCardStatusImpl <em>Global Card Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.GlobalCardStatusImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGlobalCardStatus()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.GNSSCoordinateImpl <em>GNSS Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.GNSSCoordinateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGNSSCoordinate()
		 * @generated
		 */
		EClass GNSS_COORDINATE = eINSTANCE.getGNSSCoordinate();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_COORDINATE__DEGREE = eINSTANCE.getGNSSCoordinate_Degree();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_COORDINATE__DIRECTION = eINSTANCE.getGNSSCoordinate_Direction();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.GNSSPointImpl <em>GNSS Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.GNSSPointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGNSSPoint()
		 * @generated
		 */
		EClass GNSS_POINT = eINSTANCE.getGNSSPoint();

		/**
		 * The meta object literal for the '<em><b>Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT__POINT_REF = eINSTANCE.getGNSSPoint_PointRef();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT__LONGITUDE = eINSTANCE.getGNSSPoint_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT__LATITUDE = eINSTANCE.getGNSSPoint_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_POINT__ALTITUDE = eINSTANCE.getGNSSPoint_Altitude();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPAnyURIImpl <em>IBISIP Any URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPAnyURIImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPAnyURI()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPBooleanImpl <em>IBISIP Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPBooleanImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPBoolean()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPByteImpl <em>IBISIP Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPByteImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPByte()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDateImpl <em>IBISIP Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDate()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDateTimeImpl <em>IBISIP Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDateTimeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDateTime()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDoubleImpl <em>IBISIP Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDoubleImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDouble()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPDurationImpl <em>IBISIP Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPDurationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPDuration()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPIntImpl <em>IBISIP Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPIntImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPInt()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPLanguageImpl <em>IBISIP Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPLanguageImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPLanguage()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPNMTOKENImpl <em>IBISIPNMTOKEN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPNMTOKENImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPNMTOKEN()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPNonNegativeIntegerImpl <em>IBISIP Non Negative Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPNonNegativeIntegerImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPNonNegativeInteger()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPNormalizedStringImpl <em>IBISIP Normalized String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPNormalizedStringImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPNormalizedString()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPStringImpl <em>IBISIP String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPStringImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPString()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPTimeImpl <em>IBISIP Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPTimeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPTime()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedIntImpl <em>IBISIP Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedIntImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPUnsignedInt()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedLongImpl <em>IBISIP Unsigned Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.IBISIPUnsignedLongImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getIBISIPUnsignedLong()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl <em>International Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getInternationalTextType()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl <em>Journey Stop Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getJourneyStopInformation()
		 * @generated
		 */
		EClass JOURNEY_STOP_INFORMATION = eINSTANCE.getJourneyStopInformation();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__STOP_REF = eINSTANCE.getJourneyStopInformation_StopRef();

		/**
		 * The meta object literal for the '<em><b>Stop Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__STOP_NAME = eINSTANCE.getJourneyStopInformation_StopName();

		/**
		 * The meta object literal for the '<em><b>Stop Alternative Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME = eINSTANCE.getJourneyStopInformation_StopAlternativeName();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__PLATFORM = eINSTANCE.getJourneyStopInformation_Platform();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT = eINSTANCE.getJourneyStopInformation_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Announcement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__ANNOUNCEMENT = eINSTANCE.getJourneyStopInformation_Announcement();

		/**
		 * The meta object literal for the '<em><b>Arrival Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED = eINSTANCE.getJourneyStopInformation_ArrivalScheduled();

		/**
		 * The meta object literal for the '<em><b>Departure Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED = eINSTANCE.getJourneyStopInformation_DepartureScheduled();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__CONNECTION = eINSTANCE.getJourneyStopInformation_Connection();

		/**
		 * The meta object literal for the '<em><b>Bay Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__BAY_AREA = eINSTANCE.getJourneyStopInformation_BayArea();

		/**
		 * The meta object literal for the '<em><b>GNSS Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__GNSS_POINT = eINSTANCE.getJourneyStopInformation_GNSSPoint();

		/**
		 * The meta object literal for the '<em><b>Fare Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_STOP_INFORMATION__FARE_ZONE = eINSTANCE.getJourneyStopInformation_FareZone();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.LineInformationImpl <em>Line Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.LineInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getLineInformation()
		 * @generated
		 */
		EClass LINE_INFORMATION = eINSTANCE.getLineInformation();

		/**
		 * The meta object literal for the '<em><b>Line Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION__LINE_REF = eINSTANCE.getLineInformation_LineRef();

		/**
		 * The meta object literal for the '<em><b>Line Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION__LINE_NAME = eINSTANCE.getLineInformation_LineName();

		/**
		 * The meta object literal for the '<em><b>Line Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION__LINE_SHORT_NAME = eINSTANCE.getLineInformation_LineShortName();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION__LINE_NUMBER = eINSTANCE.getLineInformation_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Line Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_INFORMATION__LINE_CODE = eINSTANCE.getLineInformation_LineCode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.LogMessageImpl <em>Log Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.LogMessageImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getLogMessage()
		 * @generated
		 */
		EClass LOG_MESSAGE = eINSTANCE.getLogMessage();

		/**
		 * The meta object literal for the '<em><b>Message Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE__MESSAGE_PROVIDER = eINSTANCE.getLogMessage_MessageProvider();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE__MESSAGE = eINSTANCE.getLogMessage_Message();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.MessageImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MESSAGE_ID = eINSTANCE.getMessage_MessageID();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TIME_STAMP = eINSTANCE.getMessage_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_TYPE = eINSTANCE.getMessage_MessageType();

		/**
		 * The meta object literal for the '<em><b>Message Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MESSAGE_TEXT = eINSTANCE.getMessage_MessageText();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl <em>Netex Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getNetexMode()
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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.PointSequenceImpl <em>Point Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.PointSequenceImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getPointSequence()
		 * @generated
		 */
		EClass POINT_SEQUENCE = eINSTANCE.getPointSequence();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_SEQUENCE__POINT = eINSTANCE.getPointSequence_Point();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.PointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Point Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__POINT_INDEX = eINSTANCE.getPoint_PointIndex();

		/**
		 * The meta object literal for the '<em><b>Point Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__POINT_TYPE = eINSTANCE.getPoint_PointType();

		/**
		 * The meta object literal for the '<em><b>Distance To Previous Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__DISTANCE_TO_PREVIOUS_POINT = eINSTANCE.getPoint_DistanceToPreviousPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl <em>Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getPointType()
		 * @generated
		 */
		EClass POINT_TYPE = eINSTANCE.getPointType();

		/**
		 * The meta object literal for the '<em><b>Stop Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE__STOP_POINT = eINSTANCE.getPointType_StopPoint();

		/**
		 * The meta object literal for the '<em><b>Beacon Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE__BEACON_POINT = eINSTANCE.getPointType_BeaconPoint();

		/**
		 * The meta object literal for the '<em><b>GNSS Location Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE__GNSS_LOCATION_POINT = eINSTANCE.getPointType_GNSSLocationPoint();

		/**
		 * The meta object literal for the '<em><b>Timing Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE__TIMING_POINT = eINSTANCE.getPointType_TimingPoint();

		/**
		 * The meta object literal for the '<em><b>TSP Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE__TSP_POINT = eINSTANCE.getPointType_TSPPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationImpl <em>Service Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceIdentification()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION = eINSTANCE.getServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION__SERVICE = eINSTANCE.getServiceIdentification_Service();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION__DEVICE = eINSTANCE.getServiceIdentification_Device();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateListImpl <em>Service Identification With State List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceIdentificationWithStateList()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_WITH_STATE_LIST = eINSTANCE.getServiceIdentificationWithStateList();

		/**
		 * The meta object literal for the '<em><b>Service Identification With State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE = eINSTANCE.getServiceIdentificationWithStateList_ServiceIdentificationWithState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateImpl <em>Service Identification With State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceIdentificationWithState()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_WITH_STATE = eINSTANCE.getServiceIdentificationWithState();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_WITH_STATE__SERVICE_IDENTIFICATION = eINSTANCE.getServiceIdentificationWithState_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_WITH_STATE__SERVICE_STATE = eINSTANCE.getServiceIdentificationWithState_ServiceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceInformationListImpl <em>Service Information List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceInformationListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceInformationList()
		 * @generated
		 */
		EClass SERVICE_INFORMATION_LIST = eINSTANCE.getServiceInformationList();

		/**
		 * The meta object literal for the '<em><b>Service Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_LIST__SERVICE_INFORMATION = eINSTANCE.getServiceInformationList_ServiceInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceInformationImpl <em>Service Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceInformation()
		 * @generated
		 */
		EClass SERVICE_INFORMATION = eINSTANCE.getServiceInformation();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION__SERVICE = eINSTANCE.getServiceInformation_Service();

		/**
		 * The meta object literal for the '<em><b>Autostart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION__AUTOSTART = eINSTANCE.getServiceInformation_Autostart();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationImpl <em>Service Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceSpecification()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION = eINSTANCE.getServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPECIFICATION__SERVICE_NAME = eINSTANCE.getServiceSpecification_ServiceName();

		/**
		 * The meta object literal for the '<em><b>IBISIP Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION__IBISIP_VERSION = eINSTANCE.getServiceSpecification_IBISIPVersion();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateListImpl <em>Service Specification With State List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceSpecificationWithStateList()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION_WITH_STATE_LIST = eINSTANCE.getServiceSpecificationWithStateList();

		/**
		 * The meta object literal for the '<em><b>Service Specification With State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE = eINSTANCE.getServiceSpecificationWithStateList_ServiceSpecificationWithState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateImpl <em>Service Specification With State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceSpecificationWithState()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION_WITH_STATE = eINSTANCE.getServiceSpecificationWithState();

		/**
		 * The meta object literal for the '<em><b>Service Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION_WITH_STATE__SERVICE_SPECIFICATION = eINSTANCE.getServiceSpecificationWithState_ServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Service State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPECIFICATION_WITH_STATE__SERVICE_STATE = eINSTANCE.getServiceSpecificationWithState_ServiceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartListImpl <em>Service Start List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceStartListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceStartList()
		 * @generated
		 */
		EClass SERVICE_START_LIST = eINSTANCE.getServiceStartList();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_START_LIST__SERVICE_IDENTIFICATION = eINSTANCE.getServiceStartList_ServiceIdentification();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartImpl <em>Service Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ServiceStartImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getServiceStart()
		 * @generated
		 */
		EClass SERVICE_START = eINSTANCE.getServiceStart();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_START__SERVICE_IDENTIFICATION = eINSTANCE.getServiceStart_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Autostart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_START__AUTOSTART = eINSTANCE.getServiceStart_Autostart();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ShortTripStopListImpl <em>Short Trip Stop List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ShortTripStopListImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getShortTripStopList()
		 * @generated
		 */
		EClass SHORT_TRIP_STOP_LIST = eINSTANCE.getShortTripStopList();

		/**
		 * The meta object literal for the '<em><b>Short Trip Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_TRIP_STOP_LIST__SHORT_TRIP_STOP = eINSTANCE.getShortTripStopList_ShortTripStop();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ShortTripStopImpl <em>Short Trip Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ShortTripStopImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getShortTripStop()
		 * @generated
		 */
		EClass SHORT_TRIP_STOP = eINSTANCE.getShortTripStop();

		/**
		 * The meta object literal for the '<em><b>Journey Stop Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION = eINSTANCE.getShortTripStop_JourneyStopInformation();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_TRIP_STOP__FARE_ZONE_INFORMATION = eINSTANCE.getShortTripStop_FareZoneInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.SpecificPointImpl <em>Specific Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.SpecificPointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getSpecificPoint()
		 * @generated
		 */
		EClass SPECIFIC_POINT = eINSTANCE.getSpecificPoint();

		/**
		 * The meta object literal for the '<em><b>Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_POINT__POINT_REF = eINSTANCE.getSpecificPoint_PointRef();

		/**
		 * The meta object literal for the '<em><b>Distance To Previous Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_POINT__DISTANCE_TO_PREVIOUS_POINT = eINSTANCE.getSpecificPoint_DistanceToPreviousPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopInformationRequestImpl <em>Stop Information Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.StopInformationRequestImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopInformationRequest()
		 * @generated
		 */
		EClass STOP_INFORMATION_REQUEST = eINSTANCE.getStopInformationRequest();

		/**
		 * The meta object literal for the '<em><b>Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__STOP_INDEX = eINSTANCE.getStopInformationRequest_StopIndex();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__STOP_REF = eINSTANCE.getStopInformationRequest_StopRef();

		/**
		 * The meta object literal for the '<em><b>Stop Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__STOP_NAME = eINSTANCE.getStopInformationRequest_StopName();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__DISPLAY_CONTENT = eINSTANCE.getStopInformationRequest_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Stop Announcement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__STOP_ANNOUNCEMENT = eINSTANCE.getStopInformationRequest_StopAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Arrival Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__ARRIVAL_SCHEDULED = eINSTANCE.getStopInformationRequest_ArrivalScheduled();

		/**
		 * The meta object literal for the '<em><b>Departure Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__DEPARTURE_SCHEDULED = eINSTANCE.getStopInformationRequest_DepartureScheduled();

		/**
		 * The meta object literal for the '<em><b>Recorded Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__RECORDED_ARRIVAL_TIME = eINSTANCE.getStopInformationRequest_RecordedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Distance To Next Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__DISTANCE_TO_NEXT_STOP = eINSTANCE.getStopInformationRequest_DistanceToNextStop();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__CONNECTION = eINSTANCE.getStopInformationRequest_Connection();

		/**
		 * The meta object literal for the '<em><b>Fare Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION_REQUEST__FARE_ZONE = eINSTANCE.getStopInformationRequest_FareZone();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopInformationImpl <em>Stop Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.StopInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopInformation()
		 * @generated
		 */
		EClass STOP_INFORMATION = eINSTANCE.getStopInformation();

		/**
		 * The meta object literal for the '<em><b>Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__STOP_INDEX = eINSTANCE.getStopInformation_StopIndex();

		/**
		 * The meta object literal for the '<em><b>Stop Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__STOP_REF = eINSTANCE.getStopInformation_StopRef();

		/**
		 * The meta object literal for the '<em><b>Stop Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__STOP_NAME = eINSTANCE.getStopInformation_StopName();

		/**
		 * The meta object literal for the '<em><b>Stop Alternative Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__STOP_ALTERNATIVE_NAME = eINSTANCE.getStopInformation_StopAlternativeName();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__PLATFORM = eINSTANCE.getStopInformation_Platform();

		/**
		 * The meta object literal for the '<em><b>Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__DISPLAY_CONTENT = eINSTANCE.getStopInformation_DisplayContent();

		/**
		 * The meta object literal for the '<em><b>Stop Announcement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__STOP_ANNOUNCEMENT = eINSTANCE.getStopInformation_StopAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Arrival Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__ARRIVAL_SCHEDULED = eINSTANCE.getStopInformation_ArrivalScheduled();

		/**
		 * The meta object literal for the '<em><b>Arrival Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__ARRIVAL_EXPECTED = eINSTANCE.getStopInformation_ArrivalExpected();

		/**
		 * The meta object literal for the '<em><b>Departure Scheduled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__DEPARTURE_SCHEDULED = eINSTANCE.getStopInformation_DepartureScheduled();

		/**
		 * The meta object literal for the '<em><b>Departure Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__DEPARTURE_EXPECTED = eINSTANCE.getStopInformation_DepartureExpected();

		/**
		 * The meta object literal for the '<em><b>Recorded Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__RECORDED_ARRIVAL_TIME = eINSTANCE.getStopInformation_RecordedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Distance To Next Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__DISTANCE_TO_NEXT_STOP = eINSTANCE.getStopInformation_DistanceToNextStop();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__CONNECTION = eINSTANCE.getStopInformation_Connection();

		/**
		 * The meta object literal for the '<em><b>Fare Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_INFORMATION__FARE_ZONE = eINSTANCE.getStopInformation_FareZone();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopPointTariffInformationImpl <em>Stop Point Tariff Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.StopPointTariffInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopPointTariffInformation()
		 * @generated
		 */
		EClass STOP_POINT_TARIFF_INFORMATION = eINSTANCE.getStopPointTariffInformation();

		/**
		 * The meta object literal for the '<em><b>Journey Stop Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_POINT_TARIFF_INFORMATION__JOURNEY_STOP_INFORMATION = eINSTANCE.getStopPointTariffInformation_JourneyStopInformation();

		/**
		 * The meta object literal for the '<em><b>Fare Zone Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_POINT_TARIFF_INFORMATION__FARE_ZONE_INFORMATION = eINSTANCE.getStopPointTariffInformation_FareZoneInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.StopSequenceImpl <em>Stop Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.StopSequenceImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getStopSequence()
		 * @generated
		 */
		EClass STOP_SEQUENCE = eINSTANCE.getStopSequence();

		/**
		 * The meta object literal for the '<em><b>Stop Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_SEQUENCE__STOP_POINT = eINSTANCE.getStopSequence_StopPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.SubscribeRequestImpl <em>Subscribe Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.SubscribeRequestImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getSubscribeRequest()
		 * @generated
		 */
		EClass SUBSCRIBE_REQUEST = eINSTANCE.getSubscribeRequest();

		/**
		 * The meta object literal for the '<em><b>Client IP Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS = eINSTANCE.getSubscribeRequest_ClientIPAddress();

		/**
		 * The meta object literal for the '<em><b>Reply Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_REQUEST__REPLY_PORT = eINSTANCE.getSubscribeRequest_ReplyPort();

		/**
		 * The meta object literal for the '<em><b>Reply Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_REQUEST__REPLY_PATH = eINSTANCE.getSubscribeRequest_ReplyPath();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.SubscribeResponseImpl <em>Subscribe Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.SubscribeResponseImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getSubscribeResponse()
		 * @generated
		 */
		EClass SUBSCRIBE_RESPONSE = eINSTANCE.getSubscribeResponse();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_RESPONSE__ACTIVE = eINSTANCE.getSubscribeResponse_Active();

		/**
		 * The meta object literal for the '<em><b>Heartbeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_RESPONSE__HEARTBEAT = eINSTANCE.getSubscribeResponse_Heartbeat();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.TimingPointImpl <em>Timing Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.TimingPointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTimingPoint()
		 * @generated
		 */
		EClass TIMING_POINT = eINSTANCE.getTimingPoint();

		/**
		 * The meta object literal for the '<em><b>Timing Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_POINT__TIMING_POINT_REF = eINSTANCE.getTimingPoint_TimingPointRef();

		/**
		 * The meta object literal for the '<em><b>Schedule Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_POINT__SCHEDULE_TIME = eINSTANCE.getTimingPoint_ScheduleTime();

		/**
		 * The meta object literal for the '<em><b>GNSS Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_POINT__GNSS_POINT = eINSTANCE.getTimingPoint_GNSSPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.TripInformationImpl <em>Trip Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.TripInformationImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTripInformation()
		 * @generated
		 */
		EClass TRIP_INFORMATION = eINSTANCE.getTripInformation();

		/**
		 * The meta object literal for the '<em><b>Trip Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__TRIP_REF = eINSTANCE.getTripInformation_TripRef();

		/**
		 * The meta object literal for the '<em><b>Stop Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__STOP_SEQUENCE = eINSTANCE.getTripInformation_StopSequence();

		/**
		 * The meta object literal for the '<em><b>Location State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INFORMATION__LOCATION_STATE = eINSTANCE.getTripInformation_LocationState();

		/**
		 * The meta object literal for the '<em><b>Timetable Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__TIMETABLE_DELAY = eINSTANCE.getTripInformation_TimetableDelay();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE = eINSTANCE.getTripInformation_AdditionalTextMessage();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE1 = eINSTANCE.getTripInformation_AdditionalTextMessage1();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE2 = eINSTANCE.getTripInformation_AdditionalTextMessage2();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE3 = eINSTANCE.getTripInformation_AdditionalTextMessage3();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE4 = eINSTANCE.getTripInformation_AdditionalTextMessage4();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE5 = eINSTANCE.getTripInformation_AdditionalTextMessage5();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE6 = eINSTANCE.getTripInformation_AdditionalTextMessage6();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message7</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE7 = eINSTANCE.getTripInformation_AdditionalTextMessage7();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message8</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE8 = eINSTANCE.getTripInformation_AdditionalTextMessage8();

		/**
		 * The meta object literal for the '<em><b>Additional Text Message9</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE9 = eINSTANCE.getTripInformation_AdditionalTextMessage9();

		/**
		 * The meta object literal for the '<em><b>Additional Announcement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__ADDITIONAL_ANNOUNCEMENT = eINSTANCE.getTripInformation_AdditionalAnnouncement();

		/**
		 * The meta object literal for the '<em><b>Route Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INFORMATION__ROUTE_DIRECTION = eINSTANCE.getTripInformation_RouteDirection();

		/**
		 * The meta object literal for the '<em><b>Run Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__RUN_NUMBER = eINSTANCE.getTripInformation_RunNumber();

		/**
		 * The meta object literal for the '<em><b>Pattern Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__PATTERN_NUMBER = eINSTANCE.getTripInformation_PatternNumber();

		/**
		 * The meta object literal for the '<em><b>Path Destination Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_INFORMATION__PATH_DESTINATION_NUMBER = eINSTANCE.getTripInformation_PathDestinationNumber();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.TripSequenceImpl <em>Trip Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.TripSequenceImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTripSequence()
		 * @generated
		 */
		EClass TRIP_SEQUENCE = eINSTANCE.getTripSequence();

		/**
		 * The meta object literal for the '<em><b>Trip Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE__TRIP_REF = eINSTANCE.getTripSequence_TripRef();

		/**
		 * The meta object literal for the '<em><b>Trip Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE__TRIP_INDEX = eINSTANCE.getTripSequence_TripIndex();

		/**
		 * The meta object literal for the '<em><b>Trip Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE__TRIP_START = eINSTANCE.getTripSequence_TripStart();

		/**
		 * The meta object literal for the '<em><b>Current Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE__CURRENT_STOP_INDEX = eINSTANCE.getTripSequence_CurrentStopIndex();

		/**
		 * The meta object literal for the '<em><b>Journey Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_SEQUENCE__JOURNEY_MODE = eINSTANCE.getTripSequence_JourneyMode();

		/**
		 * The meta object literal for the '<em><b>Point Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_SEQUENCE__POINT_SEQUENCE = eINSTANCE.getTripSequence_PointSequence();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl <em>TSP Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getTSPPoint()
		 * @generated
		 */
		EClass TSP_POINT = eINSTANCE.getTSPPoint();

		/**
		 * The meta object literal for the '<em><b>TSP Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT__TSP_POINT_REF = eINSTANCE.getTSPPoint_TSPPointRef();

		/**
		 * The meta object literal for the '<em><b>TSP Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT__TSP_CODE = eINSTANCE.getTSPPoint_TSPCode();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT__SHORT_NAME = eINSTANCE.getTSPPoint_ShortName();

		/**
		 * The meta object literal for the '<em><b>Desciption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSP_POINT__DESCIPTION = eINSTANCE.getTSPPoint_Desciption();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl <em>Unsubscribe Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getUnsubscribeRequest()
		 * @generated
		 */
		EClass UNSUBSCRIBE_REQUEST = eINSTANCE.getUnsubscribeRequest();

		/**
		 * The meta object literal for the '<em><b>Client IP Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS = eINSTANCE.getUnsubscribeRequest_ClientIPAddress();

		/**
		 * The meta object literal for the '<em><b>Reply Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_REQUEST__REPLY_PORT = eINSTANCE.getUnsubscribeRequest_ReplyPort();

		/**
		 * The meta object literal for the '<em><b>Reply Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_REQUEST__REPLY_PATH = eINSTANCE.getUnsubscribeRequest_ReplyPath();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeResponseImpl <em>Unsubscribe Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.UnsubscribeResponseImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getUnsubscribeResponse()
		 * @generated
		 */
		EClass UNSUBSCRIBE_RESPONSE = eINSTANCE.getUnsubscribeResponse();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSUBSCRIBE_RESPONSE__ACTIVE = eINSTANCE.getUnsubscribeResponse_Active();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.VehicleImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__VEHICLE_TYPE_REF = eINSTANCE.getVehicle_VehicleTypeRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ViaPointImpl <em>Via Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ViaPointImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getViaPoint()
		 * @generated
		 */
		EClass VIA_POINT = eINSTANCE.getViaPoint();

		/**
		 * The meta object literal for the '<em><b>Via Point Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT__VIA_POINT_REF = eINSTANCE.getViaPoint_ViaPointRef();

		/**
		 * The meta object literal for the '<em><b>Place Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT__PLACE_REF = eINSTANCE.getViaPoint_PlaceRef();

		/**
		 * The meta object literal for the '<em><b>Place Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT__PLACE_NAME = eINSTANCE.getViaPoint_PlaceName();

		/**
		 * The meta object literal for the '<em><b>Place Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT__PLACE_SHORT_NAME = eINSTANCE.getViaPoint_PlaceShortName();

		/**
		 * The meta object literal for the '<em><b>Via Point Display Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_POINT__VIA_POINT_DISPLAY_PRIORITY = eINSTANCE.getViaPoint_ViaPointDisplayPriority();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.ZoneTypeImpl <em>Zone Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.ZoneTypeImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getZoneType()
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

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl <em>General Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl
		 * @see de.jena.mdo.ibis.ibis_common.impl.IbisCommonPackageImpl#getGeneralResponse()
		 * @generated
		 */
		EClass GENERAL_RESPONSE = eINSTANCE.getGeneralResponse();

		/**
		 * The meta object literal for the '<em><b>Operation Error Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE = eINSTANCE.getGeneralResponse_OperationErrorMessage();

	}

} //IbisCommonPackage
