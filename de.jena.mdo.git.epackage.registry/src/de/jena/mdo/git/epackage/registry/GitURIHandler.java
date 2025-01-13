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

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.gecko.jgit.api.GitService;

/**
 * 
 * @author Juergen Albert
 * @since 13 Jan 2025
 */
public class GitURIHandler extends URIHandlerImpl {

	private GitService gitService;

	public GitURIHandler(GitService gitService) {
		this.gitService = gitService;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#canHandle(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public boolean canHandle(URI uri) {
		return uri.scheme().equals("git");
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#createInputStream(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		
		String commitId = uri.host();
		String file = GitEMFHelper.getGitFilePath(uri);
		InputStream inputStream = gitService.readFile(commitId, file);
		return inputStream;
	}
	
}
