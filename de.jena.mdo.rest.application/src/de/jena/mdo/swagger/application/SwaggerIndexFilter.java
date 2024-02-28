/*
* Copyright (c) 2020 Kentyou.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*    Kentyou - initial API and implementation
 */
package de.jena.mdo.swagger.application;

import java.io.IOException;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardFilterRegex;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@HttpWhiteboardFilterRegex({ "/?", "/" })
@Component(name = SwaggerIndexFilter.COMPONENT_NAME, service = Filter.class, scope = ServiceScope.PROTOTYPE, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class SwaggerIndexFilter implements Filter {

	public static final String COMPONENT_NAME = "SwaggerIndexFilter";
	private String path;

	/**
	 * Creates a new instance.
	 */
	@Activate
	public SwaggerIndexFilter(Map<String, Object> props) {
		this.path = (String) props.get("path");
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.err.println("======================= FILTER CALLED");
		
		if (request instanceof HttpServletRequest) {
			((HttpServletResponse) response).sendRedirect(path + "/index.html");
		}
	}

	public void destroy() {
	}
}
