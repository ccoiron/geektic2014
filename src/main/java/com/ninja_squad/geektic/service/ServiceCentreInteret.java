package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ninja_squad.geektic.DAO.CentreinteretDAO;
import com.ninja_squad.geektic.domaine.CentreInteret;


@RestController
@Transactional
@RequestMapping("/centreinteret")
public class ServiceCentreInteret {
	
	@Autowired
	private CentreinteretDAO centreinteretDAO;
	
	@RequestMapping(method = GET)
	public List<CentreInteret> liste() {
        return centreinteretDAO.findAll();
    }
}
