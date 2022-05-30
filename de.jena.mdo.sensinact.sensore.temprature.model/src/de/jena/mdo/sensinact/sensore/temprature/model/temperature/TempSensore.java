/**
 */
package de.jena.mdo.sensinact.sensore.temprature.model.temperature;

import de.jena.mdo.sensinact.resource.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temp Sensore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore#getTemprature <em>Temprature</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperaturePackage#getTempSensore()
 * @model
 * @generated
 */
public interface TempSensore extends Device {
	/**
	 * Returns the value of the '<em><b>Temprature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temprature</em>' attribute.
	 * @see #setTemprature(double)
	 * @see de.jena.mdo.sensinact.sensore.temprature.model.temperature.TemperaturePackage#getTempSensore_Temprature()
	 * @model required="true"
	 * @generated
	 */
	double getTemprature();

	/**
	 * Sets the value of the '{@link de.jena.mdo.sensinact.sensore.temprature.model.temperature.TempSensore#getTemprature <em>Temprature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temprature</em>' attribute.
	 * @see #getTemprature()
	 * @generated
	 */
	void setTemprature(double value);

} // TempSensore
