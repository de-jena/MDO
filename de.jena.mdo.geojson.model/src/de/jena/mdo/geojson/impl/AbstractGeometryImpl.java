/*
 */
package de.jena.mdo.geojson.impl;

import de.jena.mdo.geojson.AbstractGeometry;
import de.jena.mdo.geojson.GeojsonPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractGeometryImpl extends GeoJSONImpl implements AbstractGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeojsonPackage.eINSTANCE.getAbstractGeometry();
	}

} //AbstractGeometryImpl
