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

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.EMFNamespaces;
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
	protected void bindEPackage(EPackage ePackage) throws IOException {
		
		System.out.println("binding ePackage " + ePackage.getNsURI());
		List<Configuration> configList = new ArrayList<Configuration>();
		configs.put(ePackage, configList);
		
		Configuration queryProviderConfig = configAdmin.createFactoryConfiguration(MDOGraphQLQueryProvider.MDO_GRAPH_QL_QUERY_PROVIDER, "?");
		configList.add(queryProviderConfig);
		
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(MDOGraphQLQueryProvider.EPACKAGE_REFERENCE_NAME + ".target", "(" + EMFNamespaces.EMF_MODEL_NSURI + "=" + ePackage.getNsURI() + ")");
		queryProviderConfig.update(props);
	}

	
	protected void unbindEPackage(EPackage ePackage) {
		System.out.println("unbinding ePackage " + ePackage.getNsURI());
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
