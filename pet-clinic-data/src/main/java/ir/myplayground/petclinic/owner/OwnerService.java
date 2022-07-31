package ir.myplayground.petclinic.owner;

import ir.myplayground.petclinic.CrudService;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner saveWithPet(Owner owner);
    Owner findByLastName(String lastName);
}
