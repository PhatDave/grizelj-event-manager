package hr.neos.grizeljeventmanager.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "team")
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="team_sequence")
    @SequenceGenerator(name="team_sequence", allocationSize=10)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private List<Mentor> mentors;
}
