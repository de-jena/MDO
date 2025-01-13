/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.graphql;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import de.jena.mdo.graphql.query.MDOGraphQLQueryProvider;


/**
 * Listens to newly appearing {@link EPackage}s that are marked with the GraphQL property and registers the Query Provider for it 
 * 
 * @author Juergen Albert
 * @since 23 Jun 2022
 */
@Component
@RequireConfigurationAdmin
public class GraphQLEPackageConfigurator {
	
	private static final Logger logger = Logger.getLogger(GraphQLEPackageConfigurator.class.getName());
	private ConfigurationAdmin configAdmin;

	/**
	 * Creates a new instance.
	 */
	@Activate
	public GraphQLEPackageConfigurator(@Reference ConfigurationAdmin configAdmin) {
		this.configAdmin = configAdmin;
	}
		
	private Map<EPackage, List<Configuration>> configs = new HashMap<>();
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(GraphQL=true)", unbind = "unbindEPackage")
	protected void bindEPackage(EPackage ePackage, Map<String, Object> properties) throws IOException {
		logger.fine(()->"Binding ePackage " + ePackage.getNsURI());
		List<Configuration> configList = new ArrayList<Configuration>();
		configs.put(ePackage, configList);
		
		Configuration queryProviderConfig = configAdmin.createFactoryConfiguration(MDOGraphQLQueryProvider.MDO_GRAPH_QL_QUERY_PROVIDER, "?");
		configList.add(queryProviderConfig);
		
		Dictionary<String, Object> props = new Hashtable<String, Object>();
		props.put(MDOGraphQLQueryProvider.EPACKAGE_REFERENCE_NAME + ".target", "(" + EMFNamespaces.EMF_MODEL_NSURI + "=" + ePackage.getNsURI() + ")");
		if(properties.containsKey("repo.ref.target")) {
			props.put("repo.ref.target", properties.get("repo.ref.target"));
		} else {
			props.put("repo.ref.target", "(repo_id=mdo.mdo)");
		}
		props.put(MDOGraphQLQueryProvider.EPACKAGE_REFERENCE_NAME + ".target", "(" + EMFNamespaces.EMF_MODEL_NSURI + "=" + ePackage.getNsURI() + ")");
		if (properties.containsKey("Piveau")) {
			Object piveauData = properties.get("Piveau");
			props.put("Piveau", piveauData);
		}
		if (properties.containsKey(EMFNamespaces.EMF_MODEL_NAME)) {
			Object modelName = properties.get(EMFNamespaces.EMF_MODEL_NAME);
			props.put("emf.model.name", modelName);
		}
		props.put("mdo.graphql", "true");
		queryProviderConfig.update(props);
		logger.fine(()->"Registering GraphQL endpoint " + ePackage.getName());
	}

	
	protected void unbindEPackage(EPackage ePackage) {
		logger.fine(()->"Unbinding ePackage " + ePackage.getNsURI());
		List<Configuration> list = configs.remove(ePackage);
		if(list != null) {
			list.forEach(t -> {
				try {
					t.delete();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
	}
}
