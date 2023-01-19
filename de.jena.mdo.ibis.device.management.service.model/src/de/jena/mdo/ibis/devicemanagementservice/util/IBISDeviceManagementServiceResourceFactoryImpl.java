/*
 */
package de.jena.mdo.ibis.devicemanagementservice.util;

import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.devicemanagementservice.util.IBISDeviceManagementServiceResourceImpl
 * @generated
 */
 @Component( name = IBISDeviceManagementServicePackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = IBISDeviceManagementServicePackage.eNAME + "Package", service = IBISDeviceManagementServicePackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = IBISDeviceManagementServicePackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"ibisdevicemanagementservice"
 	},  
	version = "1.0"
)
public class IBISDeviceManagementServiceResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBISDeviceManagementServiceResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		XMLResource result = new IBISDeviceManagementServiceResourceImpl(uri);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		return result;
	}

} //IBISDeviceManagementServiceResourceFactoryImpl
