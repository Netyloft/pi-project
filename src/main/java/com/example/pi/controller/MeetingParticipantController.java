package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.dao.MeetingParticipantDao;
import com.example.pi.entity.MeetingParticipantEntity;
import com.example.pi.repository.MeetingParticipantRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.BASE_API + "/meeting-participant")
public class MeetingParticipantController extends BaseController<MeetingParticipantEntity, MeetingParticipantDao, MeetingParticipantRepository> {


    public MeetingParticipantController(MeetingParticipantRepository repository) {
        super(repository);
    }
}
