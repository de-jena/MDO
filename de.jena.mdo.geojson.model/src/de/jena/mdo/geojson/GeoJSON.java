/*
 */
package de.jena.mdo.geojson;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo JSON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.geojson.GeoJSON#getBbox <em>Bbox</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.geojson.GeojsonPackage#getGeoJSON()
 * @model
 * @generated
 */
@ProviderType
public interface GeoJSON extends EObject {
	/**
	 * Returns the value of the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox</em>' attribute.
	 * @see #setBbox(Double[])
	 * @see de.jena.mdo.geojson.GeojsonPackage#getGeoJSON_Bbox()
	 * @model dataType="de.jena.mdo.geojson.Array1D"
	 * @generated
	 */
	Double[] getBbox();

	/**
	 * Sets the value of the '{@link de.jena.mdo.geojson.GeoJSON#getBbox <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox</em>' attribute.
	 * @see #getBbox()
	 * @generated
	 */
	void setBbox(Double[] value);

} // GeoJSON
