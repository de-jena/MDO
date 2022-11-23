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
package de.jena.mdo.trafo.tests;

import java.math.BigInteger;
import java.util.UUID;

import org.assertj.core.api.Assertions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class TrafoTest {


	@Test
	@WithFactoryConfiguration(
			factoryPid = "DynamicPackageLoader",
			location = "?", 
			name = "asset",
			properties = {
					@Property(key = "url", value = "https://raw.githubusercontent.com/de-jena/MDO/main/de.jena.mdo.example.asset.model/model/asset.ecore"),	
			}
			)
	@WithFactoryConfiguration(
			factoryPid = "DynamicPackageLoader",
			location = "?", 
			name = "traffic",
			properties = {
					@Property(key = "url", value = "https://raw.githubusercontent.com/de-jena/MDO/main/de.jena.mdo.example.asset.model/model/traffic.ecore"),	
			}
		)
	@WithFactoryConfiguration(
			factoryPid = "RemoteConfigurableTransformationService",
			location = "?", 
			name = "trafo",
			properties = {
					@Property(key = "url", value = "https://raw.githubusercontent.com/de-jena/MDO/main/de.jena.mdo.example.asset.model/trafo/ExampleQVTMap.qvto"),	
					@Property(key = "name", value = "A_TRAFO")	
			}
			)

	public void test(
			@InjectService ServiceAware<ModelTransformator> trafoAware,
			@InjectService(filter = "(" + EMFNamespaces.EMF_MODEL_NAME+ "=traffic)") ServiceAware<EPackage> trafficPackageAware,
			@InjectService ResourceSet set
			) throws InterruptedException, Throwable {
		ModelTransformator transformator = trafoAware.waitForService(500L);
		Assertions.assertThat(transformator).isNotNull();
		
		EPackage ePackage = trafficPackageAware.getService();
		EClass detectorEClass = (EClass) ePackage.getEClassifier("DETECTOR");

		Assertions.assertThat(detectorEClass).isNotNull();
		EObject eObject = EcoreUtil.create(detectorEClass);
		
		Assertions.assertThat(eObject).isNotNull();
		
		detectorEClass.getEAttributes().stream().filter(ea -> ea.getEType() == EcorePackage.Literals.ESTRING).forEach(ea -> eObject.eSet(ea, UUID.randomUUID().toString()));
		detectorEClass.getEAttributes().stream().filter(ea -> ea.getEType() == EcorePackage.Literals.EBIG_INTEGER).forEach(ea -> eObject.eSet(ea, BigInteger.TEN));
		detectorEClass.getEAttributes().stream().filter(ea -> ea.getEType() == EcorePackage.Literals.EDOUBLE).forEach(ea -> eObject.eSet(ea, Math.random()));
		
		System.out.println(eObject);
		
		Resource resource = set.createResource(URI.createURI("temp.xmi"));
		resource.getContents().add(eObject);
		resource.save(System.out, null);
		resource.getContents().clear();
		
		EObject result = transformator.startTransformation(eObject);
		
		Assertions.assertThat(result).isNotNull();
		
		resource.getContents().add(result);
		resource.save(System.out, null);
		resource.getContents().clear();
	}

}
