package hr.neos.grizeljeventmanager.dto.response.Inner;

import hr.neos.grizeljeventmanager.entity.Event;
import hr.neos.grizeljeventmanager.entity.Mentor;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamResponseInnerDto {
    private String name;
    private List<Mentor> mentors;
    private Event event;
}
