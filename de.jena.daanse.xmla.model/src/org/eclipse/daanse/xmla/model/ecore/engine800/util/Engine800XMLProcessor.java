/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine800.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.engine800.Engine800Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine800XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine800XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Engine800Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Engine800ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Engine800ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Engine800ResourceFactoryImpl());
		}
		return registrations;
	}

} //Engine800XMLProcessor
