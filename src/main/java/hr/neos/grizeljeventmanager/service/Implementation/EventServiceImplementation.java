package hr.neos.grizeljeventmanager.service.Implementation;

import hr.neos.grizeljeventmanager.dto.request.EventRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EventResponseDto;
import hr.neos.grizeljeventmanager.entity.Event;
import hr.neos.grizeljeventmanager.mapper.EventMapper;
import hr.neos.grizeljeventmanager.repository.EventRepository;
import hr.neos.grizeljeventmanager.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventServiceImplementation implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;
    @Override
    public Event save(EventRequestDto dto) {
        Event event = eventMapper.toEntity(dto);
        return eventRepository.save(event);
    }

    @Override
    public EventResponseDto getById(Long id) {
        Optional<Event> event = eventRepository.findById(id);
        if(event.isPresent()){
            return eventMapper.toDto(event.get());
        }else{
            throw new NoSuchElementException("Event with id " + id + " not found.");
        }
    }

    @Override
    public void deleteEventById(Long id) {
        eventRepository.deleteById(id);
    }
}
