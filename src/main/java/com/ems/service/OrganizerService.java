package com.ems.service;

import org.springframework.stereotype.Service;

import com.ems.model.Organizer;
import com.ems.repository.OrganizerRepository;

@Service
public class OrganizerService {

    private final OrganizerRepository organizerRepository;

    public OrganizerService(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    public Organizer updateOrganizer(Long id, Organizer organizerDetails) {
        Organizer organizer = organizerRepository.findById(id).orElse(null);
        if (organizer != null) {
            organizer.setName(organizerDetails.getName());
            organizer.setContactInfo(organizerDetails.getContactInfo());
            return organizerRepository.save(organizer);
        }
        return null;
    }

    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }
}