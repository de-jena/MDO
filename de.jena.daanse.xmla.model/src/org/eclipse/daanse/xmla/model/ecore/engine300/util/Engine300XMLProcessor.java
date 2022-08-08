/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine300XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Engine300Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Engine300ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Engine300ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Engine300ResourceFactoryImpl());
		}
		return registrations;
	}

} //Engine300XMLProcessor
