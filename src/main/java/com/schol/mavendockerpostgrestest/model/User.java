package com.schol.mavendockerpostgrestest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Users")
public class User {
    @Id
    private Integer id;
    //@Column(name = "personName", nullable = false)
    private String personName;
    //@Column(name = "username", nullable = false)
    private String username;
    //@Column(name = "email", nullable = false)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;
    //@Column(name = "phone", nullable = false)
    private String phone;
    //@Column(name = "website", nullable = false)
    private String website;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company")
    private Company company;
}
