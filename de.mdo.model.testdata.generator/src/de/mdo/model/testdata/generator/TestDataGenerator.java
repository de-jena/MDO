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
package de.mdo.model.testdata.generator;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.*;
import org.osgi.util.promise.PromiseFactory;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;

@Component
@RequireMongoEMFRepository
public class TestDataGenerator {

	private static final Logger LOG = System.getLogger(TestDataGenerator.class.getName());

	
	@Reference
	private ComponentServiceObjects<EMFRepository> repoServiceObjects;
	
	@Reference
	private MongoDatabaseProvider dbProvider;
	
	
	PromiseFactory factory = new PromiseFactory(Executors.newCachedThreadPool());
	
	private boolean generateTestData(String eClassName, EPackage ePackage, long amount) {
		EClass eClass = (EClass) ePackage.getEClassifier(eClassName);
		if(eClass == null) {
			LOG.log(Level.ERROR, "EClass " + eClassName + " not found in " + ePackage.getNsURI());
			return false;
		}
		
		long currentCount = dbProvider.getDatabase().getCollection(eClassName).countDocuments();
		long toDo = amount - currentCount;
		if(toDo > 0) {
			EMFRepository repo = repoServiceObjects.getService();
			try {
				List<EAttribute> attributes = eClass.getEAttributes().stream().filter(ea -> !ea.isID()).collect(Collectors.toList());
				for(int i = 0; i < toDo; i++) {
					EObject eObject = EcoreUtil.create(eClass);
					
					attributes.stream().filter(ea -> ea.getEType() == EcorePackage.Literals.ESTRING).forEach(ea -> eObject.eSet(ea, UUID.randomUUID().toString()));
					BigInteger maxLimit = new BigInteger("5000000000000");
			        BigInteger minLimit = new BigInteger("25000000000");
			        BigInteger bigInteger = maxLimit.subtract(minLimit);
			        Random randNum = new Random();
			        int len = maxLimit.bitLength();
//			        
					attributes.stream().filter(ea -> ea.getEType() == EcorePackage.Literals.EBIG_INTEGER).forEach(ea -> eObject.eSet(ea, new BigInteger(len, randNum)));
					
					attributes.stream().filter(ea -> ea.getEType() == EcorePackage.Literals.EDOUBLE).forEach(ea -> eObject.eSet(ea, Math.random()));
					
					repo.save(eObject);
					repo.detach(eObject);
					LOG.log(Level.INFO, "Saved No. " + i);
				}
			} catch (Exception e) {
				LOG.log(Level.ERROR, "Could not save Object " , e);
			} finally {
				repoServiceObjects.ungetService(repo);
			}
		}
		
		return true;
	}
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(TestDataList=*)")
	public void addEPackage(EPackage ePackage, Map<String, Object> props) {
		System.err.println("TESTTTTTT -------------------------");
		String[] eClasses = (String[]) props.get("TestDataList");
		if(eClasses != null) {
			Arrays.asList(eClasses).forEach(s -> factory.submit( () -> generateTestData(s, ePackage, (long) props.get("TestInstances"))));
		}
	}
	
	public void removeEPackage(EPackage ePackage) {
		
	}
	

}
