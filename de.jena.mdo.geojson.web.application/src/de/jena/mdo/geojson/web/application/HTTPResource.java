/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.geojson.web.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;

/**
 * 
 * @author grune
 * @since May 20, 2022
 */
@HttpWhiteboardResource(prefix = "web/resources", pattern = {"/gis/*"})
@Component(service = HTTPResource.class)
public class HTTPResource {

}
