/*
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package org.gecko.emf.osgi.components.dynamic;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.gecko.emf.osgi.EPackageConfigurator;
import org.gecko.emf.osgi.ResourceSetFactory;

/**
 * Can be registered as a Service and the given Package will be configured to any {@link ResourceSetFactory} that picks it up.
 * 
 * @author Juergen Albert
 * @since 17 Mar 2022
 */
public class DynamicPackageConfiguratorImpl implements EPackageConfigurator {

		private final EPackage ePackage;

		/**
		 * Creates a new instance.
		 */
		public DynamicPackageConfiguratorImpl(EPackage ePackage) {
			this.ePackage = ePackage;
		}
		
		/* 
		 * (non-Javadoc)
		 * @see org.gecko.emf.osgi.EPackageConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
		 */
		@Override
		public void configureEPackage(Registry registry) {
			registry.put(ePackage.getNsURI(),ePackage);
		}

		/* 
		 * (non-Javadoc)
		 * @see org.gecko.emf.osgi.EPackageConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
		 */
		@Override
		public void unconfigureEPackage(Registry registry) {
			registry.remove(ePackage.getNsURI());
		}
	}