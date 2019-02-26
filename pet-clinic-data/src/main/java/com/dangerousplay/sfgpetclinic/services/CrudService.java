package com.dangerousplay.sfgpetclinic.services;

import java.util.Set;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
