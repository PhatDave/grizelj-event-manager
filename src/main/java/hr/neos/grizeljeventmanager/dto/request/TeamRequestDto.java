package hr.neos.grizeljeventmanager.dto.request;

import hr.neos.grizeljeventmanager.entity.Mentor;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamRequestDto {
    private String name;
    private List<Mentor> mentors;
}
