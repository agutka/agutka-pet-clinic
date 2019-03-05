package com.agutka.agutkapetclinic.services;

import com.agutka.agutkapetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
