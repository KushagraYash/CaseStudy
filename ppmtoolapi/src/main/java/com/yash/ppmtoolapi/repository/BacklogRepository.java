package com.yash.ppmtoolapi.repository;

import com.yash.ppmtoolapi.domain.Backlog;

public interface BacklogRepository {

	Backlog findByProjectIdentifier(String projectIdentifier);

	void delete(Backlog backlog);

	void save(Backlog backlog);

}
