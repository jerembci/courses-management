package fr.idmc.sid.coursesmanagement.controllers;

import fr.idmc.sid.coursesmanagement.repositories.AdministrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("admins")
public class AdministrationController {

    final AdministrationRepository administrationRepository;

    @GetMapping
    public ResponseEntity<?> getAdmins() {
        return ResponseEntity.ok(administrationRepository.findAll());
    }

    @GetMapping("/{adminId}")
    public ResponseEntity<?> getUnAdmin(@PathVariable String adminId) {
        return Optional.of(administrationRepository.findById(adminId))
                .filter(Optional::isPresent)
                .map(i -> ResponseEntity.ok(i.get()))
                .orElse(ResponseEntity.notFound().build());
    }

}
