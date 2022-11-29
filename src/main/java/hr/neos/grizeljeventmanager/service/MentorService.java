package hr.neos.grizeljeventmanager.service;

import hr.neos.grizeljeventmanager.dto.request.MentorRequestDto;
import hr.neos.grizeljeventmanager.dto.response.MentorResponseDto;
import hr.neos.grizeljeventmanager.entity.Mentor;

public interface MentorService {
    Mentor save(MentorRequestDto dto);

    MentorResponseDto getById(Long id);

    void deleteMentorById(Long id);
}
