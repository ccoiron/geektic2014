package com.ninja_squad.geektic.domaine;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Utilisateur")
public class Utilisateur {
	@Id
	@Column(name = "IdUtilisateur")
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String pays;
	private String ville;
	private String codepostal;
	private String gravatar;
	private String sexe;
	
	@ManyToMany
	@JoinTable(name = "PROFIL", joinColumns = @JoinColumn(name = "idutilisateur"), inverseJoinColumns = @JoinColumn(name = "idcentreinteret"))
	private List<CentreInteret> centreinterets;
	
	public List<CentreInteret> getCentreinterets() {
		return centreinterets;
	}
	public void setCentreinterets(List<CentreInteret> centreinterets) {
		this.centreinterets = centreinterets;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getGravatar() {
		return gravatar;
	}
	public void setGravatar(String gravatar) {
		this.gravatar = gravatar;
	}

}
