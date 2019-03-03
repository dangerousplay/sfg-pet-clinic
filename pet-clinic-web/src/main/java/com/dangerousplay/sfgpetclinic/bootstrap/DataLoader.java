package com.dangerousplay.sfgpetclinic.bootstrap;

import com.dangerousplay.sfgpetclinic.model.Owner;
import com.dangerousplay.sfgpetclinic.model.Vet;
import com.dangerousplay.sfgpetclinic.services.OwnerService;
import com.dangerousplay.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Criado por Davi Ficanha Henrique em 01/03/2019
 */
@Component
public class DataLoader implements CommandLineRunner {
    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");

        Owner owner2 = new Owner();
        owner2.setFirstName("John");
        owner2.setLastName("Tompson");

        Owner owner3 = new Owner();
        owner3.setFirstName("Paulo");
        owner3.setLastName("Jackson");

        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Jackson");
        vet1.setLastName("Back");

        vetService.save(vet1);

        ownerService.findAll().forEach(p -> System.out.println("Loaded owner: " + p));
    }
}
