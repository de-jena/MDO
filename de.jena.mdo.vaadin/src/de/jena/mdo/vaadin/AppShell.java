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
package de.jena.mdo.vaadin;

import org.gecko.vaadin.whiteboard.annotations.VaadinComponent;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

@Push()
@Theme(value = "wbapp")
@PWA(name = "My Whiteboard App", shortName = "My Whiteboard App", offlineResources = {"images/Jena_100x32.jpg"})
@Component(service=AppShell.class, scope = ServiceScope.PROTOTYPE)
@VaadinComponent()
public class AppShell implements AppShellConfigurator {

	private static final long serialVersionUID = 1L;
	
}
