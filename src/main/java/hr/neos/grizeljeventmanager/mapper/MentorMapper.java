package hr.neos.grizeljeventmanager.mapper;

import hr.neos.grizeljeventmanager.dto.request.MentorRequestDto;
import hr.neos.grizeljeventmanager.dto.response.MentorResponseDto;
import hr.neos.grizeljeventmanager.entity.Mentor;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(builder = @Builder(disableBuilder = true))
public interface MentorMapper {
    Mentor toEntity(MentorRequestDto dto);
    MentorResponseDto toDto(Mentor mentor);
}
