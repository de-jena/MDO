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

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

/**
 * 
 * @author ilenia
 * @since Mar 30, 2023
 */
@Component(immediate= true,
	name = "IbisUDPEventHandler", service = EventHandler.class, 
	property = {
		EventConstants.EVENT_TOPIC+"=UDPPacket/*"
})
public class IbisUDPEventHandler implements EventHandler {

	@Activate 
	public void activate() {
		System.out.println("Event Handler is active!");
	}
	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
	 */
	@Override
	public void handleEvent(Event evt) {
		System.out.println("Event arrived for topic " + evt.getTopic());
	}

}
