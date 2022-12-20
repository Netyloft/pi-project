package com.example.pi.repository;

import com.example.pi.dao.BaseDao;
import com.example.pi.dao.OrganizationDao;
import com.example.pi.entity.OrganizationEntity;
import org.springframework.stereotype.Component;

@Component
public class OrganizationRepository extends BaseRepository<OrganizationEntity, OrganizationDao> {
    public OrganizationRepository(OrganizationDao dao) {
        super(dao);
    }
}
