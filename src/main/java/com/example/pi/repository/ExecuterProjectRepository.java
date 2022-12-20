package com.example.pi.repository;

import com.example.pi.dao.ExecuterProjectDao;
import com.example.pi.entity.ExecutorProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ExecuterProjectRepository extends BaseRepository<ExecutorProjectEntity, ExecuterProjectDao> {

    public ExecuterProjectRepository(ExecuterProjectDao dao) {
        super(dao);
    }
}
