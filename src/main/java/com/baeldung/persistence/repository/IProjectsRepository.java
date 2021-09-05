package com.baeldung.persistence.repository;

import com.baeldung.persistence.model.Project;

import java.util.Optional;

public interface IProjectsRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
