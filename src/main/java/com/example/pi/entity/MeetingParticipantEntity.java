package com.example.pi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "meeting_participant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MeetingParticipantEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private MeetingEntity meeting;

    @ManyToOne
    @JoinColumn(name = "person_details_id")
    private UserDetailsEntity personDetails;
}
