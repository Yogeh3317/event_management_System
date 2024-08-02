package com.ems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ems.model.Venue;
import com.ems.service.VenueService;

@RestController
@RequestMapping("/api/venues")
public class VenueController {
	
	@Autowired
	 private final VenueService venueService;

	    public VenueController(VenueService venueService) {
	        this.venueService = venueService;
	    }

	    @PostMapping
	    public ResponseEntity<Venue> createVenue(@RequestBody Venue venue) {
	        Venue createdVenue = venueService.createVenue(venue);
	        return new ResponseEntity<>(createdVenue, HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Object> getVenueById(@PathVariable Long id) {
	        Venue venue = venueService.getVenueById(id);
	        if (venue != null) {
	            return ResponseEntity.ok(venue);
	        }
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                             .body("Venue with ID " + id + " not found.");
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Object> updateVenue(@PathVariable Long id, @RequestBody Venue venueDetails) {
	        Venue updatedVenue = venueService.updateVenue(id, venueDetails);
	        if (updatedVenue != null) {
	            return ResponseEntity.ok(updatedVenue);
	        }
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                             .body("Venue with ID " + id + " not found.");
	    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenue(@PathVariable Long id) {
        venueService.deleteVenue(id);
        return ResponseEntity.noContent().build();
    }
}
