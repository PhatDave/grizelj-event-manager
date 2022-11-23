package hr.neos.grizeljeventmanager.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntryResponseDto {
	private EntryResponseInnerDto entry;
}
