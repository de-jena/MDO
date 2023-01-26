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

import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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

	@Disabled("Keycloak server not configured as DIM keycloak yet")
	@Test
	public void test(@InjectService() ServiceAware<KeycloakAuthService> keycloakServiceAware) throws InterruptedException {
		assertThat(keycloakServiceAware).isNotNull();
		KeycloakAuthService keycloakService = keycloakServiceAware.getService();
		assertThat(keycloakService).isNotNull();	
		String tokenResponse = keycloakService.getBase64TokenString();
		assertThat(tokenResponse).isNotNull();
	}
	
	@Disabled("Keycloak server not configured as DIM keycloak yet")
	@Test
	public void testEncodedStr(@InjectService() ServiceAware<KeycloakAuthService> keycloakServiceAware) throws InterruptedException {
		assertThat(keycloakServiceAware).isNotNull();
		KeycloakAuthService keycloakService = keycloakServiceAware.getService();
		assertThat(keycloakService).isNotNull();	
		String tokenResponse = keycloakService.getBase64TokenString();
		assertThat(tokenResponse).isNotNull();
		assertThat(Base64.isBase64(tokenResponse)).isEqualTo(true);
	}

}
