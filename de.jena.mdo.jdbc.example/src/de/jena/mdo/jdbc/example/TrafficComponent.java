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
package de.jena.mdo.jdbc.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.persistence.Options;
import org.gecko.emf.persistence.pushstreams.PushStreamConstants;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushbackPolicyOption;

import de.jena.mdo.asset.traffic.TrafficPackage;

/**
 * DB is 'traffic'
 * TABLE is DETECTOR like the EClass name
 * @author mark
 * @since 18.05.2022
 */
//@Component
public class TrafficComponent {
	
	@Reference(target = "(&(emf.configurator.name=emf.persistence.jdbc)(emf.model.name=traffic))")
	private ResourceSet resourceSet;
//	private BundleContext bctx;
	private URI detectorUri = URI.createURI("jdbc://Derby_Traffic/traffic/DETECTOR/");
//	private URI edgeUri = URI.createURI("jdbc://Derby_Traffic/traffic/EDGE/");
//	private URI edgeItemUri = URI.createURI("jdbc://Derby_Traffic/traffic/EDGEITEM/");
//	private URI pointUri = URI.createURI("jdbc://Derby_Traffic/traffic/POINT/");
	
	@Activate
	public void activate(BundleContext bctx) {
//		this.bctx = bctx;
		Resource loadDetectorResource = resourceSet.createResource(detectorUri);
		Map<String, Object> loadOptions = new HashMap<String, Object>();
		loadOptions.put("type", "derby");
		String DETECTOREClassUri = TrafficPackage.eNS_URI + "/" + TrafficPackage.Literals.DETECTOR.getName();
		/*
		 * We dont have a EMF written table, so we give the load an hint, which EClass to load
		 */
		loadOptions.put(Options.OPTION_ECLASS_URI_HINT, DETECTOREClassUri);
		/*
		 * We expect some data and wanna use PushStreams instead of having all the object in the content list
		 */
		loadOptions.put(PushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		try {
			long start = System.currentTimeMillis();
			AtomicLong time = new AtomicLong();
			loadDetectorResource.load(loadOptions);
			long size = 0;
			for (EObject eo : loadDetectorResource.getContents()) {
				if (eo instanceof EPushStreamProvider) {
					EPushStreamProvider epsp = (EPushStreamProvider) eo;
					AtomicInteger count = new AtomicInteger();
					epsp.createPushStreamBuilder().withPushbackPolicy(PushbackPolicyOption.FIXED, 0).build().forEach((e)->{
						System.out.println("PSP Loaded: " + e.toString());
						time.set(System.currentTimeMillis());
						count.incrementAndGet();
					});
					size = count.get();
				} else {
					System.out.println("Loaded: " + eo.toString());
					size = loadDetectorResource.getContents().size();
				}
			}
			time.compareAndSet(0, System.currentTimeMillis());
			System.out.println("Loaded data: " + size + " in " + (time.get() - start) + " ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
