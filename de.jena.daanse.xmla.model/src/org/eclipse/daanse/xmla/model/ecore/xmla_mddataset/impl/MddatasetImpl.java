/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axes;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mddataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl#getOlapInfo <em>Olap Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl#getAxes <em>Axes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl#getCellData <em>Cell Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MddatasetImpl extends MinimalEObjectImpl.Container implements Mddataset {
	/**
	 * The cached value of the '{@link #getOlapInfo() <em>Olap Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOlapInfo()
	 * @generated
	 * @ordered
	 */
	protected OlapInfo olapInfo;

	/**
	 * The cached value of the '{@link #getAxes() <em>Axes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxes()
	 * @generated
	 * @ordered
	 */
	protected Axes axes;

	/**
	 * The cached value of the '{@link #getCellData() <em>Cell Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellData()
	 * @generated
	 * @ordered
	 */
	protected CellData cellData;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception exception;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected Messages messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MddatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.MDDATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlapInfo getOlapInfo() {
		return olapInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOlapInfo(OlapInfo newOlapInfo, NotificationChain msgs) {
		OlapInfo oldOlapInfo = olapInfo;
		olapInfo = newOlapInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__OLAP_INFO, oldOlapInfo, newOlapInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOlapInfo(OlapInfo newOlapInfo) {
		if (newOlapInfo != olapInfo) {
			NotificationChain msgs = null;
			if (olapInfo != null)
				msgs = ((InternalEObject)olapInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__OLAP_INFO, null, msgs);
			if (newOlapInfo != null)
				msgs = ((InternalEObject)newOlapInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__OLAP_INFO, null, msgs);
			msgs = basicSetOlapInfo(newOlapInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__OLAP_INFO, newOlapInfo, newOlapInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axes getAxes() {
		return axes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxes(Axes newAxes, NotificationChain msgs) {
		Axes oldAxes = axes;
		axes = newAxes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__AXES, oldAxes, newAxes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxes(Axes newAxes) {
		if (newAxes != axes) {
			NotificationChain msgs = null;
			if (axes != null)
				msgs = ((InternalEObject)axes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__AXES, null, msgs);
			if (newAxes != null)
				msgs = ((InternalEObject)newAxes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__AXES, null, msgs);
			msgs = basicSetAxes(newAxes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__AXES, newAxes, newAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellData getCellData() {
		return cellData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellData(CellData newCellData, NotificationChain msgs) {
		CellData oldCellData = cellData;
		cellData = newCellData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__CELL_DATA, oldCellData, newCellData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellData(CellData newCellData) {
		if (newCellData != cellData) {
			NotificationChain msgs = null;
			if (cellData != null)
				msgs = ((InternalEObject)cellData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__CELL_DATA, null, msgs);
			if (newCellData != null)
				msgs = ((InternalEObject)newCellData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__CELL_DATA, null, msgs);
			msgs = basicSetCellData(newCellData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__CELL_DATA, newCellData, newCellData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception newException, NotificationChain msgs) {
		org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__EXCEPTION, oldException, newException);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception newException) {
		if (newException != exception) {
			NotificationChain msgs = null;
			if (exception != null)
				msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__EXCEPTION, null, msgs);
			if (newException != null)
				msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__EXCEPTION, null, msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__EXCEPTION, newException, newException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messages getMessages() {
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessages(Messages newMessages, NotificationChain msgs) {
		Messages oldMessages = messages;
		messages = newMessages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__MESSAGES, oldMessages, newMessages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessages(Messages newMessages) {
		if (newMessages != messages) {
			NotificationChain msgs = null;
			if (messages != null)
				msgs = ((InternalEObject)messages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__MESSAGES, null, msgs);
			if (newMessages != null)
				msgs = ((InternalEObject)newMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.MDDATASET__MESSAGES, null, msgs);
			msgs = basicSetMessages(newMessages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.MDDATASET__MESSAGES, newMessages, newMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.MDDATASET__OLAP_INFO:
				return basicSetOlapInfo(null, msgs);
			case Xmla_mddatasetPackage.MDDATASET__AXES:
				return basicSetAxes(null, msgs);
			case Xmla_mddatasetPackage.MDDATASET__CELL_DATA:
				return basicSetCellData(null, msgs);
			case Xmla_mddatasetPackage.MDDATASET__EXCEPTION:
				return basicSetException(null, msgs);
			case Xmla_mddatasetPackage.MDDATASET__MESSAGES:
				return basicSetMessages(null, msgs);
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
			case Xmla_mddatasetPackage.MDDATASET__OLAP_INFO:
				return getOlapInfo();
			case Xmla_mddatasetPackage.MDDATASET__AXES:
				return getAxes();
			case Xmla_mddatasetPackage.MDDATASET__CELL_DATA:
				return getCellData();
			case Xmla_mddatasetPackage.MDDATASET__EXCEPTION:
				return getException();
			case Xmla_mddatasetPackage.MDDATASET__MESSAGES:
				return getMessages();
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
			case Xmla_mddatasetPackage.MDDATASET__OLAP_INFO:
				setOlapInfo((OlapInfo)newValue);
				return;
			case Xmla_mddatasetPackage.MDDATASET__AXES:
				setAxes((Axes)newValue);
				return;
			case Xmla_mddatasetPackage.MDDATASET__CELL_DATA:
				setCellData((CellData)newValue);
				return;
			case Xmla_mddatasetPackage.MDDATASET__EXCEPTION:
				setException((org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)newValue);
				return;
			case Xmla_mddatasetPackage.MDDATASET__MESSAGES:
				setMessages((Messages)newValue);
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
			case Xmla_mddatasetPackage.MDDATASET__OLAP_INFO:
				setOlapInfo((OlapInfo)null);
				return;
			case Xmla_mddatasetPackage.MDDATASET__AXES:
				setAxes((Axes)null);
				return;
			case Xmla_mddatasetPackage.MDDATASET__CELL_DATA:
				setCellData((CellData)null);
				return;
			case Xmla_mddatasetPackage.MDDATASET__EXCEPTION:
				setException((org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)null);
				return;
			case Xmla_mddatasetPackage.MDDATASET__MESSAGES:
				setMessages((Messages)null);
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
			case Xmla_mddatasetPackage.MDDATASET__OLAP_INFO:
				return olapInfo != null;
			case Xmla_mddatasetPackage.MDDATASET__AXES:
				return axes != null;
			case Xmla_mddatasetPackage.MDDATASET__CELL_DATA:
				return cellData != null;
			case Xmla_mddatasetPackage.MDDATASET__EXCEPTION:
				return exception != null;
			case Xmla_mddatasetPackage.MDDATASET__MESSAGES:
				return messages != null;
		}
		return super.eIsSet(featureID);
	}

} //MddatasetImpl
