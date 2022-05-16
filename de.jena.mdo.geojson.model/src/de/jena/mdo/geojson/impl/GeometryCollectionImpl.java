/*
 */
package de.jena.mdo.geojson.impl;

import de.jena.mdo.geojson.AbstractGeometry;
import de.jena.mdo.geojson.GeojsonPackage;
import de.jena.mdo.geojson.GeometryCollection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.geojson.impl.GeometryCollectionImpl#getGeometries <em>Geometries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometryCollectionImpl extends AbstractGeometryImpl implements GeometryCollection {
	/**
	 * The cached value of the '{@link #getGeometries() <em>Geometries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometries()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractGeometry> geometries;


	private final GeojsonPackage ePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryCollectionImpl(EClass instanceEClass) {
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
		return ePackage.getGeometryCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeometry> getGeometries() {
		if (geometries == null) {
			geometries = new EObjectContainmentEList<AbstractGeometry>(AbstractGeometry.class, this, GeojsonPackage.GEOMETRY_COLLECTION__GEOMETRIES);
		}
		return geometries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeojsonPackage.GEOMETRY_COLLECTION__GEOMETRIES:
				return ((InternalEList<?>)getGeometries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeojsonPackage.GEOMETRY_COLLECTION__GEOMETRIES:
				return getGeometries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeojsonPackage.GEOMETRY_COLLECTION__GEOMETRIES:
				getGeometries().clear();
				getGeometries().addAll((Collection<? extends AbstractGeometry>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeojsonPackage.GEOMETRY_COLLECTION__GEOMETRIES:
				getGeometries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeojsonPackage.GEOMETRY_COLLECTION__GEOMETRIES:
				return geometries != null && !geometries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeometryCollectionImpl
