package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.domen.Role;
import com.example.pi.entity.UserEntity;
import com.example.pi.repository.UserDao;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.BASE_API + "/user")
public class UserController {

    private final UserDao repository;

    @GetMapping("")
    public List<UserEntity> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable long id) {
        return repository.getById(id);
    }

    @PostMapping("/create")
    public UserEntity create(@RequestBody UserEntity entity) {

        String password = entity.getPassword();
        entity.setPassword(passwordEncoder().encode(password));
        entity.setRole(Role.USER);

        return repository.save(entity);
    }

    @PostMapping("/create-admin")
    public UserEntity createAdmin(@RequestBody UserEntity entity) {

        String password = entity.getPassword();
        entity.setPassword(passwordEncoder().encode(password));
        entity.setRole(Role.ADMIN);

        return repository.save(entity);
    }

    @GetMapping("/create-kit-admin")
    public UserEntity createKitAdmin() {

        UserEntity entity = new UserEntity();
        entity.setId(1111111L);
        entity.setLogin("admin");
        entity.setPassword(passwordEncoder().encode("admin"));
        entity.setRole(Role.ADMIN);

        return repository.save(entity);
    }

    @SneakyThrows
    @PutMapping("")
    public UserEntity update(@RequestBody UserEntity entity) {

        if (entity.getId() == null)
            throw new Exception("Поле id не может быть пустым");

        return repository.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }

    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(7);
    }
}
