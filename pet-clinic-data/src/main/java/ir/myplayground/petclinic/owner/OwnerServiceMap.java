package ir.myplayground.petclinic.owner;

import ir.myplayground.petclinic.AbstractMapService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
