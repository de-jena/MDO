package org.gecko.emf.osgi.components.dynamic;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.gecko.emf.osgi.EPackageConfigurator;

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