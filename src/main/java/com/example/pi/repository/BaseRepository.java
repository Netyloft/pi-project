package com.example.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseRepository<Ent> extends JpaRepository<Ent, Long>, JpaSpecificationExecutor<Ent> {
}
