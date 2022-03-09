package fr.idmc.sid.coursesmanagement.controllers;

import fr.idmc.sid.coursesmanagement.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("etudiants")
public class EtudiantController {

    final EtudiantRepository etudiantRepository;

    @GetMapping
    public ResponseEntity<?> getEtudiants() {
        return ResponseEntity.ok(etudiantRepository.findAll());
    }

}
