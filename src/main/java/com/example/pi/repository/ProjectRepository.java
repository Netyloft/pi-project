package com.example.pi.repository;

import com.example.pi.dao.ProjectDao;
import com.example.pi.entity.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepository extends BaseRepository<ProjectEntity, ProjectDao> {
    public ProjectRepository(ProjectDao dao) {
        super(dao);
    }
}
