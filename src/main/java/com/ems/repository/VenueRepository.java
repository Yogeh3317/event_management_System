package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long>  {

}
