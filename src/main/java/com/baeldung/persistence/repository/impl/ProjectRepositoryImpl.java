package com.baeldung.persistence.repository.impl;

import com.baeldung.persistence.model.Project;
import com.baeldung.persistence.repository.IProjectsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements IProjectsRepository {

    List<Project> projects = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Project save(Project project) {
        return null;
    }
}
