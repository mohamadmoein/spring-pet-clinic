package ir.myplayground.petclinic.bootstrap;

import ir.myplayground.petclinic.config.SecretConfigurations;
import ir.myplayground.petclinic.owner.Owner;
import ir.myplayground.petclinic.owner.OwnerService;
import ir.myplayground.petclinic.vet.Vet;
import ir.myplayground.petclinic.vet.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties(SecretConfigurations.class)
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final String puKey;
    private final String prKey;

    public DataLoader(OwnerService ownerService, VetService vetService, SecretConfigurations secretConfigurations) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.puKey = secretConfigurations.publicKey();
        this.prKey = secretConfigurations.privateKey();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===> Public Key: " + puKey);
        System.out.println("===> Private Key: " + prKey);

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
