/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.junit.jupiter.api.Test;

import de.jena.mdo.geojson.Feature;
import de.jena.mdo.geojson.GeojsonFactory;
import de.jena.mdo.geojson.GeojsonPackage;
import de.jena.mdo.geojson.Point;
import de.jena.mdo.model.system.SystemFactory;
import de.jena.mdo.model.system.SystemPackage;
import de.jena.mdo.model.system.XMLContainer;
import de.jena.mdo.model.system.util.SystemResourceFactoryImpl;

/**
 * 
 * @author mark
 * @since 31.08.2023
 */
class ContainerTest {

	@Test
	void test() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
		rs.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		rs.getPackageRegistry().put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		rs.getPackageRegistry().put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		rs.getPackageRegistry().put(GeojsonPackage.eNS_URI, GeojsonPackage.eINSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new SystemResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		
		Resource resource = rs.createResource(URI.createURI("test.xml"));
		if (resource instanceof XMLResource) {
			((XMLResource)resource).setEncoding("UTF-8");
		}
		XMLContainer container = SystemFactory.eINSTANCE.createXMLContainer();
		resource.getContents().add(container);
		Feature f01 = GeojsonFactory.eINSTANCE.createFeature();
		f01.setId("Features");
		Point p01 = GeojsonFactory.eINSTANCE.createPoint();
		p01.setBbox(new Double[] {12.34, 43.21});
		f01.setGeometry(p01);
		Feature f02 = GeojsonFactory.eINSTANCE.createFeature();
		f02.setId("Feature 2");
		Point p02 = GeojsonFactory.eINSTANCE.createPoint();
		p02.setBbox(new Double[] {12.34, 43.21});
		f02.setGeometry(p02);
		EList<EObject> elements = ECollections.asEList(f01, f02);
		
		AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
		anyType.eSet(SystemPackage.Literals.XML_CONTAINER__ELEMENTS, elements);
		container.setRoot(anyType);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, null);
			System.out.println(new String(baos.toByteArray()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
