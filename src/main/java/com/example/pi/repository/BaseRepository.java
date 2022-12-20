package com.example.pi.repository;

import com.example.pi.common.exeption.BadRequestException;
import com.example.pi.dao.BaseDao;
import com.example.pi.entity.BaseEntity;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.List;


@RequiredArgsConstructor
public class BaseRepository<Ent extends BaseEntity, Dao extends BaseDao<Ent>> {
    protected final Dao dao;

    public List<Ent> getAll() {
        return dao.findAll();
    }

    public Ent get(long id) {
        return dao.getOne(id);
    }

    public Ent create(Ent entity) {
        return dao.save(entity);
    }

    @SneakyThrows
    public Ent update(Ent entity) {

        if (entity.getId() == null)
            throw new BadRequestException("Поле id не может быть пустым");

        return dao.save(entity);
    }

    public void delete(long id) {
        dao.deleteById(id);
    }
}
