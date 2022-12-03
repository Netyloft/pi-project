package com.example.pi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "project")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private OrganizationEntity organization;

    @OneToMany
    @JoinColumn(name = "executor_id")
    private Set<ExecutorProjectEntity> executor;

}
