package com.example.pi.dao;

import com.example.pi.dao.BaseDao;
import com.example.pi.entity.UserEntity;

public interface UserDao extends BaseDao<UserEntity> {
    UserEntity findByLogin(String login);
}
