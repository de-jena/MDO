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

	private final GeojsonPackage ePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeometryImpl(EClass instanceEClass) {
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
		return ePackage.getAbstractGeometry();
	}

} //AbstractGeometryImpl
