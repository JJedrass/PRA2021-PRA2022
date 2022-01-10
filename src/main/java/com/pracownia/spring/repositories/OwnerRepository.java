package com.pracownia.spring.repositories;

import com.pracownia.spring.entities.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Integer> {
}
