package com.agutka.agutkapetclinic.bootstrap;

import com.agutka.agutkapetclinic.model.Owner;
import com.agutka.agutkapetclinic.model.Vet;
import com.agutka.agutkapetclinic.services.OwnerService;
import com.agutka.agutkapetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Marta");
        owner1.setLastName("Mielewczyk");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Konrad");
        owner2.setLastName("Block");

        ownerService.save(owner2);

        System.out.println("Loaded owners..");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mateusz");
        vet1.setLastName("Mielewczyk");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Magda");
        vet2.setLastName("Bereda");

        vetService.save(vet2);

        System.out.println("Loaded vets..");

    }
}
