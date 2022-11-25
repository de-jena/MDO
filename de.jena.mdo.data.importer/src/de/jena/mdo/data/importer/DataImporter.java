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
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.persistence.helper.PersistenceHelper;
import org.gecko.emf.persistence.helper.PersistenceHelper.EMFPersistenceContext;
import org.gecko.emf.persistence.pushstreams.PushStreamConstants;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.AnyService;
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
 * Importer that reads from a JDBC data source and transforms the data into a new internal model.
 * The importer depends on certain conditions: models, transformators, transformator-black boxes, data sources
 * @author Juergen Albert
 * @since 30 May 2022
 */
@Component(name = "MDODataImporter", configurationPolicy = ConfigurationPolicy.REQUIRE, reference = @Reference(name = "condition", service = AnyService.class, target = "(nope=true)"))
@Designate(ocd = DataImporterConfig.class)
@RequireMongoEMFRepository
public class DataImporter{

	private static final Logger LOG = System.getLogger(DataImporter.class.getName());
	
	@Reference(name = "sourcePackage", target = "(nope=true)")
	EPackage sourcePackage;
	
	@Reference(name = "trafo", target = "(nope=true)")
	ModelTransformator trafo;
	
	@Reference(target = "(&(emf.configurator.name=emf.persistence.jdbc.derbytraffic)(emf.model.name=traffic))")
	private ResourceSet resourceSet;

	@Reference(name = "targetRepo" , target = "(nope=true)")
	ComponentServiceObjects<EMFRepository> targetRepoObjects;

	@Activate
	private void activate(DataImporterConfig config) throws ConfigurationException {
		
		EClass eClass = (EClass) sourcePackage.getEClassifier(config.eClass());
		
		if(eClass == null) {
			throw new ConfigurationException("eClass", "EClass " + config.eClass() + " not found in Package " + sourcePackage.getNsURI());
		}
		
		EMFRepository targetRepo = targetRepoObjects.getService();
		EPushStreamProvider psp = getPushStreamProvider(config.sourceURI(), eClass);
//		EPushStreamProvider psp = getPushStreamProvider(config.sourceURI(), EcoreUtil.getURI(sourcePackage.getEClassifier(config.eClass())).toString());
		PushStream<EObject> stream = createStream(psp);
		
		stream.onClose(() -> {
//			sourceRepoObjects.ungetService(queryRepository);
			LOG.log(Level.INFO, "Closed pushstream for " + eClass.getName());
			targetRepoObjects.ungetService(targetRepo);
			resourceSet.getResources().clear();
		})
		.onError(t -> LOG.log(Level.ERROR, "Error proccessing transformed data for " + eClass.getName(), t))
		.map(trafo::startTransformation)
		.forEach(e -> {
			targetRepo.save(e);
			targetRepo.detach(e);
		});
	}
	
	private PushStream<EObject> createStream(EPushStreamProvider psp) {
		assert(psp != null);
		return psp.createPushStreamBuilder()
				.withPushbackPolicy( GeckoPushbackPolicyOption.LINEAR_AFTER_THRESHOLD.getPolicy(850))
				.withQueuePolicy(QueuePolicyOption.BLOCK)
				.withExecutor(Executors.newSingleThreadExecutor())
				.withBuffer(new ArrayBlockingQueue<PushEvent<? extends EObject>>(1500))
				.build();
	}
	
	private EPushStreamProvider getPushStreamProvider(String uri, EClass eClass) {
		EMFPersistenceContext context = PersistenceHelper.createPersistenceContext(uri, eClass, null);
		Resource loadResource = resourceSet.createResource(context.getUri());
		Map<String, Object> loadOptions = context.getOptions();
		loadOptions.put("type", "derby");
		/*
		 * We expect some data and wanna use PushStreams instead of having all the object in the content list
		 */
		loadOptions.put(PushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		loadOptions.put(PushStreamConstants.OPTION_QUERY_PUSHSTREAM_MULTITHREAD, Boolean.TRUE);
		try {
			loadResource.load(loadOptions);
			return (EPushStreamProvider) loadResource.getContents().get(0);
		} catch (IOException e) {
			LOG.log(Level.WARNING, "Error loading resource as PushstreamProvider for EClass " + eClass.getName(), e);
			return null;
		}
	}
	
}
