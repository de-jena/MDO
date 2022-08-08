/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EnginePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EngineResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EngineResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EngineResourceFactoryImpl());
		}
		return registrations;
	}

} //EngineXMLProcessor
