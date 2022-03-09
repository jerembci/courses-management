package fr.idmc.sid.coursesmanagement.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "classe")
public class Classe {
    @Id
    @Column(name = "identifiant", nullable = false)
    private String identifiant;

    @Column(name = "libelle")
    private String libelle;

}