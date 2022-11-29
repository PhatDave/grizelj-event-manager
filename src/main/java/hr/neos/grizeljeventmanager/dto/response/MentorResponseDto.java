package hr.neos.grizeljeventmanager.dto.response;

import hr.neos.grizeljeventmanager.dto.response.Inner.MentorResponseInnerDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MentorResponseDto {
    private MentorResponseInnerDto mentor;
}
