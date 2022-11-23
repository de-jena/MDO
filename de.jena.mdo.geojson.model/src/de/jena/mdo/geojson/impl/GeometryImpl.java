/*
 */
package de.jena.mdo.geojson.impl;

import de.jena.mdo.geojson.GeojsonPackage;
import de.jena.mdo.geojson.Geometry;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeometryImpl extends AbstractGeometryImpl implements Geometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeojsonPackage.eINSTANCE.getGeometry();
	}

} //GeometryImpl
