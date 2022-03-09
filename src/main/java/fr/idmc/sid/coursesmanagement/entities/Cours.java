package fr.idmc.sid.coursesmanagement.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

}