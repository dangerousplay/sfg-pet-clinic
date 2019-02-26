package com.dangerousplay.sfgpetclinic.services;

import com.dangerousplay.sfgpetclinic.model.Owner;

/**
 * Criado por Davi Ficanha Henrique em 25/02/2019
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
