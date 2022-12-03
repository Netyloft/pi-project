package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.entity.MeetingEntity;
import com.example.pi.entity.OrganizationEntity;
import com.example.pi.repository.OrganizationRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/meeting")
public class MeetingController extends BaseController<MeetingEntity, MeetingRepository>{

    public MeetingController(MeetingRepository repository) {
        super(repository);
    }
}
