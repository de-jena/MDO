/*
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
@Component( name = Xmla_multipleresultsPackage.eNAME + "XMLProcessor", service = Xmla_multipleresultsXMLProcessor.class, scope = ServiceScope.SINGLETON)
public class Xmla_multipleresultsXMLProcessor extends XMLProcessor {

	@Reference
	private Xmla_multipleresultsResourceFactoryImpl resourceFactory; 


	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Activate
	public Xmla_multipleresultsXMLProcessor(
		@Reference(name = "EPackageRegistry", target = "(component.name=DefaultEPackageRegistry)") EPackage.Registry registry
		) {
		super(registry);
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
			registrations.put(XML_EXTENSION, resourceFactory);
			registrations.put(STAR_EXTENSION, resourceFactory);
		}
		return registrations;
	}

} //Xmla_multipleresultsXMLProcessor
