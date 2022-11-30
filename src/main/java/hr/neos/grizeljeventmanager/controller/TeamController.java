package hr.neos.grizeljeventmanager.controller;

import hr.neos.grizeljeventmanager.dto.request.TeamRequestDto;
import hr.neos.grizeljeventmanager.dto.response.TeamResponseDto;
import hr.neos.grizeljeventmanager.entity.Team;
import hr.neos.grizeljeventmanager.repository.TeamRepository;
import hr.neos.grizeljeventmanager.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {
    private final TeamService teamService;
    private final TeamRepository teamRepository;

    @PostMapping("/add")
    private ResponseEntity<?> addTeam(@RequestBody TeamRequestDto teamRequestDto){
        teamService.save(teamRequestDto);
        return ResponseEntity.ok("Mentor added.");
    }
    @GetMapping("/{id}")
    private ResponseEntity<?> getTeam(@PathVariable Long id){
        TeamResponseDto teamResponseDto = teamService.getById(id);
        return ResponseEntity.ok(teamResponseDto);
    }
    @GetMapping("/delete/{id}")
    private String deleteTeam(@PathVariable("id") Long id){
        teamService.deleteTeamById(id);
        return "redirect:/all";
    }
    @GetMapping("/all")
    private List<Team> getAll(){
        return teamRepository.findAll();
    }
}
