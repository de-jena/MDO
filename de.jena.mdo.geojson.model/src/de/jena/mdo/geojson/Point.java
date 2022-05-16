/**
 */
package de.jena.mdo.geojson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.geojson.Point#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.geojson.GeojsonPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Geometry {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see de.jena.mdo.geojson.GeojsonPackage#getPoint_Coordinates()
	 * @model upper="3"
	 * @generated
	 */
	EList<Double> getCoordinates();

} // Point
