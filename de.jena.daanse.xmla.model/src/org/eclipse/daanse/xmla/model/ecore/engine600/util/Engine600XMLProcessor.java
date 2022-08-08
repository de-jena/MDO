/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine600.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.engine600.Engine600Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine600XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine600XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Engine600Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Engine600ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Engine600ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Engine600ResourceFactoryImpl());
		}
		return registrations;
	}

} //Engine600XMLProcessor
