package com.example.pi.repository;

import com.example.pi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends BaseRepository<UserEntity> {
    UserEntity findByLogin(String login);
}
