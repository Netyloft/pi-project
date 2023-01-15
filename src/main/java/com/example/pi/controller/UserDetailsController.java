package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.dao.UserDetailsDao;
import com.example.pi.entity.UserDetailsEntity;
import com.example.pi.repository.UserDetailsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/user-details")
public class UserDetailsController extends BaseController<UserDetailsEntity, UserDetailsDao, UserDetailsRepository> {


    public UserDetailsController(UserDetailsRepository repository) {
        super(repository);
    }
}
