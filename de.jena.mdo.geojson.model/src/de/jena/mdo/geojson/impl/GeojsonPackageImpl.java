/*
 */
package de.jena.mdo.geojson.impl;

import de.jena.mdo.geojson.AbstractGeometry;
import de.jena.mdo.geojson.Feature;
import de.jena.mdo.geojson.FeatureCollection;
import de.jena.mdo.geojson.FeatureType;
import de.jena.mdo.geojson.GeoJSON;
import de.jena.mdo.geojson.GeojsonFactory;
import de.jena.mdo.geojson.GeojsonPackage;
import de.jena.mdo.geojson.Geometry;
import de.jena.mdo.geojson.GeometryCollection;
import de.jena.mdo.geojson.LineString;
import de.jena.mdo.geojson.MultiLineString;
import de.jena.mdo.geojson.MultiPoint;
import de.jena.mdo.geojson.MultiPolygon;
import de.jena.mdo.geojson.Point;
import de.jena.mdo.geojson.Polygon;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@EMFModel(name=GeojsonPackage.eNAME, nsURI={GeojsonPackage.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = GeojsonPackage.eNAME, nsURI = { GeojsonPackage.eNS_URI }, version = "1.0.0")
@Component( name = GeojsonPackage.eNAME, service = { GeojsonPackage.class, EPackage.class }, immediate = true, scope = ServiceScope.SINGLETON)
public class GeojsonPackageImpl extends EPackageImpl implements GeojsonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoJSONEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLineStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPolygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType array1DEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType array2DEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType array3DEDataType = null;


	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;

	/**
	 * Creates an instance of the model <b>Package</b>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.mdo.geojson.GeojsonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	public GeojsonPackageImpl() {
		super();
	}

    /**
	 * Activates and initializes the Package and registers the Package {@link org.gecko.emf.osgi.EPackageConfigurator}.
	 *
     * @generated
	 */
    @Activate
	public void activate(BundleContext ctx) {
		// Create package meta-data objects
		createPackageContents();

		// Initialize created meta-data
		initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		freeze();

		setEFactoryInstance(new GeojsonFactoryImpl(this));

		// register the EPackageConfigurator
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, GeojsonPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, GeojsonPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "geojson");
		
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, new GeojsonEPackageConfigurator(this), properties);
		
		//regsiter the EFactory as a service
		eFactoryRegistration = ctx.registerService(new String[]{EFactory.class.getName(), GeojsonFactory.class.getName()}, getGeojsonFactory(), properties);
	}
	
	@Deactivate
	public void deactivate() {
		if(ePackageConfiguratorRegistration != null){
			ePackageConfiguratorRegistration.unregister();
		}
		if(eFactoryRegistration != null){
			eFactoryRegistration.unregister();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoJSON() {
		return geoJSONEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoJSON_Bbox() {
		return (EAttribute)geoJSONEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractGeometry() {
		return abstractGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometryCollection() {
		return geometryCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeometryCollection_Geometries() {
		return (EReference)geometryCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Type() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Id() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Geometry() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Properties() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureCollection() {
		return featureCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollection_Features() {
		return (EReference)featureCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Coordinates() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineString() {
		return lineStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineString_Coordinates() {
		return (EAttribute)lineStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiPoint() {
		return multiPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiPoint_Coordinates() {
		return (EAttribute)multiPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygon_Coordinates() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiLineString() {
		return multiLineStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiLineString_Coordinates() {
		return (EAttribute)multiLineStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiPolygon() {
		return multiPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiPolygon_Coordinates() {
		return (EAttribute)multiPolygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToStringMap() {
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMap_Key() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMap_Value() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureType() {
		return featureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getArray1D() {
		return array1DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getArray2D() {
		return array2DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getArray3D() {
		return array3DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeojsonFactory getGeojsonFactory() {
		return (GeojsonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		geoJSONEClass = createEClass(GEO_JSON);
		createEAttribute(geoJSONEClass, GEO_JSON__BBOX);

		abstractGeometryEClass = createEClass(ABSTRACT_GEOMETRY);

		geometryCollectionEClass = createEClass(GEOMETRY_COLLECTION);
		createEReference(geometryCollectionEClass, GEOMETRY_COLLECTION__GEOMETRIES);

		geometryEClass = createEClass(GEOMETRY);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__TYPE);
		createEAttribute(featureEClass, FEATURE__ID);
		createEReference(featureEClass, FEATURE__GEOMETRY);
		createEReference(featureEClass, FEATURE__PROPERTIES);

		featureCollectionEClass = createEClass(FEATURE_COLLECTION);
		createEReference(featureCollectionEClass, FEATURE_COLLECTION__FEATURES);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__COORDINATES);

		lineStringEClass = createEClass(LINE_STRING);
		createEAttribute(lineStringEClass, LINE_STRING__COORDINATES);

		multiPointEClass = createEClass(MULTI_POINT);
		createEAttribute(multiPointEClass, MULTI_POINT__COORDINATES);

		polygonEClass = createEClass(POLYGON);
		createEAttribute(polygonEClass, POLYGON__COORDINATES);

		multiLineStringEClass = createEClass(MULTI_LINE_STRING);
		createEAttribute(multiLineStringEClass, MULTI_LINE_STRING__COORDINATES);

		multiPolygonEClass = createEClass(MULTI_POLYGON);
		createEAttribute(multiPolygonEClass, MULTI_POLYGON__COORDINATES);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

		// Create enums
		featureTypeEEnum = createEEnum(FEATURE_TYPE);

		// Create data types
		array1DEDataType = createEDataType(ARRAY1_D);
		array2DEDataType = createEDataType(ARRAY2_D);
		array3DEDataType = createEDataType(ARRAY3_D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractGeometryEClass.getESuperTypes().add(this.getGeoJSON());
		geometryCollectionEClass.getESuperTypes().add(this.getAbstractGeometry());
		geometryEClass.getESuperTypes().add(this.getAbstractGeometry());
		featureEClass.getESuperTypes().add(this.getGeoJSON());
		featureCollectionEClass.getESuperTypes().add(this.getGeoJSON());
		pointEClass.getESuperTypes().add(this.getGeometry());
		lineStringEClass.getESuperTypes().add(this.getGeometry());
		multiPointEClass.getESuperTypes().add(this.getGeometry());
		polygonEClass.getESuperTypes().add(this.getGeometry());
		multiLineStringEClass.getESuperTypes().add(this.getGeometry());
		multiPolygonEClass.getESuperTypes().add(this.getGeometry());

		// Initialize classes, features, and operations; add parameters
		initEClass(geoJSONEClass, GeoJSON.class, "GeoJSON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoJSON_Bbox(), this.getArray1D(), "bbox", null, 0, 1, GeoJSON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractGeometryEClass, AbstractGeometry.class, "AbstractGeometry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geometryCollectionEClass, GeometryCollection.class, "GeometryCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometryCollection_Geometries(), this.getAbstractGeometry(), null, "geometries", null, 0, -1, GeometryCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Type(), ecorePackage.getEString(), "type", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Geometry(), this.getAbstractGeometry(), null, "geometry", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCollectionEClass, FeatureCollection.class, "FeatureCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureCollection_Features(), this.getFeature(), null, "features", null, 0, -1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Coordinates(), ecorePackage.getEDouble(), "coordinates", null, 0, 3, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStringEClass, LineString.class, "LineString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineString_Coordinates(), this.getArray1D(), "coordinates", null, 0, -1, LineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPointEClass, MultiPoint.class, "MultiPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiPoint_Coordinates(), this.getArray1D(), "coordinates", null, 0, -1, MultiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygon_Coordinates(), this.getArray2D(), "coordinates", null, 0, -1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLineStringEClass, MultiLineString.class, "MultiLineString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiLineString_Coordinates(), this.getArray2D(), "coordinates", null, 0, -1, MultiLineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPolygonEClass, MultiPolygon.class, "MultiPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiPolygon_Coordinates(), this.getArray3D(), "coordinates", null, 0, -1, MultiPolygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(featureTypeEEnum, FeatureType.class, "FeatureType");
		addEEnumLiteral(featureTypeEEnum, FeatureType.FEATURE);

		// Initialize data types
		initEDataType(array1DEDataType, Double[].class, "Array1D", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(array2DEDataType, Double[][].class, "Array2D", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(array3DEDataType, Double[][][].class, "Array3D", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GeojsonPackageImpl
