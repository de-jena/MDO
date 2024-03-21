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
package de.jena.mdo.model.dbtree;

import java.util.Date;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getTreeId <em>Tree Id</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getAlkNumber <em>Alk Number</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getHeight <em>Height</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getNumber <em>Number</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTop <em>Diameter Tree Top</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTrunk <em>Diameter Tree Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getExtentTreeTrunk <em>Extent Tree Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheck <em>Last Reg Check</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheckText <em>Last Reg Check Text</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheckName <em>Last Reg Check Name</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getGenre <em>Genre</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getGenreType <em>Genre Type</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getGenreDetail <em>Genre Detail</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getCutDate <em>Cut Date</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getGuid <em>Guid</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getGisId <em>Gis Id</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getPlantYear <em>Plant Year</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getVitality <em>Vitality</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getTour <em>Tour</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getDepartment <em>Department</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getUtmNorth <em>Utm North</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getUtmEast <em>Utm East</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getResponsibilityEnd <em>Responsibility End</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getArea <em>Area</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getStreetShort <em>Street Short</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getStreet <em>Street</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getSimple <em>Simple</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.DBTree#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree()
 * @model extendedMetaData="kind='simple' name='TREE' namespace='emf.persistence'"
 * @generated
 */
@ProviderType
public interface DBTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Tree Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Id</em>' attribute.
	 * @see #setTreeId(Long)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_TreeId()
	 * @model id="true"
	 *        extendedMetaData="kind='attribute' name='TREEID' namespace='emf.persistence'"
	 * @generated
	 */
	Long getTreeId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getTreeId <em>Tree Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Id</em>' attribute.
	 * @see #getTreeId()
	 * @generated
	 */
	void setTreeId(Long value);

	/**
	 * Returns the value of the '<em><b>Alk Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer der Automatisierten Liegenschaftskarte
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alk Number</em>' attribute.
	 * @see #setAlkNumber(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_AlkNumber()
	 * @model extendedMetaData="kind='attribute' name='ALKNUMMER' namespace='emf.persistence'"
	 * @generated
	 */
	String getAlkNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getAlkNumber <em>Alk Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alk Number</em>' attribute.
	 * @see #getAlkNumber()
	 * @generated
	 */
	void setAlkNumber(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register Hauptdaten: Baumhöhe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Height()
	 * @model extendedMetaData="kind='attribute' name='BAUMHOEHE' namespace='emf.persistence'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durchlaufende Baumnummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Number()
	 * @model extendedMetaData="kind='attribute' name='BAUMNUMMER' namespace='emf.persistence'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Diameter Tree Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register Hauptdaten: Durchmesser der Krone
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diameter Tree Top</em>' attribute.
	 * @see #setDiameterTreeTop(double)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_DiameterTreeTop()
	 * @model extendedMetaData="kind='attribute' name='KREISDURCHM' namespace='emf.persistence'"
	 * @generated
	 */
	double getDiameterTreeTop();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTop <em>Diameter Tree Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Tree Top</em>' attribute.
	 * @see #getDiameterTreeTop()
	 * @generated
	 */
	void setDiameterTreeTop(double value);

	/**
	 * Returns the value of the '<em><b>Diameter Tree Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register Stamm: Durchmesser des Stammes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diameter Tree Trunk</em>' attribute.
	 * @see #setDiameterTreeTrunk(double)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_DiameterTreeTrunk()
	 * @model extendedMetaData="kind='attribute' name='STDURCHM' namespace='emf.persistence'"
	 * @generated
	 */
	double getDiameterTreeTrunk();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTrunk <em>Diameter Tree Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Tree Trunk</em>' attribute.
	 * @see #getDiameterTreeTrunk()
	 * @generated
	 */
	void setDiameterTreeTrunk(double value);

	/**
	 * Returns the value of the '<em><b>Extent Tree Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register Stamm: Umfang des Stammes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Tree Trunk</em>' attribute.
	 * @see #setExtentTreeTrunk(double)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_ExtentTreeTrunk()
	 * @model extendedMetaData="kind='attribute' name='STUMFANG' namespace='emf.persistence'"
	 * @generated
	 */
	double getExtentTreeTrunk();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getExtentTreeTrunk <em>Extent Tree Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Tree Trunk</em>' attribute.
	 * @see #getExtentTreeTrunk()
	 * @generated
	 */
	void setExtentTreeTrunk(double value);

	/**
	 * Returns the value of the '<em><b>Last Reg Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Letzte Regelkontrolle:Datum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Reg Check</em>' attribute.
	 * @see #setLastRegCheck(Date)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_LastRegCheck()
	 * @model extendedMetaData="kind='attribute' name='DATLR' namespace='emf.persistence'"
	 * @generated
	 */
	Date getLastRegCheck();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheck <em>Last Reg Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Reg Check</em>' attribute.
	 * @see #getLastRegCheck()
	 * @generated
	 */
	void setLastRegCheck(Date value);

	/**
	 * Returns the value of the '<em><b>Last Reg Check Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Letzte Regelkontrolle:Bezeichnung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Reg Check Text</em>' attribute.
	 * @see #setLastRegCheckText(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_LastRegCheckText()
	 * @model extendedMetaData="kind='attribute' name='ARGLR' namespace='emf.persistence'"
	 * @generated
	 */
	String getLastRegCheckText();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheckText <em>Last Reg Check Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Reg Check Text</em>' attribute.
	 * @see #getLastRegCheckText()
	 * @generated
	 */
	void setLastRegCheckText(String value);

	/**
	 * Returns the value of the '<em><b>Last Reg Check Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Letzte Regelkontrolle:Bearbeiter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Reg Check Name</em>' attribute.
	 * @see #setLastRegCheckName(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_LastRegCheckName()
	 * @model extendedMetaData="kind='attribute' name='NAMELR' namespace='emf.persistence'"
	 * @generated
	 */
	String getLastRegCheckName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheckName <em>Last Reg Check Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Reg Check Name</em>' attribute.
	 * @see #getLastRegCheckName()
	 * @generated
	 */
	void setLastRegCheckName(String value);

	/**
	 * Returns the value of the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gattung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genre</em>' attribute.
	 * @see #setGenre(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Genre()
	 * @model extendedMetaData="kind='attribute' name='GATTUNG' namespace='emf.persistence'"
	 * @generated
	 */
	String getGenre();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getGenre <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre</em>' attribute.
	 * @see #getGenre()
	 * @generated
	 */
	void setGenre(String value);

	/**
	 * Returns the value of the '<em><b>Genre Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gattungsart
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genre Type</em>' attribute.
	 * @see #setGenreType(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_GenreType()
	 * @model extendedMetaData="kind='attribute' name='GATTUNGART' namespace='emf.persistence'"
	 * @generated
	 */
	String getGenreType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getGenreType <em>Genre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre Type</em>' attribute.
	 * @see #getGenreType()
	 * @generated
	 */
	void setGenreType(String value);

	/**
	 * Returns the value of the '<em><b>Genre Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gattung/Art: vollständige Bezeichnung (lat.+deu.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genre Detail</em>' attribute.
	 * @see #setGenreDetail(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_GenreDetail()
	 * @model extendedMetaData="kind='attribute' name='GA_LANG' namespace='emf.persistence'"
	 * @generated
	 */
	String getGenreDetail();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getGenreDetail <em>Genre Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre Detail</em>' attribute.
	 * @see #getGenreDetail()
	 * @generated
	 */
	void setGenreDetail(String value);

	/**
	 * Returns the value of the '<em><b>Cut Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn ein Baum gefällt wurde,wird hier das Ausführungsdatumder Maßnahme angezeigt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut Date</em>' attribute.
	 * @see #setCutDate(Date)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_CutDate()
	 * @model extendedMetaData="kind='attribute' name='GEFAELLTAM' namespace='emf.persistence'"
	 * @generated
	 */
	Date getCutDate();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getCutDate <em>Cut Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Date</em>' attribute.
	 * @see #getCutDate()
	 * @generated
	 */
	void setCutDate(Date value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interne, eindeutige Datensatznummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Guid()
	 * @model extendedMetaData="kind='attribute' name='GUID' namespace='emf.persistence'"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>Gis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GIS-ID für interaktive GIS-Kopplung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gis Id</em>' attribute.
	 * @see #setGisId(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_GisId()
	 * @model extendedMetaData="kind='attribute' name='GISID' namespace='emf.persistence'"
	 * @generated
	 */
	String getGisId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getGisId <em>Gis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gis Id</em>' attribute.
	 * @see #getGisId()
	 * @generated
	 */
	void setGisId(String value);

	/**
	 * Returns the value of the '<em><b>Plant Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register Hauptdaten: Jahr der Pflanzung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plant Year</em>' attribute.
	 * @see #setPlantYear(int)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_PlantYear()
	 * @model extendedMetaData="kind='attribute' name='PFLANZJAHR' namespace='emf.persistence'"
	 * @generated
	 */
	int getPlantYear();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getPlantYear <em>Plant Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Year</em>' attribute.
	 * @see #getPlantYear()
	 * @generated
	 */
	void setPlantYear(int value);

	/**
	 * Returns the value of the '<em><b>Vitality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register Hauptdaten: Vitalität des Baumes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vitality</em>' attribute.
	 * @see #setVitality(int)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Vitality()
	 * @model extendedMetaData="kind='attribute' name='VITALITAET' namespace='emf.persistence'"
	 * @generated
	 */
	int getVitality();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getVitality <em>Vitality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitality</em>' attribute.
	 * @see #getVitality()
	 * @generated
	 */
	void setVitality(int value);

	/**
	 * Returns the value of the '<em><b>Tour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * können feste Touren für widerkehrende Aufgaben hinterlegt werden (gießen, Kontrollen...)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tour</em>' attribute.
	 * @see #setTour(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Tour()
	 * @model extendedMetaData="kind='attribute' name='TOUR' namespace='emf.persistence'"
	 * @generated
	 */
	String getTour();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getTour <em>Tour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour</em>' attribute.
	 * @see #getTour()
	 * @generated
	 */
	void setTour(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * räumlich einen Pflegebereich (Stadtteil) zugeordnet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Department()
	 * @model extendedMetaData="kind='attribute' name='PFLEGEBEREICH' namespace='emf.persistence'"
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Utm North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Koordinate: Hochwert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utm North</em>' attribute.
	 * @see #setUtmNorth(float)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_UtmNorth()
	 * @model extendedMetaData="kind='attribute' name='HOCHWERT' namespace='emf.persistence'"
	 * @generated
	 */
	float getUtmNorth();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getUtmNorth <em>Utm North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utm North</em>' attribute.
	 * @see #getUtmNorth()
	 * @generated
	 */
	void setUtmNorth(float value);

	/**
	 * Returns the value of the '<em><b>Utm East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Koordinate: Rechtswert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utm East</em>' attribute.
	 * @see #setUtmEast(float)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_UtmEast()
	 * @model extendedMetaData="kind='attribute' name='RECHTSWERT' namespace='emf.persistence'"
	 * @generated
	 */
	float getUtmEast();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getUtmEast <em>Utm East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utm East</em>' attribute.
	 * @see #getUtmEast()
	 * @generated
	 */
	void setUtmEast(float value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herkunft Lagegenauigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Origin()
	 * @model extendedMetaData="kind='attribute' name='HRHERKUNFT' namespace='emf.persistence'"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Responsibility End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum eintragen an dem das Objekt (Baum) nicht mehr in unserer Pflegeverantwortung liegt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsibility End</em>' attribute.
	 * @see #setResponsibilityEnd(Date)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_ResponsibilityEnd()
	 * @model extendedMetaData="kind='attribute' name='HISTORISCHAM' namespace='emf.persistence'"
	 * @generated
	 */
	Date getResponsibilityEnd();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getResponsibilityEnd <em>Responsibility End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility End</em>' attribute.
	 * @see #getResponsibilityEnd()
	 * @generated
	 */
	void setResponsibilityEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objektart bzw. Gebiet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Area()
	 * @model extendedMetaData="kind='attribute' name='GEBIET' namespace='emf.persistence'"
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standortbeschreibung zum Baum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Location()
	 * @model extendedMetaData="kind='attribute' name='STANDORT' namespace='emf.persistence'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Street Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feld STRASSE in Kurzform (8 Zeichen)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Short</em>' attribute.
	 * @see #setStreetShort(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_StreetShort()
	 * @model extendedMetaData="kind='attribute' name='OBJKUERZEL' namespace='emf.persistence'"
	 * @generated
	 */
	String getStreetShort();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getStreetShort <em>Street Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Short</em>' attribute.
	 * @see #getStreetShort()
	 * @generated
	 */
	void setStreetShort(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt- bzw. Anlagenbezeichnung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Street()
	 * @model extendedMetaData="kind='attribute' name='STRASSE' namespace='emf.persistence'"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' attribute.
	 * @see #setSimple(String)
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_Simple()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='simple'"
	 * @generated
	 */
	String getSimple();

	/**
	 * Sets the value of the '{@link de.jena.mdo.model.dbtree.DBTree#getSimple <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' attribute.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(String value);

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#getDBTree_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

} // DBTree
