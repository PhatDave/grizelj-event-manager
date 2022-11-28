package hr.neos.grizeljeventmanager.controller;

import hr.neos.grizeljeventmanager.dto.request.EntryRequestDto;
import hr.neos.grizeljeventmanager.dto.request.EventRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EntryResponseDto;
import hr.neos.grizeljeventmanager.dto.response.EventResponseDto;
import hr.neos.grizeljeventmanager.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @PostMapping("/add")
    private ResponseEntity<?> addEvent(@RequestBody EventRequestDto eventRequestDto) {
        eventService.save(eventRequestDto);
        return ResponseEntity.ok("ok");
    }
    @GetMapping("/get/{id}")
    private ResponseEntity<?> getEvent(@PathVariable Long id) {
        EventResponseDto eventResponseDto = eventService.getById(id);
        return ResponseEntity.ok(eventResponseDto);
    }

}
