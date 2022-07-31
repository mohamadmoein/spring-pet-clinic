package ir.myplayground.petclinic.bootstrap;

import ir.myplayground.petclinic.config.SecretConfigurations;
import ir.myplayground.petclinic.owner.Owner;
import ir.myplayground.petclinic.owner.OwnerService;
import ir.myplayground.petclinic.pet.Pet;
import ir.myplayground.petclinic.pet.PetType;
import ir.myplayground.petclinic.pet.PetTypeService;
import ir.myplayground.petclinic.vet.Vet;
import ir.myplayground.petclinic.vet.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@EnableConfigurationProperties(SecretConfigurations.class)
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final String puKey;
    private final String prKey;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SecretConfigurations secretConfigurations) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.puKey = secretConfigurations.publicKey();
        this.prKey = secretConfigurations.privateKey();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===> Public Key: " + puKey);
        System.out.println("===> Private Key: " + prKey);

        PetType dog = new PetType();
        dog.setId(1L);
        dog.setName("Dog");
        PetType dogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setId(2L);
        cat.setName("Cat");
        PetType catPetType = petTypeService.save(cat);

        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("John");
        o1.setLastName("Doe");
        o1.setAddress("Tehran, something here, and here ");
        o1.setCity("Tehran");
        o1.setTelephone("123456789");
        ownerService.save(o1);

        Pet pet1 = new Pet();
        pet1.setId(1L);
        pet1.setName("Fido");
        pet1.setPetType(dogPetType);
        pet1.setOwner(o1);
        pet1.setBirthDate(LocalDate.now());
        o1.getPets().add(pet1);

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("Jane");
        o2.setLastName("Doe");
        o2.setAddress("Qom, something here, and here ");
        o2.setCity("Qom");
        o2.setTelephone("567823567");
        ownerService.save(o2);

        Pet pet2 = new Pet();
        pet2.setId(2L);
        pet2.setName("Lindo");
        pet2.setPetType(dogPetType);
        pet2.setOwner(o2);
        pet2.setBirthDate(LocalDate.now());
        o2.getPets().add(pet2);

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
