package hr.neos.grizeljeventmanager.service;

import hr.neos.grizeljeventmanager.dto.request.EventRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EventResponseDto;
import hr.neos.grizeljeventmanager.entity.Event;

public interface EventService {
    Event save(EventRequestDto dto);

    EventResponseDto getById(Long id);
    void deleteEventById(Long id);
}
