package com.example.pi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "person_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDetailsEntity extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "person_id")
    private UserEntity person;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "patronymic", nullable = false)
    private String patronymic;

    @Column(name = "phone")
    private String phone;
}
