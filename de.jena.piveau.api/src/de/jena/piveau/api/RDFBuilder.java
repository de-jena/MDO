/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.piveau.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xml.type.AnyType;

import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.DcatPackage;
import de.jena.piveau.dcat.Distribution;
import de.jena.piveau.rdf.RDFRoot;
import de.jena.piveau.rdf.RdfFactory;

/**
 * Builder class for create EMF based resources and RDF compliant objects
 * @author mark
 * @since 04.01.2023
 */
public class RDFBuilder {
	
	private final RDFRoot rdfRoot;
	private final List<AnyType> anyTypes = new ArrayList<>();
	private ResourceSet resourceSet;
	private Resource resource;
	
	/**
	 * Creates a new instance.
	 */
	public RDFBuilder(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		this.rdfRoot = RdfFactory.eINSTANCE.createRDFRoot();
	}
	
	public RDFBuilder() {
		this(null);
	}
	
	public static RDFBuilder create() {
		return new RDFBuilder();
	}
	
	public static RDFBuilder create(ResourceSet resourceSet) {
		return new RDFBuilder(resourceSet);
	}
	
	public RDFBuilder appendDataset(Dataset dataset) {
		EList<Dataset> datasets = ECollections.singletonEList(dataset);
		return appendContent(DcatPackage.Literals.DCATAP_ROOT__DATASET, datasets);
	}
	
	public RDFBuilder appendDistribution(Distribution distribution) {
		EList<Distribution> distributions = ECollections.singletonEList(distribution);
		return appendContent(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, distributions);
	}
	
	public RDFBuilder appendDistribution(List<Distribution> distributions) {
		EList<Distribution> distributionList = ECollections.asEList(distributions);
		return appendContent(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, distributionList);
	}
	
	public RDFBuilder appendContent(EReference reference, EList<?> content){
		AnyType anyType = RDFHelper.createAnyType(rdfRoot, reference, content);
		anyTypes.add(anyType);
		return this;
	}
	
	public RDFBuilder withResource(Resource resource) {
		Objects.requireNonNull(resource);
		this.resource = resource;
		return this;
	}
	
	public RDFBuilder withResourceSet(ResourceSet resourceSet) {
		Objects.requireNonNull(resourceSet);
		this.resourceSet = resourceSet;
		return this;
	}
	
	public Resource buildResource() {
		Objects.requireNonNull(resourceSet);
		if (resource == null) {
			resource = resourceSet.createResource(URI.createFileURI(UUID.randomUUID().toString() + ".rdf"));
		}
		resource.getContents().add(rdfRoot);
		resource.getContents().addAll(anyTypes);
		return resource;
	}

}
