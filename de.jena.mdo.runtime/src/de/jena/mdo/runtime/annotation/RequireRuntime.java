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
package  de.jena.mdo.runtime.annotation;

import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.osgi.service.jaxrs.whiteboard.annotations.RequireJaxrsWhiteboard;
import org.gecko.emf.jaxrs.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.osgi.service.http.whiteboard.annotations.RequireHttpWhiteboard;

@Documented
@Retention(CLASS)
@Target({ TYPE, PACKAGE })
/**
 * Requires all the necessary modules for your application
 */
@RequireJaxrsWhiteboard
@RequireHttpWhiteboard
@RequireEMFJson
@RequireEMFMessageBodyReaderWriter
@RequireMongoEMFRepository
public @interface RequireRuntime {

}
