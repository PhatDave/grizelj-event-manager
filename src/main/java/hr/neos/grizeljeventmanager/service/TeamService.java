package hr.neos.grizeljeventmanager.service;

import hr.neos.grizeljeventmanager.dto.request.TeamRequestDto;
import hr.neos.grizeljeventmanager.dto.response.TeamResponseDto;
import hr.neos.grizeljeventmanager.entity.Team;

public interface TeamService {
    Team save(TeamRequestDto dto);

    TeamResponseDto getById(Long id);

    void deleteTeamById(Long id);
}
