package com.example.pi.repository;

import com.example.pi.entity.MeetingParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingParticipantRepository extends JpaRepository<MeetingParticipantEntity, Long> {
}
