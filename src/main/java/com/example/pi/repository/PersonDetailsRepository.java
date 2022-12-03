package com.example.pi.repository;

import com.example.pi.entity.PersonDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDetailsRepository extends JpaRepository<PersonDetailsEntity, Long> {
}
