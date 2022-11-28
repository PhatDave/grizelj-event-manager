package hr.neos.grizeljeventmanager.dto.request;

import hr.neos.grizeljeventmanager.entity.Team;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventRequestDto {
    private String name;
    private Integer maxParticipants;
    private List<Team> teams;
    private Date registrationsNotBefore;
    private Date registrationsNotAfter;
    private Date confirmationNotAfter;
    private LocalDate startDate;
    private Integer weeks;
}