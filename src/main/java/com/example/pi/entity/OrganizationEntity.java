package com.example.pi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrganizationEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

}
