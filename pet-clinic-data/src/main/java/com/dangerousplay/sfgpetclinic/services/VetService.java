package com.dangerousplay.sfgpetclinic.services;

import com.dangerousplay.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Criado por Davi Ficanha Henrique em 25/02/2019
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
