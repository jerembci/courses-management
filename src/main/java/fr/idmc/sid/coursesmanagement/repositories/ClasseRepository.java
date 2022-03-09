package fr.idmc.sid.coursesmanagement.repositories;

import fr.idmc.sid.coursesmanagement.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<Classe, String> {
}