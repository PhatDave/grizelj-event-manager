package hr.neos.grizeljeventmanager.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntryRequestDto {
	private String name;
	private Long value;
}
