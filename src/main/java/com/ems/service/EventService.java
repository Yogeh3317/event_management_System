package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.model.Event;
import com.ems.repository.EventRepository;

@Service
public class EventService 
{
	private EventRepository eventRepository;
	
	public EventService(EventRepository eventRepository)
	{
		this.eventRepository = eventRepository;
	}
	
	public Event createEvent(Event event)
	{
		return eventRepository.save(event);
	}
	
	public List<Event> getAllEvents()
	{
		return eventRepository.findAll();
	}
	public Event getEventById(Long id)
	{
		return eventRepository.findById(id).orElse(null);
	}
	
	public Event updateEvent(Long id,Event eventDetails)
	{
		Event event = eventRepository.findById(id).orElse(null);
		//if the id is not null
		if(event !=null)
		{
			event.setEventName(eventDetails.getEventName());
            event.setEventDate(eventDetails.getEventDate());
            event.setDescription(eventDetails.getDescription());
            event.setOrganizer(eventDetails.getOrganizer());
            event.setVenue(eventDetails.getVenue());
           
            
            return eventRepository.save(event);
            
		}
		return null;
	}
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getEventsByVenue(Long venueId) {
        return eventRepository.findByVenueId(venueId);
    }

    public List<Event> getEventsByOrganizer(Long organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }

}
