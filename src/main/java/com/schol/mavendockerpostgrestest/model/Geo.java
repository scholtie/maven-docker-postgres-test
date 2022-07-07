package com.schol.mavendockerpostgrestest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Geo {
    @Id
    @GeneratedValue
    @Column(name="geo")
    private Integer id;
    private Double lat;
    private Double lng;
}
