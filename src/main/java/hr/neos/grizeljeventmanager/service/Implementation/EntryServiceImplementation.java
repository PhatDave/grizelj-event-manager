package hr.neos.grizeljeventmanager.service.Implementation;

import hr.neos.grizeljeventmanager.dto.request.EntryRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EntryResponseDto;
import hr.neos.grizeljeventmanager.entity.Entry;
import hr.neos.grizeljeventmanager.mapper.EntryMapper;
import hr.neos.grizeljeventmanager.repository.EntryRepository;
import hr.neos.grizeljeventmanager.service.EntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntryServiceImplementation implements EntryService {
	private final EntryRepository entryRepository;
	private final EntryMapper entryMapper;

	@Override
	public Entry save(EntryRequestDto dto) {
		Entry entry = entryMapper.toEntity(dto);
		return entryRepository.save(entry);
	}

	@Override
	public EntryResponseDto getById(Long id) {
		Optional<Entry> entry = entryRepository.findById(id);
		if (entry.isPresent()) {
			return entryMapper.toDto(entry.get());
		} else {
			throw new NoSuchElementException("Entry with id " + id + " not found");
		}
	}
}
