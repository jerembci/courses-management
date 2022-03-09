package fr.idmc.sid.coursesmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personne {
    @Id
    @Column(name = "identifiant", nullable = false, unique = true)
    private String identifiant;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "nom", nullable = false)
    private String firstName;

    @Column(name = "prenom", nullable = false)
    private String lastName;
}