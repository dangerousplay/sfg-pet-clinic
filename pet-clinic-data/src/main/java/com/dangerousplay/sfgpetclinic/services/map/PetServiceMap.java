package com.dangerousplay.sfgpetclinic.services.map;

import com.dangerousplay.sfgpetclinic.model.Pet;
import com.dangerousplay.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
