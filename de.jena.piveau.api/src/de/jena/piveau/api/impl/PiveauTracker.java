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
package de.jena.piveau.api.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import de.jena.piveau.api.DistributionProvider;
import de.jena.piveau.api.connector.DistributionConnector;
import de.jena.piveau.dcat.Distribution;

/**
 * 
 * @author mark
 * @since 06.12.2022
 */
public class PiveauTracker implements ServiceTrackerCustomizer<Object, Object>{
	
	private static final String TRACKER_FILTER = "(Piveau=%s)";
	private DistributionConnector connector;
	private DistributionProvider provider;
	private final Map<String, Object> properties;
	private final String datasetId;
	private final BundleContext ctx;
	private final Map<Long, List<Distribution>> activeDistributions = new ConcurrentHashMap<>();
	private final Map<String, String> activePackages= new ConcurrentHashMap<>();
	private ServiceTracker<?, ?> piveauTracker;
	
	public PiveauTracker(BundleContext ctx, String datasetId, Map<String, Object> properties) {
		this.ctx = ctx;
		this.datasetId = datasetId;
		this.properties = properties;
		try {
			Filter filter = FrameworkUtil.createFilter(String.format(TRACKER_FILTER, datasetId));
			piveauTracker = new ServiceTracker<>(ctx, filter, this);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public void setDistributionProvider(DistributionProvider provider) {
		this.provider = provider;
	}
	
	public void setDistributionConnector(DistributionConnector connector) {
		this.connector = connector;
	}
	
	public void open() {
		Objects.nonNull(connector);
		Objects.nonNull(provider);
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
		Object o = ctx.getService(reference);
		Map<String, Object> addProperties = new HashMap<>(properties);
		addProperties.putAll(FrameworkUtil.asMap(reference.getProperties()));
		if (provider.canHandleDistribution(null, addProperties)) {
			Distribution[] distributions = provider.createDistributions(o, addProperties);
			for (Distribution distribution :  distributions) {
				final Distribution dist = connector.createDistribution(distribution, datasetId);
				activeDistributions.computeIfAbsent(serviceId, (l) -> new ArrayList<>());
				activeDistributions.computeIfPresent(serviceId, (l,dists)->{
					dists.add(dist);
					return dists;
				});
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
		List<Distribution> distributions = activeDistributions.remove(serviceId);
		if (distributions != null) {
			distributions.stream()
				.map(Distribution::getAbout)
				.filter(Objects::nonNull)
				.forEach(connector::deleteDistribution);
		}
	}

	/**
	 * Returns the activeDistributions.
	 * @return the activeDistributions
	 */
	public List<Distribution> getActiveDistributions() {
		return activeDistributions.values().stream().flatMap(List::stream).collect(Collectors.toList());
	}
	
	/**
	 * Returns the activePackages.
	 * @return the activePackages
	 */
	public Map<String, String> getActivePackages() {
		return activePackages;
	}

}
