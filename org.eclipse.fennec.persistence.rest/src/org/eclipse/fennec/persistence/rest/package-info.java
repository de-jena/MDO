@Version("1.0.0")
@Export
@RequireEMFJson
@RequireEMF
@RequireConfigurator
@RequireConfigurationAdmin
@RequireEMFMessageBodyReaderWriter
package org.eclipse.fennec.persistence.rest;

import org.osgi.annotation.bundle.Export;
import org.osgi.annotation.versioning.Version;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.rest.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.osgi.service.configurator.annotations.RequireConfigurator;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;