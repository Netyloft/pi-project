package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.entity.OrganizationEntity;
import com.example.pi.entity.PersonEntity;
import com.example.pi.repository.OrganizationRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/person")
public class PersonController extends BaseController<PersonEntity, PersonRepository>{

    public PersonController(PersonRepository repository) {
        super(repository);
    }
}
