package hr.neos.grizeljeventmanager.controller;

import hr.neos.grizeljeventmanager.dto.request.MentorRequestDto;
import hr.neos.grizeljeventmanager.dto.response.MentorResponseDto;
import hr.neos.grizeljeventmanager.repository.MentorRepository;
import hr.neos.grizeljeventmanager.service.MentorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mentor")
@RequiredArgsConstructor
public class MentorController {
    private final MentorService mentorService;
    private final MentorRepository mentorRepository;

    @PostMapping("/add")
    private ResponseEntity<?> addMentor(@RequestBody MentorRequestDto mentorRequestDto){
        mentorService.save(mentorRequestDto);
        return ResponseEntity.ok("Mentor added.");
    }
    @GetMapping("/{id}")
    private ResponseEntity<?> getMentor(@PathVariable Long id){
        MentorResponseDto mentorResponseDto = mentorService.getById(id);
        return ResponseEntity.ok(mentorResponseDto);
    }
    @GetMapping("/delete/{id}")
    private String deleteMentor(@PathVariable("id") Long id){
        mentorService.deleteMentorById(id);
        return "redirect:/all";
    }
}
