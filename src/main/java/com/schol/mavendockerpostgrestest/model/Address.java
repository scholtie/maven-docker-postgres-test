package com.schol.mavendockerpostgrestest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "address")
    private Integer id;
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geo")
    private Geo geo;
}
