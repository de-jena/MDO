/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.util.promise.Promise;

/**
 * Collects the import jobs and shuts down the system after all of them are finished.
 * 
 * @author Juergen Albert
 * @since 10 Jan 2023
 */
@Component
public class ImportManager {

	private Promise<?> chainedPromise;

	@Reference(cardinality = ReferenceCardinality.AT_LEAST_ONE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
	void addDerbyDataImporter(DerbyDataImporter importer) {
		System.out.println("Importer is comming in: " + importer);
		if(chainedPromise == null) {
			System.out.println("Importer " + importer + " is first");
			chainedPromise = importer.start();
			chainedPromise.delay(5000).onResolve(this::registerShutdown);
		} else {
			System.out.println("Chaining Importer " + importer);
			chainedPromise = chainedPromise.then(x -> {
				System.out.println("Starting importer " + importer);
				return importer.start();
			});
		}
	}
	
	void removeDerbyDataImporter(DerbyDataImporter importer) {
		
	}

	void registerShutdown() {
		synchronized (this) {
			chainedPromise.onResolve(() -> System.exit(0));
		}
	}

}
