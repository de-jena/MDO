/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.util;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage
 * @generated
 */
public class Xmla_mddatasetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xmla_mddatasetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_mddatasetSwitch() {
		if (modelPackage == null) {
			modelPackage = Xmla_mddatasetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Xmla_mddatasetPackage.AXES: {
				Axes axes = (Axes)theEObject;
				T result = caseAxes(axes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.AXES_INFO: {
				AxesInfo axesInfo = (AxesInfo)theEObject;
				T result = caseAxesInfo(axesInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.AXIS: {
				Axis axis = (Axis)theEObject;
				T result = caseAxis(axis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.AXIS_INFO: {
				AxisInfo axisInfo = (AxisInfo)theEObject;
				T result = caseAxisInfo(axisInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.CELL_DATA: {
				CellData cellData = (CellData)theEObject;
				T result = caseCellData(cellData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.CELL_INFO: {
				CellInfo cellInfo = (CellInfo)theEObject;
				T result = caseCellInfo(cellInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.CELL_SET_TYPE: {
				CellSetType cellSetType = (CellSetType)theEObject;
				T result = caseCellSetType(cellSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.CELL_TYPE: {
				CellType cellType = (CellType)theEObject;
				T result = caseCellType(cellType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.CELL_TYPE_ERROR: {
				CellTypeError cellTypeError = (CellTypeError)theEObject;
				T result = caseCellTypeError(cellTypeError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.CUBE_INFO: {
				CubeInfo cubeInfo = (CubeInfo)theEObject;
				T result = caseCubeInfo(cubeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.HIERARCHY_INFO: {
				HierarchyInfo hierarchyInfo = (HierarchyInfo)theEObject;
				T result = caseHierarchyInfo(hierarchyInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.MDDATASET: {
				Mddataset mddataset = (Mddataset)theEObject;
				T result = caseMddataset(mddataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.MEMBERS_TYPE: {
				MembersType membersType = (MembersType)theEObject;
				T result = caseMembersType(membersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.MEMBER_TYPE: {
				MemberType memberType = (MemberType)theEObject;
				T result = caseMemberType(memberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.OLAP_INFO: {
				OlapInfo olapInfo = (OlapInfo)theEObject;
				T result = caseOlapInfo(olapInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE: {
				OlapInfoCube olapInfoCube = (OlapInfoCube)theEObject;
				T result = caseOlapInfoCube(olapInfoCube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.SET_LIST_TYPE: {
				SetListType setListType = (SetListType)theEObject;
				T result = caseSetListType(setListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.TUPLES_TYPE: {
				TuplesType tuplesType = (TuplesType)theEObject;
				T result = caseTuplesType(tuplesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.TUPLE_TYPE: {
				TupleType tupleType = (TupleType)theEObject;
				T result = caseTupleType(tupleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xmla_mddatasetPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxes(Axes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axes Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axes Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxesInfo(AxesInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxis(Axis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisInfo(AxisInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellData(CellData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellInfo(CellInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellSetType(CellSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellType(CellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Type Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Type Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellTypeError(CellTypeError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeInfo(CubeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchy Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchy Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchyInfo(HierarchyInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mddataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mddataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMddataset(Mddataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Members Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Members Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembersType(MembersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberType(MemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Olap Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Olap Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOlapInfo(OlapInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Olap Info Cube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Olap Info Cube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOlapInfoCube(OlapInfoCube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetListType(SetListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuples Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuples Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuplesType(TuplesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleType(TupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Xmla_mddatasetSwitch
