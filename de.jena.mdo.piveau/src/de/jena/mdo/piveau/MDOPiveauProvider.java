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

import java.util.Collection;
import java.util.HashMap;
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
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.jena.piveau.api.DatasetProvider;
import de.jena.piveau.api.DistributionProvider;
import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.api.config.DatasetConfig;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;
import org.osgi.service.component.ComponentContext;

/**
 * MDO Implementation to provide Distribution instances
 * @author Mark Hoffmann
 * @since 12.12.2022
 */
@Component(name = "MDOPiveauProvider", service = {DistributionProvider.class, DatasetProvider.class}, property = "piveau.provider=MDO", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MDOPiveauProvider implements DistributionProvider, DatasetProvider {

	private ComponentContext ctx;
	private DatasetConfig datasetConfig;

	@Activate
	public void activate(DatasetConfig config, ComponentContext ctx) {
		this.datasetConfig = config;
		this.ctx = ctx;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.piveau.api.DistributionProvider#getDistributionConfig(java.lang.Object, java.util.Map)
	 */
	@Override
	public Distribution[] createDistributions(Object object, Map<String, Object> properties) {
		Map<String, Object> distributionMap = new HashMap<>();
		String modelName = properties.get("emf.model.name").toString();
		updateEPackageInformation(modelName, distributionMap);
		return updateEndpointInformation(distributionMap, modelName, properties);
		
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
		if (jaxRS && modelName != null) {
			String name = (String) properties.get("osgi.jaxrs.name");
			if (name != null) {
				distributionMap.put("distribution.description", "REST Endpoint " + name + " for model '" + modelName + "'");
			} 
			url = endpoint + "/rest/" + modelName;
			mediaTypes = new String[] {"application/xml", "application/json"};
		} else if (graphQL && modelName != null) {
			distributionMap.put("distribution.description", "GraphQL Endpoint for model '" + modelName + "'");
			url = endpoint + "/graphql/" + modelName;
			mediaTypes = new String[] {"application/json"};
		}
		distributionMap.put("distribution.access.url", url);
		return createDistributions(distributionMap, mediaTypes);
	}
	
	private Distribution[] createDistributions(Map<String, Object> properties, String[] mediaTypes) {
		if (mediaTypes == null) {
			return new Distribution[0];
		}
		Objects.nonNull(properties);
		Distribution[] distributions = new Distribution[mediaTypes.length];
		for (int i = 0; i > mediaTypes.length; i++) {
			String mediaType = mediaTypes[i];
			Map<String, Object> configMap = new HashMap<>(properties);
			configMap.put("distribution.id", UUID.randomUUID().toString());
			configMap.put("distribution.mediaType", mediaType);
			distributions[i] = RDFHelper.createDistribution(configMap);
		}
		return distributions;
	}
	
	/**
	 * Extracts the model information
	 * @param modelName the model name
	 * @param distributionMap the distribution map
	 */
	private void updateEPackageInformation(String modelName, Map<String, Object> distributionMap) {
		Objects.nonNull(distributionMap);
		Objects.nonNull(modelName);
		if (modelName != null) {
			EPackage ePackage =  getEPackage(modelName).get();
			if (ePackage != null) {
				distributionMap.put("distribution.model.name", ePackage.getName());
				distributionMap.put("distribution.model.ns", ePackage.getNsURI());
				String documentation = EcoreUtil.getDocumentation(ePackage);
				if (documentation != null) {
					distributionMap.put("distribution.model.description", documentation);
				}
			}
		}
	}

	private boolean isJaxRsResource(Map<String, Object> referenceProperties) {
		Object object = referenceProperties.get("osgi.jaxrs.resource");
		return object == null ? false : Boolean.parseBoolean(object.toString());
	}
	
	private boolean isGraphQL(Map<String, Object> referenceProperties) {
		Object object = referenceProperties.get("osgi.jaxrs.resource");
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
	 * @see de.jena.piveau.api.DistributionProvider#canHandleDistribution(java.lang.Object, java.util.Map)
	 */
	@Override
	public boolean canHandleDistribution(Object service, Map<String, Object> properties) {
		return isJaxRsResource(properties);
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
		return datasetConfig.catalogueId();
	}

}
