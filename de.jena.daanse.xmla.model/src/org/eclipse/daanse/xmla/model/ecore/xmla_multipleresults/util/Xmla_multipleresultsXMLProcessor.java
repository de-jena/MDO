/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Xmla_multipleresultsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_multipleresultsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Xmla_multipleresultsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Xmla_multipleresultsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Xmla_multipleresultsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Xmla_multipleresultsResourceFactoryImpl());
		}
		return registrations;
	}

} //Xmla_multipleresultsXMLProcessor
