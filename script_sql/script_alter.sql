ALTER TABLE PROFIL
ADD constraint fk_profil_utilisateur FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur (idUtilisateur);

ALTER TABLE PROFIL
ADD constraint fk_profil_centreinteret FOREIGN KEY (idCentreInteret) REFERENCES CentreInteret (idCentreInteret);
	
ALTER TABLE AUDIT
ADD constraint fk_audit_utilisateur FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur (idUtilisateur);
