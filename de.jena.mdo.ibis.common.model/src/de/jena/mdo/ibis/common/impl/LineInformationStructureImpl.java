/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.LineInformationStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl#getLineRef <em>Line Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl#getLineName <em>Line Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl#getLineShortName <em>Line Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.LineInformationStructureImpl#getLineCode <em>Line Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineInformationStructureImpl extends MinimalEObjectImpl.Container implements LineInformationStructure {
	/**
	 * The cached value of the '{@link #getLineRef() <em>Line Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN lineRef;

	/**
	 * The cached value of the '{@link #getLineName() <em>Line Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> lineName;

	/**
	 * The cached value of the '{@link #getLineShortName() <em>Line Short Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> lineShortName;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt lineNumber;

	/**
	 * The cached value of the '{@link #getLineCode() <em>Line Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCode()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt lineCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getLineInformationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getLineRef() {
		return lineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineRef(IBISIPNMTOKEN newLineRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldLineRef = lineRef;
		lineRef = newLineRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF, oldLineRef, newLineRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineRef(IBISIPNMTOKEN newLineRef) {
		if (newLineRef != lineRef) {
			NotificationChain msgs = null;
			if (lineRef != null)
				msgs = ((InternalEObject)lineRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF, null, msgs);
			if (newLineRef != null)
				msgs = ((InternalEObject)newLineRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF, null, msgs);
			msgs = basicSetLineRef(newLineRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF, newLineRef, newLineRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getLineName() {
		if (lineName == null) {
			lineName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NAME);
		}
		return lineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getLineShortName() {
		if (lineShortName == null) {
			lineShortName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME);
		}
		return lineShortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineNumber(IBISIPInt newLineNumber, NotificationChain msgs) {
		IBISIPInt oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER, oldLineNumber, newLineNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineNumber(IBISIPInt newLineNumber) {
		if (newLineNumber != lineNumber) {
			NotificationChain msgs = null;
			if (lineNumber != null)
				msgs = ((InternalEObject)lineNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER, null, msgs);
			if (newLineNumber != null)
				msgs = ((InternalEObject)newLineNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER, null, msgs);
			msgs = basicSetLineNumber(newLineNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER, newLineNumber, newLineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getLineCode() {
		return lineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineCode(IBISIPInt newLineCode, NotificationChain msgs) {
		IBISIPInt oldLineCode = lineCode;
		lineCode = newLineCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE, oldLineCode, newLineCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineCode(IBISIPInt newLineCode) {
		if (newLineCode != lineCode) {
			NotificationChain msgs = null;
			if (lineCode != null)
				msgs = ((InternalEObject)lineCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE, null, msgs);
			if (newLineCode != null)
				msgs = ((InternalEObject)newLineCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE, null, msgs);
			msgs = basicSetLineCode(newLineCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE, newLineCode, newLineCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF:
				return basicSetLineRef(null, msgs);
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NAME:
				return ((InternalEList<?>)getLineName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME:
				return ((InternalEList<?>)getLineShortName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER:
				return basicSetLineNumber(null, msgs);
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE:
				return basicSetLineCode(null, msgs);
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
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF:
				return getLineRef();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NAME:
				return getLineName();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME:
				return getLineShortName();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER:
				return getLineNumber();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE:
				return getLineCode();
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
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF:
				setLineRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NAME:
				getLineName().clear();
				getLineName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME:
				getLineShortName().clear();
				getLineShortName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER:
				setLineNumber((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE:
				setLineCode((IBISIPInt)newValue);
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
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF:
				setLineRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NAME:
				getLineName().clear();
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME:
				getLineShortName().clear();
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER:
				setLineNumber((IBISIPInt)null);
				return;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE:
				setLineCode((IBISIPInt)null);
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
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_REF:
				return lineRef != null;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NAME:
				return lineName != null && !lineName.isEmpty();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME:
				return lineShortName != null && !lineShortName.isEmpty();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_NUMBER:
				return lineNumber != null;
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE__LINE_CODE:
				return lineCode != null;
		}
		return super.eIsSet(featureID);
	}

} //LineInformationStructureImpl
