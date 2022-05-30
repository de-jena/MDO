/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.sensinact.core;

import java.lang.System.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.event.EventHandler;
import org.osgi.service.event.propertytypes.EventTopics;

import de.jena.mdo.sensinact.resource.ResourcePackage;

@Component(immediate = true)
@EventTopics(TestCore.SENSORE_TOPIC + "*")
public class TestCore implements EventHandler {

	/** SENNSORE */
	protected static final String SENSORE_TOPIC = "sennsore/";

	private static final Logger LOG = System.getLogger(TestCore.class.getName());

	@Reference
	EventAdmin ea;

	private ResourcePackage resPackage;
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	ResourceSet set;

	Map<String, EObject> instances = new HashMap<String, EObject>();
	Map<String, ServiceRegistration<EObject>> registrations = new HashMap<>();
//	Map<EClass, List<ServiceRegistration<EObject>>> registrations = new HashMap<>();

	private List<EClass> list;

	ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(12);

	BundleContext ctx = FrameworkUtil.getBundle(getClass()).getBundleContext();

	
	/**
	 * Creates a new instance.
	 */
	@Activate
	public TestCore(@Reference ResourcePackage resPackage,
			@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
			ResourceSet set) {
		this.resPackage = resPackage;
		this.set = set;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		String typeName = event.getTopic().substring(SENSORE_TOPIC.length());

		String[] split = typeName.split("/");
		String eClassName = split[0];
		String friendlyName = split[1];
		String id = eClassName + "_" + friendlyName;

		if (!instances.containsKey(id)) {
			create(eClassName, friendlyName);
		}

		Map<String, Object> data = (Map<String, Object>) event.getProperty("data");

		System.out.println("Received new Data: " + data);
		
		handleData(id, data);
		System.out.println("Handled new Data: " + data);
		
		
		
	}

	/**
	 * @param id
	 * @param data
	 */
	private void handleData(String id, Map<String, Object> data) {
		EObject device = instances.get(id);
		EClass eClass = device.eClass();
		data.forEach((k, v) -> {
			EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(k);
//			if(eStructuralFeature == null) {
//				EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
//				attribute.setName(k);
//				attribute.setEType(EcorePackage.Literals.ESTRING);
//				eClass.getEStructuralFeatures().add(attribute);
//				eStructuralFeature = attribute;
//			}
			device.eSet(eStructuralFeature, v);	
		});
	}

	/**
	 * @param eClasssName
	 * @param friendlyName
	 */
	private void create(String eClassName, String friendlyName) {
		list.stream().filter(ec -> ec.getName().equals(eClassName)).forEach(e -> {

			EObject instance = EcoreUtil.create(e);
			instance.eSet(resPackage.getDevice_FriendlyName(), friendlyName);
			
			Resource resource = set.createResource(URI.createURI("sensinact://device/" + eClassName + "/" + friendlyName));

			resource.getContents().add(instance);
			instance.eAdapters().add(new EventSendingContentAdapter(ea));
			
			registrations.put(eClassName + "_" + friendlyName, ctx.registerService(EObject.class, instance, new Hashtable<>(Collections.singletonMap("device", true))));
			instances.put(eClassName + "_" + friendlyName, instance);
		});

	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
	public void addEPackage(EPackage ePackage, Map<String, Object> props) {
		set.getResources().add(ePackage.eResource());
		list = ePackage.getEClassifiers().stream().filter(EClass.class::isInstance).map(EClass.class::cast)
				.filter(e -> e.getEAllSuperTypes().contains(resPackage.getDevice())).toList();
		list.forEach(this::doSomething);
	}

	private void doSomething(EClass eClass) {
		final String topic = SENSORE_TOPIC + eClass.getName() + "/" + UUID.randomUUID().toString();
		for(int i = 0; i < 1 ; i++) {
			scheduledExecutorService.scheduleWithFixedDelay(() -> {
				Map<String, Object> data = new HashMap<>();
				data.put("temperature", Math.random() * 100);
//				data.put("index", "TEST");
				Event event = new Event(topic,
						Collections.singletonMap("data", data));
				ea.postEvent(event);
			}, 100, 100, TimeUnit.MILLISECONDS);
		}

	}

	public void removeEPackage(EPackage ePackage) {

	}

}
