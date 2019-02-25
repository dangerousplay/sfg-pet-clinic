package com.dangerousplay.sfgpetclinic.services;

import com.dangerousplay.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Criado por Davi Ficanha Henrique em 25/02/2019
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
