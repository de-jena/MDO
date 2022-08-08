/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Xmla_mddatasetXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_mddatasetXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Xmla_mddatasetPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Xmla_mddatasetResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Xmla_mddatasetResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Xmla_mddatasetResourceFactoryImpl());
		}
		return registrations;
	}

} //Xmla_mddatasetXMLProcessor
