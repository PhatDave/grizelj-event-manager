package hr.neos.grizeljeventmanager.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "teams")
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="entry_sequence")
    @SequenceGenerator(name="entry_sequence", allocationSize=10)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    @Column(unique = true)
    private String name;
    private String mentor;
}
