package com.example.pi.controller;

import com.example.pi.dao.BaseDao;
import com.example.pi.entity.BaseEntity;
import com.example.pi.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public abstract class BaseController<Ent extends BaseEntity, Dao extends BaseDao<Ent>, Rep extends BaseRepository<Ent, Dao>> {

    private final Rep repository;


    @GetMapping("")
    public List<Ent> getAll(@RequestParam(required = false) Map<String, String> qparams) {
//        Filter filter = new Filter();
//
//        qparams.forEach((name, value) -> filter.addCondition(new Condition.Builder().setComparison(Comparison.eq).setField(name).setValue(value).build()));


//        return repository.getAll(filter);
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Ent get(@PathVariable long id) {
        return repository.get(id);
    }

    @PostMapping("")
    public Ent create(@RequestBody Ent entity) {
        return repository.create(entity);
    }

    @SneakyThrows
    @PutMapping("")
    public Ent update(@RequestBody Ent entity) {

        if (entity.getId() == null)
            throw new Exception("Поле id не может быть пустым");

        return repository.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.delete(id);
    }
}
