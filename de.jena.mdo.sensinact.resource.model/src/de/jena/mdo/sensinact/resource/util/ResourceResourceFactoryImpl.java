/*
 */
package de.jena.mdo.sensinact.resource.util;

import de.jena.mdo.sensinact.resource.ResourcePackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.sensinact.resource.util.ResourceResourceImpl
 * @generated
 */
 @Component( name = ResourcePackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON)
 @ProvideEMFResourceConfigurator( name = ResourcePackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"resource"
 	},  
	version = "1.0.0"
)
public class ResourceResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceResourceFactoryImpl() {
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
		Resource result = new ResourceResourceImpl(uri);
		return result;
	}

} //ResourceResourceFactoryImpl
