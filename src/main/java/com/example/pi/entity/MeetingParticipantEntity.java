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
@Table(name = "meeting_participant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MeetingParticipantEntity extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private MeetingEntity meeting;

    @ManyToOne
    @JoinColumn(name = "person_details_id")
    private PersonDetailsEntity personDetails;
}
