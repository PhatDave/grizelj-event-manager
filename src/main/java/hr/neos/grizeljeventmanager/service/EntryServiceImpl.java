package hr.neos.grizeljeventmanager.service;

import hr.neos.grizeljeventmanager.entity.Entry;
import hr.neos.grizeljeventmanager.repository.EntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntryServiceImpl implements EntryService {
	private final EntryRepository entryRepository;

	@Override
	public Entry save(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public Entry getById(Long id) {
		Optional<Entry> entry = entryRepository.findById(id);
		if (entry.isPresent()) {
			return entry.get();
		} else {
			throw new NoSuchElementException("Entry with id " + id + " not found");
		}
	}
}
