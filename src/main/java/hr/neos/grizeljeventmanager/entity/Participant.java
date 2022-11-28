package hr.neos.grizeljeventmanager.entity;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "participant")
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(
        name = "list-array",
        typeClass = ListArrayType.class
)
public class Participant {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="participant_sequence")
    @SequenceGenerator(name="participant_sequence", allocationSize=10)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String faculty;
    private Integer facultyYear;
    private String personalSummary;
    private Integer experienceYears;
    @Type(type = "list-array")
    @Column(name="skills", columnDefinition = "text[]")
    private List<String> skills;
    private String repositoryUrl;
    private String experienceSummary;
    private String motivation;
    private String preferredOS;
}
