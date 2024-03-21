/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package de.jena.piveau.foaf.impl;

import de.jena.piveau.foaf.AgentType;
import de.jena.piveau.foaf.FoafPackage;

import de.jena.piveau.rdf.PlainLiteral;
import de.jena.piveau.rdf.Resource;

import de.jena.piveau.rdf.impl.ResourceImpl;

import de.jena.piveau.skos.Concept;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.foaf.impl.AgentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.piveau.foaf.impl.AgentTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.piveau.foaf.impl.AgentTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.jena.piveau.foaf.impl.AgentTypeImpl#getMbox <em>Mbox</em>}</li>
 *   <li>{@link de.jena.piveau.foaf.impl.AgentTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentTypeImpl extends ResourceImpl implements AgentType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected PlainLiteral name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Concept type;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected Resource phone;

	/**
	 * The cached value of the '{@link #getMbox() <em>Mbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbox()
	 * @generated
	 * @ordered
	 */
	protected Resource mbox;

	/**
	 * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected String nodeID = NODE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoafPackage.Literals.AGENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(PlainLiteral newName, NotificationChain msgs) {
		PlainLiteral oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(PlainLiteral newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Concept newType, NotificationChain msgs) {
		Concept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Concept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(Resource newPhone, NotificationChain msgs) {
		Resource oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__PHONE, oldPhone, newPhone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(Resource newPhone) {
		if (newPhone != phone) {
			NotificationChain msgs = null;
			if (phone != null)
				msgs = ((InternalEObject)phone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__PHONE, null, msgs);
			if (newPhone != null)
				msgs = ((InternalEObject)newPhone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__PHONE, null, msgs);
			msgs = basicSetPhone(newPhone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__PHONE, newPhone, newPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getMbox() {
		return mbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMbox(Resource newMbox, NotificationChain msgs) {
		Resource oldMbox = mbox;
		mbox = newMbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__MBOX, oldMbox, newMbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMbox(Resource newMbox) {
		if (newMbox != mbox) {
			NotificationChain msgs = null;
			if (mbox != null)
				msgs = ((InternalEObject)mbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__MBOX, null, msgs);
			if (newMbox != null)
				msgs = ((InternalEObject)newMbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.AGENT_TYPE__MBOX, null, msgs);
			msgs = basicSetMbox(newMbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__MBOX, newMbox, newMbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeID(String newNodeID) {
		String oldNodeID = nodeID;
		nodeID = newNodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.AGENT_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FoafPackage.AGENT_TYPE__NAME:
				return basicSetName(null, msgs);
			case FoafPackage.AGENT_TYPE__TYPE:
				return basicSetType(null, msgs);
			case FoafPackage.AGENT_TYPE__PHONE:
				return basicSetPhone(null, msgs);
			case FoafPackage.AGENT_TYPE__MBOX:
				return basicSetMbox(null, msgs);
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
			case FoafPackage.AGENT_TYPE__NAME:
				return getName();
			case FoafPackage.AGENT_TYPE__TYPE:
				return getType();
			case FoafPackage.AGENT_TYPE__PHONE:
				return getPhone();
			case FoafPackage.AGENT_TYPE__MBOX:
				return getMbox();
			case FoafPackage.AGENT_TYPE__NODE_ID:
				return getNodeID();
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
			case FoafPackage.AGENT_TYPE__NAME:
				setName((PlainLiteral)newValue);
				return;
			case FoafPackage.AGENT_TYPE__TYPE:
				setType((Concept)newValue);
				return;
			case FoafPackage.AGENT_TYPE__PHONE:
				setPhone((Resource)newValue);
				return;
			case FoafPackage.AGENT_TYPE__MBOX:
				setMbox((Resource)newValue);
				return;
			case FoafPackage.AGENT_TYPE__NODE_ID:
				setNodeID((String)newValue);
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
			case FoafPackage.AGENT_TYPE__NAME:
				setName((PlainLiteral)null);
				return;
			case FoafPackage.AGENT_TYPE__TYPE:
				setType((Concept)null);
				return;
			case FoafPackage.AGENT_TYPE__PHONE:
				setPhone((Resource)null);
				return;
			case FoafPackage.AGENT_TYPE__MBOX:
				setMbox((Resource)null);
				return;
			case FoafPackage.AGENT_TYPE__NODE_ID:
				setNodeID(NODE_ID_EDEFAULT);
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
			case FoafPackage.AGENT_TYPE__NAME:
				return name != null;
			case FoafPackage.AGENT_TYPE__TYPE:
				return type != null;
			case FoafPackage.AGENT_TYPE__PHONE:
				return phone != null;
			case FoafPackage.AGENT_TYPE__MBOX:
				return mbox != null;
			case FoafPackage.AGENT_TYPE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeID != null : !NODE_ID_EDEFAULT.equals(nodeID);
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
		result.append(" (nodeID: ");
		result.append(nodeID);
		result.append(')');
		return result.toString();
	}

} //AgentTypeImpl
