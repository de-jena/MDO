/**
 */
package de.jena.mdo.ibis.devicemanagementservice.util;

import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

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
public class IBISDeviceManagementServiceXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBISDeviceManagementServiceXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		IBISDeviceManagementServicePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IBISDeviceManagementServiceResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IBISDeviceManagementServiceResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IBISDeviceManagementServiceResourceFactoryImpl());
		}
		return registrations;
	}

} //IBISDeviceManagementServiceXMLProcessor
