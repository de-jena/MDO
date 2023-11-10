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
package de.jena.mdo.piveau;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import de.jena.mdo.mimetypes.api.SupportedMediatype;
import de.jena.piveau.api.DatasetProvider;
import de.jena.piveau.api.DistributionProvider;
import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.api.config.DatasetConfig;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

/**
 * MDO Implementation to provide Distribution instances
 * @author Mark Hoffmann
 * @since 12.12.2022
 */
@Component(name = "MDOPiveauProvider", immediate = true, service = {DistributionProvider.class, DatasetProvider.class}, property = "piveau.provider=MDO", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MDOPiveauProvider implements DistributionProvider, DatasetProvider {

	private ComponentContext ctx;
	private DatasetConfig datasetConfig;
	private SupportedMediatype supportedMediaTypes;

	@Activate
	public MDOPiveauProvider(DatasetConfig config, ComponentContext ctx, @Reference SupportedMediatype mediaTypes) {
		this.datasetConfig = config;
		this.ctx = ctx;
		this.supportedMediaTypes = mediaTypes;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#canHandleDistribution(java.lang.Object, java.util.Map)
	 */
	@Override
	public boolean canHandleDistribution(Object service, Map<String, Object> properties) {
		return isJaxRsResource(properties) || isGraphQL(properties);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#getDistributionConfig(java.lang.Object, java.util.Map)
	 */
	@Override
	public Distribution[] createDistributions(Object object, Map<String, Object> properties) {
		Map<String, Object> distributionMap = new HashMap<>();
		if (!datasetConfig.catalogueId().isEmpty()) {
			String catalogueId = RDFHelper.stripLastCharacter(datasetConfig.catalogueId());
			distributionMap.put("distribution.catalogueId", catalogueId);
		}
		if (!datasetConfig.distributionHost().isEmpty()) {
			String host = RDFHelper.stripLastCharacter(datasetConfig.distributionHost());
			distributionMap.put("distribution.distributionHost", host);
		}
		String modelName = properties.getOrDefault("emf.model.name", "<none>").toString();
		Map<String, Object> packageProps = updateEPackageInformation(modelName, distributionMap);
		properties.putAll(packageProps);
		return updateEndpointInformation(distributionMap, modelName, properties);
		
	}
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#canHandleDataset(java.util.Map)
	 */
	@Override
	public boolean canHandleDataset(Map<String, Object> properties) {
		try {
			String target = (String) properties.get("datasetProvider.target");
			if (target == null) {
				return false;
			}
			Filter filter = ctx.getBundleContext().createFilter(target);
			return filter.match(ctx.getProperties());
		} catch (Exception e) {
			// TODO Log warning
			e.printStackTrace();
		}
		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#createDataset(java.util.Map)
	 */
	@Override
	public Dataset createDataset(Map<String, Object> properties) {
		return RDFHelper.createDataset(datasetConfig);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#getDatasetId()
	 */
	@Override
	public String getDatasetId() {
		return datasetConfig.id();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DatasetProvider#getCatalogueId()
	 */
	@Override
	public String getCatalogueId() {
		String catalogueId = RDFHelper.stripLastCharacter(datasetConfig.catalogueId());
		return catalogueId;
	}

	/**
	 * @param properties
	 * @param modelName
	 * @param distributionMap 
	 */
	private Distribution[] updateEndpointInformation(Map<String, Object> distributionMap, String modelName, Map<String, Object> properties) {
		boolean jaxRS = isJaxRsResource(properties);
		boolean graphQL = isGraphQL(properties);
		String endpoint = getEndpointUrl(properties);
		String url = null;
		String[] mediaTypes = new String[0]; 
		String root = (String) properties.get("root");
		List<Distribution> distributions = new LinkedList<Distribution>();
		if (jaxRS && modelName != null) {
			distributionMap.put("distribution.title", "MDO REST for model '" + modelName + "'");
			String name = (String) properties.get("osgi.jaxrs.name");
			if (name != null) {
				distributionMap.put("distribution.description", "REST Endpoint '" + name + "' for model '" + modelName + "'");
			} 
			url = endpoint + "/rest/" + modelName;
			mediaTypes = supportedMediaTypes.getSupportedMediaTypes().toArray(new String[0]);
			if (root != null) {
				Map<String, Object> instanceProps = new HashMap<>(distributionMap);
				if (name != null) {
					instanceProps.put("distribution.description", "REST Endpoint '" + name + "' for instances of '" + root + "' for model '" + modelName + "'");
				} 
				instanceProps.put("distribution.title", "MDO REST endpoint for instances of '" + root + "' for model '" + modelName + "'");
				instanceProps.put("distribution.access.url", url + "?limit=1000");
				distributions.addAll(createDistributions(instanceProps, mediaTypes));
			}
		} else if (graphQL && modelName != null) {
			distributionMap.put("distribution.title", "MDO GraphQL for model '" + modelName + "'");
			distributionMap.put("distribution.description", "GraphQL Endpoint for model '" + modelName + "'");
			url = endpoint + "/graphql/" + modelName;
			mediaTypes = new String[] {"application/json"};
		}
		distributionMap.put("distribution.access.url", url);
		distributions.addAll(createDistributions(distributionMap, mediaTypes));
		return distributions.toArray(new Distribution[distributions.size()]);
	}
	
	
	private List<Distribution> createDistributions(Map<String, Object> properties, String[] mediaTypes) {
		if (mediaTypes == null) {
			return Collections.emptyList();
		}
		List<Distribution> distributions = new ArrayList<>(mediaTypes.length);
		Objects.requireNonNull(properties);
		for (int i = 0; i < mediaTypes.length; i++) {
			String mediaType = mediaTypes[i];
			Map<String, Object> configMap = new HashMap<>(properties);
			configMap.put("distribution.id", UUID.randomUUID().toString());
			configMap.put("distribution.mediaType", mediaType);
			distributions.add(RDFHelper.createDistribution(configMap));
		}
		return distributions;
	}
	
	/**
	 * Extracts the model information
	 * @param modelName the model name
	 * @param distributionMap the distribution map
	 */
	private Map<String, Object> updateEPackageInformation(String modelName, Map<String, Object> distributionMap) {
		Objects.requireNonNull(distributionMap);
		Objects.requireNonNull(modelName);
		Map<String, Object> props = new HashMap<>();
		if (modelName != null) {
			Optional<EPackage> ePackageOpt =  getEPackage(modelName);
			if (!ePackageOpt.isEmpty()) {
				EPackage ePackage = ePackageOpt.get();
				distributionMap.put("distribution.model.name", ePackage.getName());
				distributionMap.put("distribution.model.ns", ePackage.getNsURI());
//				String keywords = EcoreUtil.getAnnotation(ePackage, "Piveau", "keywords");
//				if (keywords != null) {
//					props.put("keywords", keywords);
//				}
//				String root = EcoreUtil.getAnnotation(ePackage, "Piveau", "root");
//				if (root != null) {
//					props.put("root", root);
//				}
//				String theme = EcoreUtil.getAnnotation(ePackage, "Piveau", "theme");
//				if (theme != null) {
//					props.put("theme", theme);
//				}
				String documentation = EcoreUtil.getDocumentation(ePackage);
				if (documentation != null) {
					distributionMap.put("distribution.model.description", documentation);
				}
			}
		}
		return props;
	}

	private boolean isJaxRsResource(Map<String, Object> referenceProperties) {
		Object object = referenceProperties.get("osgi.jaxrs.resource");
		return object == null ? false : Boolean.parseBoolean(object.toString());
	}
	
	private boolean isGraphQL(Map<String, Object> referenceProperties) {
		Object object = referenceProperties.get("mdo.graphql");
		return object == null ? false : Boolean.parseBoolean(object.toString());
	}
	
	private Optional<EPackage> getEPackage(String modelName) {
		try {
			BundleContext bctx = ctx.getBundleContext();
			Collection<ServiceReference<EPackage>> references = bctx.getServiceReferences(EPackage.class, String.format("(emf.model.name=%s)", modelName));
			if (references != null && !references.isEmpty()) {
				ServiceReference<EPackage> ref = references.stream().findFirst().orElse(null);
				if (ref != null) {
					try {
						EPackage ePackage = bctx.getService(ref);
						return Optional.ofNullable(ePackage);
					} finally {
						bctx.ungetService(ref);
					}
				}
			}
			return Optional.empty();
		} catch (InvalidSyntaxException e) {
			throw new IllegalStateException("Error getting EPackage service '" + modelName + "'", e);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#getEndpointUrl(java.util.Dictionary, de.jena.piveau.api.config.DistributionConfig)
	 */
	@SuppressWarnings("rawtypes")
	private String getEndpointUrl(Map<String, Object> properties) {
		Object endpoints = properties.get(PiveauRegistry.PROP_LOCAL_BASE_URI);
		if (endpoints instanceof String[]) {
			return ((String[])endpoints)[0];
		} else if (endpoints instanceof List<?>) {
			return ((List)endpoints).get(0).toString();
		} else {
			return endpoints.toString();
		}
	}

}
