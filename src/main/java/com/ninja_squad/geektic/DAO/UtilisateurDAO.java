package com.ninja_squad.geektic.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.domaine.Utilisateur;

@Repository
public class UtilisateurDAO {
	
	@PersistenceContext	
	public EntityManager em;
	
	public List<Utilisateur> findAllUtilisateur(){
		 TypedQuery<Utilisateur> query = em.createQuery("SELECT DISTINCT u FROM Utilisateur as u left join fetch u.centreinterets", Utilisateur.class);
		 return query.getResultList();
	}
		
	public List<Utilisateur> findBySex(int sexe) { 
		TypedQuery<Utilisateur> query = em.createQuery("SELECT DISTINCT u FROM Utilisateur u WHERE sexe =" + sexe,Utilisateur.class); 
		return query.getResultList(); 
	}
}
