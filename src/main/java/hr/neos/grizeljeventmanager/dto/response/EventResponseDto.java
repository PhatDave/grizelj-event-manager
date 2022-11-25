package hr.neos.grizeljeventmanager.dto.response;

import hr.neos.grizeljeventmanager.dto.response.Inner.EventResponseInnerDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventResponseDto {
    private EventResponseInnerDto event;
}
