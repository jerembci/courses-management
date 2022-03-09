package fr.idmc.sid.coursesmanagement.repositories;

import fr.idmc.sid.coursesmanagement.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, String> {
}