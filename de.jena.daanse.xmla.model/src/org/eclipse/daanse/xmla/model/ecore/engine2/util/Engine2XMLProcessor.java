/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine2.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.engine2.Engine2Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine2XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine2XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Engine2Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Engine2ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Engine2ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Engine2ResourceFactoryImpl());
		}
		return registrations;
	}

} //Engine2XMLProcessor
