package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.dao.ProjectParticipantDao;
import com.example.pi.entity.ProjectParticipantEntity;
import com.example.pi.repository.ProjectParticipantRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/project-participant")
public class ProjectParticipantController extends BaseController<ProjectParticipantEntity, ProjectParticipantDao, ProjectParticipantRepository>{


    public ProjectParticipantController(ProjectParticipantRepository repository) {
        super(repository);
    }
}
