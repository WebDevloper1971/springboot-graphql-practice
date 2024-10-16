package com.spql.graphql_starter.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NavratriDay {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private int day;

    private String goddess;

    private String mantra;

    @Column(length = 1000)
    private String description;

    private String color;

}