package hr.neos.grizeljeventmanager.service.Implementation;

import hr.neos.grizeljeventmanager.dto.request.MentorRequestDto;
import hr.neos.grizeljeventmanager.dto.response.MentorResponseDto;
import hr.neos.grizeljeventmanager.entity.Mentor;
import hr.neos.grizeljeventmanager.mapper.MentorMapper;
import hr.neos.grizeljeventmanager.repository.MentorRepository;
import hr.neos.grizeljeventmanager.service.MentorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MentorServiceImplementation implements MentorService {
    private final MentorRepository mentorRepository;
    private final MentorMapper mentorMapper;
    @Override
    public Mentor save(MentorRequestDto dto) {
        Mentor mentor = mentorMapper.toEntity(dto);
        return mentorRepository.save(mentor);
    }

    @Override
    public MentorResponseDto getById(Long id) {
        Optional<Mentor> mentor = mentorRepository.findById(id);
        if(mentor.isPresent()){
            return mentorMapper.toDto(mentor.get());
        }else{
            throw new NoSuchElementException("Mentor with id " + id + " not found.");
        }

    }

    @Override
    public void deleteMentorById(Long id) {
        mentorRepository.deleteById(id);
    }
}
