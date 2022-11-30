package hr.neos.grizeljeventmanager.mapper;

import hr.neos.grizeljeventmanager.dto.request.TeamRequestDto;
import hr.neos.grizeljeventmanager.dto.response.TeamResponseDto;
import hr.neos.grizeljeventmanager.entity.Team;

public interface TeamMapper {
    Team toEntity(TeamRequestDto dto);
    TeamResponseDto toDto(Team team);
}
