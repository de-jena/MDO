/**
 */
package de.jena.mdo.geojson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.geojson.GeometryCollection#getGeometries <em>Geometries</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.geojson.GeojsonPackage#getGeometryCollection()
 * @model
 * @generated
 */
public interface GeometryCollection extends AbstractGeometry {
	/**
	 * Returns the value of the '<em><b>Geometries</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.geojson.AbstractGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometries</em>' containment reference list.
	 * @see de.jena.mdo.geojson.GeojsonPackage#getGeometryCollection_Geometries()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractGeometry> getGeometries();

} // GeometryCollection
