package com.pracownia.spring.repositories;

import com.pracownia.spring.entities.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Integer> {
}
