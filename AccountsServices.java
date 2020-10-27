package com.samplecrmproject.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.samplecrmproject.models.Accounts;

/**
 * Session Bean implementation class AccountsServices
 */
@Stateless
@LocalBean
public class AccountsServices {

	@PersistenceContext(unitName="samplecrmproject")
    EntityManager em;
    public AccountsServices() {
        // TODO Auto-generated constructor stub
    }
	
	public void addAccounts(Accounts a){
		em.persist(a);
	}

}
