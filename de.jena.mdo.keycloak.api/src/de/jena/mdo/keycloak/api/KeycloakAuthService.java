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
package de.jena.mdo.keycloak.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface KeycloakAuthService{
	
	
	/**
	 * @return the Base64 encoded string token from keycloak. If the current token has been expired and the refresh token is still valid
	 * then the refresh token is returned. If neither one of them is still valid a new token is required and returned.
	 */
	String getBase64TokenString();
	
	String getBase64TokenString(String username, String password);

}
