package fr.idmc.sid.coursesmanagement.repositories;

import fr.idmc.sid.coursesmanagement.entities.Administration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrationRepository extends JpaRepository<Administration, String> {
}