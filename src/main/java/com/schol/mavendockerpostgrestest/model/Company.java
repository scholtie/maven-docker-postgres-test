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
public class Company {
    @Id
    @GeneratedValue
    @Column(name = "company")
    private Integer id;
    private String name;
    private String catchPrase;
    private String bs;

}
