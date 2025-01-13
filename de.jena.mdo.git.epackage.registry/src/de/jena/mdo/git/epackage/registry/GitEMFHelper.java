/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.git.epackage.registry;

import org.eclipse.emf.common.util.URI;

/**
 * 
 * @author Juergen Albert
 * @since 13 Jan 2025
 */
public class GitEMFHelper {

	public static String getGitFilePath(URI uri) {
		URI filePart = uri.deresolve(uri.trimSegments(uri.segmentCount()).trimFragment().trimFileExtension());
		String file = filePart.toString();
		if(file.startsWith("/")) {
			file = file.substring(1);
		}
		return file;
	}
	
}
