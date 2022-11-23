package hr.neos.grizeljeventmanager.service;

import hr.neos.grizeljeventmanager.dto.request.EntryRequestDto;
import hr.neos.grizeljeventmanager.dto.response.EntryResponseDto;
import hr.neos.grizeljeventmanager.entity.Entry;

public interface EntryService {
	Entry save(EntryRequestDto dto);
	EntryResponseDto getById(Long id);
}
