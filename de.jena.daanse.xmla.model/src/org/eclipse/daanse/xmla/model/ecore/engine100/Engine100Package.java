/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine100;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.daanse.xmla.model.ecore.engine100.Engine100Factory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Engine100Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine100";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2008/engine/100";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine100";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine100Package eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine100.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DB_STORAGE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Holdout Actual Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Holdout Max Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOLDOUT_MAX_CASES = 5;

	/**
	 * The feature id for the '<em><b>Holdout Max Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT = 6;

	/**
	 * The feature id for the '<em><b>Holdout Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOLDOUT_SEED = 7;

	/**
	 * The feature id for the '<em><b>Read Write Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__READ_WRITE_MODE = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType <em>Read Write Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl#getReadWriteModeType()
	 * @generated
	 */
	int READ_WRITE_MODE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Read Write Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl#getReadWriteModeTypeObject()
	 * @generated
	 */
	int READ_WRITE_MODE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getDbStorageLocation <em>Db Storage Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Storage Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getDbStorageLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DbStorageLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutActualSize <em>Holdout Actual Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holdout Actual Size</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutActualSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HoldoutActualSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutMaxCases <em>Holdout Max Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holdout Max Cases</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutMaxCases()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HoldoutMaxCases();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutMaxPercent <em>Holdout Max Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holdout Max Percent</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutMaxPercent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HoldoutMaxPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutSeed <em>Holdout Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holdout Seed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getHoldoutSeed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HoldoutSeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getReadWriteMode <em>Read Write Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Write Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.DocumentRoot#getReadWriteMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ReadWriteMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType <em>Read Write Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Read Write Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @generated
	 */
	EEnum getReadWriteModeType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType <em>Read Write Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Read Write Mode Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType"
	 *        extendedMetaData="name='ReadWriteMode_._type:Object' baseType='ReadWriteMode_._type'"
	 * @generated
	 */
	EDataType getReadWriteModeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Engine100Factory getEngine100Factory();

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
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine100.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Db Storage Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DB_STORAGE_LOCATION = eINSTANCE.getDocumentRoot_DbStorageLocation();

		/**
		 * The meta object literal for the '<em><b>Holdout Actual Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE = eINSTANCE.getDocumentRoot_HoldoutActualSize();

		/**
		 * The meta object literal for the '<em><b>Holdout Max Cases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HOLDOUT_MAX_CASES = eINSTANCE.getDocumentRoot_HoldoutMaxCases();

		/**
		 * The meta object literal for the '<em><b>Holdout Max Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT = eINSTANCE.getDocumentRoot_HoldoutMaxPercent();

		/**
		 * The meta object literal for the '<em><b>Holdout Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HOLDOUT_SEED = eINSTANCE.getDocumentRoot_HoldoutSeed();

		/**
		 * The meta object literal for the '<em><b>Read Write Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__READ_WRITE_MODE = eINSTANCE.getDocumentRoot_ReadWriteMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType <em>Read Write Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl#getReadWriteModeType()
		 * @generated
		 */
		EEnum READ_WRITE_MODE_TYPE = eINSTANCE.getReadWriteModeType();

		/**
		 * The meta object literal for the '<em>Read Write Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl#getReadWriteModeTypeObject()
		 * @generated
		 */
		EDataType READ_WRITE_MODE_TYPE_OBJECT = eINSTANCE.getReadWriteModeTypeObject();

	}

} //Engine100Package
