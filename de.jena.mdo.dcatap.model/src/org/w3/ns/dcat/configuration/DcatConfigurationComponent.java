/*
 */
package org.w3.ns.dcat.configuration;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;

import org.gecko.emf.osgi.annotation.require.RequireEMF;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.w3.ns.dcat.DcatPackage;

import org.w3.ns.dcat.impl.DcatPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       DCAT version 2 XML Schema
 *       XML Schema for http://www.w3.org/ns/dcat# namespace
 * 
 *       Description: This is an XML Schema for the DCAT version 2 specification.
 *       The schema is based on the one used by GeoNetwork for storing GeoNetwork data internally.
 *       The schema adheres to a 'normalized' RDF/XML syntax that can be processed with good old XML Technology (XPath,
 *       XSLT, XQuery).
 *       The schema is not intended to be used outside GeoNetwork.
 * 
 *       Created 2019-10-03 / Author PW
 *     
 * 
 *       DCterms XML Schema (relevant parts for DCAT version 2)
 *       XML Schema for http://purl.org/dc/terms/ namespace
 *       updated 2019-10-03
 *       By PW
 *     
 * 
 *       RDF XML Schema (relevant parts for DCAT version 2)
 *       XML Schema for http://www.w3.org/1999/02/22-rdf-syntax-ns# namespace
 *       Modified 2019-10-03
 *     
 * 
 *       See http://www.w3.org/XML/1998/namespace.html and
 *       http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 * 
 *       Note that local names in this namespace are intended to be defined
 *       only by the World Wide Web Consortium or its subgroups. The
 *       following names are currently defined in this namespace and should
 *       not be used with conflicting semantics by any Working Group,
 *       specification, or document instance:
 * 
 *       base (as an attribute name): denotes an attribute whose value
 *       provides a URI to be used as the base for interpreting any
 *       relative URIs in the scope of the element on which it
 *       appears; its value is inherited. This name is reserved
 *       by virtue of its definition in the XML Base specification.
 * 
 *       lang (as an attribute name): denotes an attribute whose value
 *       is a language code for the natural language of the content of
 *       any element; its value is inherited. This name is reserved
 *       by virtue of its definition in the XML specification.
 * 
 *       space (as an attribute name): denotes an attribute whose
 *       value is a keyword indicating what whitespace processing
 *       discipline is intended for the content of the element; its
 *       value is inherited. This name is reserved by virtue of its
 *       definition in the XML specification.
 * 
 *       Father (in any context at all): denotes Jon Bosak, the chair of
 *       the original XML Working Group. This name is reserved by
 *       the following decision of the W3C XML Plenary and
 *       XML Coordination groups:
 * 
 *       In appreciation for his vision, leadership and dedication
 *       the W3C XML Plenary on this 10th day of February, 2000
 *       reserves for Jon Bosak in perpetuity the XML name
 *       xml:Father
 *     
 * This schema defines attributes and an attribute group
 *       suitable for use by
 *       schemas wishing to allow xml:base, xml:lang or xml:space attributes
 *       on elements they define.
 * 
 *       To enable this, such a schema must import this schema
 *       for the XML namespace, e.g. as follows:
 *       <schema . . .>
 *       . . .
 *       <import namespace="http://www.w3.org/XML/1998/namespace"
 *       schemaLocation="http://www.w3.org/2001/03/xml.xsd"/>
 * 
 *       Subsequently, qualified reference to any of the attributes
 *       or the group defined below will have the desired effect, e.g.
 * 
 *       <type . . .>
 *       . . .
 *       <attributeGroup ref="xml:specialAttrs"/>
 * 
 *       will define a type which will schema-validate an instance
 *       element with any of those attributes
 *     
 * In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       http://www.w3.org/2001/03/xml.xsd.
 *       At the date of issue it can also be found at
 *       http://www.w3.org/2001/xml.xsd.
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML Schema
 *       itself. In other words, if the XML Schema namespace changes, the version
 *       of this document at
 *       http://www.w3.org/2001/xml.xsd will change
 *       accordingly; the version at
 *       http://www.w3.org/2001/03/xml.xsd will not change.
 *     
 * 
 *       SKOS XML Schema
 *       http://www.w3.org/2004/02/skos/core#
 *     
 * 
 *       FOAF XML Schema (relevant parts for DCAT version 2)
 *       http://xmlns.com/foaf/0.1/
 *       Modified 2019-10-03
 *     
 * 
 *       ISA Location XML Schema
 *       http://www.w3.org/ns/locn#
 *       Updated 2019-10-03
 *     
 * 
 *       VCARD XML Schema
 *       http://www.w3.org/2006/vcard/ns#
 *       Modified 2019-10-03
 *     
 * 
 *       ODRL XML Schema (relevant parts for DCAT version 2)
 *       http://www.w3.org/ns/odrl/2/
 *       Modified 2019-10-03
 *     
 * 
 *       PROV XML Schema (relevant parts for DCAT version 2)
 *       http://www.w3.org/ns/prov#
 *       Modified 2019-10-03
 *     
 * 
 *       ADMS XML Schema (relevant parts for DCAT version 2)
 *       http://www.w3.org/ns/adms#
 *       Modified 2019-10-03
 *     
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @see ResourceFactoryConfigurator
 * @generated
 */
@Component(name="DcatConfigurator", service= EPackageConfigurator.class)
@EMFModel(name=DcatPackage.eNAME, nsURI={DcatPackage.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = DcatPackage.eNAME, nsURI = { DcatPackage.eNS_URI }, version = "1.0.0")
public class DcatConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		DcatPackage p = DcatPackageImpl.init();
		if(p == null){
			p= DcatPackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(DcatPackage.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, DcatPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, DcatPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "dcat");
		String[] serviceClasses = new String[] {DcatPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(DcatPackage.eNS_URI, DcatPackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(DcatPackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(DcatPackage.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
