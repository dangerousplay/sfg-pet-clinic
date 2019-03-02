package com.dangerousplay.sfgpetclinic.services.map;

import com.dangerousplay.sfgpetclinic.model.Vet;
import com.dangerousplay.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
