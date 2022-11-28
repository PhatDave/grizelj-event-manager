package hr.neos.grizeljeventmanager.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "event")
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="event_sequence")
    @SequenceGenerator(name="event_sequence", allocationSize=10)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    @Column(unique = true)
    private String name;
    private Integer maxParticipants;
    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<Team> teams;
    private ZonedDateTime registrationsNotBefore;
    private ZonedDateTime registrationsNotAfter;
    private ZonedDateTime confirmationNotAfter;
    private LocalDate startDate;
    private Integer weeks;
}
