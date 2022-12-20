package com.example.pi.repository;

import com.example.pi.dao.MeetingParticipantDao;
import com.example.pi.entity.MeetingParticipantEntity;
import org.springframework.stereotype.Component;

@Component
public class MeetingParticipantRepository extends BaseRepository<MeetingParticipantEntity, MeetingParticipantDao> {
    public MeetingParticipantRepository(MeetingParticipantDao dao) {
        super(dao);
    }
}
