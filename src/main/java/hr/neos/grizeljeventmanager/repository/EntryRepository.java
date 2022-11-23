package hr.neos.grizeljeventmanager.repository;

import hr.neos.grizeljeventmanager.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}
