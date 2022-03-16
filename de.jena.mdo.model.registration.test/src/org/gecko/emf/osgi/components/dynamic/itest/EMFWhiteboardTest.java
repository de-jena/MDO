/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package org.gecko.emf.osgi.components.dynamic.itest;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * Tests the EMF OSGi integration
 * 
 * @author Mark Hoffmann
 * @since 25.07.2017
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class EMFWhiteboardTest {

	@InjectBundleContext
	BundleContext bc;

	//TODO More tests for dynamic registration and unregistration.
	
	/**
	 * Trying to load an instance with a non registered {@link EPackage}
	 * 
	 * @throws IOException
	 */
	@Test
	@WithConfiguration(pid = "DynamicPackageLoader", properties = @Property(key = "url", value = "https://raw.githubusercontent.com/de-jena/5g-models/main/models/dim_device/device.ecore" ))
	public void testDynamicEPackageLoad(
			@InjectService(cardinality = 0) ServiceAware<ResourceSetFactory> sa,
			@InjectService(timeout = 500) ServiceAware<EPackage> ePackages
			)
			throws IOException {
		List<EPackage> services = ePackages.getServices();
		services.forEach(p -> System.out.println(p.getName() + " " + p.getNsURI()));
	}


}