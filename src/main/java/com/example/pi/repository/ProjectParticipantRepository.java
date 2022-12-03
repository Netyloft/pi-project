package com.example.pi.repository;

import com.example.pi.entity.ProjectParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectParticipantRepository extends JpaRepository<ProjectParticipantEntity, Long> {
}
