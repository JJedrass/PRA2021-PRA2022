package com.pracownia.spring.repositories;

import com.pracownia.spring.entities.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Integer> {
}
