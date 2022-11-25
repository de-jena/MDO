/**
 */
package de.jena.mdo.example.trees.impl;

import de.jena.mdo.example.trees.*;

import org.eclipse.emf.ecore.EClass;
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
public class CityTreeFactoryImpl extends EFactoryImpl implements CityTreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CityTreeFactory init() {
		try {
			CityTreeFactory theCityTreeFactory = (CityTreeFactory)EPackage.Registry.INSTANCE.getEFactory(CityTreePackage.eNS_URI);
			if (theCityTreeFactory != null) {
				return theCityTreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CityTreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityTreeFactoryImpl() {
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
			case CityTreePackage.CITY_TREE: return createCityTree();
			case CityTreePackage.CONIFER_TREE: return createConiferTree();
			case CityTreePackage.DECIDUOUS_TREE: return createDeciduousTree();
			case CityTreePackage.LOCATION: return createLocation();
			case CityTreePackage.KIND: return createKind();
			case CityTreePackage.DIMENSION: return createDimension();
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
	public CityTree createCityTree() {
		CityTreeImpl cityTree = new CityTreeImpl();
		return cityTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConiferTree createConiferTree() {
		ConiferTreeImpl coniferTree = new ConiferTreeImpl();
		return coniferTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeciduousTree createDeciduousTree() {
		DeciduousTreeImpl deciduousTree = new DeciduousTreeImpl();
		return deciduousTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kind createKind() {
		KindImpl kind = new KindImpl();
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityTreePackage getCityTreePackage() {
		return (CityTreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CityTreePackage getPackage() {
		return CityTreePackage.eINSTANCE;
	}

} //CityTreeFactoryImpl
