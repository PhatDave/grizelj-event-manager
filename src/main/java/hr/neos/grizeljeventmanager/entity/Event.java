package hr.neos.grizeljeventmanager.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "events")
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="entry_sequence")
    @SequenceGenerator(name="entry_sequence", allocationSize=10)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private List<Team> teams;
    private Date registrationsNotBefore;
    private Date registrationsNotAfter;
    private Date confirmationNotAfter;
}
