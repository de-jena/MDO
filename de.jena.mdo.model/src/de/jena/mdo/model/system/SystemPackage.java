/*
 */
package de.jena.mdo.model.system;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.mdo.model.system.SystemFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = SystemPackage.eNS_URI, genModel = "/model/system.genmodel", genModelSourceLocations = {"model/system.genmodel","de.jena.mdo.model/model/system.genmodel"}, ecore="/model/system.ecore", ecoreSourceLocations="/model/system.ecore")
public interface SystemPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/MDO/system/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = de.jena.mdo.model.system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.model.system.impl.XMLContainerImpl <em>XML Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.model.system.impl.XMLContainerImpl
	 * @see de.jena.mdo.model.system.impl.SystemPackageImpl#getXMLContainer()
	 * @generated
	 */
	int XML_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ROOT = 4;

	/**
	 * The number of structural features of the '<em>XML Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>XML Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.model.system.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.model.system.impl.ContainerImpl
	 * @see de.jena.mdo.model.system.impl.SystemPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.model.system.XMLContainer <em>XML Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Container</em>'.
	 * @see de.jena.mdo.model.system.XMLContainer
	 * @generated
	 */
	EClass getXMLContainer();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.model.system.XMLContainer#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.mdo.model.system.XMLContainer#getMixed()
	 * @see #getXMLContainer()
	 * @generated
	 */
	EAttribute getXMLContainer_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.model.system.XMLContainer#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.mdo.model.system.XMLContainer#getXMLNSPrefixMap()
	 * @see #getXMLContainer()
	 * @generated
	 */
	EReference getXMLContainer_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.model.system.XMLContainer#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.mdo.model.system.XMLContainer#getXSISchemaLocation()
	 * @see #getXMLContainer()
	 * @generated
	 */
	EReference getXMLContainer_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.model.system.XMLContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.jena.mdo.model.system.XMLContainer#getElements()
	 * @see #getXMLContainer()
	 * @generated
	 */
	EReference getXMLContainer_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.model.system.XMLContainer#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see de.jena.mdo.model.system.XMLContainer#getRoot()
	 * @see #getXMLContainer()
	 * @generated
	 */
	EReference getXMLContainer_Root();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.model.system.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.jena.mdo.model.system.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.model.system.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.jena.mdo.model.system.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.mdo.model.system.impl.XMLContainerImpl <em>XML Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.model.system.impl.XMLContainerImpl
		 * @see de.jena.mdo.model.system.impl.SystemPackageImpl#getXMLContainer()
		 * @generated
		 */
		EClass XML_CONTAINER = eINSTANCE.getXMLContainer();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_CONTAINER__MIXED = eINSTANCE.getXMLContainer_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__XMLNS_PREFIX_MAP = eINSTANCE.getXMLContainer_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__XSI_SCHEMA_LOCATION = eINSTANCE.getXMLContainer_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ELEMENTS = eINSTANCE.getXMLContainer_Elements();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ROOT = eINSTANCE.getXMLContainer_Root();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.model.system.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.model.system.impl.ContainerImpl
		 * @see de.jena.mdo.model.system.impl.SystemPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

	}

} //SystemPackage
