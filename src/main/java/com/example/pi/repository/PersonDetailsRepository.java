package com.example.pi.repository;

import com.example.pi.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDetailsRepository extends JpaRepository<UserDetailsEntity, Long> {
}
