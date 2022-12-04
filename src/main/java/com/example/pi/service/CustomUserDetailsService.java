package com.example.pi.service;

import com.example.pi.entity.UserEntity;
import com.example.pi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity person = repository.findByLogin(username);
        if (person == null) {
            throw new UsernameNotFoundException("Пользователь с таким логином не найден: " + username);
        }

        return User.builder()
                .username(person.getLogin())
                .password(person.getPassword())
                .roles(person.getRole().name())
                .build();
    }
}
