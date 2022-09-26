/**
 */
package com.xmlns.foaf.foaf.impl;

import com.xmlns.foaf.foaf.Agent;
import com.xmlns.foaf.foaf.AgentType;
import com.xmlns.foaf.foaf.FoafPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xmlns.foaf.foaf.impl.AgentImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected AgentType agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoafPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentType getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(AgentType newAgent, NotificationChain msgs) {
		AgentType oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT__AGENT, oldAgent, newAgent);
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
	public void setAgent(AgentType newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FoafPackage.AGENT__AGENT:
				return basicSetAgent(null, msgs);
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
			case FoafPackage.AGENT__AGENT:
				return getAgent();
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
			case FoafPackage.AGENT__AGENT:
				setAgent((AgentType)newValue);
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
			case FoafPackage.AGENT__AGENT:
				setAgent((AgentType)null);
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
			case FoafPackage.AGENT__AGENT:
				return agent != null;
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
