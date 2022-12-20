package com.example.pi.repository;

import com.example.pi.dao.BaseDao;
import com.example.pi.entity.UserEntity;

public interface UserDao extends BaseDao<UserEntity> {
    UserEntity findByLogin(String login);
}
