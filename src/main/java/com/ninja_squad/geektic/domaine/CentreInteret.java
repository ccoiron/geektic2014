package com.ninja_squad.geektic.domaine;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="CentreInteret")
public class CentreInteret {
	@Id
	@Column(name = "idcentreinteret")
	private Long id;
	private String libelle;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "centreinterets") 
	private List<Utilisateur> utilisateurs;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
