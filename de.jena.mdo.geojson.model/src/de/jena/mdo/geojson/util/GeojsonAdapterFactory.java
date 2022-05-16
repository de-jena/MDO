/*
 */
package de.jena.mdo.geojson.util;

import de.jena.mdo.geojson.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.geojson.GeojsonPackage
 * @generated
 */
public class GeojsonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeojsonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeojsonAdapterFactory(GeojsonPackage modelPackage) {
		this.modelPackage = modelPackage;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeojsonSwitch<Adapter> modelSwitch =
		new GeojsonSwitch<Adapter>(modelPackage) {
			@Override
			public Adapter caseGeoJSON(GeoJSON object) {
				return createGeoJSONAdapter();
			}
			@Override
			public Adapter caseAbstractGeometry(AbstractGeometry object) {
				return createAbstractGeometryAdapter();
			}
			@Override
			public Adapter caseGeometryCollection(GeometryCollection object) {
				return createGeometryCollectionAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureCollection(FeatureCollection object) {
				return createFeatureCollectionAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseLineString(LineString object) {
				return createLineStringAdapter();
			}
			@Override
			public Adapter caseMultiPoint(MultiPoint object) {
				return createMultiPointAdapter();
			}
			@Override
			public Adapter casePolygon(Polygon object) {
				return createPolygonAdapter();
			}
			@Override
			public Adapter caseMultiLineString(MultiLineString object) {
				return createMultiLineStringAdapter();
			}
			@Override
			public Adapter caseMultiPolygon(MultiPolygon object) {
				return createMultiPolygonAdapter();
			}
			@Override
			public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
				return createStringToStringMapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.GeoJSON <em>Geo JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.GeoJSON
	 * @generated
	 */
	public Adapter createGeoJSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.AbstractGeometry <em>Abstract Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.AbstractGeometry
	 * @generated
	 */
	public Adapter createAbstractGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.GeometryCollection <em>Geometry Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.GeometryCollection
	 * @generated
	 */
	public Adapter createGeometryCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.FeatureCollection <em>Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.FeatureCollection
	 * @generated
	 */
	public Adapter createFeatureCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.LineString
	 * @generated
	 */
	public Adapter createLineStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.MultiPoint <em>Multi Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.MultiPoint
	 * @generated
	 */
	public Adapter createMultiPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.MultiLineString <em>Multi Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.MultiLineString
	 * @generated
	 */
	public Adapter createMultiLineStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.geojson.MultiPolygon <em>Multi Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.geojson.MultiPolygon
	 * @generated
	 */
	public Adapter createMultiPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeojsonAdapterFactory
