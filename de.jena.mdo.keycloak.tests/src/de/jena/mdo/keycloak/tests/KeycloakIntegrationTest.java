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
package de.jena.mdo.keycloak.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.keycloak.representations.AccessTokenResponse;
import org.keycloak.representations.idm.authorization.AuthorizationResponse;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.mdo.keycloak.api.KeycloakAuthService;



/**
 * 
 * @author ilenia
 * @since Jan 19, 2023
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class KeycloakIntegrationTest {

	@Test
	public void test(@InjectService() ServiceAware<KeycloakAuthService> keycloakServiceAware) {
		assertThat(keycloakServiceAware).isNotNull();
		KeycloakAuthService keycloakService = keycloakServiceAware.getService();
		assertThat(keycloakService).isNotNull();	
		AuthorizationResponse response = keycloakService.sendAuthRequest("test", new char[] {'t','e','s','t','1','2','3','4'});
		assertThat(response).isNotNull();
		AccessTokenResponse tokenResponse = keycloakService.obtainAccessToken("test", new char[] {'t','e','s','t','1','2','3','4'});
		assertThat(tokenResponse).isNotNull();
		
	}
	
}
