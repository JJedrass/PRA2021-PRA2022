package com.pracownia.spring.services;

import com.pracownia.spring.entities.Doctor;
import com.pracownia.spring.entities.Visit;

import java.util.Optional;

public interface VisitService {

    Iterable<Visit> listAllVisit();

    Optional<Visit> getVisitById(Integer id);

    Visit saveVisit(Visit visit);

    void deleteVisit(Visit id);

    Boolean checkIfExist(Visit id);
}
