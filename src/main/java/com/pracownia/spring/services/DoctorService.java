package com.pracownia.spring.services;

import com.pracownia.spring.entities.Doctor;
import com.pracownia.spring.entities.Product;

import java.util.Optional;

public interface DoctorService {

    Iterable<Doctor> listAllDoctors();

    Optional<Doctor> getDoctorById(Integer id);

    Doctor saveDoctor(Doctor doctor);

    void deleteDoctor(Integer id);

    Boolean checkIfExist(Integer id);
}
