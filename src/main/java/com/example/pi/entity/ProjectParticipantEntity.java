package com.example.pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project_participant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectParticipantEntity extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "person_details_id")
    private PersonDetailsEntity personDetails;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;
}
