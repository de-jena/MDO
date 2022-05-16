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
package de.jena.mdo.geojson.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.mdo.geojson.GeojsonFactory;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GeojsonFactoryTest {

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {

	}

	@Test
	public void testConvertDoubleArray(@InjectService ConfigurationAdmin ca, @InjectService GeojsonFactory factory) {
		String convertedArray = factory.convertArray1D(new Double[] {1.5,1.6});
		byte[] x = new byte[] {1,2,3};
		Class<? extends byte[]> byteClass = x.getClass();
		assertTrue(byteClass.isArray());
		assertTrue(byteClass.getComponentType() == byte.class);
		assertEquals("[1.5, 1.6]", convertedArray);
	}

}
