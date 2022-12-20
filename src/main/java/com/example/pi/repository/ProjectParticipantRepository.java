package com.example.pi.repository;

import com.example.pi.dao.ProjectParticipantDao;
import com.example.pi.entity.ProjectParticipantEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectParticipantRepository extends BaseRepository<ProjectParticipantEntity, ProjectParticipantDao> {
    public ProjectParticipantRepository(ProjectParticipantDao dao) {
        super(dao);
    }
}
