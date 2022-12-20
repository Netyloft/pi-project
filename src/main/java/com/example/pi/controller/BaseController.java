package com.example.pi.controller;

import com.example.pi.entity.BaseEntity;
import com.example.pi.filter.Filter;
import com.example.pi.filter.internal.Comparison;
import com.example.pi.filter.internal.Condition;
import com.example.pi.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class BaseController<Ent extends BaseEntity, Rep extends BaseRepository<Ent>> {

    private final Rep repository;

    @GetMapping("")
    public List<Ent> getAll(@RequestParam(required=false) Map<String,String> qparams) {
        Filter filter = new Filter();

        qparams.forEach((name, value) -> filter.addCondition(new Condition.Builder().setComparison(Comparison.eq).setField(name).setValue(value).build()));

        return repository.findAll(filter);
    }

    @GetMapping("/{id}")
    public Ent get(@PathVariable long id) {
        return repository.getById(id);
    }

    @PostMapping("")
    public Ent create(@RequestBody Ent entity) {
        return repository.save(entity);
    }

    @SneakyThrows
    @PutMapping("")
    public Ent update(@RequestBody Ent entity) {

        if(entity.getId() == null)
            throw new Exception("Поле id не может быть пустым");

        return repository.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }
}
