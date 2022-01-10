package com.pracownia.spring.repositories;

import com.pracownia.spring.entities.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
}
