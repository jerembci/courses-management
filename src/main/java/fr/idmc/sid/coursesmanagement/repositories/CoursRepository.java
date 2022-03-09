package fr.idmc.sid.coursesmanagement.repositories;

import fr.idmc.sid.coursesmanagement.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}