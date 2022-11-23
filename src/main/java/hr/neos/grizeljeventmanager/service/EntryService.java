package hr.neos.grizeljeventmanager.service;

import hr.neos.grizeljeventmanager.entity.Entry;

public interface EntryService {
	Entry save(Entry entry);
	Entry getById(Long id);
}
