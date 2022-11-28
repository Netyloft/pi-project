package com.example.pi.controller;

import com.example.pi.Constants;
import com.example.pi.entity.OrganizationEntity;
import com.example.pi.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.BASE_API + "/organization")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationRepository organizationRepository;

    @GetMapping("")
    public List<OrganizationEntity> getAll() {
        return organizationRepository.findAll();
    }

    @PostMapping("")
    public List<OrganizationEntity> create() {
        return organizationRepository.saveAll(List.of(new OrganizationEntity("ПеваяТестоваяорганизация"), new OrganizationEntity("ВтораяТестоваяОрганизация")));
    }
}
