/*
 */
package de.jena.mdo.sensinact.sensore.temprature.model.temperature;

import de.jena.mdo.sensinact.resource.ResourcePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperatureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' resource='platform:/resource/de.jena.mdo.sensinact.resource.model/model/resource.ecore#/'"
 * @generated
 */
public interface TemperaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "temperature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/model/sensore/rest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "temperature";
	
	/**
	 * The meta object id for the '{@link de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl.TempSensoreImpl <em>Temp Sensore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl.TempSensoreImpl
	 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.impl.TemperaturePackageImpl#getTempSensore()
	 * @generated
	 */
	int TEMP_SENSORE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE__NAME = ResourcePackage.DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE__FRIENDLY_NAME = ResourcePackage.DEVICE__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE__LOCATION = ResourcePackage.DEVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE__ICON = ResourcePackage.DEVICE__ICON;

	/**
	 * The feature id for the '<em><b>Temprature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE__TEMPRATURE = ResourcePackage.DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temp Sensore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE_FEATURE_COUNT = ResourcePackage.DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temp Sensore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_SENSORE_OPERATION_COUNT = ResourcePackage.DEVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore <em>Temp Sensore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp Sensore</em>'.
	 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore
	 * @generated
	 */
	EClass getTempSensore();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore#getTemprature <em>Temprature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temprature</em>'.
	 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore#getTemprature()
	 * @see #getTempSensore()
	 * @generated
	 */
	EAttribute getTempSensore_Temprature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemperatureFactory getTemperatureFactory();

} //TemperaturePackage
