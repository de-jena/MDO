/**
 */
package de.jena.mdo.geojson.impl;

import de.jena.mdo.geojson.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeojsonFactoryImpl extends EFactoryImpl implements GeojsonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeojsonFactory init() {
		try {
			GeojsonFactory theGeojsonFactory = (GeojsonFactory)EPackage.Registry.INSTANCE.getEFactory(GeojsonPackage.eNS_URI);
			if (theGeojsonFactory != null) {
				return theGeojsonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeojsonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeojsonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GeojsonPackage.GEO_JSON: return createGeoJSON();
			case GeojsonPackage.GEOMETRY_COLLECTION: return createGeometryCollection();
			case GeojsonPackage.GEOMETRY: return createGeometry();
			case GeojsonPackage.FEATURE: return createFeature();
			case GeojsonPackage.FEATURE_COLLECTION: return createFeatureCollection();
			case GeojsonPackage.POINT: return createPoint();
			case GeojsonPackage.LINE_STRING: return createLineString();
			case GeojsonPackage.MULTI_POINT: return createMultiPoint();
			case GeojsonPackage.POLYGON: return createPolygon();
			case GeojsonPackage.MULTI_LINE_STRING: return createMultiLineString();
			case GeojsonPackage.MULTI_POLYGON: return createMultiPolygon();
			case GeojsonPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GeojsonPackage.FEATURE_TYPE:
				return createFeatureTypeFromString(eDataType, initialValue);
			case GeojsonPackage.ARRAY1_D:
				return createArray1DFromString(eDataType, initialValue);
			case GeojsonPackage.ARRAY2_D:
				return createArray2DFromString(eDataType, initialValue);
			case GeojsonPackage.ARRAY3_D:
				return createArray3DFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GeojsonPackage.FEATURE_TYPE:
				return convertFeatureTypeToString(eDataType, instanceValue);
			case GeojsonPackage.ARRAY1_D:
				return convertArray1DToString(eDataType, instanceValue);
			case GeojsonPackage.ARRAY2_D:
				return convertArray2DToString(eDataType, instanceValue);
			case GeojsonPackage.ARRAY3_D:
				return convertArray3DToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoJSON createGeoJSON() {
		GeoJSONImpl geoJSON = new GeoJSONImpl();
		return geoJSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryCollection createGeometryCollection() {
		GeometryCollectionImpl geometryCollection = new GeometryCollectionImpl();
		return geometryCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollection createFeatureCollection() {
		FeatureCollectionImpl featureCollection = new FeatureCollectionImpl();
		return featureCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineString createLineString() {
		LineStringImpl lineString = new LineStringImpl();
		return lineString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPoint createMultiPoint() {
		MultiPointImpl multiPoint = new MultiPointImpl();
		return multiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLineString createMultiLineString() {
		MultiLineStringImpl multiLineString = new MultiLineStringImpl();
		return multiLineString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPolygon createMultiPolygon() {
		MultiPolygonImpl multiPolygon = new MultiPolygonImpl();
		return multiPolygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType createFeatureTypeFromString(EDataType eDataType, String initialValue) {
		FeatureType result = FeatureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double[] createArray1DFromString(EDataType eDataType, String initialValue) {
		return (Double[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArray1DToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double[][] createArray2DFromString(EDataType eDataType, String initialValue) {
		return (Double[][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArray2DToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double[][][] createArray3DFromString(EDataType eDataType, String initialValue) {
		return (Double[][][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArray3DToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeojsonPackage getGeojsonPackage() {
		return (GeojsonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeojsonPackage getPackage() {
		return GeojsonPackage.eINSTANCE;
	}

} //GeojsonFactoryImpl
