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
package de.jena.piveau.api;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.osgi.util.converter.Converters;

import de.jena.piveau.api.config.DatasetConfig;
import de.jena.piveau.api.config.DistributionConfig;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.DcatFactory;
import de.jena.piveau.dcat.DcatPackage;
import de.jena.piveau.dcat.Distribution;
import de.jena.piveau.rdf.DateOrDateTimeLiteral;
import de.jena.piveau.rdf.PlainLiteral;
import de.jena.piveau.rdf.RDFRoot;
import de.jena.piveau.rdf.RdfFactory;
import de.jena.piveau.skos.Concept;
import de.jena.piveau.skos.SkosFactory;
import de.jena.piveau.terms.Standard;
import de.jena.piveau.terms.StandardType;
import de.jena.piveau.terms.TermsFactory;

/**
 * 
 * @author mark
 * @since 28.11.2022
 */
public class RDFHelper {

	public static de.jena.piveau.rdf.Resource createRDFResource(String value) {
		de.jena.piveau.rdf.Resource r = RdfFactory.eINSTANCE.createResource();
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
	
	public static AnyType createRdfRoot(RDFRoot rdfRoot, EReference reference, EList<?> content){
		if (rdfRoot == null) {
			rdfRoot = RdfFactory.eINSTANCE.createRDFRoot();
		}
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		anyType.eSet(reference, content);
		rdfRoot.getRDF().add(anyType);
		return anyType;
	}
	
	public static AnyType createAnyType(RDFRoot rdfRoot, EReference reference, EList<?> content){
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		anyType.eSet(reference, content);
		rdfRoot.getRDF().add(anyType);
		return anyType;
	}

	public static Resource createRdfResource(ResourceSet resourceSet, Dataset dataset){
		EList<Dataset> datasets = ECollections.singletonEList(dataset);
		return createRdfResource(resourceSet, DcatPackage.Literals.DCATAP_ROOT__DATASET, datasets);
	}

	public static Resource createRdfResource(ResourceSet resourceSet, Distribution distribution){
		EList<Distribution> distributions = ECollections.singletonEList(distribution);
		return createRdfResource(resourceSet, DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, distributions);
	}

	public static Dataset createDataset(Map<String, Object> data) {
		try {
			DatasetConfig dsc = Converters.standardConverter().convert(data).defaultValue(null).to(DatasetConfig.class);
			return createDataset(dsc);
		} catch (Exception e) {
			throw new IllegalArgumentException("Dataset is incomplete or invalid", e);
		}
	}

	public static Dataset createDataset(DatasetConfig config) {
		Dataset dataSet = DcatFactory.eINSTANCE.createDataset();
		String host = RDFHelper.stripLastCharacter(config.distributionHost());
		String catalogueId = RDFHelper.stripLastCharacter(config.catalogueId());
		dataSet.setAbout(createAbout(host, catalogueId, config.id()));
		dataSet.getTitle().add(createLiteral("DE", config.title_de()));
		if (!config.title_en().isEmpty()) {
			dataSet.getTitle().add(createLiteral("EN", config.title_en()));
		}
		dataSet.getDescription().add(createLiteral("DE", config.description_de()));
		if (!config.description_en().isEmpty()) {
			dataSet.getDescription().add(createLiteral("EN", config.description_en()));
		}
		if (config.issued() != null && "NOW".equals(config.issued())) {
			DateOrDateTimeLiteral issued = RdfFactory.eINSTANCE.createDateOrDateTimeLiteral();
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(new Date());
			XMLGregorianCalendar date;
			try {
				date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				issued.setValue(date);
				dataSet.setIssued(issued);
			} catch (DatatypeConfigurationException e1) {
				System.out.println("Issued error " + e1.getMessage());
			}
		}
		return dataSet;
	}
	
	private static String createAbout(String distributionHost, String catalogueId, String id) {
		Objects.requireNonNull(distributionHost);
		Objects.requireNonNull(id);
		String host = distributionHost;
		if (!host.isEmpty()) {
			if (!host.startsWith("http://") && !host.startsWith("https://")) {
				host = "https://" + host;
			}
			if (host.endsWith("/")) {
				host = host.substring(0, host.length()-1);
			}
		} else {
			host = "https://localhost";
		}
		String about = host + "/";
		if (catalogueId != null && !catalogueId.isEmpty()) {
			about += catalogueId + "/";
		}
		return about + id;
	}

	public static Distribution createDistribution(Map<String, Object> data) {
		try {
			DistributionConfig distc = Converters.standardConverter().convert(data).to(DistributionConfig.class);
			return createDistribution(distc);
		} catch (Exception e) {
			throw new IllegalArgumentException("Distribution map is incomplete or invalid", e);
		}
	}

	public static Distribution createDistribution(DistributionConfig config) {
		Distribution distribution = DcatFactory.eINSTANCE.createDistribution();
		String host = RDFHelper.stripLastCharacter(config.distributionHost());
		String catalogueId = RDFHelper.stripLastCharacter(config.catalogueId());
		distribution.setAbout(createAbout(host, catalogueId, config.id()));
		distribution.getAccessURL().add(createRDFResource(config.access_url()));
		Concept format = SkosFactory.eINSTANCE.createConcept();
		format.setResource(config.mediaType());
		distribution.setFormat(format);
		distribution.getMediaType().add(config.mediaType());

		distribution.setTitle(createLiteral("DE", config.title()));
		if (!config.description().isEmpty()) {
			distribution.getDescription().add(createLiteral("DE", config.description()));
		}
		if (config.model_name() != null && !config.model_name().isEmpty()) {
			Standard standard = TermsFactory.eINSTANCE.createStandard();
			StandardType standardType = TermsFactory.eINSTANCE.createStandardType();
			standard.setStandard(standardType);
			standardType.getTitle().add(createLiteral("DE", config.model_name()));
			if (!config.model_description().isEmpty()) {
				standardType.getDescription().add(createLiteral("DE", config.model_description()));
			}
			if (!config.model_ns().isEmpty()) {
				standardType.setAbout(config.model_ns());
			}
			distribution.getConformsTo().add(standard);
		}
		return distribution;
	}
	
	/**
	 * Appends distribution references to a dataset
	 * @param dataset the dataset
	 * @param distributions the distributions to add
	 * @return a copy of the dataset with distribution references
	 */
	public static Dataset appendDistributions(Dataset dataset, List<Distribution> distributions) {
		Objects.requireNonNull(dataset);
		Objects.requireNonNull(distributions);
		Dataset ds = EcoreUtil.copy(dataset);
		distributions.
			stream().
			map(Distribution::getAbout).
			map(RDFHelper::createRDFResource).
			forEach(ds.getDistribution()::add);
		return ds;
	}
	
	/**
	 * Workaround helper for the caonfig admin plugin problem with cascaded proeprties
	 * @param value
	 * @return
	 */
	public static String stripLastCharacter(String value) {
		if (Objects.nonNull(value) && value.endsWith("]")) {
			return value.substring(0, value.length() -1);
		} else {
			return value;
		}
	}

}
