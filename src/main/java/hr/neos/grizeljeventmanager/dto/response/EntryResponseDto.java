package hr.neos.grizeljeventmanager.dto.response;

import hr.neos.grizeljeventmanager.dto.response.Inner.EntryResponseInnerDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntryResponseDto {
	private EntryResponseInnerDto entry;
}
