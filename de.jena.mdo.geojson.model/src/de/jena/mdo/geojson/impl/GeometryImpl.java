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

	private final GeojsonPackage ePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl(EClass instanceEClass) {
		super(instanceEClass.getESuperTypes().get(0));
		this.ePackage = (GeojsonPackage) instanceEClass.getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ePackage.getGeometry();
	}

} //GeometryImpl
