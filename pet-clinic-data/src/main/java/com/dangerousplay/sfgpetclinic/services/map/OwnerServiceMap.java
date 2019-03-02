package com.dangerousplay.sfgpetclinic.services.map;

import com.dangerousplay.sfgpetclinic.model.Owner;
import com.dangerousplay.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
