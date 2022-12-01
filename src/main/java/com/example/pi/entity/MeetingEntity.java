package com.example.pi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "meeting")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MeetingEntity extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "place")
    private String place;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity initiator;
}
