package hr.neos.grizeljeventmanager.dto.response;

import hr.neos.grizeljeventmanager.dto.response.Inner.TeamResponseInnerDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamResponseDto {
    private TeamResponseInnerDto team;
}
