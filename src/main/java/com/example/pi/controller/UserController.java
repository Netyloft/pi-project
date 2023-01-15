package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.dao.ProjectDao;
import com.example.pi.domen.Role;
import com.example.pi.entity.ProjectEntity;
import com.example.pi.entity.UserEntity;
import com.example.pi.dao.UserDao;
import com.example.pi.repository.ProjectRepository;
import com.example.pi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.BASE_API + "/user")
public class UserController extends BaseController<UserEntity, UserDao, UserRepository> {

    public UserController(UserRepository repository) { super(repository);}

    @PostMapping("/create")
    public UserEntity create(@RequestBody UserEntity entity) {

        String password = entity.getPassword();
        entity.setPassword(passwordEncoder().encode(password));
        entity.setRole(Role.USER);

        return repository.create(entity);
    }

    @PostMapping("/create-admin")
    public UserEntity createAdmin(@RequestBody UserEntity entity) {

        String password = entity.getPassword();
        entity.setPassword(passwordEncoder().encode(password));
        entity.setRole(Role.ADMIN);

        return repository.create(entity);
    }

    @SneakyThrows
    @PutMapping("")
    public UserEntity update(@RequestBody UserEntity entity) {

        if (entity.getId() == null)
            throw new Exception("Поле id не может быть пустым");

        return repository.update(entity);
    }

    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(7);
    }
}
