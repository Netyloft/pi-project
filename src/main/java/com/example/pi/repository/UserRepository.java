package com.example.pi.repository;

import com.example.pi.dao.UserDao;
import com.example.pi.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends BaseRepository<UserEntity, UserDao> {
    public UserRepository(UserDao dao) {
        super(dao);
    }
}