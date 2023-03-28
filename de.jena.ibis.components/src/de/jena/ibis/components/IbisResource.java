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
package de.jena.ibis.components;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * 
 * @author ilenia
 * @since Mar 28, 2023
 */
public class IbisResource extends XMLResourceImpl {

	private int responseCode = 0;
	
	/**
	 * Creates a new instance.
	 */
	public IbisResource(URI uri) {
		super(uri);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#handleSaveResponse(java.util.Map, java.util.Map)
	 */
	@Override
	protected void handleSaveResponse(Map<?, ?> response, Map<?, ?> options) {
		super.handleSaveResponse(response, options);
		if (response.containsKey("HTTPResponseCode")) {
			responseCode = (Integer)response.get("HTTPResponseCode");
		}
	}
	
	/**
	 * Returns the responseCode.
	 * @return the responseCode
	 */
	public int getResponseCode() {
		return responseCode;
	}

}
