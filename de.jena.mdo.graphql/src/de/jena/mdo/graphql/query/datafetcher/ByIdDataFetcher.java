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
package de.jena.mdo.graphql.query.datafetcher;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.ComponentServiceObjects;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * 
 * @author ungei
 * @since 23 Jun 2022
 */
public class ByIdDataFetcher implements DataFetcher<EObject> {

	private ComponentServiceObjects<EMFRepository> repo;
	private EClass eClass;

	/**
	 * Creates a new instance.
	 */
	public ByIdDataFetcher(ComponentServiceObjects<EMFRepository> repo, EClass eClass) {
		this.repo = repo;
		this.eClass = eClass;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see graphql.schema.DataFetcher#get(graphql.schema.DataFetchingEnvironment)
	 */
	@Override
	public EObject get(DataFetchingEnvironment environment) throws Exception {
		EMFRepository repository = repo.getService();
		Object id = environment.getArgument("id");
		EObject result = null;
		try {
			result = repository.getEObject(eClass, id);
		} finally {
			repo.ungetService(repository);
		}
		return result;
	}

}
