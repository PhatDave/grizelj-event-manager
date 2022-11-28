package hr.neos.grizeljeventmanager.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "mentor")
@NoArgsConstructor
@AllArgsConstructor
public class Mentor {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="mentor_sequence")
    @SequenceGenerator(name="mentor_sequence", allocationSize=10)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;
}
