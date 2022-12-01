package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.entity.OrganizationEntity;
import com.example.pi.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.BASE_API + "/organization")
public class OrganizationController extends BaseController<OrganizationEntity, OrganizationRepository>{

    public OrganizationController(OrganizationRepository repository) {
        super(repository);
    }
}
