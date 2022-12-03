package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.entity.PersonDetailsEntity;
import com.example.pi.repository.PersonDetailsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/person-details")
public class PersonDetailsController extends BaseController<PersonDetailsEntity, PersonDetailsRepository>{

    public PersonDetailsController(PersonDetailsRepository repository) {
        super(repository);
    }
}
