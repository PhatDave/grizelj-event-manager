package hr.neos.grizeljeventmanager.service.Implementation;

import hr.neos.grizeljeventmanager.dto.request.TeamRequestDto;
import hr.neos.grizeljeventmanager.dto.response.TeamResponseDto;
import hr.neos.grizeljeventmanager.entity.Team;
import hr.neos.grizeljeventmanager.mapper.TeamMapper;
import hr.neos.grizeljeventmanager.repository.TeamRepository;
import hr.neos.grizeljeventmanager.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamServiceImplementation implements TeamService {
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;
    @Override
    public Team save(TeamRequestDto dto) {
        Team team = teamMapper.toEntity(dto);
        return teamRepository.save(team);
    }

    @Override
    public TeamResponseDto getById(Long id) {
        Optional<Team> team = teamRepository.findById(id);
        if(team.isPresent()){
            return teamMapper.toDto(team.get());
        }
        throw new NoSuchElementException("Team with id " + " not found.");
    }

    @Override
    public void deleteTeamById(Long id) {
        teamRepository.deleteById(id);
    }
}
