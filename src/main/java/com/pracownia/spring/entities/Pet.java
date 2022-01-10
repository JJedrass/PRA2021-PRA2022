package com.pracownia.spring.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class,
        property="refOwnerId", scope=Pet.class)
public class Pet {

    public Pet( String name, String specie, DateTime dateOfBirth, Owner owner) {

        this.name = name;
        this.specie = specie;
        this.dateOfBirth = dateOfBirth;
        this.owner = owner;
    }

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String specie;

    @Column()
    private DateTime dateOfBirth;


    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="OWNER_ID", referencedColumnName = "id")
    Owner owner;
}
