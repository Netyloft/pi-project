package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.dao.ExecuterProjectDao;
import com.example.pi.entity.ExecutorProjectEntity;
import com.example.pi.repository.ExecuterProjectRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/executor-project")
public class ExecutorProjectController extends BaseController<ExecutorProjectEntity, ExecuterProjectDao, ExecuterProjectRepository> {

    public ExecutorProjectController(ExecuterProjectRepository repository) {
        super(repository);
    }
}
