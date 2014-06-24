CREATE TABLE Utilisateur
(
    idUtilisateur INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    email VARCHAR(255),
    pays VARCHAR(255),
    ville VARCHAR(255),
    codepostal VARCHAR(5),
	gravatar VARCHAR(255)
)

CREATE TABLE Profil
(
	idProfil int PRIMARY KEY NOT NULL,
	idUtilisateur int,
	idCentreInteret int,
	Constraint pk_profil PRIMARY KEY (id)
)

CREATE TABLE CentreInteret
(
	idCentreInteret int PRIMARY KEY NOT NULL,
	libelle VARCHAR(250),
)

CREATE TABLE Audit
(
	idAudit int PRIMARY KEY NOT NULL,
	date DATETIME,
	idUtilisateur int,
	adresseip varchar(20),
	compteur int
)
