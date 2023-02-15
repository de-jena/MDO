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
package de.jena.mdo.keycloak;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;
import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.representations.AccessTokenResponse;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.jena.mdo.keycloak.api.KeycloakAuthService;

/**
 * 
 * @author ilenia
 * @since Jan 19, 2023
 */
@Component(name = "KeycloakAuthService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class KeycloakAuthServiceImpl implements KeycloakAuthService {
	
	private AuthzClient authzClient;
	private AccessTokenResponse token;
	
	@interface KeycloakConfig {
		String configurationFilePath() default "";
	}
	
	
	@Activate 
	public void activate(KeycloakConfig config) throws ConfigurationException {
		String configPath = config.configurationFilePath();
		if (configPath.isEmpty() || configPath.isBlank()) {
			throw new ConfigurationException("configFilePath", "The 'configFilePath' must be given");
		}
		try(InputStream configStream = new FileInputStream(configPath)) {
			authzClient = AuthzClient.create(configStream);	
		} catch(IOException e) {
			throw new ConfigurationException("configPath", String.format("Cannot load keycloak configuration from file path '%s'", configPath), e);
		}
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.keycloak.api.KeycloakAuthService#getBase64TokenString()
	 */
	@Override
	public String getBase64TokenString() {
		return getBase64TokenString(null, null);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.keycloak.api.KeycloakAuthService#getBase64TokenString(java.lang.String, java.lang.String)
	 */
	@Override
	public String getBase64TokenString(String username, String password) {
		if(token == null) {
			token = obtainAccessToken(username, password);
		}
		if(isTokenValid(token.getToken())) {
			return encodeTokenString(token.getToken());
		}
		else if(isTokenValid(token.getRefreshToken())) {
			return encodeTokenString(token.getRefreshToken());
		}
		else {
			token = obtainAccessToken(username, password);
		}
		return encodeTokenString(token.getToken());
	}
	
	private String encodeTokenString(String tokenString) {
		return Base64.encodeBase64String(tokenString.getBytes());
	}

	
	private AccessTokenResponse obtainAccessToken(String username, String password) {
		if(username == null || password == null) return authzClient.obtainAccessToken();
		return authzClient.obtainAccessToken(username, password);
	}

	private boolean isTokenValid(String tokenStr) {
		try {
			authzClient.authorization(tokenStr).authorize();
			return true;
		} catch(Exception e) {
			return false;
		}		
	}


	
}
