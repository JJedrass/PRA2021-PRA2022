package com.pracownia.spring.entities;

import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Visit( Pet pet, Doctor doctor, DateTime date) {

        this.pet = pet;
        this.doctor = doctor;
        this.date = date;
    }

    public Visit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="pet_id")
     Pet pet;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="doctor_id")
    Doctor doctor;

    @Column()
    private DateTime date;
}
