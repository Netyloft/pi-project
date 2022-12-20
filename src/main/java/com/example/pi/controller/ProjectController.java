package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.entity.ProjectEntity;
import com.example.pi.repository.BaseRepository;
import com.example.pi.repository.ProjectRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/project")
public class ProjectController extends BaseController<ProjectEntity, BaseRepository<ProjectEntity>>{

    public ProjectController(ProjectRepository repository) {
        super(repository);
    }
}
