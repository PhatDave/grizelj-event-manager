package hr.neos.grizeljeventmanager.dto.response.Inner;

import hr.neos.grizeljeventmanager.entity.Team;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MentorResponseInnerDto {
    private String email;
    private Team team;
}
