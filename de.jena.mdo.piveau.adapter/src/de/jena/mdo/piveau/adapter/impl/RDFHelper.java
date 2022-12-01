/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.piveau.adapter.impl;

import java.util.UUID;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import dcat.Dataset;
import dcat.DcatPackage;
import dcat.Distribution;
import rdf.PlainLiteral;
import rdf.RDFRoot;
import rdf.RdfFactory;

/**
 * 
 * @author mark
 * @since 28.11.2022
 */
public class RDFHelper {
	
	public static rdf.Resource createRDFResource(String value) {
		rdf.Resource r = RdfFactory.eINSTANCE.createResource();
		r.setResource(value);
		return r;
	}
	
	public static PlainLiteral createLiteral(String lang, String value) {
		PlainLiteral literal = RdfFactory.eINSTANCE.createPlainLiteral();
		literal.setLang(lang.toUpperCase());
		literal.setValue(value);
		return literal;
	}
	
	public static Resource createRdfResource(ResourceSet resourceSet){
		Resource resource = resourceSet.createResource(URI.createFileURI(UUID.randomUUID().toString() + ".rdf"));
		
		RDFRoot rdfRoot = RdfFactory.eINSTANCE.createRDFRoot();
		resource.getContents().add(rdfRoot);
		
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		resource.getContents().add(anyType);
		rdfRoot.getRDF().add(anyType);
		return resource;
	}
	
	public static Resource createRdfResource(ResourceSet resourceSet, EReference reference, EList<?> content){
		Resource resource = resourceSet.createResource(URI.createFileURI(UUID.randomUUID().toString() + ".rdf"));
		
		RDFRoot rdfRoot = RdfFactory.eINSTANCE.createRDFRoot();
		resource.getContents().add(rdfRoot);
		
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		anyType.eSet(reference, content);
		resource.getContents().add(anyType);
		rdfRoot.getRDF().add(anyType);
		return resource;
	}
	
	public static RDFRoot createRdfRoot(EReference reference, EList<?> content){
		RDFRoot rdfRoot = RdfFactory.eINSTANCE.createRDFRoot();
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		anyType.eSet(reference, content);
		rdfRoot.getRDF().add(anyType);
		return rdfRoot;
	}
	
	public static RDFRoot createRdfRoot(Dataset dataset){
		EList<Dataset> datasets = ECollections.singletonEList(dataset);
		return createRdfRoot(DcatPackage.Literals.DCATAP_ROOT__DATASET, datasets);
	}
	
	public static Resource createRdfResource(ResourceSet resourceSet, Dataset dataset){
		EList<Dataset> datasets = ECollections.singletonEList(dataset);
		return createRdfResource(resourceSet, DcatPackage.Literals.DCATAP_ROOT__DATASET, datasets);
	}
	
	public static Resource createRdfResource(ResourceSet resourceSet, Distribution distribution){
		EList<Distribution> distributions = ECollections.singletonEList(distribution);
		return createRdfResource(resourceSet, DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, distributions);
	}

}
