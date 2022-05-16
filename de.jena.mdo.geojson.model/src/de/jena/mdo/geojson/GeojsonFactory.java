/*
 */
package de.jena.mdo.geojson;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.geojson.GeojsonPackage
 * @generated
 */
public interface GeojsonFactory extends EFactory {
	/**
	 * Returns a new object of class '<em>Geo JSON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo JSON</em>'.
	 * @generated
	 */
	GeoJSON createGeoJSON();

	/**
	 * Returns a new object of class '<em>Geometry Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry Collection</em>'.
	 * @generated
	 */
	GeometryCollection createGeometryCollection();

	/**
	 * Returns a new object of class '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry</em>'.
	 * @generated
	 */
	Geometry createGeometry();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Feature Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Collection</em>'.
	 * @generated
	 */
	FeatureCollection createFeatureCollection();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Line String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line String</em>'.
	 * @generated
	 */
	LineString createLineString();

	/**
	 * Returns a new object of class '<em>Multi Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Point</em>'.
	 * @generated
	 */
	MultiPoint createMultiPoint();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Multi Line String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Line String</em>'.
	 * @generated
	 */
	MultiLineString createMultiLineString();

	/**
	 * Returns a new object of class '<em>Multi Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Polygon</em>'.
	 * @generated
	 */
	MultiPolygon createMultiPolygon();

	/**
	 * Returns an instance of data type '<em>Feature Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	FeatureType createFeatureType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertFeatureType(FeatureType instanceValue);

	/**
	 * Returns an instance of data type '<em>Array1 D</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Double[] createArray1D(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Array1 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertArray1D(Double[] instanceValue);

	/**
	 * Returns an instance of data type '<em>Array2 D</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Double[][] createArray2D(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Array2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertArray2D(Double[][] instanceValue);

	/**
	 * Returns an instance of data type '<em>Array3 D</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Double[][][] createArray3D(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Array3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertArray3D(Double[][][] instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeojsonPackage getGeojsonPackage();

} //GeojsonFactory
