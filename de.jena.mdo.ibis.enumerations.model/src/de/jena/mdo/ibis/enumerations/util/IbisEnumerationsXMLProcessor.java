/**
 */
package de.jena.mdo.ibis.enumerations.util;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisEnumerationsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisEnumerationsXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, IbisEnumerationsPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IbisEnumerationsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IbisEnumerationsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IbisEnumerationsResourceFactoryImpl());
		}
		return registrations;
	}

} //IbisEnumerationsXMLProcessor
