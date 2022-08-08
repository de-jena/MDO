/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.*;

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
public class Xmla_mddatasetFactoryImpl extends EFactoryImpl implements Xmla_mddatasetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xmla_mddatasetFactory init() {
		try {
			Xmla_mddatasetFactory theXmla_mddatasetFactory = (Xmla_mddatasetFactory)EPackage.Registry.INSTANCE.getEFactory(Xmla_mddatasetPackage.eNS_URI);
			if (theXmla_mddatasetFactory != null) {
				return theXmla_mddatasetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xmla_mddatasetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_mddatasetFactoryImpl() {
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
			case Xmla_mddatasetPackage.AXES: return createAxes();
			case Xmla_mddatasetPackage.AXES_INFO: return createAxesInfo();
			case Xmla_mddatasetPackage.AXIS: return createAxis();
			case Xmla_mddatasetPackage.AXIS_INFO: return createAxisInfo();
			case Xmla_mddatasetPackage.CELL_DATA: return createCellData();
			case Xmla_mddatasetPackage.CELL_INFO: return createCellInfo();
			case Xmla_mddatasetPackage.CELL_SET_TYPE: return createCellSetType();
			case Xmla_mddatasetPackage.CELL_TYPE: return createCellType();
			case Xmla_mddatasetPackage.CELL_TYPE_ERROR: return createCellTypeError();
			case Xmla_mddatasetPackage.CUBE_INFO: return createCubeInfo();
			case Xmla_mddatasetPackage.HIERARCHY_INFO: return createHierarchyInfo();
			case Xmla_mddatasetPackage.MDDATASET: return createMddataset();
			case Xmla_mddatasetPackage.MEMBERS_TYPE: return createMembersType();
			case Xmla_mddatasetPackage.MEMBER_TYPE: return createMemberType();
			case Xmla_mddatasetPackage.OLAP_INFO: return createOlapInfo();
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE: return createOlapInfoCube();
			case Xmla_mddatasetPackage.SET_LIST_TYPE: return createSetListType();
			case Xmla_mddatasetPackage.TUPLES_TYPE: return createTuplesType();
			case Xmla_mddatasetPackage.TUPLE_TYPE: return createTupleType();
			case Xmla_mddatasetPackage.VALUE_TYPE: return createValueType();
			case Xmla_mddatasetPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axes createAxes() {
		AxesImpl axes = new AxesImpl();
		return axes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxesInfo createAxesInfo() {
		AxesInfoImpl axesInfo = new AxesInfoImpl();
		return axesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisInfo createAxisInfo() {
		AxisInfoImpl axisInfo = new AxisInfoImpl();
		return axisInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellData createCellData() {
		CellDataImpl cellData = new CellDataImpl();
		return cellData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInfo createCellInfo() {
		CellInfoImpl cellInfo = new CellInfoImpl();
		return cellInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellSetType createCellSetType() {
		CellSetTypeImpl cellSetType = new CellSetTypeImpl();
		return cellSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellType createCellType() {
		CellTypeImpl cellType = new CellTypeImpl();
		return cellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellTypeError createCellTypeError() {
		CellTypeErrorImpl cellTypeError = new CellTypeErrorImpl();
		return cellTypeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeInfo createCubeInfo() {
		CubeInfoImpl cubeInfo = new CubeInfoImpl();
		return cubeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyInfo createHierarchyInfo() {
		HierarchyInfoImpl hierarchyInfo = new HierarchyInfoImpl();
		return hierarchyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mddataset createMddataset() {
		MddatasetImpl mddataset = new MddatasetImpl();
		return mddataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersType createMembersType() {
		MembersTypeImpl membersType = new MembersTypeImpl();
		return membersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberType createMemberType() {
		MemberTypeImpl memberType = new MemberTypeImpl();
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlapInfo createOlapInfo() {
		OlapInfoImpl olapInfo = new OlapInfoImpl();
		return olapInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlapInfoCube createOlapInfoCube() {
		OlapInfoCubeImpl olapInfoCube = new OlapInfoCubeImpl();
		return olapInfoCube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetListType createSetListType() {
		SetListTypeImpl setListType = new SetListTypeImpl();
		return setListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuplesType createTuplesType() {
		TuplesTypeImpl tuplesType = new TuplesTypeImpl();
		return tuplesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_mddatasetPackage getXmla_mddatasetPackage() {
		return (Xmla_mddatasetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xmla_mddatasetPackage getPackage() {
		return Xmla_mddatasetPackage.eINSTANCE;
	}

} //Xmla_mddatasetFactoryImpl
