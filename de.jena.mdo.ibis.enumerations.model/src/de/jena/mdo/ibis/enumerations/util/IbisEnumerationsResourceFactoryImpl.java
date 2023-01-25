/*
 */
package de.jena.mdo.ibis.enumerations.util;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.util.IbisEnumerationsResourceImpl
 * @generated
 */
 @Component( name = IbisEnumerationsPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = IbisEnumerationsPackage.eNAME + "Package", service = IbisEnumerationsPackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = IbisEnumerationsPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"ibisenumerations"
 	},  
	version = "1.0"
)
public class IbisEnumerationsResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisEnumerationsResourceFactoryImpl() {
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
		Resource result = new IbisEnumerationsResourceImpl(uri);
		return result;
	}

} //IbisEnumerationsResourceFactoryImpl
