package com.example.pi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDao<Ent> extends JpaRepository<Ent, Long>, JpaSpecificationExecutor<Ent> {
}
