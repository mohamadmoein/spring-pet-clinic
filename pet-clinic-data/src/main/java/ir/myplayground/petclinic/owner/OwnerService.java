package ir.myplayground.petclinic.owner;

import ir.myplayground.petclinic.CrudService;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
