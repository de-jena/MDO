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
package de.jena.mdo.data.importer;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.mongo.pushstream.constants.MongoPushStreamConstants;
import org.gecko.emf.persistence.pushstreams.PushStreamConstants;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.QueuePolicyOption;


/**
 * 
 * @author Juergen Albert
 * @since 30 May 2022
 */
@Component(name = "MDODataImporter", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = DataImporterConfig.class)
@RequireMongoEMFRepository
public class DataImporter{

	private static final Logger LOG = System.getLogger(DataImporter.class.getName());
	
	@Reference(name = "sourcePackage", target = "(nope=true)")
	EPackage sourcePackage;
	
	@Reference(name = "trafo", target = "(nope=true)")
	ModelTransformator trafo;
	
//	@Reference(name = "sourceRepo")
//	ComponentServiceObjects<QueryRepository> sourceRepoObjects;
	
	@Reference(target = "(&(emf.configurator.name=emf.persistence.jdbc)(emf.model.name=traffic))")
	private ResourceSet resourceSet;

	@Reference(name = "targetRepo" , target = "(nope=true)")
	ComponentServiceObjects<EMFRepository> targetRepoObjects;

	@Activate
	private void activate(DataImporterConfig config) throws ConfigurationException {
		
		EClass eClass = (EClass) sourcePackage.getEClassifier(config.eClass());
		
		System.err.println("looking for EClass " + eClass);
		
		if(eClass == null) {
			throw new ConfigurationException("eClass", "EClass " + config.eClass() + " not found in Package " + sourcePackage.getNsURI());
		}
		
//		QueryRepository queryRepository = sourceRepoObjects.getService();
		EMFRepository targetRepo = targetRepoObjects.getService();
//		IQuery query = queryRepository.createQueryBuilder().allQuery().build();
		
//		EPushStreamProvider psp = queryRepository.getEObjectByQuery(eClass, query, getLoadOptions());
		EPushStreamProvider psp = getPushStreamProvider(config.sourceURI(), EcoreUtil.getURI(sourcePackage.getEClassifier(config.eClass())).toString());
		PushStream<EObject> stream = createStream(psp);
		
		stream.onClose(() -> {
//			sourceRepoObjects.ungetService(queryRepository);
			
			targetRepoObjects.ungetService(targetRepo);
			resourceSet.getResources().clear();
		})
		.onError(t -> LOG.log(Level.ERROR, "Error proccessing transformed Data", t))
		.map(trafo::startTransformation)
		.forEach(e -> {
			targetRepo.save(e);
			targetRepo.detach(e);
		});
	}
	
	private PushStream<EObject> createStream(EPushStreamProvider psp) {
		return psp.createPushStreamBuilder()
				.withPushbackPolicy( GeckoPushbackPolicyOption.LINEAR_AFTER_THRESHOLD.getPolicy(650))
				.withQueuePolicy(QueuePolicyOption.BLOCK)
				.withExecutor(Executors.newSingleThreadExecutor())
				.withBuffer(new ArrayBlockingQueue<PushEvent<? extends EObject>>(1200))
				.build();
	}
	
	private EPushStreamProvider getPushStreamProvider(String uri, String eClassUri) {
		Resource loadDetectorResource = resourceSet.createResource(URI.createURI(uri));
		Map<String, Object> loadOptions = new HashMap<String, Object>();
		loadOptions.put("type", "derby");
		/*
		 * We dont have a EMF written table, so we give the load an hint, which EClass to load
		 */
		loadOptions.put(org.gecko.emf.persistence.Options.OPTION_ECLASS_URI_HINT, eClassUri);
		/*
		 * We expect some data and wanna use PushStreams instead of having all the object in the content list
		 */
		loadOptions.put(PushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		try {
			loadDetectorResource.load(loadOptions);
			return (EPushStreamProvider) loadDetectorResource.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private Map<Object, Object> getLoadOptions(){
		Map<Object, Object> loadOptions = new HashMap<>();
		loadOptions.put(Options.OPTION_BATCH_SIZE, Integer.valueOf(600));
		loadOptions.put(Options.OPTION_READ_DETACHED, Boolean.TRUE);
		loadOptions.put(MongoPushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		return loadOptions;
	}
	
}
