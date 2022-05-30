/**
 */
package de.jena.mdo.sensinact.resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.sensinact.resource.Device#getFriendlyName <em>Friendly Name</em>}</li>
 *   <li>{@link de.jena.mdo.sensinact.resource.Device#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.mdo.sensinact.resource.Device#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.sensinact.resource.ResourcePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friendly Name</em>' attribute.
	 * @see #setFriendlyName(String)
	 * @see de.jena.mdo.sensinact.resource.ResourcePackage#getDevice_FriendlyName()
	 * @model id="true"
	 * @generated
	 */
	String getFriendlyName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.sensinact.resource.Device#getFriendlyName <em>Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friendly Name</em>' attribute.
	 * @see #getFriendlyName()
	 * @generated
	 */
	void setFriendlyName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.jena.mdo.sensinact.resource.ResourcePackage#getDevice_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.sensinact.resource.Device#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.jena.mdo.sensinact.resource.ResourcePackage#getDevice_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.jena.mdo.sensinact.resource.Device#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // Device
