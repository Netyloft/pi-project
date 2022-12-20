package com.example.pi.repository;

import com.example.pi.dao.BaseDao;
import com.example.pi.dao.UserDetailsDao;
import com.example.pi.entity.UserDetailsEntity;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsRepository extends BaseRepository<UserDetailsEntity, UserDetailsDao> {
    public UserDetailsRepository(UserDetailsDao dao) {
        super(dao);
    }
}
