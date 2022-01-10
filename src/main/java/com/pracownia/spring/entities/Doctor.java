package com.pracownia.spring.entities;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String surname;

    @Column
    private String specialization;

    public Doctor( String firstName, String surname, String specialization) {
        this.firstName = firstName;
        this.surname = surname;
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
