package com.pracownia.spring.services;

import com.pracownia.spring.entities.Doctor;
import com.pracownia.spring.entities.Visit;
import com.pracownia.spring.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VisitServiceImp implements VisitService{

    @Autowired
    VisitRepository visitRepository;

    @Override
    public Iterable<Visit> listAllVisit() {
        return null;
    }

    @Override
    public Optional<Visit> getVisitById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Visit saveVisit(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void deleteVisit(Visit id) {

    }

    @Override
    public Boolean checkIfExist(Visit id) {
        return null;
    }
}
