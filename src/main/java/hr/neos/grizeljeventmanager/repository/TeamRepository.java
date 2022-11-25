package hr.neos.grizeljeventmanager.repository;

import hr.neos.grizeljeventmanager.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
