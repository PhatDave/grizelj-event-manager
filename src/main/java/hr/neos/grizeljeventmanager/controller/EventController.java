package hr.neos.grizeljeventmanager.controller;

import hr.neos.grizeljeventmanager.dto.request.EventRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EventResponseDto;
import hr.neos.grizeljeventmanager.entity.Event;
import hr.neos.grizeljeventmanager.repository.EventRepository;
import hr.neos.grizeljeventmanager.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;
    private final EventRepository eventRepository;

    @PostMapping("/add")
    private ResponseEntity<?> addEvent(@RequestBody EventRequestDto eventRequestDto) {
        eventService.save(eventRequestDto);
        return ResponseEntity.ok("Event added.");
    }
    @GetMapping("/{id}")
    private ResponseEntity<?> getEvent(@PathVariable Long id) {
        EventResponseDto eventResponseDto = eventService.getById(id);
        return ResponseEntity.ok(eventResponseDto);
    }
    @GetMapping("/delete/{id}")
    private String deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEventById(id);
        return "redirect:/all";
    }

    @GetMapping("/all")
    private List<Event>  getAll(){
        return eventRepository.findAll();
    }

}
