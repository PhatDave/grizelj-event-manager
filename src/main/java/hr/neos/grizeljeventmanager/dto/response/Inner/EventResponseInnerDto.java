package hr.neos.grizeljeventmanager.dto.response.Inner;

import hr.neos.grizeljeventmanager.entity.Team;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventResponseInnerDto {
    private String name;
    private List<Team> teams;
    private Date registrationsNotBefore;
    private Date registrationsNotAfter;
    private Date confirmationNotAfter;
}
