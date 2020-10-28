package com.samplecrmproject.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.samplecrmproject.models.Leads;

/**
 * Session Bean implementation class LeadsServices
 */
@Stateless
@LocalBean
public class LeadsServices {

	@PersistenceContext(unitName = "samplecrmproject")
	EntityManager em;
    /**
     * Default constructor. 
     */
    public LeadsServices() {
        // TODO Auto-generated constructor stub
    }
    
   
	public void AddLeads(Leads l) {
		em.persist(l);
		
	}

}
