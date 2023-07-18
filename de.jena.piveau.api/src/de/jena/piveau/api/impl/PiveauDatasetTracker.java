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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

/**
 * 
 * @author mark
 * @since 06.12.2022
 */
public class PiveauDatasetTracker extends PiveauTracker{
	
	private final String catalogueId;
	private Dataset dataset = null;
	
	public PiveauDatasetTracker(BundleContext ctx, String datasetId, String catalogueId, Map<String, Object> properties) {
		super(ctx, datasetId, properties);
		this.catalogueId = catalogueId;
	}
	
	public void open(Dataset dataset) {
		Objects.nonNull(dataset);
		this.dataset = dataset;
		super.open();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public Object addingService(ServiceReference<Object> reference) {
		Long serviceId = (Long) reference.getProperty(Constants.SERVICE_ID);
		Object o = getBundleContext().getService(reference);
		Map<String, Object> addProperties = new HashMap<>(getProperties());
		addProperties.putAll(FrameworkUtil.asMap(reference.getProperties()));
		if (getProvider().canHandleDistribution(null, addProperties)) {
			Distribution[] distributions = getProvider().createDistributions(o, addProperties);
			activeDistributions.computeIfAbsent(serviceId, (l) -> new ArrayList<>());
			activeDistributions.computeIfPresent(serviceId, (l,dists)->{
				dists.addAll(Arrays.asList(distributions));
				return dists;
			});
			Dataset ds = RDFHelper.appendDistributions(dataset, getActiveDistributions());
			getConnector().updateDistributions(getActiveDistributions(), ds, getDatasetId(), catalogueId);
		}
		return o;
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
			Dataset ds = RDFHelper.appendDistributions(dataset, getActiveDistributions());
			getConnector().updateDistributions(getActiveDistributions(), ds, getDatasetId(), catalogueId);
		}
	}

}
