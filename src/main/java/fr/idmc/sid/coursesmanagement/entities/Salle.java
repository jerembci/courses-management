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
@Table(name = "salle")
public class Salle {
    @Id
    @Column(name = "nom", nullable = false)
    private String nom;

}