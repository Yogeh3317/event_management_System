package com.ems.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Organizer {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    private String contactInfo;

	    @OneToMany(mappedBy = "organizer")
//	    @JsonBackReference

	    private List<Event> events;
}
