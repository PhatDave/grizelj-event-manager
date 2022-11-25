package hr.neos.grizeljeventmanager.repository;

import hr.neos.grizeljeventmanager.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
