package com.example.pi.controller;

import com.example.pi.entity.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public class BaseController<Ent extends BaseEntity, Rep extends JpaRepository<Ent, Long>> {

    private final Rep repository;

    @GetMapping("")
    public List<Ent> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Ent get(@PathVariable long id) {
        return repository.getById(id);
    }

    @PostMapping("")
    public Ent create(@RequestBody Ent entity) {
        return repository.save(entity);
    }

    @PutMapping("")
    public Ent update(@RequestBody Ent entity) {
        return repository.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }
}
