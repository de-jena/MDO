/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.jdbc.example;

import org.osgi.util.promise.Promise;

/**
 * 
 * @author ungei
 * @since 10 Jan 2023
 */
public interface DerbyDataImporter {

	Promise<Void> start();
	
}
