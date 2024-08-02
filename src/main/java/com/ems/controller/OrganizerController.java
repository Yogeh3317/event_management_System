package com.ems.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ems.model.Organizer;
import com.ems.service.OrganizerService;

@RestController
@RequestMapping("/api/organizers")
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

    public OrganizerController(OrganizerService organizerService) {
        this.organizerService = organizerService;
    }

    @PostMapping
    public ResponseEntity<Organizer> createOrganizer(@RequestBody Organizer organizer) {
        Organizer createdOrganizer = organizerService.createOrganizer(organizer);
        return new ResponseEntity<>(createdOrganizer, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOrganizerById(@PathVariable Long id) {
        Organizer organizer = organizerService.getOrganizerById(id);
        if (organizer != null) {
            return ResponseEntity.ok(organizer);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Organizer with ID " + id + " not found.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizerDetails) {
        Organizer updatedOrganizer = organizerService.updateOrganizer(id, organizerDetails);
        if (updatedOrganizer != null) {
            return ResponseEntity.ok(updatedOrganizer);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Organizer with ID " + id + " not found.");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
        return ResponseEntity.noContent().build();
    }
}