/**
 */
package de.jena.mdo.ibis.gnsslocationservice.util;

import de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisGNSSLocationServiceXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisGNSSLocationServiceXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		IbisGNSSLocationServicePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IbisGNSSLocationServiceResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IbisGNSSLocationServiceResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IbisGNSSLocationServiceResourceFactoryImpl());
		}
		return registrations;
	}

} //IbisGNSSLocationServiceXMLProcessor
