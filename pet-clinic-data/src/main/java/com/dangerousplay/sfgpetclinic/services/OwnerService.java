package com.dangerousplay.sfgpetclinic.services;

import com.dangerousplay.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Criado por Davi Ficanha Henrique em 25/02/2019
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
