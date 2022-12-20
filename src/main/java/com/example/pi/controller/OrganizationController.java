package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.dao.OrganizationDao;
import com.example.pi.entity.OrganizationEntity;
import com.example.pi.repository.BaseRepository;
import com.example.pi.repository.OrganizationRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.BASE_API + "/organization")
public class OrganizationController extends BaseController<OrganizationEntity, OrganizationDao, OrganizationRepository>{


    public OrganizationController(OrganizationRepository repository) {
        super(repository);
    }
}
