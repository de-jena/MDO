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
package de.jena.piveau.dcat.impl;

import de.jena.piveau.dcat.Catalog;
import de.jena.piveau.dcat.CatalogRecord;
import de.jena.piveau.dcat.DataService;
import de.jena.piveau.dcat.DatasetContainer;
import de.jena.piveau.dcat.DcatPackage;

import de.jena.piveau.rdf.Resource;

import de.jena.piveau.skos.ConceptScheme;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getService <em>Service</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getThemeTaxonomy <em>Theme Taxonomy</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.CatalogImpl#getHomepage <em>Homepage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends DatasetImpl implements Catalog {
	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<Catalog> catalog;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogRecord> record;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetContainer> dataset;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<DataService> service;

	/**
	 * The cached value of the '{@link #getThemeTaxonomy() <em>Theme Taxonomy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemeTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptScheme> themeTaxonomy;

	/**
	 * The cached value of the '{@link #getHasPart() <em>Has Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasPart;

	/**
	 * The cached value of the '{@link #getHomepage() <em>Homepage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected Resource homepage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Catalog> getCatalog() {
		if (catalog == null) {
			catalog = new EObjectContainmentEList<Catalog>(Catalog.class, this, DcatPackage.CATALOG__CATALOG);
		}
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatalogRecord> getRecord() {
		if (record == null) {
			record = new EObjectContainmentEList<CatalogRecord>(CatalogRecord.class, this, DcatPackage.CATALOG__RECORD);
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetContainer> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<DatasetContainer>(DatasetContainer.class, this, DcatPackage.CATALOG__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataService> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<DataService>(DataService.class, this, DcatPackage.CATALOG__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptScheme> getThemeTaxonomy() {
		if (themeTaxonomy == null) {
			themeTaxonomy = new EObjectContainmentEList<ConceptScheme>(ConceptScheme.class, this, DcatPackage.CATALOG__THEME_TAXONOMY);
		}
		return themeTaxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getHasPart() {
		if (hasPart == null) {
			hasPart = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.CATALOG__HAS_PART);
		}
		return hasPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getHomepage() {
		return homepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomepage(Resource newHomepage, NotificationChain msgs) {
		Resource oldHomepage = homepage;
		homepage = newHomepage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG__HOMEPAGE, oldHomepage, newHomepage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomepage(Resource newHomepage) {
		if (newHomepage != homepage) {
			NotificationChain msgs = null;
			if (homepage != null)
				msgs = ((InternalEObject)homepage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG__HOMEPAGE, null, msgs);
			if (newHomepage != null)
				msgs = ((InternalEObject)newHomepage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG__HOMEPAGE, null, msgs);
			msgs = basicSetHomepage(newHomepage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG__HOMEPAGE, newHomepage, newHomepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.CATALOG__CATALOG:
				return ((InternalEList<?>)getCatalog()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG__THEME_TAXONOMY:
				return ((InternalEList<?>)getThemeTaxonomy()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG__HAS_PART:
				return ((InternalEList<?>)getHasPart()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG__HOMEPAGE:
				return basicSetHomepage(null, msgs);
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
			case DcatPackage.CATALOG__CATALOG:
				return getCatalog();
			case DcatPackage.CATALOG__RECORD:
				return getRecord();
			case DcatPackage.CATALOG__DATASET:
				return getDataset();
			case DcatPackage.CATALOG__SERVICE:
				return getService();
			case DcatPackage.CATALOG__THEME_TAXONOMY:
				return getThemeTaxonomy();
			case DcatPackage.CATALOG__HAS_PART:
				return getHasPart();
			case DcatPackage.CATALOG__HOMEPAGE:
				return getHomepage();
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
			case DcatPackage.CATALOG__CATALOG:
				getCatalog().clear();
				getCatalog().addAll((Collection<? extends Catalog>)newValue);
				return;
			case DcatPackage.CATALOG__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends CatalogRecord>)newValue);
				return;
			case DcatPackage.CATALOG__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends DatasetContainer>)newValue);
				return;
			case DcatPackage.CATALOG__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends DataService>)newValue);
				return;
			case DcatPackage.CATALOG__THEME_TAXONOMY:
				getThemeTaxonomy().clear();
				getThemeTaxonomy().addAll((Collection<? extends ConceptScheme>)newValue);
				return;
			case DcatPackage.CATALOG__HAS_PART:
				getHasPart().clear();
				getHasPart().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.CATALOG__HOMEPAGE:
				setHomepage((Resource)newValue);
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
			case DcatPackage.CATALOG__CATALOG:
				getCatalog().clear();
				return;
			case DcatPackage.CATALOG__RECORD:
				getRecord().clear();
				return;
			case DcatPackage.CATALOG__DATASET:
				getDataset().clear();
				return;
			case DcatPackage.CATALOG__SERVICE:
				getService().clear();
				return;
			case DcatPackage.CATALOG__THEME_TAXONOMY:
				getThemeTaxonomy().clear();
				return;
			case DcatPackage.CATALOG__HAS_PART:
				getHasPart().clear();
				return;
			case DcatPackage.CATALOG__HOMEPAGE:
				setHomepage((Resource)null);
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
			case DcatPackage.CATALOG__CATALOG:
				return catalog != null && !catalog.isEmpty();
			case DcatPackage.CATALOG__RECORD:
				return record != null && !record.isEmpty();
			case DcatPackage.CATALOG__DATASET:
				return dataset != null && !dataset.isEmpty();
			case DcatPackage.CATALOG__SERVICE:
				return service != null && !service.isEmpty();
			case DcatPackage.CATALOG__THEME_TAXONOMY:
				return themeTaxonomy != null && !themeTaxonomy.isEmpty();
			case DcatPackage.CATALOG__HAS_PART:
				return hasPart != null && !hasPart.isEmpty();
			case DcatPackage.CATALOG__HOMEPAGE:
				return homepage != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogImpl
