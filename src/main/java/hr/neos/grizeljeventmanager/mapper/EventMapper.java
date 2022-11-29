package hr.neos.grizeljeventmanager.mapper;

import hr.neos.grizeljeventmanager.dto.request.EventRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EventResponseDto;
import hr.neos.grizeljeventmanager.entity.Event;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(builder = @Builder(disableBuilder = true))
public interface EventMapper {
    Event toEntity(EventRequestDto dto);

    EventResponseDto toDto(Event event);
}
