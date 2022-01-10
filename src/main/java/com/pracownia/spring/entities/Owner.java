package com.pracownia.spring.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class,
        property="refOwnerId", scope=Owner.class)
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String surname;

    @Column(name = "PESEL", nullable = false, unique = true)
    private int pesel;

    @Column
    private String telephone;
}
