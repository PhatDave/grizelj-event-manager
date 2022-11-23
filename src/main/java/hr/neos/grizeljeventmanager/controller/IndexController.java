package hr.neos.grizeljeventmanager.controller;

import hr.neos.grizeljeventmanager.dto.request.EntryRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EntryResponseDto;
import hr.neos.grizeljeventmanager.service.EntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class IndexController {
	private final EntryService entryService;

	@PostMapping("/add")
	private ResponseEntity<?> addEntry(@RequestBody EntryRequestDto entryRequestDto) {
		entryService.save(entryRequestDto);
		return ResponseEntity.ok("ok");
	}

	@GetMapping("/get/{id}")
	private ResponseEntity<?> getEntry(@PathVariable Long id) {
		EntryResponseDto entryResponseDto = entryService.getById(id);
		return ResponseEntity.ok(entryResponseDto);
	}
}
