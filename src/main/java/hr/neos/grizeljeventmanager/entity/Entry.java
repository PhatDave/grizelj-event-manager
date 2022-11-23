package hr.neos.grizeljeventmanager.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "entry")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Entry {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="entry_sequence")
	@SequenceGenerator(name="entry_sequence", allocationSize=10)
	@Setter(AccessLevel.PRIVATE)
	private Long id;

	private String name;
	private Long value;
}
