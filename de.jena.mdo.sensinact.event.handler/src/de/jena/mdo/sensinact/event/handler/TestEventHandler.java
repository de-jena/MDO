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
package de.jena.mdo.sensinact.event.handler;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.event.propertytypes.EventTopics;

/**
 * 
 * @author ungei
 * @since 30 May 2022
 */
@Component
@EventTopics("resourcechange/*")
public class TestEventHandler implements EventHandler {

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		System.err.println("Received Event for " + event.getTopic());
		for (String key : event.getPropertyNames()) {
			System.err.println("  " + key + " - " + event.getProperty(key));
		}
		
	}

}
