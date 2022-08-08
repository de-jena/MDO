/**
 */
package de.jena.mdo.geojson;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.jena.mdo.geojson.GeojsonFactory
 * @model kind="package"
 * @generated
 */
public interface GeojsonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geojson";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datainmotion.com/emf/geojson/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geojson";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeojsonPackage eINSTANCE = de.jena.mdo.geojson.impl.GeojsonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.GeoJSONImpl <em>Geo JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.GeoJSONImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getGeoJSON()
	 * @generated
	 */
	int GEO_JSON = 0;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON__BBOX = 0;

	/**
	 * The number of structural features of the '<em>Geo JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geo JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.AbstractGeometryImpl <em>Abstract Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.AbstractGeometryImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getAbstractGeometry()
	 * @generated
	 */
	int ABSTRACT_GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY__BBOX = GEO_JSON__BBOX;

	/**
	 * The number of structural features of the '<em>Abstract Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_FEATURE_COUNT = GEO_JSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_OPERATION_COUNT = GEO_JSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.GeometryCollectionImpl <em>Geometry Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.GeometryCollectionImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getGeometryCollection()
	 * @generated
	 */
	int GEOMETRY_COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION__BBOX = ABSTRACT_GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Geometries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION__GEOMETRIES = ABSTRACT_GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometry Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION_FEATURE_COUNT = ABSTRACT_GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geometry Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION_OPERATION_COUNT = ABSTRACT_GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.GeometryImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 3;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__BBOX = ABSTRACT_GEOMETRY__BBOX;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = ABSTRACT_GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = ABSTRACT_GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.FeatureImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BBOX = GEO_JSON__BBOX;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = GEO_JSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = GEO_JSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GEOMETRY = GEO_JSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPERTIES = GEO_JSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = GEO_JSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = GEO_JSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.FeatureCollectionImpl <em>Feature Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.FeatureCollectionImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getFeatureCollection()
	 * @generated
	 */
	int FEATURE_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__BBOX = GEO_JSON__BBOX;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__FEATURES = GEO_JSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_FEATURE_COUNT = GEO_JSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_OPERATION_COUNT = GEO_JSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.PointImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 6;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.LineStringImpl <em>Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.LineStringImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getLineString()
	 * @generated
	 */
	int LINE_STRING = 7;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.MultiPointImpl <em>Multi Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.MultiPointImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getMultiPoint()
	 * @generated
	 */
	int MULTI_POINT = 8;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.PolygonImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 9;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.MultiLineStringImpl <em>Multi Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.MultiLineStringImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getMultiLineString()
	 * @generated
	 */
	int MULTI_LINE_STRING = 10;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.MultiPolygonImpl <em>Multi Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.MultiPolygonImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getMultiPolygon()
	 * @generated
	 */
	int MULTI_POLYGON = 11;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.StringToStringMapImpl
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.geojson.FeatureType <em>Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.FeatureType
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Array1 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getArray1D()
	 * @generated
	 */
	int ARRAY1_D = 14;

	/**
	 * The meta object id for the '<em>Array2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getArray2D()
	 * @generated
	 */
	int ARRAY2_D = 15;

	/**
	 * The meta object id for the '<em>Array3 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getArray3D()
	 * @generated
	 */
	int ARRAY3_D = 16;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.GeoJSON <em>Geo JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo JSON</em>'.
	 * @see de.jena.mdo.geojson.GeoJSON
	 * @generated
	 */
	EClass getGeoJSON();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.geojson.GeoJSON#getBbox <em>Bbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox</em>'.
	 * @see de.jena.mdo.geojson.GeoJSON#getBbox()
	 * @see #getGeoJSON()
	 * @generated
	 */
	EAttribute getGeoJSON_Bbox();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.AbstractGeometry <em>Abstract Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Geometry</em>'.
	 * @see de.jena.mdo.geojson.AbstractGeometry
	 * @generated
	 */
	EClass getAbstractGeometry();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.GeometryCollection <em>Geometry Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Collection</em>'.
	 * @see de.jena.mdo.geojson.GeometryCollection
	 * @generated
	 */
	EClass getGeometryCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.geojson.GeometryCollection#getGeometries <em>Geometries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometries</em>'.
	 * @see de.jena.mdo.geojson.GeometryCollection#getGeometries()
	 * @see #getGeometryCollection()
	 * @generated
	 */
	EReference getGeometryCollection_Geometries();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see de.jena.mdo.geojson.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.jena.mdo.geojson.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.geojson.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.mdo.geojson.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.geojson.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.geojson.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.geojson.Feature#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see de.jena.mdo.geojson.Feature#getGeometry()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Geometry();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.geojson.Feature#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see de.jena.mdo.geojson.Feature#getProperties()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Properties();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.FeatureCollection <em>Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Collection</em>'.
	 * @see de.jena.mdo.geojson.FeatureCollection
	 * @generated
	 */
	EClass getFeatureCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.geojson.FeatureCollection#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see de.jena.mdo.geojson.FeatureCollection#getFeatures()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EReference getFeatureCollection_Features();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see de.jena.mdo.geojson.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.geojson.Point#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see de.jena.mdo.geojson.Point#getCoordinates()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String</em>'.
	 * @see de.jena.mdo.geojson.LineString
	 * @generated
	 */
	EClass getLineString();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.geojson.LineString#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see de.jena.mdo.geojson.LineString#getCoordinates()
	 * @see #getLineString()
	 * @generated
	 */
	EAttribute getLineString_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.MultiPoint <em>Multi Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Point</em>'.
	 * @see de.jena.mdo.geojson.MultiPoint
	 * @generated
	 */
	EClass getMultiPoint();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.geojson.MultiPoint#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see de.jena.mdo.geojson.MultiPoint#getCoordinates()
	 * @see #getMultiPoint()
	 * @generated
	 */
	EAttribute getMultiPoint_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see de.jena.mdo.geojson.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.geojson.Polygon#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see de.jena.mdo.geojson.Polygon#getCoordinates()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.MultiLineString <em>Multi Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Line String</em>'.
	 * @see de.jena.mdo.geojson.MultiLineString
	 * @generated
	 */
	EClass getMultiLineString();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.geojson.MultiLineString#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see de.jena.mdo.geojson.MultiLineString#getCoordinates()
	 * @see #getMultiLineString()
	 * @generated
	 */
	EAttribute getMultiLineString_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.geojson.MultiPolygon <em>Multi Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Polygon</em>'.
	 * @see de.jena.mdo.geojson.MultiPolygon
	 * @generated
	 */
	EClass getMultiPolygon();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.geojson.MultiPolygon#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see de.jena.mdo.geojson.MultiPolygon#getCoordinates()
	 * @see #getMultiPolygon()
	 * @generated
	 */
	EAttribute getMultiPolygon_Coordinates();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.geojson.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Type</em>'.
	 * @see de.jena.mdo.geojson.FeatureType
	 * @generated
	 */
	EEnum getFeatureType();

	/**
	 * Returns the meta object for data type '<em>Array1 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array1 D</em>'.
	 * @model instanceClass="java.lang.Double[]"
	 * @generated
	 */
	EDataType getArray1D();

	/**
	 * Returns the meta object for data type '<em>Array2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array2 D</em>'.
	 * @model instanceClass="java.lang.Double[][]"
	 * @generated
	 */
	EDataType getArray2D();

	/**
	 * Returns the meta object for data type '<em>Array3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array3 D</em>'.
	 * @model instanceClass="java.lang.Double[][][]"
	 * @generated
	 */
	EDataType getArray3D();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeojsonFactory getGeojsonFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.GeoJSONImpl <em>Geo JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.GeoJSONImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getGeoJSON()
		 * @generated
		 */
		EClass GEO_JSON = eINSTANCE.getGeoJSON();

		/**
		 * The meta object literal for the '<em><b>Bbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_JSON__BBOX = eINSTANCE.getGeoJSON_Bbox();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.AbstractGeometryImpl <em>Abstract Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.AbstractGeometryImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getAbstractGeometry()
		 * @generated
		 */
		EClass ABSTRACT_GEOMETRY = eINSTANCE.getAbstractGeometry();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.GeometryCollectionImpl <em>Geometry Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.GeometryCollectionImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getGeometryCollection()
		 * @generated
		 */
		EClass GEOMETRY_COLLECTION = eINSTANCE.getGeometryCollection();

		/**
		 * The meta object literal for the '<em><b>Geometries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_COLLECTION__GEOMETRIES = eINSTANCE.getGeometryCollection_Geometries();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.GeometryImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.FeatureImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GEOMETRY = eINSTANCE.getFeature_Geometry();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PROPERTIES = eINSTANCE.getFeature_Properties();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.FeatureCollectionImpl <em>Feature Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.FeatureCollectionImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getFeatureCollection()
		 * @generated
		 */
		EClass FEATURE_COLLECTION = eINSTANCE.getFeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION__FEATURES = eINSTANCE.getFeatureCollection_Features();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.PointImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__COORDINATES = eINSTANCE.getPoint_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.LineStringImpl <em>Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.LineStringImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getLineString()
		 * @generated
		 */
		EClass LINE_STRING = eINSTANCE.getLineString();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING__COORDINATES = eINSTANCE.getLineString_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.MultiPointImpl <em>Multi Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.MultiPointImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getMultiPoint()
		 * @generated
		 */
		EClass MULTI_POINT = eINSTANCE.getMultiPoint();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_POINT__COORDINATES = eINSTANCE.getMultiPoint_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.PolygonImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__COORDINATES = eINSTANCE.getPolygon_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.MultiLineStringImpl <em>Multi Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.MultiLineStringImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getMultiLineString()
		 * @generated
		 */
		EClass MULTI_LINE_STRING = eINSTANCE.getMultiLineString();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_STRING__COORDINATES = eINSTANCE.getMultiLineString_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.MultiPolygonImpl <em>Multi Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.MultiPolygonImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getMultiPolygon()
		 * @generated
		 */
		EClass MULTI_POLYGON = eINSTANCE.getMultiPolygon();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_POLYGON__COORDINATES = eINSTANCE.getMultiPolygon_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.StringToStringMapImpl
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.geojson.FeatureType <em>Feature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.FeatureType
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getFeatureType()
		 * @generated
		 */
		EEnum FEATURE_TYPE = eINSTANCE.getFeatureType();

		/**
		 * The meta object literal for the '<em>Array1 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getArray1D()
		 * @generated
		 */
		EDataType ARRAY1_D = eINSTANCE.getArray1D();

		/**
		 * The meta object literal for the '<em>Array2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getArray2D()
		 * @generated
		 */
		EDataType ARRAY2_D = eINSTANCE.getArray2D();

		/**
		 * The meta object literal for the '<em>Array3 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.geojson.impl.GeojsonPackageImpl#getArray3D()
		 * @generated
		 */
		EDataType ARRAY3_D = eINSTANCE.getArray3D();

	}

} //GeojsonPackage
