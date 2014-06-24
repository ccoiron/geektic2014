package com.ninja_squad.geektic.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.domaine.CentreInteret;
import com.ninja_squad.geektic.domaine.Utilisateur;

@Repository
public class CentreinteretDAO {
	
	@PersistenceContext	
	public EntityManager em;
	
	public List<CentreInteret> findAll(){
		 TypedQuery<CentreInteret> query = em.createQuery("SELECT c FROM CentreInteret as c", CentreInteret.class);
		 return query.getResultList();
	}
}
