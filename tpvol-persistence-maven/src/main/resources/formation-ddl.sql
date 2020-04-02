drop table if exists COMPETENCE cascade;

drop table if exists EVALUATION cascade;

drop table if exists FILIERE cascade;

drop table if exists MATIERE cascade;

drop table if exists PERSONNE cascade;

drop table if exists SALLE cascade;

drop table if exists UE cascade;

drop sequence if exists GLOBAL_SEQ;

create sequence GLOBAL_SEQ;

create table COMPETENCE 
(
   FORMATEUR_ID         INTEGER           not null,
   MATIERE_ID           INTEGER           not null,
   constraint PK_COMPETENCE primary key (FORMATEUR_ID, MATIERE_ID)
);

create table EVALUATION 
(
   ID                   INTEGER           not null,
   COMPORTEMENTALE      INTEGER           not null,
   TECHNIQUE            INTEGER           not null,
   COMMENTAIRES         CHARACTER VARYING(255),
   STAGIAIRE_ID         INTEGER,
   constraint PK_EVALUATION primary key (ID)
);

create table FILIERE 
(
   ID                   INTEGER           not null,
   INTITULE             CHARACTER VARYING(100)        not null,
   PROMOTION            CHARACTER VARYING(100),
   DT_DEBUT             DATE,
   DUREE                INTEGER,
   DISPOSITIF           CHARACTER VARYING(10)         not null,
   REFERENT_ID          INTEGER,
   constraint PK_FILIERE primary key (ID)
);

create table MATIERE 
(
   ID                   INTEGER           not null,
   NOM                  CHARACTER VARYING(100)        not null,
   DUREE                INTEGER            not null,
   constraint PK_MATIERE primary key (ID)
);

create table PERSONNE 
(
   ID                   INTEGER           not null,
   DISC                 CHARACTER VARYING(15)         not null,
   CIVILITE             CHARACTER VARYING(10),
   NOM                  CHARACTER VARYING(100)        not null,
   PRENOM               CHARACTER VARYING(100),
   EMAIL                CHARACTER VARYING(255)        not null,
   TELEPHONE            CHARACTER VARYING(15),
   DT_NAISSANCE         DATE,
   NIVEAU_ETUDE         CHARACTER VARYING(10),
   REFERENT             CHAR(1),
   EXPERIENCE           INTEGER,
   FILIERE_ID           INTEGER,
   RUE                  CHARACTER VARYING(255),
   COMPLEMENT           CHARACTER VARYING(100),
   CODE_POSTAL          CHARACTER VARYING(10),
   VILLE                CHARACTER VARYING(255),
   constraint PK_PERSONNE primary key (ID)
);

create table SALLE 
(
   ID                   INTEGER           not null,
   NOM                  CHARACTER VARYING(100),
   CAPACITE             INTEGER,
   VIDEO_PROJECTEUR     CHAR(1),
   RUE                  CHARACTER VARYING(255),
   COMPLEMENT           CHARACTER VARYING(100),
   CODE_POSTAL          CHARACTER VARYING(10),
   VILLE                CHARACTER VARYING(255),
   constraint PK_SALLE primary key (ID)
);

create table UE 
(
   ID                   INTEGER           not null,
   CODE                 INTEGER            not null,
   DUREE                INTEGER            not null,
   ORDRE                INTEGER            not null,
   FILIERE_ID           INTEGER,
   MATIERE_ID           INTEGER,
   FORMATEUR_ID         INTEGER,
   SALLE_ID             INTEGER,
   constraint PK_UE primary key (ID)
);

alter table COMPETENCE
   add constraint FK_COMPETEN_REFERENCE_MATIERE foreign key (MATIERE_ID)
      references MATIERE (ID);

alter table COMPETENCE
   add constraint FK_COMPETEN_REFERENCE_PERSONNE foreign key (FORMATEUR_ID)
      references PERSONNE (ID);

alter table EVALUATION
   add constraint FK_EVALUATI_REFERENCE_PERSONNE foreign key (STAGIAIRE_ID)
      references PERSONNE (ID);

alter table FILIERE
   add constraint FK_FILIERE_REFERENCE_PERSONNE foreign key (REFERENT_ID)
      references PERSONNE (ID);

alter table PERSONNE
   add constraint FK_PERSONNE_REFERENCE_FILIERE foreign key (FILIERE_ID)
      references FILIERE (ID);

alter table UE
   add constraint FK_UE_REFERENCE_PERSONNE foreign key (FORMATEUR_ID)
      references PERSONNE (ID);

alter table UE
   add constraint FK_UE_REFERENCE_MATIERE foreign key (MATIERE_ID)
      references MATIERE (ID);

alter table UE
   add constraint FK_UE_REFERENCE_SALLE foreign key (SALLE_ID)
      references SALLE (ID);

alter table UE
   add constraint FK_UE_REFERENCE_FILIERE foreign key (FILIERE_ID)
      references FILIERE (ID);

