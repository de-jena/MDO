/**
 */
package de.jena.mdo.geojson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.geojson.FeatureCollection#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.geojson.GeojsonPackage#getFeatureCollection()
 * @model
 * @generated
 */
public interface FeatureCollection extends GeoJSON {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.geojson.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see de.jena.mdo.geojson.GeojsonPackage#getFeatureCollection_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureCollection
