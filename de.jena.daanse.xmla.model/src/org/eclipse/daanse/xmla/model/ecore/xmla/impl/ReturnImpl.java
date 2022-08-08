/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Emptyresult;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.ResultsType;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl#getRoot1 <em>Root1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl#getRoot2 <em>Root2</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReturnImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnImpl extends MinimalEObjectImpl.Container implements Return {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Mddataset root;

	/**
	 * The cached value of the '{@link #getRoot1() <em>Root1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot1()
	 * @generated
	 * @ordered
	 */
	protected Rowset root1;

	/**
	 * The cached value of the '{@link #getRoot2() <em>Root2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot2()
	 * @generated
	 * @ordered
	 */
	protected Emptyresult root2;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected ResultsType results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mddataset getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Mddataset newRoot, NotificationChain msgs) {
		Mddataset oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Mddataset newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rowset getRoot1() {
		return root1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot1(Rowset newRoot1, NotificationChain msgs) {
		Rowset oldRoot1 = root1;
		root1 = newRoot1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__ROOT1, oldRoot1, newRoot1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot1(Rowset newRoot1) {
		if (newRoot1 != root1) {
			NotificationChain msgs = null;
			if (root1 != null)
				msgs = ((InternalEObject)root1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__ROOT1, null, msgs);
			if (newRoot1 != null)
				msgs = ((InternalEObject)newRoot1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__ROOT1, null, msgs);
			msgs = basicSetRoot1(newRoot1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__ROOT1, newRoot1, newRoot1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emptyresult getRoot2() {
		return root2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot2(Emptyresult newRoot2, NotificationChain msgs) {
		Emptyresult oldRoot2 = root2;
		root2 = newRoot2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__ROOT2, oldRoot2, newRoot2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot2(Emptyresult newRoot2) {
		if (newRoot2 != root2) {
			NotificationChain msgs = null;
			if (root2 != null)
				msgs = ((InternalEObject)root2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__ROOT2, null, msgs);
			if (newRoot2 != null)
				msgs = ((InternalEObject)newRoot2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__ROOT2, null, msgs);
			msgs = basicSetRoot2(newRoot2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__ROOT2, newRoot2, newRoot2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsType getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResults(ResultsType newResults, NotificationChain msgs) {
		ResultsType oldResults = results;
		results = newResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__RESULTS, oldResults, newResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResults(ResultsType newResults) {
		if (newResults != results) {
			NotificationChain msgs = null;
			if (results != null)
				msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__RESULTS, null, msgs);
			if (newResults != null)
				msgs = ((InternalEObject)newResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RETURN__RESULTS, null, msgs);
			msgs = basicSetResults(newResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RETURN__RESULTS, newResults, newResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.RETURN__ROOT:
				return basicSetRoot(null, msgs);
			case XmlaPackage.RETURN__ROOT1:
				return basicSetRoot1(null, msgs);
			case XmlaPackage.RETURN__ROOT2:
				return basicSetRoot2(null, msgs);
			case XmlaPackage.RETURN__RESULTS:
				return basicSetResults(null, msgs);
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
			case XmlaPackage.RETURN__ROOT:
				return getRoot();
			case XmlaPackage.RETURN__ROOT1:
				return getRoot1();
			case XmlaPackage.RETURN__ROOT2:
				return getRoot2();
			case XmlaPackage.RETURN__RESULTS:
				return getResults();
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
			case XmlaPackage.RETURN__ROOT:
				setRoot((Mddataset)newValue);
				return;
			case XmlaPackage.RETURN__ROOT1:
				setRoot1((Rowset)newValue);
				return;
			case XmlaPackage.RETURN__ROOT2:
				setRoot2((Emptyresult)newValue);
				return;
			case XmlaPackage.RETURN__RESULTS:
				setResults((ResultsType)newValue);
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
			case XmlaPackage.RETURN__ROOT:
				setRoot((Mddataset)null);
				return;
			case XmlaPackage.RETURN__ROOT1:
				setRoot1((Rowset)null);
				return;
			case XmlaPackage.RETURN__ROOT2:
				setRoot2((Emptyresult)null);
				return;
			case XmlaPackage.RETURN__RESULTS:
				setResults((ResultsType)null);
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
			case XmlaPackage.RETURN__ROOT:
				return root != null;
			case XmlaPackage.RETURN__ROOT1:
				return root1 != null;
			case XmlaPackage.RETURN__ROOT2:
				return root2 != null;
			case XmlaPackage.RETURN__RESULTS:
				return results != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnImpl
