package com.hasanlo.p6spy.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "MOVIES")
@Entity
@Data
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long rank;
    private double rating;

    public Movie(String name, long rank, double ratting) {
        this.name = name;
        this.rank = rank;
        this.rating = ratting;
    }
}
