package org.vaadin.backend;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * A CDI configuration to provide access to container managed 
 * PersistenceContext. This is needed for DeltaSpike Data, one per app
 * is enough.
 */
public class CdiConfig {
	@Produces
	@Dependent
	@PersistenceContext(unitName = "customer-pu")
	public EntityManager entityManager;
}