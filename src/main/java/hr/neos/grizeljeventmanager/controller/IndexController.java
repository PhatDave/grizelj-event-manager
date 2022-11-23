package hr.neos.grizeljeventmanager.controller;

import hr.neos.grizeljeventmanager.entity.Entry;
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
	private ResponseEntity<?> addEntry(@RequestBody Entry entry) {
		entryService.save(entry);
		return ResponseEntity.ok("ok");
	}

	@GetMapping("/get/{id}")
	private ResponseEntity<?> getEntry(@PathVariable Long id) {
		Entry entry = entryService.getById(id);
		return ResponseEntity.ok(entry);
	}
}
