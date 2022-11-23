package hr.neos.grizeljeventmanager.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntryResponseInnerDto {
	private String name;
	private Long value;
}
