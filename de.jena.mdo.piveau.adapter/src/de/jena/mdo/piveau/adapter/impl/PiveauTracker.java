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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.jaxrs.runtime.JaxrsServiceRuntimeConstants;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import de.jena.mdo.piveau.adapter.PiveauDistributionAdapter;

/**
 * 
 * @author mark
 * @since 06.12.2022
 */
public class PiveauTracker implements ServiceTrackerCustomizer<Object, Object>{
	
	private static final String TRACKER_FILTER = "(Piveau=%s)";
	private final PiveauDistributionAdapter distributionAdapter;
	private final BundleContext ctx;
	private final Map<String, Object> trackerProperties;
	private final Map<Long, String> activeDistributions = new ConcurrentHashMap<>();
	private final Map<String, String> activePackages= new ConcurrentHashMap<>();
	private final String endpoint;
	private ServiceTracker<?, ?> piveauTracker;
	
	public PiveauTracker(BundleContext ctx, String datasetId, PiveauDistributionAdapter adapter, Map<String, Object> trackerProperties) {
		this.ctx = ctx;
		distributionAdapter = adapter;
		this.trackerProperties = trackerProperties;
		endpoint = getEndpoint();
		try {
			Filter filter = FrameworkUtil.createFilter(String.format(TRACKER_FILTER, datasetId));
			piveauTracker = new ServiceTracker<>(ctx, filter, this);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public void open() {
		if (piveauTracker != null) {
			piveauTracker.open();
		}
	}
	
	public void close() {
		if (piveauTracker != null) {
			piveauTracker.close();
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public Object addingService(ServiceReference<Object> reference) {
		Long serviceId = (Long) reference.getProperty(Constants.SERVICE_ID);
		String modelName = reference.getProperty("emf.model.name").toString();
		boolean jaxRS = isJaxRsResource(reference.getProperties());
		boolean graphQL = isJaxRsResource(reference.getProperties());
		Object o = ctx.getService(reference);
		if (o != null) {
			if (o instanceof EPackage) {
				EPackage ePackage = (EPackage) o;
				activePackages.put(ePackage.getName(), ePackage.getNsURI());
			} else {
				if (jaxRS && modelName != null) {
					registerRESTDistribution(serviceId, endpoint + "/rest/", modelName);
				} else if (graphQL && modelName != null) {
					String url = endpoint + "/graphql/" + modelName;
					System.out.println("GraphQL URL " + url);
				}
				
			}
		}
		return o;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#modifiedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void modifiedService(ServiceReference<Object> reference, Object service) {
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<Object> reference, Object service) {
		Long serviceId = (Long) reference.getProperty(Constants.SERVICE_ID);
		boolean jaxRS = isJaxRsResource(reference.getProperties());
		if (service instanceof EPackage) {
			EPackage ePackage = (EPackage) service;
			activePackages.remove(ePackage.getName());
		} else if (jaxRS) {
			unregisterRESTDistribution(serviceId);
		}
		
	}

	/**
	 * @return
	 */
	private String getEndpoint() {
		Object endpoints = trackerProperties.get(JaxrsServiceRuntimeConstants.JAX_RS_SERVICE_ENDPOINT);
		if (endpoints instanceof String[]) {
			return ((String[])endpoints)[0];
		} else if (endpoints instanceof List<?>) {
			return ((List)endpoints).get(0).toString();
		} else {
			return endpoints.toString();
		}
	}
	
	private boolean isJaxRsResource(Dictionary<String, Object> referenceProperties) {
		Object object = referenceProperties.get(JaxrsWhiteboardConstants.JAX_RS_RESOURCE);
		return object == null ? false : Boolean.parseBoolean(object.toString());
	}

	/**
	 * @param ePackage
	 */
	private void registerRESTDistribution(Long serviceId, String url, String modelName) {
		String distributionURL =  url + modelName;
		activeDistributions.put(serviceId, distributionURL);
	}

	/**
	 * @param ePackage
	 */
	private void unregisterRESTDistribution(Long serviceId) {
		activeDistributions.remove(serviceId);
		
	}
	
	/**
	 * Returns the activeDistributions.
	 * @return the activeDistributions
	 */
	public List<String> getActiveDistributions() {
		return new ArrayList<>(activeDistributions.values());
	}
	
	/**
	 * Returns the activePackages.
	 * @return the activePackages
	 */
	public Map<String, String> getActivePackages() {
		return activePackages;
	}

}
