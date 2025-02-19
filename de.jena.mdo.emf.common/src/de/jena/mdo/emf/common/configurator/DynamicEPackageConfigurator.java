/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.emf.common.configurator;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.configurator.EPackageConfigurator;

public class DynamicEPackageConfigurator implements EPackageConfigurator {
	
	private static Logger logger = Logger.getLogger(DynamicEPackageConfigurator.class.getName());
	private final EPackage ePackage;

	/**
	 * Creates a new instance.
	 */
	public DynamicEPackageConfigurator(EPackage ePackage) {
		this.ePackage = ePackage;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		if (ePackage != null) {
			registry.put(ePackage.getNsURI(), ePackage);
		} else {
			logger.log(Level.SEVERE, ()->"Error registering a NULL package, that should never happen");
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		if (ePackage != null) {
			registry.remove(ePackage.getNsURI());
		} else {
			logger.log(Level.SEVERE, ()->"Error un-registering a NULL package, that should never happen");
		}
	}

}
