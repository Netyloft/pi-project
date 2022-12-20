package com.example.pi.repository;

import com.example.pi.dao.MeetingDao;
import com.example.pi.entity.MeetingEntity;
import org.springframework.stereotype.Component;

@Component
public class MeetingRepository extends BaseRepository<MeetingEntity, MeetingDao> {
    public MeetingRepository(MeetingDao dao) {
        super(dao);
    }
}
