package ir.myplayground.petclinic.bootstrap;

import ir.myplayground.petclinic.owner.Owner;
import ir.myplayground.petclinic.owner.OwnerService;
import ir.myplayground.petclinic.vet.Vet;
import ir.myplayground.petclinic.vet.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("John");
        o1.setLastName("Doe");
        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("Jane");
        o2.setLastName("Doe");
        ownerService.save(o2);

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Johhhhhhn");
        v1.setLastName("Doooooe");
        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setId(2L);
        v2.setFirstName("Jannnnnne");
        v2.setLastName("Dooooooe");
        vetService.save(v2);

        System.out.println("===> Loaded Data.");
    }
}
