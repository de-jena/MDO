/*
 */
package de.jena.mdo.example.trees.impl;

import de.jena.mdo.example.trees.CityTreePackage;
import de.jena.mdo.example.trees.Dimension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.example.trees.impl.DimensionImpl#getDiameterTop <em>Diameter Top</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.impl.DimensionImpl#getDiameterTrunk <em>Diameter Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.impl.DimensionImpl#getExtentTrunk <em>Extent Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.impl.DimensionImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
	/**
	 * The default value of the '{@link #getDiameterTop() <em>Diameter Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTop()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETER_TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiameterTop() <em>Diameter Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTop()
	 * @generated
	 * @ordered
	 */
	protected double diameterTop = DIAMETER_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterTrunk() <em>Diameter Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTrunk()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETER_TRUNK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiameterTrunk() <em>Diameter Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTrunk()
	 * @generated
	 * @ordered
	 */
	protected double diameterTrunk = DIAMETER_TRUNK_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentTrunk() <em>Extent Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentTrunk()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTENT_TRUNK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtentTrunk() <em>Extent Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentTrunk()
	 * @generated
	 * @ordered
	 */
	protected double extentTrunk = EXTENT_TRUNK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityTreePackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiameterTop() {
		return diameterTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameterTop(double newDiameterTop) {
		double oldDiameterTop = diameterTop;
		diameterTop = newDiameterTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityTreePackage.DIMENSION__DIAMETER_TOP, oldDiameterTop, diameterTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiameterTrunk() {
		return diameterTrunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameterTrunk(double newDiameterTrunk) {
		double oldDiameterTrunk = diameterTrunk;
		diameterTrunk = newDiameterTrunk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityTreePackage.DIMENSION__DIAMETER_TRUNK, oldDiameterTrunk, diameterTrunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExtentTrunk() {
		return extentTrunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentTrunk(double newExtentTrunk) {
		double oldExtentTrunk = extentTrunk;
		extentTrunk = newExtentTrunk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityTreePackage.DIMENSION__EXTENT_TRUNK, oldExtentTrunk, extentTrunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityTreePackage.DIMENSION__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityTreePackage.DIMENSION__DIAMETER_TOP:
				return getDiameterTop();
			case CityTreePackage.DIMENSION__DIAMETER_TRUNK:
				return getDiameterTrunk();
			case CityTreePackage.DIMENSION__EXTENT_TRUNK:
				return getExtentTrunk();
			case CityTreePackage.DIMENSION__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CityTreePackage.DIMENSION__DIAMETER_TOP:
				setDiameterTop((Double)newValue);
				return;
			case CityTreePackage.DIMENSION__DIAMETER_TRUNK:
				setDiameterTrunk((Double)newValue);
				return;
			case CityTreePackage.DIMENSION__EXTENT_TRUNK:
				setExtentTrunk((Double)newValue);
				return;
			case CityTreePackage.DIMENSION__HEIGHT:
				setHeight((String)newValue);
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
			case CityTreePackage.DIMENSION__DIAMETER_TOP:
				setDiameterTop(DIAMETER_TOP_EDEFAULT);
				return;
			case CityTreePackage.DIMENSION__DIAMETER_TRUNK:
				setDiameterTrunk(DIAMETER_TRUNK_EDEFAULT);
				return;
			case CityTreePackage.DIMENSION__EXTENT_TRUNK:
				setExtentTrunk(EXTENT_TRUNK_EDEFAULT);
				return;
			case CityTreePackage.DIMENSION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case CityTreePackage.DIMENSION__DIAMETER_TOP:
				return diameterTop != DIAMETER_TOP_EDEFAULT;
			case CityTreePackage.DIMENSION__DIAMETER_TRUNK:
				return diameterTrunk != DIAMETER_TRUNK_EDEFAULT;
			case CityTreePackage.DIMENSION__EXTENT_TRUNK:
				return extentTrunk != EXTENT_TRUNK_EDEFAULT;
			case CityTreePackage.DIMENSION__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (diameterTop: ");
		result.append(diameterTop);
		result.append(", diameterTrunk: ");
		result.append(diameterTrunk);
		result.append(", extentTrunk: ");
		result.append(extentTrunk);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
