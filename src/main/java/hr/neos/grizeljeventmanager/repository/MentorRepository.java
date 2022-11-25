package hr.neos.grizeljeventmanager.repository;

import hr.neos.grizeljeventmanager.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<Mentor, Long> {
}
