package com.example.pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "executor_project")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExecutorProjectEntity extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "organization_id")
    private OrganizationEntity organization;

}
