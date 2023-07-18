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
		assertEquals("ACED0005757200135B4C6A6176612E6C616E672E446F75626C653BE112AD8900A656A6020000787000000002737200106A6176612E6C616E672E446F75626C6580B3C24A296BFB0402000144000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B02000078703FF80000000000007371007E00023FF999999999999A", convertedArray);
	}

}
