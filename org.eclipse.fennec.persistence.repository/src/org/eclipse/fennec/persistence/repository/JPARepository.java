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
package org.eclipse.fennec.persistence.repository;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.jpa.JpaHelper;
import org.eclipse.persistence.sessions.server.Server;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.repository.DefaultEMFRepository;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

/**
 * 
 * @author ungei
 * @since 13 Jan 2025
 */
@Component(service = EMFRepository.class, scope = ServiceScope.PROTOTYPE, property = {
		"repo_id=jpa",
		"base_uri=jpa://citizen"
		})
public class JPARepository extends DefaultEMFRepository {

	// JPA EntityManagerFacotry for persistence unit citizen
	@Reference(target = "(osgi.unit.name=citizen)")
	private EntityManagerFactory emf;
	// ResourceSet that has EMF model citizen
	@Reference(target = "(" + EMFNamespaces.EMF_MODEL_NAME + "=citizen)")
	private ResourceSetFactory rs;
	@Reference(target = "(" + EMFNamespaces.EMF_MODEL_NAME + "=citizen)")
	private EPackage citizenPackage;
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#getResourceSetFactory()
	 */
	@Override
	public ResourceSetFactory getResourceSetFactory() {
		return rs;
	}
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#getResourceSet()
	 */
	@Override
	public ResourceSet getResourceSet() {
		// TODO Auto-generated method stub
		return super.getResourceSet();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#setIDs(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected void setIDs(EObject rootObject) {
		// TODO Auto-generated method stub

	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#getAllEObjects(org.eclipse.emf.ecore.EClass, java.util.Map)
	 */
	@Override
	public <T extends EObject> List<T> getAllEObjects(EClass eClass, Map<?, ?> options) {
		Long limit = (Long) options.get("limit");
		if (isNull(limit) || limit < 1) {
			limit = 100L;
		}
		Integer index = null;
		if (nonNull(index) && index < 0) {
			index = 0;
		}
		Server server = JpaHelper.getServerSession(emf);
		requireNonNull(eClass);
		ClassDescriptor classDescriptor = server.getDescriptorForAlias(eClass.getName());
		requireNonNull(classDescriptor);
		
		try (EntityManager em = emf.createEntityManager()) {
			Class<?> clazz = classDescriptor.getJavaClass();
			TypedQuery<?> query = em.createQuery(String.format("SELECT e FROM %s e", eClass.getName()), clazz);
			query.setMaxResults(limit.intValue());
			List<?> result = query.getResultList();
			if (isNull(result) || result.isEmpty()) {
				return Collections.emptyList();
			}
			if (nonNull(index)) {
				query.setFirstResult(index);
			}
			return (List<T>) result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#getAllEObjects(org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public <T extends EObject> List<T> getAllEObjects(EClass eClass) {
		return getAllEObjects(eClass, Collections.emptyMap());
	}

}
