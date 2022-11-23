package hr.neos.grizeljeventmanager.mapper;

import hr.neos.grizeljeventmanager.dto.request.EntryRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EntryResponseDto;
import hr.neos.grizeljeventmanager.entity.Entry;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(builder = @Builder(disableBuilder = true))
public interface EntryMapper {
	Entry toEntity(EntryRequestDto dto);

	EntryResponseDto toDto(Entry entry);
}
