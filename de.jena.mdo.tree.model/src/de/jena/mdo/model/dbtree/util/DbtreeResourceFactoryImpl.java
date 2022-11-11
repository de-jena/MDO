/*
 */
package de.jena.mdo.model.dbtree.util;

import de.jena.mdo.model.dbtree.DbtreePackage;

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
 * @see de.jena.mdo.model.dbtree.util.DbtreeResourceImpl
 * @generated
 */
 @Component( name = DbtreePackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = DbtreePackage.eNAME + "Package", service = DbtreePackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = DbtreePackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"dbtree"
 	},  
	version = "1.0"
)
public class DbtreeResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbtreeResourceFactoryImpl() {
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
		Resource result = new DbtreeResourceImpl(uri);
		return result;
	}

} //DbtreeResourceFactoryImpl
