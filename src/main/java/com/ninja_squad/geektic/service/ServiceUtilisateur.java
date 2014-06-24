package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.DAO.UtilisateurDAO;
import com.ninja_squad.geektic.domaine.Utilisateur;

@RestController
@Transactional
@RequestMapping("/utilisateur")
public class ServiceUtilisateur {
	
	@Autowired
	private UtilisateurDAO utilisateurDAO;
	
	@RequestMapping(method = GET)
	public List<Utilisateur> liste() {
        return utilisateurDAO.findAllUtilisateur();
    }
}
