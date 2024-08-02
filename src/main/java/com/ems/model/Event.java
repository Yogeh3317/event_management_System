package com.ems.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;

    @Temporal(TemporalType.DATE)
    private Date eventDate;

    private String description;

    @ManyToOne
    @JoinColumn(name = "organizer_id", nullable = false)
//    @JsonManagedReference
    private Organizer organizer;

    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
//    @JsonManagedReference

    private Venue venue;
}